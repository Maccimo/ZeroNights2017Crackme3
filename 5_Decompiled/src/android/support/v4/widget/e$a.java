package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;

class e$a implements e$b {
    // $FF: renamed from: a (android.widget.ImageView) android.content.res.ColorStateList
    public ColorStateList method_16(ImageView var1) {
        ColorStateList var2;
        if (var1 instanceof class_21) {
            var2 = ((class_21)var1).getSupportImageTintList();
        } else {
            var2 = null;
        }

        return var2;
    }

    // $FF: renamed from: a (android.widget.ImageView, android.content.res.ColorStateList) void
    public void method_17(ImageView var1, ColorStateList var2) {
        if (var1 instanceof class_21) {
            ((class_21)var1).setSupportImageTintList(var2);
        }

    }

    // $FF: renamed from: a (android.widget.ImageView, android.graphics.PorterDuff.Mode) void
    public void method_18(ImageView var1, Mode var2) {
        if (var1 instanceof class_21) {
            ((class_21)var1).setSupportImageTintMode(var2);
        }

    }

    // $FF: renamed from: b (android.widget.ImageView) android.graphics.PorterDuff.Mode
    public Mode method_19(ImageView var1) {
        Mode var2;
        if (var1 instanceof class_21) {
            var2 = ((class_21)var1).getSupportImageTintMode();
        } else {
            var2 = null;
        }

        return var2;
    }
}
