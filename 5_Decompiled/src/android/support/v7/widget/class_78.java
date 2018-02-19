package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.class_152;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

// $FF: renamed from: android.support.v7.widget.l
class class_78 extends PopupWindow {
    // $FF: renamed from: a boolean
    private static final boolean field_710;
    // $FF: renamed from: b boolean
    private boolean field_711;

    static {
        boolean var0;
        if (VERSION.SDK_INT < 21) {
            var0 = true;
        } else {
            var0 = false;
        }

        field_710 = var0;
    }

    public class_78(Context var1, AttributeSet var2, int var3, int var4) {
        super(var1, var2, var3, var4);
        this.method_750(var1, var2, var3, var4);
    }

    // $FF: renamed from: a (android.content.Context, android.util.AttributeSet, int, int) void
    private void method_750(Context var1, AttributeSet var2, int var3, int var4) {
        class_97 var5 = class_97.method_867(var1, var2, a$j.PopupWindow, var3, var4);
        if (var5.method_883(a$j.PopupWindow_overlapAnchor)) {
            this.method_752(var5.method_873(a$j.PopupWindow_overlapAnchor, false));
        }

        this.setBackgroundDrawable(var5.method_871(a$j.PopupWindow_android_popupBackground));
        var3 = VERSION.SDK_INT;
        if (var4 != 0 && var3 < 11 && var5.method_883(a$j.PopupWindow_android_popupAnimationStyle)) {
            this.setAnimationStyle(var5.method_884(a$j.PopupWindow_android_popupAnimationStyle, -1));
        }

        var5.method_872();
        if (VERSION.SDK_INT < 14) {
            method_751(this);
        }

    }

    // $FF: renamed from: a (android.widget.PopupWindow) void
    private static void method_751(final PopupWindow var0) {
        try {
            final Field var3 = PopupWindow.class.getDeclaredField("mAnchor");
            var3.setAccessible(true);
            Field var4 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            var4.setAccessible(true);
            final OnScrollChangedListener var1 = (OnScrollChangedListener)var4.get(var0);
            OnScrollChangedListener var2 = new OnScrollChangedListener() {
                public void onScrollChanged() {
                    // $FF: Couldn't be decompiled
                }
            };
            var4.set(var0, var2);
        } catch (Exception var5) {
            Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", var5);
        }

    }

    // $FF: renamed from: a (boolean) void
    public void method_752(boolean var1) {
        if (field_710) {
            this.field_711 = var1;
        } else {
            class_152.method_1280(this, var1);
        }

    }

    public void showAsDropDown(View var1, int var2, int var3) {
        int var4 = var3;
        if (field_710) {
            var4 = var3;
            if (this.field_711) {
                var4 = var3 - var1.getHeight();
            }
        }

        super.showAsDropDown(var1, var2, var4);
    }

    public void showAsDropDown(View var1, int var2, int var3, int var4) {
        int var5 = var3;
        if (field_710) {
            var5 = var3;
            if (this.field_711) {
                var5 = var3 - var1.getHeight();
            }
        }

        super.showAsDropDown(var1, var2, var5, var4);
    }

    public void update(View var1, int var2, int var3, int var4, int var5) {
        if (field_710 && this.field_711) {
            var3 -= var1.getHeight();
        }

        super.update(var1, var2, var3, var4, var5);
    }
}
