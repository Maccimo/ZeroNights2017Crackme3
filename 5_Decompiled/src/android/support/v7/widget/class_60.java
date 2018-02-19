package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a$j;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

// $FF: renamed from: android.support.v7.widget.n
class class_60 {
    // $FF: renamed from: a android.widget.TextView
    final TextView field_559;
    // $FF: renamed from: b android.support.v7.widget.ai
    private class_95 field_560;
    // $FF: renamed from: c android.support.v7.widget.ai
    private class_95 field_561;
    // $FF: renamed from: d android.support.v7.widget.ai
    private class_95 field_562;
    // $FF: renamed from: e android.support.v7.widget.ai
    private class_95 field_563;
    // $FF: renamed from: f android.support.v7.widget.q
    private final class_64 field_564;
    // $FF: renamed from: g int
    private int field_565 = 0;
    // $FF: renamed from: h android.graphics.Typeface
    private Typeface field_566;

    class_60(TextView var1) {
        this.field_559 = var1;
        this.field_564 = new class_64(this.field_559);
    }

    // $FF: renamed from: a (android.content.Context, android.support.v7.widget.h, int) android.support.v7.widget.ai
    protected static class_95 method_589(Context var0, class_74 var1, int var2) {
        ColorStateList var4 = var1.method_738(var0, var2);
        class_95 var3;
        if (var4 != null) {
            var3 = new class_95();
            var3.field_827 = true;
            var3.field_824 = var4;
        } else {
            var3 = null;
        }

        return var3;
    }

    // $FF: renamed from: a (android.widget.TextView) android.support.v7.widget.n
    static class_60 method_590(TextView var0) {
        Object var1;
        if (VERSION.SDK_INT >= 17) {
            var1 = new class_61(var0);
        } else {
            var1 = new class_60(var0);
        }

        return (class_60)var1;
    }

    // $FF: renamed from: a (android.content.Context, android.support.v7.widget.ak) void
    private void method_591(Context var1, class_97 var2) {
        this.field_565 = var2.method_869(a$j.TextAppearance_android_textStyle, this.field_565);
        if (var2.method_883(a$j.TextAppearance_android_fontFamily) || var2.method_883(a$j.TextAppearance_fontFamily)) {
            this.field_566 = null;
            int var3;
            if (var2.method_883(a$j.TextAppearance_android_fontFamily)) {
                var3 = a$j.TextAppearance_android_fontFamily;
            } else {
                var3 = a$j.TextAppearance_fontFamily;
            }

            if (!var1.isRestricted()) {
                try {
                    this.field_566 = var2.method_870(var3, this.field_565, this.field_559);
                } catch (UnsupportedOperationException var4) {
                    ;
                } catch (NotFoundException var5) {
                    ;
                }
            }

            if (this.field_566 == null) {
                this.field_566 = Typeface.create(var2.method_877(var3), this.field_565);
            }
        }

    }

    // $FF: renamed from: b (int, float) void
    private void method_592(int var1, float var2) {
        this.field_564.method_633(var1, var2);
    }

    // $FF: renamed from: a () void
    void method_593() {
        if (this.field_560 != null || this.field_561 != null || this.field_562 != null || this.field_563 != null) {
            Drawable[] var1 = this.field_559.getCompoundDrawables();
            this.method_598(var1[0], this.field_560);
            this.method_598(var1[1], this.field_561);
            this.method_598(var1[2], this.field_562);
            this.method_598(var1[3], this.field_563);
        }

    }

    // $FF: renamed from: a (int) void
    void method_594(int var1) {
        this.field_564.method_632(var1);
    }

    // $FF: renamed from: a (int, float) void
    void method_595(int var1, float var2) {
        if (VERSION.SDK_INT < 26 && !this.method_604()) {
            this.method_592(var1, var2);
        }

    }

