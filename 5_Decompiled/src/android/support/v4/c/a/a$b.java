package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

class a$b extends a$a {
    // $FF: renamed from: a (android.graphics.drawable.Drawable, boolean) void
    public void method_1084(Drawable var1, boolean var2) {
        var1.setAutoMirrored(var2);
    }

    // $FF: renamed from: b (android.graphics.drawable.Drawable) boolean
    public boolean method_1085(Drawable var1) {
        return var1.isAutoMirrored();
    }

    // $FF: renamed from: c (android.graphics.drawable.Drawable) android.graphics.drawable.Drawable
    public Drawable method_1086(Drawable var1) {
        Object var2 = var1;
        if (!(var1 instanceof class_5)) {
            var2 = new class_58(var1);
        }

        return (Drawable)var2;
    }

    // $FF: renamed from: d (android.graphics.drawable.Drawable) int
    public int method_1087(Drawable var1) {
        return var1.getAlpha();
    }
}
