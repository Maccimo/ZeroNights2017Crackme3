package android.support.v7.widget;

import android.content.Context;
import android.support.v4.h.class_146;
import android.support.v7.a.a$f;
import android.support.v7.a.a$g;
import android.support.v7.a.a$j;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends class_29 {
    // $FF: renamed from: g java.lang.CharSequence
    private CharSequence field_106;
    // $FF: renamed from: h java.lang.CharSequence
    private CharSequence field_107;
    // $FF: renamed from: i android.view.View
    private View field_108;
    // $FF: renamed from: j android.view.View
    private View field_109;
    // $FF: renamed from: k android.widget.LinearLayout
    private LinearLayout field_110;
    // $FF: renamed from: l android.widget.TextView
    private TextView field_111;
    // $FF: renamed from: m android.widget.TextView
    private TextView field_112;
    // $FF: renamed from: n int
    private int field_113;
    // $FF: renamed from: o int
    private int field_114;
    // $FF: renamed from: p boolean
    private boolean field_115;
    // $FF: renamed from: q int
    private int field_116;

    public ActionBarContextView(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public ActionBarContextView(Context var1, AttributeSet var2) {
        this(var1, var2, android.support.v7.a.a$a.actionModeStyle);
    }

    public ActionBarContextView(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        class_97 var4 = class_97.method_867(var1, var2, a$j.ActionMode, var3, 0);
        class_146.method_1218(this, var4.method_871(a$j.ActionMode_background));
        this.field_113 = var4.method_884(a$j.ActionMode_titleTextStyle, 0);
        this.field_114 = var4.method_884(a$j.ActionMode_subtitleTextStyle, 0);
        this.e = var4.method_882(a$j.ActionMode_height, 0);
        this.field_116 = var4.method_884(a$j.ActionMode_closeItemLayout, a$g.abc_action_mode_close_item_material);
        var4.method_872();
    }

    // $FF: renamed from: a () void
    private void method_228() {
        byte var4 = 8;
        boolean var2 = true;
        if (this.field_110 == null) {
            LayoutInflater.from(this.getContext()).inflate(a$g.abc_action_bar_title_item, this);
            this.field_110 = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.field_111 = (TextView)this.field_110.findViewById(a$f.action_bar_title);
            this.field_112 = (TextView)this.field_110.findViewById(a$f.action_bar_subtitle);
            if (this.field_113 != 0) {
                this.field_111.setTextAppearance(this.getContext(), this.field_113);
            }

            if (this.field_114 != 0) {
                this.field_112.setTextAppearance(this.getContext(), this.field_114);
            }
        }

        this.field_111.setText(this.field_106);
        this.field_112.setText(this.field_107);
        boolean var1;
        if (!TextUtils.isEmpty(this.field_106)) {
            var1 = true;
        } else {
            var1 = false;
        }

        if (TextUtils.isEmpty(this.field_107)) {
            var2 = false;
        }

        TextView var5 = this.field_112;
        byte var3;
        if (var2) {
            var3 = 0;
        } else {
            var3 = 8;
        }

        byte var6;
        LinearLayout var7;
        label33: {
            var5.setVisibility(var3);
            var7 = this.field_110;
            if (!var1) {
                var6 = var4;
                if (!var2) {
                    break label33;
                }
            }

            var6 = 0;
        }

        var7.setVisibility(var6);
        if (this.field_110.getParent() == null) {
            this.addView(this.field_110);
        }

    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet var1) {
        return new MarginLayoutParams(this.getContext(), var1);
    }

    public CharSequence getSubtitle() {
        return this.field_107;
    }

    public CharSequence getTitle() {
        return this.field_106;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.method_692();
            this.d.method_694();
        }

    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
        if (var1.getEventType() == 32) {
            var1.setSource(this);
            var1.setClassName(this.getClass().getName());
            var1.setPackageName(this.getContext().getPackageName());
            var1.setContentDescription(this.field_106);
        } else {
            super.onInitializeAccessibilityEvent(var1);
        }

    }

    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        var1 = class_105.method_912(this);
        int var6;
        if (var1) {
            var6 = var4 - var2 - this.getPaddingRight();
        } else {
            var6 = this.getPaddingLeft();
        }

        int var7 = this.getPaddingTop();
        int var8 = var5 - var3 - this.getPaddingTop() - this.getPaddingBottom();
        if (this.field_108 != null && this.field_108.getVisibility() != 8) {
            MarginLayoutParams var9 = (MarginLayoutParams)this.field_108.getLayoutParams();
            if (var1) {
                var3 = var9.rightMargin;
            } else {
                var3 = var9.leftMargin;
            }

            if (var1) {
                var5 = var9.leftMargin;
            } else {
                var5 = var9.rightMargin;
            }

            var3 = a(var6, var3, var1);
            var3 = a(this.a(this.field_108, var3, var7, var8, var1) + var3, var5, var1);
        } else {
            var3 = var6;
        }

        var5 = var3;
        if (this.field_110 != null) {
            var5 = var3;
            if (this.field_109 == null) {
                var5 = var3;
                if (this.field_110.getVisibility() != 8) {
                    var5 = var3 + this.a(this.field_110, var3, var7, var8, var1);
                }
            }
        }

        if (this.field_109 != null) {
            this.a(this.field_109, var5, var7, var8, var1);
        }

        if (var1) {
            var2 = this.getPaddingLeft();
        } else {
            var2 = var4 - var2 - this.getPaddingRight();
        }

        if (this.c != null) {
            ActionMenuView var10 = this.c;
            if (!var1) {
                var1 = true;
            } else {
                var1 = false;
            }

            this.a(var10, var2, var7, var8, var1);
        }

    }

    protected void onMeasure(int var1, int var2) {
        int var5 = 1073741824;
        byte var6 = 0;
        if (MeasureSpec.getMode(var1) != 1073741824) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (MeasureSpec.getMode(var2) == 0) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        } else {
            int var8 = MeasureSpec.getSize(var1);
            int var3;
            if (this.e > 0) {
                var3 = this.e;
            } else {
                var3 = MeasureSpec.getSize(var2);
            }

            int var9 = this.getPaddingTop() + this.getPaddingBottom();
            var1 = var8 - this.getPaddingLeft() - this.getPaddingRight();
            int var7 = var3 - var9;
            int var4 = MeasureSpec.makeMeasureSpec(var7, Integer.MIN_VALUE);
            var2 = var1;
            if (this.field_108 != null) {
                var2 = this.a(this.field_108, var1, var4, 0);
                MarginLayoutParams var11 = (MarginLayoutParams)this.field_108.getLayoutParams();
                var1 = var11.leftMargin;
                var2 -= var11.rightMargin + var1;
            }

            var1 = var2;
            if (this.c != null) {
                var1 = var2;
                if (this.c.getParent() == this) {
                    var1 = this.a(this.c, var2, var4, 0);
                }
            }

            var2 = var1;
            if (this.field_110 != null) {
                var2 = var1;
                if (this.field_109 == null) {
                    if (this.field_115) {
                        var2 = MeasureSpec.makeMeasureSpec(0, 0);
                        this.field_110.measure(var2, var4);
                        int var10 = this.field_110.getMeasuredWidth();
                        boolean var13;
                        if (var10 <= var1) {
                            var13 = true;
                        } else {
                            var13 = false;
                        }

                        var2 = var1;
                        if (var13) {
                            var2 = var1 - var10;
                        }

                        LinearLayout var14 = this.field_110;
                        byte var12;
                        if (var13) {
                            var12 = 0;
                        } else {
                            var12 = 8;
                        }

                        var14.setVisibility(var12);
                    } else {
                        var2 = this.a(this.field_110, var1, var4, 0);
                    }
                }
            }

            if (this.field_109 != null) {
                LayoutParams var15 = this.field_109.getLayoutParams();
                if (var15.width != -2) {
                    var1 = 1073741824;
                } else {
                    var1 = Integer.MIN_VALUE;
                }

                var4 = var2;
                if (var15.width >= 0) {
                    var4 = Math.min(var15.width, var2);
                }

                if (var15.height != -2) {
                    var2 = var5;
                } else {
                    var2 = Integer.MIN_VALUE;
                }

                if (var15.height >= 0) {
                    var5 = Math.min(var15.height, var7);
                } else {
                    var5 = var7;
                }

                this.field_109.measure(MeasureSpec.makeMeasureSpec(var4, var1), MeasureSpec.makeMeasureSpec(var5, var2));
            }

            if (this.e <= 0) {
                var4 = this.getChildCount();
                var1 = 0;

                for(var2 = var6; var2 < var4; ++var2) {
                    var3 = this.getChildAt(var2).getMeasuredHeight() + var9;
                    if (var3 > var1) {
                        var1 = var3;
                    }
                }

                this.setMeasuredDimension(var8, var1);
            } else {
                this.setMeasuredDimension(var8, var3);
            }

        }
    }

    public void setContentHeight(int var1) {
        this.e = var1;
    }

    public void setCustomView(View var1) {
        if (this.field_109 != null) {
            this.removeView(this.field_109);
        }

        this.field_109 = var1;
        if (var1 != null && this.field_110 != null) {
            this.removeView(this.field_110);
            this.field_110 = null;
        }

        if (var1 != null) {
            this.addView(var1);
        }

        this.requestLayout();
    }

    public void setSubtitle(CharSequence var1) {
        this.field_107 = var1;
        this.method_228();
    }

    public void setTitle(CharSequence var1) {
        this.field_106 = var1;
        this.method_228();
    }

    public void setTitleOptional(boolean var1) {
        if (var1 != this.field_115) {
            this.requestLayout();
        }

        this.field_115 = var1;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
