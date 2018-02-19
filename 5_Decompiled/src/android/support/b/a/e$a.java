package android.support.b.a;

import android.animation.TypeEvaluator;
import android.support.v4.c.b$b;
import android.support.v4.c.class_80;

class e$a implements TypeEvaluator {
    // $FF: renamed from: a android.support.v4.c.b$b[]
    private b$b[] field_907;

    private e$a() {
    }

    // $FF: synthetic method
    e$a(Object var1) {
        this();
    }

    // $FF: renamed from: a (float, android.support.v4.c.b$b[], android.support.v4.c.b$b[]) android.support.v4.c.b$b[]
    public b$b[] method_931(float var1, b$b[] var2, b$b[] var3) {
        if (!class_80.method_767(var2, var3)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        } else {
            if (this.field_907 == null || !class_80.method_767(this.field_907, var2)) {
                this.field_907 = class_80.method_769(var2);
            }

            for(int var4 = 0; var4 < var2.length; ++var4) {
                this.field_907[var4].method_397(var2[var4], var3[var4], var1);
            }

            return this.field_907;
        }
    }

    // $FF: synthetic method
    public Object evaluate(float var1, Object var2, Object var3) {
        return this.method_931(var1, (b$b[])var2, (b$b[])var3);
    }
}
