package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class a$a extends MarginLayoutParams {
    // $FF: renamed from: a int
    public int field_557 = 0;

    public a$a(int var1, int var2) {
        super(var1, var2);
        this.field_557 = 8388627;
    }

    public a$a(Context var1, AttributeSet var2) {
        super(var1, var2);
        TypedArray var3 = var1.obtainStyledAttributes(var2, a$j.ActionBarLayout);
        this.field_557 = var3.getInt(a$j.ActionBarLayout_android_layout_gravity, 0);
        var3.recycle();
    }

    public a$a(a$a var1) {
        super(var1);
        this.field_557 = var1.field_557;
    }

    public a$a(LayoutParams var1) {
        super(var1);
    }
}
