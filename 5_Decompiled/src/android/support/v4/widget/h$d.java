package android.support.v4.widget;

import android.support.v4.h.class_142;
import android.support.v4.h.class_146;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

class h$d {
    // $FF: renamed from: a java.lang.reflect.Method
    private static Method field_933;
    // $FF: renamed from: b boolean
    private static boolean field_934;

    // $FF: renamed from: a (android.widget.PopupWindow, int) void
    public void method_943(PopupWindow var1, int var2) {
        if (!field_934) {
            try {
                field_933 = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                field_933.setAccessible(true);
            } catch (Exception var5) {
                ;
            }

            field_934 = true;
        }

        if (field_933 != null) {
            try {
                field_933.invoke(var1, var2);
            } catch (Exception var4) {
                ;
            }
        }

    }

    // $FF: renamed from: a (android.widget.PopupWindow, android.view.View, int, int, int) void
    public void method_944(PopupWindow var1, View var2, int var3, int var4, int var5) {
        int var6 = var3;
        if ((class_142.method_1195(var5, class_146.method_1222(var2)) & 7) == 5) {
            var6 = var3 - (var1.getWidth() - var2.getWidth());
        }

        var1.showAsDropDown(var2, var6, var4);
    }

    // $FF: renamed from: a (android.widget.PopupWindow, boolean) void
    public void method_945(PopupWindow var1, boolean var2) {
    }
}
