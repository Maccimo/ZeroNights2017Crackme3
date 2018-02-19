package android.support.b.a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.class_48;
import android.support.v4.c.a.class_5;

// $FF: renamed from: android.support.b.a.h
abstract class class_49 extends Drawable implements class_5 {
    // $FF: renamed from: b android.graphics.drawable.Drawable
    Drawable field_509;

    public void applyTheme(Theme var1) {
        if (this.field_509 != null) {
            class_48.method_524(this.field_509, var1);
        }

    }

    public void clearColorFilter() {
        if (this.field_509 != null) {
            this.field_509.clearColorFilter();
        } else {
            super.clearColorFilter();
        }

    }

    public ColorFilter getColorFilter() {
        ColorFilter var1;
        if (this.field_509 != null) {
            var1 = class_48.method_531(this.field_509);
        } else {
            var1 = null;
        }

        return var1;
    }

    public Drawable getCurrent() {
        Drawable var1;
        if (this.field_509 != null) {
            var1 = this.field_509.getCurrent();
        } else {
            var1 = super.getCurrent();
        }

        return var1;
    }

    public int getMinimumHeight() {
        int var1;
        if (this.field_509 != null) {
            var1 = this.field_509.getMinimumHeight();
        } else {
            var1 = super.getMinimumHeight();
        }

        return var1;
    }

    public int getMinimumWidth() {
        int var1;
        if (this.field_509 != null) {
            var1 = this.field_509.getMinimumWidth();
        } else {
            var1 = super.getMinimumWidth();
        }

        return var1;
    }

    public boolean getPadding(Rect var1) {
        boolean var2;
        if (this.field_509 != null) {
            var2 = this.field_509.getPadding(var1);
        } else {
            var2 = super.getPadding(var1);
        }

        return var2;
    }

    public int[] getState() {
        int[] var1;
        if (this.field_509 != null) {
            var1 = this.field_509.getState();
        } else {
            var1 = super.getState();
        }

        return var1;
    }

    public Region getTransparentRegion() {
        Region var1;
        if (this.field_509 != null) {
            var1 = this.field_509.getTransparentRegion();
        } else {
            var1 = super.getTransparentRegion();
        }

        return var1;
    }

    public void jumpToCurrentState() {
        if (this.field_509 != null) {
            class_48.method_519(this.field_509);
        }

    }

    protected void onBoundsChange(Rect var1) {
        if (this.field_509 != null) {
            this.field_509.setBounds(var1);
        } else {
            super.onBoundsChange(var1);
        }

    }

    protected boolean onLevelChange(int var1) {
        boolean var2;
        if (this.field_509 != null) {
            var2 = this.field_509.setLevel(var1);
        } else {
            var2 = super.onLevelChange(var1);
        }

        return var2;
    }

    public void setChangingConfigurations(int var1) {
        if (this.field_509 != null) {
            this.field_509.setChangingConfigurations(var1);
        } else {
            super.setChangingConfigurations(var1);
        }

    }

    public void setColorFilter(int var1, Mode var2) {
        if (this.field_509 != null) {
            this.field_509.setColorFilter(var1, var2);
        } else {
            super.setColorFilter(var1, var2);
        }

    }

    public void setFilterBitmap(boolean var1) {
        if (this.field_509 != null) {
            this.field_509.setFilterBitmap(var1);
        }

    }

    public void setHotspot(float var1, float var2) {
        if (this.field_509 != null) {
            class_48.method_520(this.field_509, var1, var2);
        }

    }

    public void setHotspotBounds(int var1, int var2, int var3, int var4) {
        if (this.field_509 != null) {
            class_48.method_522(this.field_509, var1, var2, var3, var4);
        }

    }

    public boolean setState(int[] var1) {
        boolean var2;
        if (this.field_509 != null) {
            var2 = this.field_509.setState(var1);
        } else {
            var2 = super.setState(var1);
        }

        return var2;
    }
}
