package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.class_144;
import android.support.v4.h.class_146;
import android.support.v4.h.class_19;
import android.support.v7.a.a$f;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;
import android.widget.OverScroller;

public class ActionBarOverlayLayout extends ViewGroup implements class_19 {
    // $FF: renamed from: e int[]
    static final int[] field_69;
    // $FF: renamed from: A java.lang.Runnable
    private final Runnable field_70;
    // $FF: renamed from: B java.lang.Runnable
    private final Runnable field_71;
    // $FF: renamed from: C android.support.v4.h.l
    private final class_144 field_72;
    // $FF: renamed from: a android.support.v7.widget.ActionBarContainer
    ActionBarContainer field_73;
    // $FF: renamed from: b boolean
    boolean field_74;
    // $FF: renamed from: c android.view.ViewPropertyAnimator
    ViewPropertyAnimator field_75;
    // $FF: renamed from: d android.animation.AnimatorListenerAdapter
    final AnimatorListenerAdapter field_76;
    // $FF: renamed from: f int
    private int field_77;
    // $FF: renamed from: g int
    private int field_78;
    // $FF: renamed from: h android.support.v7.widget.ContentFrameLayout
    private ContentFrameLayout field_79;
    // $FF: renamed from: i android.support.v7.widget.r
    private class_6 field_80;
    // $FF: renamed from: j android.graphics.drawable.Drawable
    private Drawable field_81;
    // $FF: renamed from: k boolean
    private boolean field_82;
    // $FF: renamed from: l boolean
    private boolean field_83;
    // $FF: renamed from: m boolean
    private boolean field_84;
    // $FF: renamed from: n boolean
    private boolean field_85;
    // $FF: renamed from: o int
    private int field_86;
    // $FF: renamed from: p int
    private int field_87;
    // $FF: renamed from: q android.graphics.Rect
    private final Rect field_88;
    // $FF: renamed from: r android.graphics.Rect
    private final Rect field_89;
    // $FF: renamed from: s android.graphics.Rect
    private final Rect field_90;
    // $FF: renamed from: t android.graphics.Rect
    private final Rect field_91;
    // $FF: renamed from: u android.graphics.Rect
    private final Rect field_92;
    // $FF: renamed from: v android.graphics.Rect
    private final Rect field_93;
    // $FF: renamed from: w android.graphics.Rect
    private final Rect field_94;
    // $FF: renamed from: x android.support.v7.widget.ActionBarOverlayLayout$a
    private ActionBarOverlayLayout.class_186 field_95;
    // $FF: renamed from: y int
    private final int field_96;
    // $FF: renamed from: z android.widget.OverScroller
    private OverScroller field_97;

    static {
        field_69 = new int[]{android.support.v7.a.a$a.actionBarSize, 16842841};
    }

