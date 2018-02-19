package com.scottyab.rootbeer.a;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

// $FF: renamed from: com.scottyab.rootbeer.a.a
public final class class_120 {
    // $FF: renamed from: a int
    public static int field_1005 = 5;

    static {
        method_1026("Log class reloaded");
    }

    // $FF: renamed from: a (java.lang.Throwable) java.lang.String
    private static String method_1022(Throwable var0) {
        StringWriter var1 = new StringWriter();
        var0.printStackTrace(new PrintWriter(var1));
        return var1.toString();
    }

    // $FF: renamed from: a (java.lang.Object) void
    public static void method_1023(Object var0) {
        if (method_1029()) {
            Log.e("RootBeer", method_1030() + String.valueOf(var0));
            Log.e("QLog", method_1030() + String.valueOf(var0));
        }

    }

    // $FF: renamed from: a (java.lang.Object, java.lang.Throwable) void
    public static void method_1024(Object var0, Throwable var1) {
        if (method_1029()) {
            Log.e("RootBeer", method_1030() + String.valueOf(var0));
            Log.e("RootBeer", method_1022(var1));
            Log.e("QLog", method_1030() + String.valueOf(var0));
            Log.e("QLog", method_1022(var1));
        }

    }

    // $FF: renamed from: a () boolean
    public static boolean method_1025() {
        boolean var0;
        if (field_1005 > 4) {
            var0 = true;
        } else {
            var0 = false;
        }

        return var0;
    }

    // $FF: renamed from: b (java.lang.Object) void
    public static void method_1026(Object var0) {
        if (method_1027()) {
            Log.i("RootBeer", method_1030() + String.valueOf(var0));
        }

    }

    // $FF: renamed from: b () boolean
    public static boolean method_1027() {
        boolean var0;
        if (field_1005 > 2) {
            var0 = true;
        } else {
            var0 = false;
        }

        return var0;
    }

    // $FF: renamed from: c (java.lang.Object) void
    public static void method_1028(Object var0) {
        if (method_1025()) {
            Log.v("RootBeer", method_1030() + String.valueOf(var0));
        }

    }

    // $FF: renamed from: c () boolean
    public static boolean method_1029() {
        boolean var0;
        if (field_1005 > 0) {
            var0 = true;
        } else {
            var0 = false;
        }

        return var0;
    }

    // $FF: renamed from: d () java.lang.String
    private static String method_1030() {
        StackTraceElement[] var2 = (new Throwable()).getStackTrace();
        String var1 = var2[2].getMethodName();
        String var3 = var2[2].getClassName();
        int var0 = var2[2].getLineNumber();
        String var4 = var3.substring(var3.lastIndexOf(46) + 1);
        return var4 + ": " + var1 + "() [" + var0 + "] - ";
    }
}
