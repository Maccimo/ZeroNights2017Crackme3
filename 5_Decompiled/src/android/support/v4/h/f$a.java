package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;

class f$a extends f$b {
    // $FF: renamed from: a (android.view.MenuItem, char, int) void
    public void method_1(MenuItem var1, char var2, int var3) {
        var1.setAlphabeticShortcut(var2, var3);
    }

    // $FF: renamed from: a (android.view.MenuItem, android.content.res.ColorStateList) void
    public void method_2(MenuItem var1, ColorStateList var2) {
        var1.setIconTintList(var2);
    }

    // $FF: renamed from: a (android.view.MenuItem, android.graphics.PorterDuff.Mode) void
    public void method_3(MenuItem var1, Mode var2) {
        var1.setIconTintMode(var2);
    }

    // $FF: renamed from: a (android.view.MenuItem, java.lang.CharSequence) void
    public void method_4(MenuItem var1, CharSequence var2) {
        var1.setContentDescription(var2);
    }

    // $FF: renamed from: b (android.view.MenuItem, char, int) void
    public void method_5(MenuItem var1, char var2, int var3) {
        var1.setNumericShortcut(var2, var3);
    }

    // $FF: renamed from: b (android.view.MenuItem, java.lang.CharSequence) void
    public void method_6(MenuItem var1, CharSequence var2) {
        var1.setTooltipText(var2);
    }
}
