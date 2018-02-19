package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.Gravity;

// $FF: renamed from: android.support.v4.h.d
public final class class_142 {
    // $FF: renamed from: a (int, int) int
    public static int method_1195(int var0, int var1) {
        if (VERSION.SDK_INT >= 17) {
            var0 = Gravity.getAbsoluteGravity(var0, var1);
        } else {
            var0 &= -8388609;
        }

        return var0;
    }
}
