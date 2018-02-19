package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// $FF: renamed from: android.support.v7.widget.b
class class_69 extends Drawable {
    // $FF: renamed from: a android.support.v7.widget.ActionBarContainer
    final ActionBarContainer field_631;

    public class_69(ActionBarContainer var1) {
        this.field_631 = var1;
    }

    public void draw(Canvas var1) {
        if (this.field_631.field_501) {
            if (this.field_631.field_500 != null) {
                this.field_631.field_500.draw(var1);
            }
        } else {
            if (this.field_631.field_498 != null) {
                this.field_631.field_498.draw(var1);
            }

            if (this.field_631.field_499 != null && this.field_631.field_502) {
                this.field_631.field_499.draw(var1);
            }
        }

    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int var1) {
    }

    public void setColorFilter(ColorFilter var1) {
    }
}
