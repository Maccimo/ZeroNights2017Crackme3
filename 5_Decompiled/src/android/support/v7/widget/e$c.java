package android.support.v7.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class e$c {
    // $FF: renamed from: a android.content.ComponentName
    public final ComponentName field_957;
    // $FF: renamed from: b long
    public final long field_958;
    // $FF: renamed from: c float
    public final float field_959;

    public e$c(ComponentName var1, long var2, float var4) {
        this.field_957 = var1;
        this.field_958 = var2;
        this.field_959 = var4;
    }

    public e$c(String var1, long var2, float var4) {
        this(ComponentName.unflattenFromString(var1), var2, var4);
    }

    public boolean equals(Object var1) {
        boolean var3 = false;
        boolean var2;
        if (this != var1) {
            var2 = var3;
            if (var1 == null) {
                return var2;
            }

            var2 = var3;
            if (this.getClass() != var1.getClass()) {
                return var2;
            }

            e$c var4 = (e$c)var1;
            if (this.field_957 == null) {
                var2 = var3;
                if (var4.field_957 != null) {
                    return var2;
                }
            } else if (!this.field_957.equals(var4.field_957)) {
                var2 = var3;
                return var2;
            }

            var2 = var3;
            if (this.field_958 != var4.field_958) {
                return var2;
            }

            if (Float.floatToIntBits(this.field_959) != Float.floatToIntBits(var4.field_959)) {
                var2 = var3;
                return var2;
            }
        }

        var2 = true;
        return var2;
    }

    public int hashCode() {
        int var1;
        if (this.field_957 == null) {
            var1 = 0;
        } else {
            var1 = this.field_957.hashCode();
        }

        return ((var1 + 31) * 31 + (int)(this.field_958 ^ this.field_958 >>> 32)) * 31 + Float.floatToIntBits(this.field_959);
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        var1.append("[");
        var1.append("; activity:").append(this.field_957);
        var1.append("; time:").append(this.field_958);
        var1.append("; weight:").append(new BigDecimal((double)this.field_959));
        var1.append("]");
        return var1.toString();
    }
}
