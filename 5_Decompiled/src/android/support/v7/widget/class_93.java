package android.support.v7.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.app.a$b;
import android.support.v7.view.class_159;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

// $FF: renamed from: android.support.v7.widget.ad
public class class_93 extends HorizontalScrollView implements OnItemSelectedListener {
    // $FF: renamed from: j android.view.animation.Interpolator
    private static final Interpolator field_803 = new DecelerateInterpolator();
    // $FF: renamed from: a java.lang.Runnable
    Runnable field_804;
    // $FF: renamed from: b android.support.v7.widget.w
    class_31 field_805;
    // $FF: renamed from: c int
    int field_806;
    // $FF: renamed from: d int
    int field_807;
    // $FF: renamed from: e android.support.v7.widget.ad$b
    private ad$b field_808;
    // $FF: renamed from: f android.widget.Spinner
    private Spinner field_809;
    // $FF: renamed from: g boolean
    private boolean field_810;
    // $FF: renamed from: h int
    private int field_811;
    // $FF: renamed from: i int
    private int field_812;

    // $FF: renamed from: a () boolean
    private boolean method_851() {
        boolean var1;
        if (this.field_809 != null && this.field_809.getParent() == this) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: b () void
    private void method_852() {
        if (!this.method_851()) {
            if (this.field_809 == null) {
                this.field_809 = this.method_854();
            }

            this.removeView(this.field_805);
            this.addView(this.field_809, new LayoutParams(-2, -1));
            if (this.field_809.getAdapter() == null) {
                this.field_809.setAdapter(new ad$a(this));
            }

            if (this.field_804 != null) {
                this.removeCallbacks(this.field_804);
                this.field_804 = null;
            }

            this.field_809.setSelection(this.field_812);
        }

    }

    // $FF: renamed from: c () boolean
    private boolean method_853() {
        if (this.method_851()) {
            this.removeView(this.field_809);
            this.addView(this.field_805, new LayoutParams(-2, -1));
            this.setTabSelected(this.field_809.getSelectedItemPosition());
        }

        return false;
    }

    // $FF: renamed from: d () android.widget.Spinner
    private Spinner method_854() {
        class_62 var1 = new class_62(this.getContext(), (AttributeSet)null, android.support.v7.a.a$a.actionDropDownStyle);
        var1.setLayoutParams(new w$a(-2, -1));
        var1.setOnItemSelectedListener(this);
        return var1;
    }

    // $FF: renamed from: a (android.support.v7.app.a$b, boolean) android.support.v7.widget.ad$c
    ad$c method_855(a$b var1, boolean var2) {
        ad$c var3 = new ad$c(this, this.getContext(), var1, var2);
        if (var2) {
            var3.setBackgroundDrawable((Drawable)null);
            var3.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, this.field_811));
        } else {
            var3.setFocusable(true);
            if (this.field_808 == null) {
                this.field_808 = new ad$b(this);
            }

            var3.setOnClickListener(this.field_808);
        }

        return var3;
    }

    // $FF: renamed from: a (int) void
    public void method_856(int var1) {
        final View var2 = this.field_805.getChildAt(var1);
        if (this.field_804 != null) {
            this.removeCallbacks(this.field_804);
        }

        this.field_804 = new Runnable() {
            public void run() {
                int var1 = var2.getLeft();
                int var2x = (class_93.this.getWidth() - var2.getWidth()) / 2;
                class_93.this.smoothScrollTo(var1 - var2x, 0);
                class_93.this.field_804 = null;
            }
        };
        this.post(this.field_804);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.field_804 != null) {
            this.post(this.field_804);
        }

    }

    protected void onConfigurationChanged(Configuration var1) {
        super.onConfigurationChanged(var1);
        class_159 var2 = class_159.method_1320(this.getContext());
        this.setContentHeight(var2.method_1325());
        this.field_807 = var2.method_1326();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.field_804 != null) {
            this.removeCallbacks(this.field_804);
        }

    }

    public void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
        ((ad$c)var2).method_262().method_579();
    }

    public void onMeasure(int var1, int var2) {
        boolean var6 = true;
        int var4 = MeasureSpec.getMode(var1);
        boolean var5;
        if (var4 == 1073741824) {
            var5 = true;
        } else {
            var5 = false;
        }

        this.setFillViewport(var5);
        int var3 = this.field_805.getChildCount();
        if (var3 <= 1 || var4 != 1073741824 && var4 != Integer.MIN_VALUE) {
            this.field_806 = -1;
        } else {
            if (var3 > 2) {
                this.field_806 = (int)((float)MeasureSpec.getSize(var1) * 0.4F);
            } else {
                this.field_806 = MeasureSpec.getSize(var1) / 2;
            }

            this.field_806 = Math.min(this.field_806, this.field_807);
        }

        var3 = MeasureSpec.makeMeasureSpec(this.field_811, 1073741824);
        if (var5 || !this.field_810) {
            var6 = false;
        }

        if (var6) {
            this.field_805.measure(0, var3);
            if (this.field_805.getMeasuredWidth() > MeasureSpec.getSize(var1)) {
                this.method_852();
            } else {
                this.method_853();
            }
        } else {
            this.method_853();
        }

        var2 = this.getMeasuredWidth();
        super.onMeasure(var1, var3);
        var1 = this.getMeasuredWidth();
        if (var5 && var2 != var1) {
            this.setTabSelected(this.field_812);
        }

    }

    public void onNothingSelected(AdapterView var1) {
    }

    public void setAllowCollapse(boolean var1) {
        this.field_810 = var1;
    }

    public void setContentHeight(int var1) {
        this.field_811 = var1;
        this.requestLayout();
    }

    public void setTabSelected(int var1) {
        this.field_812 = var1;
        int var3 = this.field_805.getChildCount();

        for(int var2 = 0; var2 < var3; ++var2) {
            View var5 = this.field_805.getChildAt(var2);
            boolean var4;
            if (var2 == var1) {
                var4 = true;
            } else {
                var4 = false;
            }

            var5.setSelected(var4);
            if (var4) {
                this.method_856(var1);
            }
        }

        if (this.field_809 != null && var1 >= 0) {
            this.field_809.setSelection(var1);
        }

    }
}
