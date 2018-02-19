package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.class_142;
import android.support.v4.h.class_146;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

// $FF: renamed from: android.support.v7.widget.w
public class class_31 extends ViewGroup {
    // $FF: renamed from: a boolean
    private boolean field_131;
    // $FF: renamed from: b int
    private int field_132;
    // $FF: renamed from: c int
    private int field_133;
    // $FF: renamed from: d int
    private int field_134;
    // $FF: renamed from: e int
    private int field_135;
    // $FF: renamed from: f int
    private int field_136;
    // $FF: renamed from: g float
    private float field_137;
    // $FF: renamed from: h boolean
    private boolean field_138;
    // $FF: renamed from: i int[]
    private int[] field_139;
    // $FF: renamed from: j int[]
    private int[] field_140;
    // $FF: renamed from: k android.graphics.drawable.Drawable
    private Drawable field_141;
    // $FF: renamed from: l int
    private int field_142;
    // $FF: renamed from: m int
    private int field_143;
    // $FF: renamed from: n int
    private int field_144;
    // $FF: renamed from: o int
    private int field_145;

    public class_31(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public class_31(Context var1, AttributeSet var2) {
        this(var1, var2, 0);
    }

    public class_31(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        this.field_131 = true;
        this.field_132 = -1;
        this.field_133 = 0;
        this.field_135 = 8388659;
        class_97 var5 = class_97.method_867(var1, var2, a$j.LinearLayoutCompat, var3, 0);
        var3 = var5.method_869(a$j.LinearLayoutCompat_android_orientation, -1);
        if (var3 >= 0) {
            this.setOrientation(var3);
        }

        var3 = var5.method_869(a$j.LinearLayoutCompat_android_gravity, -1);
        if (var3 >= 0) {
            this.setGravity(var3);
        }

        boolean var4 = var5.method_873(a$j.LinearLayoutCompat_android_baselineAligned, true);
        if (!var4) {
            this.setBaselineAligned(var4);
        }

        this.field_137 = var5.method_868(a$j.LinearLayoutCompat_android_weightSum, -1.0F);
        this.field_132 = var5.method_869(a$j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.field_138 = var5.method_873(a$j.LinearLayoutCompat_measureWithLargestChild, false);
        this.setDividerDrawable(var5.method_871(a$j.LinearLayoutCompat_divider));
        this.field_144 = var5.method_869(a$j.LinearLayoutCompat_showDividers, 0);
        this.field_145 = var5.method_880(a$j.LinearLayoutCompat_dividerPadding, 0);
        var5.method_872();
    }

    // $FF: renamed from: a (android.view.View, int, int, int, int) void
    private void method_239(View var1, int var2, int var3, int var4, int var5) {
        var1.layout(var2, var3, var2 + var4, var3 + var5);
    }

    // $FF: renamed from: c (int, int) void
    private void method_240(int var1, int var2) {
        int var4 = MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);

        for(int var3 = 0; var3 < var1; ++var3) {
            View var7 = this.method_252(var3);
            if (var7.getVisibility() != 8) {
                w$a var6 = (w$a)var7.getLayoutParams();
                if (var6.width == -1) {
                    int var5 = var6.height;
                    var6.height = var7.getMeasuredHeight();
                    this.measureChildWithMargins(var7, var4, 0, var2, 0);
                    var6.height = var5;
                }
            }
        }

    }

    // $FF: renamed from: d (int, int) void
    private void method_241(int var1, int var2) {
        int var4 = MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);

        for(int var3 = 0; var3 < var1; ++var3) {
            View var6 = this.method_252(var3);
            if (var6.getVisibility() != 8) {
                w$a var7 = (w$a)var6.getLayoutParams();
                if (var7.height == -1) {
                    int var5 = var7.width;
                    var7.width = var6.getMeasuredWidth();
                    this.measureChildWithMargins(var6, var2, 0, var4, 0);
                    var7.width = var5;
                }
            }
        }

    }

    // $FF: renamed from: a (android.view.View) int
    int method_242(View var1) {
        return 0;
    }

    // $FF: renamed from: a (android.view.View, int) int
    int method_243(View var1, int var2) {
        return 0;
    }

