package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

// $FF: renamed from: android.support.v4.c.a.c
class class_57 extends Drawable implements Callback, class_3, class_5 {
    // $FF: renamed from: a android.graphics.PorterDuff.Mode
    static final Mode field_549;
    // $FF: renamed from: b android.support.v4.c.a.c$a
    c$a field_550;
    // $FF: renamed from: c android.graphics.drawable.Drawable
    Drawable field_551;
    // $FF: renamed from: d int
    private int field_552;
    // $FF: renamed from: e android.graphics.PorterDuff.Mode
    private Mode field_553;
    // $FF: renamed from: f boolean
    private boolean field_554;
    // $FF: renamed from: g boolean
    private boolean field_555;

    static {
        field_549 = Mode.SRC_IN;
    }

    class_57(Drawable var1) {
        this.field_550 = this.method_585();
        this.method_584(var1);
    }

    class_57(c$a var1, Resources var2) {
        this.field_550 = var1;
        this.method_581(var2);
    }

    // $FF: renamed from: a (android.content.res.Resources) void
    private void method_581(Resources var1) {
        if (this.field_550 != null && this.field_550.field_740 != null) {
            this.method_584(this.method_583(this.field_550.field_740, var1));
        }

    }

    // $FF: renamed from: a (int[]) boolean
    private boolean method_582(int[] var1) {
        boolean var3 = false;
        if (this.method_586()) {
            ColorStateList var4 = this.field_550.field_741;
            Mode var5 = this.field_550.field_742;
            if (var4 != null && var5 != null) {
                int var2 = var4.getColorForState(var1, var4.getDefaultColor());
                if (!this.field_554 || var2 != this.field_552 || var5 != this.field_553) {
                    this.setColorFilter(var2, var5);
                    this.field_552 = var2;
                    this.field_553 = var5;
                    this.field_554 = true;
                    var3 = true;
                }
            } else {
                this.field_554 = false;
                this.clearColorFilter();
            }
        }

        return var3;
    }

    // $FF: renamed from: a () android.graphics.drawable.Drawable
    public final Drawable method_20() {
        return this.field_551;
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable.ConstantState, android.content.res.Resources) android.graphics.drawable.Drawable
    protected Drawable method_583(ConstantState var1, Resources var2) {
        return var1.newDrawable(var2);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) void
    public final void method_584(Drawable var1) {
        if (this.field_551 != null) {
            this.field_551.setCallback((Callback)null);
        }

        this.field_551 = var1;
        if (var1 != null) {
            var1.setCallback(this);
            this.setVisible(var1.isVisible(), true);
            this.setState(var1.getState());
            this.setLevel(var1.getLevel());
            this.setBounds(var1.getBounds());
            if (this.field_550 != null) {
                this.field_550.field_740 = var1.getConstantState();
            }
        }

        this.invalidateSelf();
    }

    // $FF: renamed from: b () android.support.v4.c.a.c$a
    c$a method_585() {
        return new c$b(this.field_550, (Resources)null);
    }

    // $FF: renamed from: c () boolean
    protected boolean method_586() {
        return true;
    }

    public void draw(Canvas var1) {
        this.field_551.draw(var1);
    }

    public int getChangingConfigurations() {
        int var2 = super.getChangingConfigurations();
        int var1;
        if (this.field_550 != null) {
            var1 = this.field_550.getChangingConfigurations();
        } else {
            var1 = 0;
        }

        return var1 | var2 | this.field_551.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        c$a var1;
        if (this.field_550 != null && this.field_550.method_807()) {
            this.field_550.field_739 = this.getChangingConfigurations();
            var1 = this.field_550;
        } else {
            var1 = null;
        }

        return var1;
    }

    public Drawable getCurrent() {
        return this.field_551.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.field_551.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.field_551.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.field_551.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.field_551.getMinimumWidth();
    }

    public int getOpacity() {
        return this.field_551.getOpacity();
    }

    public boolean getPadding(Rect var1) {
        return this.field_551.getPadding(var1);
    }

    public int[] getState() {
        return this.field_551.getState();
    }

    public Region getTransparentRegion() {
        return this.field_551.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable var1) {
        this.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList var2;
        if (this.method_586() && this.field_550 != null) {
            var2 = this.field_550.field_741;
        } else {
            var2 = null;
        }

        boolean var1;
        if ((var2 == null || !var2.isStateful()) && !this.field_551.isStateful()) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    public void jumpToCurrentState() {
        this.field_551.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.field_555 && super.mutate() == this) {
            this.field_550 = this.method_585();
            if (this.field_551 != null) {
                this.field_551.mutate();
            }

            if (this.field_550 != null) {
                c$a var2 = this.field_550;
                ConstantState var1;
                if (this.field_551 != null) {
                    var1 = this.field_551.getConstantState();
                } else {
                    var1 = null;
                }

                var2.field_740 = var1;
            }

            this.field_555 = true;
        }

        return this;
    }

    protected void onBoundsChange(Rect var1) {
        if (this.field_551 != null) {
            this.field_551.setBounds(var1);
        }

    }

    protected boolean onLevelChange(int var1) {
        return this.field_551.setLevel(var1);
    }

    public void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
        this.scheduleSelf(var2, var3);
    }

    public void setAlpha(int var1) {
        this.field_551.setAlpha(var1);
    }

    public void setChangingConfigurations(int var1) {
        this.field_551.setChangingConfigurations(var1);
    }

    public void setColorFilter(ColorFilter var1) {
        this.field_551.setColorFilter(var1);
    }

    public void setDither(boolean var1) {
        this.field_551.setDither(var1);
    }

    public void setFilterBitmap(boolean var1) {
        this.field_551.setFilterBitmap(var1);
    }

    public boolean setState(int[] var1) {
        boolean var2 = this.field_551.setState(var1);
        if (!this.method_582(var1) && !var2) {
            var2 = false;
        } else {
            var2 = true;
        }

        return var2;
    }

    public void setTint(int var1) {
        this.setTintList(ColorStateList.valueOf(var1));
    }

    public void setTintList(ColorStateList var1) {
        this.field_550.field_741 = var1;
        this.method_582(this.getState());
    }

    public void setTintMode(Mode var1) {
        this.field_550.field_742 = var1;
        this.method_582(this.getState());
    }

    public boolean setVisible(boolean var1, boolean var2) {
        if (!super.setVisible(var1, var2) && !this.field_551.setVisible(var1, var2)) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    public void unscheduleDrawable(Drawable var1, Runnable var2) {
        this.unscheduleSelf(var2);
    }
}
