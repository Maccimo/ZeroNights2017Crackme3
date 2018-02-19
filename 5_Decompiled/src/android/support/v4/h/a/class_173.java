package android.support.v4.h.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

// $FF: renamed from: android.support.v4.h.a.e
public class class_173 {
    // $FF: renamed from: a android.support.v4.h.a.e$c
    private static final e$c field_1375;
    // $FF: renamed from: b android.view.accessibility.AccessibilityRecord
    private final AccessibilityRecord field_1376;

    static {
        if (VERSION.SDK_INT >= 16) {
            field_1375 = new e$b();
        } else if (VERSION.SDK_INT >= 15) {
            field_1375 = new e$a();
        } else {
            field_1375 = new e$c();
        }

    }

    // $FF: renamed from: a (android.view.accessibility.AccessibilityRecord, int) void
    public static void method_1465(AccessibilityRecord var0, int var1) {
        field_1375.method_1289(var0, var1);
    }

    // $FF: renamed from: b (android.view.accessibility.AccessibilityRecord, int) void
    public static void method_1466(AccessibilityRecord var0, int var1) {
        field_1375.method_1290(var0, var1);
    }

    @Deprecated
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

            class_173 var4 = (class_173)var1;
            if (this.field_1376 == null) {
                if (var4.field_1376 != null) {
                    var2 = var3;
                    return var2;
                }
            } else if (!this.field_1376.equals(var4.field_1376)) {
                var2 = var3;
                return var2;
            }
        }

        var2 = true;
        return var2;
    }

    @Deprecated
    public int hashCode() {
        int var1;
        if (this.field_1376 == null) {
            var1 = 0;
        } else {
            var1 = this.field_1376.hashCode();
        }

        return var1;
    }
}
