package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.widget.ImageView;

// $FF: renamed from: android.support.v4.widget.e
public class class_154 {
    // $FF: renamed from: a android.support.v4.widget.e$b
    static final e$b field_1156;

    static {
        if (VERSION.SDK_INT >= 21) {
            field_1156 = new e$c();
        } else {
            field_1156 = new e$a();
        }

    }

    // $FF: renamed from: a (android.widget.ImageView) android.content.res.ColorStateList
    public static ColorStateList method_1281(ImageView var0) {
        return field_1156.method_16(var0);
    }

    // $FF: renamed from: a (android.widget.ImageView, android.content.res.ColorStateList) void
    public static void method_1282(ImageView var0, ColorStateList var1) {
        field_1156.method_17(var0, var1);
    }

    // $FF: renamed from: a (android.widget.ImageView, android.graphics.PorterDuff.Mode) void
    public static void method_1283(ImageView var0, Mode var1) {
        field_1156.method_18(var0, var1);
    }

    // $FF: renamed from: b (android.widget.ImageView) android.graphics.PorterDuff.Mode
    public static Mode method_1284(ImageView var0) {
        return field_1156.method_19(var0);
    }
}
