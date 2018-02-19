package android.support.b.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.support.v4.b.a.class_140;
import android.support.v4.c.class_80;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class i$b extends i$d {
    // $FF: renamed from: a int
    int field_314 = 0;
    // $FF: renamed from: b float
    float field_315 = 0.0F;
    // $FF: renamed from: c int
    int field_316 = 0;
    // $FF: renamed from: d float
    float field_317 = 1.0F;
    // $FF: renamed from: e int
    int field_318 = 0;
    // $FF: renamed from: f float
    float field_319 = 1.0F;
    // $FF: renamed from: g float
    float field_320 = 0.0F;
    // $FF: renamed from: h float
    float field_321 = 1.0F;
    // $FF: renamed from: i float
    float field_322 = 0.0F;
    // $FF: renamed from: j android.graphics.Paint.Cap
    Cap field_323;
    // $FF: renamed from: k android.graphics.Paint.Join
    Join field_324;
    // $FF: renamed from: l float
    float field_325;
    // $FF: renamed from: p int[]
    private int[] field_326;

    public i$b() {
        this.field_323 = Cap.BUTT;
        this.field_324 = Join.MITER;
        this.field_325 = 4.0F;
    }

    public i$b(i$b var1) {
        super(var1);
        this.field_323 = Cap.BUTT;
        this.field_324 = Join.MITER;
        this.field_325 = 4.0F;
        this.field_326 = var1.field_326;
        this.field_314 = var1.field_314;
        this.field_315 = var1.field_315;
        this.field_317 = var1.field_317;
        this.field_316 = var1.field_316;
        this.field_318 = var1.field_318;
        this.field_319 = var1.field_319;
        this.field_320 = var1.field_320;
        this.field_321 = var1.field_321;
        this.field_322 = var1.field_322;
        this.field_323 = var1.field_323;
        this.field_324 = var1.field_324;
        this.field_325 = var1.field_325;
    }

    // $FF: renamed from: a (int, android.graphics.Paint.Cap) android.graphics.Paint.Cap
    private Cap method_419(int var1, Cap var2) {
        switch(var1) {
        case 0:
            var2 = Cap.BUTT;
            break;
        case 1:
            var2 = Cap.ROUND;
            break;
        case 2:
            var2 = Cap.SQUARE;
        }

        return var2;
    }

    // $FF: renamed from: a (int, android.graphics.Paint.Join) android.graphics.Paint.Join
    private Join method_420(int var1, Join var2) {
        switch(var1) {
        case 0:
            var2 = Join.MITER;
            break;
        case 1:
            var2 = Join.ROUND;
            break;
        case 2:
            var2 = Join.BEVEL;
        }

        return var2;
    }

    // $FF: renamed from: a (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser) void
    private void method_421(TypedArray var1, XmlPullParser var2) {
        this.field_326 = null;
        if (class_140.method_1187(var2, "pathData")) {
            String var3 = var1.getString(0);
            if (var3 != null) {
                this.n = var3;
            }

            var3 = var1.getString(2);
            if (var3 != null) {
                this.m = class_80.method_771(var3);
            }

            this.field_316 = class_140.method_1188(var1, var2, "fillColor", 1, this.field_316);
            this.field_319 = class_140.method_1182(var1, var2, "fillAlpha", 12, this.field_319);
            this.field_323 = this.method_419(class_140.method_1183(var1, var2, "strokeLineCap", 8, -1), this.field_323);
            this.field_324 = this.method_420(class_140.method_1183(var1, var2, "strokeLineJoin", 9, -1), this.field_324);
            this.field_325 = class_140.method_1182(var1, var2, "strokeMiterLimit", 10, this.field_325);
            this.field_314 = class_140.method_1188(var1, var2, "strokeColor", 3, this.field_314);
            this.field_317 = class_140.method_1182(var1, var2, "strokeAlpha", 11, this.field_317);
            this.field_315 = class_140.method_1182(var1, var2, "strokeWidth", 4, this.field_315);
            this.field_321 = class_140.method_1182(var1, var2, "trimPathEnd", 6, this.field_321);
            this.field_322 = class_140.method_1182(var1, var2, "trimPathOffset", 7, this.field_322);
            this.field_320 = class_140.method_1182(var1, var2, "trimPathStart", 5, this.field_320);
            this.field_318 = class_140.method_1183(var1, var2, "fillType", 13, this.field_318);
        }

    }

    // $FF: renamed from: a (android.content.res.Resources, android.util.AttributeSet, android.content.res.Resources.Theme, org.xmlpull.v1.XmlPullParser) void
    public void method_422(Resources var1, AttributeSet var2, Theme var3, XmlPullParser var4) {
        TypedArray var5 = class_140.method_1184(var1, var3, var2, class_56.field_539);
        this.method_421(var5, var4);
        var5.recycle();
    }

    float getFillAlpha() {
        return this.field_319;
    }

    int getFillColor() {
        return this.field_316;
    }

    float getStrokeAlpha() {
        return this.field_317;
    }

    int getStrokeColor() {
        return this.field_314;
    }

    float getStrokeWidth() {
        return this.field_315;
    }

    float getTrimPathEnd() {
        return this.field_321;
    }

    float getTrimPathOffset() {
        return this.field_322;
    }

    float getTrimPathStart() {
        return this.field_320;
    }

    void setFillAlpha(float var1) {
        this.field_319 = var1;
    }

    void setFillColor(int var1) {
        this.field_316 = var1;
    }

    void setStrokeAlpha(float var1) {
        this.field_317 = var1;
    }

    void setStrokeColor(int var1) {
        this.field_314 = var1;
    }

    void setStrokeWidth(float var1) {
        this.field_315 = var1;
    }

    void setTrimPathEnd(float var1) {
        this.field_321 = var1;
    }

    void setTrimPathOffset(float var1) {
        this.field_322 = var1;
    }

    void setTrimPathStart(float var1) {
        this.field_320 = var1;
    }
}
