package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.c.a.class_26;

class y$a extends class_26 {
    // $FF: renamed from: a boolean
    private boolean field_1 = true;

    public y$a(Drawable var1) {
        super(var1);
    }

    // $FF: renamed from: a (boolean) void
    void method_166(boolean var1) {
        this.field_1 = var1;
    }

    public void draw(Canvas var1) {
        if (this.field_1) {
            super.draw(var1);
        }

    }

    public void setHotspot(float var1, float var2) {
        if (this.field_1) {
            super.setHotspot(var1, var2);
        }

    }

    public void setHotspotBounds(int var1, int var2, int var3, int var4) {
        if (this.field_1) {
            super.setHotspotBounds(var1, var2, var3, var4);
        }

    }

    public boolean setState(int[] var1) {
        boolean var2;
        if (this.field_1) {
            var2 = super.setState(var1);
        } else {
            var2 = false;
        }

        return var2;
    }

    public boolean setVisible(boolean var1, boolean var2) {
        if (this.field_1) {
            var1 = super.setVisible(var1, var2);
        } else {
            var1 = false;
        }

        return var1;
    }
}
