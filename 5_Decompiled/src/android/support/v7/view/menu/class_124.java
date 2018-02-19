package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.d.a.class_11;
import android.support.v4.d.a.class_12;
import android.support.v4.g.class_134;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

// $FF: renamed from: android.support.v7.view.menu.c
abstract class class_124 extends class_123 {
    // $FF: renamed from: a android.content.Context
    final Context field_1046;
    // $FF: renamed from: c java.util.Map
    private Map field_1047;
    // $FF: renamed from: d java.util.Map
    private Map field_1048;

    class_124(Context var1, Object var2) {
        super(var2);
        this.field_1046 = var1;
    }

    // $FF: renamed from: a (android.view.MenuItem) android.view.MenuItem
    final MenuItem method_1055(MenuItem var1) {
        if (var1 instanceof class_12) {
            class_12 var3 = (class_12)var1;
            if (this.field_1047 == null) {
                this.field_1047 = new class_134();
            }

            MenuItem var2 = (MenuItem)this.field_1047.get(var1);
            var1 = var2;
            if (var2 == null) {
                var1 = class_161.method_1328(this.field_1046, var3);
                this.field_1047.put(var3, var1);
            }
        }

        return var1;
    }

    // $FF: renamed from: a (android.view.SubMenu) android.view.SubMenu
    final SubMenu method_1056(SubMenu var1) {
        if (var1 instanceof class_11) {
            class_11 var3 = (class_11)var1;
            if (this.field_1048 == null) {
                this.field_1048 = new class_134();
            }

            SubMenu var2 = (SubMenu)this.field_1048.get(var3);
            var1 = var2;
            if (var2 == null) {
                var1 = class_161.method_1329(this.field_1046, var3);
                this.field_1048.put(var3, var1);
            }
        }

        return var1;
    }

    // $FF: renamed from: a () void
    final void method_1057() {
        if (this.field_1047 != null) {
            this.field_1047.clear();
        }

        if (this.field_1048 != null) {
            this.field_1048.clear();
        }

    }

    // $FF: renamed from: a (int) void
    final void method_1058(int var1) {
        if (this.field_1047 != null) {
            Iterator var2 = this.field_1047.keySet().iterator();

            while(var2.hasNext()) {
                if (var1 == ((MenuItem)var2.next()).getGroupId()) {
                    var2.remove();
                }
            }
        }

    }

    // $FF: renamed from: b (int) void
    final void method_1059(int var1) {
        if (this.field_1047 != null) {
            Iterator var2 = this.field_1047.keySet().iterator();

            while(var2.hasNext()) {
                if (var1 == ((MenuItem)var2.next()).getItemId()) {
                    var2.remove();
                    break;
                }
            }
        }

    }
}
