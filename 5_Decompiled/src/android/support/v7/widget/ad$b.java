package android.support.v7.widget;

import android.view.View;
import android.view.View.OnClickListener;

class ad$b implements OnClickListener {
    // $FF: renamed from: a android.support.v7.widget.ad
    // $FF: synthetic field
    final class_93 field_1093;

    ad$b(class_93 var1) {
        this.field_1093 = var1;
    }

    public void onClick(View var1) {
        ((ad$c)var1).method_262().method_579();
        int var3 = this.field_1093.field_805.getChildCount();

        for(int var2 = 0; var2 < var3; ++var2) {
            View var5 = this.field_1093.field_805.getChildAt(var2);
            boolean var4;
            if (var5 == var1) {
                var4 = true;
            } else {
                var4 = false;
            }

            var5.setSelected(var4);
        }

    }
}
