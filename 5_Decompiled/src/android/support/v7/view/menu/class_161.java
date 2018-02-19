package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.d.a.class_11;
import android.support.v4.d.a.class_12;
import android.view.MenuItem;
import android.view.SubMenu;

// $FF: renamed from: android.support.v7.view.menu.o
public final class class_161 {
    // $FF: renamed from: a (android.content.Context, android.support.v4.d.a.b) android.view.MenuItem
    public static MenuItem method_1328(Context var0, class_12 var1) {
        Object var2;
        if (VERSION.SDK_INT >= 16) {
            var2 = new class_126(var0, var1);
        } else {
            var2 = new class_125(var0, var1);
        }

        return (MenuItem)var2;
    }

    // $FF: renamed from: a (android.content.Context, android.support.v4.d.a.c) android.view.SubMenu
    public static SubMenu method_1329(Context var0, class_11 var1) {
        return new class_128(var0, var1);
    }
}
