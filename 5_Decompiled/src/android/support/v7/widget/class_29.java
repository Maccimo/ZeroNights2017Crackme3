package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.h.class_148;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;

// $FF: renamed from: android.support.v7.widget.a
abstract class class_29 extends ViewGroup {
    // $FF: renamed from: a android.support.v7.widget.a$a
    protected final a$a field_98;
    // $FF: renamed from: b android.content.Context
    protected final Context field_99;
    // $FF: renamed from: c android.support.v7.widget.ActionMenuView
    protected ActionMenuView field_100;
    // $FF: renamed from: d android.support.v7.widget.d
    protected class_72 field_101;
    // $FF: renamed from: e int
    protected int field_102;
    // $FF: renamed from: f android.support.v4.h.p
    protected class_148 field_103;
    // $FF: renamed from: g boolean
    private boolean field_104;
    // $FF: renamed from: h boolean
    private boolean field_105;

    class_29(Context var1) {
        this(var1, (AttributeSet)null);
    }

    class_29(Context var1, AttributeSet var2) {
        this(var1, var2, 0);
    }

    class_29(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        this.field_98 = new a$a(this);
        TypedValue var4 = new TypedValue();
        if (var1.getTheme().resolveAttribute(android.support.v7.a.a$a.actionBarPopupTheme, var4, true) && var4.resourceId != 0) {
            this.field_99 = new ContextThemeWrapper(var1, var4.resourceId);
        } else {
            this.field_99 = var1;
        }

    }

    // $FF: renamed from: a (int, int, boolean) int
    protected static int method_225(int var0, int var1, boolean var2) {
        if (var2) {
            var0 -= var1;
        } else {
            var0 += var1;
        }

        return var0;
    }

    // $FF: renamed from: a (android.view.View, int, int, int) int
    protected int method_226(View var1, int var2, int var3, int var4) {
        var1.measure(MeasureSpec.makeMeasureSpec(var2, Integer.MIN_VALUE), var3);
        return Math.max(0, var2 - var1.getMeasuredWidth() - var4);
    }

    // $FF: renamed from: a (android.view.View, int, int, int, boolean) int
    protected int method_227(View var1, int var2, int var3, int var4, boolean var5) {
        int var6 = var1.getMeasuredWidth();
        int var7 = var1.getMeasuredHeight();
        var3 += (var4 - var7) / 2;
        if (var5) {
            var1.layout(var2 - var6, var3, var2, var7 + var3);
        } else {
            var1.layout(var2, var3, var2 + var6, var7 + var3);
        }

        var2 = var6;
        if (var5) {
            var2 = -var6;
        }

        return var2;
    }

    public int getAnimatedVisibility() {
        int var1;
        if (this.field_103 != null) {
            var1 = this.field_98.field_1163;
        } else {
            var1 = this.getVisibility();
        }

        return var1;
    }

    public int getContentHeight() {
        return this.field_102;
    }

    protected void onConfigurationChanged(Configuration var1) {
        super.onConfigurationChanged(var1);
        TypedArray var2 = this.getContext().obtainStyledAttributes((AttributeSet)null, a$j.ActionBar, android.support.v7.a.a$a.actionBarStyle, 0);
        this.setContentHeight(var2.getLayoutDimension(a$j.ActionBar_height, 0));
        var2.recycle();
        if (this.field_101 != null) {
            this.field_101.method_685(var1);
        }

    }

    public boolean onHoverEvent(MotionEvent var1) {
        int var2 = var1.getActionMasked();
        if (var2 == 9) {
            this.field_105 = false;
        }

        if (!this.field_105) {
            boolean var3 = super.onHoverEvent(var1);
            if (var2 == 9 && !var3) {
                this.field_105 = true;
            }
        }

        if (var2 == 10 || var2 == 3) {
            this.field_105 = false;
        }

        return true;
    }

    public boolean onTouchEvent(MotionEvent var1) {
        int var2 = var1.getActionMasked();
        if (var2 == 0) {
            this.field_104 = false;
        }

        if (!this.field_104) {
            boolean var3 = super.onTouchEvent(var1);
            if (var2 == 0 && !var3) {
                this.field_104 = true;
            }
        }

        if (var2 == 1 || var2 == 3) {
            this.field_104 = false;
        }

        return true;
    }

    public void setContentHeight(int var1) {
        this.field_102 = var1;
        this.requestLayout();
    }

    public void setVisibility(int var1) {
        if (var1 != this.getVisibility()) {
            if (this.field_103 != null) {
                this.field_103.method_1253();
            }

            super.setVisibility(var1);
        }

    }
}
