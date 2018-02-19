package android.support.b.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import org.xmlpull.v1.XmlPullParser;

// $FF: renamed from: android.support.b.a.d
public class class_53 {
    // $FF: renamed from: a (android.content.Context, int) android.view.animation.Interpolator
    public static Interpolator method_551(Context param0, int param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.content.res.Resources.Theme, org.xmlpull.v1.XmlPullParser) android.view.animation.Interpolator
    private static Interpolator method_552(Context var0, Resources var1, Theme var2, XmlPullParser var3) {
        Object var6 = null;
        int var5 = var3.getDepth();

        while(true) {
            int var4 = var3.next();
            if (var4 == 3 && var3.getDepth() <= var5 || var4 == 1) {
                return (Interpolator)var6;
            }

            if (var4 == 2) {
                AttributeSet var8 = Xml.asAttributeSet(var3);
                String var7 = var3.getName();
                if (var7.equals("linearInterpolator")) {
                    var6 = new LinearInterpolator();
                } else if (var7.equals("accelerateInterpolator")) {
                    var6 = new AccelerateInterpolator(var0, var8);
                } else if (var7.equals("decelerateInterpolator")) {
                    var6 = new DecelerateInterpolator(var0, var8);
                } else if (var7.equals("accelerateDecelerateInterpolator")) {
                    var6 = new AccelerateDecelerateInterpolator();
                } else if (var7.equals("cycleInterpolator")) {
                    var6 = new CycleInterpolator(var0, var8);
                } else if (var7.equals("anticipateInterpolator")) {
                    var6 = new AnticipateInterpolator(var0, var8);
                } else if (var7.equals("overshootInterpolator")) {
                    var6 = new OvershootInterpolator(var0, var8);
                } else if (var7.equals("anticipateOvershootInterpolator")) {
                    var6 = new AnticipateOvershootInterpolator(var0, var8);
                } else if (var7.equals("bounceInterpolator")) {
                    var6 = new BounceInterpolator();
                } else {
                    if (!var7.equals("pathInterpolator")) {
                        throw new RuntimeException("Unknown interpolator name: " + var3.getName());
                    }

                    var6 = new class_52(var0, var8, var3);
                }
            }
        }
    }
}
