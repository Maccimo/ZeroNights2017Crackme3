package android.support.b.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class c$b extends ConstantState {
    // $FF: renamed from: a android.graphics.drawable.Drawable.ConstantState
    private final ConstantState field_529;

    public c$b(ConstantState var1) {
        this.field_529 = var1;
    }

    public boolean canApplyTheme() {
        return this.field_529.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.field_529.getChangingConfigurations();
    }

    public Drawable newDrawable() {
        class_50 var1 = new class_50();
        var1.b = this.field_529.newDrawable();
        var1.b.setCallback(var1.field_510);
        return var1;
    }

    public Drawable newDrawable(Resources var1) {
        class_50 var2 = new class_50();
        var2.b = this.field_529.newDrawable(var1);
        var2.b.setCallback(var2.field_510);
        return var2;
    }

    public Drawable newDrawable(Resources var1, Theme var2) {
        class_50 var3 = new class_50();
        var3.b = this.field_529.newDrawable(var1, var2);
        var3.b.setCallback(var3.field_510);
        return var3;
    }
}