    // $FF: renamed from: a (int, int) void
    void method_244(int var1, int var2) {
        this.field_136 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6 = 0;
        int var11 = 0;
        boolean var7 = true;
        float var3 = 0.0F;
        int var19 = this.getVirtualChildCount();
        int var20 = MeasureSpec.getMode(var1);
        int var21 = MeasureSpec.getMode(var2);
        boolean var10 = false;
        boolean var13 = false;
        int var22 = this.field_132;
        boolean var23 = this.field_138;
        int var12 = Integer.MIN_VALUE;

        int var14;
        int var15;
        int var16;
        int var17;
        View var24;
        w$a var25;
        boolean var26;
        int var27;
        boolean var28;
        int var29;
        int var31;
        for(var14 = 0; var14 < var19; var8 = var29) {
            var24 = this.method_252(var14);
            if (var24 == null) {
                this.field_136 += this.method_258(var14);
                var15 = var11;
                var29 = var8;
                var28 = var7;
                var8 = var9;
                var11 = var6;
                var26 = var10;
                var27 = var15;
            } else if (var24.getVisibility() == 8) {
                var16 = var14 + this.method_243(var24, var14);
                var28 = var7;
                var15 = var8;
                var27 = var11;
                var26 = var10;
                var14 = var16;
                var11 = var6;
                var8 = var9;
                var29 = var15;
            } else {
                if (this.method_257(var14)) {
                    this.field_136 += this.field_143;
                }

                var25 = (w$a)var24.getLayoutParams();
                var3 += var25.field_341;
                boolean var34;
                if (var21 == 1073741824 && var25.height == 0 && var25.field_341 > 0.0F) {
                    var31 = this.field_136;
                    this.field_136 = Math.max(var31, var25.topMargin + var31 + var25.bottomMargin);
                    var34 = true;
                    var16 = var12;
                } else {
                    var16 = Integer.MIN_VALUE;
                    var15 = var16;
                    if (var25.height == 0) {
                        var15 = var16;
                        if (var25.field_341 > 0.0F) {
                            var15 = 0;
                            var25.height = -2;
                        }
                    }

                    if (var3 == 0.0F) {
                        var16 = this.field_136;
                    } else {
                        var16 = 0;
                    }

                    this.method_248(var24, var14, var1, 0, var2, var16);
                    if (var15 != Integer.MIN_VALUE) {
                        var25.height = var15;
                    }

                    var17 = var24.getMeasuredHeight();
                    var15 = this.field_136;
                    this.field_136 = Math.max(var15, var15 + var17 + var25.topMargin + var25.bottomMargin + this.method_249(var24));
                    var16 = var12;
                    var34 = var13;
                    if (var23) {
                        var16 = Math.max(var17, var12);
                        var34 = var13;
                    }
                }

                if (var22 >= 0 && var22 == var14 + 1) {
                    this.field_133 = this.field_136;
                }

                if (var14 < var22 && var25.field_341 > 0.0F) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }

                boolean var30 = false;
                if (var20 != 1073741824 && var25.width == -1) {
                    var10 = true;
                    var30 = true;
                }

                var31 = var25.leftMargin + var25.rightMargin;
                var17 = var24.getMeasuredWidth() + var31;
                int var18 = Math.max(var8, var17);
                var9 = View.combineMeasuredStates(var9, var24.getMeasuredState());
                if (var7 && var25.width == -1) {
                    var7 = true;
                } else {
                    var7 = false;
                }

                if (var25.field_341 > 0.0F) {
                    if (!var30) {
                        var31 = var17;
                    }

                    var11 = Math.max(var11, var31);
                    var8 = var6;
                    var6 = var11;
                } else {
                    if (var30) {
                        var17 = var31;
                    }

                    var8 = Math.max(var6, var17);
                    var6 = var11;
                }

                var14 += this.method_243(var24, var14);
                var12 = var16;
                var13 = var34;
                var11 = var8;
                var8 = var9;
                var28 = var7;
                var27 = var6;
                var26 = var10;
                var29 = var18;
            }

            ++var14;
            var15 = var11;
            var11 = var27;
            var10 = var26;
            var6 = var15;
            var9 = var8;
            var7 = var28;
        }

        if (this.field_136 > 0 && this.method_257(var19)) {
            this.field_136 += this.field_143;
        }

        if (var23 && (var21 == Integer.MIN_VALUE || var21 == 0)) {
            this.field_136 = 0;

            for(var14 = 0; var14 < var19; ++var14) {
                View var38 = this.method_252(var14);
                if (var38 == null) {
                    this.field_136 += this.method_258(var14);
                } else if (var38.getVisibility() == 8) {
                    var14 += this.method_243(var38, var14);
                } else {
                    w$a var37 = (w$a)var38.getLayoutParams();
                    var16 = this.field_136;
                    var15 = var37.topMargin;
                    this.field_136 = Math.max(var16, var37.bottomMargin + var15 + var16 + var12 + this.method_249(var38));
                }
            }
        }

