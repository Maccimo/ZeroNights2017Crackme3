package android.support.v7.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class x$d implements OnTouchListener {
    // $FF: renamed from: a android.support.v7.widget.x
    // $FF: synthetic field
    final class_27 field_681;

    x$d(class_27 var1) {
        this.field_681 = var1;
    }

    public boolean onTouch(View var1, MotionEvent var2) {
        int var3 = var2.getAction();
        int var5 = (int)var2.getX();
        int var4 = (int)var2.getY();
        if (var3 == 0 && this.field_681.field_34 != null && this.field_681.field_34.isShowing() && var5 >= 0 && var5 < this.field_681.field_34.getWidth() && var4 >= 0 && var4 < this.field_681.field_34.getHeight()) {
            this.field_681.field_33.postDelayed(this.field_681.field_32, 250L);
        } else if (var3 == 1) {
            this.field_681.field_33.removeCallbacks(this.field_681.field_32);
        }

        return false;
    }
}
