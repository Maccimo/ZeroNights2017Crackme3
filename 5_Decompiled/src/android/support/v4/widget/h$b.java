package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

class h$b extends h$a {
    // $FF: renamed from: a java.lang.reflect.Field
    private static Field field_935;

    static {
        try {
            field_935 = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            field_935.setAccessible(true);
        } catch (NoSuchFieldException var1) {
            Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", var1);
        }

    }

    // $FF: renamed from: a (android.widget.PopupWindow, boolean) void
    public void method_945(PopupWindow var1, boolean var2) {
        if (field_935 != null) {
            try {
                field_935.set(var1, var2);
            } catch (IllegalAccessException var3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", var3);
            }
        }

    }
}
