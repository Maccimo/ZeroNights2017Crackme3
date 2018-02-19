package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.v7.a.a$j;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.Layout.Alignment;
import android.text.StaticLayout.Builder;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

// $FF: renamed from: android.support.v7.widget.q
class class_64 {
    // $FF: renamed from: a android.graphics.RectF
    private static final RectF field_591 = new RectF();
    // $FF: renamed from: b java.util.Hashtable
    private static Hashtable field_592 = new Hashtable();
    // $FF: renamed from: c int
    private int field_593 = 0;
    // $FF: renamed from: d boolean
    private boolean field_594 = false;
    // $FF: renamed from: e float
    private float field_595 = -1.0F;
    // $FF: renamed from: f float
    private float field_596 = -1.0F;
    // $FF: renamed from: g float
    private float field_597 = -1.0F;
    // $FF: renamed from: h int[]
    private int[] field_598 = new int[0];
    // $FF: renamed from: i boolean
    private boolean field_599 = false;
    // $FF: renamed from: j android.text.TextPaint
    private TextPaint field_600;
    // $FF: renamed from: k android.widget.TextView
    private final TextView field_601;
    // $FF: renamed from: l android.content.Context
    private final Context field_602;

    class_64(TextView var1) {
        this.field_601 = var1;
        this.field_602 = this.field_601.getContext();
    }

    // $FF: renamed from: a (android.graphics.RectF) int
    private int method_617(RectF var1) {
        int var4 = this.field_598.length;
        if (var4 == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        } else {
            int var2 = 0;
            int var3 = 1;
            --var4;

            while(var3 <= var4) {
                var2 = (var3 + var4) / 2;
                if (this.method_625(this.field_598[var2], var1)) {
                    int var5 = var2 + 1;
                    var2 = var3;
                    var3 = var5;
                } else {
                    var4 = var2 - 1;
                    var2 = var4;
                }
            }

            return this.field_598[var2];
        }
    }

    // $FF: renamed from: a (java.lang.CharSequence, android.text.Layout.Alignment, int) android.text.StaticLayout
    @TargetApi(14)
    private StaticLayout method_618(CharSequence var1, Alignment var2, int var3) {
        float var4;
        float var5;
        boolean var6;
        if (VERSION.SDK_INT >= 16) {
            var4 = this.field_601.getLineSpacingMultiplier();
            var5 = this.field_601.getLineSpacingExtra();
            var6 = this.field_601.getIncludeFontPadding();
        } else {
            var4 = (Float)this.method_620(this.field_601, "getLineSpacingMultiplier", 1.0F);
            var5 = (Float)this.method_620(this.field_601, "getLineSpacingExtra", 0.0F);
            var6 = (Boolean)this.method_620(this.field_601, "getIncludeFontPadding", true);
        }

        return new StaticLayout(var1, this.field_600, var3, var2, var4, var5, var6);
    }

