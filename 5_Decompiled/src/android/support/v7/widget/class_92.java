package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.widget.class_91;
import android.support.v7.a.a$f;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

// $FF: renamed from: android.support.v7.widget.ae
class class_92 extends class_91 implements OnClickListener {
    // $FF: renamed from: j android.app.SearchManager
    private final SearchManager field_788;
    // $FF: renamed from: k android.support.v7.widget.SearchView
    private final SearchView field_789;
    // $FF: renamed from: l android.app.SearchableInfo
    private final SearchableInfo field_790;
    // $FF: renamed from: m android.content.Context
    private final Context field_791;
    // $FF: renamed from: n java.util.WeakHashMap
    private final WeakHashMap field_792;
    // $FF: renamed from: o int
    private final int field_793;
    // $FF: renamed from: p boolean
    private boolean field_794 = false;
    // $FF: renamed from: q int
    private int field_795 = 1;
    // $FF: renamed from: r android.content.res.ColorStateList
    private ColorStateList field_796;
    // $FF: renamed from: s int
    private int field_797 = -1;
    // $FF: renamed from: t int
    private int field_798 = -1;
    // $FF: renamed from: u int
    private int field_799 = -1;
    // $FF: renamed from: v int
    private int field_800 = -1;
    // $FF: renamed from: w int
    private int field_801 = -1;
    // $FF: renamed from: x int
    private int field_802 = -1;

    public class_92(Context var1, SearchView var2, SearchableInfo var3, WeakHashMap var4) {
        super(var1, var2.getSuggestionRowLayout(), (Cursor)null, true);
        this.field_788 = (SearchManager)this.d.getSystemService("search");
        this.field_789 = var2;
        this.field_790 = var3;
        this.field_793 = var2.getSuggestionCommitIconResId();
        this.field_791 = var1;
        this.field_792 = var4;
    }

    // $FF: renamed from: a (android.content.ComponentName) android.graphics.drawable.Drawable
    private Drawable method_833(ComponentName var1) {
        Object var3 = null;
        String var4 = var1.flattenToShortString();
        ConstantState var5;
        Drawable var6;
        if (this.field_792.containsKey(var4)) {
            var5 = (ConstantState)this.field_792.get(var4);
            if (var5 == null) {
                var6 = null;
            } else {
                var6 = var5.newDrawable(this.field_791.getResources());
            }
        } else {
            Drawable var2 = this.method_840(var1);
            if (var2 == null) {
                var5 = (ConstantState)var3;
            } else {
                var5 = var2.getConstantState();
            }

            this.field_792.put(var4, var5);
            var6 = var2;
        }

        return var6;
    }

    // $FF: renamed from: a (java.lang.String) android.graphics.drawable.Drawable
    private Drawable method_834(String param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.database.Cursor, int) java.lang.String
    private static String method_835(Cursor var0, int var1) {
        Object var2 = null;
        String var4;
        if (var1 == -1) {
            var4 = (String)var2;
        } else {
            try {
                var4 = var0.getString(var1);
            } catch (Exception var3) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", var3);
                var4 = (String)var2;
            }
        }

