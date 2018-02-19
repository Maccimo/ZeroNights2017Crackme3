package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

// $FF: renamed from: android.support.v7.view.menu.k
abstract class class_164 implements class_23, class_25, OnItemClickListener {
    // $FF: renamed from: a android.graphics.Rect
    private Rect field_1230;

    // $FF: renamed from: a (android.widget.ListAdapter, android.view.ViewGroup, android.content.Context, int) int
    protected static int method_1381(ListAdapter var0, ViewGroup var1, Context var2, int var3) {
        int var5 = 0;
        int var10 = MeasureSpec.makeMeasureSpec(0, 0);
        int var9 = MeasureSpec.makeMeasureSpec(0, 0);
        int var11 = var0.getCount();
        View var13 = null;
        int var6 = 0;
        int var4 = 0;
        Object var12 = var1;
        View var14 = var13;

        while(true) {
            if (var6 >= var11) {
                var3 = var4;
                break;
            }

            int var7 = var0.getItemViewType(var6);
            if (var7 != var5) {
                var13 = null;
                var5 = var7;
            } else {
                var13 = var14;
            }

            Object var15 = var12;
            if (var12 == null) {
                var15 = new FrameLayout(var2);
            }

            var13 = var0.getView(var6, var13, (ViewGroup)var15);
            var13.measure(var10, var9);
            int var8 = var13.getMeasuredWidth();
            if (var8 >= var3) {
                break;
            }

            var7 = var4;
            if (var8 > var4) {
                var7 = var8;
            }

            ++var6;
            var4 = var7;
            var12 = var15;
            var14 = var13;
        }

        return var3;
    }

    // $FF: renamed from: a (android.widget.ListAdapter) android.support.v7.view.menu.f
    protected static class_167 method_1382(ListAdapter var0) {
        class_167 var1;
        if (var0 instanceof HeaderViewListAdapter) {
            var1 = (class_167)((HeaderViewListAdapter)var0).getWrappedAdapter();
        } else {
            var1 = (class_167)var0;
        }

        return var1;
    }

    // $FF: renamed from: b (android.support.v7.view.menu.g) boolean
    protected static boolean method_1383(class_162 var0) {
        boolean var4 = false;
        int var2 = var0.size();
        int var1 = 0;

        boolean var3;
        while(true) {
            var3 = var4;
            if (var1 >= var2) {
                break;
            }

            MenuItem var5 = var0.getItem(var1);
            if (var5.isVisible() && var5.getIcon() != null) {
                var3 = true;
                break;
            }

            ++var1;
        }

        return var3;
    }

    // $FF: renamed from: a (int) void
    public abstract void method_1384(int var1);

    // $FF: renamed from: a (android.content.Context, android.support.v7.view.menu.g) void
    public void method_139(Context var1, class_162 var2) {
    }

    // $FF: renamed from: a (android.graphics.Rect) void
    public void method_1385(Rect var1) {
        this.field_1230 = var1;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g) void
    public abstract void method_1386(class_162 var1);

    // $FF: renamed from: a (android.view.View) void
    public abstract void method_1387(View var1);

    // $FF: renamed from: a (android.widget.PopupWindow.OnDismissListener) void
    public abstract void method_1388(OnDismissListener var1);

    // $FF: renamed from: a (boolean) void
    public abstract void method_1389(boolean var1);

    // $FF: renamed from: a (android.support.v7.view.menu.g, android.support.v7.view.menu.h) boolean
    public boolean method_142(class_162 var1, class_168 var2) {
        return false;
    }

    // $FF: renamed from: b (int) void
    public abstract void method_1390(int var1);

    // $FF: renamed from: b (android.support.v7.view.menu.g, android.support.v7.view.menu.h) boolean
    public boolean method_146(class_162 var1, class_168 var2) {
        return false;
    }

    // $FF: renamed from: c (int) void
    public abstract void method_1391(int var1);

    // $FF: renamed from: c (boolean) void
    public abstract void method_1392(boolean var1);

    // $FF: renamed from: f () boolean
    protected boolean method_1393() {
        return true;
    }

    // $FF: renamed from: g () android.graphics.Rect
    public Rect method_1394() {
        return this.field_1230;
    }

    public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
        ListAdapter var7 = (ListAdapter)var1.getAdapter();
        class_162 var6 = method_1382(var7).field_1284;
        MenuItem var8 = (MenuItem)var7.getItem(var3);
        byte var9;
        if (this.method_1393()) {
            var9 = 0;
        } else {
            var9 = 4;
        }

        var6.method_1358(var8, this, var9);
    }
}
