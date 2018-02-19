package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.class_139;
import android.support.v7.b.a.class_39;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

// $FF: renamed from: android.support.v7.widget.ak
public class class_97 {
    // $FF: renamed from: a android.content.Context
    private final Context field_832;
    // $FF: renamed from: b android.content.res.TypedArray
    private final TypedArray field_833;
    // $FF: renamed from: c android.util.TypedValue
    private TypedValue field_834;

    private class_97(Context var1, TypedArray var2) {
        this.field_832 = var1;
        this.field_833 = var2;
    }

    // $FF: renamed from: a (android.content.Context, int, int[]) android.support.v7.widget.ak
    public static class_97 method_865(Context var0, int var1, int[] var2) {
        return new class_97(var0, var0.obtainStyledAttributes(var1, var2));
    }

    // $FF: renamed from: a (android.content.Context, android.util.AttributeSet, int[]) android.support.v7.widget.ak
    public static class_97 method_866(Context var0, AttributeSet var1, int[] var2) {
        return new class_97(var0, var0.obtainStyledAttributes(var1, var2));
    }

    // $FF: renamed from: a (android.content.Context, android.util.AttributeSet, int[], int, int) android.support.v7.widget.ak
    public static class_97 method_867(Context var0, AttributeSet var1, int[] var2, int var3, int var4) {
        return new class_97(var0, var0.obtainStyledAttributes(var1, var2, var3, var4));
    }

    // $FF: renamed from: a (int, float) float
    public float method_868(int var1, float var2) {
        return this.field_833.getFloat(var1, var2);
    }

    // $FF: renamed from: a (int, int) int
    public int method_869(int var1, int var2) {
        return this.field_833.getInt(var1, var2);
    }

    // $FF: renamed from: a (int, int, android.widget.TextView) android.graphics.Typeface
    public Typeface method_870(int var1, int var2, TextView var3) {
        var1 = this.field_833.getResourceId(var1, 0);
        Typeface var4;
        if (var1 == 0) {
            var4 = null;
        } else {
            if (this.field_834 == null) {
                this.field_834 = new TypedValue();
            }

            var4 = class_139.method_1178(this.field_832, var1, this.field_834, var2, var3);
        }

        return var4;
    }

    // $FF: renamed from: a (int) android.graphics.drawable.Drawable
    public Drawable method_871(int var1) {
        Drawable var3;
        if (this.field_833.hasValue(var1)) {
            int var2 = this.field_833.getResourceId(var1, 0);
            if (var2 != 0) {
                var3 = class_39.method_382(this.field_832, var2);
                return var3;
            }
        }

        var3 = this.field_833.getDrawable(var1);
        return var3;
    }

    // $FF: renamed from: a () void
    public void method_872() {
        this.field_833.recycle();
    }

    // $FF: renamed from: a (int, boolean) boolean
    public boolean method_873(int var1, boolean var2) {
        return this.field_833.getBoolean(var1, var2);
    }

    // $FF: renamed from: b (int, int) int
    public int method_874(int var1, int var2) {
        return this.field_833.getColor(var1, var2);
    }

    // $FF: renamed from: b (int) java.lang.CharSequence
    public CharSequence method_875(int var1) {
        return this.field_833.getText(var1);
    }

    // $FF: renamed from: c (int, int) int
    public int method_876(int var1, int var2) {
        return this.field_833.getInteger(var1, var2);
    }

    // $FF: renamed from: c (int) java.lang.String
    public String method_877(int var1) {
        return this.field_833.getString(var1);
    }

    // $FF: renamed from: d (int, int) int
    public int method_878(int var1, int var2) {
        return this.field_833.getDimensionPixelOffset(var1, var2);
    }

    // $FF: renamed from: d (int) android.content.res.ColorStateList
    public ColorStateList method_879(int var1) {
        ColorStateList var3;
        if (this.field_833.hasValue(var1)) {
            int var2 = this.field_833.getResourceId(var1, 0);
            if (var2 != 0) {
                var3 = class_39.method_379(this.field_832, var2);
                if (var3 != null) {
                    return var3;
                }
            }
        }

        var3 = this.field_833.getColorStateList(var1);
        return var3;
    }

    // $FF: renamed from: e (int, int) int
    public int method_880(int var1, int var2) {
        return this.field_833.getDimensionPixelSize(var1, var2);
    }

    // $FF: renamed from: e (int) java.lang.CharSequence[]
    public CharSequence[] method_881(int var1) {
        return this.field_833.getTextArray(var1);
    }

    // $FF: renamed from: f (int, int) int
    public int method_882(int var1, int var2) {
        return this.field_833.getLayoutDimension(var1, var2);
    }

    // $FF: renamed from: f (int) boolean
    public boolean method_883(int var1) {
        return this.field_833.hasValue(var1);
    }

    // $FF: renamed from: g (int, int) int
    public int method_884(int var1, int var2) {
        return this.field_833.getResourceId(var1, var2);
    }
}
