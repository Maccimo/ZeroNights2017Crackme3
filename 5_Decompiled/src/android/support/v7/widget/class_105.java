package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.h.class_146;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

// $FF: renamed from: android.support.v7.widget.aq
public class class_105 {
    // $FF: renamed from: a java.lang.reflect.Method
    private static Method field_869;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                field_869 = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (!field_869.isAccessible()) {
                    field_869.setAccessible(true);
                }
            } catch (NoSuchMethodException var1) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }

    }

    // $FF: renamed from: a (android.view.View, android.graphics.Rect, android.graphics.Rect) void
    public static void method_911(View var0, Rect var1, Rect var2) {
        if (field_869 != null) {
            try {
                field_869.invoke(var0, var1, var2);
            } catch (Exception var3) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", var3);
            }
        }

    }

    // $FF: renamed from: a (android.view.View) boolean
    public static boolean method_912(View var0) {
        boolean var1 = true;
        if (class_146.method_1222(var0) != 1) {
            var1 = false;
        }

        return var1;
    }
}
