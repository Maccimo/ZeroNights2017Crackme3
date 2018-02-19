package android.support.v7.b.a;

import java.lang.reflect.Array;

// $FF: renamed from: android.support.v7.b.a.c
final class class_38 {
    // $FF: renamed from: a boolean
    // $FF: synthetic field
    static final boolean field_268;

    static {
        boolean var0;
        if (!c.class.desiredAssertionStatus()) {
            var0 = true;
        } else {
            var0 = false;
        }

        field_268 = var0;
    }

    // $FF: renamed from: a (int) int
    public static int method_376(int var0) {
        if (var0 <= 4) {
            var0 = 8;
        } else {
            var0 *= 2;
        }

        return var0;
    }

    // $FF: renamed from: a (int[], int, int) int[]
    public static int[] method_377(int[] var0, int var1, int var2) {
        if (!field_268 && var1 > var0.length) {
            throw new AssertionError();
        } else {
            int[] var3 = var0;
            if (var1 + 1 > var0.length) {
                var3 = new int[method_376(var1)];
                System.arraycopy(var0, 0, var3, 0, var1);
            }

            var3[var1] = var2;
            return var3;
        }
    }

    // $FF: renamed from: a (java.lang.Object[], int, java.lang.Object) java.lang.Object[]
    public static Object[] method_378(Object[] var0, int var1, Object var2) {
        if (!field_268 && var1 > var0.length) {
            throw new AssertionError();
        } else {
            if (var1 + 1 > var0.length) {
                Object[] var3 = (Object[])((Object[])Array.newInstance(var0.getClass().getComponentType(), method_376(var1)));
                System.arraycopy(var0, 0, var3, 0, var1);
                var0 = var3;
            }

            var0[var1] = var2;
            return var0;
        }
    }
}
