package android.support.b.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Matrix;
import android.support.v4.b.a.class_140;
import android.support.v4.g.class_134;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class i$c {
    // $FF: renamed from: a java.util.ArrayList
    final ArrayList field_327 = new ArrayList();
    // $FF: renamed from: b float
    float field_328 = 0.0F;
    // $FF: renamed from: c int
    int field_329;
    // $FF: renamed from: d android.graphics.Matrix
    private final Matrix field_330 = new Matrix();
    // $FF: renamed from: e float
    private float field_331 = 0.0F;
    // $FF: renamed from: f float
    private float field_332 = 0.0F;
    // $FF: renamed from: g float
    private float field_333 = 1.0F;
    // $FF: renamed from: h float
    private float field_334 = 1.0F;
    // $FF: renamed from: i float
    private float field_335 = 0.0F;
    // $FF: renamed from: j float
    private float field_336 = 0.0F;
    // $FF: renamed from: k android.graphics.Matrix
    private final Matrix field_337 = new Matrix();
    // $FF: renamed from: l int[]
    private int[] field_338;
    // $FF: renamed from: m java.lang.String
    private String field_339 = null;

    public i$c() {
    }

    public i$c(i$c var1, class_134 var2) {
        this.field_328 = var1.field_328;
        this.field_331 = var1.field_331;
        this.field_332 = var1.field_332;
        this.field_333 = var1.field_333;
        this.field_334 = var1.field_334;
        this.field_335 = var1.field_335;
        this.field_336 = var1.field_336;
        this.field_338 = var1.field_338;
        this.field_339 = var1.field_339;
        this.field_329 = var1.field_329;
        if (this.field_339 != null) {
            var2.put(this.field_339, this);
        }

        this.field_337.set(var1.field_337);
        ArrayList var4 = var1.field_327;

        for(int var3 = 0; var3 < var4.size(); ++var3) {
            Object var5 = var4.get(var3);
            if (var5 instanceof i$c) {
                var1 = (i$c)var5;
                this.field_327.add(new i$c(var1, var2));
            } else {
                if (var5 instanceof i$b) {
                    var5 = new i$b((i$b)var5);
                } else {
                    if (!(var5 instanceof i$a)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }

                    var5 = new i$a((i$a)var5);
                }

                this.field_327.add(var5);
                if (((i$d)var5).field_312 != null) {
                    var2.put(((i$d)var5).field_312, var5);
                }
            }
        }

    }

    // $FF: renamed from: a (android.support.b.a.i$c) android.graphics.Matrix
    // $FF: synthetic method
    static Matrix method_423(i$c var0) {
        return var0.field_330;
    }

    // $FF: renamed from: a () void
    private void method_424() {
        this.field_337.reset();
        this.field_337.postTranslate(-this.field_331, -this.field_332);
        this.field_337.postScale(this.field_333, this.field_334);
        this.field_337.postRotate(this.field_328, 0.0F, 0.0F);
        this.field_337.postTranslate(this.field_335 + this.field_331, this.field_336 + this.field_332);
    }

    // $FF: renamed from: a (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser) void
    private void method_425(TypedArray var1, XmlPullParser var2) {
        this.field_338 = null;
        this.field_328 = class_140.method_1182(var1, var2, "rotation", 5, this.field_328);
        this.field_331 = var1.getFloat(1, this.field_331);
        this.field_332 = var1.getFloat(2, this.field_332);
        this.field_333 = class_140.method_1182(var1, var2, "scaleX", 3, this.field_333);
        this.field_334 = class_140.method_1182(var1, var2, "scaleY", 4, this.field_334);
        this.field_335 = class_140.method_1182(var1, var2, "translateX", 6, this.field_335);
        this.field_336 = class_140.method_1182(var1, var2, "translateY", 7, this.field_336);
        String var3 = var1.getString(0);
        if (var3 != null) {
            this.field_339 = var3;
        }

        this.method_424();
    }

    // $FF: renamed from: b (android.support.b.a.i$c) android.graphics.Matrix
    // $FF: synthetic method
    static Matrix method_426(i$c var0) {
        return var0.field_337;
    }

    // $FF: renamed from: a (android.content.res.Resources, android.util.AttributeSet, android.content.res.Resources.Theme, org.xmlpull.v1.XmlPullParser) void
    public void method_427(Resources var1, AttributeSet var2, Theme var3, XmlPullParser var4) {
        TypedArray var5 = class_140.method_1184(var1, var3, var2, class_56.field_538);
        this.method_425(var5, var4);
        var5.recycle();
    }

    public String getGroupName() {
        return this.field_339;
    }

    public Matrix getLocalMatrix() {
        return this.field_337;
    }

    public float getPivotX() {
        return this.field_331;
    }

    public float getPivotY() {
        return this.field_332;
    }

    public float getRotation() {
        return this.field_328;
    }

    public float getScaleX() {
        return this.field_333;
    }

    public float getScaleY() {
        return this.field_334;
    }

    public float getTranslateX() {
        return this.field_335;
    }

    public float getTranslateY() {
        return this.field_336;
    }

    public void setPivotX(float var1) {
        if (var1 != this.field_331) {
            this.field_331 = var1;
            this.method_424();
        }

    }

    public void setPivotY(float var1) {
        if (var1 != this.field_332) {
            this.field_332 = var1;
            this.method_424();
        }

    }

    public void setRotation(float var1) {
        if (var1 != this.field_328) {
            this.field_328 = var1;
            this.method_424();
        }

    }

    public void setScaleX(float var1) {
        if (var1 != this.field_333) {
            this.field_333 = var1;
            this.method_424();
        }

    }

    public void setScaleY(float var1) {
        if (var1 != this.field_334) {
            this.field_334 = var1;
            this.method_424();
        }

    }

    public void setTranslateX(float var1) {
        if (var1 != this.field_335) {
            this.field_335 = var1;
            this.method_424();
        }

    }

    public void setTranslateY(float var1) {
        if (var1 != this.field_336) {
            this.field_336 = var1;
            this.method_424();
        }

    }
}
