package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

// $FF: renamed from: android.support.v4.h.n
public class class_146 {
    // $FF: renamed from: a android.support.v4.h.n$j
    static final n$j field_1117;

    static {
        if (VERSION.SDK_INT >= 26) {
            field_1117 = new n$i();
        } else if (VERSION.SDK_INT >= 24) {
            field_1117 = new n$h();
        } else if (VERSION.SDK_INT >= 23) {
            field_1117 = new n$g();
        } else if (VERSION.SDK_INT >= 21) {
            field_1117 = new n$f();
        } else if (VERSION.SDK_INT >= 19) {
            field_1117 = new n$e();
        } else if (VERSION.SDK_INT >= 18) {
            field_1117 = new n$d();
        } else if (VERSION.SDK_INT >= 17) {
            field_1117 = new n$c();
        } else if (VERSION.SDK_INT >= 16) {
            field_1117 = new n$b();
        } else if (VERSION.SDK_INT >= 15) {
            field_1117 = new n$a();
        } else {
            field_1117 = new n$j();
        }

    }

    // $FF: renamed from: a (android.view.View) void
    public static void method_1215(View var0) {
        field_1117.method_1150(var0);
    }

    // $FF: renamed from: a (android.view.View, android.content.res.ColorStateList) void
    public static void method_1216(View var0, ColorStateList var1) {
        field_1117.method_1151(var0, var1);
    }

    // $FF: renamed from: a (android.view.View, android.graphics.PorterDuff.Mode) void
    public static void method_1217(View var0, Mode var1) {
        field_1117.method_1152(var0, var1);
    }

    // $FF: renamed from: a (android.view.View, android.graphics.drawable.Drawable) void
    public static void method_1218(View var0, Drawable var1) {
        field_1117.method_1153(var0, var1);
    }

    // $FF: renamed from: a (android.view.View, android.support.v4.h.b) void
    public static void method_1219(View var0, class_42 var1) {
        field_1117.method_1154(var0, var1);
    }

    // $FF: renamed from: a (android.view.View, java.lang.Runnable) void
    public static void method_1220(View var0, Runnable var1) {
        field_1117.method_1155(var0, var1);
    }

    // $FF: renamed from: a (android.view.View, java.lang.Runnable, long) void
    public static void method_1221(View var0, Runnable var1, long var2) {
        field_1117.method_1156(var0, var1, var2);
    }

    // $FF: renamed from: b (android.view.View) int
    public static int method_1222(View var0) {
        return field_1117.method_1159(var0);
    }

    // $FF: renamed from: c (android.view.View) int
    public static int method_1223(View var0) {
        return field_1117.method_1157(var0);
    }

    // $FF: renamed from: d (android.view.View) int
    public static int method_1224(View var0) {
        return field_1117.method_1160(var0);
    }

    // $FF: renamed from: e (android.view.View) void
    public static void method_1225(View var0) {
        field_1117.method_1158(var0);
    }

    // $FF: renamed from: f (android.view.View) android.content.res.ColorStateList
    public static ColorStateList method_1226(View var0) {
        return field_1117.method_1163(var0);
    }

    // $FF: renamed from: g (android.view.View) android.graphics.PorterDuff.Mode
    public static Mode method_1227(View var0) {
        return field_1117.method_1164(var0);
    }

    // $FF: renamed from: h (android.view.View) void
    public static void method_1228(View var0) {
        field_1117.method_1162(var0);
    }

    // $FF: renamed from: i (android.view.View) boolean
    public static boolean method_1229(View var0) {
        return field_1117.method_1161(var0);
    }
}
