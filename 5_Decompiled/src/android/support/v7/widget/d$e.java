package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.class_121;
import android.support.v7.view.menu.class_162;
import android.view.View;

class d$e extends class_121 {
    // $FF: renamed from: a android.support.v7.widget.d
    // $FF: synthetic field
    final class_72 field_1025;

    public d$e(class_72 var1, Context var2, class_162 var3, View var4, boolean var5) {
        super(var2, var3, var4, var5, android.support.v7.a.a$a.actionOverflowMenuStyle);
        this.field_1025 = var1;
        this.a(8388613);
        this.a(var1.field_647);
    }

    // $FF: renamed from: e () void
    protected void method_1046() {
        if (class_72.method_678(this.field_1025) != null) {
            class_72.method_680(this.field_1025).close();
        }

        this.field_1025.field_644 = null;
        super.method_1046();
    }
}
