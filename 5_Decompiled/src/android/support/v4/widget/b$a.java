package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

class b$a extends ContentObserver {
    // $FF: renamed from: a android.support.v4.widget.b
    // $FF: synthetic field
    final class_90 field_1034;

    b$a(class_90 var1) {
        super(new Handler());
        this.field_1034 = var1;
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean var1) {
        this.field_1034.method_832();
    }
}
