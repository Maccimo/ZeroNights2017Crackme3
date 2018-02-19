package android.support.v4.b.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.widget.TextView;

// $FF: renamed from: android.support.v4.b.a.b
public final class class_139 {
    // $FF: renamed from: a (android.content.Context, int, android.util.TypedValue, int, android.widget.TextView) android.graphics.Typeface
    public static Typeface method_1178(Context var0, int var1, TypedValue var2, int var3, TextView var4) {
        Typeface var5;
        if (var0.isRestricted()) {
            var5 = null;
        } else {
            var5 = method_1181(var0, var1, var2, var3, var4);
        }

        return var5;
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, android.widget.TextView) android.graphics.Typeface
    private static Typeface method_1179(Context param0, Resources param1, TypedValue param2, int param3, int param4, TextView param5) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.content.res.Resources, int, android.content.res.Resources.Theme) android.graphics.drawable.Drawable
    public static Drawable method_1180(Resources var0, int var1, Theme var2) {
        Drawable var3;
        if (VERSION.SDK_INT >= 21) {
            var3 = var0.getDrawable(var1, var2);
        } else {
            var3 = var0.getDrawable(var1);
        }

        return var3;
    }

    // $FF: renamed from: b (android.content.Context, int, android.util.TypedValue, int, android.widget.TextView) android.graphics.Typeface
    private static Typeface method_1181(Context var0, int var1, TypedValue var2, int var3, TextView var4) {
        Resources var5 = var0.getResources();
        var5.getValue(var1, var2, true);
        Typeface var6 = method_1179(var0, var5, var2, var1, var3, var4);
        if (var6 != null) {
            return var6;
        } else {
            throw new NotFoundException("Font resource ID #0x" + Integer.toHexString(var1));
        }
    }
}
