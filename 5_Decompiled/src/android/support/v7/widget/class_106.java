package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.class_158;
import java.lang.ref.WeakReference;

// $FF: renamed from: android.support.v7.widget.ap
public class class_106 extends Resources {
    // $FF: renamed from: a java.lang.ref.WeakReference
    private final WeakReference field_870;

    public class_106(Context var1, Resources var2) {
        super(var2.getAssets(), var2.getDisplayMetrics(), var2.getConfiguration());
        this.field_870 = new WeakReference(var1);
    }

    // $FF: renamed from: a () boolean
    public static boolean method_913() {
        boolean var0;
        if (class_158.method_1319() && VERSION.SDK_INT <= 20) {
            var0 = true;
        } else {
            var0 = false;
        }

        return var0;
    }

    // $FF: renamed from: a (int) android.graphics.drawable.Drawable
    final Drawable method_914(int var1) {
        return super.getDrawable(var1);
    }

    public Drawable getDrawable(int var1) {
        Context var2 = (Context)this.field_870.get();
        Drawable var3;
        if (var2 != null) {
            var3 = class_74.method_717().method_737(var2, this, var1);
        } else {
            var3 = super.getDrawable(var1);
        }

        return var3;
    }
}
