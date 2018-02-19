package android.support.v7.widget;

import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.os.Build.VERSION;
import android.support.v4.c.a.class_3;
import android.support.v7.c.a.class_26;

// $FF: renamed from: android.support.v7.widget.s
public class class_67 {
    // $FF: renamed from: a android.graphics.Rect
    public static final Rect field_621 = new Rect();
    // $FF: renamed from: b java.lang.Class
    private static Class field_622;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                field_622 = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException var1) {
                ;
            }
        }

    }

    // $FF: renamed from: a (int, android.graphics.PorterDuff.Mode) android.graphics.PorterDuff.Mode
    public static Mode method_655(int var0, Mode var1) {
        Mode var2 = var1;
        switch(var0) {
        case 3:
            var2 = Mode.SRC_OVER;
        case 4:
        case 6:
        case 7:
        case 8:
        case 10:
        case 11:
        case 12:
        case 13:
            break;
        case 5:
            var2 = Mode.SRC_IN;
            break;
        case 9:
            var2 = Mode.SRC_ATOP;
            break;
        case 14:
            var2 = Mode.MULTIPLY;
            break;
        case 15:
            var2 = Mode.SCREEN;
            break;
        case 16:
            var2 = var1;
            if (VERSION.SDK_INT >= 11) {
                var2 = Mode.valueOf("ADD");
            }
            break;
        default:
            var2 = var1;
        }

        return var2;
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) void
    static void method_656(Drawable var0) {
        if (VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(var0.getClass().getName())) {
            method_658(var0);
        }

    }

    // $FF: renamed from: b (android.graphics.drawable.Drawable) boolean
    public static boolean method_657(Drawable var0) {
        boolean var3;
        if (VERSION.SDK_INT < 15 && var0 instanceof InsetDrawable) {
            var3 = false;
        } else if (VERSION.SDK_INT < 15 && var0 instanceof GradientDrawable) {
            var3 = false;
        } else if (VERSION.SDK_INT < 17 && var0 instanceof LayerDrawable) {
            var3 = false;
        } else {
            if (var0 instanceof DrawableContainer) {
                ConstantState var4 = var0.getConstantState();
                if (var4 instanceof DrawableContainerState) {
                    Drawable[] var5 = ((DrawableContainerState)var4).getChildren();
                    int var2 = var5.length;

                    for(int var1 = 0; var1 < var2; ++var1) {
                        if (!method_657(var5[var1])) {
                            var3 = false;
                            return var3;
                        }
                    }
                }
            } else {
                if (var0 instanceof class_3) {
                    var3 = method_657(((class_3)var0).method_20());
                    return var3;
                }

                if (var0 instanceof class_26) {
                    var3 = method_657(((class_26)var0).method_164());
                    return var3;
                }

                if (var0 instanceof ScaleDrawable) {
                    var3 = method_657(((ScaleDrawable)var0).getDrawable());
                    return var3;
                }
            }

            var3 = true;
        }

        return var3;
    }

    // $FF: renamed from: c (android.graphics.drawable.Drawable) void
    private static void method_658(Drawable var0) {
        int[] var1 = var0.getState();
        if (var1 != null && var1.length != 0) {
            var0.setState(class_94.field_820);
        } else {
            var0.setState(class_94.field_817);
        }

        var0.setState(var1);
    }
}
