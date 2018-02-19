package android.support.v4.widget;

import android.view.animation.AnimationUtils;

class a$a {
    // $FF: renamed from: a int
    private int field_963;
    // $FF: renamed from: b int
    private int field_964;
    // $FF: renamed from: c float
    private float field_965;
    // $FF: renamed from: d float
    private float field_966;
    // $FF: renamed from: e long
    private long field_967 = Long.MIN_VALUE;
    // $FF: renamed from: f long
    private long field_968 = 0L;
    // $FF: renamed from: g int
    private int field_969 = 0;
    // $FF: renamed from: h int
    private int field_970 = 0;
    // $FF: renamed from: i long
    private long field_971 = -1L;
    // $FF: renamed from: j float
    private float field_972;
    // $FF: renamed from: k int
    private int field_973;

    // $FF: renamed from: a (float) float
    private float method_972(float var1) {
        return -4.0F * var1 * var1 + 4.0F * var1;
    }

    // $FF: renamed from: a (long) float
    private float method_973(long var1) {
        float var3 = 0.0F;
        if (var1 >= this.field_967) {
            if (this.field_971 >= 0L && var1 >= this.field_971) {
                long var5 = this.field_971;
                var3 = this.field_972;
                float var4 = this.field_972;
                var3 = class_149.method_1255((float)(var1 - var5) / (float)this.field_973, 0.0F, 1.0F) * var4 + (1.0F - var3);
            } else {
                var3 = class_149.method_1255((float)(var1 - this.field_967) / (float)this.field_963, 0.0F, 1.0F) * 0.5F;
            }
        }

        return var3;
    }

    // $FF: renamed from: a () void
    public void method_974() {
        this.field_967 = AnimationUtils.currentAnimationTimeMillis();
        this.field_971 = -1L;
        this.field_968 = this.field_967;
        this.field_972 = 0.5F;
        this.field_969 = 0;
        this.field_970 = 0;
    }

    // $FF: renamed from: a (float, float) void
    public void method_975(float var1, float var2) {
        this.field_965 = var1;
        this.field_966 = var2;
    }

    // $FF: renamed from: a (int) void
    public void method_976(int var1) {
        this.field_963 = var1;
    }

    // $FF: renamed from: b () void
    public void method_977() {
        long var1 = AnimationUtils.currentAnimationTimeMillis();
        this.field_973 = class_149.method_1258((int)(var1 - this.field_967), 0, this.field_964);
        this.field_972 = this.method_973(var1);
        this.field_971 = var1;
    }

    // $FF: renamed from: b (int) void
    public void method_978(int var1) {
        this.field_964 = var1;
    }

    // $FF: renamed from: c () boolean
    public boolean method_979() {
        boolean var1;
        if (this.field_971 > 0L && AnimationUtils.currentAnimationTimeMillis() > this.field_971 + (long)this.field_973) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: d () void
    public void method_980() {
        if (this.field_968 == 0L) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        } else {
            long var4 = AnimationUtils.currentAnimationTimeMillis();
            float var1 = this.method_972(this.method_973(var4));
            long var2 = var4 - this.field_968;
            this.field_968 = var4;
            this.field_969 = (int)((float)var2 * var1 * this.field_965);
            this.field_970 = (int)((float)var2 * var1 * this.field_966);
        }
    }

    // $FF: renamed from: e () int
    public int method_981() {
        return (int)(this.field_965 / Math.abs(this.field_965));
    }

    // $FF: renamed from: f () int
    public int method_982() {
        return (int)(this.field_966 / Math.abs(this.field_966));
    }

    // $FF: renamed from: g () int
    public int method_983() {
        return this.field_969;
    }

    // $FF: renamed from: h () int
    public int method_984() {
        return this.field_970;
    }
}
