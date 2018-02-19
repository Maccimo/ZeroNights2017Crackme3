package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public abstract class c$a extends ConstantState {
    // $FF: renamed from: a int
    int field_739;
    // $FF: renamed from: b android.graphics.drawable.Drawable.ConstantState
    ConstantState field_740;
    // $FF: renamed from: c android.content.res.ColorStateList
    ColorStateList field_741 = null;
    // $FF: renamed from: d android.graphics.PorterDuff.Mode
    Mode field_742;

    c$a(c$a var1, Resources var2) {
        this.field_742 = class_57.field_549;
        if (var1 != null) {
            this.field_739 = var1.field_739;
            this.field_740 = var1.field_740;
            this.field_741 = var1.field_741;
            this.field_742 = var1.field_742;
        }

    }

    // $FF: renamed from: a () boolean
    boolean method_807() {
        boolean var1;
        if (this.field_740 != null) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public int getChangingConfigurations() {
        int var2 = this.field_739;
        int var1;
        if (this.field_740 != null) {
            var1 = this.field_740.getChangingConfigurations();
        } else {
            var1 = 0;
        }

        return var1 | var2;
    }

    public Drawable newDrawable() {
        return this.newDrawable((Resources)null);
    }

    public abstract Drawable newDrawable(Resources var1);
}
