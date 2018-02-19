package android.support.v4.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.b.a.a$b;
import android.support.v4.b.a.a$c;
import android.support.v4.g.class_133;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

// $FF: renamed from: android.support.v4.c.e
class class_83 extends class_82 {
    // $FF: renamed from: a java.lang.Class
    private static final Class field_720;
    // $FF: renamed from: b java.lang.reflect.Constructor
    private static final Constructor field_721;
    // $FF: renamed from: c java.lang.reflect.Method
    private static final Method field_722;
    // $FF: renamed from: d java.lang.reflect.Method
    private static final Method field_723;

    static {
        Constructor var1 = null;

        Method var2;
        Class var3;
        Method var7;
        label18: {
            Constructor var4;
            label17: {
                Object var0;
                try {
                    var3 = Class.forName("android.graphics.FontFamily");
                    var4 = var3.getConstructor();
                    var7 = var3.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
                    var2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(var3, 1).getClass());
                    break label17;
                } catch (ClassNotFoundException var5) {
                    var0 = var5;
                } catch (NoSuchMethodException var6) {
                    var0 = var6;
                }

                Log.e("TypefaceCompatApi24Impl", var0.getClass().getName(), (Throwable)var0);
                var3 = null;
                var7 = null;
                var2 = null;
                break label18;
            }

            var1 = var4;
        }

        field_721 = var1;
        field_720 = var3;
        field_722 = var7;
        field_723 = var2;
    }

    // $FF: renamed from: a (java.lang.Object) android.graphics.Typeface
    private static Typeface method_784(Object var0) {
        try {
            Object var1 = Array.newInstance(field_720, 1);
            Array.set(var1, 0, var0);
            Typeface var4 = (Typeface)field_723.invoke((Object)null, var1);
            return var4;
        } catch (IllegalAccessException var2) {
            var0 = var2;
        } catch (InvocationTargetException var3) {
            var0 = var3;
        }

        throw new RuntimeException((Throwable)var0);
    }

    // $FF: renamed from: a () boolean
    public static boolean method_785() {
        if (field_722 == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }

        boolean var0;
        if (field_722 != null) {
            var0 = true;
        } else {
            var0 = false;
        }

        return var0;
    }

    // $FF: renamed from: a (java.lang.Object, java.nio.ByteBuffer, int, int, boolean) boolean
    private static boolean method_786(Object var0, ByteBuffer var1, int var2, int var3, boolean var4) {
        try {
            var4 = (Boolean)field_722.invoke(var0, var1, var2, null, var3, var4);
            return var4;
        } catch (IllegalAccessException var5) {
            var0 = var5;
        } catch (InvocationTargetException var6) {
            var0 = var6;
        }

        throw new RuntimeException((Throwable)var0);
    }

    // $FF: renamed from: b () java.lang.Object
    private static Object method_787() {
        Object var0;
        try {
            var0 = field_721.newInstance();
            return var0;
        } catch (IllegalAccessException var1) {
            var0 = var1;
        } catch (InstantiationException var2) {
            var0 = var2;
        } catch (InvocationTargetException var3) {
            var0 = var3;
        }

        throw new RuntimeException((Throwable)var0);
    }

    // $FF: renamed from: a (android.content.Context, android.os.CancellationSignal, android.support.v4.f.b$b[], int) android.graphics.Typeface
    public Typeface method_135(Context var1, CancellationSignal var2, android.support.v4.f.b$b[] var3, int var4) {
        Object var9 = method_787();
        class_133 var10 = new class_133();
        int var5 = var3.length;
        var4 = 0;

        Typeface var12;
        while(true) {
            if (var4 >= var5) {
                var12 = method_784(var9);
                break;
            }

            android.support.v4.f.b$b var8 = var3[var4];
            Uri var11 = var8.method_1050();
            ByteBuffer var7 = (ByteBuffer)var10.get(var11);
            ByteBuffer var6 = var7;
            if (var7 == null) {
                var6 = class_88.method_813(var1, var2, var11);
                var10.put(var11, var6);
            }

            if (!method_786(var9, var6, var8.method_1051(), var8.method_1052(), var8.method_1053())) {
                var12 = null;
                break;
            }

            ++var4;
        }

        return var12;
    }

    // $FF: renamed from: a (android.content.Context, android.support.v4.b.a.a$b, android.content.res.Resources, int) android.graphics.Typeface
    public Typeface method_136(Context var1, a$b var2, Resources var3, int var4) {
        Object var6 = method_787();
        a$c[] var9 = var2.method_304();
        int var5 = var9.length;
        var4 = 0;

        Typeface var8;
        while(true) {
            if (var4 >= var5) {
                var8 = method_784(var6);
                break;
            }

            a$c var7 = var9[var4];
            if (!method_786(var6, class_88.method_812(var1, var3, var7.method_311()), 0, var7.method_309(), var7.method_310())) {
                var8 = null;
                break;
            }

            ++var4;
        }

        return var8;
    }
}
