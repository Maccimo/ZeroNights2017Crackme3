package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.b.a.class_50;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

class h$a implements h$c {
    // $FF: renamed from: a (android.content.Context, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources.Theme) android.graphics.drawable.Drawable
    public Drawable method_28(Context var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
        class_50 var6;
        try {
            var6 = class_50.method_534(var1, var1.getResources(), var2, var3, var4);
        } catch (Exception var5) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", var5);
            var6 = null;
        }

        return var6;
    }
}
