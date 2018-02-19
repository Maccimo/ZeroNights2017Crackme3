package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.h.class_18;
import android.widget.EditText;

// $FF: renamed from: android.support.v7.widget.i
public class class_77 extends EditText implements class_18 {
    // $FF: renamed from: a android.support.v7.widget.g
    private final class_75 field_708;
    // $FF: renamed from: b android.support.v7.widget.n
    private final class_60 field_709;

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.field_708 != null) {
            this.field_708.method_749();
        }

        if (this.field_709 != null) {
            this.field_709.method_593();
        }

    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList var1;
        if (this.field_708 != null) {
            var1 = this.field_708.method_741();
        } else {
            var1 = null;
        }

        return var1;
    }

    public Mode getSupportBackgroundTintMode() {
        Mode var1;
        if (this.field_708 != null) {
            var1 = this.field_708.method_747();
        } else {
            var1 = null;
        }

        return var1;
    }

    public void setBackgroundDrawable(Drawable var1) {
        super.setBackgroundDrawable(var1);
        if (this.field_708 != null) {
            this.field_708.method_745(var1);
        }

    }

    public void setBackgroundResource(int var1) {
        super.setBackgroundResource(var1);
        if (this.field_708 != null) {
            this.field_708.method_742(var1);
        }

    }

    public void setSupportBackgroundTintList(ColorStateList var1) {
        if (this.field_708 != null) {
            this.field_708.method_743(var1);
        }

    }

    public void setSupportBackgroundTintMode(Mode var1) {
        if (this.field_708 != null) {
            this.field_708.method_744(var1);
        }

    }

    public void setTextAppearance(Context var1, int var2) {
        super.setTextAppearance(var1, var2);
        if (this.field_709 != null) {
            this.field_709.method_597(var1, var2);
        }

    }
}
