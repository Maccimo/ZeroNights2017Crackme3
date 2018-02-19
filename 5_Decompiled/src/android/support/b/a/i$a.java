package android.support.b.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.support.v4.b.a.class_140;
import android.support.v4.c.class_80;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class i$a extends i$d {
    public i$a() {
    }

    public i$a(i$a var1) {
        super(var1);
    }

    // $FF: renamed from: a (android.content.res.TypedArray) void
    private void method_417(TypedArray var1) {
        String var2 = var1.getString(0);
        if (var2 != null) {
            this.n = var2;
        }

        String var3 = var1.getString(1);
        if (var3 != null) {
            this.m = class_80.method_771(var3);
        }

    }

    // $FF: renamed from: a (android.content.res.Resources, android.util.AttributeSet, android.content.res.Resources.Theme, org.xmlpull.v1.XmlPullParser) void
    public void method_418(Resources var1, AttributeSet var2, Theme var3, XmlPullParser var4) {
        if (class_140.method_1187(var4, "pathData")) {
            TypedArray var5 = class_140.method_1184(var1, var3, var2, class_56.field_540);
            this.method_417(var5);
            var5.recycle();
        }

    }

    // $FF: renamed from: a () boolean
    public boolean method_416() {
        return true;
    }
}
