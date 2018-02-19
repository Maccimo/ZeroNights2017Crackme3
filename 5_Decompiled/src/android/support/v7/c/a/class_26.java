package android.support.v7.c.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.c.a.class_48;

// $FF: renamed from: android.support.v7.c.a.a
public class class_26 extends Drawable implements Callback {
    // $FF: renamed from: a android.graphics.drawable.Drawable
    private Drawable field_0;

    public class_26(Drawable var1) {
        this.method_165(var1);
    }

    // $FF: renamed from: a () android.graphics.drawable.Drawable
    public Drawable method_164() {
        return this.field_0;
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) void
    public void method_165(Drawable var1) {
        if (this.field_0 != null) {
            this.field_0.setCallback((Callback)null);
        }

        this.field_0 = var1;
        if (var1 != null) {
            var1.setCallback(this);
        }

    }

    public void draw(Canvas var1) {
        this.field_0.draw(var1);
    }

    public int getChangingConfigurations() {
        return this.field_0.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.field_0.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.field_0.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.field_0.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.field_0.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.field_0.getMinimumWidth();
    }

    public int getOpacity() {
        return this.field_0.getOpacity();
    }

    public boolean getPadding(Rect var1) {
        return this.field_0.getPadding(var1);
    }

    public int[] getState() {
        return this.field_0.getState();
    }

    public Region getTransparentRegion() {
        return this.field_0.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable var1) {
        this.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return class_48.method_528(this.field_0);
    }

    public boolean isStateful() {
        return this.field_0.isStateful();
    }

    public void jumpToCurrentState() {
        class_48.method_519(this.field_0);
    }

    protected void onBoundsChange(Rect var1) {
        this.field_0.setBounds(var1);
    }

    protected boolean onLevelChange(int var1) {
        return this.field_0.setLevel(var1);
    }

    public void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
        this.scheduleSelf(var2, var3);
    }

    public void setAlpha(int var1) {
        this.field_0.setAlpha(var1);
    }

    public void setAutoMirrored(boolean var1) {
        class_48.method_527(this.field_0, var1);
    }

    public void setChangingConfigurations(int var1) {
        this.field_0.setChangingConfigurations(var1);
    }

    public void setColorFilter(ColorFilter var1) {
        this.field_0.setColorFilter(var1);
    }

    public void setDither(boolean var1) {
        this.field_0.setDither(var1);
    }

    public void setFilterBitmap(boolean var1) {
        this.field_0.setFilterBitmap(var1);
    }

    public void setHotspot(float var1, float var2) {
        class_48.method_520(this.field_0, var1, var2);
    }

    public void setHotspotBounds(int var1, int var2, int var3, int var4) {
        class_48.method_522(this.field_0, var1, var2, var3, var4);
    }

    public boolean setState(int[] var1) {
        return this.field_0.setState(var1);
    }

    public void setTint(int var1) {
        class_48.method_521(this.field_0, var1);
    }

    public void setTintList(ColorStateList var1) {
        class_48.method_523(this.field_0, var1);
    }

    public void setTintMode(Mode var1) {
        class_48.method_526(this.field_0, var1);
    }

    public boolean setVisible(boolean var1, boolean var2) {
        if (!super.setVisible(var1, var2) && !this.field_0.setVisible(var1, var2)) {
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
