package android.support.v4.e;

import android.os.Bundle;

class b$a extends a$a {
    // $FF: renamed from: a android.support.v4.e.b
    // $FF: synthetic field
    final class_45 field_1174;

    b$a(class_45 var1) {
        this.field_1174 = var1;
    }

    // $FF: renamed from: a (int, android.os.Bundle) void
    public void method_40(int var1, Bundle var2) {
        if (this.field_1174.field_393 != null) {
            this.field_1174.field_393.post(new b$b(this.field_1174, var1, var2));
        } else {
            this.field_1174.method_466(var1, var2);
        }

    }
}
