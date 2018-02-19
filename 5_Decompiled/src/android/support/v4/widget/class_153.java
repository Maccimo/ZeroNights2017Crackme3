package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

// $FF: renamed from: android.support.v4.widget.c
class class_153 extends Filter {
    // $FF: renamed from: a android.support.v4.widget.c$a
    c$a field_1155;

    class_153(c$a var1) {
        this.field_1155 = var1;
    }

    public CharSequence convertResultToString(Object var1) {
        return this.field_1155.method_110((Cursor)var1);
    }

    protected FilterResults performFiltering(CharSequence var1) {
        Cursor var3 = this.field_1155.method_108(var1);
        FilterResults var2 = new FilterResults();
        if (var3 != null) {
            var2.count = var3.getCount();
            var2.values = var3;
        } else {
            var2.count = 0;
            var2.values = null;
        }

        return var2;
    }

    protected void publishResults(CharSequence var1, FilterResults var2) {
        Cursor var3 = this.field_1155.method_107();
        if (var2.values != null && var2.values != var3) {
            this.field_1155.method_109((Cursor)var2.values);
        }

    }
}
