package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.b.a.class_51;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

class h$d implements h$c {
    // $FF: renamed from: a (android.content.Context, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources.Theme) android.graphics.drawable.Drawable
    public Drawable method_28(Context var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
        class_51 var6;
        try {
            var6 = class_51.method_540(var1.getResources(), var2, var3, var4);
        } catch (Exception var5) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", var5);
            var6 = null;
        }

        return var6;
    }
}
