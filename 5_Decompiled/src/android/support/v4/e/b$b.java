package android.support.v4.e;

import android.os.Bundle;

class b$b implements Runnable {
    // $FF: renamed from: a int
    final int field_1346;
    // $FF: renamed from: b android.os.Bundle
    final Bundle field_1347;
    // $FF: renamed from: c android.support.v4.e.b
    // $FF: synthetic field
    final class_45 field_1348;

    b$b(class_45 var1, int var2, Bundle var3) {
        this.field_1348 = var1;
        this.field_1346 = var2;
        this.field_1347 = var3;
    }

    public void run() {
        this.field_1348.method_466(this.field_1346, this.field_1347);
    }
}
