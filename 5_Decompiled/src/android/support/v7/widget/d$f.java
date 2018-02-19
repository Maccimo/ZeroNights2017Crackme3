package android.support.v7.widget;

import android.support.v7.view.menu.class_162;
import android.support.v7.view.menu.class_163;

class d$f implements android.support.v7.view.menu.m$a {
    // $FF: renamed from: a android.support.v7.widget.d
    // $FF: synthetic field
    final class_72 field_1033;

    d$f(class_72 var1) {
        this.field_1033 = var1;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g, boolean) void
    public void method_128(class_162 var1, boolean var2) {
        if (var1 instanceof class_163) {
            var1.method_1377().method_1354(false);
        }

        android.support.v7.view.menu.m$a var3 = this.field_1033.a();
        if (var3 != null) {
            var3.method_128(var1, var2);
        }

    }

    // $FF: renamed from: a (android.support.v7.view.menu.g) boolean
    public boolean method_129(class_162 var1) {
        boolean var2;
        if (var1 == null) {
            var2 = false;
        } else {
            this.field_1033.field_648 = ((class_163)var1).getItem().getItemId();
            android.support.v7.view.menu.m$a var3 = this.field_1033.a();
            if (var3 != null) {
                var2 = var3.method_129(var1);
            } else {
                var2 = false;
            }
        }

        return var2;
    }
}
