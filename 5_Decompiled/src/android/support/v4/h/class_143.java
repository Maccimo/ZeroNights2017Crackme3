package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.v4.d.a.class_12;
import android.util.Log;
import android.view.MenuItem;

// $FF: renamed from: android.support.v4.h.f
public final class class_143 {
    // $FF: renamed from: a android.support.v4.h.f$c
    static final f$c field_1113;

    static {
        if (VERSION.SDK_INT >= 26) {
            field_1113 = new f$a();
        } else {
            field_1113 = new f$b();
        }

    }

    // $FF: renamed from: a (android.view.MenuItem, android.support.v4.h.c) android.view.MenuItem
    public static MenuItem method_1196(MenuItem var0, class_129 var1) {
        if (var0 instanceof class_12) {
            var0 = ((class_12)var0).method_36(var1);
        } else {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }

        return (MenuItem)var0;
    }

    // $FF: renamed from: a (android.view.MenuItem, char, int) void
    public static void method_1197(MenuItem var0, char var1, int var2) {
        if (var0 instanceof class_12) {
            ((class_12)var0).setNumericShortcut(var1, var2);
        } else {
            field_1113.method_5(var0, var1, var2);
        }

    }

    // $FF: renamed from: a (android.view.MenuItem, android.content.res.ColorStateList) void
    public static void method_1198(MenuItem var0, ColorStateList var1) {
        if (var0 instanceof class_12) {
            ((class_12)var0).setIconTintList(var1);
        } else {
            field_1113.method_2(var0, var1);
        }

    }

    // $FF: renamed from: a (android.view.MenuItem, android.graphics.PorterDuff.Mode) void
    public static void method_1199(MenuItem var0, Mode var1) {
        if (var0 instanceof class_12) {
            ((class_12)var0).setIconTintMode(var1);
        } else {
            field_1113.method_3(var0, var1);
        }

    }

    // $FF: renamed from: a (android.view.MenuItem, java.lang.CharSequence) void
    public static void method_1200(MenuItem var0, CharSequence var1) {
        if (var0 instanceof class_12) {
            ((class_12)var0).method_37(var1);
        } else {
            field_1113.method_4(var0, var1);
        }

    }

    // $FF: renamed from: b (android.view.MenuItem, char, int) void
    public static void method_1201(MenuItem var0, char var1, int var2) {
        if (var0 instanceof class_12) {
            ((class_12)var0).setAlphabeticShortcut(var1, var2);
        } else {
            field_1113.method_1(var0, var1, var2);
        }

    }

    // $FF: renamed from: b (android.view.MenuItem, java.lang.CharSequence) void
    public static void method_1202(MenuItem var0, CharSequence var1) {
        if (var0 instanceof class_12) {
            ((class_12)var0).method_39(var1);
        } else {
            field_1113.method_6(var0, var1);
        }

    }
}
