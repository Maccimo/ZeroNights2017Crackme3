package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.h.class_129;
import android.support.v7.a.a$f;
import android.support.v7.a.a$g;
import android.support.v7.a.a$h;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

public class ActivityChooserView extends ViewGroup {
    // $FF: renamed from: a android.support.v7.widget.ActivityChooserView$a
    final ActivityChooserView.class_299 field_760;
    // $FF: renamed from: b android.widget.FrameLayout
    final FrameLayout field_761;
    // $FF: renamed from: c android.widget.FrameLayout
    final FrameLayout field_762;
    // $FF: renamed from: d android.support.v4.h.c
    class_129 field_763;
    // $FF: renamed from: e android.database.DataSetObserver
    final DataSetObserver field_764;
    // $FF: renamed from: f android.widget.PopupWindow.OnDismissListener
    OnDismissListener field_765;
    // $FF: renamed from: g boolean
    boolean field_766;
    // $FF: renamed from: h int
    int field_767;
    // $FF: renamed from: i android.support.v7.widget.ActivityChooserView$b
    private final ActivityChooserView.class_300 field_768;
    // $FF: renamed from: j android.support.v7.widget.w
    private final class_31 field_769;
    // $FF: renamed from: k android.widget.ImageView
    private final ImageView field_770;
    // $FF: renamed from: l int
    private final int field_771;
    // $FF: renamed from: m android.view.ViewTreeObserver.OnGlobalLayoutListener
    private final OnGlobalLayoutListener field_772;
    // $FF: renamed from: n android.support.v7.widget.x
    private class_27 field_773;
    // $FF: renamed from: o boolean
    private boolean field_774;
    // $FF: renamed from: p int
    private int field_775;

    // $FF: renamed from: a (int) void
    void method_823(int var1) {
        if (this.field_760.method_956() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        } else {
            this.getViewTreeObserver().addOnGlobalLayoutListener(this.field_772);
            boolean var4;
            if (this.field_762.getVisibility() == 0) {
                var4 = true;
            } else {
                var4 = false;
            }

            int var3 = this.field_760.method_955();
            byte var2;
            if (var4) {
                var2 = 1;
            } else {
                var2 = 0;
            }

            if (var1 != Integer.MAX_VALUE && var3 > var2 + var1) {
                this.field_760.method_952(true);
                this.field_760.method_950(var1 - 1);
            } else {
                this.field_760.method_952(false);
                this.field_760.method_950(var1);
            }

            class_27 var5 = this.getListPopupWindow();
            if (!var5.method_149()) {
                if (!this.field_766 && var4) {
                    this.field_760.method_953(false, false);
                } else {
                    this.field_760.method_953(true, var4);
                }

                var5.method_189(Math.min(this.field_760.method_949(), this.field_771));
                var5.method_147();
                if (this.field_763 != null) {
                    this.field_763.method_1069(true);
                }

                var5.method_150().setContentDescription(this.getContext().getString(a$h.abc_activitychooserview_choose_application));
                var5.method_150().setSelector(new ColorDrawable(0));
            }

        }
    }

    // $FF: renamed from: a () boolean
    public boolean method_824() {
        boolean var2 = false;
        boolean var1 = var2;
        if (!this.method_826()) {
            if (!this.field_774) {
                var1 = var2;
            } else {
                this.field_766 = false;
                this.method_823(this.field_767);
                var1 = true;
            }
        }

        return var1;
    }

    // $FF: renamed from: b () boolean
    public boolean method_825() {
        if (this.method_826()) {
            this.getListPopupWindow().method_148();
            ViewTreeObserver var1 = this.getViewTreeObserver();
            if (var1.isAlive()) {
                var1.removeGlobalOnLayoutListener(this.field_772);
            }
        }

        return true;
    }

    // $FF: renamed from: c () boolean
    public boolean method_826() {
        return this.getListPopupWindow().method_149();
    }

    public class_73 getDataModel() {
        return this.field_760.method_956();
    }

