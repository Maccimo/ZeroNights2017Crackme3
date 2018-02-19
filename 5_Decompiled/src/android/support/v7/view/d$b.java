package android.support.v7.view;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.v4.h.class_129;
import android.support.v4.h.class_143;
import android.support.v7.a.a$j;
import android.support.v7.view.menu.class_125;
import android.support.v7.view.menu.class_168;
import android.support.v7.widget.class_67;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

class d$b {
    // $FF: renamed from: A java.lang.String
    private String field_450;
    // $FF: renamed from: B java.lang.String
    private String field_451;
    // $FF: renamed from: C java.lang.CharSequence
    private CharSequence field_452;
    // $FF: renamed from: D java.lang.CharSequence
    private CharSequence field_453;
    // $FF: renamed from: E android.content.res.ColorStateList
    private ColorStateList field_454;
    // $FF: renamed from: F android.graphics.PorterDuff.Mode
    private Mode field_455;
    // $FF: renamed from: a android.support.v4.h.c
    class_129 field_456;
    // $FF: renamed from: b android.support.v7.view.d
    // $FF: synthetic field
    final class_156 field_457;
    // $FF: renamed from: c android.view.Menu
    private Menu field_458;
    // $FF: renamed from: d int
    private int field_459;
    // $FF: renamed from: e int
    private int field_460;
    // $FF: renamed from: f int
    private int field_461;
    // $FF: renamed from: g int
    private int field_462;
    // $FF: renamed from: h boolean
    private boolean field_463;
    // $FF: renamed from: i boolean
    private boolean field_464;
    // $FF: renamed from: j boolean
    private boolean field_465;
    // $FF: renamed from: k int
    private int field_466;
    // $FF: renamed from: l int
    private int field_467;
    // $FF: renamed from: m java.lang.CharSequence
    private CharSequence field_468;
    // $FF: renamed from: n java.lang.CharSequence
    private CharSequence field_469;
    // $FF: renamed from: o int
    private int field_470;
    // $FF: renamed from: p char
    private char field_471;
    // $FF: renamed from: q int
    private int field_472;
    // $FF: renamed from: r char
    private char field_473;
    // $FF: renamed from: s int
    private int field_474;
    // $FF: renamed from: t int
    private int field_475;
    // $FF: renamed from: u boolean
    private boolean field_476;
    // $FF: renamed from: v boolean
    private boolean field_477;
    // $FF: renamed from: w boolean
    private boolean field_478;
    // $FF: renamed from: x int
    private int field_479;
    // $FF: renamed from: y int
    private int field_480;
    // $FF: renamed from: z java.lang.String
    private String field_481;

    public d$b(class_156 var1, Menu var2) {
        this.field_457 = var1;
        this.field_454 = null;
        this.field_455 = null;
        this.field_458 = var2;
        this.method_506();
    }

    // $FF: renamed from: a (java.lang.String) char
    private char method_503(String var1) {
        char var2 = 0;
        if (var1 != null) {
            var2 = var1.charAt(0);
        }

        return var2;
    }

    // $FF: renamed from: a (java.lang.String, java.lang.Class[], java.lang.Object[]) java.lang.Object
    private Object method_504(String var1, Class[] var2, Object[] var3) {
        Object var5;
        Object var7;
        try {
            Constructor var6 = this.field_457.field_1188.getClassLoader().loadClass(var1).getConstructor(var2);
            var6.setAccessible(true);
            var7 = var6.newInstance(var3);
        } catch (Exception var4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + var1, var4);
            var5 = null;
            return var5;
        }

