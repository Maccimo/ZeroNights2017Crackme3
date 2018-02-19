package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.h.class_142;
import android.support.v4.h.class_146;
import android.support.v7.a.a$f;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;

public class AlertDialogLayout extends class_31 {
    public AlertDialogLayout(Context var1) {
        super(var1);
    }

    public AlertDialogLayout(Context var1, AttributeSet var2) {
        super(var1, var2);
    }

    // $FF: renamed from: a (android.view.View, int, int, int, int) void
    private void method_263(View var1, int var2, int var3, int var4, int var5) {
        var1.layout(var2, var3, var2 + var4, var3 + var5);
    }

    // $FF: renamed from: c (android.view.View) int
    private static int method_264(View var0) {
        byte var2 = 0;
        int var1 = class_146.method_1223(var0);
        if (var1 <= 0) {
            var1 = var2;
            if (var0 instanceof ViewGroup) {
                ViewGroup var3 = (ViewGroup)var0;
                var1 = var2;
                if (var3.getChildCount() == 1) {
                    var1 = method_264(var3.getChildAt(0));
                }
            }
        }

        return var1;
    }

    // $FF: renamed from: c (int, int) boolean
    private boolean method_265(int var1, int var2) {
        View var15 = null;
        View var14 = null;
        int var9 = this.getChildCount();
        View var17 = null;
        int var3 = 0;

        boolean var13;
        while(true) {
            int var4;
            if (var3 >= var9) {
                int var11 = MeasureSpec.getMode(var2);
                int var8 = MeasureSpec.getSize(var2);
                int var10 = MeasureSpec.getMode(var1);
                var4 = 0;
                var3 = this.getPaddingTop();
                var3 += this.getPaddingBottom();
                int var5 = var3;
                if (var15 != null) {
                    var15.measure(var1, 0);
                    var5 = var3 + var15.getMeasuredHeight();
                    var4 = View.combineMeasuredStates(0, var15.getMeasuredState());
                }

                var3 = 0;
                int var6;
                if (var14 != null) {
                    var14.measure(var1, 0);
                    var3 = method_264(var14);
                    var6 = var14.getMeasuredHeight();
                    var5 += var3;
                    var4 = View.combineMeasuredStates(var4, var14.getMeasuredState());
                    var6 -= var3;
                } else {
                    var6 = 0;
                }

                int var7;
                if (var17 != null) {
                    if (var11 == 0) {
                        var7 = 0;
                    } else {
                        var7 = MeasureSpec.makeMeasureSpec(Math.max(0, var8 - var5), var11);
                    }

                    var17.measure(var1, var7);
                    var7 = var17.getMeasuredHeight();
                    var5 += var7;
                    var4 = View.combineMeasuredStates(var4, var17.getMeasuredState());
                } else {
                    var7 = 0;
                }

                var8 -= var5;
                if (var14 != null) {
                    int var12 = Math.min(var8, var6);
                    if (var12 > 0) {
                        var6 = var8 - var12;
                        var8 = var3 + var12;
                    } else {
                        var6 = var8;
                        var8 = var3;
                    }

                    var14.measure(var1, MeasureSpec.makeMeasureSpec(var8, 1073741824));
                    var8 = var14.getMeasuredHeight();
                    var4 = View.combineMeasuredStates(var4, var14.getMeasuredState());
                    var3 = var5 - var3 + var8;
                    var8 = var6;
                } else {
                    var3 = var5;
                }

                var6 = var4;
                var5 = var3;
                if (var17 != null) {
                    var6 = var4;
                    var5 = var3;
                    if (var8 > 0) {
                        var17.measure(var1, MeasureSpec.makeMeasureSpec(var8 + var7, var11));
                        var5 = var17.getMeasuredHeight();
                        var6 = View.combineMeasuredStates(var4, var17.getMeasuredState());
                        var5 += var3 - var7;
                    }
                }

                var7 = 0;

                for(var3 = 0; var3 < var9; var7 = var4) {
                    var14 = this.getChildAt(var3);
                    var4 = var7;
                    if (var14.getVisibility() != 8) {
                        var4 = Math.max(var7, var14.getMeasuredWidth());
                    }

                    ++var3;
                }

                this.setMeasuredDimension(View.resolveSizeAndState(var7 + this.getPaddingLeft() + this.getPaddingRight(), var1, var6), View.resolveSizeAndState(var5, var2, 0));
                if (var10 != 1073741824) {
                    this.method_266(var9, var2);
                }

                var13 = true;
                break;
            }

            View var16 = this.getChildAt(var3);
            if (var16.getVisibility() == 8) {
                var16 = var15;
                var15 = var14;
                var14 = var16;
            } else {
                var4 = var16.getId();
                if (var4 == a$f.topPanel) {
                    var15 = var14;
                    var14 = var16;
                } else if (var4 == a$f.buttonPanel) {
                    var14 = var15;
                    var15 = var16;
                } else {
                    if (var4 != a$f.contentPanel && var4 != a$f.customPanel) {
                        var13 = false;
                        break;
                    }

                    if (var17 != null) {
                        var13 = false;
                        break;
                    }

                    View var18 = var15;
                    var15 = var14;
                    var17 = var16;
                    var14 = var18;
                }
            }

            ++var3;
            var16 = var15;
            var15 = var14;
            var14 = var16;
        }

        return var13;
    }

