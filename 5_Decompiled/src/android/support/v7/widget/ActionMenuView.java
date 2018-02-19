package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.class_162;
import android.support.v7.view.menu.class_168;
import android.support.v7.view.menu.class_24;
import android.support.v7.view.menu.g$a;
import android.support.v7.view.menu.g$b;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends class_31 implements g$b, class_24 {
    // $FF: renamed from: a android.support.v7.view.menu.g$a
    g$a field_195;
    // $FF: renamed from: b android.support.v7.widget.ActionMenuView$e
    ActionMenuView.class_215 field_196;
    // $FF: renamed from: c android.support.v7.view.menu.g
    private class_162 field_197;
    // $FF: renamed from: d android.content.Context
    private Context field_198;
    // $FF: renamed from: e int
    private int field_199;
    // $FF: renamed from: f boolean
    private boolean field_200;
    // $FF: renamed from: g android.support.v7.widget.d
    private class_72 field_201;
    // $FF: renamed from: h android.support.v7.view.menu.m$a
    private android.support.v7.view.menu.m$a field_202;
    // $FF: renamed from: i boolean
    private boolean field_203;
    // $FF: renamed from: j int
    private int field_204;
    // $FF: renamed from: k int
    private int field_205;
    // $FF: renamed from: l int
    private int field_206;

    public ActionMenuView(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public ActionMenuView(Context var1, AttributeSet var2) {
        super(var1, var2);
        this.setBaselineAligned(false);
        float var3 = var1.getResources().getDisplayMetrics().density;
        this.field_205 = (int)(56.0F * var3);
        this.field_206 = (int)(var3 * 4.0F);
        this.field_198 = var1;
        this.field_199 = 0;
    }

    // $FF: renamed from: a (android.view.View, int, int, int, int) int
    static int method_291(View var0, int var1, int var2, int var3, int var4) {
        boolean var8 = false;
        ActionMenuView.class_213 var10 = (ActionMenuView.class_213)var0.getLayoutParams();
        int var5 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(var3) - var4, MeasureSpec.getMode(var3));
        ActionMenuItemView var9;
        if (var0 instanceof ActionMenuItemView) {
            var9 = (ActionMenuItemView)var0;
        } else {
            var9 = null;
        }

        boolean var11;
        if (var9 != null && var9.method_616()) {
            var11 = true;
        } else {
            var11 = false;
        }

        if (var2 > 0 && (!var11 || var2 >= 2)) {
            var0.measure(MeasureSpec.makeMeasureSpec(var1 * var2, Integer.MIN_VALUE), var5);
            int var6 = var0.getMeasuredWidth();
            var3 = var6 / var1;
            var2 = var3;
            if (var6 % var1 != 0) {
                var2 = var3 + 1;
            }

            var3 = var2;
            if (var11) {
                var3 = var2;
                if (var2 < 2) {
                    var3 = 2;
                }
            }
        } else {
            var3 = 0;
        }

        boolean var7 = var8;
        if (!var10.field_343) {
            var7 = var8;
            if (var11) {
                var7 = true;
            }
        }

        var10.field_346 = var7;
        var10.field_344 = var3;
        var0.measure(MeasureSpec.makeMeasureSpec(var3 * var1, 1073741824), var5);
        return var3;
    }

    // $FF: renamed from: c (int, int) void
    private void method_292(int var1, int var2) {
        int var16 = MeasureSpec.getMode(var2);
        var1 = MeasureSpec.getSize(var1);
        int var15 = MeasureSpec.getSize(var2);
        int var6 = this.getPaddingLeft();
        int var7 = this.getPaddingRight();
        int var14 = this.getPaddingTop() + this.getPaddingBottom();
        int var17 = getChildMeasureSpec(var2, var14, -2);
        int var18 = var1 - (var6 + var7);
        var1 = var18 / this.field_205;
        var2 = this.field_205;
        if (var1 == 0) {
            this.setMeasuredDimension(var18, 0);
        } else {
            int var19 = this.field_205 + var18 % var2 / var1;
            var6 = 0;
            int var10 = 0;
            int var8 = 0;
            int var11 = 0;
            boolean var30 = false;
            long var21 = 0L;
            int var20 = this.getChildCount();

            int var9;
            int var13;
            ActionMenuView.class_213 var26;
            View var27;
            for(int var12 = 0; var12 < var20; var10 = var9) {
                var27 = this.getChildAt(var12);
                boolean var29;
                if (var27.getVisibility() == 8) {
                    var13 = var8;
                    var9 = var10;
                    var2 = var6;
                    var7 = var11;
                    var8 = var1;
                    var29 = var30;
                    var1 = var13;
                } else {
                    boolean var25 = var27 instanceof ActionMenuItemView;
                    var9 = var11 + 1;
                    if (var25) {
                        var27.setPadding(this.field_206, 0, this.field_206, 0);
                    }

                    var26 = (ActionMenuView.class_213)var27.getLayoutParams();
                    var26.field_348 = false;
                    var26.field_345 = 0;
                    var26.field_344 = 0;
                    var26.field_346 = false;
                    var26.leftMargin = 0;
                    var26.rightMargin = 0;
                    if (var25 && ((ActionMenuItemView)var27).method_616()) {
                        var25 = true;
                    } else {
                        var25 = false;
                    }

                    var26.field_347 = var25;
                    if (var26.field_343) {
                        var2 = 1;
                    } else {
                        var2 = var1;
                    }

                    var11 = method_291(var27, var19, var2, var17, var14);
                    var10 = Math.max(var10, var11);
                    var2 = var8;
                    if (var26.field_346) {
                        var2 = var8 + 1;
                    }

                    if (var26.field_343) {
                        var30 = true;
                    }

                    var1 -= var11;
                    var8 = Math.max(var6, var27.getMeasuredHeight());
                    if (var11 == 1) {
                        var21 |= (long)(1 << var12);
                        var29 = var30;
                        var7 = var9;
                        var9 = var10;
                        var10 = var1;
                        var1 = var2;
                        var2 = var8;
                        var8 = var10;
                    } else {
                        var11 = var9;
                        var29 = var30;
                        var7 = var8;
                        var9 = var10;
                        var8 = var1;
                        var1 = var2;
                        var2 = var7;
                        var7 = var11;
                    }
                }

                ++var12;
                var10 = var8;
                var11 = var7;
                var8 = var1;
                var30 = var29;
                var6 = var2;
                var1 = var10;
            }

            boolean var34;
            if (var30 && var11 == 2) {
                var34 = true;
            } else {
                var34 = false;
            }

            boolean var32 = false;

            for(var13 = var1; var8 > 0 && var13 > 0; var13 = var2) {
                var1 = Integer.MAX_VALUE;
                long var23 = 0L;
                var2 = 0;

                for(var14 = 0; var14 < var20; ++var14) {
                    var26 = (ActionMenuView.class_213)this.getChildAt(var14).getLayoutParams();
                    if (var26.field_346) {
                        if (var26.field_344 < var1) {
                            var1 = var26.field_344;
                            var23 = (long)(1 << var14);
                            var2 = 1;
                        } else if (var26.field_344 == var1) {
                            var23 |= (long)(1 << var14);
                            ++var2;
                        }
                    }
                }

                var21 |= var23;
                if (var2 > var13) {
                    break;
                }

                var9 = 0;

                for(var2 = var13; var9 < var20; ++var9) {
                    var27 = this.getChildAt(var9);
                    var26 = (ActionMenuView.class_213)var27.getLayoutParams();
                    if (((long)(1 << var9) & var23) == 0L) {
                        if (var26.field_344 == var1 + 1) {
                            var21 |= (long)(1 << var9);
                        }
                    } else {
                        if (var34 && var26.field_347 && var2 == 1) {
                            var27.setPadding(this.field_206 + var19, 0, this.field_206, 0);
                        }

                        ++var26.field_344;
                        var26.field_348 = true;
                        --var2;
                    }
                }

                var32 = true;
            }

            boolean var28;
            if (!var30 && var11 == 1) {
                var28 = true;
            } else {
                var28 = false;
            }

            boolean var31;
            View var35;
            ActionMenuView.class_213 var36;
            if (var13 > 0 && var21 != 0L && (var13 < var11 - 1 || var28 || var10 > 1)) {
                float var5 = (float)Long.bitCount(var21);
                float var4 = var5;
                if (!var28) {
                    float var3 = var5;
                    if ((1L & var21) != 0L) {
                        var3 = var5;
                        if (!((ActionMenuView.class_213)this.getChildAt(0).getLayoutParams()).field_347) {
                            var3 = var5 - 0.5F;
                        }
                    }

                    var4 = var3;
                    if (((long)(1 << var20 - 1) & var21) != 0L) {
                        var4 = var3;
                        if (!((ActionMenuView.class_213)this.getChildAt(var20 - 1).getLayoutParams()).field_347) {
                            var4 = var3 - 0.5F;
                        }
                    }
                }

                if (var4 > 0.0F) {
                    var2 = (int)((float)(var13 * var19) / var4);
                } else {
                    var2 = 0;
                }

                var7 = 0;
                var28 = var32;

                while(true) {
                    var31 = var28;
                    if (var7 >= var20) {
                        break;
                    }

                    if (((long)(1 << var7) & var21) != 0L) {
                        var35 = this.getChildAt(var7);
                        var36 = (ActionMenuView.class_213)var35.getLayoutParams();
                        if (var35 instanceof ActionMenuItemView) {
                            var36.field_345 = var2;
                            var36.field_348 = true;
                            if (var7 == 0 && !var36.field_347) {
                                var36.leftMargin = -var2 / 2;
                            }

                            var28 = true;
                        } else if (var36.field_343) {
                            var36.field_345 = var2;
                            var36.field_348 = true;
                            var36.rightMargin = -var2 / 2;
                            var28 = true;
                        } else {
                            if (var7 != 0) {
                                var36.leftMargin = var2 / 2;
                            }

                            if (var7 != var20 - 1) {
                                var36.rightMargin = var2 / 2;
                            }
                        }
                    }

                    ++var7;
                }
            } else {
                var31 = var32;
            }

            if (var31) {
                for(var1 = 0; var1 < var20; ++var1) {
                    var35 = this.getChildAt(var1);
                    var36 = (ActionMenuView.class_213)var35.getLayoutParams();
                    if (var36.field_348) {
                        var2 = var36.field_344;
                        var35.measure(MeasureSpec.makeMeasureSpec(var36.field_345 + var2 * var19, 1073741824), var17);
                    }
                }
            }

            if (var16 == 1073741824) {
                var6 = var15;
            }

            this.setMeasuredDimension(var18, var6);
        }

    }

    // $FF: renamed from: a () android.support.v7.widget.ActionMenuView$c
    protected ActionMenuView.class_213 method_293() {
        ActionMenuView.class_213 var1 = new ActionMenuView.class_213(-2, -2);
        var1.h = 16;
        return var1;
    }

    // $FF: renamed from: a (android.util.AttributeSet) android.support.v7.widget.ActionMenuView$c
    public ActionMenuView.class_213 method_294(AttributeSet var1) {
        return new ActionMenuView.class_213(this.getContext(), var1);
    }

    // $FF: renamed from: a (android.view.ViewGroup.LayoutParams) android.support.v7.widget.ActionMenuView$c
    protected ActionMenuView.class_213 method_295(LayoutParams var1) {
        ActionMenuView.class_213 var2;
        if (var1 != null) {
            ActionMenuView.class_213 var3;
            if (var1 instanceof ActionMenuView.class_213) {
                var3 = new ActionMenuView.class_213((ActionMenuView.class_213)var1);
            } else {
                var3 = new ActionMenuView.class_213(var1);
            }

            var2 = var3;
            if (var3.h <= 0) {
                var3.h = 16;
                var2 = var3;
            }
        } else {
            var2 = this.method_293();
        }

        return var2;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g) void
    public void method_296(class_162 var1) {
        this.field_197 = var1;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.m$a, android.support.v7.view.menu.g$a) void
    public void method_297(android.support.v7.view.menu.m$a var1, g$a var2) {
        this.field_202 = var1;
        this.field_195 = var2;
    }

    // $FF: renamed from: a (int) boolean
    protected boolean method_298(int var1) {
        boolean var3 = false;
        boolean var2;
        if (var1 == 0) {
            var2 = false;
        } else {
            View var4 = this.getChildAt(var1 - 1);
            View var5 = this.getChildAt(var1);
            var2 = var3;
            if (var1 < this.getChildCount()) {
                var2 = var3;
                if (var4 instanceof ActionMenuView.class_211) {
                    var2 = ((ActionMenuView.class_211)var4).method_11() | false;
                }
            }

            if (var1 > 0 && var5 instanceof ActionMenuView.class_211) {
                var2 |= ((ActionMenuView.class_211)var5).method_10();
            }
        }

        return var2;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.h) boolean
    public boolean method_117(class_168 var1) {
        return this.field_197.method_1357(var1, 0);
    }

    // $FF: renamed from: b () android.support.v7.widget.ActionMenuView$c
    public ActionMenuView.class_213 method_299() {
        ActionMenuView.class_213 var1 = this.method_293();
        var1.field_343 = true;
        return var1;
    }

    // $FF: renamed from: b (android.util.AttributeSet) android.support.v7.widget.w$a
    // $FF: synthetic method
    public w$a method_250(AttributeSet var1) {
        return this.method_294(var1);
    }

    // $FF: renamed from: b (android.view.ViewGroup.LayoutParams) android.support.v7.widget.w$a
    // $FF: synthetic method
    protected w$a method_251(LayoutParams var1) {
        return this.method_295(var1);
    }

    // $FF: renamed from: c () android.support.v7.view.menu.g
    public class_162 method_300() {
        return this.field_197;
    }

    protected boolean checkLayoutParams(LayoutParams var1) {
        boolean var2;
        if (var1 != null && var1 instanceof ActionMenuView.class_213) {
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    // $FF: renamed from: d () boolean
    public boolean method_301() {
        boolean var1;
        if (this.field_201 != null && this.field_201.method_691()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent var1) {
        return false;
    }

    // $FF: renamed from: e () boolean
    public boolean method_302() {
        boolean var1;
        if (this.field_201 != null && this.field_201.method_695()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: f () void
    public void method_303() {
        if (this.field_201 != null) {
            this.field_201.method_693();
        }

    }

    // $FF: renamed from: g () android.support.v7.widget.w$a
    // $FF: synthetic method
    protected w$a method_259() {
        return this.method_293();
    }

    // $FF: synthetic method
    protected LayoutParams generateDefaultLayoutParams() {
        return this.method_293();
    }

    // $FF: synthetic method
    public LayoutParams generateLayoutParams(AttributeSet var1) {
        return this.method_294(var1);
    }

    // $FF: synthetic method
    protected LayoutParams generateLayoutParams(LayoutParams var1) {
        return this.method_295(var1);
    }

    public Menu getMenu() {
        if (this.field_197 == null) {
            Context var1 = this.getContext();
            this.field_197 = new class_162(var1);
            this.field_197.method_1348(new ActionMenuView.class_214());
            this.field_201 = new class_72(var1);
            this.field_201.method_689(true);
            class_72 var2 = this.field_201;
            Object var3;
            if (this.field_202 != null) {
                var3 = this.field_202;
            } else {
                var3 = new ActionMenuView.class_212();
            }

            var2.a((android.support.v7.view.menu.m$a)var3);
            this.field_197.method_1351(this.field_201, this.field_198);
            this.field_201.method_687(this);
        }

        return this.field_197;
    }

    public Drawable getOverflowIcon() {
        this.getMenu();
        return this.field_201.method_688();
    }

    public int getPopupTheme() {
        return this.field_199;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration var1) {
        super.onConfigurationChanged(var1);
        if (this.field_201 != null) {
            this.field_201.method_144(false);
            if (this.field_201.method_695()) {
                this.field_201.method_692();
                this.field_201.method_691();
            }
        }

    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.method_303();
    }

    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        if (!this.field_203) {
            super.onLayout(var1, var2, var3, var4, var5);
        } else {
            int var12 = this.getChildCount();
            int var11 = (var5 - var3) / 2;
            int var13 = this.getDividerWidth();
            var5 = 0;
            var3 = 0;
            int var7 = var4 - var2 - this.getPaddingRight() - this.getPaddingLeft();
            boolean var6 = false;
            var1 = class_105.method_912(this);

            int var9;
            View var16;
            ActionMenuView.class_213 var17;
            int var19;
            for(int var8 = 0; var8 < var12; var8 = var9) {
                var16 = this.getChildAt(var8);
                boolean var20;
                if (var16.getVisibility() == 8) {
                    var9 = var5;
                    var5 = var7;
                    var20 = var6;
                    var19 = var3;
                    var3 = var9;
                } else {
                    var17 = (ActionMenuView.class_213)var16.getLayoutParams();
                    int var10;
                    if (var17.field_343) {
                        var9 = var16.getMeasuredWidth();
                        var19 = var9;
                        if (this.method_298(var8)) {
                            var19 = var9 + var13;
                        }

                        int var14 = var16.getMeasuredHeight();
                        if (var1) {
                            var9 = this.getPaddingLeft();
                            var10 = var17.leftMargin + var9;
                            var9 = var10 + var19;
                        } else {
                            var9 = this.getWidth() - this.getPaddingRight() - var17.rightMargin;
                            var10 = var9 - var19;
                        }

                        int var15 = var11 - var14 / 2;
                        var16.layout(var10, var15, var9, var14 + var15);
                        var9 = var7 - var19;
                        var20 = true;
                        var19 = var3;
                        var3 = var5;
                        var5 = var9;
                    } else {
                        var10 = var16.getMeasuredWidth() + var17.leftMargin + var17.rightMargin;
                        var9 = var5 + var10;
                        var5 = var9;
                        if (this.method_298(var8)) {
                            var5 = var9 + var13;
                        }

                        var9 = var7 - var10;
                        var10 = var3 + 1;
                        var20 = var6;
                        var3 = var5;
                        var5 = var9;
                        var19 = var10;
                    }
                }

                var9 = var8 + 1;
                var7 = var5;
                var5 = var3;
                var3 = var19;
                var6 = var20;
            }

            if (var12 == 1 && !var6) {
                var16 = this.getChildAt(0);
                var5 = var16.getMeasuredWidth();
                var3 = var16.getMeasuredHeight();
                var2 = (var4 - var2) / 2 - var5 / 2;
                var4 = var11 - var3 / 2;
                var16.layout(var2, var4, var5 + var2, var3 + var4);
            } else {
                byte var18;
                if (var6) {
                    var18 = 0;
                } else {
                    var18 = 1;
                }

                var2 = var3 - var18;
                if (var2 > 0) {
                    var2 = var7 / var2;
                } else {
                    var2 = 0;
                }

                var4 = Math.max(0, var2);
                if (var1) {
                    var2 = this.getWidth() - this.getPaddingRight();

                    for(var3 = 0; var3 < var12; ++var3) {
                        var16 = this.getChildAt(var3);
                        var17 = (ActionMenuView.class_213)var16.getLayoutParams();
                        if (var16.getVisibility() != 8 && !var17.field_343) {
                            var7 = var2 - var17.rightMargin;
                            var2 = var16.getMeasuredWidth();
                            var19 = var16.getMeasuredHeight();
                            var5 = var11 - var19 / 2;
                            var16.layout(var7 - var2, var5, var7, var19 + var5);
                            var2 = var7 - (var17.leftMargin + var2 + var4);
                        }
                    }
                } else {
                    var2 = this.getPaddingLeft();

                    for(var3 = 0; var3 < var12; ++var3) {
                        View var23 = this.getChildAt(var3);
                        ActionMenuView.class_213 var22 = (ActionMenuView.class_213)var23.getLayoutParams();
                        if (var23.getVisibility() != 8 && !var22.field_343) {
                            var7 = var2 + var22.leftMargin;
                            var5 = var23.getMeasuredWidth();
                            var19 = var23.getMeasuredHeight();
                            var2 = var11 - var19 / 2;
                            var23.layout(var7, var2, var7 + var5, var19 + var2);
                            var2 = var22.rightMargin + var5 + var4 + var7;
                        }
                    }
                }
            }
        }

    }

    protected void onMeasure(int var1, int var2) {
        boolean var6 = this.field_203;
        boolean var5;
        if (MeasureSpec.getMode(var1) == 1073741824) {
            var5 = true;
        } else {
            var5 = false;
        }

        this.field_203 = var5;
        if (var6 != this.field_203) {
            this.field_204 = 0;
        }

        int var3 = MeasureSpec.getSize(var1);
        if (this.field_203 && this.field_197 != null && var3 != this.field_204) {
            this.field_204 = var3;
            this.field_197.method_1361(true);
        }

        int var4 = this.getChildCount();
        if (this.field_203 && var4 > 0) {
            this.method_292(var1, var2);
        } else {
            for(var3 = 0; var3 < var4; ++var3) {
                ActionMenuView.class_213 var7 = (ActionMenuView.class_213)this.getChildAt(var3).getLayoutParams();
                var7.rightMargin = 0;
                var7.leftMargin = 0;
            }

            super.onMeasure(var1, var2);
        }

    }

    public void setExpandedActionViewsExclusive(boolean var1) {
        this.field_201.method_690(var1);
    }

    public void setOnMenuItemClickListener(ActionMenuView.class_215 var1) {
        this.field_196 = var1;
    }

    public void setOverflowIcon(Drawable var1) {
        this.getMenu();
        this.field_201.method_686(var1);
    }

    public void setOverflowReserved(boolean var1) {
        this.field_200 = var1;
    }

    public void setPopupTheme(int var1) {
        if (this.field_199 != var1) {
            this.field_199 = var1;
            if (var1 == 0) {
                this.field_198 = this.getContext();
            } else {
                this.field_198 = new ContextThemeWrapper(this.getContext(), var1);
            }
        }

    }

    public void setPresenter(class_72 var1) {
        this.field_201 = var1;
        this.field_201.method_687(this);
    }

    public interface class_211 {
        // $FF: renamed from: c () boolean
        boolean method_10();

        // $FF: renamed from: d () boolean
        boolean method_11();
    }

    private static class class_212 implements android.support.v7.view.menu.m$a {
        // $FF: renamed from: a (android.support.v7.view.menu.g, boolean) void
        public void method_128(class_162 var1, boolean var2) {
        }

        // $FF: renamed from: a (android.support.v7.view.menu.g) boolean
        public boolean method_129(class_162 var1) {
            return false;
        }
    }

    public static class class_213 extends w$a {
        // $FF: renamed from: a boolean
        @ExportedProperty
        public boolean field_343;
        // $FF: renamed from: b int
        @ExportedProperty
        public int field_344;
        // $FF: renamed from: c int
        @ExportedProperty
        public int field_345;
        // $FF: renamed from: d boolean
        @ExportedProperty
        public boolean field_346;
        // $FF: renamed from: e boolean
        @ExportedProperty
        public boolean field_347;
        // $FF: renamed from: f boolean
        boolean field_348;

        public class_213(int var1, int var2) {
            super(var1, var2);
            this.field_343 = false;
        }

        public class_213(Context var1, AttributeSet var2) {
            super(var1, var2);
        }

        public class_213(ActionMenuView.class_213 var1) {
            super(var1);
            this.field_343 = var1.field_343;
        }

        public class_213(LayoutParams var1) {
            super(var1);
        }
    }

    private class class_214 implements g$a {
        // $FF: renamed from: a (android.support.v7.view.menu.g) void
        public void method_118(class_162 var1) {
            if (ActionMenuView.this.field_195 != null) {
                ActionMenuView.this.field_195.method_118(var1);
            }

        }

        // $FF: renamed from: a (android.support.v7.view.menu.g, android.view.MenuItem) boolean
        public boolean method_119(class_162 var1, MenuItem var2) {
            boolean var3;
            if (ActionMenuView.this.field_196 != null && ActionMenuView.this.field_196.method_12(var2)) {
                var3 = true;
            } else {
                var3 = false;
            }

            return var3;
        }
    }

    public interface class_215 {
        // $FF: renamed from: a (android.view.MenuItem) boolean
        boolean method_12(MenuItem var1);
    }
}
