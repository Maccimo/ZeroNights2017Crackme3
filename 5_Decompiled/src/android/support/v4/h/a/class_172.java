package android.support.v4.h.a;

import android.os.Bundle;
import android.os.Build.VERSION;
import java.util.List;

// $FF: renamed from: android.support.v4.h.a.b
public class class_172 {
    // $FF: renamed from: a android.support.v4.h.a.b$a
    private static final b$a field_1373;
    // $FF: renamed from: b java.lang.Object
    private final Object field_1374;

    static {
        if (VERSION.SDK_INT >= 19) {
            field_1373 = new b$c();
        } else if (VERSION.SDK_INT >= 16) {
            field_1373 = new b$b();
        } else {
            field_1373 = new b$d();
        }

    }

    public class_172() {
        this.field_1374 = field_1373.method_163(this);
    }

    public class_172(Object var1) {
        this.field_1374 = var1;
    }

    // $FF: renamed from: a (int) android.support.v4.h.a.a
    public class_175 method_1460(int var1) {
        return null;
    }

    // $FF: renamed from: a () java.lang.Object
    public Object method_1461() {
        return this.field_1374;
    }

    // $FF: renamed from: a (java.lang.String, int) java.util.List
    public List method_1462(String var1, int var2) {
        return null;
    }

    // $FF: renamed from: a (int, int, android.os.Bundle) boolean
    public boolean method_1463(int var1, int var2, Bundle var3) {
        return false;
    }

    // $FF: renamed from: b (int) android.support.v4.h.a.a
    public class_175 method_1464(int var1) {
        return null;
    }
}
