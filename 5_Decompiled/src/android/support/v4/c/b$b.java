package android.support.v4.c;

import android.graphics.Path;
import android.util.Log;

public class b$b {
    // $FF: renamed from: a char
    public char field_279;
    // $FF: renamed from: b float[]
    public float[] field_280;

    b$b(char var1, float[] var2) {
        this.field_279 = var1;
        this.field_280 = var2;
    }

    b$b(b$b var1) {
        this.field_279 = var1.field_279;
        this.field_280 = class_80.method_768(var1.field_280, 0, var1.field_280.length);
    }

    // $FF: renamed from: a (android.graphics.Path, double, double, double, double, double, double, double, double, double) void
    private static void method_393(Path var0, double var1, double var3, double var5, double var7, double var9, double var11, double var13, double var15, double var17) {
        int var38 = (int)Math.ceil(Math.abs(4.0D * var17 / 3.141592653589793D));
        double var29 = Math.cos(var13);
        double var31 = Math.sin(var13);
        double var21 = Math.cos(var15);
        var13 = Math.sin(var15);
        double var19 = -var5;
        double var23 = -var5;
        double var33 = var17 / (double)var38;
        int var37 = 0;
        var19 = var13 * var19 * var29 - var21 * var7 * var31;
        var21 = var23 * var31 * var13 + var7 * var29 * var21;
        var17 = var15;
        var13 = var11;
        var11 = var9;
        var9 = var21;

        for(var15 = var19; var37 < var38; var15 = var19) {
            double var27 = var17 + var33;
            double var35 = Math.sin(var27);
            double var25 = Math.cos(var27);
            var23 = var5 * var29 * var25 + var1 - var7 * var31 * var35;
            var21 = var7 * var29 * var35 + var5 * var31 * var25 + var3;
            var19 = -var5 * var29 * var35 - var7 * var31 * var25;
            var25 = var25 * var7 * var29 + var35 * -var5 * var31;
            var35 = Math.tan((var27 - var17) / 2.0D);
            var17 = Math.sin(var27 - var17);
            var17 = (Math.sqrt(var35 * 3.0D * var35 + 4.0D) - 1.0D) * var17 / 3.0D;
            var0.rLineTo(0.0F, 0.0F);
            var0.cubicTo((float)(var15 * var17 + var11), (float)(var9 * var17 + var13), (float)(var23 - var17 * var19), (float)(var21 - var17 * var25), (float)var23, (float)var21);
            ++var37;
            var17 = var27;
            var11 = var23;
            var9 = var25;
            var13 = var21;
        }

    }

    // $FF: renamed from: a (android.graphics.Path, float, float, float, float, float, float, float, boolean, boolean) void
    private static void method_394(Path var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8, boolean var9) {
        double var22 = Math.toRadians((double)var7);
        double var20 = Math.cos(var22);
        double var18 = Math.sin(var22);
        double var24 = ((double)var1 * var20 + (double)var2 * var18) / (double)var5;
        double var26 = ((double)(-var1) * var18 + (double)var2 * var20) / (double)var6;
        double var16 = ((double)var3 * var20 + (double)var4 * var18) / (double)var5;
        double var10 = ((double)(-var3) * var18 + (double)var4 * var20) / (double)var6;
        double var28 = var24 - var16;
        double var30 = var26 - var10;
        double var14 = (var24 + var16) / 2.0D;
        double var12 = (var26 + var10) / 2.0D;
        double var34 = var28 * var28 + var30 * var30;
        if (var34 == 0.0D) {
            Log.w("PathParser", " Points are coincident");
        } else {
            double var32 = 1.0D / var34 - 0.25D;
            if (var32 < 0.0D) {
                Log.w("PathParser", "Points are too far apart " + var34);
                float var36 = (float)(Math.sqrt(var34) / 1.99999D);
                method_394(var0, var1, var2, var3, var4, var5 * var36, var6 * var36, var7, var8, var9);
            } else {
                var32 = Math.sqrt(var32);
                var28 *= var32;
                var30 *= var32;
                if (var8 == var9) {
                    var14 -= var30;
                    var12 += var28;
                } else {
                    var14 += var30;
                    var12 -= var28;
                }

                var24 = Math.atan2(var26 - var12, var24 - var14);
                var16 = Math.atan2(var10 - var12, var16 - var14) - var24;
                if (var16 >= 0.0D) {
                    var8 = true;
                } else {
                    var8 = false;
                }

                var10 = var16;
                if (var9 != var8) {
                    if (var16 > 0.0D) {
                        var10 = var16 - 6.283185307179586D;
                    } else {
                        var10 = var16 + 6.283185307179586D;
                    }
                }

                var14 = (double)var5 * var14;
                var12 *= (double)var6;
                method_393(var0, var14 * var20 - var12 * var18, var12 * var20 + var18 * var14, (double)var5, (double)var6, (double)var1, (double)var2, var22, var24, var10);
            }
        }

    }

