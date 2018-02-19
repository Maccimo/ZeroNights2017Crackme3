package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.widget.TextView;

// $FF: renamed from: android.support.v7.widget.o
class class_61 extends class_60 {
    // $FF: renamed from: b android.support.v7.widget.ai
    private class_95 field_567;
    // $FF: renamed from: c android.support.v7.widget.ai
    private class_95 field_568;

    class_61(TextView var1) {
        super(var1);
    }

    // $FF: renamed from: a () void
    void method_593() {
        super.method_593();
        if (this.field_567 != null || this.field_568 != null) {
            Drawable[] var1 = this.a.getCompoundDrawablesRelative();
            this.a(var1[0], this.field_567);
            this.a(var1[2], this.field_568);
        }

    }

    // $FF: renamed from: a (android.util.AttributeSet, int) void
    void method_599(AttributeSet var1, int var2) {
        super.method_599(var1, var2);
        Context var3 = this.a.getContext();
        class_74 var4 = class_74.method_717();
        TypedArray var5 = var3.obtainStyledAttributes(var1, a$j.AppCompatTextHelper, var2, 0);
        if (var5.hasValue(a$j.AppCompatTextHelper_android_drawableStart)) {
            this.field_567 = a(var3, var4, var5.getResourceId(a$j.AppCompatTextHelper_android_drawableStart, 0));
        }

        if (var5.hasValue(a$j.AppCompatTextHelper_android_drawableEnd)) {
            this.field_568 = a(var3, var4, var5.getResourceId(a$j.AppCompatTextHelper_android_drawableEnd, 0));
        }

        var5.recycle();
    }
}
