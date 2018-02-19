package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.support.v4.h.class_146;
import android.support.v7.a.a$f;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer extends FrameLayout {
    // $FF: renamed from: a android.graphics.drawable.Drawable
    Drawable field_498;
    // $FF: renamed from: b android.graphics.drawable.Drawable
    Drawable field_499;
    // $FF: renamed from: c android.graphics.drawable.Drawable
    Drawable field_500;
    // $FF: renamed from: d boolean
    boolean field_501;
    // $FF: renamed from: e boolean
    boolean field_502;
    // $FF: renamed from: f boolean
    private boolean field_503;
    // $FF: renamed from: g android.view.View
    private View field_504;
    // $FF: renamed from: h android.view.View
    private View field_505;
    // $FF: renamed from: i android.view.View
    private View field_506;
    // $FF: renamed from: j int
    private int field_507;

    public ActionBarContainer(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public ActionBarContainer(Context var1, AttributeSet var2) {
        super(var1, var2);
        Object var4;
        if (VERSION.SDK_INT >= 21) {
            var4 = new class_70(this);
        } else {
            var4 = new class_69(this);
        }

        class_146.method_1218(this, (Drawable)var4);
        TypedArray var5 = var1.obtainStyledAttributes(var2, a$j.ActionBar);
        this.field_498 = var5.getDrawable(a$j.ActionBar_background);
        this.field_499 = var5.getDrawable(a$j.ActionBar_backgroundStacked);
        this.field_507 = var5.getDimensionPixelSize(a$j.ActionBar_height, -1);
        if (this.getId() == a$f.split_action_bar) {
            this.field_501 = true;
            this.field_500 = var5.getDrawable(a$j.ActionBar_backgroundSplit);
        }

        var5.recycle();
        boolean var3;
        if (this.field_501) {
            if (this.field_500 == null) {
                var3 = true;
            } else {
                var3 = false;
            }
        } else if (this.field_498 == null && this.field_499 == null) {
            var3 = true;
        } else {
            var3 = false;
        }

        this.setWillNotDraw(var3);
    }

    // $FF: renamed from: a (android.view.View) boolean
    private boolean method_515(View var1) {
        boolean var2;
        if (var1 != null && var1.getVisibility() != 8 && var1.getMeasuredHeight() != 0) {
            var2 = false;
        } else {
            var2 = true;
        }

        return var2;
    }

    // $FF: renamed from: b (android.view.View) int
    private int method_516(View var1) {
        LayoutParams var4 = (LayoutParams)var1.getLayoutParams();
        int var2 = var1.getMeasuredHeight();
        int var3 = var4.topMargin;
        return var4.bottomMargin + var2 + var3;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.field_498 != null && this.field_498.isStateful()) {
            this.field_498.setState(this.getDrawableState());
        }

        if (this.field_499 != null && this.field_499.isStateful()) {
            this.field_499.setState(this.getDrawableState());
        }

        if (this.field_500 != null && this.field_500.isStateful()) {
            this.field_500.setState(this.getDrawableState());
        }

    }

    public View getTabContainer() {
        return this.field_504;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.field_498 != null) {
            this.field_498.jumpToCurrentState();
        }

        if (this.field_499 != null) {
            this.field_499.jumpToCurrentState();
        }

        if (this.field_500 != null) {
            this.field_500.jumpToCurrentState();
        }

    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.field_505 = this.findViewById(a$f.action_bar);
        this.field_506 = this.findViewById(a$f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent var1) {
        super.onHoverEvent(var1);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent var1) {
        boolean var2;
        if (!this.field_503 && !super.onInterceptTouchEvent(var1)) {
            var2 = false;
        } else {
            var2 = true;
        }

        return var2;
    }

    public void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        boolean var6 = true;
        super.onLayout(var1, var2, var3, var4, var5);
        View var8 = this.field_504;
        if (var8 != null && var8.getVisibility() != 8) {
            var1 = true;
        } else {
            var1 = false;
        }

        if (var8 != null && var8.getVisibility() != 8) {
            var3 = this.getMeasuredHeight();
            LayoutParams var7 = (LayoutParams)var8.getLayoutParams();
            var8.layout(var2, var3 - var8.getMeasuredHeight() - var7.bottomMargin, var4, var3 - var7.bottomMargin);
        }

        boolean var9;
        if (this.field_501) {
            if (this.field_500 != null) {
                this.field_500.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                var9 = var6;
            } else {
                var9 = false;
            }
        } else {
            if (this.field_498 == null) {
                var9 = false;
            } else {
                if (this.field_505.getVisibility() == 0) {
                    this.field_498.setBounds(this.field_505.getLeft(), this.field_505.getTop(), this.field_505.getRight(), this.field_505.getBottom());
                } else if (this.field_506 != null && this.field_506.getVisibility() == 0) {
                    this.field_498.setBounds(this.field_506.getLeft(), this.field_506.getTop(), this.field_506.getRight(), this.field_506.getBottom());
                } else {
                    this.field_498.setBounds(0, 0, 0, 0);
                }

                var9 = true;
            }

            this.field_502 = var1;
            if (var1 && this.field_499 != null) {
                this.field_499.setBounds(var8.getLeft(), var8.getTop(), var8.getRight(), var8.getBottom());
                var9 = var6;
            }
        }

        if (var9) {
            this.invalidate();
        }

    }

    public void onMeasure(int var1, int var2) {
        int var3 = var2;
        if (this.field_505 == null) {
            var3 = var2;
            if (MeasureSpec.getMode(var2) == Integer.MIN_VALUE) {
                var3 = var2;
                if (this.field_507 >= 0) {
                    var3 = MeasureSpec.makeMeasureSpec(Math.min(this.field_507, MeasureSpec.getSize(var2)), Integer.MIN_VALUE);
                }
            }
        }

        super.onMeasure(var1, var3);
        if (this.field_505 != null) {
            var2 = MeasureSpec.getMode(var3);
            if (this.field_504 != null && this.field_504.getVisibility() != 8 && var2 != 1073741824) {
                if (!this.method_515(this.field_505)) {
                    var1 = this.method_516(this.field_505);
                } else if (!this.method_515(this.field_506)) {
                    var1 = this.method_516(this.field_506);
                } else {
                    var1 = 0;
                }

                if (var2 == Integer.MIN_VALUE) {
                    var2 = MeasureSpec.getSize(var3);
                } else {
                    var2 = Integer.MAX_VALUE;
                }

                this.setMeasuredDimension(this.getMeasuredWidth(), Math.min(var1 + this.method_516(this.field_504), var2));
            }
        }

    }

    public boolean onTouchEvent(MotionEvent var1) {
        super.onTouchEvent(var1);
        return true;
    }

    public void setPrimaryBackground(Drawable var1) {
        boolean var3 = false;
        if (this.field_498 != null) {
            this.field_498.setCallback((Callback)null);
            this.unscheduleDrawable(this.field_498);
        }

        this.field_498 = var1;
        if (var1 != null) {
            var1.setCallback(this);
            if (this.field_505 != null) {
                this.field_498.setBounds(this.field_505.getLeft(), this.field_505.getTop(), this.field_505.getRight(), this.field_505.getBottom());
            }
        }

        boolean var2;
        label24: {
            if (this.field_501) {
                var2 = var3;
                if (this.field_500 != null) {
                    break label24;
                }
            } else {
                var2 = var3;
                if (this.field_498 != null) {
                    break label24;
                }

                if (this.field_499 != null) {
                    var2 = var3;
                    break label24;
                }
            }

            var2 = true;
        }

        this.setWillNotDraw(var2);
        this.invalidate();
    }

    public void setSplitBackground(Drawable var1) {
        boolean var3 = false;
        if (this.field_500 != null) {
            this.field_500.setCallback((Callback)null);
            this.unscheduleDrawable(this.field_500);
        }

        this.field_500 = var1;
        if (var1 != null) {
            var1.setCallback(this);
            if (this.field_501 && this.field_500 != null) {
                this.field_500.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
            }
        }

        boolean var2;
        label26: {
            if (this.field_501) {
                var2 = var3;
                if (this.field_500 != null) {
                    break label26;
                }
            } else {
                var2 = var3;
                if (this.field_498 != null) {
                    break label26;
                }

                if (this.field_499 != null) {
                    var2 = var3;
                    break label26;
                }
            }

            var2 = true;
        }

        this.setWillNotDraw(var2);
        this.invalidate();
    }

    public void setStackedBackground(Drawable var1) {
        boolean var3 = false;
        if (this.field_499 != null) {
            this.field_499.setCallback((Callback)null);
            this.unscheduleDrawable(this.field_499);
        }

        this.field_499 = var1;
        if (var1 != null) {
            var1.setCallback(this);
            if (this.field_502 && this.field_499 != null) {
                this.field_499.setBounds(this.field_504.getLeft(), this.field_504.getTop(), this.field_504.getRight(), this.field_504.getBottom());
            }
        }

        boolean var2;
        label26: {
            if (this.field_501) {
                var2 = var3;
                if (this.field_500 != null) {
                    break label26;
                }
            } else {
                var2 = var3;
                if (this.field_498 != null) {
                    break label26;
                }

                if (this.field_499 != null) {
                    var2 = var3;
                    break label26;
                }
            }

            var2 = true;
        }

        this.setWillNotDraw(var2);
        this.invalidate();
    }

    public void setTabContainer(class_93 var1) {
        if (this.field_504 != null) {
            this.removeView(this.field_504);
        }

        this.field_504 = var1;
        if (var1 != null) {
            this.addView(var1);
            android.view.ViewGroup.LayoutParams var2 = var1.getLayoutParams();
            var2.width = -1;
            var2.height = -2;
            var1.setAllowCollapse(false);
        }

    }

    public void setTransitioning(boolean var1) {
        this.field_503 = var1;
        int var2;
        if (var1) {
            var2 = 393216;
        } else {
            var2 = 262144;
        }

        this.setDescendantFocusability(var2);
    }

    public void setVisibility(int var1) {
        super.setVisibility(var1);
        boolean var2;
        if (var1 == 0) {
            var2 = true;
        } else {
            var2 = false;
        }

        if (this.field_498 != null) {
            this.field_498.setVisible(var2, false);
        }

        if (this.field_499 != null) {
            this.field_499.setVisible(var2, false);
        }

        if (this.field_500 != null) {
            this.field_500.setVisible(var2, false);
        }

    }

    public ActionMode startActionModeForChild(View var1, android.view.ActionMode.Callback var2) {
        return null;
    }

    public ActionMode startActionModeForChild(View var1, android.view.ActionMode.Callback var2, int var3) {
        ActionMode var4;
        if (var3 != 0) {
            var4 = super.startActionModeForChild(var1, var2, var3);
        } else {
            var4 = null;
        }

        return var4;
    }

    protected boolean verifyDrawable(Drawable var1) {
        boolean var2;
        if ((var1 != this.field_498 || this.field_501) && (var1 != this.field_499 || !this.field_502) && (var1 != this.field_500 || !this.field_501) && !super.verifyDrawable(var1)) {
            var2 = false;
        } else {
            var2 = true;
        }

        return var2;
    }
}
