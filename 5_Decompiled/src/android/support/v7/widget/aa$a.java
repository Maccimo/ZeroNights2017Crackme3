package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.view.menu.class_162;
import android.support.v7.view.menu.class_167;
import android.support.v7.view.menu.class_168;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

public class aa$a extends class_66 {
    // $FF: renamed from: g int
    final int field_617;
    // $FF: renamed from: h int
    final int field_618;
    // $FF: renamed from: i android.support.v7.widget.z
    private class_8 field_619;
    // $FF: renamed from: j android.view.MenuItem
    private MenuItem field_620;

    public aa$a(Context var1, boolean var2) {
        super(var1, var2);
        Configuration var3 = var1.getResources().getConfiguration();
        if (VERSION.SDK_INT >= 17 && 1 == var3.getLayoutDirection()) {
            this.field_617 = 21;
            this.field_618 = 22;
        } else {
            this.field_617 = 22;
            this.field_618 = 21;
        }

    }

    public boolean onHoverEvent(MotionEvent var1) {
        if (this.field_619 != null) {
            ListAdapter var4 = this.getAdapter();
            int var2;
            class_167 var8;
            if (var4 instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter var7 = (HeaderViewListAdapter)var4;
                var2 = var7.getHeadersCount();
                var8 = (class_167)var7.getWrappedAdapter();
            } else {
                var2 = 0;
                var8 = (class_167)var4;
            }

            class_168 var5;
            label30: {
                if (var1.getAction() != 10) {
                    int var3 = this.pointToPosition((int)var1.getX(), (int)var1.getY());
                    if (var3 != -1) {
                        var2 = var3 - var2;
                        if (var2 >= 0 && var2 < var8.getCount()) {
                            var5 = var8.method_1415(var2);
                            break label30;
                        }
                    }
                }

                var5 = null;
            }

            MenuItem var6 = this.field_620;
            if (var6 != var5) {
                class_162 var9 = var8.method_1414();
                if (var6 != null) {
                    this.field_619.method_29(var9, var6);
                }

                this.field_620 = var5;
                if (var5 != null) {
                    this.field_619.method_30(var9, var5);
                }
            }
        }

        return super.onHoverEvent(var1);
    }

    public boolean onKeyDown(int var1, KeyEvent var2) {
        ListMenuItemView var4 = (ListMenuItemView)this.getSelectedView();
        boolean var3;
        if (var4 != null && var1 == this.field_617) {
            if (var4.isEnabled() && var4.getItemData().hasSubMenu()) {
                this.performItemClick(var4, this.getSelectedItemPosition(), this.getSelectedItemId());
            }

            var3 = true;
        } else if (var4 != null && var1 == this.field_618) {
            this.setSelection(-1);
            ((class_167)this.getAdapter()).method_1414().method_1354(false);
            var3 = true;
        } else {
            var3 = super.onKeyDown(var1, var2);
        }

        return var3;
    }

    public void setHoverListener(class_8 var1) {
        this.field_619 = var1;
    }
}
