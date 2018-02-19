package android.support.v7.widget;

import android.support.v7.app.a$b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

class ad$a extends BaseAdapter {
    // $FF: renamed from: a android.support.v7.widget.ad
    // $FF: synthetic field
    final class_93 field_1094;

    ad$a(class_93 var1) {
        this.field_1094 = var1;
    }

    public int getCount() {
        return this.field_1094.field_805.getChildCount();
    }

    public Object getItem(int var1) {
        return ((ad$c)this.field_1094.field_805.getChildAt(var1)).method_262();
    }

    public long getItemId(int var1) {
        return (long)var1;
    }

    public View getView(int var1, View var2, ViewGroup var3) {
        if (var2 == null) {
            var2 = this.field_1094.method_855((a$b)this.getItem(var1), true);
        } else {
            ((ad$c)var2).method_261((a$b)this.getItem(var1));
        }

        return (View)var2;
    }
}
