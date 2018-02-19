package android.support.v4.widget;

import android.support.v4.h.class_146;

class a$b implements Runnable {
    // $FF: renamed from: a android.support.v4.widget.a
    // $FF: synthetic field
    final class_149 field_974;

    a$b(class_149 var1) {
        this.field_974 = var1;
    }

    public void run() {
        if (this.field_974.field_1140) {
            if (this.field_974.field_1138) {
                this.field_974.field_1138 = false;
                this.field_974.field_1136.method_974();
            }

            a$a var3 = this.field_974.field_1136;
            if (!var3.method_979() && this.field_974.method_1266()) {
                if (this.field_974.field_1139) {
                    this.field_974.field_1139 = false;
                    this.field_974.method_1269();
                }

                var3.method_980();
                int var2 = var3.method_983();
                int var1 = var3.method_984();
                this.field_974.method_1265(var2, var1);
                class_146.method_1220(this.field_974.field_1137, this);
            } else {
                this.field_974.field_1140 = false;
            }
        }

    }
}
