package android.support.b.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Paint.Style;
import android.graphics.Path.FillType;
import android.support.v4.g.class_134;

class i$e {
    // $FF: renamed from: k android.graphics.Matrix
    private static final Matrix field_295 = new Matrix();
    // $FF: renamed from: a android.support.b.a.i$c
    final i$c field_296;
    // $FF: renamed from: b float
    float field_297 = 0.0F;
    // $FF: renamed from: c float
    float field_298 = 0.0F;
    // $FF: renamed from: d float
    float field_299 = 0.0F;
    // $FF: renamed from: e float
    float field_300 = 0.0F;
    // $FF: renamed from: f int
    int field_301 = 255;
    // $FF: renamed from: g java.lang.String
    String field_302 = null;
    // $FF: renamed from: h android.support.v4.g.a
    final class_134 field_303 = new class_134();
    // $FF: renamed from: i android.graphics.Path
    private final Path field_304;
    // $FF: renamed from: j android.graphics.Path
    private final Path field_305;
    // $FF: renamed from: l android.graphics.Matrix
    private final Matrix field_306 = new Matrix();
    // $FF: renamed from: m android.graphics.Paint
    private Paint field_307;
    // $FF: renamed from: n android.graphics.Paint
    private Paint field_308;
    // $FF: renamed from: o android.graphics.PathMeasure
    private PathMeasure field_309;
    // $FF: renamed from: p int
    private int field_310;

    public i$e() {
        this.field_296 = new i$c();
        this.field_304 = new Path();
        this.field_305 = new Path();
    }

    public i$e(i$e var1) {
        this.field_296 = new i$c(var1.field_296, this.field_303);
        this.field_304 = new Path(var1.field_304);
        this.field_305 = new Path(var1.field_305);
        this.field_297 = var1.field_297;
        this.field_298 = var1.field_298;
        this.field_299 = var1.field_299;
        this.field_300 = var1.field_300;
        this.field_310 = var1.field_310;
        this.field_301 = var1.field_301;
        this.field_302 = var1.field_302;
        if (var1.field_302 != null) {
            this.field_303.put(var1.field_302, this);
        }

    }

    // $FF: renamed from: a (float, float, float, float) float
    private static float method_406(float var0, float var1, float var2, float var3) {
        return var0 * var3 - var1 * var2;
    }

    // $FF: renamed from: a (android.graphics.Matrix) float
    private float method_407(Matrix var1) {
        float var2 = 0.0F;
        float[] var6 = new float[]{0.0F, 1.0F, 1.0F, 0.0F};
        var1.mapVectors(var6);
        float var4 = (float)Math.hypot((double)var6[0], (double)var6[1]);
        float var5 = (float)Math.hypot((double)var6[2], (double)var6[3]);
        float var3 = method_406(var6[0], var6[1], var6[2], var6[3]);
        var4 = Math.max(var4, var5);
        if (var4 > 0.0F) {
            var2 = Math.abs(var3) / var4;
        }

        return var2;
    }

    // $FF: renamed from: a (android.support.b.a.i$e) android.graphics.Paint
    // $FF: synthetic method
    static Paint method_408(i$e var0) {
        return var0.field_308;
    }

    // $FF: renamed from: a (android.support.b.a.i$e, android.graphics.Paint) android.graphics.Paint
    // $FF: synthetic method
    static Paint method_409(i$e var0, Paint var1) {
        var0.field_308 = var1;
        return var1;
    }

    // $FF: renamed from: a (android.support.b.a.i$c, android.graphics.Matrix, android.graphics.Canvas, int, int, android.graphics.ColorFilter) void
    private void method_410(i$c var1, Matrix var2, Canvas var3, int var4, int var5, ColorFilter var6) {
        i$c.method_423(var1).set(var2);
        i$c.method_423(var1).preConcat(i$c.method_426(var1));
        var3.save();

        for(int var7 = 0; var7 < var1.field_327.size(); ++var7) {
            Object var8 = var1.field_327.get(var7);
            if (var8 instanceof i$c) {
                this.method_410((i$c)var8, i$c.method_423(var1), var3, var4, var5, var6);
            } else if (var8 instanceof i$d) {
                this.method_411(var1, (i$d)var8, var3, var4, var5, var6);
            }
        }

        var3.restore();
    }