        this.field_136 += this.getPaddingTop() + this.getPaddingBottom();
        var16 = View.resolveSizeAndState(Math.max(this.field_136, this.getSuggestedMinimumHeight()), var2, 0);
        var15 = (16777215 & var16) - this.field_136;
        boolean var33;
        if (!var13 && (var15 == 0 || var3 <= 0.0F)) {
            var11 = Math.max(var6, var11);
            if (var23 && var21 != 1073741824) {
                for(var6 = 0; var6 < var19; ++var6) {
                    var24 = this.method_252(var6);
                    if (var24 != null && var24.getVisibility() != 8 && ((w$a)var24.getLayoutParams()).field_341 > 0.0F) {
                        var24.measure(MeasureSpec.makeMeasureSpec(var24.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var12, 1073741824));
                    }
                }
            }

            var6 = var11;
            var33 = var7;
        } else {
            if (this.field_137 > 0.0F) {
                var3 = this.field_137;
            }

            this.field_136 = 0;
            var11 = var6;
            var6 = var9;
            var14 = 0;
            var9 = var8;
            var8 = var11;

            for(var11 = var15; var14 < var19; var6 = var12) {
                var24 = this.method_252(var14);
                if (var24.getVisibility() == 8) {
                    var12 = var11;
                    var31 = var8;
                    var8 = var9;
                    var11 = var6;
                    var28 = var7;
                    var27 = var31;
                    var6 = var12;
                } else {
                    var25 = (w$a)var24.getLayoutParams();
                    float var5 = var25.field_341;
                    var31 = var11;
                    var12 = var6;
                    float var4 = var3;
                    if (var5 > 0.0F) {
                        var31 = (int)((float)var11 * var5 / var3);
                        var17 = getChildMeasureSpec(var1, this.getPaddingLeft() + this.getPaddingRight() + var25.leftMargin + var25.rightMargin, var25.width);
                        if (var25.height == 0 && var21 == 1073741824) {
                            if (var31 > 0) {
                                var12 = var31;
                            } else {
                                var12 = 0;
                            }

                            var24.measure(var17, MeasureSpec.makeMeasureSpec(var12, 1073741824));
                        } else {
                            var15 = var24.getMeasuredHeight() + var31;
                            var12 = var15;
                            if (var15 < 0) {
                                var12 = 0;
                            }

                            var24.measure(var17, MeasureSpec.makeMeasureSpec(var12, 1073741824));
                        }

                        var12 = View.combineMeasuredStates(var6, var24.getMeasuredState() & -256);
                        var31 = var11 - var31;
                        var4 = var3 - var5;
                    }

                    var15 = var25.leftMargin + var25.rightMargin;
                    var11 = var24.getMeasuredWidth() + var15;
                    var9 = Math.max(var9, var11);
                    if (var20 != 1073741824 && var25.width == -1) {
                        var26 = true;
                    } else {
                        var26 = false;
                    }

                    if (var26) {
                        var6 = var15;
                    } else {
                        var6 = var11;
                    }

                    var8 = Math.max(var8, var6);
                    if (var7 && var25.width == -1) {
                        var26 = true;
                    } else {
                        var26 = false;
                    }

                    var11 = this.field_136;
                    var15 = var24.getMeasuredHeight();
                    var27 = var25.topMargin;
                    this.field_136 = Math.max(var11, var25.bottomMargin + var15 + var11 + var27 + this.method_249(var24));
                    var27 = var8;
                    var8 = var9;
                    var28 = var26;
                    var11 = var12;
                    var3 = var4;
                    var6 = var31;
                }

                ++var14;
                var12 = var11;
                var9 = var8;
                var11 = var6;
                var8 = var27;
                var7 = var28;
            }

            this.field_136 += this.getPaddingTop() + this.getPaddingBottom();
            var33 = var7;
            var27 = var8;
            var8 = var9;
            var9 = var6;
            var6 = var27;
        }

