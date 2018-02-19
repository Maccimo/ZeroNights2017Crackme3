package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class w$a extends MarginLayoutParams {
    // $FF: renamed from: g float
    public float field_341;
    // $FF: renamed from: h int
    public int field_342 = -1;

    public w$a(int var1, int var2) {
        super(var1, var2);
        this.field_341 = 0.0F;
    }

    public w$a(Context var1, AttributeSet var2) {
        super(var1, var2);
        TypedArray var3 = var1.obtainStyledAttributes(var2, a$j.LinearLayoutCompat_Layout);
        this.field_341 = var3.getFloat(a$j.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
        this.field_342 = var3.getInt(a$j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
        var3.recycle();
    }

    public w$a(LayoutParams var1) {
        super(var1);
    }
}