    // $FF: renamed from: a (android.support.b.a.i$c, android.support.b.a.i$d, android.graphics.Canvas, int, int, android.graphics.ColorFilter) void
    private void method_411(i$c var1, i$d var2, Canvas var3, int var4, int var5, ColorFilter var6) {
        float var9 = (float)var4 / this.field_299;
        float var8 = (float)var5 / this.field_300;
        float var7 = Math.min(var9, var8);
        Matrix var16 = i$c.method_423(var1);
        this.field_306.set(var16);
        this.field_306.postScale(var9, var8);
        var8 = this.method_407(var16);
        if (var8 != 0.0F) {
            var2.method_415(this.field_304);
            Path var17 = this.field_304;
            this.field_305.reset();
            if (var2.method_416()) {
                this.field_305.addPath(var17, this.field_306);
                var3.clipPath(this.field_305);
            } else {
                i$b var19 = (i$b)var2;
                if (var19.field_320 != 0.0F || var19.field_321 != 1.0F) {
                    float var13 = var19.field_320;
                    float var12 = var19.field_322;
                    float var11 = var19.field_321;
                    float var10 = var19.field_322;
                    if (this.field_309 == null) {
                        this.field_309 = new PathMeasure();
                    }

                    this.field_309.setPath(this.field_304, false);
                    var9 = this.field_309.getLength();
                    var12 = (var13 + var12) % 1.0F * var9;
                    var10 = (var11 + var10) % 1.0F * var9;
                    var17.reset();
                    if (var12 > var10) {
                        this.field_309.getSegment(var12, var9, var17, true);
                        this.field_309.getSegment(0.0F, var10, var17, true);
                    } else {
                        this.field_309.getSegment(var12, var10, var17, true);
                    }

                    var17.rLineTo(0.0F, 0.0F);
                }

                this.field_305.addPath(var17, this.field_306);
                if (var19.field_316 != 0) {
                    if (this.field_308 == null) {
                        this.field_308 = new Paint();
                        this.field_308.setStyle(Style.FILL);
                        this.field_308.setAntiAlias(true);
                    }

                    Paint var15 = this.field_308;
                    var15.setColor(class_51.method_537(var19.field_316, var19.field_319));
                    var15.setColorFilter(var6);
                    Path var14 = this.field_305;
                    FillType var18;
                    if (var19.field_318 == 0) {
                        var18 = FillType.WINDING;
                    } else {
                        var18 = FillType.EVEN_ODD;
                    }

                    var14.setFillType(var18);
                    var3.drawPath(this.field_305, var15);
                }

                if (var19.field_314 != 0) {
                    if (this.field_307 == null) {
                        this.field_307 = new Paint();
                        this.field_307.setStyle(Style.STROKE);
                        this.field_307.setAntiAlias(true);
                    }

                    Paint var20 = this.field_307;
                    if (var19.field_324 != null) {
                        var20.setStrokeJoin(var19.field_324);
                    }

                    if (var19.field_323 != null) {
                        var20.setStrokeCap(var19.field_323);
                    }

                    var20.setStrokeMiter(var19.field_325);
                    var20.setColor(class_51.method_537(var19.field_314, var19.field_317));
                    var20.setColorFilter(var6);
                    var20.setStrokeWidth(var8 * var7 * var19.field_315);
                    var3.drawPath(this.field_305, var20);
                }
            }
        }

    }

    // $FF: renamed from: b (android.support.b.a.i$e) android.graphics.Paint
    // $FF: synthetic method
    static Paint method_412(i$e var0) {
        return var0.field_307;
    }

    // $FF: renamed from: b (android.support.b.a.i$e, android.graphics.Paint) android.graphics.Paint
    // $FF: synthetic method
    static Paint method_413(i$e var0, Paint var1) {
        var0.field_307 = var1;
        return var1;
    }

    // $FF: renamed from: a (android.graphics.Canvas, int, int, android.graphics.ColorFilter) void
    public void method_414(Canvas var1, int var2, int var3, ColorFilter var4) {
        this.method_410(this.field_296, field_295, var1, var2, var3, var4);
    }

    public float getAlpha() {
        return (float)this.getRootAlpha() / 255.0F;
    }

    public int getRootAlpha() {
        return this.field_301;
    }

    public void setAlpha(float var1) {
        this.setRootAlpha((int)(255.0F * var1));
    }

    public void setRootAlpha(int var1) {
        this.field_301 = var1;
    }
}
