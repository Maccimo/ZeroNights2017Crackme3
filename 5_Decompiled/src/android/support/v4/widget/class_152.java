package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;

// $FF: renamed from: android.support.v4.widget.h
public final class class_152 {
    // $FF: renamed from: a android.support.v4.widget.h$d
    static final h$d field_1154;

    static {
        if (VERSION.SDK_INT >= 23) {
            field_1154 = new h$c();
        } else if (VERSION.SDK_INT >= 21) {
            field_1154 = new h$b();
        } else if (VERSION.SDK_INT >= 19) {
            field_1154 = new h$a();
        } else {
            field_1154 = new h$d();
        }

    }

    // $FF: renamed from: a (android.widget.PopupWindow, int) void
    public static void method_1278(PopupWindow var0, int var1) {
        field_1154.method_943(var0, var1);
    }

    // $FF: renamed from: a (android.widget.PopupWindow, android.view.View, int, int, int) void
    public static void method_1279(PopupWindow var0, View var1, int var2, int var3, int var4) {
        field_1154.method_944(var0, var1, var2, var3, var4);
    }

    // $FF: renamed from: a (android.widget.PopupWindow, boolean) void
    public static void method_1280(PopupWindow var0, boolean var1) {
        field_1154.method_945(var0, var1);
    }
}
