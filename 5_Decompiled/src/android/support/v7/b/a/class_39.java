package android.support.v7.b.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.b.class_47;
import android.support.v7.widget.class_74;
import android.util.Log;
import android.util.TypedValue;
import java.util.WeakHashMap;

// $FF: renamed from: android.support.v7.b.a.b
public final class class_39 {
    // $FF: renamed from: a java.lang.ThreadLocal
    private static final ThreadLocal field_269 = new ThreadLocal();
    // $FF: renamed from: b java.util.WeakHashMap
    private static final WeakHashMap field_270 = new WeakHashMap(0);
    // $FF: renamed from: c java.lang.Object
    private static final Object field_271 = new Object();

    // $FF: renamed from: a (android.content.Context, int) android.content.res.ColorStateList
    public static ColorStateList method_379(Context var0, int var1) {
        ColorStateList var2;
        if (VERSION.SDK_INT >= 23) {
            var2 = var0.getColorStateList(var1);
        } else {
            ColorStateList var3 = method_384(var0, var1);
            var2 = var3;
            if (var3 == null) {
                var2 = method_383(var0, var1);
                if (var2 != null) {
                    method_381(var0, var1, var2);
                } else {
                    var2 = class_47.method_514(var0, var1);
                }
            }
        }

        return var2;
    }

    // $FF: renamed from: a () android.util.TypedValue
    private static TypedValue method_380() {
        TypedValue var1 = (TypedValue)field_269.get();
        TypedValue var0 = var1;
        if (var1 == null) {
            var0 = new TypedValue();
            field_269.set(var0);
        }

        return var0;
    }

    // $FF: renamed from: a (android.content.Context, int, android.content.res.ColorStateList) void
    private static void method_381(Context param0, int param1, ColorStateList param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: b (android.content.Context, int) android.graphics.drawable.Drawable
    public static Drawable method_382(Context var0, int var1) {
        return class_74.method_717().method_735(var0, var1);
    }

    // $FF: renamed from: c (android.content.Context, int) android.content.res.ColorStateList
    private static ColorStateList method_383(Context var0, int var1) {
        Object var2 = null;
        ColorStateList var6;
        if (method_385(var0, var1)) {
            var6 = (ColorStateList)var2;
        } else {
            Resources var3 = var0.getResources();
            XmlResourceParser var4 = var3.getXml(var1);

            try {
                var6 = class_40.method_387(var3, var4, var0.getTheme());
            } catch (Exception var5) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", var5);
                var6 = (ColorStateList)var2;
            }
        }

        return var6;
    }

    // $FF: renamed from: d (android.content.Context, int) android.content.res.ColorStateList
    private static ColorStateList method_384(Context param0, int param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: e (android.content.Context, int) boolean
    private static boolean method_385(Context var0, int var1) {
        boolean var2 = true;
        Resources var4 = var0.getResources();
        TypedValue var3 = method_380();
        var4.getValue(var1, var3, true);
        if (var3.type < 28 || var3.type > 31) {
            var2 = false;
        }

        return var2;
    }
}
