package android.support.b.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.b.a.class_140;
import android.support.v4.c.class_80;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

// $FF: renamed from: android.support.b.a.g
public class class_52 implements Interpolator {
    // $FF: renamed from: a float[]
    private float[] field_526;
    // $FF: renamed from: b float[]
    private float[] field_527;

    public class_52(Context var1, AttributeSet var2, XmlPullParser var3) {
        this(var1.getResources(), var1.getTheme(), var2, var3);
    }

    public class_52(Resources var1, Theme var2, AttributeSet var3, XmlPullParser var4) {
        TypedArray var5 = class_140.method_1184(var1, var2, var3, class_56.field_548);
        this.method_549(var5, var4);
        var5.recycle();
    }

    // $FF: renamed from: a (float, float) void
    private void method_547(float var1, float var2) {
        Path var3 = new Path();
        var3.moveTo(0.0F, 0.0F);
        var3.quadTo(var1, var2, 1.0F, 1.0F);
        this.method_550(var3);
    }

    // $FF: renamed from: a (float, float, float, float) void
    private void method_548(float var1, float var2, float var3, float var4) {
        Path var5 = new Path();
        var5.moveTo(0.0F, 0.0F);
        var5.cubicTo(var1, var2, var3, var4, 1.0F, 1.0F);
        this.method_550(var5);
    }

    // $FF: renamed from: a (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser) void
    private void method_549(TypedArray var1, XmlPullParser var2) {
        if (class_140.method_1187(var2, "pathData")) {
            String var7 = class_140.method_1185(var1, var2, "pathData", 4);
            Path var6 = class_80.method_764(var7);
            if (var6 == null) {
                throw new InflateException("The path is null, which is created from " + var7);
            }

            this.method_550(var6);
        } else {
            if (!class_140.method_1187(var2, "controlX1")) {
                throw new InflateException("pathInterpolator requires the controlX1 attribute");
            }

            if (!class_140.method_1187(var2, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }

            float var4 = class_140.method_1182(var1, var2, "controlX1", 0, 0.0F);
            float var3 = class_140.method_1182(var1, var2, "controlY1", 1, 0.0F);
            boolean var5 = class_140.method_1187(var2, "controlX2");
            if (var5 != class_140.method_1187(var2, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }

            if (!var5) {
                this.method_547(var4, var3);
            } else {
                this.method_548(var4, var3, class_140.method_1182(var1, var2, "controlX2", 2, 0.0F), class_140.method_1182(var1, var2, "controlY2", 3, 0.0F));
            }
        }

    }

    // $FF: renamed from: a (android.graphics.Path) void
    private void method_550(Path var1) {
        int var5 = 0;
        PathMeasure var7 = new PathMeasure(var1, false);
        float var2 = var7.getLength();
        int var6 = Math.min(3000, (int)(var2 / 0.002F) + 1);
        if (var6 <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + var2);
        } else {
            this.field_526 = new float[var6];
            this.field_527 = new float[var6];
            float[] var8 = new float[2];

            int var4;
            for(var4 = 0; var4 < var6; ++var4) {
                var7.getPosTan((float)var4 * var2 / (float)(var6 - 1), var8, (float[])null);
                this.field_526[var4] = var8[0];
                this.field_527[var4] = var8[1];
            }

            if ((double)Math.abs(this.field_526[0]) <= 1.0E-5D && (double)Math.abs(this.field_527[0]) <= 1.0E-5D && (double)Math.abs(this.field_526[var6 - 1] - 1.0F) <= 1.0E-5D && (double)Math.abs(this.field_527[var6 - 1] - 1.0F) <= 1.0E-5D) {
                var2 = 0.0F;

                float var3;
                for(var4 = 0; var5 < var6; var2 = var3) {
                    var3 = this.field_526[var4];
                    if (var3 < var2) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + var3);
                    }

                    this.field_526[var5] = var3;
                    ++var5;
                    ++var4;
                }

                if (var7.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
            } else {
                throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.field_526[0] + "," + this.field_527[0] + " end:" + this.field_526[var6 - 1] + "," + this.field_527[var6 - 1]);
            }
        }
    }

    public float getInterpolation(float var1) {
        float var2 = 0.0F;
        if (var1 <= 0.0F) {
            var1 = var2;
        } else if (var1 < 1.0F) {
            int var4 = 0;
            int var3 = this.field_526.length - 1;

            while(var3 - var4 > 1) {
                int var5 = (var4 + var3) / 2;
                if (var1 < this.field_526[var5]) {
                    var3 = var5;
                } else {
                    var4 = var5;
                }
            }

            var2 = this.field_526[var3] - this.field_526[var4];
            if (var2 == 0.0F) {
                var1 = this.field_527[var4];
            } else {
                var1 = (var1 - this.field_526[var4]) / var2;
                var2 = this.field_527[var4];
                var1 = var1 * (this.field_527[var3] - var2) + var2;
            }
        } else {
            var1 = 1.0F;
        }

        return var1;
    }
}
