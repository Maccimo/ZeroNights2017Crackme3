package android.support.v4.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Build.VERSION;

// $FF: renamed from: android.support.v4.a.a
public final class class_43 {
    // $FF: renamed from: a (android.os.Bundle, java.lang.String) android.os.IBinder
    public static IBinder method_462(Bundle var0, String var1) {
        IBinder var2;
        if (VERSION.SDK_INT >= 18) {
            var2 = var0.getBinder(var1);
        } else {
            var2 = a$a.method_930(var0, var1);
        }

        return var2;
    }
}
