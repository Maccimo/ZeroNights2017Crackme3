package android.support.v4.c;

import android.graphics.Path;
import java.util.ArrayList;

// $FF: renamed from: android.support.v4.c.b
public class class_80 {
    // $FF: renamed from: a (java.lang.String, int) int
    private static int method_763(String var0, int var1) {
        while(var1 < var0.length()) {
            char var2 = var0.charAt(var1);
            if (((var2 - 65) * (var2 - 90) <= 0 || (var2 - 97) * (var2 - 122) <= 0) && var2 != 'e' && var2 != 'E') {
                break;
            }

            ++var1;
        }

        return var1;
    }

    // $FF: renamed from: a (java.lang.String) android.graphics.Path
    public static Path method_764(String var0) {
        Path var1 = new Path();
        b$b[] var2 = method_771(var0);
        Path var4;
        if (var2 != null) {
            try {
                b$b.method_396(var2, var1);
            } catch (RuntimeException var3) {
                throw new RuntimeException("Error in parsing " + var0, var3);
            }

            var4 = var1;
        } else {
            var4 = null;
        }

        return var4;
    }

    // $FF: renamed from: a (java.lang.String, int, android.support.v4.c.b$a) void
    private static void method_765(String var0, int var1, b$a var2) {
        var2.field_276 = false;
        boolean var6 = false;
        int var5 = var1;
        boolean var4 = false;

        for(boolean var3 = false; var5 < var0.length(); ++var5) {
            switch(var0.charAt(var5)) {
            case ' ':
            case ',':
                var4 = true;
                var3 = false;
                break;
            case '-':
                if (var5 != var1 && !var3) {
                    var2.field_276 = true;
                    var4 = true;
                    var3 = false;
                    break;
                }
            default:
                var3 = false;
                break;
            case '.':
                if (!var6) {
                    var6 = true;
                    var3 = false;
                } else {
                    var2.field_276 = true;
                    var4 = true;
                    var3 = false;
                }
                break;
            case 'E':
            case 'e':
                var3 = true;
            }

            if (var4) {
                break;
            }
        }

        var2.field_275 = var5;
    }

    // $FF: renamed from: a (java.util.ArrayList, char, float[]) void
    private static void method_766(ArrayList var0, char var1, float[] var2) {
        var0.add(new b$b(var1, var2));
    }

    // $FF: renamed from: a (android.support.v4.c.b$b[], android.support.v4.c.b$b[]) boolean
    public static boolean method_767(b$b[] var0, b$b[] var1) {
        boolean var4 = false;
        boolean var3 = var4;
        if (var0 != null) {
            if (var1 == null) {
                var3 = var4;
            } else {
                var3 = var4;
                if (var0.length == var1.length) {
                    int var2 = 0;

                    while(true) {
                        if (var2 >= var0.length) {
                            var3 = true;
                            break;
                        }

                        var3 = var4;
                        if (var0[var2].field_279 != var1[var2].field_279) {
                            break;
                        }

                        var3 = var4;
                        if (var0[var2].field_280.length != var1[var2].field_280.length) {
                            break;
                        }

                        ++var2;
                    }
                }
            }
        }

        return var3;
    }

    // $FF: renamed from: a (float[], int, int) float[]
    static float[] method_768(float[] var0, int var1, int var2) {
        if (var1 > var2) {
            throw new IllegalArgumentException();
        } else {
            int var3 = var0.length;
            if (var1 >= 0 && var1 <= var3) {
                var2 -= var1;
                var3 = Math.min(var2, var3 - var1);
                float[] var4 = new float[var2];
                System.arraycopy(var0, var1, var4, 0, var3);
                return var4;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        }
    }

    // $FF: renamed from: a (android.support.v4.c.b$b[]) android.support.v4.c.b$b[]
    public static b$b[] method_769(b$b[] var0) {
        if (var0 == null) {
            var0 = null;
        } else {
            b$b[] var2 = new b$b[var0.length];

            for(int var1 = 0; var1 < var0.length; ++var1) {
                var2[var1] = new b$b(var0[var1]);
            }

            var0 = var2;
        }

        return var0;
    }

    // $FF: renamed from: b (android.support.v4.c.b$b[], android.support.v4.c.b$b[]) void
    public static void method_770(b$b[] var0, b$b[] var1) {
        for(int var2 = 0; var2 < var1.length; ++var2) {
            var0[var2].field_279 = var1[var2].field_279;

            for(int var3 = 0; var3 < var1[var2].field_280.length; ++var3) {
                var0[var2].field_280[var3] = var1[var2].field_280[var3];
            }
        }

    }

    // $FF: renamed from: b (java.lang.String) android.support.v4.c.b$b[]
    public static b$b[] method_771(String var0) {
        b$b[] var7;
        if (var0 == null) {
            var7 = null;
        } else {
            ArrayList var5 = new ArrayList();
            int var2 = 1;

            int var1;
            int var3;
            for(var1 = 0; var2 < var0.length(); var1 = var3) {
                var3 = method_763(var0, var2);
                String var4 = var0.substring(var1, var3).trim();
                if (var4.length() > 0) {
                    float[] var6 = method_772(var4);
                    method_766(var5, var4.charAt(0), var6);
                }

                var2 = var3 + 1;
            }

            if (var2 - var1 == 1 && var1 < var0.length()) {
                method_766(var5, var0.charAt(var1), new float[0]);
            }

            var7 = (b$b[])var5.toArray(new b$b[var5.size()]);
        }

        return var7;
    }

    // $FF: renamed from: c (java.lang.String) float[]
    private static float[] method_772(String param0) {
        // $FF: Couldn't be decompiled
    }
}
