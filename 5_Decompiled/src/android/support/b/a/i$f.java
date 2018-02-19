package android.support.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Bitmap.Config;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class i$f extends ConstantState {
    // $FF: renamed from: a int
    int field_283;
    // $FF: renamed from: b android.support.b.a.i$e
    i$e field_284;
    // $FF: renamed from: c android.content.res.ColorStateList
    ColorStateList field_285 = null;
    // $FF: renamed from: d android.graphics.PorterDuff.Mode
    Mode field_286;
    // $FF: renamed from: e boolean
    boolean field_287;
    // $FF: renamed from: f android.graphics.Bitmap
    Bitmap field_288;
    // $FF: renamed from: g android.content.res.ColorStateList
    ColorStateList field_289;
    // $FF: renamed from: h android.graphics.PorterDuff.Mode
    Mode field_290;
    // $FF: renamed from: i int
    int field_291;
    // $FF: renamed from: j boolean
    boolean field_292;
    // $FF: renamed from: k boolean
    boolean field_293;
    // $FF: renamed from: l android.graphics.Paint
    Paint field_294;

    public i$f() {
        this.field_286 = class_51.field_516;
        this.field_284 = new i$e();
    }

    public i$f(i$f var1) {
        this.field_286 = class_51.field_516;
        if (var1 != null) {
            this.field_283 = var1.field_283;
            this.field_284 = new i$e(var1.field_284);
            if (i$e.method_408(var1.field_284) != null) {
                i$e.method_409(this.field_284, new Paint(i$e.method_408(var1.field_284)));
            }

            if (i$e.method_412(var1.field_284) != null) {
                i$e.method_413(this.field_284, new Paint(i$e.method_412(var1.field_284)));
            }

            this.field_285 = var1.field_285;
            this.field_286 = var1.field_286;
            this.field_287 = var1.field_287;
        }

    }

    // $FF: renamed from: a (android.graphics.ColorFilter) android.graphics.Paint
    public Paint method_398(ColorFilter var1) {
        Paint var2;
        if (!this.method_401() && var1 == null) {
            var2 = null;
        } else {
            if (this.field_294 == null) {
                this.field_294 = new Paint();
                this.field_294.setFilterBitmap(true);
            }

            this.field_294.setAlpha(this.field_284.getRootAlpha());
            this.field_294.setColorFilter(var1);
            var2 = this.field_294;
        }

        return var2;
    }

    // $FF: renamed from: a (int, int) void
    public void method_399(int var1, int var2) {
        this.field_288.eraseColor(0);
        Canvas var3 = new Canvas(this.field_288);
        this.field_284.method_414(var3, var1, var2, (ColorFilter)null);
    }

    // $FF: renamed from: a (android.graphics.Canvas, android.graphics.ColorFilter, android.graphics.Rect) void
    public void method_400(Canvas var1, ColorFilter var2, Rect var3) {
        Paint var4 = this.method_398(var2);
        var1.drawBitmap(this.field_288, (Rect)null, var3, var4);
    }

    // $FF: renamed from: a () boolean
    public boolean method_401() {
        boolean var1;
        if (this.field_284.getRootAlpha() < 255) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: b (int, int) void
    public void method_402(int var1, int var2) {
        if (this.field_288 == null || !this.method_405(var1, var2)) {
            this.field_288 = Bitmap.createBitmap(var1, var2, Config.ARGB_8888);
            this.field_293 = true;
        }

    }

    // $FF: renamed from: b () boolean
    public boolean method_403() {
        boolean var1;
        if (!this.field_293 && this.field_289 == this.field_285 && this.field_290 == this.field_286 && this.field_292 == this.field_287 && this.field_291 == this.field_284.getRootAlpha()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: c () void
    public void method_404() {
        this.field_289 = this.field_285;
        this.field_290 = this.field_286;
        this.field_291 = this.field_284.getRootAlpha();
        this.field_292 = this.field_287;
        this.field_293 = false;
    }

    // $FF: renamed from: c (int, int) boolean
    public boolean method_405(int var1, int var2) {
        boolean var3;
        if (var1 == this.field_288.getWidth() && var2 == this.field_288.getHeight()) {
            var3 = true;
        } else {
            var3 = false;
        }

        return var3;
    }

    public int getChangingConfigurations() {
        return this.field_283;
    }

    public Drawable newDrawable() {
        return new class_51(this);
    }

    public Drawable newDrawable(Resources var1) {
        return new class_51(this);
    }
}
