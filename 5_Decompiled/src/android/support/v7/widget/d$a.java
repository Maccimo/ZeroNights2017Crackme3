package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.class_121;
import android.support.v7.view.menu.class_163;
import android.support.v7.view.menu.class_168;
import android.view.View;

class d$a extends class_121 {
    // $FF: renamed from: a android.support.v7.widget.d
    // $FF: synthetic field
    final class_72 field_1026;

    public d$a(class_72 var1, Context var2, class_163 var3, View var4) {
        super(var2, var3, var4, false, android.support.v7.a.a$a.actionOverflowMenuStyle);
        this.field_1026 = var1;
        if (!((class_168)var3.getItem()).method_1438()) {
            Object var5;
            if (var1.field_643 == null) {
                var5 = (View)class_72.method_681(var1);
            } else {
                var5 = var1.field_643;
            }

            this.a((View)var5);
        }

        this.a(var1.field_647);
    }

    // $FF: renamed from: e () void
    protected void method_1046() {
        this.field_1026.field_645 = null;
        this.field_1026.field_648 = 0;
        super.method_1046();
    }
}