    // $FF: renamed from: d (int, int) void
    private void method_266(int var1, int var2) {
        int var4 = MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);

        for(int var3 = 0; var3 < var1; ++var3) {
            View var6 = this.getChildAt(var3);
            if (var6.getVisibility() != 8) {
                w$a var7 = (w$a)var6.getLayoutParams();
                if (var7.width == -1) {
                    int var5 = var7.height;
                    var7.height = var6.getMeasuredHeight();
                    this.measureChildWithMargins(var6, var4, 0, var2, 0);
                    var7.height = var5;
                }
            }
        }

    }

    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        int var7 = this.getPaddingLeft();
        int var10 = var4 - var2;
        int var12 = this.getPaddingRight();
        int var11 = this.getPaddingRight();
        var2 = this.getMeasuredHeight();
        int var9 = this.getChildCount();
        int var8 = this.getGravity();
        switch(var8 & 112) {
        case 16:
            var4 = this.getPaddingTop();
            var2 = (var5 - var3 - var2) / 2 + var4;
            break;
        case 80:
            var2 = this.getPaddingTop() + var5 - var3 - var2;
            break;
        default:
            var2 = this.getPaddingTop();
        }

        Drawable var15 = this.getDividerDrawable();
        if (var15 == null) {
            var4 = 0;
        } else {
            var4 = var15.getIntrinsicHeight();
        }

        for(var5 = 0; var5 < var9; var2 = var3) {
            View var16 = this.getChildAt(var5);
            var3 = var2;
            if (var16 != null) {
                var3 = var2;
                if (var16.getVisibility() != 8) {
                    int var14 = var16.getMeasuredWidth();
                    int var13 = var16.getMeasuredHeight();
                    w$a var17 = (w$a)var16.getLayoutParams();
                    int var6 = var17.field_342;
                    var3 = var6;
                    if (var6 < 0) {
                        var3 = 8388615 & var8;
                    }

                    switch(class_142.method_1195(var3, class_146.method_1222(this)) & 7) {
                    case 1:
                        var3 = (var10 - var7 - var11 - var14) / 2 + var7 + var17.leftMargin - var17.rightMargin;
                        break;
                    case 5:
                        var3 = var10 - var12 - var14 - var17.rightMargin;
                        break;
                    default:
                        var3 = var7 + var17.leftMargin;
                    }

                    if (this.c(var5)) {
                        var2 += var4;
                    }

                    var2 += var17.topMargin;
                    this.method_263(var16, var3, var2, var14, var13);
                    var3 = var2 + var17.bottomMargin + var13;
                }
            }

            ++var5;
        }

    }

    protected void onMeasure(int var1, int var2) {
        if (!this.method_265(var1, var2)) {
            super.onMeasure(var1, var2);
        }

    }
}
