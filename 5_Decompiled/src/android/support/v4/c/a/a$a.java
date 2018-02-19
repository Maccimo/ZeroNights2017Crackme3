package android.support.v4.c.a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

class a$a extends a$e {
    // $FF: renamed from: a java.lang.reflect.Method
    private static Method field_1060;
    // $FF: renamed from: b boolean
    private static boolean field_1061;

    // $FF: renamed from: a (android.graphics.drawable.Drawable) int
    public int method_1076(Drawable var1) {
        if (!field_1061) {
            try {
                field_1060 = Drawable.class.getDeclaredMethod("getLayoutDirection");
                field_1060.setAccessible(true);
            } catch (NoSuchMethodException var4) {
                Log.i("DrawableCompatApi17", "Failed to retrieve getLayoutDirection() method", var4);
            }

            field_1061 = true;
        }

        int var2;
        if (field_1060 != null) {
            try {
                var2 = (Integer)field_1060.invoke(var1);
                return var2;
            } catch (Exception var5) {
                Log.i("DrawableCompatApi17", "Failed to invoke getLayoutDirection() via reflection", var5);
                field_1060 = null;
            }
        }

        var2 = 0;
        return var2;
    }
}
