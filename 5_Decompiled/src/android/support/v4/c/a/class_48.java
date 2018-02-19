package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

// $FF: renamed from: android.support.v4.c.a.a
public final class class_48 {
    // $FF: renamed from: a android.support.v4.c.a.a$e
    static final a$e field_508;

    static {
        if (VERSION.SDK_INT >= 23) {
            field_508 = new a$d();
        } else if (VERSION.SDK_INT >= 21) {
            field_508 = new a$c();
        } else if (VERSION.SDK_INT >= 19) {
            field_508 = new a$b();
        } else if (VERSION.SDK_INT >= 17) {
            field_508 = new a$a();
        } else {
            field_508 = new a$e();
        }

    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) void
    public static void method_519(Drawable var0) {
        field_508.method_1090(var0);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, float, float) void
    public static void method_520(Drawable var0, float var1, float var2) {
        field_508.method_1077(var0, var1, var2);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, int) void
    public static void method_521(Drawable var0, int var1) {
        field_508.method_1078(var0, var1);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, int, int, int, int) void
    public static void method_522(Drawable var0, int var1, int var2, int var3, int var4) {
        field_508.method_1079(var0, var1, var2, var3, var4);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, android.content.res.ColorStateList) void
    public static void method_523(Drawable var0, ColorStateList var1) {
        field_508.method_1080(var0, var1);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, android.content.res.Resources.Theme) void
    public static void method_524(Drawable var0, Theme var1) {
        field_508.method_1081(var0, var1);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources.Theme) void
    public static void method_525(Drawable var0, Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
        field_508.method_1082(var0, var1, var2, var3, var4);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, android.graphics.PorterDuff.Mode) void
    public static void method_526(Drawable var0, Mode var1) {
        field_508.method_1083(var0, var1);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, boolean) void
    public static void method_527(Drawable var0, boolean var1) {
        field_508.method_1084(var0, var1);
    }

    // $FF: renamed from: b (android.graphics.drawable.Drawable) boolean
    public static boolean method_528(Drawable var0) {
        return field_508.method_1085(var0);
    }

    // $FF: renamed from: c (android.graphics.drawable.Drawable) int
    public static int method_529(Drawable var0) {
        return field_508.method_1087(var0);
    }

    // $FF: renamed from: d (android.graphics.drawable.Drawable) boolean
    public static boolean method_530(Drawable var0) {
        return field_508.method_1088(var0);
    }

    // $FF: renamed from: e (android.graphics.drawable.Drawable) android.graphics.ColorFilter
    public static ColorFilter method_531(Drawable var0) {
        return field_508.method_1089(var0);
    }

    // $FF: renamed from: f (android.graphics.drawable.Drawable) android.graphics.drawable.Drawable
    public static Drawable method_532(Drawable var0) {
        return field_508.method_1086(var0);
    }

    // $FF: renamed from: g (android.graphics.drawable.Drawable) int
    public static int method_533(Drawable var0) {
        return field_508.method_1076(var0);
    }
}
