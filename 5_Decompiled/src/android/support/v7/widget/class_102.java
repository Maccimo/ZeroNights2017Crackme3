package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.a.a$d;
import android.support.v7.a.a$f;
import android.support.v7.a.a$g;
import android.support.v7.a.a$i;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.View.MeasureSpec;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

// $FF: renamed from: android.support.v7.widget.ao
class class_102 {
    // $FF: renamed from: a android.content.Context
    private final Context field_853;
    // $FF: renamed from: b android.view.View
    private final View field_854;
    // $FF: renamed from: c android.widget.TextView
    private final TextView field_855;
    // $FF: renamed from: d android.view.WindowManager.LayoutParams
    private final LayoutParams field_856 = new LayoutParams();
    // $FF: renamed from: e android.graphics.Rect
    private final Rect field_857 = new Rect();
    // $FF: renamed from: f int[]
    private final int[] field_858 = new int[2];
    // $FF: renamed from: g int[]
    private final int[] field_859 = new int[2];

    class_102(Context var1) {
        this.field_853 = var1;
        this.field_854 = LayoutInflater.from(this.field_853).inflate(a$g.tooltip, (ViewGroup)null);
        this.field_855 = (TextView)this.field_854.findViewById(a$f.message);
        this.field_856.setTitle(this.getClass().getSimpleName());
        this.field_856.packageName = this.field_853.getPackageName();
        this.field_856.type = 1002;
        this.field_856.width = -2;
        this.field_856.height = -2;
        this.field_856.format = -3;
        this.field_856.windowAnimations = a$i.Animation_AppCompat_Tooltip;
        this.field_856.flags = 24;
    }

    // $FF: renamed from: a (android.view.View) android.view.View
    private static View method_901(View var0) {
        Context var1 = var0.getContext();

        while(true) {
            if (!(var1 instanceof ContextWrapper)) {
                var0 = var0.getRootView();
                break;
            }

            if (var1 instanceof Activity) {
                var0 = ((Activity)var1).getWindow().getDecorView();
                break;
            }

            var1 = ((ContextWrapper)var1).getBaseContext();
        }

        return var0;
    }

    // $FF: renamed from: a (android.view.View, int, int, boolean, android.view.WindowManager.LayoutParams) void
    private void method_902(View var1, int var2, int var3, boolean var4, LayoutParams var5) {
        int var6 = this.field_853.getResources().getDimensionPixelOffset(a$d.tooltip_precise_anchor_threshold);
        if (var1.getWidth() < var6) {
            var2 = var1.getWidth() / 2;
        }

        int var7;
        if (var1.getHeight() >= var6) {
            var7 = this.field_853.getResources().getDimensionPixelOffset(a$d.tooltip_precise_anchor_extra_offset);
            var6 = var3 + var7;
            var7 = var3 - var7;
            var3 = var6;
            var6 = var7;
        } else {
            var3 = var1.getHeight();
            var6 = 0;
        }

        var5.gravity = 49;
        Resources var9 = this.field_853.getResources();
        if (var4) {
            var7 = a$d.tooltip_y_offset_touch;
        } else {
            var7 = a$d.tooltip_y_offset_non_touch;
        }

        int var8 = var9.getDimensionPixelOffset(var7);
        View var12 = method_901(var1);
        if (var12 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            var12.getWindowVisibleDisplayFrame(this.field_857);
            if (this.field_857.left < 0 && this.field_857.top < 0) {
                Resources var10 = this.field_853.getResources();
                var7 = var10.getIdentifier("status_bar_height", "dimen", "android");
                if (var7 != 0) {
                    var7 = var10.getDimensionPixelSize(var7);
                } else {
                    var7 = 0;
                }

                DisplayMetrics var13 = var10.getDisplayMetrics();
                this.field_857.set(0, var7, var13.widthPixels, var13.heightPixels);
            }

            var12.getLocationOnScreen(this.field_859);
            var1.getLocationOnScreen(this.field_858);
            int[] var11 = this.field_858;
            var11[0] -= this.field_859[0];
            var11 = this.field_858;
            var11[1] -= this.field_859[1];
            var5.x = this.field_858[0] + var2 - this.field_857.width() / 2;
            var2 = MeasureSpec.makeMeasureSpec(0, 0);
            this.field_854.measure(var2, var2);
            var2 = this.field_854.getMeasuredHeight();
            var6 = var6 + this.field_858[1] - var8 - var2;
            var3 = this.field_858[1] + var3 + var8;
            if (var4) {
                if (var6 >= 0) {
                    var5.y = var6;
                } else {
                    var5.y = var3;
                }
            } else if (var2 + var3 <= this.field_857.height()) {
                var5.y = var3;
            } else {
                var5.y = var6;
            }
        }

    }

    // $FF: renamed from: a () void
    void method_903() {
        if (this.method_905()) {
            ((WindowManager)this.field_853.getSystemService("window")).removeView(this.field_854);
        }

    }

    // $FF: renamed from: a (android.view.View, int, int, boolean, java.lang.CharSequence) void
    void method_904(View var1, int var2, int var3, boolean var4, CharSequence var5) {
        if (this.method_905()) {
            this.method_903();
        }

        this.field_855.setText(var5);
        this.method_902(var1, var2, var3, var4, this.field_856);
        ((WindowManager)this.field_853.getSystemService("window")).addView(this.field_854, this.field_856);
    }

    // $FF: renamed from: b () boolean
    boolean method_905() {
        boolean var1;
        if (this.field_854.getParent() != null) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }
}
