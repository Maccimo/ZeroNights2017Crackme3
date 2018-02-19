package android.support.v4.c.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// $FF: renamed from: android.support.v4.c.a.d
class class_58 extends class_57 {
    class_58(Drawable var1) {
        super(var1);
    }

    class_58(c$a var1, Resources var2) {
        super(var1, var2);
    }

    // $FF: renamed from: b () android.support.v4.c.a.c$a
    c$a method_585() {
        return new d$a(this.b, (Resources)null);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    public void setAutoMirrored(boolean var1) {
        this.c.setAutoMirrored(var1);
    }
}
