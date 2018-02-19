package android.support.v4.g;

// $FF: renamed from: android.support.v4.g.b
class class_136 {
    // $FF: renamed from: a int[]
    static final int[] field_1079 = new int[0];
    // $FF: renamed from: b long[]
    static final long[] field_1080 = new long[0];
    // $FF: renamed from: c java.lang.Object[]
    static final Object[] field_1081 = new Object[0];

    // $FF: renamed from: a (int) int
    public static int method_1134(int var0) {
        return method_1139(var0 * 4) / 4;
    }

    // $FF: renamed from: a (int[], int, int) int
    static int method_1135(int[] var0, int var1, int var2) {
        byte var3 = 0;
        int var4 = var1 - 1;
        var1 = var3;
        int var6 = var4;

        while(true) {
            if (var1 > var6) {
                var6 = ~var1;
                break;
            }

            var4 = var1 + var6 >>> 1;
            int var5 = var0[var4];
            if (var5 < var2) {
                var1 = var4 + 1;
            } else {
                var6 = var4;
                if (var5 <= var2) {
                    break;
                }

                var6 = var4 - 1;
            }
        }

        return var6;
    }

    // $FF: renamed from: a (long[], int, long) int
    static int method_1136(long[] var0, int var1, long var2) {
        byte var4 = 0;
        int var5 = var1 - 1;
        var1 = var4;
        int var8 = var5;

        while(true) {
            if (var1 > var8) {
                var8 = ~var1;
                break;
            }

            var5 = var1 + var8 >>> 1;
            long var6 = var0[var5];
            if (var6 < var2) {
                var1 = var5 + 1;
            } else {
                var8 = var5;
                if (var6 <= var2) {
                    break;
                }

                var8 = var5 - 1;
            }
        }

        return var8;
    }

    // $FF: renamed from: a (java.lang.Object, java.lang.Object) boolean
    public static boolean method_1137(Object var0, Object var1) {
        boolean var2;
        if (var0 != var1 && (var0 == null || !var0.equals(var1))) {
            var2 = false;
        } else {
            var2 = true;
        }

        return var2;
    }

    // $FF: renamed from: b (int) int
    public static int method_1138(int var0) {
        return method_1139(var0 * 8) / 8;
    }

    // $FF: renamed from: c (int) int
    public static int method_1139(int var0) {
        int var2 = 4;

        int var1;
        while(true) {
            var1 = var0;
            if (var2 >= 32) {
                break;
            }

            if (var0 <= (1 << var2) - 12) {
                var1 = (1 << var2) - 12;
                break;
            }

            ++var2;
        }

        return var1;
    }
}
