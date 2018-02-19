package android.support.v7.widget;

import android.view.ViewParent;

class v$a implements Runnable {
    // $FF: renamed from: a android.support.v7.widget.v
    // $FF: synthetic field
    final class_30 field_939;

    v$a(class_30 var1) {
        this.field_939 = var1;
    }

    public void run() {
        ViewParent var1 = this.field_939.field_119.getParent();
        if (var1 != null) {
            var1.requestDisallowInterceptTouchEvent(true);
        }

    }
}
