package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

// $FF: renamed from: android.support.v4.widget.d
public final class class_155 {
    // $FF: renamed from: a android.support.v4.widget.d$b
    private static final d$b field_1157;

    static {
        if (VERSION.SDK_INT >= 21) {
            field_1157 = new d$a();
        } else {
            field_1157 = new d$b();
        }

    }

    // $FF: renamed from: a (android.widget.EdgeEffect, float, float) void
    public static void method_1285(EdgeEffect var0, float var1, float var2) {
        field_1157.method_1254(var0, var1, var2);
    }
}
