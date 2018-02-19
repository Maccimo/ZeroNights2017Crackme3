package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.h.class_129;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

class i$a extends class_129 {
    // $FF: renamed from: a android.view.ActionProvider
    final ActionProvider field_1056;
    // $FF: renamed from: b android.support.v7.view.menu.i
    // $FF: synthetic field
    final class_125 field_1057;

    public i$a(class_125 var1, Context var2, ActionProvider var3) {
        super(var2);
        this.field_1057 = var1;
        this.field_1056 = var3;
    }

    // $FF: renamed from: a () android.view.View
    public View method_1064() {
        return this.field_1056.onCreateActionView();
    }

    // $FF: renamed from: a (android.view.SubMenu) void
    public void method_1068(SubMenu var1) {
        this.field_1056.onPrepareSubMenu(this.field_1057.a(var1));
    }

    // $FF: renamed from: d () boolean
    public boolean method_1072() {
        return this.field_1056.onPerformDefaultAction();
    }

    // $FF: renamed from: e () boolean
    public boolean method_1073() {
        return this.field_1056.hasSubMenu();
    }
}
