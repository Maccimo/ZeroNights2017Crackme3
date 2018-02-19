package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

class i$c extends class_123 implements OnActionExpandListener {
    // $FF: renamed from: a android.support.v7.view.menu.i
    // $FF: synthetic field
    final class_125 field_1050;

    i$c(class_125 var1, OnActionExpandListener var2) {
        super(var2);
        this.field_1050 = var1;
    }

    public boolean onMenuItemActionCollapse(MenuItem var1) {
        return ((OnActionExpandListener)this.b).onMenuItemActionCollapse(this.field_1050.a(var1));
    }

    public boolean onMenuItemActionExpand(MenuItem var1) {
        return ((OnActionExpandListener)this.b).onMenuItemActionExpand(this.field_1050.a(var1));
    }
}