        var5 = var7;
        return var5;
    }

    // $FF: renamed from: a (android.view.MenuItem) void
    private void method_505(MenuItem var1) {
        boolean var2 = true;
        MenuItem var4 = var1.setChecked(this.field_476).setVisible(this.field_477).setEnabled(this.field_478);
        boolean var3;
        if (this.field_475 >= 1) {
            var3 = true;
        } else {
            var3 = false;
        }

        var4.setCheckable(var3).setTitleCondensed(this.field_469).setIcon(this.field_470);
        if (this.field_479 >= 0) {
            var1.setShowAsAction(this.field_479);
        }

        if (this.field_451 != null) {
            if (this.field_457.field_1188.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }

            var1.setOnMenuItemClickListener(new d$a(this.field_457.method_1305(), this.field_451));
        }

        if (var1 instanceof class_168) {
            class_168 var5 = (class_168)var1;
        }

        if (this.field_475 >= 2) {
            if (var1 instanceof class_168) {
                ((class_168)var1).method_1424(true);
            } else if (var1 instanceof class_125) {
                ((class_125)var1).method_1061(true);
            }
        }

        if (this.field_481 != null) {
            var1.setActionView((View)this.method_504(this.field_481, class_156.field_1184, this.field_457.field_1186));
        } else {
            var2 = false;
        }

        if (this.field_480 > 0) {
            if (!var2) {
                var1.setActionView(this.field_480);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }

        if (this.field_456 != null) {
            class_143.method_1196(var1, this.field_456);
        }

        class_143.method_1200(var1, this.field_452);
        class_143.method_1202(var1, this.field_453);
        class_143.method_1201(var1, this.field_471, this.field_472);
        class_143.method_1197(var1, this.field_473, this.field_474);
        if (this.field_455 != null) {
            class_143.method_1199(var1, this.field_455);
        }

        if (this.field_454 != null) {
            class_143.method_1198(var1, this.field_454);
        }

    }

    // $FF: renamed from: a () void
    public void method_506() {
        this.field_459 = 0;
        this.field_460 = 0;
        this.field_461 = 0;
        this.field_462 = 0;
        this.field_463 = true;
        this.field_464 = true;
    }

    // $FF: renamed from: a (android.util.AttributeSet) void
    public void method_507(AttributeSet var1) {
        TypedArray var2 = this.field_457.field_1188.obtainStyledAttributes(var1, a$j.MenuGroup);
        this.field_459 = var2.getResourceId(a$j.MenuGroup_android_id, 0);
        this.field_460 = var2.getInt(a$j.MenuGroup_android_menuCategory, 0);
        this.field_461 = var2.getInt(a$j.MenuGroup_android_orderInCategory, 0);
        this.field_462 = var2.getInt(a$j.MenuGroup_android_checkableBehavior, 0);
        this.field_463 = var2.getBoolean(a$j.MenuGroup_android_visible, true);
        this.field_464 = var2.getBoolean(a$j.MenuGroup_android_enabled, true);
        var2.recycle();
    }

    // $FF: renamed from: b () void
    public void method_508() {
        this.field_465 = true;
        this.method_505(this.field_458.add(this.field_459, this.field_466, this.field_467, this.field_468));
    }

    // $FF: renamed from: b (android.util.AttributeSet) void
    public void method_509(AttributeSet var1) {
        boolean var3 = true;
        TypedArray var4 = this.field_457.field_1188.obtainStyledAttributes(var1, a$j.MenuItem);
        this.field_466 = var4.getResourceId(a$j.MenuItem_android_id, 0);
        this.field_467 = var4.getInt(a$j.MenuItem_android_menuCategory, this.field_460) & -65536 | var4.getInt(a$j.MenuItem_android_orderInCategory, this.field_461) & '\uffff';
        this.field_468 = var4.getText(a$j.MenuItem_android_title);
        this.field_469 = var4.getText(a$j.MenuItem_android_titleCondensed);
        this.field_470 = var4.getResourceId(a$j.MenuItem_android_icon, 0);
        this.field_471 = this.method_503(var4.getString(a$j.MenuItem_android_alphabeticShortcut));
        this.field_472 = var4.getInt(a$j.MenuItem_alphabeticModifiers, 4096);
        this.field_473 = this.method_503(var4.getString(a$j.MenuItem_android_numericShortcut));
        this.field_474 = var4.getInt(a$j.MenuItem_numericModifiers, 4096);
        if (var4.hasValue(a$j.MenuItem_android_checkable)) {
            byte var2;
            if (var4.getBoolean(a$j.MenuItem_android_checkable, false)) {
                var2 = 1;
            } else {
                var2 = 0;
            }

            this.field_475 = var2;
        } else {
            this.field_475 = this.field_462;
        }

        this.field_476 = var4.getBoolean(a$j.MenuItem_android_checked, false);
        this.field_477 = var4.getBoolean(a$j.MenuItem_android_visible, this.field_463);
        this.field_478 = var4.getBoolean(a$j.MenuItem_android_enabled, this.field_464);
        this.field_479 = var4.getInt(a$j.MenuItem_showAsAction, -1);
        this.field_451 = var4.getString(a$j.MenuItem_android_onClick);
        this.field_480 = var4.getResourceId(a$j.MenuItem_actionLayout, 0);
        this.field_481 = var4.getString(a$j.MenuItem_actionViewClass);
        this.field_450 = var4.getString(a$j.MenuItem_actionProviderClass);
        boolean var5;
        if (this.field_450 != null) {
            var5 = var3;
        } else {
            var5 = false;
        }

        if (var5 && this.field_480 == 0 && this.field_481 == null) {
            this.field_456 = (class_129)this.method_504(this.field_450, class_156.field_1185, this.field_457.field_1187);
        } else {
            if (var5) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }

            this.field_456 = null;
        }

        this.field_452 = var4.getText(a$j.MenuItem_contentDescription);
        this.field_453 = var4.getText(a$j.MenuItem_tooltipText);
        if (var4.hasValue(a$j.MenuItem_iconTintMode)) {
            this.field_455 = class_67.method_655(var4.getInt(a$j.MenuItem_iconTintMode, -1), this.field_455);
        } else {
            this.field_455 = null;
        }

        if (var4.hasValue(a$j.MenuItem_iconTint)) {
            this.field_454 = var4.getColorStateList(a$j.MenuItem_iconTint);
        } else {
            this.field_454 = null;
        }

        var4.recycle();
        this.field_465 = false;
    }

    // $FF: renamed from: c () android.view.SubMenu
    public SubMenu method_510() {
        this.field_465 = true;
        SubMenu var1 = this.field_458.addSubMenu(this.field_459, this.field_466, this.field_467, this.field_468);
        this.method_505(var1.getItem());
        return var1;
    }

    // $FF: renamed from: d () boolean
    public boolean method_511() {
        return this.field_465;
    }
}