    // $FF: renamed from: a (java.lang.CharSequence, android.text.Layout.Alignment, int, int) android.text.StaticLayout
    @TargetApi(23)
    private StaticLayout method_619(CharSequence var1, Alignment var2, int var3, int var4) {
        TextDirectionHeuristic var5 = (TextDirectionHeuristic)this.method_620(this.field_601, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        Builder var6 = Builder.obtain(var1, 0, var1.length(), this.field_600, var3).setAlignment(var2).setLineSpacing(this.field_601.getLineSpacingExtra(), this.field_601.getLineSpacingMultiplier()).setIncludePad(this.field_601.getIncludeFontPadding()).setBreakStrategy(this.field_601.getBreakStrategy()).setHyphenationFrequency(this.field_601.getHyphenationFrequency());
        var3 = var4;
        if (var4 == -1) {
            var3 = Integer.MAX_VALUE;
        }

        return var6.setMaxLines(var3).setTextDirection(var5).build();
    }

    // $FF: renamed from: a (java.lang.Object, java.lang.String, java.lang.Object) java.lang.Object
    private Object method_620(Object param1, String param2, Object param3) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (java.lang.String) java.lang.reflect.Method
    private Method method_621(String param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (float) void
    private void method_622(float param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (float, float, float) void
    private void method_623(float var1, float var2, float var3) {
        if (var1 <= 0.0F) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + var1 + "px) is less or equal to (0px)");
        } else if (var2 <= var1) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + var2 + "px) is less or equal to minimum auto-size " + "text size (" + var1 + "px)");
        } else if (var3 <= 0.0F) {
            throw new IllegalArgumentException("The auto-size step granularity (" + var3 + "px) is less or equal to (0px)");
        } else {
            this.field_593 = 1;
            this.field_596 = var1;
            this.field_597 = var2;
            this.field_595 = var3;
            this.field_599 = false;
        }
    }

    // $FF: renamed from: a (android.content.res.TypedArray) void
    private void method_624(TypedArray var1) {
        int var3 = var1.length();
        int[] var4 = new int[var3];
        if (var3 > 0) {
            for(int var2 = 0; var2 < var3; ++var2) {
                var4[var2] = var1.getDimensionPixelSize(var2, -1);
            }

            this.field_598 = this.method_626(var4);
            this.method_627();
        }

    }

    // $FF: renamed from: a (int, android.graphics.RectF) boolean
    private boolean method_625(int var1, RectF var2) {
        CharSequence var6 = this.field_601.getText();
        int var3;
        if (VERSION.SDK_INT >= 16) {
            var3 = this.field_601.getMaxLines();
        } else {
            var3 = -1;
        }

        if (this.field_600 == null) {
            this.field_600 = new TextPaint();
        } else {
            this.field_600.reset();
        }

        this.field_600.set(this.field_601.getPaint());
        this.field_600.setTextSize((float)var1);
        Alignment var5 = (Alignment)this.method_620(this.field_601, "getLayoutAlignment", Alignment.ALIGN_NORMAL);
        StaticLayout var7;
        if (VERSION.SDK_INT >= 23) {
            var7 = this.method_619(var6, var5, Math.round(var2.right), var3);
        } else {
            var7 = this.method_618(var6, var5, Math.round(var2.right));
        }

        boolean var4;
        if (var3 != -1 && (var7.getLineCount() > var3 || var7.getLineEnd(var7.getLineCount() - 1) != var6.length())) {
            var4 = false;
        } else if ((float)var7.getHeight() > var2.bottom) {
            var4 = false;
        } else {
            var4 = true;
        }

        return var4;
    }

    // $FF: renamed from: a (int[]) int[]
    private int[] method_626(int[] var1) {
        int var3 = var1.length;
        if (var3 != 0) {
            Arrays.sort(var1);
            ArrayList var6 = new ArrayList();

            int var2;
            for(var2 = 0; var2 < var3; ++var2) {
                int var4 = var1[var2];
                if (var4 > 0 && Collections.binarySearch(var6, var4) < 0) {
                    var6.add(var4);
                }
            }

            if (var3 != var6.size()) {
                var3 = var6.size();
                int[] var5 = new int[var3];
                var2 = 0;

                while(true) {
                    var1 = var5;
                    if (var2 >= var3) {
                        break;
                    }

                    var5[var2] = (Integer)var6.get(var2);
                    ++var2;
                }
            }
        }

        return var1;
    }

    // $FF: renamed from: h () boolean
    private boolean method_627() {
        int var1 = this.field_598.length;
        boolean var2;
        if (var1 > 0) {
            var2 = true;
        } else {
            var2 = false;
        }

        this.field_599 = var2;
        if (this.field_599) {
            this.field_593 = 1;
            this.field_596 = (float)this.field_598[0];
            this.field_597 = (float)this.field_598[var1 - 1];
            this.field_595 = -1.0F;
        }

        return this.field_599;
    }

    // $FF: renamed from: i () boolean
    private boolean method_628() {
        if (this.method_630() && this.field_593 == 1) {
            if (!this.field_599 || this.field_598.length == 0) {
                float var1 = (float)Math.round(this.field_596);

                int var2;
                for(var2 = 1; Math.round(this.field_595 + var1) <= Math.round(this.field_597); var1 += this.field_595) {
                    ++var2;
                }

                int[] var4 = new int[var2];
                var1 = this.field_596;

                for(int var3 = 0; var3 < var2; ++var3) {
                    var4[var3] = Math.round(var1);
                    var1 += this.field_595;
                }

                this.field_598 = this.method_626(var4);
            }

            this.field_594 = true;
        } else {
            this.field_594 = false;
        }

        return this.field_594;
    }

    // $FF: renamed from: j () void
    private void method_629() {
        this.field_593 = 0;
        this.field_596 = -1.0F;
        this.field_597 = -1.0F;
        this.field_595 = -1.0F;
        this.field_598 = new int[0];
        this.field_594 = false;
    }

    // $FF: renamed from: k () boolean
    private boolean method_630() {
        boolean var1;
        if (!(this.field_601 instanceof class_77)) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: a () int
    int method_631() {
        return this.field_593;
    }

    // $FF: renamed from: a (int) void
    void method_632(int var1) {
        if (this.method_630()) {
            switch(var1) {
            case 0:
                this.method_629();
                break;
            case 1:
                DisplayMetrics var2 = this.field_602.getResources().getDisplayMetrics();
                this.method_623(TypedValue.applyDimension(2, 12.0F, var2), TypedValue.applyDimension(2, 112.0F, var2), 1.0F);
                if (this.method_628()) {
                    this.method_641();
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown auto-size text type: " + var1);
            }
        }

    }

    // $FF: renamed from: a (int, float) void
    void method_633(int var1, float var2) {
        Resources var3;
        if (this.field_602 == null) {
            var3 = Resources.getSystem();
        } else {
            var3 = this.field_602.getResources();
        }

        this.method_622(TypedValue.applyDimension(var1, var2, var3.getDisplayMetrics()));
    }

    // $FF: renamed from: a (int, int, int, int) void
    void method_634(int var1, int var2, int var3, int var4) {
        if (this.method_630()) {
            DisplayMetrics var5 = this.field_602.getResources().getDisplayMetrics();
            this.method_623(TypedValue.applyDimension(var4, (float)var1, var5), TypedValue.applyDimension(var4, (float)var2, var5), TypedValue.applyDimension(var4, (float)var3, var5));
            if (this.method_628()) {
                this.method_641();
            }
        }

    }

    // $FF: renamed from: a (android.util.AttributeSet, int) void
    void method_635(AttributeSet var1, int var2) {
        TypedArray var8 = this.field_602.obtainStyledAttributes(var1, a$j.AppCompatTextView, var2, 0);
        if (var8.hasValue(a$j.AppCompatTextView_autoSizeTextType)) {
            this.field_593 = var8.getInt(a$j.AppCompatTextView_autoSizeTextType, 0);
        }

        float var3;
        if (var8.hasValue(a$j.AppCompatTextView_autoSizeStepGranularity)) {
            var3 = var8.getDimension(a$j.AppCompatTextView_autoSizeStepGranularity, -1.0F);
        } else {
            var3 = -1.0F;
        }

        float var5;
        if (var8.hasValue(a$j.AppCompatTextView_autoSizeMinTextSize)) {
            var5 = var8.getDimension(a$j.AppCompatTextView_autoSizeMinTextSize, -1.0F);
        } else {
            var5 = -1.0F;
        }

        float var4;
        if (var8.hasValue(a$j.AppCompatTextView_autoSizeMaxTextSize)) {
            var4 = var8.getDimension(a$j.AppCompatTextView_autoSizeMaxTextSize, -1.0F);
        } else {
            var4 = -1.0F;
        }

        if (var8.hasValue(a$j.AppCompatTextView_autoSizePresetSizes)) {
            var2 = var8.getResourceId(a$j.AppCompatTextView_autoSizePresetSizes, 0);
            if (var2 > 0) {
                TypedArray var7 = var8.getResources().obtainTypedArray(var2);
                this.method_624(var7);
                var7.recycle();
            }
        }

        var8.recycle();
        if (this.method_630()) {
            if (this.field_593 == 1) {
                if (!this.field_599) {
                    DisplayMetrics var9 = this.field_602.getResources().getDisplayMetrics();
                    float var6 = var5;
                    if (var5 == -1.0F) {
                        var6 = TypedValue.applyDimension(2, 12.0F, var9);
                    }

                    var5 = var4;
                    if (var4 == -1.0F) {
                        var5 = TypedValue.applyDimension(2, 112.0F, var9);
                    }

                    var4 = var3;
                    if (var3 == -1.0F) {
                        var4 = 1.0F;
                    }

                    this.method_623(var6, var5, var4);
                }

                this.method_628();
            }
        } else {
            this.field_593 = 0;
        }

    }

    // $FF: renamed from: a (int[], int) void
    void method_636(int[] var1, int var2) {
        int var3 = 0;
        if (this.method_630()) {
            int var4 = var1.length;
            if (var4 <= 0) {
                this.field_599 = false;
            } else {
                int[] var6 = new int[var4];
                int[] var5;
                if (var2 == 0) {
                    var5 = Arrays.copyOf(var1, var4);
                } else {
                    DisplayMetrics var7 = this.field_602.getResources().getDisplayMetrics();

                    while(true) {
                        var5 = var6;
                        if (var3 >= var4) {
                            break;
                        }

                        var6[var3] = Math.round(TypedValue.applyDimension(var2, (float)var1[var3], var7));
                        ++var3;
                    }
                }

                this.field_598 = this.method_626(var5);
                if (!this.method_627()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(var1));
                }
            }

            if (this.method_628()) {
                this.method_641();
            }
        }

    }

    // $FF: renamed from: b () int
    int method_637() {
        return Math.round(this.field_595);
    }

    // $FF: renamed from: c () int
    int method_638() {
        return Math.round(this.field_596);
    }

    // $FF: renamed from: d () int
    int method_639() {
        return Math.round(this.field_597);
    }

    // $FF: renamed from: e () int[]
    int[] method_640() {
        return this.field_598;
    }

    // $FF: renamed from: f () void
    void method_641() {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: g () boolean
    boolean method_642() {
        boolean var1;
        if (this.method_630() && this.field_593 != 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }
}
