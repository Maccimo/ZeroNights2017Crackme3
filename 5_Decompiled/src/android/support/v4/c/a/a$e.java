package android.support.v4.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class a$e {
    // $FF: renamed from: a (android.graphics.drawable.Drawable) int
    public int method_1076(Drawable var1) {
        return 0;
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, float, float) void
    public void method_1077(Drawable var1, float var2, float var3) {
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, int) void
    public void method_1078(Drawable var1, int var2) {
        if (var1 instanceof class_5) {
            ((class_5)var1).setTint(var2);
        }

    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, int, int, int, int) void
    public void method_1079(Drawable var1, int var2, int var3, int var4, int var5) {
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, android.content.res.ColorStateList) void
    public void method_1080(Drawable var1, ColorStateList var2) {
        if (var1 instanceof class_5) {
            ((class_5)var1).setTintList(var2);
        }

    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, android.content.res.Resources.Theme) void
    public void method_1081(Drawable var1, Theme var2) {
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources.Theme) void
    public void method_1082(Drawable var1, Resources var2, XmlPullParser var3, AttributeSet var4, Theme var5) {
        var1.inflate(var2, var3, var4);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, android.graphics.PorterDuff.Mode) void
    public void method_1083(Drawable var1, Mode var2) {
        if (var1 instanceof class_5) {
            ((class_5)var1).setTintMode(var2);
        }

    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, boolean) void
    public void method_1084(Drawable var1, boolean var2) {
    }

    // $FF: renamed from: b (android.graphics.drawable.Drawable) boolean
    public boolean method_1085(Drawable var1) {
        return false;
    }

    // $FF: renamed from: c (android.graphics.drawable.Drawable) android.graphics.drawable.Drawable
    public Drawable method_1086(Drawable var1) {
        Object var2 = var1;
        if (!(var1 instanceof class_5)) {
            var2 = new class_57(var1);
        }

        return (Drawable)var2;
    }

    // $FF: renamed from: d (android.graphics.drawable.Drawable) int
    public int method_1087(Drawable var1) {
        return 0;
    }

    // $FF: renamed from: e (android.graphics.drawable.Drawable) boolean
    public boolean method_1088(Drawable var1) {
        return false;
    }

    // $FF: renamed from: f (android.graphics.drawable.Drawable) android.graphics.ColorFilter
    public ColorFilter method_1089(Drawable var1) {
        return null;
    }

    // $FF: renamed from: g (android.graphics.drawable.Drawable) void
    public void method_1090(Drawable var1) {
        var1.jumpToCurrentState();
    }
}
