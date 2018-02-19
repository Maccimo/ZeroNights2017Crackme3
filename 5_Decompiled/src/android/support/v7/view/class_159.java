package android.support.v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.a.a$a;
import android.support.v7.a.a$b;
import android.support.v7.a.a$d;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.view.ViewConfiguration;

// $FF: renamed from: android.support.v7.view.a
public class class_159 {
    // $FF: renamed from: a android.content.Context
    private Context field_1198;

    private class_159(Context var1) {
        this.field_1198 = var1;
    }

    // $FF: renamed from: a (android.content.Context) android.support.v7.view.a
    public static class_159 method_1320(Context var0) {
        return new class_159(var0);
    }

    // $FF: renamed from: a () int
    public int method_1321() {
        Configuration var3 = this.field_1198.getResources().getConfiguration();
        int var1 = var3.screenWidthDp;
        int var2 = var3.screenHeightDp;
        byte var4;
        if (var3.smallestScreenWidthDp > 600 || var1 > 600 || var1 > 960 && var2 > 720 || var1 > 720 && var2 > 960) {
            var4 = 5;
        } else if (var1 >= 500 || var1 > 640 && var2 > 480 || var1 > 480 && var2 > 640) {
            var4 = 4;
        } else if (var1 >= 360) {
            var4 = 3;
        } else {
            var4 = 2;
        }

        return var4;
    }

    // $FF: renamed from: b () boolean
    public boolean method_1322() {
        boolean var1 = true;
        if (VERSION.SDK_INT < 19 && ViewConfiguration.get(this.field_1198).hasPermanentMenuKey()) {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: c () int
    public int method_1323() {
        return this.field_1198.getResources().getDisplayMetrics().widthPixels / 2;
    }

    // $FF: renamed from: d () boolean
    public boolean method_1324() {
        return this.field_1198.getResources().getBoolean(a$b.abc_action_bar_embed_tabs);
    }

    // $FF: renamed from: e () int
    public int method_1325() {
        TypedArray var3 = this.field_1198.obtainStyledAttributes((AttributeSet)null, a$j.ActionBar, a$a.actionBarStyle, 0);
        int var2 = var3.getLayoutDimension(a$j.ActionBar_height, 0);
        Resources var4 = this.field_1198.getResources();
        int var1 = var2;
        if (!this.method_1324()) {
            var1 = Math.min(var2, var4.getDimensionPixelSize(a$d.abc_action_bar_stacked_max_height));
        }

        var3.recycle();
        return var1;
    }

    // $FF: renamed from: f () int
    public int method_1326() {
        return this.field_1198.getResources().getDimensionPixelSize(a$d.abc_action_bar_stacked_tab_max_width);
    }
}
