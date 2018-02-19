package android.support.v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class Space extends View {
    public Space(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public Space(Context var1, AttributeSet var2) {
        this(var1, var2, 0);
    }

    public Space(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        if (this.getVisibility() == 0) {
            this.setVisibility(4);
        }

    }

    // $FF: renamed from: a (int, int) int
    private static int method_1447(int var0, int var1) {
        int var3 = MeasureSpec.getMode(var1);
        int var2 = MeasureSpec.getSize(var1);
        var1 = var0;
        switch(var3) {
        case Integer.MIN_VALUE:
            var1 = Math.min(var0, var2);
        case 0:
            break;
        case 1073741824:
            var1 = var2;
            break;
        default:
            var1 = var0;
        }

        return var1;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas var1) {
    }

    protected void onMeasure(int var1, int var2) {
        this.setMeasuredDimension(method_1447(this.getSuggestedMinimumWidth(), var1), method_1447(this.getSuggestedMinimumHeight(), var2));
    }
}
