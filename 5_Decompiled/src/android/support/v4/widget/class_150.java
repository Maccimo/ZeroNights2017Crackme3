package android.support.v4.widget;

import android.widget.ListView;

// $FF: renamed from: android.support.v4.widget.f
public class class_150 extends class_149 {
    // $FF: renamed from: f android.widget.ListView
    private final ListView field_1153;

    public class_150(ListView var1) {
        super(var1);
        this.field_1153 = var1;
    }

    // $FF: renamed from: a (int, int) void
    public void method_1265(int var1, int var2) {
        class_151.method_1277(this.field_1153, var2);
    }

    // $FF: renamed from: e (int) boolean
    public boolean method_1275(int var1) {
        return false;
    }

    // $FF: renamed from: f (int) boolean
    public boolean method_1276(int var1) {
        boolean var6 = false;
        ListView var7 = this.field_1153;
        int var3 = var7.getCount();
        boolean var5;
        if (var3 == 0) {
            var5 = var6;
        } else {
            int var2 = var7.getChildCount();
            int var4 = var7.getFirstVisiblePosition();
            if (var1 > 0) {
                if (var4 + var2 >= var3) {
                    var5 = var6;
                    if (var7.getChildAt(var2 - 1).getBottom() <= var7.getHeight()) {
                        return var5;
                    }
                }
            } else {
                var5 = var6;
                if (var1 >= 0) {
                    return var5;
                }

                if (var4 <= 0 && var7.getChildAt(0).getTop() >= 0) {
                    var5 = var6;
                    return var5;
                }
            }

            var5 = true;
        }

        return var5;
    }
}
