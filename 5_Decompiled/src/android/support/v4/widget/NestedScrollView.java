package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.h.class_144;
import android.support.v4.h.class_146;
import android.support.v4.h.class_147;
import android.support.v4.h.class_17;
import android.support.v4.h.class_19;
import android.support.v4.h.class_42;
import android.support.v4.h.a.class_173;
import android.support.v4.h.a.class_175;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements class_17, class_19 {
    // $FF: renamed from: w android.support.v4.widget.NestedScrollView$a
    private static final NestedScrollView.class_226 field_220 = new NestedScrollView.class_226();
    // $FF: renamed from: x int[]
    private static final int[] field_221 = new int[]{16843130};
    // $FF: renamed from: A float
    private float field_222;
    // $FF: renamed from: B android.support.v4.widget.NestedScrollView$b
    private NestedScrollView.class_227 field_223;
    // $FF: renamed from: a long
    private long field_224;
    // $FF: renamed from: b android.graphics.Rect
    private final Rect field_225;
    // $FF: renamed from: c android.widget.OverScroller
    private OverScroller field_226;
    // $FF: renamed from: d android.widget.EdgeEffect
    private EdgeEffect field_227;
    // $FF: renamed from: e android.widget.EdgeEffect
    private EdgeEffect field_228;
    // $FF: renamed from: f int
    private int field_229;
    // $FF: renamed from: g boolean
    private boolean field_230;
    // $FF: renamed from: h boolean
    private boolean field_231;
    // $FF: renamed from: i android.view.View
    private View field_232;
    // $FF: renamed from: j boolean
    private boolean field_233;
    // $FF: renamed from: k android.view.VelocityTracker
    private VelocityTracker field_234;
    // $FF: renamed from: l boolean
    private boolean field_235;
    // $FF: renamed from: m boolean
    private boolean field_236;
    // $FF: renamed from: n int
    private int field_237;
    // $FF: renamed from: o int
    private int field_238;
    // $FF: renamed from: p int
    private int field_239;
    // $FF: renamed from: q int
    private int field_240;
    // $FF: renamed from: r int[]
    private final int[] field_241;
    // $FF: renamed from: s int[]
    private final int[] field_242;
    // $FF: renamed from: t int
    private int field_243;
    // $FF: renamed from: u int
    private int field_244;
    // $FF: renamed from: v android.support.v4.widget.NestedScrollView$c
    private NestedScrollView.class_228 field_245;
    // $FF: renamed from: y android.support.v4.h.l
    private final class_144 field_246;
    // $FF: renamed from: z android.support.v4.h.i
    private final class_147 field_247;

    public NestedScrollView(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public NestedScrollView(Context var1, AttributeSet var2) {
        this(var1, var2, 0);
    }

    public NestedScrollView(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        this.field_225 = new Rect();
        this.field_230 = true;
        this.field_231 = false;
        this.field_232 = null;
        this.field_233 = false;
        this.field_236 = true;
        this.field_240 = -1;
        this.field_241 = new int[2];
        this.field_242 = new int[2];
        this.method_313();
        TypedArray var4 = var1.obtainStyledAttributes(var2, field_221, var3, 0);
        this.setFillViewport(var4.getBoolean(0, false));
        var4.recycle();
        this.field_246 = new class_144(this);
        this.field_247 = new class_147(this);
        this.setNestedScrollingEnabled(true);
        class_146.method_1219(this, field_220);
    }

    // $FF: renamed from: a (boolean, int, int) android.view.View
    private View method_312(boolean var1, int var2, int var3) {
        ArrayList var12 = this.getFocusables(2);
        View var10 = null;
        int var8 = var12.size();
        int var6 = 0;

        for(boolean var4 = false; var6 < var8; ++var6) {
            View var11 = (View)var12.get(var6);
            int var7 = var11.getTop();
            int var9 = var11.getBottom();
            if (var2 < var9 && var7 < var3) {
                boolean var5;
                if (var2 < var7 && var9 < var3) {
                    var5 = true;
                } else {
                    var5 = false;
                }

                if (var10 == null) {
                    var4 = var5;
                    var10 = var11;
                } else {
                    boolean var13;
                    if ((!var1 || var7 >= var10.getTop()) && (var1 || var9 <= var10.getBottom())) {
                        var13 = false;
                    } else {
                        var13 = true;
                    }

                    if (var4) {
                        if (var5 && var13) {
                            var10 = var11;
                        }
                    } else if (var5) {
                        var4 = true;
                        var10 = var11;
                    } else if (var13) {
                        var10 = var11;
                    }
                }
            }
        }

        return var10;
    }

    // $FF: renamed from: a () void
    private void method_313() {
        this.field_226 = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(262144);
        this.setWillNotDraw(false);
        ViewConfiguration var1 = ViewConfiguration.get(this.getContext());
        this.field_237 = var1.getScaledTouchSlop();
        this.field_238 = var1.getScaledMinimumFlingVelocity();
        this.field_239 = var1.getScaledMaximumFlingVelocity();
    }

    // $FF: renamed from: a (android.view.MotionEvent) void
    private void method_314(MotionEvent var1) {
        int var2 = var1.getActionIndex();
        if (var1.getPointerId(var2) == this.field_240) {
            byte var3;
            if (var2 == 0) {
                var3 = 1;
            } else {
                var3 = 0;
            }

            this.field_229 = (int)var1.getY(var3);
            this.field_240 = var1.getPointerId(var3);
            if (this.field_234 != null) {
                this.field_234.clear();
            }
        }

    }

    // $FF: renamed from: a (int, int, int) boolean
    private boolean method_315(int var1, int var2, int var3) {
        boolean var7 = false;
        int var5 = this.getHeight();
        int var4 = this.getScrollY();
        var5 += var4;
        boolean var6;
        if (var1 == 33) {
            var6 = true;
        } else {
            var6 = false;
        }

        View var9 = this.method_312(var6, var2, var3);
        Object var8 = var9;
        if (var9 == null) {
            var8 = this;
        }

        if (var2 >= var4 && var3 <= var5) {
            var6 = var7;
        } else {
            if (var6) {
                var2 -= var4;
            } else {
                var2 = var3 - var5;
            }

            this.method_329(var2);
            var6 = true;
        }

        if (var8 != this.findFocus()) {
            ((View)var8).requestFocus(var1);
        }

        return var6;
    }

    // $FF: renamed from: a (android.graphics.Rect, boolean) boolean
    private boolean method_316(Rect var1, boolean var2) {
        int var3 = this.method_331(var1);
        boolean var4;
        if (var3 != 0) {
            var4 = true;
        } else {
            var4 = false;
        }

        if (var4) {
            if (var2) {
                this.scrollBy(0, var3);
            } else {
                this.method_338(0, var3);
            }
        }

        return var4;
    }

    // $FF: renamed from: a (android.view.View) boolean
    private boolean method_317(View var1) {
        boolean var2 = false;
        if (!this.method_318(var1, 0, this.getHeight())) {
            var2 = true;
        }

        return var2;
    }

    // $FF: renamed from: a (android.view.View, int, int) boolean
    private boolean method_318(View var1, int var2, int var3) {
        var1.getDrawingRect(this.field_225);
        this.offsetDescendantRectToMyCoords(var1, this.field_225);
        boolean var4;
        if (this.field_225.bottom + var2 >= this.getScrollY() && this.field_225.top - var2 <= this.getScrollY() + var3) {
            var4 = true;
        } else {
            var4 = false;
        }

        return var4;
    }

    // $FF: renamed from: a (android.view.View, android.view.View) boolean
    private static boolean method_319(View var0, View var1) {
        boolean var2;
        if (var0 == var1) {
            var2 = true;
        } else {
            ViewParent var3 = var0.getParent();
            if (var3 instanceof ViewGroup && method_319((View)var3, var1)) {
                var2 = true;
            } else {
                var2 = false;
            }
        }

        return var2;
    }

    // $FF: renamed from: b (int, int, int) int
    private static int method_320(int var0, int var1, int var2) {
        int var3;
        if (var1 < var2 && var0 >= 0) {
            var3 = var0;
            if (var1 + var0 > var2) {
                var3 = var2 - var1;
            }
        } else {
            var3 = 0;
        }

        return var3;
    }

    // $FF: renamed from: b (android.view.View) void
    private void method_321(View var1) {
        var1.getDrawingRect(this.field_225);
        this.offsetDescendantRectToMyCoords(var1, this.field_225);
        int var2 = this.method_331(this.field_225);
        if (var2 != 0) {
            this.scrollBy(0, var2);
        }

    }

    // $FF: renamed from: b () boolean
    private boolean method_322() {
        boolean var3 = false;
        View var4 = this.getChildAt(0);
        boolean var2 = var3;
        if (var4 != null) {
            int var1 = var4.getHeight();
            var2 = var3;
            if (this.getHeight() < var1 + this.getPaddingTop() + this.getPaddingBottom()) {
                var2 = true;
            }
        }

        return var2;
    }

    // $FF: renamed from: c () void
    private void method_323() {
        if (this.field_234 == null) {
            this.field_234 = VelocityTracker.obtain();
        } else {
            this.field_234.clear();
        }

    }

    // $FF: renamed from: d () void
    private void method_324() {
        if (this.field_234 == null) {
            this.field_234 = VelocityTracker.obtain();
        }

    }

    // $FF: renamed from: d (int, int) boolean
    private boolean method_325(int var1, int var2) {
        boolean var5 = false;
        boolean var4 = var5;
        if (this.getChildCount() > 0) {
            int var3 = this.getScrollY();
            View var6 = this.getChildAt(0);
            var4 = var5;
            if (var2 >= var6.getTop() - var3) {
                var4 = var5;
                if (var2 < var6.getBottom() - var3) {
                    var4 = var5;
                    if (var1 >= var6.getLeft()) {
                        var4 = var5;
                        if (var1 < var6.getRight()) {
                            var4 = true;
                        }
                    }
                }
            }
        }

        return var4;
    }

    // $FF: renamed from: e () void
    private void method_326() {
        if (this.field_234 != null) {
            this.field_234.recycle();
            this.field_234 = null;
        }

    }

    // $FF: renamed from: f () void
    private void method_327() {
        this.field_233 = false;
        this.method_326();
        this.method_332(0);
        if (this.field_227 != null) {
            this.field_227.onRelease();
            this.field_228.onRelease();
        }

    }

    // $FF: renamed from: g () void
    private void method_328() {
        if (this.getOverScrollMode() != 2) {
            if (this.field_227 == null) {
                Context var1 = this.getContext();
                this.field_227 = new EdgeEffect(var1);
                this.field_228 = new EdgeEffect(var1);
            }
        } else {
            this.field_227 = null;
            this.field_228 = null;
        }

    }

    // $FF: renamed from: g (int) void
    private void method_329(int var1) {
        if (var1 != 0) {
            if (this.field_236) {
                this.method_338(0, var1);
            } else {
                this.scrollBy(0, var1);
            }
        }

    }

    private float getVerticalScrollFactorCompat() {
        if (this.field_222 == 0.0F) {
            TypedValue var1 = new TypedValue();
            Context var2 = this.getContext();
            if (!var2.getTheme().resolveAttribute(16842829, var1, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }

            this.field_222 = var1.getDimension(var2.getResources().getDisplayMetrics());
        }

        return this.field_222;
    }

    // $FF: renamed from: h (int) void
    private void method_330(int var1) {
        int var2 = this.getScrollY();
        boolean var3;
        if (var2 <= 0 && var1 <= 0 || var2 >= this.getScrollRange() && var1 >= 0) {
            var3 = false;
        } else {
            var3 = true;
        }

        if (!this.dispatchNestedPreFling(0.0F, (float)var1)) {
            this.dispatchNestedFling(0.0F, (float)var1, var3);
            this.method_344(var1);
        }

    }

    // $FF: renamed from: a (android.graphics.Rect) int
    protected int method_331(Rect var1) {
        byte var5 = 0;
        int var2;
        if (this.getChildCount() == 0) {
            var2 = var5;
        } else {
            int var6 = this.getHeight();
            int var3 = this.getScrollY();
            var2 = var3 + var6;
            int var7 = this.getVerticalFadingEdgeLength();
            int var4 = var3;
            if (var1.top > 0) {
                var4 = var3 + var7;
            }

            var3 = var2;
            if (var1.bottom < this.getChildAt(0).getHeight()) {
                var3 = var2 - var7;
            }

            if (var1.bottom > var3 && var1.top > var4) {
                if (var1.height() > var6) {
                    var2 = var1.top - var4 + 0;
                } else {
                    var2 = var1.bottom - var3 + 0;
                }

                var2 = Math.min(var2, this.getChildAt(0).getBottom() - var3);
            } else {
                var2 = var5;
                if (var1.top < var4) {
                    var2 = var5;
                    if (var1.bottom < var3) {
                        if (var1.height() > var6) {
                            var2 = 0 - (var3 - var1.bottom);
                        } else {
                            var2 = 0 - (var4 - var1.top);
                        }

                        var2 = Math.max(var2, -this.getScrollY());
                    }
                }
            }
        }

        return var2;
    }

    // $FF: renamed from: a (int) void
    public void method_332(int var1) {
        this.field_247.method_1245(var1);
    }

    // $FF: renamed from: a (int, int) boolean
    public boolean method_333(int var1, int var2) {
        return this.field_247.method_1237(var1, var2);
    }

    // $FF: renamed from: a (int, int, int, int, int, int, int, int, boolean) boolean
    boolean method_334(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
        int var12 = this.getOverScrollMode();
        boolean var10;
        if (this.computeHorizontalScrollRange() > this.computeHorizontalScrollExtent()) {
            var10 = true;
        } else {
            var10 = false;
        }

        boolean var11;
        if (this.computeVerticalScrollRange() > this.computeVerticalScrollExtent()) {
            var11 = true;
        } else {
            var11 = false;
        }

        if (var12 != 0 && (var12 != 1 || !var10)) {
            var10 = false;
        } else {
            var10 = true;
        }

        if (var12 != 0 && (var12 != 1 || !var11)) {
            var11 = false;
        } else {
            var11 = true;
        }

        var1 += var3;
        if (!var10) {
            var7 = 0;
        }

        var2 += var4;
        if (!var11) {
            var8 = 0;
        }

        var4 = -var7;
        var7 += var5;
        var3 = -var8;
        var5 = var8 + var6;
        if (var1 > var7) {
            var9 = true;
            var1 = var7;
        } else if (var1 < var4) {
            var9 = true;
            var1 = var4;
        } else {
            var9 = false;
        }

        boolean var13;
        if (var2 > var5) {
            var13 = true;
            var2 = var5;
        } else if (var2 < var3) {
            var13 = true;
            var2 = var3;
        } else {
            var13 = false;
        }

        if (var13 && !this.method_339(1)) {
            this.field_226.springBack(var1, var2, 0, 0, 0, this.getScrollRange());
        }

        this.onOverScrolled(var1, var2, var9, var13);
        if (!var9 && !var13) {
            var9 = false;
        } else {
            var9 = true;
        }

        return var9;
    }

    // $FF: renamed from: a (int, int, int, int, int[], int) boolean
    public boolean method_335(int var1, int var2, int var3, int var4, int[] var5, int var6) {
        return this.field_247.method_1239(var1, var2, var3, var4, var5, var6);
    }

    // $FF: renamed from: a (int, int, int[], int[], int) boolean
    public boolean method_336(int var1, int var2, int[] var3, int[] var4, int var5) {
        return this.field_247.method_1241(var1, var2, var3, var4, var5);
    }

    // $FF: renamed from: a (android.view.KeyEvent) boolean
    public boolean method_337(KeyEvent var1) {
        short var2 = 33;
        this.field_225.setEmpty();
        boolean var3;
        if (!this.method_322()) {
            if (this.isFocused() && var1.getKeyCode() != 4) {
                View var4 = this.findFocus();
                View var5 = var4;
                if (var4 == this) {
                    var5 = null;
                }

                var5 = FocusFinder.getInstance().findNextFocus(this, var5, 130);
                if (var5 != null && var5 != this && var5.requestFocus(130)) {
                    var3 = true;
                } else {
                    var3 = false;
                }

                return var3;
            }
        } else if (var1.getAction() == 0) {
            switch(var1.getKeyCode()) {
            case 19:
                if (!var1.isAltPressed()) {
                    var3 = this.method_343(33);
                } else {
                    var3 = this.method_342(33);
                }

                return var3;
            case 20:
                if (!var1.isAltPressed()) {
                    var3 = this.method_343(130);
                } else {
                    var3 = this.method_342(130);
                }

                return var3;
            case 62:
                if (!var1.isShiftPressed()) {
                    var2 = 130;
                }

                this.method_341(var2);
                var3 = false;
                return var3;
            default:
                var3 = false;
                return var3;
            }
        }

        var3 = false;
        return var3;
    }

    public void addView(View var1) {
        if (this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(var1);
        }
    }

    public void addView(View var1, int var2) {
        if (this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(var1, var2);
        }
    }

    public void addView(View var1, int var2, LayoutParams var3) {
        if (this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(var1, var2, var3);
        }
    }

    public void addView(View var1, LayoutParams var2) {
        if (this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(var1, var2);
        }
    }

    // $FF: renamed from: b (int, int) void
    public final void method_338(int var1, int var2) {
        if (this.getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.field_224 > 250L) {
                var1 = this.getHeight();
                int var4 = this.getPaddingBottom();
                int var3 = this.getPaddingTop();
                var3 = Math.max(0, this.getChildAt(0).getHeight() - (var1 - var4 - var3));
                var1 = this.getScrollY();
                var2 = Math.max(0, Math.min(var1 + var2, var3));
                this.field_226.startScroll(this.getScrollX(), var1, 0, var2 - var1);
                class_146.method_1215(this);
            } else {
                if (!this.field_226.isFinished()) {
                    this.field_226.abortAnimation();
                }

                this.scrollBy(var1, var2);
            }

            this.field_224 = AnimationUtils.currentAnimationTimeMillis();
        }

    }

    // $FF: renamed from: b (int) boolean
    public boolean method_339(int var1) {
        return this.field_247.method_1236(var1);
    }

    // $FF: renamed from: c (int, int) void
    public final void method_340(int var1, int var2) {
        this.method_338(var1 - this.getScrollX(), var2 - this.getScrollY());
    }

    // $FF: renamed from: c (int) boolean
    public boolean method_341(int var1) {
        boolean var2;
        if (var1 == 130) {
            var2 = true;
        } else {
            var2 = false;
        }

        int var3 = this.getHeight();
        if (var2) {
            this.field_225.top = this.getScrollY() + var3;
            int var5 = this.getChildCount();
            if (var5 > 0) {
                View var4 = this.getChildAt(var5 - 1);
                if (this.field_225.top + var3 > var4.getBottom()) {
                    this.field_225.top = var4.getBottom() - var3;
                }
            }
        } else {
            this.field_225.top = this.getScrollY() - var3;
            if (this.field_225.top < 0) {
                this.field_225.top = 0;
            }
        }

        this.field_225.bottom = this.field_225.top + var3;
        return this.method_315(var1, this.field_225.top, this.field_225.bottom);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (this.field_226.computeScrollOffset()) {
            this.field_226.getCurrX();
            int var3 = this.field_226.getCurrY();
            int var2 = var3 - this.field_244;
            int var1 = var2;
            if (this.method_336(0, var2, this.field_242, (int[])null, 1)) {
                var1 = var2 - this.field_242[1];
            }

            if (var1 != 0) {
                int var4 = this.getScrollRange();
                var2 = this.getScrollY();
                this.method_334(0, var1, this.getScrollX(), var2, 0, var4, 0, 0, false);
                int var5 = this.getScrollY() - var2;
                if (!this.method_335(0, var5, 0, var1 - var5, (int[])null, 1)) {
                    var1 = this.getOverScrollMode();
                    boolean var6;
                    if (var1 == 0 || var1 == 1 && var4 > 0) {
                        var6 = true;
                    } else {
                        var6 = false;
                    }

                    if (var6) {
                        this.method_328();
                        if (var3 <= 0 && var2 > 0) {
                            this.field_227.onAbsorb((int)this.field_226.getCurrVelocity());
                        } else if (var3 >= var4 && var2 < var4) {
                            this.field_228.onAbsorb((int)this.field_226.getCurrVelocity());
                        }
                    }
                }
            }

            this.field_244 = var3;
            class_146.method_1215(this);
        } else {
            if (this.method_339(1)) {
                this.method_332(1);
            }

            this.field_244 = 0;
        }

    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int var2 = this.getChildCount();
        int var1 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if (var2 != 0) {
            var2 = this.getChildAt(0).getBottom();
            int var3 = this.getScrollY();
            int var4 = Math.max(0, var2 - var1);
            if (var3 < 0) {
                var1 = var2 - var3;
            } else {
                var1 = var2;
                if (var3 > var4) {
                    var1 = var2 + (var3 - var4);
                }
            }
        }

        return var1;
    }

    // $FF: renamed from: d (int) boolean
    public boolean method_342(int var1) {
        boolean var2;
        if (var1 == 130) {
            var2 = true;
        } else {
            var2 = false;
        }

        int var3 = this.getHeight();
        this.field_225.top = 0;
        this.field_225.bottom = var3;
        if (var2) {
            int var5 = this.getChildCount();
            if (var5 > 0) {
                View var4 = this.getChildAt(var5 - 1);
                this.field_225.bottom = var4.getBottom() + this.getPaddingBottom();
                this.field_225.top = this.field_225.bottom - var3;
            }
        }

        return this.method_315(var1, this.field_225.top, this.field_225.bottom);
    }

    public boolean dispatchKeyEvent(KeyEvent var1) {
        boolean var2;
        if (!super.dispatchKeyEvent(var1) && !this.method_337(var1)) {
            var2 = false;
        } else {
            var2 = true;
        }

        return var2;
    }

    public boolean dispatchNestedFling(float var1, float var2, boolean var3) {
        return this.field_247.method_1235(var1, var2, var3);
    }

    public boolean dispatchNestedPreFling(float var1, float var2) {
        return this.field_247.method_1234(var1, var2);
    }

    public boolean dispatchNestedPreScroll(int var1, int var2, int[] var3, int[] var4) {
        return this.field_247.method_1240(var1, var2, var3, var4);
    }

    public boolean dispatchNestedScroll(int var1, int var2, int var3, int var4, int[] var5) {
        return this.field_247.method_1238(var1, var2, var3, var4, var5);
    }

    public void draw(Canvas var1) {
        super.draw(var1);
        if (this.field_227 != null) {
            int var2 = this.getScrollY();
            int var3;
            int var4;
            int var5;
            if (!this.field_227.isFinished()) {
                int var6 = var1.save();
                var4 = this.getWidth();
                var3 = this.getPaddingLeft();
                var5 = this.getPaddingRight();
                var1.translate((float)this.getPaddingLeft(), (float)Math.min(0, var2));
                this.field_227.setSize(var4 - var3 - var5, this.getHeight());
                if (this.field_227.draw(var1)) {
                    class_146.method_1215(this);
                }

                var1.restoreToCount(var6);
            }

            if (!this.field_228.isFinished()) {
                var4 = var1.save();
                var3 = this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
                var5 = this.getHeight();
                var1.translate((float)(-var3 + this.getPaddingLeft()), (float)(Math.max(this.getScrollRange(), var2) + var5));
                var1.rotate(180.0F, (float)var3, 0.0F);
                this.field_228.setSize(var3, var5);
                if (this.field_228.draw(var1)) {
                    class_146.method_1215(this);
                }

                var1.restoreToCount(var4);
            }
        }

    }

    // $FF: renamed from: e (int) boolean
    public boolean method_343(int var1) {
        View var8 = this.findFocus();
        View var7 = var8;
        if (var8 == this) {
            var7 = null;
        }

        var8 = FocusFinder.getInstance().findNextFocus(this, var7, var1);
        int var3 = this.getMaxScrollAmount();
        boolean var6;
        if (var8 != null && this.method_318(var8, var3, this.getHeight())) {
            var8.getDrawingRect(this.field_225);
            this.offsetDescendantRectToMyCoords(var8, this.field_225);
            this.method_329(this.method_331(this.field_225));
            var8.requestFocus(var1);
        } else {
            int var2;
            if (var1 == 33 && this.getScrollY() < var3) {
                var2 = this.getScrollY();
            } else {
                var2 = var3;
                if (var1 == 130) {
                    var2 = var3;
                    if (this.getChildCount() > 0) {
                        int var5 = this.getChildAt(0).getBottom();
                        int var4 = this.getScrollY() + this.getHeight() - this.getPaddingBottom();
                        var2 = var3;
                        if (var5 - var4 < var3) {
                            var2 = var5 - var4;
                        }
                    }
                }
            }

            if (var2 == 0) {
                var6 = false;
                return var6;
            }

            if (var1 == 130) {
                var1 = var2;
            } else {
                var1 = -var2;
            }

            this.method_329(var1);
        }

        if (var7 != null && var7.isFocused() && this.method_317(var7)) {
            var1 = this.getDescendantFocusability();
            this.setDescendantFocusability(131072);
            this.requestFocus();
            this.setDescendantFocusability(var1);
        }

        var6 = true;
        return var6;
    }

    // $FF: renamed from: f (int) void
    public void method_344(int var1) {
        if (this.getChildCount() > 0) {
            this.method_333(2, 1);
            this.field_226.fling(this.getScrollX(), this.getScrollY(), 0, var1, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.field_244 = this.getScrollY();
            class_146.method_1215(this);
        }

    }

    protected float getBottomFadingEdgeStrength() {
        float var1;
        if (this.getChildCount() == 0) {
            var1 = 0.0F;
        } else {
            int var2 = this.getVerticalFadingEdgeLength();
            int var4 = this.getHeight();
            int var3 = this.getPaddingBottom();
            var3 = this.getChildAt(0).getBottom() - this.getScrollY() - (var4 - var3);
            if (var3 < var2) {
                var1 = (float)var3 / (float)var2;
            } else {
                var1 = 1.0F;
            }
        }

        return var1;
    }

    public int getMaxScrollAmount() {
        return (int)(0.5F * (float)this.getHeight());
    }

    public int getNestedScrollAxes() {
        return this.field_246.method_1203();
    }

    int getScrollRange() {
        int var1 = 0;
        if (this.getChildCount() > 0) {
            var1 = Math.max(0, this.getChildAt(0).getHeight() - (this.getHeight() - this.getPaddingBottom() - this.getPaddingTop()));
        }

        return var1;
    }

    protected float getTopFadingEdgeStrength() {
        float var1;
        if (this.getChildCount() == 0) {
            var1 = 0.0F;
        } else {
            int var3 = this.getVerticalFadingEdgeLength();
            int var2 = this.getScrollY();
            if (var2 < var3) {
                var1 = (float)var2 / (float)var3;
            } else {
                var1 = 1.0F;
            }
        }

        return var1;
    }

    public boolean hasNestedScrollingParent() {
        return this.field_247.method_1242();
    }

    public boolean isNestedScrollingEnabled() {
        return this.field_247.method_1233();
    }

    protected void measureChild(View var1, int var2, int var3) {
        LayoutParams var4 = var1.getLayoutParams();
        var1.measure(getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight(), var4.width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View var1, int var2, int var3, int var4, int var5) {
        MarginLayoutParams var6 = (MarginLayoutParams)var1.getLayoutParams();
        var2 = getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight() + var6.leftMargin + var6.rightMargin + var3, var6.width);
        var3 = var6.topMargin;
        var1.measure(var2, MeasureSpec.makeMeasureSpec(var6.bottomMargin + var3, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.field_231 = false;
    }

    public boolean onGenericMotionEvent(MotionEvent var1) {
        boolean var8 = false;
        boolean var7 = var8;
        if ((var1.getSource() & 2) != 0) {
            switch(var1.getAction()) {
            case 8:
                var7 = var8;
                if (!this.field_233) {
                    float var2 = var1.getAxisValue(9);
                    var7 = var8;
                    if (var2 != 0.0F) {
                        int var3 = (int)(var2 * this.getVerticalScrollFactorCompat());
                        int var4 = this.getScrollRange();
                        int var6 = this.getScrollY();
                        int var5 = var6 - var3;
                        if (var5 < 0) {
                            var3 = 0;
                        } else {
                            var3 = var5;
                            if (var5 > var4) {
                                var3 = var4;
                            }
                        }

                        var7 = var8;
                        if (var3 != var6) {
                            super.scrollTo(this.getScrollX(), var3);
                            var7 = true;
                        }
                    }
                }
                break;
            default:
                var7 = var8;
            }
        }

        return var7;
    }

    public boolean onInterceptTouchEvent(MotionEvent var1) {
        boolean var5 = true;
        boolean var4 = true;
        int var2 = var1.getAction();
        if (var2 != 2 || !this.field_233) {
            switch(var2 & 255) {
            case 0:
                var2 = (int)var1.getY();
                if (!this.method_325((int)var1.getX(), var2)) {
                    this.field_233 = false;
                    this.method_326();
                } else {
                    this.field_229 = var2;
                    this.field_240 = var1.getPointerId(0);
                    this.method_323();
                    this.field_234.addMovement(var1);
                    this.field_226.computeScrollOffset();
                    if (!this.field_226.isFinished()) {
                        var4 = var5;
                    } else {
                        var4 = false;
                    }

                    this.field_233 = var4;
                    this.method_333(2, 0);
                }
                break;
            case 1:
            case 3:
                this.field_233 = false;
                this.field_240 = -1;
                this.method_326();
                if (this.field_226.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                    class_146.method_1215(this);
                }

                this.method_332(0);
                break;
            case 2:
                var2 = this.field_240;
                if (var2 != -1) {
                    int var3 = var1.findPointerIndex(var2);
                    if (var3 == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + var2 + " in onInterceptTouchEvent");
                    } else {
                        var2 = (int)var1.getY(var3);
                        if (Math.abs(var2 - this.field_229) > this.field_237 && (this.getNestedScrollAxes() & 2) == 0) {
                            this.field_233 = true;
                            this.field_229 = var2;
                            this.method_324();
                            this.field_234.addMovement(var1);
                            this.field_243 = 0;
                            ViewParent var6 = this.getParent();
                            if (var6 != null) {
                                var6.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
            case 4:
            case 5:
            default:
                break;
            case 6:
                this.method_314(var1);
            }

            var4 = this.field_233;
        }

        return var4;
    }

    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        super.onLayout(var1, var2, var3, var4, var5);
        this.field_230 = false;
        if (this.field_232 != null && method_319(this.field_232, this)) {
            this.method_321(this.field_232);
        }

        this.field_232 = null;
        if (!this.field_231) {
            if (this.field_245 != null) {
                this.scrollTo(this.getScrollX(), this.field_245.field_355);
                this.field_245 = null;
            }

            if (this.getChildCount() > 0) {
                var2 = this.getChildAt(0).getMeasuredHeight();
            } else {
                var2 = 0;
            }

            var2 = Math.max(0, var2 - (var5 - var3 - this.getPaddingBottom() - this.getPaddingTop()));
            if (this.getScrollY() > var2) {
                this.scrollTo(this.getScrollX(), var2);
            } else if (this.getScrollY() < 0) {
                this.scrollTo(this.getScrollX(), 0);
            }
        }

        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.field_231 = true;
    }

    protected void onMeasure(int var1, int var2) {
        super.onMeasure(var1, var2);
        if (this.field_235 && MeasureSpec.getMode(var2) != 0 && this.getChildCount() > 0) {
            View var3 = this.getChildAt(0);
            var2 = this.getMeasuredHeight();
            if (var3.getMeasuredHeight() < var2) {
                android.widget.FrameLayout.LayoutParams var4 = (android.widget.FrameLayout.LayoutParams)var3.getLayoutParams();
                var3.measure(getChildMeasureSpec(var1, this.getPaddingLeft() + this.getPaddingRight(), var4.width), MeasureSpec.makeMeasureSpec(var2 - this.getPaddingTop() - this.getPaddingBottom(), 1073741824));
            }
        }

    }

    public boolean onNestedFling(View var1, float var2, float var3, boolean var4) {
        if (!var4) {
            this.method_330((int)var3);
            var4 = true;
        } else {
            var4 = false;
        }

        return var4;
    }

    public boolean onNestedPreFling(View var1, float var2, float var3) {
        return this.dispatchNestedPreFling(var2, var3);
    }

    public void onNestedPreScroll(View var1, int var2, int var3, int[] var4) {
        this.dispatchNestedPreScroll(var2, var3, var4, (int[])null);
    }

    public void onNestedScroll(View var1, int var2, int var3, int var4, int var5) {
        var2 = this.getScrollY();
        this.scrollBy(0, var5);
        var2 = this.getScrollY() - var2;
        this.dispatchNestedScroll(0, var2, 0, var5 - var2, (int[])null);
    }

    public void onNestedScrollAccepted(View var1, View var2, int var3) {
        this.field_246.method_1206(var1, var2, var3);
        this.startNestedScroll(2);
    }

    protected void onOverScrolled(int var1, int var2, boolean var3, boolean var4) {
        super.scrollTo(var1, var2);
    }

    protected boolean onRequestFocusInDescendants(int var1, Rect var2) {
        boolean var4 = false;
        int var3;
        if (var1 == 2) {
            var3 = 130;
        } else {
            var3 = var1;
            if (var1 == 1) {
                var3 = 33;
            }
        }

        View var5;
        if (var2 == null) {
            var5 = FocusFinder.getInstance().findNextFocus(this, (View)null, var3);
        } else {
            var5 = FocusFinder.getInstance().findNextFocusFromRect(this, var2, var3);
        }

        if (var5 != null && !this.method_317(var5)) {
            var4 = var5.requestFocus(var3, var2);
        }

        return var4;
    }

    protected void onRestoreInstanceState(Parcelable var1) {
        if (!(var1 instanceof NestedScrollView.class_228)) {
            super.onRestoreInstanceState(var1);
        } else {
            NestedScrollView.class_228 var2 = (NestedScrollView.class_228)var1;
            super.onRestoreInstanceState(var2.getSuperState());
            this.field_245 = var2;
            this.requestLayout();
        }

    }

    protected Parcelable onSaveInstanceState() {
        NestedScrollView.class_228 var1 = new NestedScrollView.class_228(super.onSaveInstanceState());
        var1.field_355 = this.getScrollY();
        return var1;
    }

    protected void onScrollChanged(int var1, int var2, int var3, int var4) {
        super.onScrollChanged(var1, var2, var3, var4);
        if (this.field_223 != null) {
            this.field_223.method_13(this, var1, var2, var3, var4);
        }

    }

    protected void onSizeChanged(int var1, int var2, int var3, int var4) {
        super.onSizeChanged(var1, var2, var3, var4);
        View var5 = this.findFocus();
        if (var5 != null && this != var5 && this.method_318(var5, 0, var4)) {
            var5.getDrawingRect(this.field_225);
            this.offsetDescendantRectToMyCoords(var5, this.field_225);
            this.method_329(this.method_331(this.field_225));
        }

    }

    public boolean onStartNestedScroll(View var1, View var2, int var3) {
        boolean var4;
        if ((var3 & 2) != 0) {
            var4 = true;
        } else {
            var4 = false;
        }

        return var4;
    }

    public void onStopNestedScroll(View var1) {
        this.field_246.method_1204(var1);
        this.stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent var1) {
        this.method_324();
        MotionEvent var9 = MotionEvent.obtain(var1);
        int var2 = var1.getActionMasked();
        if (var2 == 0) {
            this.field_243 = 0;
        }

        var9.offsetLocation(0.0F, (float)this.field_243);
        boolean var8;
        ViewParent var10;
        switch(var2) {
        case 0:
            if (this.getChildCount() == 0) {
                var8 = false;
                return var8;
            }

            if (!this.field_226.isFinished()) {
                var8 = true;
            } else {
                var8 = false;
            }

            this.field_233 = var8;
            if (var8) {
                var10 = this.getParent();
                if (var10 != null) {
                    var10.requestDisallowInterceptTouchEvent(true);
                }
            }

            if (!this.field_226.isFinished()) {
                this.field_226.abortAnimation();
            }

            this.field_229 = (int)var1.getY();
            this.field_240 = var1.getPointerId(0);
            this.method_333(2, 0);
            break;
        case 1:
            VelocityTracker var11 = this.field_234;
            var11.computeCurrentVelocity(1000, (float)this.field_239);
            var2 = (int)var11.getYVelocity(this.field_240);
            if (Math.abs(var2) > this.field_238) {
                this.method_330(-var2);
            } else if (this.field_226.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                class_146.method_1215(this);
            }

            this.field_240 = -1;
            this.method_327();
            break;
        case 2:
            int var4 = var1.findPointerIndex(this.field_240);
            if (var4 == -1) {
                Log.e("NestedScrollView", "Invalid pointerId=" + this.field_240 + " in onTouchEvent");
            } else {
                int var5 = (int)var1.getY(var4);
                var2 = this.field_229 - var5;
                int var3 = var2;
                if (this.method_336(0, var2, this.field_242, this.field_241, 0)) {
                    var3 = var2 - this.field_242[1];
                    var9.offsetLocation(0.0F, (float)this.field_241[1]);
                    this.field_243 += this.field_241[1];
                }

                var2 = var3;
                if (!this.field_233) {
                    var2 = var3;
                    if (Math.abs(var3) > this.field_237) {
                        var10 = this.getParent();
                        if (var10 != null) {
                            var10.requestDisallowInterceptTouchEvent(true);
                        }

                        this.field_233 = true;
                        if (var3 > 0) {
                            var2 = var3 - this.field_237;
                        } else {
                            var2 = var3 + this.field_237;
                        }
                    }
                }

                if (this.field_233) {
                    this.field_229 = var5 - this.field_241[1];
                    int var6 = this.getScrollY();
                    var5 = this.getScrollRange();
                    var3 = this.getOverScrollMode();
                    boolean var12;
                    if (var3 != 0 && (var3 != 1 || var5 <= 0)) {
                        var12 = false;
                    } else {
                        var12 = true;
                    }

                    if (this.method_334(0, var2, 0, this.getScrollY(), 0, var5, 0, 0, true) && !this.method_339(0)) {
                        this.field_234.clear();
                    }

                    int var7 = this.getScrollY() - var6;
                    if (this.method_335(0, var7, 0, var2 - var7, this.field_241, 0)) {
                        this.field_229 -= this.field_241[1];
                        var9.offsetLocation(0.0F, (float)this.field_241[1]);
                        this.field_243 += this.field_241[1];
                    } else if (var12) {
                        this.method_328();
                        var3 = var6 + var2;
                        if (var3 < 0) {
                            class_155.method_1285(this.field_227, (float)var2 / (float)this.getHeight(), var1.getX(var4) / (float)this.getWidth());
                            if (!this.field_228.isFinished()) {
                                this.field_228.onRelease();
                            }
                        } else if (var3 > var5) {
                            class_155.method_1285(this.field_228, (float)var2 / (float)this.getHeight(), 1.0F - var1.getX(var4) / (float)this.getWidth());
                            if (!this.field_227.isFinished()) {
                                this.field_227.onRelease();
                            }
                        }

                        if (this.field_227 != null && (!this.field_227.isFinished() || !this.field_228.isFinished())) {
                            class_146.method_1215(this);
                        }
                    }
                }
            }
            break;
        case 3:
            if (this.field_233 && this.getChildCount() > 0 && this.field_226.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                class_146.method_1215(this);
            }

            this.field_240 = -1;
            this.method_327();
        case 4:
        default:
            break;
        case 5:
            var2 = var1.getActionIndex();
            this.field_229 = (int)var1.getY(var2);
            this.field_240 = var1.getPointerId(var2);
            break;
        case 6:
            this.method_314(var1);
            this.field_229 = (int)var1.getY(var1.findPointerIndex(this.field_240));
        }

        if (this.field_234 != null) {
            this.field_234.addMovement(var9);
        }

        var9.recycle();
        var8 = true;
        return var8;
    }

    public void requestChildFocus(View var1, View var2) {
        if (!this.field_230) {
            this.method_321(var2);
        } else {
            this.field_232 = var2;
        }

        super.requestChildFocus(var1, var2);
    }

    public boolean requestChildRectangleOnScreen(View var1, Rect var2, boolean var3) {
        var2.offset(var1.getLeft() - var1.getScrollX(), var1.getTop() - var1.getScrollY());
        return this.method_316(var2, var3);
    }

    public void requestDisallowInterceptTouchEvent(boolean var1) {
        if (var1) {
            this.method_326();
        }

        super.requestDisallowInterceptTouchEvent(var1);
    }

    public void requestLayout() {
        this.field_230 = true;
        super.requestLayout();
    }

    public void scrollTo(int var1, int var2) {
        if (this.getChildCount() > 0) {
            View var3 = this.getChildAt(0);
            var1 = method_320(var1, this.getWidth() - this.getPaddingRight() - this.getPaddingLeft(), var3.getWidth());
            var2 = method_320(var2, this.getHeight() - this.getPaddingBottom() - this.getPaddingTop(), var3.getHeight());
            if (var1 != this.getScrollX() || var2 != this.getScrollY()) {
                super.scrollTo(var1, var2);
            }
        }

    }

    public void setFillViewport(boolean var1) {
        if (var1 != this.field_235) {
            this.field_235 = var1;
            this.requestLayout();
        }

    }

    public void setNestedScrollingEnabled(boolean var1) {
        this.field_247.method_1232(var1);
    }

    public void setOnScrollChangeListener(NestedScrollView.class_227 var1) {
        this.field_223 = var1;
    }

    public void setSmoothScrollingEnabled(boolean var1) {
        this.field_236 = var1;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int var1) {
        return this.field_247.method_1243(var1);
    }

    public void stopNestedScroll() {
        this.field_247.method_1244();
    }

    static class class_226 extends class_42 {
        // $FF: renamed from: a (android.view.View, android.support.v4.h.a.a) void
        public void method_434(View var1, class_175 var2) {
            super.method_434(var1, var2);
            NestedScrollView var4 = (NestedScrollView)var1;
            var2.method_1473(ScrollView.class.getName());
            if (var4.isEnabled()) {
                int var3 = var4.getScrollRange();
                if (var3 > 0) {
                    var2.method_1474(true);
                    if (var4.getScrollY() > 0) {
                        var2.method_1471(8192);
                    }

                    if (var4.getScrollY() < var3) {
                        var2.method_1471(4096);
                    }
                }
            }

        }

        // $FF: renamed from: a (android.view.View, int, android.os.Bundle) boolean
        public boolean method_436(View var1, int var2, Bundle var3) {
            boolean var7 = false;
            boolean var6;
            if (super.method_436(var1, var2, var3)) {
                var6 = true;
            } else {
                NestedScrollView var8 = (NestedScrollView)var1;
                var6 = var7;
                if (var8.isEnabled()) {
                    switch(var2) {
                    case 4096:
                        var2 = Math.min(var8.getHeight() - var8.getPaddingBottom() - var8.getPaddingTop() + var8.getScrollY(), var8.getScrollRange());
                        var6 = var7;
                        if (var2 != var8.getScrollY()) {
                            var8.method_340(0, var2);
                            var6 = true;
                        }
                        break;
                    case 8192:
                        int var4 = var8.getHeight();
                        var2 = var8.getPaddingBottom();
                        int var5 = var8.getPaddingTop();
                        var2 = Math.max(var8.getScrollY() - (var4 - var2 - var5), 0);
                        var6 = var7;
                        if (var2 != var8.getScrollY()) {
                            var8.method_340(0, var2);
                            var6 = true;
                        }
                        break;
                    default:
                        var6 = var7;
                    }
                }
            }

            return var6;
        }

        // $FF: renamed from: d (android.view.View, android.view.accessibility.AccessibilityEvent) void
        public void method_440(View var1, AccessibilityEvent var2) {
            super.method_440(var1, var2);
            NestedScrollView var4 = (NestedScrollView)var1;
            var2.setClassName(ScrollView.class.getName());
            boolean var3;
            if (var4.getScrollRange() > 0) {
                var3 = true;
            } else {
                var3 = false;
            }

            var2.setScrollable(var3);
            var2.setScrollX(var4.getScrollX());
            var2.setScrollY(var4.getScrollY());
            class_173.method_1465(var2, var4.getScrollX());
            class_173.method_1466(var2, var4.getScrollRange());
        }
    }

    public interface class_227 {
        // $FF: renamed from: a (android.support.v4.widget.NestedScrollView, int, int, int, int) void
        void method_13(NestedScrollView var1, int var2, int var3, int var4, int var5);
    }

    static class class_228 extends BaseSavedState {
        public static final Creator CREATOR = new Creator() {
            // $FF: renamed from: a (android.os.Parcel) android.support.v4.widget.NestedScrollView$c
            public NestedScrollView.class_228 method_391(Parcel var1) {
                return new NestedScrollView.class_228(var1);
            }

            // $FF: renamed from: a (int) android.support.v4.widget.NestedScrollView$c[]
            public NestedScrollView.class_228[] method_392(int var1) {
                return new NestedScrollView.class_228[var1];
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1) {
                return this.method_391(var1);
            }

            // $FF: synthetic method
            public Object[] newArray(int var1) {
                return this.method_392(var1);
            }
        };
        // $FF: renamed from: a int
        public int field_355;

        class_228(Parcel var1) {
            super(var1);
            this.field_355 = var1.readInt();
        }

        class_228(Parcelable var1) {
            super(var1);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.field_355 + "}";
        }

        public void writeToParcel(Parcel var1, int var2) {
            super.writeToParcel(var1, var2);
            var1.writeInt(this.field_355);
        }
    }
}
