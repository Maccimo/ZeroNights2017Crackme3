package android.support.b.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.graphics.drawable.Drawable.ConstantState;

class i$g extends ConstantState {
    // $FF: renamed from: a android.graphics.drawable.Drawable.ConstantState
    private final ConstantState field_282;

    public i$g(ConstantState var1) {
        this.field_282 = var1;
    }

    public boolean canApplyTheme() {
        return this.field_282.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.field_282.getChangingConfigurations();
    }

    public Drawable newDrawable() {
        class_51 var1 = new class_51();
        var1.b = (VectorDrawable)this.field_282.newDrawable();
        return var1;
    }

    public Drawable newDrawable(Resources var1) {
        class_51 var2 = new class_51();
        var2.b = (VectorDrawable)this.field_282.newDrawable(var1);
        return var2;
    }

    public Drawable newDrawable(Resources var1, Theme var2) {
        class_51 var3 = new class_51();
        var3.b = (VectorDrawable)this.field_282.newDrawable(var1, var2);
        return var3;
    }
}
