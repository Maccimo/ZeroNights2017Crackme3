package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.b.class_47;
import android.support.v4.c.a.class_48;
import android.support.v4.d.a.class_12;
import android.support.v4.h.class_129;
import android.view.ActionProvider;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;

// $FF: renamed from: android.support.v7.view.menu.a
public class class_169 implements class_12 {
    // $FF: renamed from: a int
    private final int field_1324;
    // $FF: renamed from: b int
    private final int field_1325;
    // $FF: renamed from: c int
    private final int field_1326;
    // $FF: renamed from: d int
    private final int field_1327;
    // $FF: renamed from: e java.lang.CharSequence
    private CharSequence field_1328;
    // $FF: renamed from: f java.lang.CharSequence
    private CharSequence field_1329;
    // $FF: renamed from: g android.content.Intent
    private Intent field_1330;
    // $FF: renamed from: h char
    private char field_1331;
    // $FF: renamed from: i int
    private int field_1332 = 4096;
    // $FF: renamed from: j char
    private char field_1333;
    // $FF: renamed from: k int
    private int field_1334 = 4096;
    // $FF: renamed from: l android.graphics.drawable.Drawable
    private Drawable field_1335;
    // $FF: renamed from: m int
    private int field_1336 = 0;
    // $FF: renamed from: n android.content.Context
    private Context field_1337;
    // $FF: renamed from: o android.view.MenuItem.OnMenuItemClickListener
    private OnMenuItemClickListener field_1338;
    // $FF: renamed from: p java.lang.CharSequence
    private CharSequence field_1339;
    // $FF: renamed from: q java.lang.CharSequence
    private CharSequence field_1340;
    // $FF: renamed from: r android.content.res.ColorStateList
    private ColorStateList field_1341 = null;
    // $FF: renamed from: s android.graphics.PorterDuff.Mode
    private Mode field_1342 = null;
    // $FF: renamed from: t boolean
    private boolean field_1343 = false;
    // $FF: renamed from: u boolean
    private boolean field_1344 = false;
    // $FF: renamed from: v int
    private int field_1345 = 16;

    public class_169(Context var1, int var2, int var3, int var4, int var5, CharSequence var6) {
        this.field_1337 = var1;
        this.field_1324 = var3;
        this.field_1325 = var2;
        this.field_1326 = var4;
        this.field_1327 = var5;
        this.field_1328 = var6;
    }

    // $FF: renamed from: b () void
    private void method_1443() {
        if (this.field_1335 != null && (this.field_1343 || this.field_1344)) {
            this.field_1335 = class_48.method_532(this.field_1335);
            this.field_1335 = this.field_1335.mutate();
            if (this.field_1343) {
                class_48.method_523(this.field_1335, this.field_1341);
            }

            if (this.field_1344) {
                class_48.method_526(this.field_1335, this.field_1342);
            }
        }

    }

    // $FF: renamed from: a (int) android.support.v4.d.a.b
    public class_12 method_1444(int var1) {
        throw new UnsupportedOperationException();
    }

    // $FF: renamed from: a (android.support.v4.h.c) android.support.v4.d.a.b
    public class_12 method_36(class_129 var1) {
        throw new UnsupportedOperationException();
    }

    // $FF: renamed from: a (android.view.View) android.support.v4.d.a.b
    public class_12 method_1445(View var1) {
        throw new UnsupportedOperationException();
    }

    // $FF: renamed from: a (java.lang.CharSequence) android.support.v4.d.a.b
    public class_12 method_37(CharSequence var1) {
        this.field_1339 = var1;
        return this;
    }

    // $FF: renamed from: a () android.support.v4.h.c
    public class_129 method_38() {
        return null;
    }

    // $FF: renamed from: b (int) android.support.v4.d.a.b
    public class_12 method_1446(int var1) {
        this.setShowAsAction(var1);
        return this;
    }

    // $FF: renamed from: b (java.lang.CharSequence) android.support.v4.d.a.b
    public class_12 method_39(CharSequence var1) {
        this.field_1340 = var1;
        return this;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.field_1334;
    }

    public char getAlphabeticShortcut() {
        return this.field_1333;
    }

    public CharSequence getContentDescription() {
        return this.field_1339;
    }

    public int getGroupId() {
        return this.field_1325;
    }

    public Drawable getIcon() {
        return this.field_1335;
    }

    public ColorStateList getIconTintList() {
        return this.field_1341;
    }

    public Mode getIconTintMode() {
        return this.field_1342;
    }

    public Intent getIntent() {
        return this.field_1330;
    }

    public int getItemId() {
        return this.field_1324;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.field_1332;
    }

    public char getNumericShortcut() {
        return this.field_1331;
    }

