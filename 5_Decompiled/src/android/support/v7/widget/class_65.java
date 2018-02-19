package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.class_48;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

// $FF: renamed from: android.support.v7.widget.y
public class class_65 extends ListView {
    // $FF: renamed from: g int[]
    private static final int[] field_603 = new int[]{0};
    // $FF: renamed from: a android.graphics.Rect
    final Rect field_604 = new Rect();
    // $FF: renamed from: b int
    int field_605 = 0;
    // $FF: renamed from: c int
    int field_606 = 0;
    // $FF: renamed from: d int
    int field_607 = 0;
    // $FF: renamed from: e int
    int field_608 = 0;
    // $FF: renamed from: f int
    protected int field_609;
    // $FF: renamed from: h java.lang.reflect.Field
    private Field field_610;
    // $FF: renamed from: i android.support.v7.widget.y$a
    private y$a field_611;

    public class_65(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);

        try {
            this.field_610 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.field_610.setAccessible(true);
        } catch (NoSuchFieldException var4) {
            var4.printStackTrace();
        }

    }

    // $FF: renamed from: a (int, int, int, int, int) int
    public int method_643(int var1, int var2, int var3, int var4, int var5) {
        var2 = this.getListPaddingTop();
        int var9 = this.getListPaddingBottom();
        this.getListPaddingLeft();
        this.getListPaddingRight();
        int var7 = this.getDividerHeight();
        Drawable var11 = this.getDivider();
        ListAdapter var14 = this.getAdapter();
        if (var14 == null) {
            var1 = var2 + var9;
        } else {
            if (var7 <= 0 || var11 == null) {
                var7 = 0;
            }

            var3 = 0;
            View var15 = null;
            int var6 = 0;
            int var10 = var14.getCount();
            int var8 = 0;

            for(var2 += var9; var8 < var10; var3 = var9) {
                var9 = var14.getItemViewType(var8);
                if (var9 != var6) {
                    var15 = null;
                    var6 = var9;
                }

                View var12 = var14.getView(var8, var15, this);
                LayoutParams var13 = var12.getLayoutParams();
                LayoutParams var16 = var13;
                if (var13 == null) {
                    var16 = this.generateDefaultLayoutParams();
                    var12.setLayoutParams(var16);
                }

                if (var16.height > 0) {
                    var9 = MeasureSpec.makeMeasureSpec(var16.height, 1073741824);
                } else {
                    var9 = MeasureSpec.makeMeasureSpec(0, 0);
                }

                var12.measure(var1, var9);
                var12.forceLayout();
                if (var8 > 0) {
                    var2 += var7;
                }

                var2 += var12.getMeasuredHeight();
                if (var2 >= var4) {
                    var1 = var4;
                    if (var5 >= 0) {
                        var1 = var4;
                        if (var8 > var5) {
                            var1 = var4;
                            if (var3 > 0) {
                                var1 = var4;
                                if (var2 != var4) {
                                    var1 = var3;
                                    return var1;
                                }
                            }

                            return var1;
                        }
                    }

                    return var1;
                }

                var9 = var3;
                if (var5 >= 0) {
                    var9 = var3;
                    if (var8 >= var5) {
                        var9 = var2;
                    }
                }

                ++var8;
                var15 = var12;
            }

            var1 = var2;
        }

        return var1;
    }

    // $FF: renamed from: a (int, android.view.View) void
    protected void method_644(int var1, View var2) {
        boolean var6 = true;
        Drawable var7 = this.getSelector();
        boolean var5;
        if (var7 != null && var1 != -1) {
            var5 = true;
        } else {
            var5 = false;
        }

        if (var5) {
            var7.setVisible(false, false);
        }

        this.method_649(var1, var2);
        if (var5) {
            Rect var8 = this.field_604;
            float var4 = var8.exactCenterX();
            float var3 = var8.exactCenterY();
            if (this.getVisibility() != 0) {
                var6 = false;
            }

            var7.setVisible(var6, false);
            class_48.method_520(var7, var4, var3);
        }

    }

    // $FF: renamed from: a (int, android.view.View, float, float) void
    protected void method_645(int var1, View var2, float var3, float var4) {
        this.method_644(var1, var2);
        Drawable var5 = this.getSelector();
        if (var5 != null && var1 != -1) {
            class_48.method_520(var5, var3, var4);
        }

    }

    // $FF: renamed from: a (android.graphics.Canvas) void
    protected void method_646(Canvas var1) {
        if (!this.field_604.isEmpty()) {
            Drawable var2 = this.getSelector();
            if (var2 != null) {
                var2.setBounds(this.field_604);
                var2.draw(var1);
            }
        }

    }

    // $FF: renamed from: a () boolean
    protected boolean method_647() {
        return false;
    }

    // $FF: renamed from: b () void
    protected void method_648() {
        Drawable var1 = this.getSelector();
        if (var1 != null && this.method_650()) {
            var1.setState(this.getDrawableState());
        }

    }

    // $FF: renamed from: b (int, android.view.View) void
    protected void method_649(int param1, View param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: c () boolean
    protected boolean method_650() {
        boolean var1;
        if (this.method_647() && this.isPressed()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    protected void dispatchDraw(Canvas var1) {
        this.method_646(var1);
        super.dispatchDraw(var1);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.setSelectorEnabled(true);
        this.method_648();
    }

    public boolean onTouchEvent(MotionEvent var1) {
        switch(var1.getAction()) {
        case 0:
            this.field_609 = this.pointToPosition((int)var1.getX(), (int)var1.getY());
        default:
            return super.onTouchEvent(var1);
        }
    }

    public void setSelector(Drawable var1) {
        y$a var2;
        if (var1 != null) {
            var2 = new y$a(var1);
        } else {
            var2 = null;
        }

        this.field_611 = var2;
        super.setSelector(this.field_611);
        Rect var3 = new Rect();
        if (var1 != null) {
            var1.getPadding(var3);
        }

        this.field_605 = var3.left;
        this.field_606 = var3.top;
        this.field_607 = var3.right;
        this.field_608 = var3.bottom;
    }

    protected void setSelectorEnabled(boolean var1) {
        if (this.field_611 != null) {
            this.field_611.method_166(var1);
        }

    }
}
