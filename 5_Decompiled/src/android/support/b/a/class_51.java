package android.support.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.b.a.class_140;
import android.support.v4.c.a.class_48;
import android.util.AttributeSet;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// $FF: renamed from: android.support.b.a.i
public class class_51 extends class_49 {
    // $FF: renamed from: a android.graphics.PorterDuff.Mode
    static final Mode field_516;
    // $FF: renamed from: c android.support.b.a.i$f
    private i$f field_517;
    // $FF: renamed from: d android.graphics.PorterDuffColorFilter
    private PorterDuffColorFilter field_518;
    // $FF: renamed from: e android.graphics.ColorFilter
    private ColorFilter field_519;
    // $FF: renamed from: f boolean
    private boolean field_520;
    // $FF: renamed from: g boolean
    private boolean field_521 = true;
    // $FF: renamed from: h android.graphics.drawable.Drawable.ConstantState
    private ConstantState field_522;
    // $FF: renamed from: i float[]
    private final float[] field_523 = new float[9];
    // $FF: renamed from: j android.graphics.Matrix
    private final Matrix field_524 = new Matrix();
    // $FF: renamed from: k android.graphics.Rect
    private final Rect field_525 = new Rect();

    static {
        field_516 = Mode.SRC_IN;
    }

    class_51() {
        this.field_517 = new i$f();
    }

    class_51(i$f var1) {
        this.field_517 = var1;
        this.field_518 = this.method_544(this.field_518, var1.field_285, var1.field_286);
    }

    // $FF: renamed from: a (int, float) int
    static int method_537(int var0, float var1) {
        return (int)((float)Color.alpha(var0) * var1) << 24 | 16777215 & var0;
    }

    // $FF: renamed from: a (int, android.graphics.PorterDuff.Mode) android.graphics.PorterDuff.Mode
    private static Mode method_538(int var0, Mode var1) {
        Mode var2 = var1;
        switch(var0) {
        case 3:
            var2 = Mode.SRC_OVER;
        case 4:
        case 6:
        case 7:
        case 8:
        case 10:
        case 11:
        case 12:
        case 13:
            break;
        case 5:
            var2 = Mode.SRC_IN;
            break;
        case 9:
            var2 = Mode.SRC_ATOP;
            break;
        case 14:
            var2 = Mode.MULTIPLY;
            break;
        case 15:
            var2 = Mode.SCREEN;
            break;
        case 16:
            var2 = var1;
            if (VERSION.SDK_INT >= 11) {
                var2 = Mode.ADD;
            }
            break;
        default:
            var2 = var1;
        }

        return var2;
    }

    // $FF: renamed from: a (android.content.res.Resources, int, android.content.res.Resources.Theme) android.support.b.a.i
    public static class_51 method_539(Resources param0, int param1, Theme param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources.Theme) android.support.b.a.i
    public static class_51 method_540(Resources var0, XmlPullParser var1, AttributeSet var2, Theme var3) {
        class_51 var4 = new class_51();
        var4.inflate(var0, var1, var2, var3);
        return var4;
    }

