package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

// $FF: renamed from: android.support.v4.c.a.e
class class_59 extends class_58 {
    // $FF: renamed from: d java.lang.reflect.Method
    private static Method field_556;

    class_59(Drawable var1) {
        super(var1);
        this.method_587();
    }

    class_59(c$a var1, Resources var2) {
        super(var1, var2);
        this.method_587();
    }

    // $FF: renamed from: d () void
    private void method_587() {
        if (field_556 == null) {
            try {
                field_556 = Drawable.class.getDeclaredMethod("isProjected");
            } catch (Exception var2) {
                Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", var2);
            }
        }

    }

    // $FF: renamed from: b () android.support.v4.c.a.c$a
    c$a method_585() {
        return new e$a(this.b, (Resources)null);
    }

    // $FF: renamed from: c () boolean
    protected boolean method_586() {
        boolean var2 = false;
        boolean var1 = var2;
        if (VERSION.SDK_INT == 21) {
            Drawable var3 = this.c;
            if (!(var3 instanceof GradientDrawable) && !(var3 instanceof DrawableContainer) && !(var3 instanceof InsetDrawable)) {
                var1 = var2;
                if (!(var3 instanceof RippleDrawable)) {
                    return var1;
                }
            }

            var1 = true;
        }

        return var1;
    }

    public Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public void getOutline(Outline var1) {
        this.c.getOutline(var1);
    }

    public void setHotspot(float var1, float var2) {
        this.c.setHotspot(var1, var2);
    }

    public void setHotspotBounds(int var1, int var2, int var3, int var4) {
        this.c.setHotspotBounds(var1, var2, var3, var4);
    }

    public boolean setState(int[] var1) {
        boolean var2;
        if (super.setState(var1)) {
            this.invalidateSelf();
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    public void setTint(int var1) {
        if (this.method_586()) {
            super.setTint(var1);
        } else {
            this.c.setTint(var1);
        }

    }

    public void setTintList(ColorStateList var1) {
        if (this.method_586()) {
            super.setTintList(var1);
        } else {
            this.c.setTintList(var1);
        }

    }

    public void setTintMode(Mode var1) {
        if (this.method_586()) {
            super.setTintMode(var1);
        } else {
            this.c.setTintMode(var1);
        }

    }
}
