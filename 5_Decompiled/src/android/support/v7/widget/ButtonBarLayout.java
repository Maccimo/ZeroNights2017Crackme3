package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.h.class_146;
import android.support.v7.a.a$f;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ButtonBarLayout extends LinearLayout {
    // $FF: renamed from: a boolean
    private boolean field_403;
    // $FF: renamed from: b int
    private int field_404;
    // $FF: renamed from: c int
    private int field_405;

    public ButtonBarLayout(Context var1, AttributeSet var2) {
        boolean var3 = false;
        super(var1, var2);
        this.field_404 = -1;
        this.field_405 = 0;
        if (this.getResources().getConfiguration().screenHeightDp >= 320) {
            var3 = true;
        }

        TypedArray var4 = var1.obtainStyledAttributes(var2, a$j.ButtonBarLayout);
        this.field_403 = var4.getBoolean(a$j.ButtonBarLayout_allowStacking, var3);
        var4.recycle();
    }

    // $FF: renamed from: a (int) int
    private int method_467(int var1) {
        int var2 = this.getChildCount();

        while(true) {
            if (var1 >= var2) {
                var1 = -1;
                break;
            }

            if (this.getChildAt(var1).getVisibility() == 0) {
                break;
            }

            ++var1;
        }

        return var1;
    }

    // $FF: renamed from: a () boolean
    private boolean method_468() {
        boolean var1 = true;
        if (this.getOrientation() != 1) {
            var1 = false;
        }

        return var1;
    }

    private void setStacked(boolean var1) {
        byte var2;
        if (var1) {
            var2 = 1;
        } else {
            var2 = 0;
        }

        this.setOrientation(var2);
        if (var1) {
            var2 = 5;
        } else {
            var2 = 80;
        }

        this.setGravity(var2);
        View var3 = this.findViewById(a$f.spacer);
        if (var3 != null) {
            if (var1) {
                var2 = 8;
            } else {
                var2 = 4;
            }

            var3.setVisibility(var2);
        }

        for(int var4 = this.getChildCount() - 2; var4 >= 0; --var4) {
            this.bringChildToFront(this.getChildAt(var4));
        }

    }

    public int getMinimumHeight() {
        return Math.max(this.field_405, super.getMinimumHeight());
    }

    protected void onMeasure(int var1, int var2) {
        byte var6 = 0;
        int var3 = MeasureSpec.getSize(var1);
        if (this.field_403) {
            if (var3 > this.field_404 && this.method_468()) {
                this.setStacked(false);
            }

            this.field_404 = var3;
        }

        int var4;
        boolean var9;
        if (!this.method_468() && MeasureSpec.getMode(var1) == 1073741824) {
            var4 = MeasureSpec.makeMeasureSpec(var3, Integer.MIN_VALUE);
            var9 = true;
        } else {
            var4 = var1;
            var9 = false;
        }

        super.onMeasure(var4, var2);
        boolean var10 = var9;
        if (this.field_403) {
            var10 = var9;
            if (!this.method_468()) {
                boolean var5;
                if ((this.getMeasuredWidthAndState() & -16777216) == 16777216) {
                    var5 = true;
                } else {
                    var5 = false;
                }

                var10 = var9;
                if (var5) {
                    this.setStacked(true);
                    var10 = true;
                }
            }
        }

        if (var10) {
            super.onMeasure(var1, var2);
        }

        var3 = this.method_467(0);
        var1 = var6;
        if (var3 >= 0) {
            View var7 = this.getChildAt(var3);
            LayoutParams var8 = (LayoutParams)var7.getLayoutParams();
            var2 = this.getPaddingTop();
            var1 = var7.getMeasuredHeight();
            var4 = var8.topMargin;
            var2 = var8.bottomMargin + var1 + var2 + var4 + 0;
            if (this.method_468()) {
                var3 = this.method_467(var3 + 1);
                var1 = var2;
                if (var3 >= 0) {
                    var1 = var2 + this.getChildAt(var3).getPaddingTop() + (int)(16.0F * this.getResources().getDisplayMetrics().density);
                }
            } else {
                var1 = var2 + this.getPaddingBottom();
            }
        }

        if (class_146.method_1223(this) != var1) {
            this.setMinimumHeight(var1);
        }

    }

    public void setAllowStacking(boolean var1) {
        if (this.field_403 != var1) {
            this.field_403 = var1;
            if (!this.field_403 && this.getOrientation() == 1) {
                this.setStacked(false);
            }

            this.requestLayout();
        }

    }
}
