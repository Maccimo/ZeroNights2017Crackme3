package android.support.v4.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.v4.b.a.a$b;
import android.support.v4.b.a.a$c;
import java.io.IOException;
import java.io.InputStream;

// $FF: renamed from: android.support.v4.c.g
class class_82 implements c$a {
    // $FF: renamed from: a (android.support.v4.b.a.a$b, int) android.support.v4.b.a.a$c
    private a$c method_780(a$b var1, int var2) {
        return (a$c)method_781(var1.method_304(), var2, new g$a() {
            // $FF: renamed from: a (android.support.v4.b.a.a$c) int
            public int method_1032(a$c var1) {
                return var1.method_309();
            }

            // $FF: renamed from: a (java.lang.Object) boolean
            // $FF: synthetic method
            public boolean method_105(Object var1) {
                return this.method_1033((a$c)var1);
            }

            // $FF: renamed from: b (java.lang.Object) int
            // $FF: synthetic method
            public int method_106(Object var1) {
                return this.method_1032((a$c)var1);
            }

            // $FF: renamed from: b (android.support.v4.b.a.a$c) boolean
            public boolean method_1033(a$c var1) {
                return var1.method_310();
            }
        });
    }

    // $FF: renamed from: a (java.lang.Object[], int, android.support.v4.c.g$a) java.lang.Object
    private static Object method_781(Object[] var0, int var1, g$a var2) {
        short var3;
        if ((var1 & 1) == 0) {
            var3 = 400;
        } else {
            var3 = 700;
        }

        boolean var8;
        if ((var1 & 2) != 0) {
            var8 = true;
        } else {
            var8 = false;
        }

        Object var9 = null;
        var1 = Integer.MAX_VALUE;
        int var6 = var0.length;

        for(int var4 = 0; var4 < var6; ++var4) {
            Object var10 = var0[var4];
            int var7 = Math.abs(var2.method_106(var10) - var3);
            byte var5;
            if (var2.method_105(var10) == var8) {
                var5 = 0;
            } else {
                var5 = 1;
            }

            int var11 = var5 + var7 * 2;
            if (var9 == null || var1 > var11) {
                var9 = var10;
                var1 = var11;
            }
        }

        return var9;
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, int, java.lang.String, int) android.graphics.Typeface
    public Typeface method_134(Context param1, Resources param2, int param3, String param4, int param5) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.content.Context, android.os.CancellationSignal, android.support.v4.f.b$b[], int) android.graphics.Typeface
    public Typeface method_135(Context var1, CancellationSignal var2, android.support.v4.f.b$b[] var3, int var4) {
        Object var6 = null;
        Object var5 = null;
        Typeface var19;
        if (var3.length < 1) {
            var19 = (Typeface)var5;
        } else {
            android.support.v4.f.b$b var20 = this.method_783(var3, var4);

            InputStream var21;
            label123: {
                label113: {
                    label112: {
                        try {
                            var21 = var1.getContentResolver().openInputStream(var20.method_1050());
                            break label112;
                        } catch (IOException var17) {
                            ;
                        } finally {
                            ;
                        }

                        var21 = null;
                        break label113;
                    }

                    try {
                        try {
                            var19 = this.method_782(var1, var21);
                            break label123;
                        } catch (IOException var15) {
                            ;
                        }
                    } catch (Throwable var16) {
                        class_88.method_815(var21);
                        throw var16;
                    }
                }

                class_88.method_815(var21);
                var19 = (Typeface)var5;
                return var19;
            }

            class_88.method_815(var21);
        }

        return var19;
    }

    // $FF: renamed from: a (android.content.Context, android.support.v4.b.a.a$b, android.content.res.Resources, int) android.graphics.Typeface
    public Typeface method_136(Context var1, a$b var2, Resources var3, int var4) {
        a$c var6 = this.method_780(var2, var4);
        Typeface var5;
        if (var6 == null) {
            var5 = null;
        } else {
            var5 = class_86.method_796(var1, var3, var6.method_311(), var6.method_308(), var4);
        }

        return var5;
    }

    // $FF: renamed from: a (android.content.Context, java.io.InputStream) android.graphics.Typeface
    protected Typeface method_782(Context param1, InputStream param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.support.v4.f.b$b[], int) android.support.v4.f.b$b
    protected android.support.v4.f.b$b method_783(android.support.v4.f.b$b[] var1, int var2) {
        return (android.support.v4.f.b$b)method_781(var1, var2, new g$a() {
            // $FF: renamed from: a (android.support.v4.f.b$b) int
            public int method_1020(android.support.v4.f.b$b var1) {
                return var1.method_1052();
            }

            // $FF: renamed from: a (java.lang.Object) boolean
            // $FF: synthetic method
            public boolean method_105(Object var1) {
                return this.method_1021((android.support.v4.f.b$b)var1);
            }

            // $FF: renamed from: b (java.lang.Object) int
            // $FF: synthetic method
            public int method_106(Object var1) {
                return this.method_1020((android.support.v4.f.b$b)var1);
            }

            // $FF: renamed from: b (android.support.v4.f.b$b) boolean
            public boolean method_1021(android.support.v4.f.b$b var1) {
                return var1.method_1053();
            }
        });
    }
}