    // $FF: renamed from: a (android.graphics.Path, float[], char, char, float[]) void
    private static void method_395(Path var0, float[] var1, char var2, char var3, float[] var4) {
        float var7 = var1[0];
        float var8 = var1[1];
        float var6 = var1[2];
        float var5 = var1[3];
        float var9 = var1[4];
        float var10 = var1[5];
        float var11;
        float var12;
        byte var15;
        switch(var3) {
        case 'A':
        case 'a':
            var15 = 7;
            var12 = var8;
            var11 = var6;
            var8 = var5;
            var5 = var12;
            var6 = var7;
            var7 = var11;
            break;
        case 'C':
        case 'c':
            var15 = 6;
            var12 = var6;
            var11 = var5;
            var5 = var8;
            var6 = var7;
            var7 = var12;
            var8 = var11;
            break;
        case 'H':
        case 'V':
        case 'h':
        case 'v':
            var15 = 1;
            var11 = var8;
            var12 = var7;
            var7 = var6;
            var8 = var5;
            var5 = var11;
            var6 = var12;
            break;
        case 'L':
        case 'M':
        case 'T':
        case 'l':
        case 'm':
        case 't':
            var15 = 2;
            var12 = var8;
            var11 = var6;
            var8 = var5;
            var5 = var12;
            var6 = var7;
            var7 = var11;
            break;
        case 'Q':
        case 'S':
        case 'q':
        case 's':
            var15 = 4;
            var11 = var8;
            var12 = var6;
            var8 = var5;
            var5 = var11;
            var6 = var7;
            var7 = var12;
            break;
        case 'Z':
        case 'z':
            var0.close();
            var0.moveTo(var9, var10);
            var15 = 2;
            var6 = var9;
            var7 = var9;
            var8 = var10;
            var5 = var10;
            break;
        default:
            var15 = 2;
            var11 = var8;
            var12 = var7;
            var8 = var5;
            var7 = var6;
            var6 = var12;
            var5 = var11;
        }

        byte var17 = 0;
        var11 = var6;
        var12 = var5;
        var5 = var10;
        var6 = var9;
        char var16 = var2;
        var9 = var12;
        var10 = var11;
        int var20 = var17;
        var11 = var8;

        for(var12 = var7; var20 < var4.length; var6 = var8) {
            float var13;
            float var14;
            boolean var18;
            boolean var19;
            switch(var3) {
            case 'A':
                var13 = var4[var20 + 5];
                var12 = var4[var20 + 6];
                var8 = var4[var20 + 0];
                var7 = var4[var20 + 1];
                var11 = var4[var20 + 2];
                if (var4[var20 + 3] != 0.0F) {
                    var18 = true;
                } else {
                    var18 = false;
                }

                if (var4[var20 + 4] != 0.0F) {
                    var19 = true;
                } else {
                    var19 = false;
                }

                method_394(var0, var10, var9, var13, var12, var8, var7, var11, var18, var19);
                var9 = var4[var20 + 5];
                var10 = var4[var20 + 6];
                var8 = var6;
                var12 = var5;
                var5 = var9;
                var6 = var10;
                var7 = var12;
                break;
            case 'C':
                var0.cubicTo(var4[var20 + 0], var4[var20 + 1], var4[var20 + 2], var4[var20 + 3], var4[var20 + 4], var4[var20 + 5]);
                var10 = var4[var20 + 4];
                var9 = var4[var20 + 5];
                var12 = var4[var20 + 2];
                var11 = var4[var20 + 3];
                var8 = var6;
                var7 = var5;
                var5 = var10;
                var6 = var9;
                var9 = var12;
                var10 = var11;
                break;
            case 'H':
                var0.lineTo(var4[var20 + 0], var9);
                var10 = var4[var20 + 0];
                var8 = var6;
                var7 = var5;
                var5 = var10;
                var6 = var9;
                var9 = var12;
                var10 = var11;
                break;
            case 'L':
                var0.lineTo(var4[var20 + 0], var4[var20 + 1]);
                var7 = var4[var20 + 0];
                var9 = var4[var20 + 1];
                var8 = var6;
                var10 = var5;
                var5 = var7;
                var6 = var9;
                var9 = var12;
                var7 = var10;
                var10 = var11;
                break;
            case 'M':
                var8 = var4[var20 + 0];
                var7 = var4[var20 + 1];
                if (var20 > 0) {
                    var0.lineTo(var4[var20 + 0], var4[var20 + 1]);
                    var9 = var8;
                    var8 = var6;
                    var10 = var5;
                    var5 = var9;
                    var6 = var7;
                    var9 = var12;
                    var7 = var10;
                    var10 = var11;
                } else {
                    var0.moveTo(var4[var20 + 0], var4[var20 + 1]);
                    var5 = var8;
                    var6 = var7;
                    var9 = var12;
                    var10 = var11;
                }
                break;
            case 'Q':
                var0.quadTo(var4[var20 + 0], var4[var20 + 1], var4[var20 + 2], var4[var20 + 3]);
                var12 = var4[var20 + 0];
                var11 = var4[var20 + 1];
                var9 = var4[var20 + 2];
                var7 = var4[var20 + 3];
                var8 = var6;
                var10 = var5;
                var5 = var9;
                var6 = var7;
                var9 = var12;
                var7 = var10;
                var10 = var11;
                break;
            case 'S':
                if (var16 != 'c' && var16 != 's' && var16 != 'C' && var16 != 'S') {
                    var7 = var10;
                } else {
                    var7 = 2.0F * var10 - var12;
                    var9 = 2.0F * var9 - var11;
                }

                var0.cubicTo(var7, var9, var4[var20 + 0], var4[var20 + 1], var4[var20 + 2], var4[var20 + 3]);
                var12 = var4[var20 + 0];
                var11 = var4[var20 + 1];
                var9 = var4[var20 + 2];
                var10 = var4[var20 + 3];
                var8 = var6;
                var7 = var5;
                var5 = var9;
                var6 = var10;
                var9 = var12;
                var10 = var11;
                break;
            case 'T':
                if (var16 != 'q' && var16 != 't' && var16 != 'Q' && var16 != 'T') {
                    var7 = var9;
                    var9 = var10;
                    var10 = var7;
                } else {
                    var7 = 2.0F * var10 - var12;
                    var10 = 2.0F * var9 - var11;
                    var9 = var7;
                }

                var0.quadTo(var9, var10, var4[var20 + 0], var4[var20 + 1]);
                var7 = var4[var20 + 0];
                var12 = var4[var20 + 1];
                var8 = var6;
                var11 = var5;
                var5 = var7;
                var6 = var12;
                var7 = var11;
                break;
            case 'V':
                var0.lineTo(var10, var4[var20 + 0]);
                var9 = var4[var20 + 0];
                var8 = var6;
                var7 = var5;
                var5 = var10;
                var6 = var9;
                var9 = var12;
                var10 = var11;
                break;
            case 'a':
                var7 = var4[var20 + 5];
                var13 = var4[var20 + 6];
                var8 = var4[var20 + 0];
                var12 = var4[var20 + 1];
                var11 = var4[var20 + 2];
                if (var4[var20 + 3] != 0.0F) {
                    var18 = true;
                } else {
                    var18 = false;
                }

                if (var4[var20 + 4] != 0.0F) {
                    var19 = true;
                } else {
                    var19 = false;
                }

                method_394(var0, var10, var9, var7 + var10, var13 + var9, var8, var12, var11, var18, var19);
                var8 = var10 + var4[var20 + 5];
                var10 = var9 + var4[var20 + 6];
                var11 = var8;
                var9 = var8;
                var8 = var6;
                var12 = var5;
                var5 = var11;
                var6 = var10;
                var7 = var12;
                break;
            case 'c':
                var0.rCubicTo(var4[var20 + 0], var4[var20 + 1], var4[var20 + 2], var4[var20 + 3], var4[var20 + 4], var4[var20 + 5]);
                var11 = var4[var20 + 2];
                var8 = var4[var20 + 3];
                var7 = var4[var20 + 4];
                var12 = var4[var20 + 5];
                var11 += var10;
                var13 = var12 + var9;
                var12 = var8 + var9;
                var9 = var10 + var7;
                var8 = var6;
                var7 = var5;
                var5 = var9;
                var6 = var13;
                var9 = var11;
                var10 = var12;
                break;
            case 'h':
                var0.rLineTo(var4[var20 + 0], 0.0F);
                var10 += var4[var20 + 0];
                var8 = var6;
                var7 = var5;
                var5 = var10;
                var6 = var9;
                var9 = var12;
                var10 = var11;
                break;
            case 'l':
                var0.rLineTo(var4[var20 + 0], var4[var20 + 1]);
                var8 = var4[var20 + 0];
                var7 = var4[var20 + 1];
                var10 += var8;
                var9 += var7;
                var8 = var6;
                var7 = var5;
                var5 = var10;
                var6 = var9;
                var9 = var12;
                var10 = var11;
                break;
            case 'm':
                var8 = var10 + var4[var20 + 0];
                var7 = var9 + var4[var20 + 1];
                if (var20 > 0) {
                    var0.rLineTo(var4[var20 + 0], var4[var20 + 1]);
                    var9 = var8;
                    var10 = var7;
                    var8 = var6;
                    var7 = var5;
                    var5 = var9;
                    var6 = var10;
                    var9 = var12;
                    var10 = var11;
                } else {
                    var0.rMoveTo(var4[var20 + 0], var4[var20 + 1]);
                    var5 = var8;
                    var6 = var7;
                    var9 = var12;
                    var10 = var11;
                }
                break;
            case 'q':
                var0.rQuadTo(var4[var20 + 0], var4[var20 + 1], var4[var20 + 2], var4[var20 + 3]);
                var11 = var4[var20 + 0];
                var8 = var4[var20 + 1];
                var7 = var4[var20 + 2];
                var12 = var4[var20 + 3];
                var11 += var10;
                var13 = var12 + var9;
                var12 = var8 + var9;
                var9 = var10 + var7;
                var8 = var6;
                var7 = var5;
                var5 = var9;
                var6 = var13;
                var9 = var11;
                var10 = var12;
                break;
            case 's':
                if (var16 != 'c' && var16 != 's' && var16 != 'C' && var16 != 'S') {
                    var7 = 0.0F;
                    var8 = 0.0F;
                } else {
                    var8 = var10 - var12;
                    var7 = var9 - var11;
                }

                var0.rCubicTo(var8, var7, var4[var20 + 0], var4[var20 + 1], var4[var20 + 2], var4[var20 + 3]);
                var11 = var4[var20 + 0];
                var8 = var4[var20 + 1];
                var7 = var4[var20 + 2];
                var12 = var4[var20 + 3];
                var11 += var10;
                var13 = var12 + var9;
                var12 = var8 + var9;
                var9 = var10 + var7;
                var8 = var6;
                var7 = var5;
                var5 = var9;
                var6 = var13;
                var9 = var11;
                var10 = var12;
                break;
            case 't':
                if (var16 != 'q' && var16 != 't' && var16 != 'Q' && var16 != 'T') {
                    var7 = 0.0F;
                    var8 = 0.0F;
                } else {
                    var8 = var10 - var12;
                    var7 = var9 - var11;
                }

                var0.rQuadTo(var8, var7, var4[var20 + 0], var4[var20 + 1]);
                var14 = var4[var20 + 0];
                var12 = var4[var20 + 1];
                var11 = var10 + var8;
                var13 = var12 + var9;
                var12 = var7 + var9;
                var9 = var10 + var14;
                var8 = var6;
                var7 = var5;
                var5 = var9;
                var6 = var13;
                var9 = var11;
                var10 = var12;
                break;
            case 'v':
                var0.rLineTo(0.0F, var4[var20 + 0]);
                var7 = var4[var20 + 0];
                var9 += var7;
                var8 = var6;
                var7 = var5;
                var5 = var10;
                var6 = var9;
                var9 = var12;
                var10 = var11;
                break;
            default:
                var13 = var10;
                var14 = var9;
                var8 = var6;
                var10 = var11;
                var7 = var5;
                var9 = var12;
                var6 = var14;
                var5 = var13;
            }

            var20 += var15;
            var13 = var5;
            var5 = var7;
            var16 = var3;
            var12 = var9;
            var11 = var10;
            var10 = var13;
            var9 = var6;
        }

        var1[0] = var10;
        var1[1] = var9;
        var1[2] = var12;
        var1[3] = var11;
        var1[4] = var6;
        var1[5] = var5;
    }

    // $FF: renamed from: a (android.support.v4.c.b$b[], android.graphics.Path) void
    public static void method_396(b$b[] var0, Path var1) {
        float[] var4 = new float[6];
        char var2 = 'm';

        for(int var3 = 0; var3 < var0.length; ++var3) {
            method_395(var1, var4, var2, var0[var3].field_279, var0[var3].field_280);
            var2 = var0[var3].field_279;
        }

    }

    // $FF: renamed from: a (android.support.v4.c.b$b, android.support.v4.c.b$b, float) void
    public void method_397(b$b var1, b$b var2, float var3) {
        for(int var4 = 0; var4 < var1.field_280.length; ++var4) {
            this.field_280[var4] = var1.field_280[var4] * (1.0F - var3) + var2.field_280[var4] * var3;
        }

    }
}
