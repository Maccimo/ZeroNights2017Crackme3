package android.support.v7.widget;

import android.support.v4.h.class_146;

class x$e implements Runnable {
    // $FF: renamed from: a android.support.v7.widget.x
    // $FF: synthetic field
    final class_27 field_707;

    x$e(class_27 var1) {
        this.field_707 = var1;
    }

    public void run() {
        if (this.field_707.field_30 != null && class_146.method_1229(this.field_707.field_30) && this.field_707.field_30.getCount() > this.field_707.field_30.getChildCount() && this.field_707.field_30.getChildCount() <= this.field_707.field_31) {
            this.field_707.field_34.setInputMethodMode(2);
            this.field_707.method_147();
        }

    }
}
