package android.support.v4.b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;

// $FF: renamed from: android.support.v4.b.a
public class class_47 {
    // $FF: renamed from: a java.lang.Object
    private static final Object field_494 = new Object();
    // $FF: renamed from: b android.util.TypedValue
    private static TypedValue field_495;

    // $FF: renamed from: a (android.content.Context, int) android.graphics.drawable.Drawable
    public static final Drawable method_513(Context param0, int param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: b (android.content.Context, int) android.content.res.ColorStateList
    public static final ColorStateList method_514(Context var0, int var1) {
        ColorStateList var2;
        if (VERSION.SDK_INT >= 23) {
            var2 = var0.getColorStateList(var1);
        } else {
            var2 = var0.getResources().getColorStateList(var1);
        }

        return var2;
    }
}
