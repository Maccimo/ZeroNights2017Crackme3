package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class e$a implements Comparable {
    // $FF: renamed from: a android.content.pm.ResolveInfo
    public final ResolveInfo field_955;
    // $FF: renamed from: b float
    public float field_956;

    public e$a(ResolveInfo var1) {
        this.field_955 = var1;
    }

    // $FF: renamed from: a (android.support.v7.widget.e$a) int
    public int method_968(e$a var1) {
        return Float.floatToIntBits(var1.field_956) - Float.floatToIntBits(this.field_956);
    }

    // $FF: synthetic method
    public int compareTo(Object var1) {
        return this.method_968((e$a)var1);
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

            e$a var4 = (e$a)var1;
            if (Float.floatToIntBits(this.field_956) != Float.floatToIntBits(var4.field_956)) {
                var2 = var3;
                return var2;
            }
        }

        var2 = true;
        return var2;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.field_956) + 31;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder();
        var1.append("[");
        var1.append("resolveInfo:").append(this.field_955.toString());
        var1.append("; weight:").append(new BigDecimal((double)this.field_956));
        var1.append("]");
        return var1.toString();
    }
}
