package android.support.v4.h;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// $FF: renamed from: android.support.v4.h.c
public abstract class class_129 {
    // $FF: renamed from: a android.content.Context
    private final Context field_1053;
    // $FF: renamed from: b android.support.v4.h.c$a
    private c$a field_1054;
    // $FF: renamed from: c android.support.v4.h.c$b
    private c$b field_1055;

    public class_129(Context var1) {
        this.field_1053 = var1;
    }

    // $FF: renamed from: a () android.view.View
    public abstract View method_1064();

    // $FF: renamed from: a (android.view.MenuItem) android.view.View
    public View method_1065(MenuItem var1) {
        return this.method_1064();
    }

    // $FF: renamed from: a (android.support.v4.h.c$a) void
    public void method_1066(c$a var1) {
        this.field_1054 = var1;
    }

    // $FF: renamed from: a (android.support.v4.h.c$b) void
    public void method_1067(c$b var1) {
        if (this.field_1055 != null && var1 != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + this.getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }

        this.field_1055 = var1;
    }

    // $FF: renamed from: a (android.view.SubMenu) void
    public void method_1068(SubMenu var1) {
    }

    // $FF: renamed from: a (boolean) void
    public void method_1069(boolean var1) {
        if (this.field_1054 != null) {
            this.field_1054.method_35(var1);
        }

    }

    // $FF: renamed from: b () boolean
    public boolean method_1070() {
        return false;
    }

    // $FF: renamed from: c () boolean
    public boolean method_1071() {
        return true;
    }

    // $FF: renamed from: d () boolean
    public boolean method_1072() {
        return false;
    }

    // $FF: renamed from: e () boolean
    public boolean method_1073() {
        return false;
    }

    // $FF: renamed from: f () void
    public void method_1074() {
        this.field_1055 = null;
        this.field_1054 = null;
    }
}