    public int getOrder() {
        return this.field_1327;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.field_1328;
    }

    public CharSequence getTitleCondensed() {
        CharSequence var1;
        if (this.field_1329 != null) {
            var1 = this.field_1329;
        } else {
            var1 = this.field_1328;
        }

        return var1;
    }

    public CharSequence getTooltipText() {
        return this.field_1340;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        boolean var1;
        if ((this.field_1345 & 1) != 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public boolean isChecked() {
        boolean var1;
        if ((this.field_1345 & 2) != 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public boolean isEnabled() {
        boolean var1;
        if ((this.field_1345 & 16) != 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public boolean isVisible() {
        boolean var1;
        if ((this.field_1345 & 8) == 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public MenuItem setActionProvider(ActionProvider var1) {
        throw new UnsupportedOperationException();
    }

    // $FF: synthetic method
    public MenuItem setActionView(int var1) {
        return this.method_1444(var1);
    }

    // $FF: synthetic method
    public MenuItem setActionView(View var1) {
        return this.method_1445(var1);
    }

    public MenuItem setAlphabeticShortcut(char var1) {
        this.field_1333 = Character.toLowerCase(var1);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char var1, int var2) {
        this.field_1333 = Character.toLowerCase(var1);
        this.field_1334 = KeyEvent.normalizeMetaState(var2);
        return this;
    }

    public MenuItem setCheckable(boolean var1) {
        int var3 = this.field_1345;
        byte var2;
        if (var1) {
            var2 = 1;
        } else {
            var2 = 0;
        }

        this.field_1345 = var2 | var3 & -2;
        return this;
    }

    public MenuItem setChecked(boolean var1) {
        int var3 = this.field_1345;
        byte var2;
        if (var1) {
            var2 = 2;
        } else {
            var2 = 0;
        }

        this.field_1345 = var2 | var3 & -3;
        return this;
    }

    // $FF: synthetic method
    public MenuItem setContentDescription(CharSequence var1) {
        return this.method_37(var1);
    }

    public MenuItem setEnabled(boolean var1) {
        int var3 = this.field_1345;
        byte var2;
        if (var1) {
            var2 = 16;
        } else {
            var2 = 0;
        }

        this.field_1345 = var2 | var3 & -17;
        return this;
    }

    public MenuItem setIcon(int var1) {
        this.field_1336 = var1;
        this.field_1335 = class_47.method_513(this.field_1337, var1);
        this.method_1443();
        return this;
    }

    public MenuItem setIcon(Drawable var1) {
        this.field_1335 = var1;
        this.field_1336 = 0;
        this.method_1443();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList var1) {
        this.field_1341 = var1;
        this.field_1343 = true;
        this.method_1443();
        return this;
    }

    public MenuItem setIconTintMode(Mode var1) {
        this.field_1342 = var1;
        this.field_1344 = true;
        this.method_1443();
        return this;
    }

    public MenuItem setIntent(Intent var1) {
        this.field_1330 = var1;
        return this;
    }

    public MenuItem setNumericShortcut(char var1) {
        this.field_1331 = var1;
        return this;
    }

    public MenuItem setNumericShortcut(char var1, int var2) {
        this.field_1331 = var1;
        this.field_1332 = KeyEvent.normalizeMetaState(var2);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener var1) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener var1) {
        this.field_1338 = var1;
        return this;
    }

    public MenuItem setShortcut(char var1, char var2) {
        this.field_1331 = var1;
        this.field_1333 = Character.toLowerCase(var2);
        return this;
    }

    public MenuItem setShortcut(char var1, char var2, int var3, int var4) {
        this.field_1331 = var1;
        this.field_1332 = KeyEvent.normalizeMetaState(var3);
        this.field_1333 = Character.toLowerCase(var2);
        this.field_1334 = KeyEvent.normalizeMetaState(var4);
        return this;
    }

    public void setShowAsAction(int var1) {
    }

    // $FF: synthetic method
    public MenuItem setShowAsActionFlags(int var1) {
        return this.method_1446(var1);
    }

    public MenuItem setTitle(int var1) {
        this.field_1328 = this.field_1337.getResources().getString(var1);
        return this;
    }

    public MenuItem setTitle(CharSequence var1) {
        this.field_1328 = var1;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence var1) {
        this.field_1329 = var1;
        return this;
    }

    // $FF: synthetic method
    public MenuItem setTooltipText(CharSequence var1) {
        return this.method_39(var1);
    }

    public MenuItem setVisible(boolean var1) {
        int var3 = this.field_1345;
        byte var2;
        if (var1) {
            var2 = 0;
        } else {
            var2 = 8;
        }

        this.field_1345 = var2 | var3 & 8;
        return this;
    }
}
