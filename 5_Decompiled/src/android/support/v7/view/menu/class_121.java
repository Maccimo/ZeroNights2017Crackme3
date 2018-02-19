package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.h.class_142;
import android.support.v4.h.class_146;
import android.support.v7.a.a$d;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

// $FF: renamed from: android.support.v7.view.menu.l
public class class_121 {
    // $FF: renamed from: a android.content.Context
    private final Context field_1013;
    // $FF: renamed from: b android.support.v7.view.menu.g
    private final class_162 field_1014;
    // $FF: renamed from: c boolean
    private final boolean field_1015;
    // $FF: renamed from: d int
    private final int field_1016;
    // $FF: renamed from: e int
    private final int field_1017;
    // $FF: renamed from: f android.view.View
    private View field_1018;
    // $FF: renamed from: g int
    private int field_1019;
    // $FF: renamed from: h boolean
    private boolean field_1020;
    // $FF: renamed from: i android.support.v7.view.menu.m$a
    private m$a field_1021;
    // $FF: renamed from: j android.support.v7.view.menu.k
    private class_164 field_1022;
    // $FF: renamed from: k android.widget.PopupWindow.OnDismissListener
    private OnDismissListener field_1023;
    // $FF: renamed from: l android.widget.PopupWindow.OnDismissListener
    private final OnDismissListener field_1024;

    public class_121(Context var1, class_162 var2, View var3, boolean var4, int var5) {
        this(var1, var2, var3, var4, var5, 0);
    }

    public class_121(Context var1, class_162 var2, View var3, boolean var4, int var5, int var6) {
        this.field_1019 = 8388611;
        this.field_1024 = new OnDismissListener() {
            public void onDismiss() {
                class_121.this.method_1046();
            }
        };
        this.field_1013 = var1;
        this.field_1014 = var2;
        this.field_1018 = var3;
        this.field_1015 = var4;
        this.field_1016 = var5;
        this.field_1017 = var6;
    }

    // $FF: renamed from: a (int, int, boolean, boolean) void
    private void method_1034(int var1, int var2, boolean var3, boolean var4) {
        class_164 var6 = this.method_1043();
        var6.method_1392(var4);
        if (var3) {
            int var5 = var1;
            if ((class_142.method_1195(this.field_1019, class_146.method_1222(this.field_1018)) & 7) == 5) {
                var5 = var1 + this.field_1018.getWidth();
            }

            var6.method_1390(var5);
            var6.method_1391(var2);
            var1 = (int)(this.field_1013.getResources().getDisplayMetrics().density * 48.0F / 2.0F);
            var6.method_1385(new Rect(var5 - var1, var2 - var1, var5 + var1, var1 + var2));
        }

        var6.a();
    }

    // $FF: renamed from: g () android.support.v7.view.menu.k
    private class_164 method_1035() {
        Display var3 = ((WindowManager)this.field_1013.getSystemService("window")).getDefaultDisplay();
        Point var2 = new Point();
        if (VERSION.SDK_INT >= 17) {
            var3.getRealSize(var2);
        } else {
            var3.getSize(var2);
        }

        boolean var1;
        if (Math.min(var2.x, var2.y) >= this.field_1013.getResources().getDimensionPixelSize(a$d.abc_cascading_menus_min_smallest_width)) {
            var1 = true;
        } else {
            var1 = false;
        }

        Object var4;
        if (var1) {
            var4 = new class_165(this.field_1013, this.field_1018, this.field_1016, this.field_1017, this.field_1015);
        } else {
            var4 = new class_166(this.field_1013, this.field_1014, this.field_1018, this.field_1016, this.field_1017, this.field_1015);
        }

        ((class_164)var4).method_1386(this.field_1014);
        ((class_164)var4).method_1388(this.field_1024);
        ((class_164)var4).method_1387(this.field_1018);
        ((class_164)var4).a(this.field_1021);
        ((class_164)var4).method_1389(this.field_1020);
        ((class_164)var4).method_1384(this.field_1019);
        return (class_164)var4;
    }

    // $FF: renamed from: a () void
    public void method_1036() {
        if (!this.method_1044()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    // $FF: renamed from: a (int) void
    public void method_1037(int var1) {
        this.field_1019 = var1;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.m$a) void
    public void method_1038(m$a var1) {
        this.field_1021 = var1;
        if (this.field_1022 != null) {
            this.field_1022.a(var1);
        }

    }

    // $FF: renamed from: a (android.view.View) void
    public void method_1039(View var1) {
        this.field_1018 = var1;
    }

    // $FF: renamed from: a (android.widget.PopupWindow.OnDismissListener) void
    public void method_1040(OnDismissListener var1) {
        this.field_1023 = var1;
    }

    // $FF: renamed from: a (boolean) void
    public void method_1041(boolean var1) {
        this.field_1020 = var1;
        if (this.field_1022 != null) {
            this.field_1022.method_1389(var1);
        }

    }

    // $FF: renamed from: a (int, int) boolean
    public boolean method_1042(int var1, int var2) {
        boolean var3 = true;
        if (!this.method_1047()) {
            if (this.field_1018 == null) {
                var3 = false;
            } else {
                this.method_1034(var1, var2, true, true);
            }
        }

        return var3;
    }

    // $FF: renamed from: b () android.support.v7.view.menu.k
    public class_164 method_1043() {
        if (this.field_1022 == null) {
            this.field_1022 = this.method_1035();
        }

        return this.field_1022;
    }

    // $FF: renamed from: c () boolean
    public boolean method_1044() {
        boolean var1 = false;
        if (this.method_1047()) {
            var1 = true;
        } else if (this.field_1018 != null) {
            this.method_1034(0, 0, false, false);
            var1 = true;
        }

        return var1;
    }

    // $FF: renamed from: d () void
    public void method_1045() {
        if (this.method_1047()) {
            this.field_1022.c();
        }

    }

    // $FF: renamed from: e () void
    protected void method_1046() {
        this.field_1022 = null;
        if (this.field_1023 != null) {
            this.field_1023.onDismiss();
        }

    }

    // $FF: renamed from: f () boolean
    public boolean method_1047() {
        boolean var1;
        if (this.field_1022 != null && this.field_1022.d()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }
}
