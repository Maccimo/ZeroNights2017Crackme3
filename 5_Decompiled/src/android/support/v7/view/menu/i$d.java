package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class i$d extends class_123 implements OnMenuItemClickListener {
    // $FF: renamed from: a android.support.v7.view.menu.i
    // $FF: synthetic field
    final class_125 field_1051;

    i$d(class_125 var1, OnMenuItemClickListener var2) {
        super(var2);
        this.field_1051 = var1;
    }

    public boolean onMenuItemClick(MenuItem var1) {
        return ((OnMenuItemClickListener)this.b).onMenuItemClick(this.field_1051.a(var1));
    }
}
