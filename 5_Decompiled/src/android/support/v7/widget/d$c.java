package android.support.v7.widget;

import android.view.View;

class d$c implements Runnable {
    // $FF: renamed from: a android.support.v7.widget.d
    // $FF: synthetic field
    final class_72 field_1031;
    // $FF: renamed from: b android.support.v7.widget.d$e
    private d$e field_1032;

    public d$c(class_72 var1, d$e var2) {
        this.field_1031 = var1;
        this.field_1032 = var2;
    }

    public void run() {
        if (class_72.method_682(this.field_1031) != null) {
            class_72.method_683(this.field_1031).method_1369();
        }

        View var1 = (View)class_72.method_684(this.field_1031);
        if (var1 != null && var1.getWindowToken() != null && this.field_1032.c()) {
            this.field_1031.field_644 = this.field_1032;
        }

        this.field_1031.field_646 = null;
    }
}
