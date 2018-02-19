package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout implements class_7 {
    // $FF: renamed from: a android.support.v7.widget.u$a
    private u$a field_340;

    public FitWindowsLinearLayout(Context var1) {
        super(var1);
    }

    public FitWindowsLinearLayout(Context var1, AttributeSet var2) {
        super(var1, var2);
    }

    protected boolean fitSystemWindows(Rect var1) {
        if (this.field_340 != null) {
            this.field_340.method_43(var1);
        }

        return super.fitSystemWindows(var1);
    }

    public void setOnFitSystemWindowsListener(u$a var1) {
        this.field_340 = var1;
    }
}
