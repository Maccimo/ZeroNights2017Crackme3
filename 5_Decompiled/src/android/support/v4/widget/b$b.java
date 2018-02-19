package android.support.v4.widget;

import android.database.DataSetObserver;

class b$b extends DataSetObserver {
    // $FF: renamed from: a android.support.v4.widget.b
    // $FF: synthetic field
    final class_90 field_1035;

    b$b(class_90 var1) {
        this.field_1035 = var1;
    }

    public void onChanged() {
        this.field_1035.field_776 = true;
        this.field_1035.notifyDataSetChanged();
    }

    public void onInvalidated() {
        this.field_1035.field_776 = false;
        this.field_1035.notifyDataSetInvalidated();
    }
}