        return var4;
    }

    // $FF: renamed from: a (android.database.Cursor, java.lang.String) java.lang.String
    public static String method_836(Cursor var0, String var1) {
        return method_835(var0, var0.getColumnIndex(var1));
    }

    // $FF: renamed from: a (android.widget.ImageView, android.graphics.drawable.Drawable, int) void
    private void method_837(ImageView var1, Drawable var2, int var3) {
        var1.setImageDrawable(var2);
        if (var2 == null) {
            var1.setVisibility(var3);
        } else {
            var1.setVisibility(0);
            var2.setVisible(false, false);
            var2.setVisible(true, false);
        }

    }

    // $FF: renamed from: a (android.widget.TextView, java.lang.CharSequence) void
    private void method_838(TextView var1, CharSequence var2) {
        var1.setText(var2);
        if (TextUtils.isEmpty(var2)) {
            var1.setVisibility(8);
        } else {
            var1.setVisibility(0);
        }

    }

    // $FF: renamed from: a (java.lang.String, android.graphics.drawable.Drawable) void
    private void method_839(String var1, Drawable var2) {
        if (var2 != null) {
            this.field_792.put(var1, var2.getConstantState());
        }

    }

    // $FF: renamed from: b (android.content.ComponentName) android.graphics.drawable.Drawable
    private Drawable method_840(ComponentName var1) {
        Object var3 = null;
        PackageManager var4 = this.d.getPackageManager();

        ActivityInfo var5;
        Drawable var7;
        try {
            var5 = var4.getActivityInfo(var1, 128);
        } catch (NameNotFoundException var6) {
            Log.w("SuggestionsAdapter", var6.toString());
            var7 = (Drawable)var3;
            return var7;
        }

        int var2 = var5.getIconResource();
        if (var2 == 0) {
            var7 = (Drawable)var3;
        } else {
            Drawable var8 = var4.getDrawable(var1.getPackageName(), var2, var5.applicationInfo);
            if (var8 == null) {
                Log.w("SuggestionsAdapter", "Invalid icon resource " + var2 + " for " + var1.flattenToShortString());
                var7 = (Drawable)var3;
            } else {
                var7 = var8;
            }
        }

        return var7;
    }

    // $FF: renamed from: b (android.net.Uri) android.graphics.drawable.Drawable
    private Drawable method_841(Uri param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: b (java.lang.String) android.graphics.drawable.Drawable
    private Drawable method_842(String var1) {
        ConstantState var2 = (ConstantState)this.field_792.get(var1);
        Drawable var3;
        if (var2 == null) {
            var3 = null;
        } else {
            var3 = var2.newDrawable();
        }

        return var3;
    }

    // $FF: renamed from: b (java.lang.CharSequence) java.lang.CharSequence
    private CharSequence method_843(CharSequence var1) {
        if (this.field_796 == null) {
            TypedValue var2 = new TypedValue();
            this.d.getTheme().resolveAttribute(android.support.v7.a.a$a.textColorSearchUrl, var2, true);
            this.field_796 = this.d.getResources().getColorStateList(var2.resourceId);
        }

        SpannableString var3 = new SpannableString(var1);
        var3.setSpan(new TextAppearanceSpan((String)null, 0, 0, this.field_796, (ColorStateList)null), 0, var1.length(), 33);
        return var3;
    }

    // $FF: renamed from: d (android.database.Cursor) void
    private void method_844(Cursor var1) {
        Bundle var2;
        if (var1 != null) {
            var2 = var1.getExtras();
        } else {
            var2 = null;
        }

        if (var2 != null && var2.getBoolean("in_progress")) {
            ;
        }

    }

    // $FF: renamed from: e (android.database.Cursor) android.graphics.drawable.Drawable
    private Drawable method_845(Cursor var1) {
        Drawable var2;
        if (this.field_800 == -1) {
            var2 = null;
        } else {
            Drawable var3 = this.method_834(var1.getString(this.field_800));
            var2 = var3;
            if (var3 == null) {
                var2 = this.method_847(var1);
            }
        }

        return var2;
    }

    // $FF: renamed from: f (android.database.Cursor) android.graphics.drawable.Drawable
    private Drawable method_846(Cursor var1) {
        Drawable var2;
        if (this.field_801 == -1) {
            var2 = null;
        } else {
            var2 = this.method_834(var1.getString(this.field_801));
        }

        return var2;
    }

    // $FF: renamed from: g (android.database.Cursor) android.graphics.drawable.Drawable
    private Drawable method_847(Cursor var1) {
        Drawable var2 = this.method_833(this.field_790.getSearchActivity());
        if (var2 == null) {
            var2 = this.d.getPackageManager().getDefaultActivityIcon();
        }

        return var2;
    }

    // $FF: renamed from: a (android.app.SearchableInfo, java.lang.String, int) android.database.Cursor
    Cursor method_848(SearchableInfo var1, String var2, int var3) {
        Cursor var4 = null;
        if (var1 != null) {
            String var5 = var1.getSuggestAuthority();
            if (var5 != null) {
                Builder var8 = (new Builder()).scheme("content").authority(var5).query("").fragment("");
                var5 = var1.getSuggestPath();
                if (var5 != null) {
                    var8.appendEncodedPath(var5);
                }

                var8.appendPath("search_suggest_query");
                var5 = var1.getSuggestSelection();
                String[] var6;
                if (var5 != null) {
                    var6 = new String[]{var2};
                } else {
                    var8.appendPath(var2);
                    var6 = null;
                }

                if (var3 > 0) {
                    var8.appendQueryParameter("limit", String.valueOf(var3));
                }

                Uri var7 = var8.build();
                var4 = this.d.getContentResolver().query(var7, (String[])null, var5, var6, (String)null);
            }
        }

        return var4;
    }

    // $FF: renamed from: a (java.lang.CharSequence) android.database.Cursor
    public Cursor method_108(CharSequence param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.net.Uri) android.graphics.drawable.Drawable
    Drawable method_849(Uri var1) {
        String var4 = var1.getAuthority();
        if (TextUtils.isEmpty(var4)) {
            throw new FileNotFoundException("No authority: " + var1);
        } else {
            Resources var3;
            try {
                var3 = this.d.getPackageManager().getResourcesForApplication(var4);
            } catch (NameNotFoundException var7) {
                throw new FileNotFoundException("No package found for authority: " + var1);
            }

            List var5 = var1.getPathSegments();
            if (var5 == null) {
                throw new FileNotFoundException("No path: " + var1);
            } else {
                int var2 = var5.size();
                if (var2 == 1) {
                    try {
                        var2 = Integer.parseInt((String)var5.get(0));
                    } catch (NumberFormatException var6) {
                        throw new FileNotFoundException("Single path segment is not a resource ID: " + var1);
                    }
                } else {
                    if (var2 != 2) {
                        throw new FileNotFoundException("More than two path segments: " + var1);
                    }

                    var2 = var3.getIdentifier((String)var5.get(1), (String)var5.get(0), var4);
                }

                if (var2 == 0) {
                    throw new FileNotFoundException("No resource found for: " + var1);
                } else {
                    return var3.getDrawable(var2);
                }
            }
        }
    }

    // $FF: renamed from: a (android.content.Context, android.database.Cursor, android.view.ViewGroup) android.view.View
    public View method_827(Context var1, Cursor var2, ViewGroup var3) {
        View var4 = super.method_827(var1, var2, var3);
        var4.setTag(new ae$a(var4));
        ((ImageView)var4.findViewById(a$f.edit_query)).setImageResource(this.field_793);
        return var4;
    }

    // $FF: renamed from: a (int) void
    public void method_850(int var1) {
        this.field_795 = var1;
    }

    // $FF: renamed from: a (android.database.Cursor) void
    public void method_109(Cursor param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.view.View, android.content.Context, android.database.Cursor) void
    public void method_829(View var1, Context var2, Cursor var3) {
        ae$a var7 = (ae$a)var1.getTag();
        int var4;
        if (this.field_802 != -1) {
            var4 = var3.getInt(this.field_802);
        } else {
            var4 = 0;
        }

        String var5;
        if (var7.field_1007 != null) {
            var5 = method_835(var3, this.field_797);
            this.method_838(var7.field_1007, var5);
        }

        if (var7.field_1008 != null) {
            var5 = method_835(var3, this.field_799);
            Object var6;
            if (var5 != null) {
                var6 = this.method_843(var5);
            } else {
                var6 = method_835(var3, this.field_798);
            }

            if (TextUtils.isEmpty((CharSequence)var6)) {
                if (var7.field_1007 != null) {
                    var7.field_1007.setSingleLine(false);
                    var7.field_1007.setMaxLines(2);
                }
            } else if (var7.field_1007 != null) {
                var7.field_1007.setSingleLine(true);
                var7.field_1007.setMaxLines(1);
            }

            this.method_838(var7.field_1008, (CharSequence)var6);
        }

        if (var7.field_1009 != null) {
            this.method_837(var7.field_1009, this.method_845(var3), 4);
        }

        if (var7.field_1010 != null) {
            this.method_837(var7.field_1010, this.method_846(var3), 8);
        }

        if (this.field_795 != 2 && (this.field_795 != 1 || (var4 & 1) == 0)) {
            var7.field_1011.setVisibility(8);
        } else {
            var7.field_1011.setVisibility(0);
            var7.field_1011.setTag(var7.field_1007.getText());
            var7.field_1011.setOnClickListener(this);
        }

    }

    // $FF: renamed from: c (android.database.Cursor) java.lang.CharSequence
    public CharSequence method_110(Cursor var1) {
        Object var3 = null;
        String var2;
        if (var1 == null) {
            var2 = (String)var3;
        } else {
            var2 = method_836(var1, "suggest_intent_query");
            if (var2 == null) {
                if (this.field_790.shouldRewriteQueryFromData()) {
                    var2 = method_836(var1, "suggest_intent_data");
                    if (var2 != null) {
                        return var2;
                    }
                }

                var2 = (String)var3;
                if (this.field_790.shouldRewriteQueryFromText()) {
                    String var4 = method_836(var1, "suggest_text_1");
                    var2 = (String)var3;
                    if (var4 != null) {
                        var2 = var4;
                    }
                }
            }
        }

        return var2;
    }

    public View getDropDownView(int var1, View var2, ViewGroup var3) {
        try {
            var2 = super.getDropDownView(var1, var2, var3);
        } catch (RuntimeException var5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", var5);
            var2 = this.b(this.d, this.c, var3);
            if (var2 != null) {
                ((ae$a)var2.getTag()).field_1007.setText(var5.toString());
            }
        }

        return var2;
    }

    public View getView(int var1, View var2, ViewGroup var3) {
        try {
            var2 = super.getView(var1, var2, var3);
        } catch (RuntimeException var5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", var5);
            var2 = this.method_827(this.d, this.c, var3);
            if (var2 != null) {
                ((ae$a)var2.getTag()).field_1007.setText(var5.toString());
            }
        }

        return var2;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.method_844(this.a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.method_844(this.a());
    }

    public void onClick(View var1) {
        Object var2 = var1.getTag();
        if (var2 instanceof CharSequence) {
            this.field_789.method_283((CharSequence)var2);
        }

    }
}
