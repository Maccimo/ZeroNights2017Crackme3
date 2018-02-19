package android.support.v7.widget;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

class m$a implements ListAdapter, SpinnerAdapter {
    // $FF: renamed from: a android.widget.SpinnerAdapter
    private SpinnerAdapter field_13;
    // $FF: renamed from: b android.widget.ListAdapter
    private ListAdapter field_14;

    public m$a(SpinnerAdapter var1, Theme var2) {
        this.field_13 = var1;
        if (var1 instanceof ListAdapter) {
            this.field_14 = (ListAdapter)var1;
        }

        if (var2 != null) {
            if (VERSION.SDK_INT >= 23 && var1 instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter var4 = (ThemedSpinnerAdapter)var1;
                if (var4.getDropDownViewTheme() != var2) {
                    var4.setDropDownViewTheme(var2);
                }
            } else if (var1 instanceof class_9) {
                class_9 var3 = (class_9)var1;
                if (var3.method_31() == null) {
                    var3.method_32(var2);
                }
            }
        }

    }

    public boolean areAllItemsEnabled() {
        ListAdapter var2 = this.field_14;
        boolean var1;
        if (var2 != null) {
            var1 = var2.areAllItemsEnabled();
        } else {
            var1 = true;
        }

        return var1;
    }

    public int getCount() {
        int var1;
        if (this.field_13 == null) {
            var1 = 0;
        } else {
            var1 = this.field_13.getCount();
        }

        return var1;
    }

    public View getDropDownView(int var1, View var2, ViewGroup var3) {
        if (this.field_13 == null) {
            var2 = null;
        } else {
            var2 = this.field_13.getDropDownView(var1, var2, var3);
        }

        return var2;
    }

    public Object getItem(int var1) {
        Object var2;
        if (this.field_13 == null) {
            var2 = null;
        } else {
            var2 = this.field_13.getItem(var1);
        }

        return var2;
    }

    public long getItemId(int var1) {
        long var2;
        if (this.field_13 == null) {
            var2 = -1L;
        } else {
            var2 = this.field_13.getItemId(var1);
        }

        return var2;
    }

    public int getItemViewType(int var1) {
        return 0;
    }

    public View getView(int var1, View var2, ViewGroup var3) {
        return this.getDropDownView(var1, var2, var3);
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        boolean var1;
        if (this.field_13 != null && this.field_13.hasStableIds()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public boolean isEmpty() {
        boolean var1;
        if (this.getCount() == 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public boolean isEnabled(int var1) {
        ListAdapter var3 = this.field_14;
        boolean var2;
        if (var3 != null) {
            var2 = var3.isEnabled(var1);
        } else {
            var2 = true;
        }

        return var2;
    }

    public void registerDataSetObserver(DataSetObserver var1) {
        if (this.field_13 != null) {
            this.field_13.registerDataSetObserver(var1);
        }

    }

    public void unregisterDataSetObserver(DataSetObserver var1) {
        if (this.field_13 != null) {
            this.field_13.unregisterDataSetObserver(var1);
        }

    }
}
