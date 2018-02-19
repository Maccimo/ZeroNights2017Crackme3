package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

class n$f extends n$e {
    // $FF: renamed from: a (android.view.View, android.content.res.ColorStateList) void
    public void method_1151(View var1, ColorStateList var2) {
        var1.setBackgroundTintList(var2);
        if (VERSION.SDK_INT == 21) {
            Drawable var4 = var1.getBackground();
            boolean var3;
            if (var1.getBackgroundTintList() != null && var1.getBackgroundTintMode() != null) {
                var3 = true;
            } else {
                var3 = false;
            }

            if (var4 != null && var3) {
                if (var4.isStateful()) {
                    var4.setState(var1.getDrawableState());
                }

                var1.setBackground(var4);
            }
        }

    }

    // $FF: renamed from: a (android.view.View, android.graphics.PorterDuff.Mode) void
    public void method_1152(View var1, Mode var2) {
        var1.setBackgroundTintMode(var2);
        if (VERSION.SDK_INT == 21) {
            Drawable var4 = var1.getBackground();
            boolean var3;
            if (var1.getBackgroundTintList() != null && var1.getBackgroundTintMode() != null) {
                var3 = true;
            } else {
                var3 = false;
            }

            if (var4 != null && var3) {
                if (var4.isStateful()) {
                    var4.setState(var1.getDrawableState());
                }

                var1.setBackground(var4);
            }
        }

    }

    // $FF: renamed from: c (android.view.View) void
    public void method_1158(View var1) {
        var1.requestApplyInsets();
    }

    // $FF: renamed from: g (android.view.View) void
    public void method_1162(View var1) {
        var1.stopNestedScroll();
    }

    // $FF: renamed from: h (android.view.View) android.content.res.ColorStateList
    public ColorStateList method_1163(View var1) {
        return var1.getBackgroundTintList();
    }

    // $FF: renamed from: i (android.view.View) android.graphics.PorterDuff.Mode
    public Mode method_1164(View var1) {
        return var1.getBackgroundTintMode();
    }
}
