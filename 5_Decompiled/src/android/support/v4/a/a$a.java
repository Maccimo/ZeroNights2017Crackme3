package android.support.v4.a;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class a$a {
    // $FF: renamed from: a java.lang.reflect.Method
    private static Method field_902;
    // $FF: renamed from: b boolean
    private static boolean field_903;

    // $FF: renamed from: a (android.os.Bundle, java.lang.String) android.os.IBinder
    public static IBinder method_930(Bundle var0, String var1) {
        if (!field_903) {
            try {
                field_902 = Bundle.class.getMethod("getIBinder", String.class);
                field_902.setAccessible(true);
            } catch (NoSuchMethodException var3) {
                Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", var3);
            }

            field_903 = true;
        }

        IBinder var8;
        if (field_902 != null) {
            Object var7;
            try {
                var8 = (IBinder)field_902.invoke(var0, var1);
                return var8;
            } catch (InvocationTargetException var4) {
                var7 = var4;
            } catch (IllegalAccessException var5) {
                var7 = var5;
            } catch (IllegalArgumentException var6) {
                var7 = var6;
            }

            Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", (Throwable)var7);
            field_902 = null;
        }

        var8 = null;
        return var8;
    }
}
