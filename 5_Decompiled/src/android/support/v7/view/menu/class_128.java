package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.class_11;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// $FF: renamed from: android.support.v7.view.menu.t
class class_128 extends class_127 implements SubMenu {
    class_128(Context var1, class_11 var2) {
        super(var1, var2);
    }

    // $FF: renamed from: b () android.support.v4.d.a.c
    public class_11 method_1062() {
        return (class_11)this.b;
    }

    public void clearHeader() {
        this.method_1062().clearHeader();
    }

    public MenuItem getItem() {
        return this.a(this.method_1062().getItem());
    }

    public SubMenu setHeaderIcon(int var1) {
        this.method_1062().setHeaderIcon(var1);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable var1) {
        this.method_1062().setHeaderIcon(var1);
        return this;
    }

    public SubMenu setHeaderTitle(int var1) {
        this.method_1062().setHeaderTitle(var1);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence var1) {
        this.method_1062().setHeaderTitle(var1);
        return this;
    }

    public SubMenu setHeaderView(View var1) {
        this.method_1062().setHeaderView(var1);
        return this;
    }

    public SubMenu setIcon(int var1) {
        this.method_1062().setIcon(var1);
        return this;
    }

    public SubMenu setIcon(Drawable var1) {
        this.method_1062().setIcon(var1);
        return this;
    }
}
