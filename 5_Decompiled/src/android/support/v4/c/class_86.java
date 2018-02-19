package android.support.v4.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Build.VERSION;
import android.support.v4.b.a.a$a;
import android.support.v4.b.a.a$b;
import android.support.v4.b.a.a$d;
import android.support.v4.f.class_115;
import android.support.v4.g.class_68;
import android.widget.TextView;

// $FF: renamed from: android.support.v4.c.c
public class class_86 {
    // $FF: renamed from: a android.support.v4.c.c$a
    private static final c$a field_731;
    // $FF: renamed from: b android.support.v4.g.d
    private static final class_68 field_732;

    static {
        if (VERSION.SDK_INT >= 26) {
            field_731 = new class_85();
        } else if (VERSION.SDK_INT >= 24 && class_83.method_785()) {
            field_731 = new class_83();
        } else if (VERSION.SDK_INT >= 21) {
            field_731 = new class_84();
        } else {
            field_731 = new class_82();
        }

        field_732 = new class_68(16);
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, int, java.lang.String, int) android.graphics.Typeface
    public static Typeface method_796(Context var0, Resources var1, int var2, String var3, int var4) {
        Typeface var5 = field_731.method_134(var0, var1, var2, var3, var4);
        if (var5 != null) {
            field_732.method_661(method_800(var1, var2, var4), var5);
        }

        return var5;
    }

    // $FF: renamed from: a (android.content.Context, android.os.CancellationSignal, android.support.v4.f.b$b[], int) android.graphics.Typeface
    public static Typeface method_797(Context var0, CancellationSignal var1, android.support.v4.f.b$b[] var2, int var3) {
        return field_731.method_135(var0, var1, var2, var3);
    }

    // $FF: renamed from: a (android.content.Context, android.support.v4.b.a.a$a, android.content.res.Resources, int, int, android.widget.TextView) android.graphics.Typeface
    public static Typeface method_798(Context var0, a$a var1, Resources var2, int var3, int var4, TextView var5) {
        Typeface var6;
        if (var1 instanceof a$d) {
            a$d var7 = (a$d)var1;
            var6 = class_115.method_1009(var0, var7.method_305(), var5, var7.method_306(), var7.method_307(), var4);
        } else {
            var6 = field_731.method_136(var0, (a$b)var1, var2, var4);
        }

        if (var6 != null) {
            field_732.method_661(method_800(var2, var3, var4), var6);
        }

        return var6;
    }

    // $FF: renamed from: a (android.content.res.Resources, int, int) android.graphics.Typeface
    public static Typeface method_799(Resources var0, int var1, int var2) {
        return (Typeface)field_732.method_660(method_800(var0, var1, var2));
    }

    // $FF: renamed from: b (android.content.res.Resources, int, int) java.lang.String
    private static String method_800(Resources var0, int var1, int var2) {
        return var0.getResourcePackageName(var1) + "-" + var1 + "-" + var2;
    }
}
