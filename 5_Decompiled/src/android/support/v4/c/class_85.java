package android.support.v4.c;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.support.v4.b.a.a$b;
import android.support.v4.b.a.a$c;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

// $FF: renamed from: android.support.v4.c.f
public class class_85 extends class_84 {
    // $FF: renamed from: a java.lang.Class
    private static final Class field_724;
    // $FF: renamed from: b java.lang.reflect.Constructor
    private static final Constructor field_725;
    // $FF: renamed from: c java.lang.reflect.Method
    private static final Method field_726;
    // $FF: renamed from: d java.lang.reflect.Method
    private static final Method field_727;
    // $FF: renamed from: e java.lang.reflect.Method
    private static final Method field_728;
    // $FF: renamed from: f java.lang.reflect.Method
    private static final Method field_729;
    // $FF: renamed from: g java.lang.reflect.Method
    private static final Method field_730;

    static {
        Method var2 = null;

        Method var1;
        Method var3;
        Method var4;
        Method var5;
        Constructor var6;
        Class var10;
        label18: {
            Method var7;
            Constructor var11;
            Method var12;
            label17: {
                Object var0;
                try {
                    var10 = Class.forName("android.graphics.FontFamily");
                    var11 = var10.getConstructor();
                    var3 = var10.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
                    var12 = var10.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
                    var7 = var10.getMethod("freeze");
                    var4 = var10.getMethod("abortCreation");
                    var5 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(var10, 1).getClass(), Integer.TYPE, Integer.TYPE);
                    var5.setAccessible(true);
                    break label17;
                } catch (ClassNotFoundException var8) {
                    var0 = var8;
                } catch (NoSuchMethodException var9) {
                    var0 = var9;
                }

                Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + var0.getClass().getName(), (Throwable)var0);
                var1 = null;
                var6 = null;
                var7 = null;
                var3 = null;
                var4 = null;
                var5 = null;
                var10 = var2;
                var2 = var7;
                break label18;
            }

            var2 = var12;
            var6 = var11;
            var1 = var7;
        }

        field_725 = var6;
        field_724 = var10;
        field_726 = var3;
        field_727 = var2;
        field_728 = var1;
        field_729 = var4;
        field_730 = var5;
    }

    // $FF: renamed from: a (java.lang.Object) android.graphics.Typeface
    private static Typeface method_789(Object var0) {
        try {
            Object var1 = Array.newInstance(field_724, 1);
            Array.set(var1, 0, var0);
            Typeface var4 = (Typeface)field_730.invoke((Object)null, var1, -1, -1);
            return var4;
        } catch (IllegalAccessException var2) {
            var0 = var2;
        } catch (InvocationTargetException var3) {
            var0 = var3;
        }

        throw new RuntimeException((Throwable)var0);
    }

    // $FF: renamed from: a () boolean
    private static boolean method_790() {
        if (field_726 == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }

        boolean var0;
        if (field_726 != null) {
            var0 = true;
        } else {
            var0 = false;
        }

        return var0;
    }

    // $FF: renamed from: a (android.content.Context, java.lang.Object, java.lang.String, int, int, int) boolean
    private static boolean method_791(Context var0, Object var1, String var2, int var3, int var4, int var5) {
        Object var9;
        try {
            boolean var6 = (Boolean)field_726.invoke(var1, var0.getAssets(), var2, 0, false, var3, var4, var5, null);
            return var6;
        } catch (IllegalAccessException var7) {
            var9 = var7;
        } catch (InvocationTargetException var8) {
            var9 = var8;
        }

        throw new RuntimeException((Throwable)var9);
    }

    // $FF: renamed from: a (java.lang.Object, java.nio.ByteBuffer, int, int, int) boolean
    private static boolean method_792(Object var0, ByteBuffer var1, int var2, int var3, int var4) {
        try {
            boolean var5 = (Boolean)field_727.invoke(var0, var1, var2, null, var3, var4);
            return var5;
        } catch (IllegalAccessException var6) {
            var0 = var6;
        } catch (InvocationTargetException var7) {
            var0 = var7;
        }

        throw new RuntimeException((Throwable)var0);
    }

    // $FF: renamed from: b () java.lang.Object
    private static Object method_793() {
        Object var0;
        try {
            var0 = field_725.newInstance();
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

    // $FF: renamed from: b (java.lang.Object) boolean
    private static boolean method_794(Object var0) {
        try {
            boolean var1 = (Boolean)field_728.invoke(var0);
            return var1;
        } catch (IllegalAccessException var2) {
            var0 = var2;
        } catch (InvocationTargetException var3) {
            var0 = var3;
        }

        throw new RuntimeException((Throwable)var0);
    }

    // $FF: renamed from: c (java.lang.Object) boolean
    private static boolean method_795(Object var0) {
        try {
            boolean var1 = (Boolean)field_729.invoke(var0);
            return var1;
        } catch (IllegalAccessException var2) {
            var0 = var2;
        } catch (InvocationTargetException var3) {
            var0 = var3;
        }

        throw new RuntimeException((Throwable)var0);
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, int, java.lang.String, int) android.graphics.Typeface
    public Typeface method_134(Context var1, Resources var2, int var3, String var4, int var5) {
        Typeface var6;
        if (!method_790()) {
            var6 = super.a(var1, var2, var3, var4, var5);
        } else {
            Object var7 = method_793();
            if (!method_791(var1, var7, var4, 0, -1, -1)) {
                method_795(var7);
                var6 = null;
            } else if (!method_794(var7)) {
                var6 = null;
            } else {
                var6 = method_789(var7);
            }
        }

        return var6;
    }

    // $FF: renamed from: a (android.content.Context, android.os.CancellationSignal, android.support.v4.f.b$b[], int) android.graphics.Typeface
    public Typeface method_135(Context param1, CancellationSignal param2, android.support.v4.f.b$b[] param3, int param4) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.content.Context, android.support.v4.b.a.a$b, android.content.res.Resources, int) android.graphics.Typeface
    public Typeface method_136(Context var1, a$b var2, Resources var3, int var4) {
        Typeface var10;
        if (!method_790()) {
            var10 = super.a(var1, var2, var3, var4);
        } else {
            Object var12 = method_793();
            a$c[] var9 = var2.method_304();
            int var6 = var9.length;

            for(var4 = 0; var4 < var6; ++var4) {
                a$c var8 = var9[var4];
                String var11 = var8.method_308();
                int var7 = var8.method_309();
                byte var5;
                if (var8.method_310()) {
                    var5 = 1;
                } else {
                    var5 = 0;
                }

                if (!method_791(var1, var12, var11, 0, var7, var5)) {
                    method_795(var12);
                    var10 = null;
                    return var10;
                }
            }

            if (!method_794(var12)) {
                var10 = null;
            } else {
                var10 = method_789(var12);
            }
        }

        return var10;
    }
}
