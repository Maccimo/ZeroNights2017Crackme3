package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.h.class_89;
import android.support.v4.widget.class_90;
import android.support.v7.a.a$d;
import android.support.v7.view.class_22;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.KeyEvent.DispatcherState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends class_31 implements class_22 {
    // $FF: renamed from: i android.support.v7.widget.SearchView$a
    static final SearchView.class_265 field_153 = new SearchView.class_265();
    // $FF: renamed from: A android.view.View.OnClickListener
    private OnClickListener field_154;
    // $FF: renamed from: B boolean
    private boolean field_155;
    // $FF: renamed from: C boolean
    private boolean field_156;
    // $FF: renamed from: D boolean
    private boolean field_157;
    // $FF: renamed from: E java.lang.CharSequence
    private CharSequence field_158;
    // $FF: renamed from: F boolean
    private boolean field_159;
    // $FF: renamed from: G boolean
    private boolean field_160;
    // $FF: renamed from: H int
    private int field_161;
    // $FF: renamed from: I boolean
    private boolean field_162;
    // $FF: renamed from: J java.lang.CharSequence
    private CharSequence field_163;
    // $FF: renamed from: K boolean
    private boolean field_164;
    // $FF: renamed from: L int
    private int field_165;
    // $FF: renamed from: M android.os.Bundle
    private Bundle field_166;
    // $FF: renamed from: N java.lang.Runnable
    private final Runnable field_167;
    // $FF: renamed from: O java.lang.Runnable
    private Runnable field_168;
    // $FF: renamed from: P java.util.WeakHashMap
    private final WeakHashMap field_169;
    // $FF: renamed from: a android.support.v7.widget.SearchView$SearchAutoComplete
    final SearchView.SearchAutoComplete field_170;
    // $FF: renamed from: b android.widget.ImageView
    final ImageView field_171;
    // $FF: renamed from: c android.widget.ImageView
    final ImageView field_172;
    // $FF: renamed from: d android.widget.ImageView
    final ImageView field_173;
    // $FF: renamed from: e android.widget.ImageView
    final ImageView field_174;
    // $FF: renamed from: f android.view.View.OnFocusChangeListener
    OnFocusChangeListener field_175;
    // $FF: renamed from: g android.support.v4.widget.b
    class_90 field_176;
    // $FF: renamed from: h android.app.SearchableInfo
    SearchableInfo field_177;
    // $FF: renamed from: j android.view.View
    private final View field_178;
    // $FF: renamed from: k android.view.View
    private final View field_179;
    // $FF: renamed from: l android.support.v7.widget.SearchView$f
    private SearchView.class_269 field_180;
    // $FF: renamed from: m android.graphics.Rect
    private Rect field_181;
    // $FF: renamed from: n android.graphics.Rect
    private Rect field_182;
    // $FF: renamed from: o int[]
    private int[] field_183;
    // $FF: renamed from: p int[]
    private int[] field_184;
    // $FF: renamed from: q android.widget.ImageView
    private final ImageView field_185;
    // $FF: renamed from: r android.graphics.drawable.Drawable
    private final Drawable field_186;
    // $FF: renamed from: s int
    private final int field_187;
    // $FF: renamed from: t int
    private final int field_188;
    // $FF: renamed from: u android.content.Intent
    private final Intent field_189;
    // $FF: renamed from: v android.content.Intent
    private final Intent field_190;
    // $FF: renamed from: w java.lang.CharSequence
    private final CharSequence field_191;
    // $FF: renamed from: x android.support.v7.widget.SearchView$c
    private SearchView.class_267 field_192;
    // $FF: renamed from: y android.support.v7.widget.SearchView$b
    private SearchView.class_266 field_193;
    // $FF: renamed from: z android.support.v7.widget.SearchView$d
    private SearchView.class_268 field_194;

    // $FF: renamed from: a (java.lang.String, android.net.Uri, java.lang.String, java.lang.String, int, java.lang.String) android.content.Intent
    private Intent method_267(String var1, Uri var2, String var3, String var4, int var5, String var6) {
        Intent var7 = new Intent(var1);
        var7.addFlags(268435456);
        if (var2 != null) {
            var7.setData(var2);
        }

        var7.putExtra("user_query", this.field_163);
        if (var4 != null) {
            var7.putExtra("query", var4);
        }

        if (var3 != null) {
            var7.putExtra("intent_extra_data_key", var3);
        }

        if (this.field_166 != null) {
            var7.putExtra("app_data", this.field_166);
        }

        if (var5 != 0) {
            var7.putExtra("action_key", var5);
            var7.putExtra("action_msg", var6);
        }

        var7.setComponent(this.field_177.getSearchActivity());
        return var7;
    }

    // $FF: renamed from: a (android.view.View, android.graphics.Rect) void
    private void method_268(View var1, Rect var2) {
        var1.getLocationInWindow(this.field_183);
        this.getLocationInWindow(this.field_184);
        int var3 = this.field_183[1] - this.field_184[1];
        int var4 = this.field_183[0] - this.field_184[0];
        var2.set(var4, var3, var1.getWidth() + var4, var1.getHeight() + var3);
    }

    // $FF: renamed from: a (boolean) void
    private void method_269(boolean var1) {
        boolean var5 = true;
        byte var3 = 8;
        this.field_156 = var1;
        byte var2;
        if (var1) {
            var2 = 0;
        } else {
            var2 = 8;
        }

        boolean var4;
        if (!TextUtils.isEmpty(this.field_170.getText())) {
            var4 = true;
        } else {
            var4 = false;
        }

        this.field_171.setVisibility(var2);
        this.method_272(var4);
        View var6 = this.field_178;
        if (var1) {
            var2 = 8;
        } else {
            var2 = 0;
        }

        var6.setVisibility(var2);
        var2 = var3;
        if (this.field_185.getDrawable() != null) {
            if (this.field_155) {
                var2 = var3;
            } else {
                var2 = 0;
            }
        }

        this.field_185.setVisibility(var2);
        this.method_277();
        if (!var4) {
            var1 = var5;
        } else {
            var1 = false;
        }

        this.method_273(var1);
        this.method_276();
    }

    // $FF: renamed from: a (android.content.Context) boolean
    static boolean method_270(Context var0) {
        boolean var1;
        if (var0.getResources().getConfiguration().orientation == 2) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: b (java.lang.CharSequence) java.lang.CharSequence
    private CharSequence method_271(CharSequence var1) {
        Object var3 = var1;
        if (this.field_155) {
            if (this.field_186 == null) {
                var3 = var1;
            } else {
                int var2 = (int)((double)this.field_170.getTextSize() * 1.25D);
                this.field_186.setBounds(0, 0, var2, var2);
                var3 = new SpannableStringBuilder("   ");
                ((SpannableStringBuilder)var3).setSpan(new ImageSpan(this.field_186), 1, 2, 33);
                ((SpannableStringBuilder)var3).append(var1);
            }
        }

        return (CharSequence)var3;
    }

    // $FF: renamed from: b (boolean) void
    private void method_272(boolean var1) {
        byte var3 = 8;
        byte var2 = var3;
        if (this.field_157) {
            var2 = var3;
            if (this.method_275()) {
                var2 = var3;
                if (this.hasFocus()) {
                    label14: {
                        if (!var1) {
                            var2 = var3;
                            if (this.field_162) {
                                break label14;
                            }
                        }

                        var2 = 0;
                    }
                }
            }
        }

        this.field_172.setVisibility(var2);
    }

    // $FF: renamed from: c (boolean) void
    private void method_273(boolean var1) {
        byte var2;
        if (this.field_162 && !this.method_285() && var1) {
            var2 = 0;
            this.field_172.setVisibility(8);
        } else {
            var2 = 8;
        }

        this.field_174.setVisibility(var2);
    }

    private int getPreferredHeight() {
        return this.getContext().getResources().getDimensionPixelSize(a$d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(a$d.abc_search_view_preferred_width);
    }

    // $FF: renamed from: j () boolean
    private boolean method_274() {
        boolean var2 = false;
        boolean var1 = var2;
        if (this.field_177 != null) {
            var1 = var2;
            if (this.field_177.getVoiceSearchEnabled()) {
                Intent var3 = null;
                if (this.field_177.getVoiceSearchLaunchWebSearch()) {
                    var3 = this.field_189;
                } else if (this.field_177.getVoiceSearchLaunchRecognizer()) {
                    var3 = this.field_190;
                }

                var1 = var2;
                if (var3 != null) {
                    var1 = var2;
                    if (this.getContext().getPackageManager().resolveActivity(var3, 65536) != null) {
                        var1 = true;
                    }
                }
            }
        }

        return var1;
    }

    // $FF: renamed from: k () boolean
    private boolean method_275() {
        boolean var1;
        if ((this.field_157 || this.field_162) && !this.method_285()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: l () void
    private void method_276() {
        byte var2 = 8;
        byte var1 = var2;
        if (this.method_275()) {
            label12: {
                if (this.field_172.getVisibility() != 0) {
                    var1 = var2;
                    if (this.field_174.getVisibility() != 0) {
                        break label12;
                    }
                }

                var1 = 0;
            }
        }

        this.field_179.setVisibility(var1);
    }

    // $FF: renamed from: m () void
    private void method_277() {
        boolean var4 = true;
        byte var3 = 0;
        boolean var1;
        if (!TextUtils.isEmpty(this.field_170.getText())) {
            var1 = true;
        } else {
            var1 = false;
        }

        boolean var2 = var4;
        if (!var1) {
            if (this.field_155 && !this.field_164) {
                var2 = var4;
            } else {
                var2 = false;
            }
        }

        ImageView var5 = this.field_173;
        byte var7;
        if (var2) {
            var7 = var3;
        } else {
            var7 = 8;
        }

        var5.setVisibility(var7);
        Drawable var6 = this.field_173.getDrawable();
        if (var6 != null) {
            int[] var8;
            if (var1) {
                var8 = ENABLED_STATE_SET;
            } else {
                var8 = EMPTY_STATE_SET;
            }

            var6.setState(var8);
        }

    }

    // $FF: renamed from: n () void
    private void method_278() {
        this.post(this.field_167);
    }

    // $FF: renamed from: o () void
    private void method_279() {
        CharSequence var2 = this.getQueryHint();
        SearchView.SearchAutoComplete var3 = this.field_170;
        Object var1 = var2;
        if (var2 == null) {
            var1 = "";
        }

        var3.setHint(this.method_271((CharSequence)var1));
    }

    // $FF: renamed from: p () void
    private void method_280() {
        byte var2 = 1;
        this.field_170.setThreshold(this.field_177.getSuggestThreshold());
        this.field_170.setImeOptions(this.field_177.getImeOptions());
        int var3 = this.field_177.getInputType();
        int var1 = var3;
        if ((var3 & 15) == 1) {
            var3 &= -65537;
            var1 = var3;
            if (this.field_177.getSuggestAuthority() != null) {
                var1 = var3 | 65536 | 524288;
            }
        }

        this.field_170.setInputType(var1);
        if (this.field_176 != null) {
            this.field_176.method_109((Cursor)null);
        }

        if (this.field_177.getSuggestAuthority() != null) {
            this.field_176 = new class_92(this.getContext(), this, this.field_177, this.field_169);
            this.field_170.setAdapter(this.field_176);
            class_92 var4 = (class_92)this.field_176;
            byte var5 = var2;
            if (this.field_159) {
                var5 = 2;
            }

            var4.method_850(var5);
        }

    }

    // $FF: renamed from: q () void
    private void method_281() {
        this.field_170.dismissDropDown();
    }

    private void setQuery(CharSequence var1) {
        this.field_170.setText(var1);
        SearchView.SearchAutoComplete var3 = this.field_170;
        int var2;
        if (TextUtils.isEmpty(var1)) {
            var2 = 0;
        } else {
            var2 = var1.length();
        }

        var3.setSelection(var2);
    }

    // $FF: renamed from: a () void
    public void method_137() {
        if (!this.field_164) {
            this.field_164 = true;
            this.field_165 = this.field_170.getImeOptions();
            this.field_170.setImeOptions(this.field_165 | 33554432);
            this.field_170.setText("");
            this.setIconified(false);
        }

    }

    // $FF: renamed from: a (int, java.lang.String, java.lang.String) void
    void method_282(int var1, String var2, String var3) {
        Intent var4 = this.method_267("android.intent.action.SEARCH", (Uri)null, (String)null, var3, var1, var2);
        this.getContext().startActivity(var4);
    }

    // $FF: renamed from: a (java.lang.CharSequence) void
    void method_283(CharSequence var1) {
        this.setQuery(var1);
    }

    // $FF: renamed from: a (java.lang.CharSequence, boolean) void
    public void method_284(CharSequence var1, boolean var2) {
        this.field_170.setText(var1);
        if (var1 != null) {
            this.field_170.setSelection(this.field_170.length());
            this.field_163 = var1;
        }

        if (var2 && !TextUtils.isEmpty(var1)) {
            this.method_286();
        }

    }

    // $FF: renamed from: b () void
    public void method_138() {
        this.method_284("", false);
        this.clearFocus();
        this.method_269(true);
        this.field_170.setImeOptions(this.field_165);
        this.field_164 = false;
    }

    // $FF: renamed from: c () boolean
    public boolean method_285() {
        return this.field_156;
    }

    public void clearFocus() {
        this.field_160 = true;
        super.clearFocus();
        this.field_170.clearFocus();
        this.field_170.setImeVisibility(false);
        this.field_160 = false;
    }

    // $FF: renamed from: d () void
    void method_286() {
        Editable var1 = this.field_170.getText();
        if (var1 != null && TextUtils.getTrimmedLength(var1) > 0 && (this.field_192 == null || !this.field_192.method_155(var1.toString()))) {
            if (this.field_177 != null) {
                this.method_282(0, (String)null, var1.toString());
            }

            this.field_170.setImeVisibility(false);
            this.method_281();
        }

    }

    // $FF: renamed from: e () void
    void method_287() {
        if (TextUtils.isEmpty(this.field_170.getText())) {
            if (this.field_155 && (this.field_193 == null || !this.field_193.method_154())) {
                this.clearFocus();
                this.method_269(true);
            }
        } else {
            this.field_170.setText("");
            this.field_170.requestFocus();
            this.field_170.setImeVisibility(true);
        }

    }

    // $FF: renamed from: f () void
    void method_288() {
        this.method_269(false);
        this.field_170.requestFocus();
        this.field_170.setImeVisibility(true);
        if (this.field_154 != null) {
            this.field_154.onClick(this);
        }

    }

    public int getImeOptions() {
        return this.field_170.getImeOptions();
    }

    public int getInputType() {
        return this.field_170.getInputType();
    }

    public int getMaxWidth() {
        return this.field_161;
    }

    public CharSequence getQuery() {
        return this.field_170.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence var1;
        if (this.field_158 != null) {
            var1 = this.field_158;
        } else if (this.field_177 != null && this.field_177.getHintId() != 0) {
            var1 = this.getContext().getText(this.field_177.getHintId());
        } else {
            var1 = this.field_191;
        }

        return var1;
    }

    int getSuggestionCommitIconResId() {
        return this.field_188;
    }

    int getSuggestionRowLayout() {
        return this.field_187;
    }

    public class_90 getSuggestionsAdapter() {
        return this.field_176;
    }

    // $FF: renamed from: h () void
    void method_289() {
        this.method_269(this.method_285());
        this.method_278();
        if (this.field_170.hasFocus()) {
            this.method_290();
        }

    }

    // $FF: renamed from: i () void
    void method_290() {
        field_153.method_1330(this.field_170);
        field_153.method_1332(this.field_170);
    }

    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.field_167);
        this.post(this.field_168);
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        super.onLayout(var1, var2, var3, var4, var5);
        if (var1) {
            this.method_268(this.field_170, this.field_181);
            this.field_182.set(this.field_181.left, 0, this.field_181.right, var5 - var3);
            if (this.field_180 == null) {
                this.field_180 = new SearchView.class_269(this.field_182, this.field_181, this.field_170);
                this.setTouchDelegate(this.field_180);
            } else {
                this.field_180.method_1409(this.field_182, this.field_181);
            }
        }

    }

    protected void onMeasure(int var1, int var2) {
        if (this.method_285()) {
            super.onMeasure(var1, var2);
        } else {
            int var4 = MeasureSpec.getMode(var1);
            int var3 = MeasureSpec.getSize(var1);
            switch(var4) {
            case Integer.MIN_VALUE:
                if (this.field_161 > 0) {
                    var1 = Math.min(this.field_161, var3);
                } else {
                    var1 = Math.min(this.getPreferredWidth(), var3);
                }
                break;
            case 0:
                if (this.field_161 > 0) {
                    var1 = this.field_161;
                } else {
                    var1 = this.getPreferredWidth();
                }
                break;
            case 1073741824:
                var1 = var3;
                if (this.field_161 > 0) {
                    var1 = Math.min(this.field_161, var3);
                }
                break;
            default:
                var1 = var3;
            }

            var3 = MeasureSpec.getMode(var2);
            var2 = MeasureSpec.getSize(var2);
            switch(var3) {
            case Integer.MIN_VALUE:
                var2 = Math.min(this.getPreferredHeight(), var2);
                break;
            case 0:
                var2 = this.getPreferredHeight();
            }

            super.onMeasure(MeasureSpec.makeMeasureSpec(var1, 1073741824), MeasureSpec.makeMeasureSpec(var2, 1073741824));
        }

    }

    protected void onRestoreInstanceState(Parcelable var1) {
        if (!(var1 instanceof SearchView.class_255)) {
            super.onRestoreInstanceState(var1);
        } else {
            SearchView.class_255 var2 = (SearchView.class_255)var1;
            super.onRestoreInstanceState(var2.a());
            this.method_269(var2.field_757);
            this.requestLayout();
        }

    }

    protected Parcelable onSaveInstanceState() {
        SearchView.class_255 var1 = new SearchView.class_255(super.onSaveInstanceState());
        var1.field_757 = this.method_285();
        return var1;
    }

    public void onWindowFocusChanged(boolean var1) {
        super.onWindowFocusChanged(var1);
        this.method_278();
    }

    public boolean requestFocus(int var1, Rect var2) {
        boolean var3;
        if (!this.field_160 && this.isFocusable()) {
            if (!this.method_285()) {
                boolean var4 = this.field_170.requestFocus(var1, var2);
                var3 = var4;
                if (var4) {
                    this.method_269(false);
                    var3 = var4;
                }
            } else {
                var3 = super.requestFocus(var1, var2);
            }
        } else {
            var3 = false;
        }

        return var3;
    }

    public void setAppSearchData(Bundle var1) {
        this.field_166 = var1;
    }

    public void setIconified(boolean var1) {
        if (var1) {
            this.method_287();
        } else {
            this.method_288();
        }

    }

    public void setIconifiedByDefault(boolean var1) {
        if (this.field_155 != var1) {
            this.field_155 = var1;
            this.method_269(var1);
            this.method_279();
        }

    }

    public void setImeOptions(int var1) {
        this.field_170.setImeOptions(var1);
    }

    public void setInputType(int var1) {
        this.field_170.setInputType(var1);
    }

    public void setMaxWidth(int var1) {
        this.field_161 = var1;
        this.requestLayout();
    }

    public void setOnCloseListener(SearchView.class_266 var1) {
        this.field_193 = var1;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener var1) {
        this.field_175 = var1;
    }

    public void setOnQueryTextListener(SearchView.class_267 var1) {
        this.field_192 = var1;
    }

    public void setOnSearchClickListener(OnClickListener var1) {
        this.field_154 = var1;
    }

    public void setOnSuggestionListener(SearchView.class_268 var1) {
        this.field_194 = var1;
    }

    public void setQueryHint(CharSequence var1) {
        this.field_158 = var1;
        this.method_279();
    }

    public void setQueryRefinementEnabled(boolean var1) {
        this.field_159 = var1;
        if (this.field_176 instanceof class_92) {
            class_92 var3 = (class_92)this.field_176;
            byte var2;
            if (var1) {
                var2 = 2;
            } else {
                var2 = 1;
            }

            var3.method_850(var2);
        }

    }

    public void setSearchableInfo(SearchableInfo var1) {
        this.field_177 = var1;
        if (this.field_177 != null) {
            this.method_280();
            this.method_279();
        }

        this.field_162 = this.method_274();
        if (this.field_162) {
            this.field_170.setPrivateImeOptions("nm");
        }

        this.method_269(this.method_285());
    }

    public void setSubmitButtonEnabled(boolean var1) {
        this.field_157 = var1;
        this.method_269(this.method_285());
    }

    public void setSuggestionsAdapter(class_90 var1) {
        this.field_176 = var1;
        this.field_170.setAdapter(this.field_176);
    }

    public static class SearchAutoComplete extends class_37 {
        // $FF: renamed from: a java.lang.Runnable
        final Runnable field_264;
        // $FF: renamed from: b int
        private int field_265;
        // $FF: renamed from: c android.support.v7.widget.SearchView
        private SearchView field_266;
        // $FF: renamed from: d boolean
        private boolean field_267;

        public SearchAutoComplete(Context var1) {
            this(var1, (AttributeSet)null);
        }

        public SearchAutoComplete(Context var1, AttributeSet var2) {
            this(var1, var2, android.support.v7.a.a$a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context var1, AttributeSet var2, int var3) {
            super(var1, var2, var3);
            this.field_264 = new Runnable() {
                public void run() {
                    SearchAutoComplete.this.method_373();
                }
            };
            this.field_265 = this.getThreshold();
        }

        // $FF: renamed from: a () void
        private void method_373() {
            if (this.field_267) {
                ((InputMethodManager)this.getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.field_267 = false;
            }

        }

        private int getSearchViewTextMinWidthDp() {
            Configuration var3 = this.getResources().getConfiguration();
            int var2 = var3.screenWidthDp;
            int var1 = var3.screenHeightDp;
            short var4;
            if (var2 >= 960 && var1 >= 720 && var3.orientation == 2) {
                var4 = 256;
            } else if (var2 < 600 && (var2 < 640 || var1 < 480)) {
                var4 = 160;
            } else {
                var4 = 192;
            }

            return var4;
        }

        private void setImeVisibility(boolean var1) {
            InputMethodManager var2 = (InputMethodManager)this.getContext().getSystemService("input_method");
            if (!var1) {
                this.field_267 = false;
                this.removeCallbacks(this.field_264);
                var2.hideSoftInputFromWindow(this.getWindowToken(), 0);
            } else if (var2.isActive(this)) {
                this.field_267 = false;
                this.removeCallbacks(this.field_264);
                var2.showSoftInput(this, 0);
            } else {
                this.field_267 = true;
            }

        }

        public boolean enoughToFilter() {
            boolean var1;
            if (this.field_265 > 0 && !super.enoughToFilter()) {
                var1 = false;
            } else {
                var1 = true;
            }

            return var1;
        }

        public InputConnection onCreateInputConnection(EditorInfo var1) {
            InputConnection var2 = super.onCreateInputConnection(var1);
            if (this.field_267) {
                this.removeCallbacks(this.field_264);
                this.post(this.field_264);
            }

            return var2;
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics var1 = this.getResources().getDisplayMetrics();
            this.setMinWidth((int)TypedValue.applyDimension(1, (float)this.getSearchViewTextMinWidthDp(), var1));
        }

        protected void onFocusChanged(boolean var1, int var2, Rect var3) {
            super.onFocusChanged(var1, var2, var3);
            this.field_266.method_289();
        }

        public boolean onKeyPreIme(int var1, KeyEvent var2) {
            boolean var4 = true;
            boolean var3;
            if (var1 == 4) {
                DispatcherState var5;
                if (var2.getAction() == 0 && var2.getRepeatCount() == 0) {
                    var5 = this.getKeyDispatcherState();
                    var3 = var4;
                    if (var5 != null) {
                        var5.startTracking(var2, this);
                        var3 = var4;
                    }

                    return var3;
                }

                if (var2.getAction() == 1) {
                    var5 = this.getKeyDispatcherState();
                    if (var5 != null) {
                        var5.handleUpEvent(var2);
                    }

                    if (var2.isTracking() && !var2.isCanceled()) {
                        this.field_266.clearFocus();
                        this.setImeVisibility(false);
                        var3 = var4;
                        return var3;
                    }
                }
            }

            var3 = super.onKeyPreIme(var1, var2);
            return var3;
        }

        public void onWindowFocusChanged(boolean var1) {
            super.onWindowFocusChanged(var1);
            if (var1 && this.field_266.hasFocus() && this.getVisibility() == 0) {
                this.field_267 = true;
                if (SearchView.method_270(this.getContext())) {
                    SearchView.field_153.method_1331(this, true);
                }
            }

        }

        public void performCompletion() {
        }

        protected void replaceText(CharSequence var1) {
        }

        void setSearchView(SearchView var1) {
            this.field_266 = var1;
        }

        public void setThreshold(int var1) {
            super.setThreshold(var1);
            this.field_265 = var1;
        }
    }

    private static class class_265 {
        // $FF: renamed from: a java.lang.reflect.Method
        private Method field_1199;
        // $FF: renamed from: b java.lang.reflect.Method
        private Method field_1200;
        // $FF: renamed from: c java.lang.reflect.Method
        private Method field_1201;

        class_265() {
            try {
                this.field_1199 = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged");
                this.field_1199.setAccessible(true);
            } catch (NoSuchMethodException var4) {
                ;
            }

            try {
                this.field_1200 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged");
                this.field_1200.setAccessible(true);
            } catch (NoSuchMethodException var3) {
                ;
            }

            try {
                this.field_1201 = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.field_1201.setAccessible(true);
            } catch (NoSuchMethodException var2) {
                ;
            }

        }

        // $FF: renamed from: a (android.widget.AutoCompleteTextView) void
        void method_1330(AutoCompleteTextView var1) {
            if (this.field_1199 != null) {
                try {
                    this.field_1199.invoke(var1);
                } catch (Exception var2) {
                    ;
                }
            }

        }

        // $FF: renamed from: a (android.widget.AutoCompleteTextView, boolean) void
        void method_1331(AutoCompleteTextView var1, boolean var2) {
            if (this.field_1201 != null) {
                try {
                    this.field_1201.invoke(var1, var2);
                } catch (Exception var3) {
                    ;
                }
            }

        }

        // $FF: renamed from: b (android.widget.AutoCompleteTextView) void
        void method_1332(AutoCompleteTextView var1) {
            if (this.field_1200 != null) {
                try {
                    this.field_1200.invoke(var1);
                } catch (Exception var2) {
                    ;
                }
            }

        }
    }

    public interface class_266 {
        // $FF: renamed from: a () boolean
        boolean method_154();
    }

    public interface class_267 {
        // $FF: renamed from: a (java.lang.String) boolean
        boolean method_155(String var1);
    }

    public interface class_268 {
    }

    static class class_255 extends class_89 {
        public static final Creator CREATOR = new ClassLoaderCreator() {
            // $FF: renamed from: a (android.os.Parcel) android.support.v7.widget.SearchView$e
            public SearchView.class_255 method_443(Parcel var1) {
                return new SearchView.class_255(var1, (ClassLoader)null);
            }

            // $FF: renamed from: a (android.os.Parcel, java.lang.ClassLoader) android.support.v7.widget.SearchView$e
            public SearchView.class_255 method_444(Parcel var1, ClassLoader var2) {
                return new SearchView.class_255(var1, var2);
            }

            // $FF: renamed from: a (int) android.support.v7.widget.SearchView$e[]
            public SearchView.class_255[] method_445(int var1) {
                return new SearchView.class_255[var1];
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1) {
                return this.method_443(var1);
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1, ClassLoader var2) {
                return this.method_444(var1, var2);
            }

            // $FF: synthetic method
            public Object[] newArray(int var1) {
                return this.method_445(var1);
            }
        };
        // $FF: renamed from: b boolean
        boolean field_757;

        public class_255(Parcel var1, ClassLoader var2) {
            super(var1, var2);
            this.field_757 = (Boolean)var1.readValue((ClassLoader)null);
        }

        class_255(Parcelable var1) {
            super(var1);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.field_757 + "}";
        }

        public void writeToParcel(Parcel var1, int var2) {
            super.writeToParcel(var1, var2);
            var1.writeValue(this.field_757);
        }
    }

    private static class class_269 extends TouchDelegate {
        // $FF: renamed from: a android.view.View
        private final View field_1277;
        // $FF: renamed from: b android.graphics.Rect
        private final Rect field_1278;
        // $FF: renamed from: c android.graphics.Rect
        private final Rect field_1279;
        // $FF: renamed from: d android.graphics.Rect
        private final Rect field_1280;
        // $FF: renamed from: e int
        private final int field_1281;
        // $FF: renamed from: f boolean
        private boolean field_1282;

        public class_269(Rect var1, Rect var2, View var3) {
            super(var1, var3);
            this.field_1281 = ViewConfiguration.get(var3.getContext()).getScaledTouchSlop();
            this.field_1278 = new Rect();
            this.field_1280 = new Rect();
            this.field_1279 = new Rect();
            this.method_1409(var1, var2);
            this.field_1277 = var3;
        }

        // $FF: renamed from: a (android.graphics.Rect, android.graphics.Rect) void
        public void method_1409(Rect var1, Rect var2) {
            this.field_1278.set(var1);
            this.field_1280.set(var1);
            this.field_1280.inset(-this.field_1281, -this.field_1281);
            this.field_1279.set(var2);
        }

        public boolean onTouchEvent(MotionEvent var1) {
            boolean var5 = true;
            boolean var6 = false;
            int var4 = (int)var1.getX();
            int var3 = (int)var1.getY();
            boolean var2;
            switch(var1.getAction()) {
            case 0:
                if (this.field_1278.contains(var4, var3)) {
                    this.field_1282 = true;
                    var2 = true;
                    break;
                }
            default:
                var2 = true;
                var5 = false;
                break;
            case 1:
            case 2:
                var5 = this.field_1282;
                if (var5 && !this.field_1280.contains(var4, var3)) {
                    var2 = false;
                } else {
                    var2 = true;
                }
                break;
            case 3:
                var5 = this.field_1282;
                this.field_1282 = false;
                var2 = true;
            }

            if (var5) {
                if (var2 && !this.field_1279.contains(var4, var3)) {
                    var1.setLocation((float)(this.field_1277.getWidth() / 2), (float)(this.field_1277.getHeight() / 2));
                } else {
                    var1.setLocation((float)(var4 - this.field_1279.left), (float)(var3 - this.field_1279.top));
                }

                var6 = this.field_1277.dispatchTouchEvent(var1);
            }

            return var6;
        }
    }
}