    // $FF: renamed from: a (int, int, int, int) void
    void method_596(int var1, int var2, int var3, int var4) {
        this.field_564.method_634(var1, var2, var3, var4);
    }

    // $FF: renamed from: a (android.content.Context, int) void
    void method_597(Context var1, int var2) {
        class_97 var4 = class_97.method_865(var1, var2, a$j.TextAppearance);
        if (var4.method_883(a$j.TextAppearance_textAllCaps)) {
            this.method_600(var4.method_873(a$j.TextAppearance_textAllCaps, false));
        }

        if (VERSION.SDK_INT < 23 && var4.method_883(a$j.TextAppearance_android_textColor)) {
            ColorStateList var3 = var4.method_879(a$j.TextAppearance_android_textColor);
            if (var3 != null) {
                this.field_559.setTextColor(var3);
            }
        }

        this.method_591(var1, var4);
        var4.method_872();
        if (this.field_566 != null) {
            this.field_559.setTypeface(this.field_566, this.field_565);
        }

    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, android.support.v7.widget.ai) void
    final void method_598(Drawable var1, class_95 var2) {
        if (var1 != null && var2 != null) {
            class_74.method_720(var1, var2, this.field_559.getDrawableState());
        }

    }

    // $FF: renamed from: a (android.util.AttributeSet, int) void
    void method_599(AttributeSet var1, int var2) {
        ColorStateList var10 = null;
        Context var13 = this.field_559.getContext();
        class_74 var9 = class_74.method_717();
        class_97 var8 = class_97.method_867(var13, var1, a$j.AppCompatTextHelper, var2, 0);
        int var3 = var8.method_884(a$j.AppCompatTextHelper_android_textAppearance, -1);
        if (var8.method_883(a$j.AppCompatTextHelper_android_drawableLeft)) {
            this.field_560 = method_589(var13, var9, var8.method_884(a$j.AppCompatTextHelper_android_drawableLeft, 0));
        }

        if (var8.method_883(a$j.AppCompatTextHelper_android_drawableTop)) {
            this.field_561 = method_589(var13, var9, var8.method_884(a$j.AppCompatTextHelper_android_drawableTop, 0));
        }

        if (var8.method_883(a$j.AppCompatTextHelper_android_drawableRight)) {
            this.field_562 = method_589(var13, var9, var8.method_884(a$j.AppCompatTextHelper_android_drawableRight, 0));
        }

        if (var8.method_883(a$j.AppCompatTextHelper_android_drawableBottom)) {
            this.field_563 = method_589(var13, var9, var8.method_884(a$j.AppCompatTextHelper_android_drawableBottom, 0));
        }

        var8.method_872();
        boolean var7 = this.field_559.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean var5;
        ColorStateList var11;
        boolean var16;
        ColorStateList var17;
        ColorStateList var18;
        ColorStateList var19;
        if (var3 != -1) {
            class_97 var12 = class_97.method_865(var13, var3, a$j.TextAppearance);
            if (!var7 && var12.method_883(a$j.TextAppearance_textAllCaps)) {
                var5 = var12.method_873(a$j.TextAppearance_textAllCaps, false);
                var16 = true;
            } else {
                var16 = false;
                var5 = false;
            }

            this.method_591(var13, var12);
            if (VERSION.SDK_INT < 23) {
                if (var12.method_883(a$j.TextAppearance_android_textColor)) {
                    var17 = var12.method_879(a$j.TextAppearance_android_textColor);
                } else {
                    var17 = null;
                }

                if (var12.method_883(a$j.TextAppearance_android_textColorHint)) {
                    var10 = var12.method_879(a$j.TextAppearance_android_textColorHint);
                } else {
                    var10 = null;
                }

                if (var12.method_883(a$j.TextAppearance_android_textColorLink)) {
                    var11 = var12.method_879(a$j.TextAppearance_android_textColorLink);
                    var18 = var17;
                    var17 = var11;
                } else {
                    var18 = var17;
                    var17 = null;
                }
            } else {
                var10 = null;
                var18 = null;
                var17 = null;
            }

            var12.method_872();
            var11 = var10;
            var19 = var18;
            var10 = var17;
            var18 = var11;
            var17 = var19;
        } else {
            var18 = null;
            var17 = null;
            var16 = false;
            var5 = false;
        }

        class_97 var14 = class_97.method_867(var13, var1, a$j.TextAppearance, var2, 0);
        boolean var6 = var5;
        boolean var4 = var16;
        if (!var7) {
            var6 = var5;
            var4 = var16;
            if (var14.method_883(a$j.TextAppearance_textAllCaps)) {
                var6 = var14.method_873(a$j.TextAppearance_textAllCaps, false);
                var4 = true;
            }
        }

        label93: {
            var11 = var17;
            var19 = var18;
            if (VERSION.SDK_INT < 23) {
                if (var14.method_883(a$j.TextAppearance_android_textColor)) {
                    var17 = var14.method_879(a$j.TextAppearance_android_textColor);
                }

                if (var14.method_883(a$j.TextAppearance_android_textColorHint)) {
                    var18 = var14.method_879(a$j.TextAppearance_android_textColorHint);
                }

                var11 = var17;
                var19 = var18;
                if (var14.method_883(a$j.TextAppearance_android_textColorLink)) {
                    var10 = var14.method_879(a$j.TextAppearance_android_textColorLink);
                    var19 = var18;
                    var18 = var10;
                    break label93;
                }
            }

            var18 = var10;
            var17 = var11;
        }

        this.method_591(var13, var14);
        var14.method_872();
        if (var17 != null) {
            this.field_559.setTextColor(var17);
        }

        if (var19 != null) {
            this.field_559.setHintTextColor(var19);
        }

        if (var18 != null) {
            this.field_559.setLinkTextColor(var18);
        }

        if (!var7 && var4) {
            this.method_600(var6);
        }

        if (this.field_566 != null) {
            this.field_559.setTypeface(this.field_566, this.field_565);
        }

        this.field_564.method_635(var1, var2);
        if (VERSION.SDK_INT >= 26 && this.field_564.method_631() != 0) {
            int[] var15 = this.field_564.method_640();
            if (var15.length > 0) {
                if ((float)this.field_559.getAutoSizeStepGranularity() != -1.0F) {
                    this.field_559.setAutoSizeTextTypeUniformWithConfiguration(this.field_564.method_638(), this.field_564.method_639(), this.field_564.method_637(), 0);
                } else {
                    this.field_559.setAutoSizeTextTypeUniformWithPresetSizes(var15, 0);
                }
            }
        }

    }

    // $FF: renamed from: a (boolean) void
    void method_600(boolean var1) {
        this.field_559.setAllCaps(var1);
    }

    // $FF: renamed from: a (boolean, int, int, int, int) void
    void method_601(boolean var1, int var2, int var3, int var4, int var5) {
        if (VERSION.SDK_INT < 26) {
            this.method_603();
        }

    }

    // $FF: renamed from: a (int[], int) void
    void method_602(int[] var1, int var2) {
        this.field_564.method_636(var1, var2);
    }

    // $FF: renamed from: b () void
    void method_603() {
        this.field_564.method_641();
    }

    // $FF: renamed from: c () boolean
    boolean method_604() {
        return this.field_564.method_642();
    }

    // $FF: renamed from: d () int
    int method_605() {
        return this.field_564.method_631();
    }

    // $FF: renamed from: e () int
    int method_606() {
        return this.field_564.method_637();
    }

    // $FF: renamed from: f () int
    int method_607() {
        return this.field_564.method_638();
    }

    // $FF: renamed from: g () int
    int method_608() {
        return this.field_564.method_639();
    }

    // $FF: renamed from: h () int[]
    int[] method_609() {
        return this.field_564.method_640();
    }
}
