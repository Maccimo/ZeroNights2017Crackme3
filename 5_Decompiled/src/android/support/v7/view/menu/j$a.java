package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.h.c$b;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import android.view.ActionProvider.VisibilityListener;

class j$a extends i$a implements VisibilityListener {
    // $FF: renamed from: c android.support.v4.h.c$b
    c$b field_1058;
    // $FF: renamed from: d android.support.v7.view.menu.j
    // $FF: synthetic field
    final class_126 field_1059;

    public j$a(class_126 var1, Context var2, ActionProvider var3) {
        super(var1, var2, var3);
        this.field_1059 = var1;
    }

    // $FF: renamed from: a (android.view.MenuItem) android.view.View
    public View method_1065(MenuItem var1) {
        return this.a.onCreateActionView(var1);
    }

    // $FF: renamed from: a (android.support.v4.h.c$b) void
    public void method_1067(c$b var1) {
        this.field_1058 = var1;
        ActionProvider var2 = this.a;
        j$a var3;
        if (var1 != null) {
            var3 = this;
        } else {
            var3 = null;
        }

        var2.setVisibilityListener(var3);
    }

    // $FF: renamed from: b () boolean
    public boolean method_1070() {
        return this.a.overridesItemVisibility();
    }

    // $FF: renamed from: c () boolean
    public boolean method_1071() {
        return this.a.isVisible();
    }

    public void onActionProviderVisibilityChanged(boolean var1) {
        if (this.field_1058 != null) {
            this.field_1058.method_34(var1);
        }

    }
}
