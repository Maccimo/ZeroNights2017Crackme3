package android.support.v7.widget;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class x$c implements OnScrollListener {
    // $FF: renamed from: a android.support.v7.widget.x
    // $FF: synthetic field
    final class_27 field_698;

    x$c(class_27 var1) {
        this.field_698 = var1;
    }

    public void onScroll(AbsListView var1, int var2, int var3, int var4) {
    }

    public void onScrollStateChanged(AbsListView var1, int var2) {
        if (var2 == 1 && !this.field_698.method_199() && this.field_698.field_34.getContentView() != null) {
            this.field_698.field_33.removeCallbacks(this.field_698.field_32);
            this.field_698.field_32.run();
        }

    }
}
