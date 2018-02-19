package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.class_12;
import android.support.v4.h.class_129;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

// $FF: renamed from: android.support.v7.view.menu.i
public class class_125 extends class_124 implements MenuItem {
    // $FF: renamed from: c java.lang.reflect.Method
    private Method field_1049;

    class_125(Context var1, class_12 var2) {
        super(var1, var2);
    }

    // $FF: renamed from: a (android.view.ActionProvider) android.support.v7.view.menu.i$a
    i$a method_1060(ActionProvider var1) {
        return new i$a(this, this.a, var1);
    }

    // $FF: renamed from: a (boolean) void
    public void method_1061(boolean var1) {
        try {
            if (this.field_1049 == null) {
                this.field_1049 = ((class_12)this.b).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }

            this.field_1049.invoke(this.b, var1);
        } catch (Exception var3) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", var3);
        }

    }

    public boolean collapseActionView() {
        return ((class_12)this.b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((class_12)this.b).expandActionView();
    }

    public ActionProvider getActionProvider() {
        class_129 var1 = ((class_12)this.b).method_38();
        ActionProvider var2;
        if (var1 instanceof i$a) {
            var2 = ((i$a)var1).field_1056;
        } else {
            var2 = null;
        }

        return var2;
    }

    public View getActionView() {
        View var2 = ((class_12)this.b).getActionView();
        View var1 = var2;
        if (var2 instanceof i$b) {
            var1 = ((i$b)var2).method_1063();
        }

        return var1;
    }

    public int getAlphabeticModifiers() {
        return ((class_12)this.b).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((class_12)this.b).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((class_12)this.b).getContentDescription();
    }

    public int getGroupId() {
        return ((class_12)this.b).getGroupId();
    }

    public Drawable getIcon() {
        return ((class_12)this.b).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((class_12)this.b).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((class_12)this.b).getIconTintMode();
    }

    public Intent getIntent() {
        return ((class_12)this.b).getIntent();
    }

    public int getItemId() {
        return ((class_12)this.b).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((class_12)this.b).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((class_12)this.b).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((class_12)this.b).getNumericShortcut();
    }

    public int getOrder() {
        return ((class_12)this.b).getOrder();
    }

    public SubMenu getSubMenu() {
        return this.a(((class_12)this.b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((class_12)this.b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((class_12)this.b).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((class_12)this.b).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((class_12)this.b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((class_12)this.b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((class_12)this.b).isCheckable();
    }

    public boolean isChecked() {
        return ((class_12)this.b).isChecked();
    }

    public boolean isEnabled() {
        return ((class_12)this.b).isEnabled();
    }

    public boolean isVisible() {
        return ((class_12)this.b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider var1) {
        class_12 var2 = (class_12)this.b;
        i$a var3;
        if (var1 != null) {
            var3 = this.method_1060(var1);
        } else {
            var3 = null;
        }

        var2.method_36(var3);
        return this;
    }

    public MenuItem setActionView(int var1) {
        ((class_12)this.b).setActionView(var1);
        View var2 = ((class_12)this.b).getActionView();
        if (var2 instanceof CollapsibleActionView) {
            ((class_12)this.b).setActionView(new i$b(var2));
        }

        return this;
    }

    public MenuItem setActionView(View var1) {
        Object var2 = var1;
        if (var1 instanceof CollapsibleActionView) {
            var2 = new i$b(var1);
        }

        ((class_12)this.b).setActionView((View)var2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char var1) {
        ((class_12)this.b).setAlphabeticShortcut(var1);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char var1, int var2) {
        ((class_12)this.b).setAlphabeticShortcut(var1, var2);
        return this;
    }

    public MenuItem setCheckable(boolean var1) {
        ((class_12)this.b).setCheckable(var1);
        return this;
    }

    public MenuItem setChecked(boolean var1) {
        ((class_12)this.b).setChecked(var1);
        return this;
    }

    public MenuItem setContentDescription(CharSequence var1) {
        ((class_12)this.b).method_37(var1);
        return this;
    }

    public MenuItem setEnabled(boolean var1) {
        ((class_12)this.b).setEnabled(var1);
        return this;
    }

    public MenuItem setIcon(int var1) {
        ((class_12)this.b).setIcon(var1);
        return this;
    }

    public MenuItem setIcon(Drawable var1) {
        ((class_12)this.b).setIcon(var1);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList var1) {
        ((class_12)this.b).setIconTintList(var1);
        return this;
    }

    public MenuItem setIconTintMode(Mode var1) {
        ((class_12)this.b).setIconTintMode(var1);
        return this;
    }

    public MenuItem setIntent(Intent var1) {
        ((class_12)this.b).setIntent(var1);
        return this;
    }

    public MenuItem setNumericShortcut(char var1) {
        ((class_12)this.b).setNumericShortcut(var1);
        return this;
    }

    public MenuItem setNumericShortcut(char var1, int var2) {
        ((class_12)this.b).setNumericShortcut(var1, var2);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener var1) {
        class_12 var2 = (class_12)this.b;
        i$c var3;
        if (var1 != null) {
            var3 = new i$c(this, var1);
        } else {
            var3 = null;
        }

        var2.setOnActionExpandListener(var3);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener var1) {
        class_12 var2 = (class_12)this.b;
        i$d var3;
        if (var1 != null) {
            var3 = new i$d(this, var1);
        } else {
            var3 = null;
        }

        var2.setOnMenuItemClickListener(var3);
        return this;
    }

    public MenuItem setShortcut(char var1, char var2) {
        ((class_12)this.b).setShortcut(var1, var2);
        return this;
    }

    public MenuItem setShortcut(char var1, char var2, int var3, int var4) {
        ((class_12)this.b).setShortcut(var1, var2, var3, var4);
        return this;
    }

    public void setShowAsAction(int var1) {
        ((class_12)this.b).setShowAsAction(var1);
    }

    public MenuItem setShowAsActionFlags(int var1) {
        ((class_12)this.b).setShowAsActionFlags(var1);
        return this;
    }

    public MenuItem setTitle(int var1) {
        ((class_12)this.b).setTitle(var1);
        return this;
    }

    public MenuItem setTitle(CharSequence var1) {
        ((class_12)this.b).setTitle(var1);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence var1) {
        ((class_12)this.b).setTitleCondensed(var1);
        return this;
    }

    public MenuItem setTooltipText(CharSequence var1) {
        ((class_12)this.b).method_39(var1);
        return this;
    }

    public MenuItem setVisible(boolean var1) {
        return ((class_12)this.b).setVisible(var1);
    }
}
