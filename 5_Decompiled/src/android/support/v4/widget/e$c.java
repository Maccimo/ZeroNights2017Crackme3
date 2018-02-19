package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

class e$c extends e$a {
    // $FF: renamed from: a (android.widget.ImageView) android.content.res.ColorStateList
    public ColorStateList method_16(ImageView var1) {
        return var1.getImageTintList();
    }

    // $FF: renamed from: a (android.widget.ImageView, android.content.res.ColorStateList) void
    public void method_17(ImageView var1, ColorStateList var2) {
        var1.setImageTintList(var2);
        if (VERSION.SDK_INT == 21) {
            Drawable var4 = var1.getDrawable();
            boolean var3;
            if (var1.getImageTintList() != null && var1.getImageTintMode() != null) {
                var3 = true;
            } else {
                var3 = false;
            }

            if (var4 != null && var3) {
                if (var4.isStateful()) {
                    var4.setState(var1.getDrawableState());
                }

                var1.setImageDrawable(var4);
            }
        }

    }

    // $FF: renamed from: a (android.widget.ImageView, android.graphics.PorterDuff.Mode) void
    public void method_18(ImageView var1, Mode var2) {
        var1.setImageTintMode(var2);
        if (VERSION.SDK_INT == 21) {
            Drawable var4 = var1.getDrawable();
            boolean var3;
            if (var1.getImageTintList() != null && var1.getImageTintMode() != null) {
                var3 = true;
            } else {
                var3 = false;
            }

            if (var4 != null && var3) {
                if (var4.isStateful()) {
                    var4.setState(var1.getDrawableState());
                }

                var1.setImageDrawable(var4);
            }
        }

    }

    // $FF: renamed from: b (android.widget.ImageView) android.graphics.PorterDuff.Mode
    public Mode method_19(ImageView var1) {
        return var1.getImageTintMode();
    }
}
