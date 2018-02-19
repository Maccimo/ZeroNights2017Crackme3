package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.widget.ListView;

class AlertController {
    public static class RecycleListView extends ListView {
        // $FF: renamed from: a int
        private final int field_1087;
        // $FF: renamed from: b int
        private final int field_1088;

        public RecycleListView(Context var1) {
            this(var1, (AttributeSet)null);
        }

        public RecycleListView(Context var1, AttributeSet var2) {
            super(var1, var2);
            TypedArray var3 = var1.obtainStyledAttributes(var2, a$j.RecycleListView);
            this.field_1088 = var3.getDimensionPixelOffset(a$j.RecycleListView_paddingBottomNoButtons, -1);
            this.field_1087 = var3.getDimensionPixelOffset(a$j.RecycleListView_paddingTopNoTitle, -1);
        }
    }
}
