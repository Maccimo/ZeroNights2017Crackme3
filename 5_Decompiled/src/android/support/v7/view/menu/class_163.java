package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// $FF: renamed from: android.support.v7.view.menu.s
public class class_163 extends class_162 implements SubMenu {
    // $FF: renamed from: d android.support.v7.view.menu.g
    private class_162 field_1228;
    // $FF: renamed from: e android.support.v7.view.menu.h
    private class_168 field_1229;

    public class_163(Context var1, class_162 var2, class_168 var3) {
        super(var1);
        this.field_1228 = var2;
        this.field_1229 = var3;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g$a) void
    public void method_1348(g$a var1) {
        this.field_1228.method_1348(var1);
    }

    // $FF: renamed from: a () boolean
    public boolean method_1355() {
        return this.field_1228.method_1355();
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g, android.view.MenuItem) boolean
    boolean method_1356(class_162 var1, MenuItem var2) {
        boolean var3;
        if (!super.method_1356(var1, var2) && !this.field_1228.method_1356(var1, var2)) {
            var3 = false;
        } else {
            var3 = true;
        }

        return var3;
    }

    // $FF: renamed from: b () boolean
    public boolean method_1362() {
        return this.field_1228.method_1362();
    }

    // $FF: renamed from: c (android.support.v7.view.menu.h) boolean
    public boolean method_1365(class_168 var1) {
        return this.field_1228.method_1365(var1);
    }

    // $FF: renamed from: d (android.support.v7.view.menu.h) boolean
    public boolean method_1368(class_168 var1) {
        return this.field_1228.method_1368(var1);
    }

    public MenuItem getItem() {
        return this.field_1229;
    }

    // $FF: renamed from: m () android.support.v7.view.menu.g
    public class_162 method_1377() {
        return this.field_1228.method_1377();
    }

    // $FF: renamed from: p () android.view.Menu
    public Menu method_1380() {
        return this.field_1228;
    }

    public SubMenu setHeaderIcon(int var1) {
        return (SubMenu)super.method_1367(var1);
    }

    public SubMenu setHeaderIcon(Drawable var1) {
        return (SubMenu)super.method_1343(var1);
    }

    public SubMenu setHeaderTitle(int var1) {
        return (SubMenu)super.method_1364(var1);
    }

    public SubMenu setHeaderTitle(CharSequence var1) {
        return (SubMenu)super.method_1345(var1);
    }

    public SubMenu setHeaderView(View var1) {
        return (SubMenu)super.method_1344(var1);
    }

    public SubMenu setIcon(int var1) {
        this.field_1229.setIcon(var1);
        return this;
    }

    public SubMenu setIcon(Drawable var1) {
        this.field_1229.setIcon(var1);
        return this;
    }

    public void setQwertyMode(boolean var1) {
        this.field_1228.setQwertyMode(var1);
    }
}
