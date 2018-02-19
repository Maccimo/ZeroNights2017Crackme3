package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.h.class_146;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.View.OnTouchListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

// $FF: renamed from: android.support.v4.widget.a
public abstract class class_149 implements OnTouchListener {
    // $FF: renamed from: r int
    private static final int field_1135 = ViewConfiguration.getTapTimeout();
    // $FF: renamed from: a android.support.v4.widget.a$a
    final a$a field_1136 = new a$a();
    // $FF: renamed from: b android.view.View
    final View field_1137;
    // $FF: renamed from: c boolean
    boolean field_1138;
    // $FF: renamed from: d boolean
    boolean field_1139;
    // $FF: renamed from: e boolean
    boolean field_1140;
    // $FF: renamed from: f android.view.animation.Interpolator
    private final Interpolator field_1141 = new AccelerateInterpolator();
    // $FF: renamed from: g java.lang.Runnable
    private Runnable field_1142;
    // $FF: renamed from: h float[]
    private float[] field_1143 = new float[]{0.0F, 0.0F};
    // $FF: renamed from: i float[]
    private float[] field_1144 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    // $FF: renamed from: j int
    private int field_1145;
    // $FF: renamed from: k int
    private int field_1146;
    // $FF: renamed from: l float[]
    private float[] field_1147 = new float[]{0.0F, 0.0F};
    // $FF: renamed from: m float[]
    private float[] field_1148 = new float[]{0.0F, 0.0F};
    // $FF: renamed from: n float[]
    private float[] field_1149 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    // $FF: renamed from: o boolean
    private boolean field_1150;
    // $FF: renamed from: p boolean
    private boolean field_1151;
    // $FF: renamed from: q boolean
    private boolean field_1152;

    public class_149(View var1) {
        this.field_1137 = var1;
        DisplayMetrics var4 = Resources.getSystem().getDisplayMetrics();
        int var2 = (int)(1575.0F * var4.density + 0.5F);
        int var3 = (int)(var4.density * 315.0F + 0.5F);
        this.method_1262((float)var2, (float)var2);
        this.method_1267((float)var3, (float)var3);
        this.method_1263(1);
        this.method_1274(Float.MAX_VALUE, Float.MAX_VALUE);
        this.method_1272(0.2F, 0.2F);
        this.method_1270(1.0F, 1.0F);
        this.method_1268(field_1135);
        this.method_1271(500);
        this.method_1273(500);
    }

    // $FF: renamed from: a (float, float, float) float
    static float method_1255(float var0, float var1, float var2) {
        if (var0 <= var2) {
            var2 = var1;
            if (var0 >= var1) {
                var2 = var0;
            }
        }

        return var2;
    }

    // $FF: renamed from: a (float, float, float, float) float
    private float method_1256(float var1, float var2, float var3, float var4) {
        float var5 = 0.0F;
        var1 = method_1255(var1 * var2, 0.0F, var3);
        var3 = this.method_1261(var4, var1);
        var2 = this.method_1261(var2 - var4, var1) - var3;
        if (var2 < 0.0F) {
            var1 = -this.field_1141.getInterpolation(-var2);
        } else {
            var1 = var5;
            if (var2 <= 0.0F) {
                return var1;
            }

            var1 = this.field_1141.getInterpolation(var2);
        }

        var1 = method_1255(var1, -1.0F, 1.0F);
        return var1;
    }

    // $FF: renamed from: a (int, float, float, float) float
    private float method_1257(int var1, float var2, float var3, float var4) {
        float var5 = 0.0F;
        var2 = this.method_1256(this.field_1143[var1], var3, this.field_1144[var1], var2);
        if (var2 == 0.0F) {
            var2 = var5;
        } else {
            float var6 = this.field_1147[var1];
            var5 = this.field_1148[var1];
            var3 = this.field_1149[var1];
            var4 = var6 * var4;
            if (var2 > 0.0F) {
                var2 = method_1255(var2 * var4, var5, var3);
            } else {
                var2 = -method_1255(-var2 * var4, var5, var3);
            }
        }

        return var2;
    }

    // $FF: renamed from: a (int, int, int) int
    static int method_1258(int var0, int var1, int var2) {
        if (var0 <= var2) {
            var2 = var1;
            if (var0 >= var1) {
                var2 = var0;
            }
        }

        return var2;
    }

    // $FF: renamed from: c () void
    private void method_1259() {
        if (this.field_1142 == null) {
            this.field_1142 = new a$b(this);
        }

        this.field_1140 = true;
        this.field_1138 = true;
        if (!this.field_1150 && this.field_1146 > 0) {
            class_146.method_1221(this.field_1137, this.field_1142, (long)this.field_1146);
        } else {
            this.field_1142.run();
        }

        this.field_1150 = true;
    }

    // $FF: renamed from: d () void
    private void method_1260() {
        if (this.field_1138) {
            this.field_1140 = false;
        } else {
            this.field_1136.method_977();
        }

    }