    class_27 getListPopupWindow() {
        if (this.field_773 == null) {
            this.field_773 = new class_27(this.getContext());
            this.field_773.method_179(this.field_760);
            this.field_773.method_183(this);
            this.field_773.method_181(true);
            this.field_773.method_178(this.field_768);
            this.field_773.method_180(this.field_768);
        }

        return this.field_773;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        class_73 var1 = this.field_760.method_956();
        if (var1 != null) {
            var1.registerObserver(this.field_764);
        }

        this.field_774 = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        class_73 var1 = this.field_760.method_956();
        if (var1 != null) {
            var1.unregisterObserver(this.field_764);
        }

        ViewTreeObserver var2 = this.getViewTreeObserver();
        if (var2.isAlive()) {
            var2.removeGlobalOnLayoutListener(this.field_772);
        }

        if (this.method_826()) {
            this.method_825();
        }

        this.field_774 = false;
    }

    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        this.field_769.layout(0, 0, var4 - var2, var5 - var3);
        if (!this.method_826()) {
            this.method_825();
        }

    }

    protected void onMeasure(int var1, int var2) {
        class_31 var4 = this.field_769;
        int var3 = var2;
        if (this.field_762.getVisibility() != 0) {
            var3 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(var2), 1073741824);
        }

        this.measureChild(var4, var1, var3);
        this.setMeasuredDimension(var4.getMeasuredWidth(), var4.getMeasuredHeight());
    }

    public void setActivityChooserModel(class_73 var1) {
        this.field_760.method_951(var1);
        if (this.method_826()) {
            this.method_825();
            this.method_824();
        }

    }

    public void setDefaultActionButtonContentDescription(int var1) {
        this.field_775 = var1;
    }

    public void setExpandActivityOverflowButtonContentDescription(int var1) {
        String var2 = this.getContext().getString(var1);
        this.field_770.setContentDescription(var2);
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable var1) {
        this.field_770.setImageDrawable(var1);
    }

    public void setInitialActivityCount(int var1) {
        this.field_767 = var1;
    }

    public void setOnDismissListener(OnDismissListener var1) {
        this.field_765 = var1;
    }

    public void setProvider(class_129 var1) {
        this.field_763 = var1;
    }

    public static class InnerLayout extends class_31 {
        // $FF: renamed from: a int[]
        private static final int[] field_146 = new int[]{16842964};

        public InnerLayout(Context var1, AttributeSet var2) {
            super(var1, var2);
            class_97 var3 = class_97.method_866(var1, var2, field_146);
            this.setBackgroundDrawable(var3.method_871(0));
            var3.method_872();
        }
    }

    private class class_299 extends BaseAdapter {
        // $FF: renamed from: a android.support.v7.widget.ActivityChooserView
        // $FF: synthetic field
        final ActivityChooserView field_949;
        // $FF: renamed from: b android.support.v7.widget.e
        private class_73 field_950;
        // $FF: renamed from: c int
        private int field_951;
        // $FF: renamed from: d boolean
        private boolean field_952;
        // $FF: renamed from: e boolean
        private boolean field_953;
        // $FF: renamed from: f boolean
        private boolean field_954;

        // $FF: renamed from: a () int
        public int method_949() {
            int var4 = this.field_951;
            this.field_951 = Integer.MAX_VALUE;
            int var6 = MeasureSpec.makeMeasureSpec(0, 0);
            int var3 = MeasureSpec.makeMeasureSpec(0, 0);
            int var5 = this.getCount();
            int var2 = 0;
            int var1 = 0;

            for(View var7 = null; var2 < var5; ++var2) {
                var7 = this.getView(var2, var7, (ViewGroup)null);
                var7.measure(var6, var3);
                var1 = Math.max(var1, var7.getMeasuredWidth());
            }

            this.field_951 = var4;
            return var1;
        }

        // $FF: renamed from: a (int) void
        public void method_950(int var1) {
            if (this.field_951 != var1) {
                this.field_951 = var1;
                this.notifyDataSetChanged();
            }

        }

        // $FF: renamed from: a (android.support.v7.widget.e) void
        public void method_951(class_73 var1) {
            class_73 var2 = this.field_949.field_760.method_956();
            if (var2 != null && this.field_949.isShown()) {
                var2.unregisterObserver(this.field_949.field_764);
            }

            this.field_950 = var1;
            if (var1 != null && this.field_949.isShown()) {
                var1.registerObserver(this.field_949.field_764);
            }

            this.notifyDataSetChanged();
        }

        // $FF: renamed from: a (boolean) void
        public void method_952(boolean var1) {
            if (this.field_954 != var1) {
                this.field_954 = var1;
                this.notifyDataSetChanged();
            }

        }

        // $FF: renamed from: a (boolean, boolean) void
        public void method_953(boolean var1, boolean var2) {
            if (this.field_952 != var1 || this.field_953 != var2) {
                this.field_952 = var1;
                this.field_953 = var2;
                this.notifyDataSetChanged();
            }

        }

        // $FF: renamed from: b () android.content.pm.ResolveInfo
        public ResolveInfo method_954() {
            return this.field_950.method_708();
        }

        // $FF: renamed from: c () int
        public int method_955() {
            return this.field_950.method_704();
        }

        // $FF: renamed from: d () android.support.v7.widget.e
        public class_73 method_956() {
            return this.field_950;
        }

        // $FF: renamed from: e () boolean
        public boolean method_957() {
            return this.field_952;
        }

        public int getCount() {
            int var2 = this.field_950.method_704();
            int var1 = var2;
            if (!this.field_952) {
                var1 = var2;
                if (this.field_950.method_708() != null) {
                    var1 = var2 - 1;
                }
            }

            var2 = Math.min(var1, this.field_951);
            var1 = var2;
            if (this.field_954) {
                var1 = var2 + 1;
            }

            return var1;
        }

        public Object getItem(int var1) {
            ResolveInfo var3;
            switch(this.getItemViewType(var1)) {
            case 0:
                int var2 = var1;
                if (!this.field_952) {
                    var2 = var1;
                    if (this.field_950.method_708() != null) {
                        var2 = var1 + 1;
                    }
                }

                var3 = this.field_950.method_706(var2);
                break;
            case 1:
                var3 = null;
                break;
            default:
                throw new IllegalArgumentException();
            }

            return var3;
        }

        public long getItemId(int var1) {
            return (long)var1;
        }

        public int getItemViewType(int var1) {
            byte var2;
            if (this.field_954 && var1 == this.getCount() - 1) {
                var2 = 1;
            } else {
                var2 = 0;
            }

            return var2;
        }

        public View getView(int var1, View var2, ViewGroup var3) {
            View var4;
            switch(this.getItemViewType(var1)) {
            case 0:
                label26: {
                    if (var2 != null) {
                        var4 = var2;
                        if (var2.getId() == a$f.list_item) {
                            break label26;
                        }
                    }

                    var4 = LayoutInflater.from(this.field_949.getContext()).inflate(a$g.abc_activity_chooser_view_list_item, var3, false);
                }

                PackageManager var7 = this.field_949.getContext().getPackageManager();
                ImageView var6 = (ImageView)var4.findViewById(a$f.icon);
                ResolveInfo var5 = (ResolveInfo)this.getItem(var1);
                var6.setImageDrawable(var5.loadIcon(var7));
                ((TextView)var4.findViewById(a$f.title)).setText(var5.loadLabel(var7));
                if (this.field_952 && var1 == 0 && this.field_953) {
                    var4.setActivated(true);
                } else {
                    var4.setActivated(false);
                }
                break;
            case 1:
                if (var2 != null) {
                    var4 = var2;
                    if (var2.getId() == 1) {
                        break;
                    }
                }

                var4 = LayoutInflater.from(this.field_949.getContext()).inflate(a$g.abc_activity_chooser_view_list_item, var3, false);
                var4.setId(1);
                ((TextView)var4.findViewById(a$f.title)).setText(this.field_949.getContext().getString(a$h.abc_activity_chooser_view_see_all));
                break;
            default:
                throw new IllegalArgumentException();
            }

            return var4;
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    private class class_300 implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
        // $FF: renamed from: a android.support.v7.widget.ActivityChooserView
        // $FF: synthetic field
        final ActivityChooserView field_948;

        // $FF: renamed from: a () void
        private void method_948() {
            if (this.field_948.field_765 != null) {
                this.field_948.field_765.onDismiss();
            }

        }

        public void onClick(View var1) {
            if (var1 == this.field_948.field_762) {
                this.field_948.method_825();
                ResolveInfo var3 = this.field_948.field_760.method_954();
                int var2 = this.field_948.field_760.method_956().method_705(var3);
                Intent var4 = this.field_948.field_760.method_956().method_707(var2);
                if (var4 != null) {
                    var4.addFlags(524288);
                    this.field_948.getContext().startActivity(var4);
                }
            } else {
                if (var1 != this.field_948.field_761) {
                    throw new IllegalArgumentException();
                }

                this.field_948.field_766 = false;
                this.field_948.method_823(this.field_948.field_767);
            }

        }

        public void onDismiss() {
            this.method_948();
            if (this.field_948.field_763 != null) {
                this.field_948.field_763.method_1069(false);
            }

        }

        public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
            switch(((ActivityChooserView.class_299)var1.getAdapter()).getItemViewType(var3)) {
            case 0:
                this.field_948.method_825();
                if (this.field_948.field_766) {
                    if (var3 > 0) {
                        this.field_948.field_760.method_956().method_709(var3);
                    }
                } else {
                    if (!this.field_948.field_760.method_957()) {
                        ++var3;
                    }

                    Intent var6 = this.field_948.field_760.method_956().method_707(var3);
                    if (var6 != null) {
                        var6.addFlags(524288);
                        this.field_948.getContext().startActivity(var6);
                    }
                }
                break;
            case 1:
                this.field_948.method_823(Integer.MAX_VALUE);
                break;
            default:
                throw new IllegalArgumentException();
            }

        }

        public boolean onLongClick(View var1) {
            if (var1 == this.field_948.field_762) {
                if (this.field_948.field_760.getCount() > 0) {
                    this.field_948.field_766 = true;
                    this.field_948.method_823(this.field_948.field_767);
                }

                return true;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
