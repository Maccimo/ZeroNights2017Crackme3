package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

// $FF: renamed from: android.support.v4.h.o
public final class class_145 {
    // $FF: renamed from: a android.support.v4.h.o$c
    static final o$c field_1116;

    static {
        if (VERSION.SDK_INT >= 21) {
            field_1116 = new o$b();
        } else if (VERSION.SDK_INT >= 19) {
            field_1116 = new o$a();
        } else {
            field_1116 = new o$c();
        }

    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, int) void
    public static void method_1208(ViewParent var0, View var1, int var2) {
        if (var0 instanceof class_20) {
            ((class_20)var0).method_112(var1, var2);
        } else if (var2 == 0) {
            field_1116.method_1246(var0, var1);
        }

    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, int, int, int, int, int) void
    public static void method_1209(ViewParent var0, View var1, int var2, int var3, int var4, int var5, int var6) {
        if (var0 instanceof class_20) {
            ((class_20)var0).method_113(var1, var2, var3, var4, var5, var6);
        } else if (var6 == 0) {
            field_1116.method_1247(var0, var1, var2, var3, var4, var5);
        }

    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, int, int, int[], int) void
    public static void method_1210(ViewParent var0, View var1, int var2, int var3, int[] var4, int var5) {
        if (var0 instanceof class_20) {
            ((class_20)var0).method_114(var1, var2, var3, var4, var5);
        } else if (var5 == 0) {
            field_1116.method_1248(var0, var1, var2, var3, var4);
        }

    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, float, float) boolean
    public static boolean method_1211(ViewParent var0, View var1, float var2, float var3) {
        return field_1116.method_1249(var0, var1, var2, var3);
    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, float, float, boolean) boolean
    public static boolean method_1212(ViewParent var0, View var1, float var2, float var3, boolean var4) {
        return field_1116.method_1250(var0, var1, var2, var3, var4);
    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, android.view.View, int, int) boolean
    public static boolean method_1213(ViewParent var0, View var1, View var2, int var3, int var4) {
        boolean var5;
        if (var0 instanceof class_20) {
            var5 = ((class_20)var0).method_115(var1, var2, var3, var4);
        } else if (var4 == 0) {
            var5 = field_1116.method_1251(var0, var1, var2, var3);
        } else {
            var5 = false;
        }

        return var5;
    }

    // $FF: renamed from: b (android.view.ViewParent, android.view.View, android.view.View, int, int) void
    public static void method_1214(ViewParent var0, View var1, View var2, int var3, int var4) {
        if (var0 instanceof class_20) {
            ((class_20)var0).method_116(var1, var2, var3, var4);
        } else if (var4 == 0) {
            field_1116.method_1252(var0, var1, var2, var3);
        }

    }
}