    public ActionBarOverlayLayout(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public ActionBarOverlayLayout(Context var1, AttributeSet var2) {
        super(var1, var2);
        this.field_78 = 0;
        this.field_88 = new Rect();
        this.field_89 = new Rect();
        this.field_90 = new Rect();
        this.field_91 = new Rect();
        this.field_92 = new Rect();
        this.field_93 = new Rect();
        this.field_94 = new Rect();
        this.field_96 = 600;
        this.field_76 = new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator var1) {
                ActionBarOverlayLayout.this.field_75 = null;
                ActionBarOverlayLayout.this.field_74 = false;
            }

            public void onAnimationEnd(Animator var1) {
                ActionBarOverlayLayout.this.field_75 = null;
                ActionBarOverlayLayout.this.field_74 = false;
            }
        };
        this.field_70 = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.method_224();
                ActionBarOverlayLayout.this.field_75 = ActionBarOverlayLayout.this.field_73.animate().translationY(0.0F).setListener(ActionBarOverlayLayout.this.field_76);
            }
        };
        this.field_71 = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.method_224();
                ActionBarOverlayLayout.this.field_75 = ActionBarOverlayLayout.this.field_73.animate().translationY((float)(-ActionBarOverlayLayout.this.field_73.getHeight())).setListener(ActionBarOverlayLayout.this.field_76);
            }
        };
        this.method_214(var1);
        this.field_72 = new class_144(this);
    }

    // $FF: renamed from: a (android.view.View) android.support.v7.widget.r
    private class_6 method_213(View var1) {
        class_6 var2;
        if (var1 instanceof class_6) {
            var2 = (class_6)var1;
        } else {
            if (!(var1 instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of " + var1.getClass().getSimpleName());
            }

            var2 = ((Toolbar)var1).getWrapper();
        }

        return var2;
    }

    // $FF: renamed from: a (android.content.Context) void
    private void method_214(Context var1) {
        boolean var3 = true;
        TypedArray var4 = this.getContext().getTheme().obtainStyledAttributes(field_69);
        this.field_77 = var4.getDimensionPixelSize(0, 0);
        this.field_81 = var4.getDrawable(1);
        boolean var2;
        if (this.field_81 == null) {
            var2 = true;
        } else {
            var2 = false;
        }

        this.setWillNotDraw(var2);
        var4.recycle();
        if (var1.getApplicationInfo().targetSdkVersion < 19) {
            var2 = var3;
        } else {
            var2 = false;
        }

        this.field_82 = var2;
        this.field_97 = new OverScroller(var1);
    }

    // $FF: renamed from: a (float, float) boolean
    private boolean method_215(float var1, float var2) {
        boolean var3 = false;
        this.field_97.fling(0, 0, 0, (int)var2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.field_97.getFinalY() > this.field_73.getHeight()) {
            var3 = true;
        }

        return var3;
    }

    // $FF: renamed from: a (android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean) boolean
    private boolean method_216(View var1, Rect var2, boolean var3, boolean var4, boolean var5, boolean var6) {
        boolean var8 = false;
        ActionBarOverlayLayout.class_187 var9 = (ActionBarOverlayLayout.class_187)var1.getLayoutParams();
        boolean var7 = var8;
        if (var3) {
            var7 = var8;
            if (var9.leftMargin != var2.left) {
                var9.leftMargin = var2.left;
                var7 = true;
            }
        }

        var3 = var7;
        if (var4) {
            var3 = var7;
            if (var9.topMargin != var2.top) {
                var9.topMargin = var2.top;
                var3 = true;
            }
        }

        var4 = var3;
        if (var6) {
            var4 = var3;
            if (var9.rightMargin != var2.right) {
                var9.rightMargin = var2.right;
                var4 = true;
            }
        }

        if (var5 && var9.bottomMargin != var2.bottom) {
            var9.bottomMargin = var2.bottom;
            var4 = true;
        }

        return var4;
    }

    // $FF: renamed from: d () void
    private void method_217() {
        this.method_224();
        this.postDelayed(this.field_70, 600L);
    }

    // $FF: renamed from: e () void
    private void method_218() {
        this.method_224();
        this.postDelayed(this.field_71, 600L);
    }

    // $FF: renamed from: f () void
    private void method_219() {
        this.method_224();
        this.field_70.run();
    }

    // $FF: renamed from: g () void
    private void method_220() {
        this.method_224();
        this.field_71.run();
    }

    // $FF: renamed from: a () android.support.v7.widget.ActionBarOverlayLayout$b
    protected ActionBarOverlayLayout.class_187 method_221() {
        return new ActionBarOverlayLayout.class_187(-1, -1);
    }

    // $FF: renamed from: a (android.util.AttributeSet) android.support.v7.widget.ActionBarOverlayLayout$b
    public ActionBarOverlayLayout.class_187 method_222(AttributeSet var1) {
        return new ActionBarOverlayLayout.class_187(this.getContext(), var1);
    }

    // $FF: renamed from: b () void
    void method_223() {
        if (this.field_79 == null) {
            this.field_79 = (ContentFrameLayout)this.findViewById(a$f.action_bar_activity_content);
            this.field_73 = (ActionBarContainer)this.findViewById(a$f.action_bar_container);
            this.field_80 = this.method_213(this.findViewById(a$f.action_bar));
        }

    }

    // $FF: renamed from: c () void
    void method_224() {
        this.removeCallbacks(this.field_70);
        this.removeCallbacks(this.field_71);
        if (this.field_75 != null) {
            this.field_75.cancel();
        }

    }

    protected boolean checkLayoutParams(LayoutParams var1) {
        return var1 instanceof ActionBarOverlayLayout.class_187;
    }

    public void draw(Canvas var1) {
        super.draw(var1);
        if (this.field_81 != null && !this.field_82) {
            int var2;
            if (this.field_73.getVisibility() == 0) {
                var2 = (int)((float)this.field_73.getBottom() + this.field_73.getTranslationY() + 0.5F);
            } else {
                var2 = 0;
            }

            this.field_81.setBounds(0, var2, this.getWidth(), this.field_81.getIntrinsicHeight() + var2);
            this.field_81.draw(var1);
        }

    }

    protected boolean fitSystemWindows(Rect var1) {
        this.method_223();
        if ((class_146.method_1224(this) & 256) != 0) {
            ;
        }

        boolean var2 = this.method_216(this.field_73, var1, true, true, false, true);
        this.field_91.set(var1);
        class_105.method_911(this, this.field_91, this.field_88);
        if (!this.field_92.equals(this.field_91)) {
            this.field_92.set(this.field_91);
            var2 = true;
        }

        if (!this.field_89.equals(this.field_88)) {
            this.field_89.set(this.field_88);
            var2 = true;
        }

        if (var2) {
            this.requestLayout();
        }

        return true;
    }

    // $FF: synthetic method
    protected LayoutParams generateDefaultLayoutParams() {
        return this.method_221();
    }

    // $FF: synthetic method
    public LayoutParams generateLayoutParams(AttributeSet var1) {
        return this.method_222(var1);
    }

    protected LayoutParams generateLayoutParams(LayoutParams var1) {
        return new ActionBarOverlayLayout.class_187(var1);
    }

    public int getActionBarHideOffset() {
        int var1;
        if (this.field_73 != null) {
            var1 = -((int)this.field_73.getTranslationY());
        } else {
            var1 = 0;
        }

        return var1;
    }

    public int getNestedScrollAxes() {
        return this.field_72.method_1203();
    }

    public CharSequence getTitle() {
        this.method_223();
        return this.field_80.method_21();
    }

    protected void onConfigurationChanged(Configuration var1) {
        super.onConfigurationChanged(var1);
        this.method_214(this.getContext());
        class_146.method_1225(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.method_224();
    }

    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        var4 = this.getChildCount();
        var3 = this.getPaddingLeft();
        this.getPaddingRight();
        var5 = this.getPaddingTop();
        this.getPaddingBottom();

        for(var2 = 0; var2 < var4; ++var2) {
            View var10 = this.getChildAt(var2);
            if (var10.getVisibility() != 8) {
                ActionBarOverlayLayout.class_187 var11 = (ActionBarOverlayLayout.class_187)var10.getLayoutParams();
                int var8 = var10.getMeasuredWidth();
                int var9 = var10.getMeasuredHeight();
                int var7 = var11.leftMargin + var3;
                int var6 = var11.topMargin + var5;
                var10.layout(var7, var6, var8 + var7, var9 + var6);
            }
        }

    }

    protected void onMeasure(int var1, int var2) {
        this.method_223();
        this.measureChildWithMargins(this.field_73, var1, 0, var2, 0);
        ActionBarOverlayLayout.class_187 var9 = (ActionBarOverlayLayout.class_187)this.field_73.getLayoutParams();
        int var8 = Math.max(0, this.field_73.getMeasuredWidth() + var9.leftMargin + var9.rightMargin);
        int var3 = this.field_73.getMeasuredHeight();
        int var4 = var9.topMargin;
        int var7 = Math.max(0, var9.bottomMargin + var3 + var4);
        int var6 = View.combineMeasuredStates(0, this.field_73.getMeasuredState());
        boolean var10;
        if ((class_146.method_1224(this) & 256) != 0) {
            var10 = true;
        } else {
            var10 = false;
        }

        int var5;
        if (var10) {
            var5 = this.field_77;
            var3 = var5;
            if (this.field_84) {
                var3 = var5;
                if (this.field_73.getTabContainer() != null) {
                    var3 = var5 + this.field_77;
                }
            }
        } else if (this.field_73.getVisibility() != 8) {
            var3 = this.field_73.getMeasuredHeight();
        } else {
            var3 = 0;
        }

        this.field_90.set(this.field_88);
        this.field_93.set(this.field_91);
        Rect var11;
        if (!this.field_83 && !var10) {
            var11 = this.field_90;
            var11.top += var3;
            var11 = this.field_90;
            var11.bottom += 0;
        } else {
            var11 = this.field_93;
            var11.top += var3;
            var11 = this.field_93;
            var11.bottom += 0;
        }

        this.method_216(this.field_79, this.field_90, true, true, true, true);
        if (!this.field_94.equals(this.field_93)) {
            this.field_94.set(this.field_93);
            this.field_79.method_947(this.field_93);
        }

        this.measureChildWithMargins(this.field_79, var1, 0, var2, 0);
        var9 = (ActionBarOverlayLayout.class_187)this.field_79.getLayoutParams();
        var3 = Math.max(var8, this.field_79.getMeasuredWidth() + var9.leftMargin + var9.rightMargin);
        var4 = this.field_79.getMeasuredHeight();
        var5 = var9.topMargin;
        var7 = Math.max(var7, var9.bottomMargin + var4 + var5);
        var5 = View.combineMeasuredStates(var6, this.field_79.getMeasuredState());
        var6 = this.getPaddingLeft();
        var4 = this.getPaddingRight();
        var7 = Math.max(var7 + this.getPaddingTop() + this.getPaddingBottom(), this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(var3 + var6 + var4, this.getSuggestedMinimumWidth()), var1, var5), View.resolveSizeAndState(var7, var2, var5 << 16));
    }

    public boolean onNestedFling(View var1, float var2, float var3, boolean var4) {
        boolean var5 = true;
        if (this.field_85 && var4) {
            if (this.method_215(var2, var3)) {
                this.method_220();
            } else {
                this.method_219();
            }

            this.field_74 = true;
            var4 = var5;
        } else {
            var4 = false;
        }

        return var4;
    }

    public boolean onNestedPreFling(View var1, float var2, float var3) {
        return false;
    }

    public void onNestedPreScroll(View var1, int var2, int var3, int[] var4) {
    }

    public void onNestedScroll(View var1, int var2, int var3, int var4, int var5) {
        this.field_86 += var3;
        this.setActionBarHideOffset(this.field_86);
    }

    public void onNestedScrollAccepted(View var1, View var2, int var3) {
        this.field_72.method_1206(var1, var2, var3);
        this.field_86 = this.getActionBarHideOffset();
        this.method_224();
        if (this.field_95 != null) {
            this.field_95.method_160();
        }

    }

    public boolean onStartNestedScroll(View var1, View var2, int var3) {
        boolean var4;
        if ((var3 & 2) != 0 && this.field_73.getVisibility() == 0) {
            var4 = this.field_85;
        } else {
            var4 = false;
        }

        return var4;
    }

    public void onStopNestedScroll(View var1) {
        if (this.field_85 && !this.field_74) {
            if (this.field_86 <= this.field_73.getHeight()) {
                this.method_217();
            } else {
                this.method_218();
            }
        }

        if (this.field_95 != null) {
            this.field_95.method_161();
        }

    }

    public void onWindowSystemUiVisibilityChanged(int var1) {
        boolean var5 = false;
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(var1);
        }

        this.method_223();
        int var4 = this.field_87;
        this.field_87 = var1;
        boolean var2;
        if ((var1 & 4) == 0) {
            var2 = true;
        } else {
            var2 = false;
        }

        boolean var3;
        if ((var1 & 256) != 0) {
            var3 = true;
        } else {
            var3 = false;
        }

        if (this.field_95 != null) {
            ActionBarOverlayLayout.class_186 var6 = this.field_95;
            if (!var3) {
                var5 = true;
            }

            var6.method_158(var5);
            if (!var2 && var3) {
                this.field_95.method_159();
            } else {
                this.field_95.method_156();
            }
        }

        if (((var4 ^ var1) & 256) != 0 && this.field_95 != null) {
            class_146.method_1225(this);
        }

    }

    protected void onWindowVisibilityChanged(int var1) {
        super.onWindowVisibilityChanged(var1);
        this.field_78 = var1;
        if (this.field_95 != null) {
            this.field_95.method_157(var1);
        }

    }

    public void setActionBarHideOffset(int var1) {
        this.method_224();
        var1 = Math.max(0, Math.min(var1, this.field_73.getHeight()));
        this.field_73.setTranslationY((float)(-var1));
    }

    public void setActionBarVisibilityCallback(ActionBarOverlayLayout.class_186 var1) {
        this.field_95 = var1;
        if (this.getWindowToken() != null) {
            this.field_95.method_157(this.field_78);
            if (this.field_87 != 0) {
                this.onWindowSystemUiVisibilityChanged(this.field_87);
                class_146.method_1225(this);
            }
        }

    }

    public void setHasNonEmbeddedTabs(boolean var1) {
        this.field_84 = var1;
    }

    public void setHideOnContentScrollEnabled(boolean var1) {
        if (var1 != this.field_85) {
            this.field_85 = var1;
            if (!var1) {
                this.method_224();
                this.setActionBarHideOffset(0);
            }
        }

    }

    public void setIcon(int var1) {
        this.method_223();
        this.field_80.method_22(var1);
    }

    public void setIcon(Drawable var1) {
        this.method_223();
        this.field_80.method_23(var1);
    }

    public void setLogo(int var1) {
        this.method_223();
        this.field_80.method_26(var1);
    }

    public void setOverlayMode(boolean var1) {
        this.field_83 = var1;
        if (var1 && this.getContext().getApplicationInfo().targetSdkVersion < 19) {
            var1 = true;
        } else {
            var1 = false;
        }

        this.field_82 = var1;
    }

    public void setShowingForActionMode(boolean var1) {
    }

    public void setUiOptions(int var1) {
    }

    public void setWindowCallback(Callback var1) {
        this.method_223();
        this.field_80.method_24(var1);
    }

    public void setWindowTitle(CharSequence var1) {
        this.method_223();
        this.field_80.method_25(var1);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public interface class_186 {
        // $FF: renamed from: a () void
        void method_156();

        // $FF: renamed from: a (int) void
        void method_157(int var1);

        // $FF: renamed from: a (boolean) void
        void method_158(boolean var1);

        // $FF: renamed from: b () void
        void method_159();

        // $FF: renamed from: c () void
        void method_160();

        // $FF: renamed from: d () void
        void method_161();
    }

    public static class class_187 extends MarginLayoutParams {
        public class_187(int var1, int var2) {
            super(var1, var2);
        }

        public class_187(Context var1, AttributeSet var2) {
            super(var1, var2);
        }

        public class_187(LayoutParams var1) {
            super(var1);
        }
    }
}
