package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

// $FF: renamed from: android.support.v4.h.e
public final class class_141 {
    // $FF: renamed from: a (android.view.ViewGroup.MarginLayoutParams) int
    public static int method_1193(MarginLayoutParams var0) {
        int var1;
        if (VERSION.SDK_INT >= 17) {
            var1 = var0.getMarginStart();
        } else {
            var1 = var0.leftMargin;
        }

        return var1;
    }

    // $FF: renamed from: b (android.view.ViewGroup.MarginLayoutParams) int
    public static int method_1194(MarginLayoutParams var0) {
        int var1;
        if (VERSION.SDK_INT >= 17) {
            var1 = var0.getMarginEnd();
        } else {
            var1 = var0.rightMargin;
        }

        return var1;
    }
}