        if (var33 || var20 == 1073741824) {
            var6 = var8;
        }

        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(var6 + this.getPaddingLeft() + this.getPaddingRight(), this.getSuggestedMinimumWidth()), var1, var9), var16);
        if (var10) {
            this.method_240(var19, var2);
        }

    }

    // $FF: renamed from: a (int, int, int, int) void
    void method_245(int var1, int var2, int var3, int var4) {
        int var5 = this.getPaddingLeft();
        int var9 = var3 - var1;
        int var7 = this.getPaddingRight();
        int var8 = this.getPaddingRight();
        int var6 = this.getVirtualChildCount();
        var1 = this.field_135;
        int var10 = this.field_135;
        switch(var1 & 112) {
        case 16:
            var1 = this.getPaddingTop() + (var4 - var2 - this.field_136) / 2;
            break;
        case 80:
            var1 = this.getPaddingTop() + var4 - var2 - this.field_136;
            break;
        default:
            var1 = this.getPaddingTop();
        }

        byte var15 = 0;
        var2 = var1;

        for(var1 = var15; var1 < var6; var1 = var3) {
            View var13 = this.method_252(var1);
            if (var13 == null) {
                var3 = this.method_258(var1) + var2;
                var2 = var1;
                var1 = var3;
            } else if (var13.getVisibility() != 8) {
                int var11 = var13.getMeasuredWidth();
                int var12 = var13.getMeasuredHeight();
                w$a var14 = (w$a)var13.getLayoutParams();
                var4 = var14.field_342;
                var3 = var4;
                if (var4 < 0) {
                    var3 = 8388615 & var10;
                }

                switch(class_142.method_1195(var3, class_146.method_1222(this)) & 7) {
                case 1:
                    var3 = (var9 - var5 - var8 - var11) / 2 + var5 + var14.leftMargin - var14.rightMargin;
                    break;
                case 5:
                    var3 = var9 - var7 - var11 - var14.rightMargin;
                    break;
                default:
                    var3 = var5 + var14.leftMargin;
                }

                var4 = var2;
                if (this.method_257(var1)) {
                    var4 = var2 + this.field_143;
                }

                var2 = var4 + var14.topMargin;
                this.method_239(var13, var3, var2 + this.method_242(var13), var11, var12);
                var2 += var14.bottomMargin + var12 + this.method_249(var13);
                var3 = this.method_243(var13, var1) + var1;
                var1 = var2;
                var2 = var3;
            } else {
                var3 = var2;
                var2 = var1;
                var1 = var3;
            }

            var3 = var2 + 1;
            var2 = var1;
        }

    }

    // $FF: renamed from: a (android.graphics.Canvas) void
    void method_246(Canvas var1) {
        int var3 = this.getVirtualChildCount();

        int var2;
        w$a var4;
        View var5;
        for(var2 = 0; var2 < var3; ++var2) {
            var5 = this.method_252(var2);
            if (var5 != null && var5.getVisibility() != 8 && this.method_257(var2)) {
                var4 = (w$a)var5.getLayoutParams();
                this.method_247(var1, var5.getTop() - var4.topMargin - this.field_143);
            }
        }

        if (this.method_257(var3)) {
            var5 = this.method_252(var3 - 1);
            if (var5 == null) {
                var2 = this.getHeight() - this.getPaddingBottom() - this.field_143;
            } else {
                var4 = (w$a)var5.getLayoutParams();
                var2 = var5.getBottom();
                var2 += var4.bottomMargin;
            }

            this.method_247(var1, var2);
        }

    }

    // $FF: renamed from: a (android.graphics.Canvas, int) void
    void method_247(Canvas var1, int var2) {
        this.field_141.setBounds(this.getPaddingLeft() + this.field_145, var2, this.getWidth() - this.getPaddingRight() - this.field_145, this.field_143 + var2);
        this.field_141.draw(var1);
    }

    // $FF: renamed from: a (android.view.View, int, int, int, int, int) void
    void method_248(View var1, int var2, int var3, int var4, int var5, int var6) {
        this.measureChildWithMargins(var1, var3, var4, var5, var6);
    }

    // $FF: renamed from: b (android.view.View) int
    int method_249(View var1) {
        return 0;
    }

    // $FF: renamed from: b (android.util.AttributeSet) android.support.v7.widget.w$a
    public w$a method_250(AttributeSet var1) {
        return new w$a(this.getContext(), var1);
    }

    // $FF: renamed from: b (android.view.ViewGroup.LayoutParams) android.support.v7.widget.w$a
    protected w$a method_251(LayoutParams var1) {
        return new w$a(var1);
    }

    // $FF: renamed from: b (int) android.view.View
    View method_252(int var1) {
        return this.getChildAt(var1);
    }

    // $FF: renamed from: b (int, int) void
    void method_253(int var1, int var2) {
        this.field_136 = 0;
        int var13 = 0;
        int var8 = 0;
        int var6 = 0;
        int var10 = 0;
        boolean var7 = true;
        float var3 = 0.0F;
        int var21 = this.getVirtualChildCount();
        int var23 = MeasureSpec.getMode(var1);
        int var22 = MeasureSpec.getMode(var2);
        boolean var9 = false;
        boolean var12 = false;
        if (this.field_139 == null || this.field_140 == null) {
            this.field_139 = new int[4];
            this.field_140 = new int[4];
        }

        int[] var27 = this.field_139;
        int[] var26 = this.field_140;
        var27[3] = -1;
        var27[2] = -1;
        var27[1] = -1;
        var27[0] = -1;
        var26[3] = -1;
        var26[2] = -1;
        var26[1] = -1;
        var26[0] = -1;
        boolean var25 = this.field_131;
        boolean var24 = this.field_138;
        boolean var17;
        if (var23 == 1073741824) {
            var17 = true;
        } else {
            var17 = false;
        }

        int var11 = Integer.MIN_VALUE;

        int var14;
        int var15;
        int var16;
        int var18;
        View var28;
        w$a var29;
        boolean var33;
        boolean var34;
        int var36;
        boolean var37;
        for(var14 = 0; var14 < var21; var12 = var37) {
            var28 = this.method_252(var14);
            int var30;
            boolean var35;
            if (var28 == null) {
                this.field_136 += this.method_258(var14);
                var15 = var10;
                var30 = var13;
                var37 = var12;
                var36 = var11;
                var10 = var8;
                var35 = var7;
                var11 = var6;
                var7 = var9;
                var6 = var15;
            } else {
                int var19;
                if (var28.getVisibility() == 8) {
                    var19 = var14 + this.method_243(var28, var14);
                    var30 = var13;
                    var33 = var7;
                    var15 = var11;
                    var11 = var6;
                    var6 = var10;
                    var7 = var9;
                    var14 = var19;
                    var35 = var33;
                    var10 = var8;
                    var36 = var15;
                    var37 = var12;
                } else {
                    if (this.method_257(var14)) {
                        this.field_136 += this.field_142;
                    }

                    var29 = (w$a)var28.getLayoutParams();
                    var3 += var29.field_341;
                    boolean var38;
                    if (var23 == 1073741824 && var29.width == 0 && var29.field_341 > 0.0F) {
                        if (var17) {
                            this.field_136 += var29.leftMargin + var29.rightMargin;
                        } else {
                            var15 = this.field_136;
                            this.field_136 = Math.max(var15, var29.leftMargin + var15 + var29.rightMargin);
                        }

                        if (var25) {
                            var15 = MeasureSpec.makeMeasureSpec(0, 0);
                            var28.measure(var15, var15);
                            var38 = var12;
                            var16 = var11;
                        } else {
                            var38 = true;
                            var16 = var11;
                        }
                    } else {
                        var16 = Integer.MIN_VALUE;
                        var15 = var16;
                        if (var29.width == 0) {
                            var15 = var16;
                            if (var29.field_341 > 0.0F) {
                                var15 = 0;
                                var29.width = -2;
                            }
                        }

                        if (var3 == 0.0F) {
                            var16 = this.field_136;
                        } else {
                            var16 = 0;
                        }

                        this.method_248(var28, var14, var1, var16, var2, 0);
                        if (var15 != Integer.MIN_VALUE) {
                            var29.width = var15;
                        }

                        var18 = var28.getMeasuredWidth();
                        if (var17) {
                            this.field_136 += var29.leftMargin + var18 + var29.rightMargin + this.method_249(var28);
                        } else {
                            var15 = this.field_136;
                            this.field_136 = Math.max(var15, var15 + var18 + var29.leftMargin + var29.rightMargin + this.method_249(var28));
                        }

                        var16 = var11;
                        var38 = var12;
                        if (var24) {
                            var16 = Math.max(var18, var11);
                            var38 = var12;
                        }
                    }

                    var34 = false;
                    if (var22 != 1073741824 && var29.height == -1) {
                        var9 = true;
                        var34 = true;
                    }

                    var36 = var29.topMargin;
                    var36 += var29.bottomMargin;
                    var18 = var28.getMeasuredHeight() + var36;
                    var19 = View.combineMeasuredStates(var8, var28.getMeasuredState());
                    int var20;
                    if (var25) {
                        var20 = var28.getBaseline();
                        if (var20 != -1) {
                            if (var29.field_342 < 0) {
                                var8 = this.field_135;
                            } else {
                                var8 = var29.field_342;
                            }

                            var8 = ((var8 & 112) >> 4 & -2) >> 1;
                            var27[var8] = Math.max(var27[var8], var20);
                            var26[var8] = Math.max(var26[var8], var18 - var20);
                        }
                    }

                    var20 = Math.max(var13, var18);
                    if (var7 && var29.height == -1) {
                        var7 = true;
                    } else {
                        var7 = false;
                    }

                    if (var29.field_341 > 0.0F) {
                        if (var34) {
                            var8 = var36;
                        } else {
                            var8 = var18;
                        }

                        var10 = Math.max(var10, var8);
                        var8 = var6;
                        var6 = var10;
                    } else {
                        if (var34) {
                            var18 = var36;
                        }

                        var8 = Math.max(var6, var18);
                        var6 = var10;
                    }

                    var14 += this.method_243(var28, var14);
                    var36 = var16;
                    var37 = var38;
                    var33 = var7;
                    var7 = var9;
                    var11 = var8;
                    var30 = var20;
                    var35 = var33;
                    var10 = var19;
                }
            }

            ++var14;
            var16 = var11;
            var11 = var36;
            var13 = var30;
            var36 = var10;
            var10 = var6;
            var9 = var7;
            var6 = var16;
            var7 = var35;
            var8 = var36;
        }

        if (this.field_136 > 0 && this.method_257(var21)) {
            this.field_136 += this.field_142;
        }

        if (var27[1] == -1 && var27[0] == -1 && var27[2] == -1 && var27[3] == -1) {
            var14 = var13;
        } else {
            var14 = Math.max(var13, Math.max(var27[3], Math.max(var27[0], Math.max(var27[1], var27[2]))) + Math.max(var26[3], Math.max(var26[0], Math.max(var26[1], var26[2]))));
        }

        if (var24 && (var23 == Integer.MIN_VALUE || var23 == 0)) {
            this.field_136 = 0;

            for(var13 = 0; var13 < var21; ++var13) {
                View var43 = this.method_252(var13);
                if (var43 == null) {
                    this.field_136 += this.method_258(var13);
                } else if (var43.getVisibility() == 8) {
                    var13 += this.method_243(var43, var13);
                } else {
                    w$a var42 = (w$a)var43.getLayoutParams();
                    if (var17) {
                        var16 = this.field_136;
                        var15 = var42.leftMargin;
                        this.field_136 = var42.rightMargin + var15 + var11 + this.method_249(var43) + var16;
                    } else {
                        var16 = this.field_136;
                        var15 = var42.leftMargin;
                        this.field_136 = Math.max(var16, var42.rightMargin + var15 + var16 + var11 + this.method_249(var43));
                    }
                }
            }
        }

        this.field_136 += this.getPaddingLeft() + this.getPaddingRight();
        var16 = View.resolveSizeAndState(Math.max(this.field_136, this.getSuggestedMinimumWidth()), var1, 0);
        var13 = (16777215 & var16) - this.field_136;
        int var31;
        if (var12 || var13 != 0 && var3 > 0.0F) {
            if (this.field_137 > 0.0F) {
                var3 = this.field_137;
            }

            var27[3] = -1;
            var27[2] = -1;
            var27[1] = -1;
            var27[0] = -1;
            var26[3] = -1;
            var26[2] = -1;
            var26[1] = -1;
            var26[0] = -1;
            this.field_136 = 0;
            var10 = -1;
            var14 = 0;
            var36 = var8;
            var11 = var13;
            var8 = var6;

            for(var6 = var36; var14 < var21; var7 = var33) {
                var28 = this.method_252(var14);
                if (var28 != null) {
                    if (var28.getVisibility() == 8) {
                        var33 = var7;
                        var31 = var10;
                    } else {
                        var29 = (w$a)var28.getLayoutParams();
                        float var5 = var29.field_341;
                        var13 = var6;
                        var36 = var11;
                        float var4 = var3;
                        if (var5 > 0.0F) {
                            var13 = (int)((float)var11 * var5 / var3);
                            var18 = getChildMeasureSpec(var2, this.getPaddingTop() + this.getPaddingBottom() + var29.topMargin + var29.bottomMargin, var29.height);
                            if (var29.width == 0 && var23 == 1073741824) {
                                if (var13 > 0) {
                                    var36 = var13;
                                } else {
                                    var36 = 0;
                                }

                                var28.measure(MeasureSpec.makeMeasureSpec(var36, 1073741824), var18);
                            } else {
                                var15 = var28.getMeasuredWidth() + var13;
                                var36 = var15;
                                if (var15 < 0) {
                                    var36 = 0;
                                }

                                var28.measure(MeasureSpec.makeMeasureSpec(var36, 1073741824), var18);
                            }

                            var6 = View.combineMeasuredStates(var6, var28.getMeasuredState() & -16777216);
                            var4 = var3 - var5;
                            var36 = var11 - var13;
                            var13 = var6;
                        }

                        if (var17) {
                            this.field_136 += var28.getMeasuredWidth() + var29.leftMargin + var29.rightMargin + this.method_249(var28);
                        } else {
                            var6 = this.field_136;
                            this.field_136 = Math.max(var6, var28.getMeasuredWidth() + var6 + var29.leftMargin + var29.rightMargin + this.method_249(var28));
                        }

                        boolean var32;
                        if (var22 != 1073741824 && var29.height == -1) {
                            var32 = true;
                        } else {
                            var32 = false;
                        }

                        var15 = var29.topMargin + var29.bottomMargin;
                        var11 = var28.getMeasuredHeight() + var15;
                        var10 = Math.max(var10, var11);
                        if (var32) {
                            var6 = var15;
                        } else {
                            var6 = var11;
                        }

                        var8 = Math.max(var8, var6);
                        if (var7 && var29.height == -1) {
                            var32 = true;
                        } else {
                            var32 = false;
                        }

                        if (var25) {
                            var15 = var28.getBaseline();
                            if (var15 != -1) {
                                if (var29.field_342 < 0) {
                                    var31 = this.field_135;
                                } else {
                                    var31 = var29.field_342;
                                }

                                var31 = ((var31 & 112) >> 4 & -2) >> 1;
                                var27[var31] = Math.max(var27[var31], var15);
                                var26[var31] = Math.max(var26[var31], var11 - var15);
                            }
                        }

                        var31 = var10;
                        var33 = var32;
                        var11 = var36;
                        var3 = var4;
                        var6 = var13;
                    }
                } else {
                    var31 = var10;
                    var33 = var7;
                }

                ++var14;
                var10 = var31;
            }

            label223: {
                this.field_136 += this.getPaddingLeft() + this.getPaddingRight();
                if (var27[1] == -1 && var27[0] == -1 && var27[2] == -1) {
                    var11 = var10;
                    if (var27[3] == -1) {
                        break label223;
                    }
                }

                var11 = Math.max(var10, Math.max(var27[3], Math.max(var27[0], Math.max(var27[1], var27[2]))) + Math.max(var26[3], Math.max(var26[0], Math.max(var26[1], var26[2]))));
            }

            var31 = var6;
            var34 = var7;
            var10 = var11;
            var6 = var8;
        } else {
            var10 = Math.max(var6, var10);
            if (var24 && var23 != 1073741824) {
                for(var6 = 0; var6 < var21; ++var6) {
                    View var41 = this.method_252(var6);
                    if (var41 != null && var41.getVisibility() != 8 && ((w$a)var41.getLayoutParams()).field_341 > 0.0F) {
                        var41.measure(MeasureSpec.makeMeasureSpec(var11, 1073741824), MeasureSpec.makeMeasureSpec(var41.getMeasuredHeight(), 1073741824));
                    }
                }
            }

            var6 = var10;
            var10 = var14;
            var34 = var7;
            var31 = var8;
        }

        if (var34 || var22 == 1073741824) {
            var6 = var10;
        }

        this.setMeasuredDimension(-16777216 & var31 | var16, View.resolveSizeAndState(Math.max(var6 + this.getPaddingTop() + this.getPaddingBottom(), this.getSuggestedMinimumHeight()), var2, var31 << 16));
        if (var9) {
            this.method_241(var21, var1);
        }

    }

    // $FF: renamed from: b (int, int, int, int) void
    void method_254(int var1, int var2, int var3, int var4) {
        boolean var17 = class_105.method_912(this);
        int var7 = this.getPaddingTop();
        int var12 = var4 - var2;
        int var10 = this.getPaddingBottom();
        int var9 = this.getPaddingBottom();
        int var13 = this.getVirtualChildCount();
        var2 = this.field_135;
        int var11 = this.field_135;
        boolean var18 = this.field_131;
        int[] var19 = this.field_139;
        int[] var22 = this.field_140;
        switch(class_142.method_1195(var2 & 8388615, class_146.method_1222(this))) {
        case 1:
            var2 = this.getPaddingLeft();
            var3 = (var3 - var1 - this.field_136) / 2 + var2;
            break;
        case 5:
            var3 = this.getPaddingLeft() + var3 - var1 - this.field_136;
            break;
        default:
            var3 = this.getPaddingLeft();
        }

        byte var5;
        if (var17) {
            var4 = var13 - 1;
            var5 = -1;
        } else {
            var4 = 0;
            var5 = 1;
        }

        for(var2 = 0; var2 < var13; var3 = var1) {
            int var14 = var4 + var5 * var2;
            View var21 = this.method_252(var14);
            if (var21 == null) {
                var1 = this.method_258(var14) + var3;
            } else if (var21.getVisibility() == 8) {
                var1 = var3;
            } else {
                int var15 = var21.getMeasuredWidth();
                int var16 = var21.getMeasuredHeight();
                w$a var20 = (w$a)var21.getLayoutParams();
                int var6;
                if (var18 && var20.height != -1) {
                    var6 = var21.getBaseline();
                } else {
                    var6 = -1;
                }

                int var8 = var20.field_342;
                var1 = var8;
                if (var8 < 0) {
                    var1 = var11 & 112;
                }

                switch(var1 & 112) {
                case 16:
                    var1 = (var12 - var7 - var9 - var16) / 2 + var7 + var20.topMargin - var20.bottomMargin;
                    break;
                case 48:
                    var8 = var20.topMargin + var7;
                    var1 = var8;
                    if (var6 != -1) {
                        var1 = var8 + (var19[1] - var6);
                    }
                    break;
                case 80:
                    var8 = var12 - var10 - var16 - var20.bottomMargin;
                    var1 = var8;
                    if (var6 != -1) {
                        var1 = var21.getMeasuredHeight();
                        var1 = var8 - (var22[2] - (var1 - var6));
                    }
                    break;
                default:
                    var1 = var7;
                }

                var6 = var3;
                if (this.method_257(var14)) {
                    var6 = var3 + this.field_142;
                }

                var3 = var6 + var20.leftMargin;
                this.method_239(var21, var3 + this.method_242(var21), var1, var15, var16);
                var1 = var20.rightMargin + var15 + this.method_249(var21) + var3;
                var2 += this.method_243(var21, var14);
            }

            ++var2;
        }

    }

    // $FF: renamed from: b (android.graphics.Canvas) void
    void method_255(Canvas var1) {
        int var4 = this.getVirtualChildCount();
        boolean var5 = class_105.method_912(this);

        int var2;
        for(var2 = 0; var2 < var4; ++var2) {
            View var7 = this.method_252(var2);
            if (var7 != null && var7.getVisibility() != 8 && this.method_257(var2)) {
                w$a var6 = (w$a)var7.getLayoutParams();
                int var3;
                if (var5) {
                    var3 = var7.getRight();
                    var3 += var6.rightMargin;
                } else {
                    var3 = var7.getLeft() - var6.leftMargin - this.field_142;
                }

                this.method_256(var1, var3);
            }
        }

        if (this.method_257(var4)) {
            View var8 = this.method_252(var4 - 1);
            if (var8 == null) {
                if (var5) {
                    var2 = this.getPaddingLeft();
                } else {
                    var2 = this.getWidth() - this.getPaddingRight() - this.field_142;
                }
            } else {
                w$a var9 = (w$a)var8.getLayoutParams();
                if (var5) {
                    var2 = var8.getLeft() - var9.leftMargin - this.field_142;
                } else {
                    var2 = var8.getRight();
                    var2 += var9.rightMargin;
                }
            }

            this.method_256(var1, var2);
        }

    }

    // $FF: renamed from: b (android.graphics.Canvas, int) void
    void method_256(Canvas var1, int var2) {
        this.field_141.setBounds(var2, this.getPaddingTop() + this.field_145, this.field_142 + var2, this.getHeight() - this.getPaddingBottom() - this.field_145);
        this.field_141.draw(var1);
    }

    // $FF: renamed from: c (int) boolean
    protected boolean method_257(int var1) {
        boolean var3 = true;
        boolean var2;
        if (var1 == 0) {
            if ((this.field_144 & 1) != 0) {
                var2 = var3;
            } else {
                var2 = false;
            }
        } else if (var1 == this.getChildCount()) {
            var2 = var3;
            if ((this.field_144 & 4) == 0) {
                var2 = false;
            }
        } else if ((this.field_144 & 2) != 0) {
            --var1;

            while(true) {
                if (var1 < 0) {
                    var2 = false;
                    break;
                }

                var2 = var3;
                if (this.getChildAt(var1).getVisibility() != 8) {
                    break;
                }

                --var1;
            }
        } else {
            var2 = false;
        }

        return var2;
    }

    protected boolean checkLayoutParams(LayoutParams var1) {
        return var1 instanceof w$a;
    }

    // $FF: renamed from: d (int) int
    int method_258(int var1) {
        return 0;
    }

    // $FF: renamed from: g () android.support.v7.widget.w$a
    protected w$a method_259() {
        w$a var1;
        if (this.field_134 == 0) {
            var1 = new w$a(-2, -2);
        } else if (this.field_134 == 1) {
            var1 = new w$a(-1, -2);
        } else {
            var1 = null;
        }

        return var1;
    }

    // $FF: synthetic method
    protected LayoutParams generateDefaultLayoutParams() {
        return this.method_259();
    }

    // $FF: synthetic method
    public LayoutParams generateLayoutParams(AttributeSet var1) {
        return this.method_250(var1);
    }

    // $FF: synthetic method
    protected LayoutParams generateLayoutParams(LayoutParams var1) {
        return this.method_251(var1);
    }

    public int getBaseline() {
        int var1 = -1;
        if (this.field_132 < 0) {
            var1 = super.getBaseline();
        } else {
            if (this.getChildCount() <= this.field_132) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            }

            View var4 = this.getChildAt(this.field_132);
            int var2 = var4.getBaseline();
            if (var2 == -1) {
                if (this.field_132 != 0) {
                    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                }
            } else {
                var1 = this.field_133;
                if (this.field_134 == 1) {
                    int var3 = this.field_135 & 112;
                    if (var3 != 48) {
                        switch(var3) {
                        case 16:
                            var1 += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.field_136) / 2;
                            break;
                        case 80:
                            var1 = this.getBottom() - this.getTop() - this.getPaddingBottom() - this.field_136;
                        }
                    }
                }

                var1 = ((w$a)var4.getLayoutParams()).topMargin + var1 + var2;
            }
        }

        return var1;
    }

    public int getBaselineAlignedChildIndex() {
        return this.field_132;
    }

    public Drawable getDividerDrawable() {
        return this.field_141;
    }

    public int getDividerPadding() {
        return this.field_145;
    }

    public int getDividerWidth() {
        return this.field_142;
    }

    public int getGravity() {
        return this.field_135;
    }

    public int getOrientation() {
        return this.field_134;
    }

    public int getShowDividers() {
        return this.field_144;
    }

    int getVirtualChildCount() {
        return this.getChildCount();
    }

    public float getWeightSum() {
        return this.field_137;
    }

    protected void onDraw(Canvas var1) {
        if (this.field_141 != null) {
            if (this.field_134 == 1) {
                this.method_246(var1);
            } else {
                this.method_255(var1);
            }
        }

    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(var1);
            var1.setClassName(w.class.getName());
        }

    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(var1);
            var1.setClassName(w.class.getName());
        }

    }

    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        if (this.field_134 == 1) {
            this.method_245(var2, var3, var4, var5);
        } else {
            this.method_254(var2, var3, var4, var5);
        }

    }

    protected void onMeasure(int var1, int var2) {
        if (this.field_134 == 1) {
            this.method_244(var1, var2);
        } else {
            this.method_253(var1, var2);
        }

    }

    public void setBaselineAligned(boolean var1) {
        this.field_131 = var1;
    }

    public void setBaselineAlignedChildIndex(int var1) {
        if (var1 >= 0 && var1 < this.getChildCount()) {
            this.field_132 = var1;
        } else {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + this.getChildCount() + ")");
        }
    }

    public void setDividerDrawable(Drawable var1) {
        boolean var2 = false;
        if (var1 != this.field_141) {
            this.field_141 = var1;
            if (var1 != null) {
                this.field_142 = var1.getIntrinsicWidth();
                this.field_143 = var1.getIntrinsicHeight();
            } else {
                this.field_142 = 0;
                this.field_143 = 0;
            }

            if (var1 == null) {
                var2 = true;
            }

            this.setWillNotDraw(var2);
            this.requestLayout();
        }

    }

    public void setDividerPadding(int var1) {
        this.field_145 = var1;
    }

    public void setGravity(int var1) {
        if (this.field_135 != var1) {
            if ((8388615 & var1) == 0) {
                var1 |= 8388611;
            }

            int var2 = var1;
            if ((var1 & 112) == 0) {
                var2 = var1 | 48;
            }

            this.field_135 = var2;
            this.requestLayout();
        }

    }

    public void setHorizontalGravity(int var1) {
        var1 &= 8388615;
        if ((this.field_135 & 8388615) != var1) {
            this.field_135 = var1 | this.field_135 & -8388616;
            this.requestLayout();
        }

    }

    public void setMeasureWithLargestChildEnabled(boolean var1) {
        this.field_138 = var1;
    }

    public void setOrientation(int var1) {
        if (this.field_134 != var1) {
            this.field_134 = var1;
            this.requestLayout();
        }

    }

    public void setShowDividers(int var1) {
        if (var1 != this.field_144) {
            this.requestLayout();
        }

        this.field_144 = var1;
    }

    public void setVerticalGravity(int var1) {
        var1 &= 112;
        if ((this.field_135 & 112) != var1) {
            this.field_135 = var1 | this.field_135 & -113;
            this.requestLayout();
        }

    }

    public void setWeightSum(float var1) {
        this.field_137 = Math.max(0.0F, var1);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
