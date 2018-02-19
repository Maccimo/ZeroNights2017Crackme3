package android.support.v4.h.b;

import android.view.animation.Interpolator;

// $FF: renamed from: android.support.v4.h.b.d
abstract class class_116 implements Interpolator {
    // $FF: renamed from: a float[]
    private final float[] field_999;
    // $FF: renamed from: b float
    private final float field_1000;

    public class_116(float[] var1) {
        this.field_999 = var1;
        this.field_1000 = 1.0F / (float)(this.field_999.length - 1);
    }

    public float getInterpolation(float var1) {
        float var2 = 1.0F;
        if (var1 >= 1.0F) {
            var1 = var2;
        } else if (var1 <= 0.0F) {
            var1 = 0.0F;
        } else {
            int var3 = Math.min((int)((float)(this.field_999.length - 1) * var1), this.field_999.length - 2);
            var1 = (var1 - (float)var3 * this.field_1000) / this.field_1000;
            var2 = this.field_999[var3];
            var1 = (this.field_999[var3 + 1] - this.field_999[var3]) * var1 + var2;
        }

        return var1;
    }
}
