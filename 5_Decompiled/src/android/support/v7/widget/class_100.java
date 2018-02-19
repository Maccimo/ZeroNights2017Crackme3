package android.support.v7.widget;

import android.os.Build.VERSION;
import android.view.View;

// $FF: renamed from: android.support.v7.widget.am
public class class_100 {
    // $FF: renamed from: a android.support.v7.widget.am$c
    private static final am$c field_837;

    static {
        if (VERSION.SDK_INT >= 26) {
            field_837 = new am$a();
        } else {
            field_837 = new am$b();
        }

    }

    // $FF: renamed from: a (android.view.View, java.lang.CharSequence) void
    public static void method_885(View var0, CharSequence var1) {
        field_837.method_0(var0, var1);
    }
}
