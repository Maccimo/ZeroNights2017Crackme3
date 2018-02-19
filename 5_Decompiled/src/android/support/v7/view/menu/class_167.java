package android.support.v7.view.menu;

import android.support.v7.a.a$g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// $FF: renamed from: android.support.v7.view.menu.f
public class class_167 extends BaseAdapter {
    // $FF: renamed from: a int
    static final int field_1283;
    // $FF: renamed from: b android.support.v7.view.menu.g
    class_162 field_1284;
    // $FF: renamed from: c int
    private int field_1285 = -1;
    // $FF: renamed from: d boolean
    private boolean field_1286;
    // $FF: renamed from: e boolean
    private final boolean field_1287;
    // $FF: renamed from: f android.view.LayoutInflater
    private final LayoutInflater field_1288;

    static {
        field_1283 = a$g.abc_popup_menu_item_layout;
    }

    public class_167(class_162 var1, LayoutInflater var2, boolean var3) {
        this.field_1287 = var3;
        this.field_1288 = var2;
        this.field_1284 = var1;
        this.method_1417();
    }

    // $FF: renamed from: a () android.support.v7.view.menu.g
    public class_162 method_1414() {
        return this.field_1284;
    }

    // $FF: renamed from: a (int) android.support.v7.view.menu.h
    public class_168 method_1415(int var1) {
        ArrayList var3;
        if (this.field_1287) {
            var3 = this.field_1284.method_1375();
        } else {
            var3 = this.field_1284.method_1372();
        }

        int var2 = var1;
        if (this.field_1285 >= 0) {
            var2 = var1;
            if (var1 >= this.field_1285) {
                var2 = var1 + 1;
            }
        }

        return (class_168)var3.get(var2);
    }

    // $FF: renamed from: a (boolean) void
    public void method_1416(boolean var1) {
        this.field_1286 = var1;
    }

    // $FF: renamed from: b () void
    void method_1417() {
        class_168 var3 = this.field_1284.method_1379();
        if (var3 != null) {
            ArrayList var4 = this.field_1284.method_1375();
            int var2 = var4.size();

            for(int var1 = 0; var1 < var2; ++var1) {
                if ((class_168)var4.get(var1) == var3) {
                    this.field_1285 = var1;
                    return;
                }
            }
        }

        this.field_1285 = -1;
    }

    public int getCount() {
        ArrayList var2;
        if (this.field_1287) {
            var2 = this.field_1284.method_1375();
        } else {
            var2 = this.field_1284.method_1372();
        }

        int var1;
        if (this.field_1285 < 0) {
            var1 = var2.size();
        } else {
            var1 = var2.size() - 1;
        }

        return var1;
    }

    // $FF: synthetic method
    public Object getItem(int var1) {
        return this.method_1415(var1);
    }

    public long getItemId(int var1) {
        return (long)var1;
    }

    public View getView(int var1, View var2, ViewGroup var3) {
        if (var2 == null) {
            var2 = this.field_1288.inflate(field_1283, var3, false);
        }

        n$a var4 = (n$a)var2;
        if (this.field_1286) {
            ((ListMenuItemView)var2).setForceShowIcon(true);
        }

        var4.method_8(this.method_1415(var1), 0);
        return var2;
    }

    public void notifyDataSetChanged() {
        this.method_1417();
        super.notifyDataSetChanged();
    }
}