    // $FF: renamed from: a (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser) void
    private void method_541(TypedArray var1, XmlPullParser var2) {
        i$f var5 = this.field_517;
        i$e var3 = var5.field_284;
        var5.field_286 = method_538(class_140.method_1183(var1, var2, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList var4 = var1.getColorStateList(1);
        if (var4 != null) {
            var5.field_285 = var4;
        }

        var5.field_287 = class_140.method_1186(var1, var2, "autoMirrored", 5, var5.field_287);
        var3.field_299 = class_140.method_1182(var1, var2, "viewportWidth", 7, var3.field_299);
        var3.field_300 = class_140.method_1182(var1, var2, "viewportHeight", 8, var3.field_300);
        if (var3.field_299 <= 0.0F) {
            throw new XmlPullParserException(var1.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (var3.field_300 <= 0.0F) {
            throw new XmlPullParserException(var1.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            var3.field_297 = var1.getDimension(3, var3.field_297);
            var3.field_298 = var1.getDimension(2, var3.field_298);
            if (var3.field_297 <= 0.0F) {
                throw new XmlPullParserException(var1.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (var3.field_298 <= 0.0F) {
                throw new XmlPullParserException(var1.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                var3.setAlpha(class_140.method_1182(var1, var2, "alpha", 4, var3.getAlpha()));
                String var6 = var1.getString(0);
                if (var6 != null) {
                    var3.field_302 = var6;
                    var3.field_303.put(var6, var3);
                }

            }
        }
    }

    // $FF: renamed from: a () boolean
    private boolean method_542() {
        boolean var1 = true;
        if (VERSION.SDK_INT >= 17) {
            if (!this.isAutoMirrored() || class_48.method_533(this) != 1) {
                var1 = false;
            }
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: b (android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources.Theme) void
    private void method_543(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
        i$f var11 = this.field_517;
        i$e var9 = var11.field_284;
        Stack var12 = new Stack();
        var12.push(var9.field_296);
        int var7 = var2.getEventType();
        int var8 = var2.getDepth();

        boolean var5;
        boolean var15;
        for(var5 = true; var7 != 1 && (var2.getDepth() >= var8 + 1 || var7 != 3); var5 = var15) {
            if (var7 == 2) {
                String var13 = var2.getName();
                i$c var10 = (i$c)var12.peek();
                if ("path".equals(var13)) {
                    i$b var16 = new i$b();
                    var16.method_422(var1, var3, var4, var2);
                    var10.field_327.add(var16);
                    if (var16.getPathName() != null) {
                        var9.field_303.put(var16.getPathName(), var16);
                    }

                    var5 = false;
                    int var6 = var11.field_283;
                    var11.field_283 = var16.o | var6;
                } else if ("clip-path".equals(var13)) {
                    i$a var17 = new i$a();
                    var17.method_418(var1, var3, var4, var2);
                    var10.field_327.add(var17);
                    if (var17.getPathName() != null) {
                        var9.field_303.put(var17.getPathName(), var17);
                    }

                    var11.field_283 |= var17.o;
                } else if ("group".equals(var13)) {
                    i$c var18 = new i$c();
                    var18.method_427(var1, var3, var4, var2);
                    var10.field_327.add(var18);
                    var12.push(var18);
                    if (var18.getGroupName() != null) {
                        var9.field_303.put(var18.getGroupName(), var18);
                    }

                    var11.field_283 |= var18.field_329;
                }

                var15 = var5;
            } else {
                var15 = var5;
                if (var7 == 3) {
                    var15 = var5;
                    if ("group".equals(var2.getName())) {
                        var12.pop();
                        var15 = var5;
                    }
                }
            }

            var7 = var2.next();
        }

        if (var5) {
            StringBuffer var14 = new StringBuffer();
            if (var14.length() > 0) {
                var14.append(" or ");
            }

            var14.append("path");
            throw new XmlPullParserException("no " + var14 + " defined");
        }
    }

    // $FF: renamed from: a (android.graphics.PorterDuffColorFilter, android.content.res.ColorStateList, android.graphics.PorterDuff.Mode) android.graphics.PorterDuffColorFilter
    PorterDuffColorFilter method_544(PorterDuffColorFilter var1, ColorStateList var2, Mode var3) {
        if (var2 != null && var3 != null) {
            var1 = new PorterDuffColorFilter(var2.getColorForState(this.getState(), 0), var3);
        } else {
            var1 = null;
        }

        return var1;
    }

    // $FF: renamed from: a (java.lang.String) java.lang.Object
    Object method_545(String var1) {
        return this.field_517.field_284.field_303.get(var1);
    }

    // $FF: renamed from: a (boolean) void
    void method_546(boolean var1) {
        this.field_521 = var1;
    }

    public boolean canApplyTheme() {
        if (this.b != null) {
            class_48.method_530(this.b);
        }

        return false;
    }

    public void draw(Canvas var1) {
        if (this.b != null) {
            this.b.draw(var1);
        } else {
            this.copyBounds(this.field_525);
            if (this.field_525.width() > 0 && this.field_525.height() > 0) {
                Object var9;
                if (this.field_519 == null) {
                    var9 = this.field_518;
                } else {
                    var9 = this.field_519;
                }

                var1.getMatrix(this.field_524);
                this.field_524.getValues(this.field_523);
                float var2 = Math.abs(this.field_523[0]);
                float var3 = Math.abs(this.field_523[4]);
                float var5 = Math.abs(this.field_523[1]);
                float var4 = Math.abs(this.field_523[3]);
                if (var5 != 0.0F || var4 != 0.0F) {
                    var2 = 1.0F;
                    var3 = 1.0F;
                }

                int var6 = (int)(var2 * (float)this.field_525.width());
                int var7 = (int)(var3 * (float)this.field_525.height());
                var6 = Math.min(2048, var6);
                int var8 = Math.min(2048, var7);
                if (var6 > 0 && var8 > 0) {
                    var7 = var1.save();
                    var1.translate((float)this.field_525.left, (float)this.field_525.top);
                    if (this.method_542()) {
                        var1.translate((float)this.field_525.width(), 0.0F);
                        var1.scale(-1.0F, 1.0F);
                    }

                    this.field_525.offsetTo(0, 0);
                    this.field_517.method_402(var6, var8);
                    if (!this.field_521) {
                        this.field_517.method_399(var6, var8);
                    } else if (!this.field_517.method_403()) {
                        this.field_517.method_399(var6, var8);
                        this.field_517.method_404();
                    }

                    this.field_517.method_400(var1, (ColorFilter)var9, this.field_525);
                    var1.restoreToCount(var7);
                }
            }
        }

    }

    public int getAlpha() {
        int var1;
        if (this.b != null) {
            var1 = class_48.method_529(this.b);
        } else {
            var1 = this.field_517.field_284.getRootAlpha();
        }

        return var1;
    }

    public int getChangingConfigurations() {
        int var1;
        if (this.b != null) {
            var1 = this.b.getChangingConfigurations();
        } else {
            var1 = super.getChangingConfigurations() | this.field_517.getChangingConfigurations();
        }

        return var1;
    }

    public ConstantState getConstantState() {
        Object var1;
        if (this.b != null && VERSION.SDK_INT >= 24) {
            var1 = new i$g(this.b.getConstantState());
        } else {
            this.field_517.field_283 = this.getChangingConfigurations();
            var1 = this.field_517;
        }

        return (ConstantState)var1;
    }

    public int getIntrinsicHeight() {
        int var1;
        if (this.b != null) {
            var1 = this.b.getIntrinsicHeight();
        } else {
            var1 = (int)this.field_517.field_284.field_298;
        }

        return var1;
    }

    public int getIntrinsicWidth() {
        int var1;
        if (this.b != null) {
            var1 = this.b.getIntrinsicWidth();
        } else {
            var1 = (int)this.field_517.field_284.field_297;
        }

        return var1;
    }

    public int getOpacity() {
        int var1;
        if (this.b != null) {
            var1 = this.b.getOpacity();
        } else {
            var1 = -3;
        }

        return var1;
    }

    public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3) {
        if (this.b != null) {
            this.b.inflate(var1, var2, var3);
        } else {
            this.inflate(var1, var2, var3, (Theme)null);
        }

    }

    public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
        if (this.b != null) {
            class_48.method_525(this.b, var1, var2, var3, var4);
        } else {
            i$f var6 = this.field_517;
            var6.field_284 = new i$e();
            TypedArray var5 = class_140.method_1184(var1, var4, var3, class_56.field_537);
            this.method_541(var5, var2);
            var5.recycle();
            var6.field_283 = this.getChangingConfigurations();
            var6.field_293 = true;
            this.method_543(var1, var2, var3, var4);
            this.field_518 = this.method_544(this.field_518, var6.field_285, var6.field_286);
        }

    }

    public void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }

    }

    public boolean isAutoMirrored() {
        boolean var1;
        if (this.b != null) {
            var1 = class_48.method_528(this.b);
        } else {
            var1 = this.field_517.field_287;
        }

        return var1;
    }

    public boolean isStateful() {
        boolean var1;
        if (this.b != null) {
            var1 = this.b.isStateful();
        } else if (!super.isStateful() && (this.field_517 == null || this.field_517.field_285 == null || !this.field_517.field_285.isStateful())) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        } else if (!this.field_520 && super.mutate() == this) {
            this.field_517 = new i$f(this.field_517);
            this.field_520 = true;
        }

        return this;
    }

    protected void onBoundsChange(Rect var1) {
        if (this.b != null) {
            this.b.setBounds(var1);
        }

    }

    protected boolean onStateChange(int[] var1) {
        boolean var2;
        if (this.b != null) {
            var2 = this.b.setState(var1);
        } else {
            i$f var3 = this.field_517;
            if (var3.field_285 != null && var3.field_286 != null) {
                this.field_518 = this.method_544(this.field_518, var3.field_285, var3.field_286);
                this.invalidateSelf();
                var2 = true;
            } else {
                var2 = false;
            }
        }

        return var2;
    }

    public void scheduleSelf(Runnable var1, long var2) {
        if (this.b != null) {
            this.b.scheduleSelf(var1, var2);
        } else {
            super.scheduleSelf(var1, var2);
        }

    }

    public void setAlpha(int var1) {
        if (this.b != null) {
            this.b.setAlpha(var1);
        } else if (this.field_517.field_284.getRootAlpha() != var1) {
            this.field_517.field_284.setRootAlpha(var1);
            this.invalidateSelf();
        }

    }

    public void setAutoMirrored(boolean var1) {
        if (this.b != null) {
            class_48.method_527(this.b, var1);
        } else {
            this.field_517.field_287 = var1;
        }

    }

    public void setColorFilter(ColorFilter var1) {
        if (this.b != null) {
            this.b.setColorFilter(var1);
        } else {
            this.field_519 = var1;
            this.invalidateSelf();
        }

    }

    public void setTint(int var1) {
        if (this.b != null) {
            class_48.method_521(this.b, var1);
        } else {
            this.setTintList(ColorStateList.valueOf(var1));
        }

    }

    public void setTintList(ColorStateList var1) {
        if (this.b != null) {
            class_48.method_523(this.b, var1);
        } else {
            i$f var2 = this.field_517;
            if (var2.field_285 != var1) {
                var2.field_285 = var1;
                this.field_518 = this.method_544(this.field_518, var1, var2.field_286);
                this.invalidateSelf();
            }
        }

    }

    public void setTintMode(Mode var1) {
        if (this.b != null) {
            class_48.method_526(this.b, var1);
        } else {
            i$f var2 = this.field_517;
            if (var2.field_286 != var1) {
                var2.field_286 = var1;
                this.field_518 = this.method_544(this.field_518, var2.field_285, var1);
                this.invalidateSelf();
            }
        }

    }

    public boolean setVisible(boolean var1, boolean var2) {
        if (this.b != null) {
            var1 = this.b.setVisible(var1, var2);
        } else {
            var1 = super.setVisible(var1, var2);
        }

        return var1;
    }

    public void unscheduleSelf(Runnable var1) {
        if (this.b != null) {
            this.b.unscheduleSelf(var1);
        } else {
            super.unscheduleSelf(var1);
        }

    }
}
