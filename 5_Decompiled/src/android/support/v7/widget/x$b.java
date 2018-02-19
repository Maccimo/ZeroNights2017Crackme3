package android.support.v7.widget;

import android.database.DataSetObserver;

class x$b extends DataSetObserver {
    // $FF: renamed from: a android.support.v7.widget.x
    // $FF: synthetic field
    final class_27 field_663;

    x$b(class_27 var1) {
        this.field_663 = var1;
    }

    public void onChanged() {
        if (this.field_663.method_149()) {
            this.field_663.method_147();
        }

    }

    public void onInvalidated() {
        this.field_663.method_148();
    }
}
