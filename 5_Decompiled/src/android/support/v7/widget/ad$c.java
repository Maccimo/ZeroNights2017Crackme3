package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.a$b;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;

class ad$c extends class_31 {
    // $FF: renamed from: a android.support.v7.widget.ad
    // $FF: synthetic field
    final class_93 field_147;
    // $FF: renamed from: b int[]
    private final int[] field_148;
    // $FF: renamed from: c android.support.v7.app.a$b
    private a$b field_149;
    // $FF: renamed from: d android.widget.TextView
    private TextView field_150;
    // $FF: renamed from: e android.widget.ImageView
    private ImageView field_151;
    // $FF: renamed from: f android.view.View
    private View field_152;

    public ad$c(class_93 var1, Context var2, a$b var3, boolean var4) {
        super(var2, (AttributeSet)null, android.support.v7.a.a$a.actionBarTabStyle);
        this.field_147 = var1;
        this.field_148 = new int[]{16842964};
        this.field_149 = var3;
        class_97 var5 = class_97.method_867(var2, (AttributeSet)null, this.field_148, android.support.v7.a.a$a.actionBarTabStyle, 0);
        if (var5.method_883(0)) {
            this.setBackgroundDrawable(var5.method_871(0));
        }

        var5.method_872();
        if (var4) {
            this.setGravity(8388627);
        }

        this.method_260();
    }

    // $FF: renamed from: a () void
    public void method_260() {
        a$b var2 = this.field_149;
        View var3 = var2.method_578();
        if (var3 != null) {
            ViewParent var7 = var3.getParent();
            if (var7 != this) {
                if (var7 != null) {
                    ((ViewGroup)var7).removeView(var3);
                }

                this.addView(var3);
            }

            this.field_152 = var3;
            if (this.field_150 != null) {
                this.field_150.setVisibility(8);
            }

            if (this.field_151 != null) {
                this.field_151.setVisibility(8);
                this.field_151.setImageDrawable((Drawable)null);
            }
        } else {
            if (this.field_152 != null) {
                this.removeView(this.field_152);
                this.field_152 = null;
            }

            Drawable var4 = var2.method_576();
            CharSequence var9 = var2.method_577();
            if (var4 != null) {
                if (this.field_151 == null) {
                    AppCompatImageView var5 = new AppCompatImageView(this.getContext());
                    w$a var6 = new w$a(-2, -2);
                    var6.field_342 = 16;
                    var5.setLayoutParams(var6);
                    this.addView(var5, 0);
                    this.field_151 = var5;
                }

                this.field_151.setImageDrawable(var4);
                this.field_151.setVisibility(0);
            } else if (this.field_151 != null) {
                this.field_151.setVisibility(8);
                this.field_151.setImageDrawable((Drawable)null);
            }

            boolean var1;
            if (!TextUtils.isEmpty(var9)) {
                var1 = true;
            } else {
                var1 = false;
            }

            if (var1) {
                if (this.field_150 == null) {
                    class_63 var10 = new class_63(this.getContext(), (AttributeSet)null, android.support.v7.a.a$a.actionBarTabTextStyle);
                    var10.setEllipsize(TruncateAt.END);
                    w$a var11 = new w$a(-2, -2);
                    var11.field_342 = 16;
                    var10.setLayoutParams(var11);
                    this.addView(var10);
                    this.field_150 = var10;
                }

                this.field_150.setText(var9);
                this.field_150.setVisibility(0);
            } else if (this.field_150 != null) {
                this.field_150.setVisibility(8);
                this.field_150.setText((CharSequence)null);
            }

            if (this.field_151 != null) {
                this.field_151.setContentDescription(var2.method_580());
            }

            CharSequence var8;
            if (var1) {
                var8 = null;
            } else {
                var8 = var2.method_580();
            }

            class_100.method_885(this, var8);
        }

    }

    // $FF: renamed from: a (android.support.v7.app.a$b) void
    public void method_261(a$b var1) {
        this.field_149 = var1;
        this.method_260();
    }

    // $FF: renamed from: b () android.support.v7.app.a$b
    public a$b method_262() {
        return this.field_149;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
        super.onInitializeAccessibilityEvent(var1);
        var1.setClassName(a$b.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
        super.onInitializeAccessibilityNodeInfo(var1);
        var1.setClassName(a$b.class.getName());
    }

    public void onMeasure(int var1, int var2) {
        super.onMeasure(var1, var2);
        if (this.field_147.field_806 > 0 && this.getMeasuredWidth() > this.field_147.field_806) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(this.field_147.field_806, 1073741824), var2);
        }

    }

    public void setSelected(boolean var1) {
        boolean var2;
        if (this.isSelected() != var1) {
            var2 = true;
        } else {
            var2 = false;
        }

        super.setSelected(var1);
        if (var2 && var1) {
            this.sendAccessibilityEvent(4);
        }

    }
}
