package android.support.v4.d.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.v4.h.class_129;
import android.view.MenuItem;
import android.view.View;

// $FF: renamed from: android.support.v4.d.a.b
public interface class_12 extends MenuItem {
    // $FF: renamed from: a (android.support.v4.h.c) android.support.v4.d.a.b
    class_12 method_36(class_129 var1);

    // $FF: renamed from: a (java.lang.CharSequence) android.support.v4.d.a.b
    class_12 method_37(CharSequence var1);

    // $FF: renamed from: a () android.support.v4.h.c
    class_129 method_38();

    // $FF: renamed from: b (java.lang.CharSequence) android.support.v4.d.a.b
    class_12 method_39(CharSequence var1);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int var1);

    MenuItem setActionView(View var1);

    MenuItem setAlphabeticShortcut(char var1, int var2);

    MenuItem setIconTintList(ColorStateList var1);

    MenuItem setIconTintMode(Mode var1);

    MenuItem setNumericShortcut(char var1, int var2);

    MenuItem setShortcut(char var1, char var2, int var3, int var4);

    void setShowAsAction(int var1);

    MenuItem setShowAsActionFlags(int var1);
}
