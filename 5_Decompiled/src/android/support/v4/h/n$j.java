package android.support.v4.h;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class n$j {
    // $FF: renamed from: b boolean
    static boolean field_1089 = false;
    // $FF: renamed from: c java.lang.reflect.Field
    private static Field field_1090;
    // $FF: renamed from: d boolean
    private static boolean field_1091;
    // $FF: renamed from: a java.util.WeakHashMap
    WeakHashMap field_1092 = null;

    // $FF: renamed from: a () long
    long method_1149() {
        return ValueAnimator.getFrameDelay();
    }

    // $FF: renamed from: a (android.view.View) void
    public void method_1150(View var1) {
        var1.postInvalidate();
    }

    // $FF: renamed from: a (android.view.View, android.content.res.ColorStateList) void
    public void method_1151(View var1, ColorStateList var2) {
        if (var1 instanceof class_18) {
            ((class_18)var1).setSupportBackgroundTintList(var2);
        }

    }

    // $FF: renamed from: a (android.view.View, android.graphics.PorterDuff.Mode) void
    public void method_1152(View var1, Mode var2) {
        if (var1 instanceof class_18) {
            ((class_18)var1).setSupportBackgroundTintMode(var2);
        }

    }

    // $FF: renamed from: a (android.view.View, android.graphics.drawable.Drawable) void
    public void method_1153(View var1, Drawable var2) {
        var1.setBackgroundDrawable(var2);
    }

    // $FF: renamed from: a (android.view.View, android.support.v4.h.b) void
    public void method_1154(View var1, class_42 var2) {
        AccessibilityDelegate var3;
        if (var2 == null) {
            var3 = null;
        } else {
            var3 = var2.method_432();
        }

        var1.setAccessibilityDelegate(var3);
    }

    // $FF: renamed from: a (android.view.View, java.lang.Runnable) void
    public void method_1155(View var1, Runnable var2) {
        var1.postDelayed(var2, this.method_1149());
    }

    // $FF: renamed from: a (android.view.View, java.lang.Runnable, long) void
    public void method_1156(View var1, Runnable var2, long var3) {
        var1.postDelayed(var2, this.method_1149() + var3);
    }

    // $FF: renamed from: b (android.view.View) int
    public int method_1157(View var1) {
        if (!field_1091) {
            try {
                field_1090 = View.class.getDeclaredField("mMinHeight");
                field_1090.setAccessible(true);
            } catch (NoSuchFieldException var4) {
                ;
            }

            field_1091 = true;
        }

        int var2;
        if (field_1090 != null) {
            try {
                var2 = (Integer)field_1090.get(var1);
                return var2;
            } catch (Exception var5) {
                ;
            }
        }

        var2 = 0;
        return var2;
    }

    // $FF: renamed from: c (android.view.View) void
    public void method_1158(View var1) {
    }

    // $FF: renamed from: d (android.view.View) int
    public int method_1159(View var1) {
        return 0;
    }

    // $FF: renamed from: e (android.view.View) int
    public int method_1160(View var1) {
        return 0;
    }

    // $FF: renamed from: f (android.view.View) boolean
    public boolean method_1161(View var1) {
        boolean var2;
        if (var1.getWindowToken() != null) {
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    // $FF: renamed from: g (android.view.View) void
    public void method_1162(View var1) {
        if (var1 instanceof class_16) {
            ((class_16)var1).stopNestedScroll();
        }

    }

    // $FF: renamed from: h (android.view.View) android.content.res.ColorStateList
    public ColorStateList method_1163(View var1) {
        ColorStateList var2;
        if (var1 instanceof class_18) {
            var2 = ((class_18)var1).getSupportBackgroundTintList();
        } else {
            var2 = null;
        }

        return var2;
    }

    // $FF: renamed from: i (android.view.View) android.graphics.PorterDuff.Mode
    public Mode method_1164(View var1) {
        Mode var2;
        if (var1 instanceof class_18) {
            var2 = ((class_18)var1).getSupportBackgroundTintMode();
        } else {
            var2 = null;
        }

        return var2;
    }
}
