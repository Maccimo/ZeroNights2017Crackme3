package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.c.class_81;
import android.util.AttributeSet;
import android.util.TypedValue;

// $FF: renamed from: android.support.v7.widget.af
class class_94 {
    // $FF: renamed from: a int[]
    static final int[] field_813 = new int[]{-16842910};
    // $FF: renamed from: b int[]
    static final int[] field_814 = new int[]{16842908};
    // $FF: renamed from: c int[]
    static final int[] field_815 = new int[]{16843518};
    // $FF: renamed from: d int[]
    static final int[] field_816 = new int[]{16842919};
    // $FF: renamed from: e int[]
    static final int[] field_817 = new int[]{16842912};
    // $FF: renamed from: f int[]
    static final int[] field_818 = new int[]{16842913};
    // $FF: renamed from: g int[]
    static final int[] field_819 = new int[]{-16842919, -16842908};
    // $FF: renamed from: h int[]
    static final int[] field_820 = new int[0];
    // $FF: renamed from: i java.lang.ThreadLocal
    private static final ThreadLocal field_821 = new ThreadLocal();
    // $FF: renamed from: j int[]
    private static final int[] field_822 = new int[1];

    // $FF: renamed from: a (android.content.Context, int) int
    public static int method_857(Context var0, int var1) {
        field_822[0] = var1;
        class_97 var5 = class_97.method_866(var0, (AttributeSet)null, field_822);

        try {
            var1 = var5.method_874(0, 0);
        } finally {
            var5.method_872();
        }

        return var1;
    }

    // $FF: renamed from: a (android.content.Context, int, float) int
    static int method_858(Context var0, int var1, float var2) {
        var1 = method_857(var0, var1);
        return class_81.method_778(var1, Math.round((float)Color.alpha(var1) * var2));
    }

    // $FF: renamed from: a () android.util.TypedValue
    private static TypedValue method_859() {
        TypedValue var1 = (TypedValue)field_821.get();
        TypedValue var0 = var1;
        if (var1 == null) {
            var0 = new TypedValue();
            field_821.set(var0);
        }

        return var0;
    }

    // $FF: renamed from: b (android.content.Context, int) android.content.res.ColorStateList
    public static ColorStateList method_860(Context var0, int var1) {
        field_822[0] = var1;
        class_97 var5 = class_97.method_866(var0, (AttributeSet)null, field_822);

        ColorStateList var2;
        try {
            var2 = var5.method_879(0);
        } finally {
            var5.method_872();
        }

        return var2;
    }

    // $FF: renamed from: c (android.content.Context, int) int
    public static int method_861(Context var0, int var1) {
        ColorStateList var2 = method_860(var0, var1);
        if (var2 != null && var2.isStateful()) {
            var1 = var2.getColorForState(field_813, var2.getDefaultColor());
        } else {
            TypedValue var3 = method_859();
            var0.getTheme().resolveAttribute(16842803, var3, true);
            var1 = method_858(var0, var1, var3.getFloat());
        }

        return var1;
    }
}
