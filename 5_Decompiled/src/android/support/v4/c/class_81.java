package android.support.v4.c;

import android.graphics.Color;

// $FF: renamed from: android.support.v4.c.a
public final class class_81 {
    // $FF: renamed from: a java.lang.ThreadLocal
    private static final ThreadLocal field_719 = new ThreadLocal();

    // $FF: renamed from: a (int, int) int
    public static int method_776(int var0, int var1) {
        int var2 = Color.alpha(var1);
        int var3 = Color.alpha(var0);
        int var4 = method_779(var3, var2);
        return Color.argb(var4, method_777(Color.red(var0), var3, Color.red(var1), var2, var4), method_777(Color.green(var0), var3, Color.green(var1), var2, var4), method_777(Color.blue(var0), var3, Color.blue(var1), var2, var4));
    }

    // $FF: renamed from: a (int, int, int, int, int) int
    private static int method_777(int var0, int var1, int var2, int var3, int var4) {
        if (var4 == 0) {
            var0 = 0;
        } else {
            var0 = (var0 * 255 * var1 + var2 * var3 * (255 - var1)) / (var4 * 255);
        }

        return var0;
    }

    // $FF: renamed from: b (int, int) int
    public static int method_778(int var0, int var1) {
        if (var1 >= 0 && var1 <= 255) {
            return 16777215 & var0 | var1 << 24;
        } else {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
    }

    // $FF: renamed from: c (int, int) int
    private static int method_779(int var0, int var1) {
        return 255 - (255 - var1) * (255 - var0) / 255;
    }
}