    // $FF: renamed from: f (float, float) float
    private float method_1261(float var1, float var2) {
        float var4 = 0.0F;
        float var3;
        if (var2 == 0.0F) {
            var3 = var4;
        } else {
            switch(this.field_1145) {
            case 0:
            case 1:
                var3 = var4;
                if (var1 < var2) {
                    if (var1 >= 0.0F) {
                        var3 = 1.0F - var1 / var2;
                    } else {
                        var3 = var4;
                        if (this.field_1140) {
                            var3 = var4;
                            if (this.field_1145 == 1) {
                                var3 = 1.0F;
                            }
                        }
                    }
                }
                break;
            case 2:
                var3 = var4;
                if (var1 < 0.0F) {
                    var3 = var1 / -var2;
                }
                break;
            default:
                var3 = var4;
            }
        }

        return var3;
    }

    // $FF: renamed from: a (float, float) android.support.v4.widget.a
    public class_149 method_1262(float var1, float var2) {
        this.field_1149[0] = var1 / 1000.0F;
        this.field_1149[1] = var2 / 1000.0F;
        return this;
    }

    // $FF: renamed from: a (int) android.support.v4.widget.a
    public class_149 method_1263(int var1) {
        this.field_1145 = var1;
        return this;
    }

    // $FF: renamed from: a (boolean) android.support.v4.widget.a
    public class_149 method_1264(boolean var1) {
        if (this.field_1151 && !var1) {
            this.method_1260();
        }

        this.field_1151 = var1;
        return this;
    }

    // $FF: renamed from: a (int, int) void
    public abstract void method_1265(int var1, int var2);

    // $FF: renamed from: a () boolean
    boolean method_1266() {
        a$a var4 = this.field_1136;
        int var1 = var4.method_982();
        int var2 = var4.method_981();
        boolean var3;
        if ((var1 == 0 || !this.method_1276(var1)) && (var2 == 0 || !this.method_1275(var2))) {
            var3 = false;
        } else {
            var3 = true;
        }

        return var3;
    }

    // $FF: renamed from: b (float, float) android.support.v4.widget.a
    public class_149 method_1267(float var1, float var2) {
        this.field_1148[0] = var1 / 1000.0F;
        this.field_1148[1] = var2 / 1000.0F;
        return this;
    }

    // $FF: renamed from: b (int) android.support.v4.widget.a
    public class_149 method_1268(int var1) {
        this.field_1146 = var1;
        return this;
    }

    // $FF: renamed from: b () void
    void method_1269() {
        long var1 = SystemClock.uptimeMillis();
        MotionEvent var3 = MotionEvent.obtain(var1, var1, 3, 0.0F, 0.0F, 0);
        this.field_1137.onTouchEvent(var3);
        var3.recycle();
    }

    // $FF: renamed from: c (float, float) android.support.v4.widget.a
    public class_149 method_1270(float var1, float var2) {
        this.field_1147[0] = var1 / 1000.0F;
        this.field_1147[1] = var2 / 1000.0F;
        return this;
    }

    // $FF: renamed from: c (int) android.support.v4.widget.a
    public class_149 method_1271(int var1) {
        this.field_1136.method_976(var1);
        return this;
    }

    // $FF: renamed from: d (float, float) android.support.v4.widget.a
    public class_149 method_1272(float var1, float var2) {
        this.field_1143[0] = var1;
        this.field_1143[1] = var2;
        return this;
    }

    // $FF: renamed from: d (int) android.support.v4.widget.a
    public class_149 method_1273(int var1) {
        this.field_1136.method_978(var1);
        return this;
    }

    // $FF: renamed from: e (float, float) android.support.v4.widget.a
    public class_149 method_1274(float var1, float var2) {
        this.field_1144[0] = var1;
        this.field_1144[1] = var2;
        return this;
    }

    // $FF: renamed from: e (int) boolean
    public abstract boolean method_1275(int var1);

    // $FF: renamed from: f (int) boolean
    public abstract boolean method_1276(int var1);

    public boolean onTouch(View var1, MotionEvent var2) {
        boolean var6 = false;
        boolean var5;
        if (!this.field_1151) {
            var5 = var6;
        } else {
            switch(var2.getActionMasked()) {
            case 0:
                this.field_1139 = true;
                this.field_1150 = false;
            case 2:
                float var4 = this.method_1257(0, var2.getX(), (float)var1.getWidth(), (float)this.field_1137.getWidth());
                float var3 = this.method_1257(1, var2.getY(), (float)var1.getHeight(), (float)this.field_1137.getHeight());
                this.field_1136.method_975(var4, var3);
                if (!this.field_1140 && this.method_1266()) {
                    this.method_1259();
                }
                break;
            case 1:
            case 3:
                this.method_1260();
            }

            var5 = var6;
            if (this.field_1152) {
                var5 = var6;
                if (this.field_1140) {
                    var5 = true;
                }
            }
        }

        return var5;
    }
}
