package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.class_25;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;

// $FF: renamed from: android.support.v7.widget.v
public abstract class class_30 implements OnAttachStateChangeListener, OnTouchListener {
    // $FF: renamed from: a float
    private final float field_117;
    // $FF: renamed from: b int
    private final int field_118;
    // $FF: renamed from: c android.view.View
    final View field_119;
    // $FF: renamed from: d int
    private final int field_120;
    // $FF: renamed from: e java.lang.Runnable
    private Runnable field_121;
    // $FF: renamed from: f java.lang.Runnable
    private Runnable field_122;
    // $FF: renamed from: g boolean
    private boolean field_123;
    // $FF: renamed from: h int
    private int field_124;
    // $FF: renamed from: i int[]
    private final int[] field_125 = new int[2];

    public class_30(View var1) {
        this.field_119 = var1;
        var1.setLongClickable(true);
        var1.addOnAttachStateChangeListener(this);
        this.field_117 = (float)ViewConfiguration.get(var1.getContext()).getScaledTouchSlop();
        this.field_118 = ViewConfiguration.getTapTimeout();
        this.field_120 = (this.field_118 + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    // $FF: renamed from: a (android.view.MotionEvent) boolean
    private boolean method_229(MotionEvent var1) {
        boolean var4 = false;
        View var5 = this.field_119;
        boolean var3;
        if (!var5.isEnabled()) {
            var3 = var4;
        } else {
            switch(var1.getActionMasked()) {
            case 0:
                this.field_124 = var1.getPointerId(0);
                if (this.field_121 == null) {
                    this.field_121 = new v$a(this);
                }

                var5.postDelayed(this.field_121, (long)this.field_118);
                if (this.field_122 == null) {
                    this.field_122 = new v$b(this);
                }

                var5.postDelayed(this.field_122, (long)this.field_120);
                var3 = var4;
                break;
            case 1:
            case 3:
                this.method_234();
                var3 = var4;
                break;
            case 2:
                int var2 = var1.findPointerIndex(this.field_124);
                var3 = var4;
                if (var2 >= 0) {
                    var3 = var4;
                    if (!method_230(var5, var1.getX(var2), var1.getY(var2), this.field_117)) {
                        this.method_234();
                        var5.getParent().requestDisallowInterceptTouchEvent(true);
                        var3 = true;
                    }
                }
                break;
            default:
                var3 = var4;
            }
        }

        return var3;
    }

    // $FF: renamed from: a (android.view.View, float, float, float) boolean
    private static boolean method_230(View var0, float var1, float var2, float var3) {
        boolean var4;
        if (var1 >= -var3 && var2 >= -var3 && var1 < (float)(var0.getRight() - var0.getLeft()) + var3 && var2 < (float)(var0.getBottom() - var0.getTop()) + var3) {
            var4 = true;
        } else {
            var4 = false;
        }

        return var4;
    }

    // $FF: renamed from: a (android.view.View, android.view.MotionEvent) boolean
    private boolean method_231(View var1, MotionEvent var2) {
        int[] var3 = this.field_125;
        var1.getLocationOnScreen(var3);
        var2.offsetLocation((float)(-var3[0]), (float)(-var3[1]));
        return true;
    }

    // $FF: renamed from: b (android.view.MotionEvent) boolean
    private boolean method_232(MotionEvent var1) {
        View var4 = this.field_119;
        class_25 var5 = this.method_235();
        boolean var3;
        if (var5 != null) {
            if (!var5.method_149()) {
                var3 = false;
                return var3;
            }

            class_66 var8 = (class_66)var5.method_150();
            if (var8 != null && var8.isShown()) {
                MotionEvent var6 = MotionEvent.obtainNoHistory(var1);
                this.method_233(var4, var6);
                this.method_231(var8, var6);
                var3 = var8.method_654(var6, this.field_124);
                var6.recycle();
                int var2 = var1.getActionMasked();
                boolean var7;
                if (var2 != 1 && var2 != 3) {
                    var7 = true;
                } else {
                    var7 = false;
                }

                if (var3 && var7) {
                    var3 = true;
                } else {
                    var3 = false;
                }

                return var3;
            }
        }

        var3 = false;
        return var3;
    }

    // $FF: renamed from: b (android.view.View, android.view.MotionEvent) boolean
    private boolean method_233(View var1, MotionEvent var2) {
        int[] var3 = this.field_125;
        var1.getLocationOnScreen(var3);
        var2.offsetLocation((float)var3[0], (float)var3[1]);
        return true;
    }

    // $FF: renamed from: e () void
    private void method_234() {
        if (this.field_122 != null) {
            this.field_119.removeCallbacks(this.field_122);
        }

        if (this.field_121 != null) {
            this.field_119.removeCallbacks(this.field_121);
        }

    }

    // $FF: renamed from: a () android.support.v7.view.menu.q
    public abstract class_25 method_235();

    // $FF: renamed from: b () boolean
    protected boolean method_236() {
        class_25 var1 = this.method_235();
        if (var1 != null && !var1.method_149()) {
            var1.method_147();
        }

        return true;
    }

    // $FF: renamed from: c () boolean
    protected boolean method_237() {
        class_25 var1 = this.method_235();
        if (var1 != null && var1.method_149()) {
            var1.method_148();
        }

        return true;
    }

    // $FF: renamed from: d () void
    void method_238() {
        this.method_234();
        View var4 = this.field_119;
        if (var4.isEnabled() && !var4.isLongClickable() && this.method_236()) {
            var4.getParent().requestDisallowInterceptTouchEvent(true);
            long var1 = SystemClock.uptimeMillis();
            MotionEvent var3 = MotionEvent.obtain(var1, var1, 3, 0.0F, 0.0F, 0);
            var4.onTouchEvent(var3);
            var3.recycle();
            this.field_123 = true;
        }

    }

    public boolean onTouch(View var1, MotionEvent var2) {
        boolean var4 = false;
        boolean var5 = this.field_123;
        boolean var3;
        if (var5) {
            if (!this.method_232(var2) && this.method_237()) {
                var3 = false;
            } else {
                var3 = true;
            }
        } else {
            if (this.method_229(var2) && this.method_236()) {
                var3 = true;
            } else {
                var3 = false;
            }

            if (var3) {
                long var6 = SystemClock.uptimeMillis();
                MotionEvent var8 = MotionEvent.obtain(var6, var6, 3, 0.0F, 0.0F, 0);
                this.field_119.onTouchEvent(var8);
                var8.recycle();
            }
        }

        this.field_123 = var3;
        if (!var3) {
            var3 = var4;
            if (!var5) {
                return var3;
            }
        }

        var3 = true;
        return var3;
    }

    public void onViewAttachedToWindow(View var1) {
    }

    public void onViewDetachedFromWindow(View var1) {
        this.field_123 = false;
        this.field_124 = -1;
        if (this.field_121 != null) {
            this.field_119.removeCallbacks(this.field_121);
        }

    }
}
