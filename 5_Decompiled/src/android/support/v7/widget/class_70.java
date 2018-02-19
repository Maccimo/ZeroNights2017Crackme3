package android.support.v7.widget;

import android.graphics.Outline;

// $FF: renamed from: android.support.v7.widget.c
class class_70 extends class_69 {
    public class_70(ActionBarContainer var1) {
        super(var1);
    }

    public void getOutline(Outline var1) {
        if (this.a.field_501) {
            if (this.a.field_500 != null) {
                this.a.field_500.getOutline(var1);
            }
        } else if (this.a.field_498 != null) {
            this.a.field_498.getOutline(var1);
        }

    }
}
