package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

// $FF: renamed from: android.support.v7.widget.aj
class class_99 extends class_98 {
    // $FF: renamed from: a java.lang.ref.WeakReference
    private final WeakReference field_836;

    public class_99(Context var1, Resources var2) {
        super(var2);
        this.field_836 = new WeakReference(var1);
    }

    public Drawable getDrawable(int var1) {
        Drawable var3 = super.getDrawable(var1);
        Context var2 = (Context)this.field_836.get();
        if (var3 != null && var2 != null) {
            class_74.method_717();
            class_74.method_723(var2, var1, var3);
        }

        return var3;
    }
}
