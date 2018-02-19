package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.a.a$j;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.class_100;
import android.support.v7.widget.class_30;
import android.support.v7.widget.class_63;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

public class ActionMenuItemView extends class_63 implements n$a, ActionMenuView.class_211, OnClickListener {
    // $FF: renamed from: a android.support.v7.view.menu.h
    class_168 field_580;
    // $FF: renamed from: b android.support.v7.view.menu.g$b
    g$b field_581;
    // $FF: renamed from: c android.support.v7.view.menu.ActionMenuItemView$b
    ActionMenuItemView.class_338 field_582;
    // $FF: renamed from: d java.lang.CharSequence
    private CharSequence field_583;
    // $FF: renamed from: e android.graphics.drawable.Drawable
    private Drawable field_584;
    // $FF: renamed from: f android.support.v7.widget.v
    private class_30 field_585;
    // $FF: renamed from: g boolean
    private boolean field_586;
    // $FF: renamed from: h boolean
    private boolean field_587;
    // $FF: renamed from: i int
    private int field_588;
    // $FF: renamed from: j int
    private int field_589;
    // $FF: renamed from: k int
    private int field_590;

    public ActionMenuItemView(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public ActionMenuItemView(Context var1, AttributeSet var2) {
        this(var1, var2, 0);
    }

    public ActionMenuItemView(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        Resources var4 = var1.getResources();
        this.field_586 = this.method_614();
        TypedArray var5 = var1.obtainStyledAttributes(var2, a$j.ActionMenuItemView, var3, 0);
        this.field_588 = var5.getDimensionPixelSize(a$j.ActionMenuItemView_android_minWidth, 0);
        var5.recycle();
        this.field_590 = (int)(var4.getDisplayMetrics().density * 32.0F + 0.5F);
        this.setOnClickListener(this);
        this.field_589 = -1;
        this.setSaveEnabled(false);
    }

    // $FF: renamed from: e () boolean
    private boolean method_614() {
        Configuration var4 = this.getContext().getResources().getConfiguration();
        int var1 = var4.screenWidthDp;
        int var2 = var4.screenHeightDp;
        boolean var3;
        if (var1 < 480 && (var1 < 640 || var2 < 480) && var4.orientation != 2) {
            var3 = false;
        } else {
            var3 = true;
        }

        return var3;
    }

    // $FF: renamed from: f () void
    private void method_615() {
        boolean var3 = false;
        Object var5 = null;
        boolean var1;
        if (!TextUtils.isEmpty(this.field_583)) {
            var1 = true;
        } else {
            var1 = false;
        }

        boolean var2;
        label45: {
            if (this.field_584 != null) {
                var2 = var3;
                if (!this.field_580.method_1441()) {
                    break label45;
                }

                if (!this.field_586) {
                    var2 = var3;
                    if (!this.field_587) {
                        break label45;
                    }
                }
            }

            var2 = true;
        }

        var1 &= var2;
        CharSequence var4;
        if (var1) {
            var4 = this.field_583;
        } else {
            var4 = null;
        }

        this.setText(var4);
        var4 = this.field_580.getContentDescription();
        if (TextUtils.isEmpty(var4)) {
            if (var1) {
                var4 = null;
            } else {
                var4 = this.field_580.getTitle();
            }

            this.setContentDescription(var4);
        } else {
            this.setContentDescription(var4);
        }

        var4 = this.field_580.getTooltipText();
        if (TextUtils.isEmpty(var4)) {
            if (var1) {
                var4 = (CharSequence)var5;
            } else {
                var4 = this.field_580.getTitle();
            }

            class_100.method_885(this, var4);
        } else {
            class_100.method_885(this, var4);
        }

    }

    // $FF: renamed from: a (android.support.v7.view.menu.h, int) void
    public void method_8(class_168 var1, int var2) {
        this.field_580 = var1;
        this.setIcon(var1.getIcon());
        this.setTitle(var1.method_1421(this));
        this.setId(var1.getItemId());
        byte var3;
        if (var1.isVisible()) {
            var3 = 0;
        } else {
            var3 = 8;
        }

        this.setVisibility(var3);
        this.setEnabled(var1.isEnabled());
        if (var1.hasSubMenu() && this.field_585 == null) {
            this.field_585 = new ActionMenuItemView.class_336();
        }

    }

    // $FF: renamed from: a () boolean
    public boolean method_9() {
        return true;
    }

    // $FF: renamed from: b () boolean
    public boolean method_616() {
        boolean var1;
        if (!TextUtils.isEmpty(this.getText())) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: c () boolean
    public boolean method_10() {
        boolean var1;
        if (this.method_616() && this.field_580.getIcon() == null) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: d () boolean
    public boolean method_11() {
        return this.method_616();
    }

    public class_168 getItemData() {
        return this.field_580;
    }

    public void onClick(View var1) {
        if (this.field_581 != null) {
            this.field_581.method_117(this.field_580);
        }

    }

    public void onConfigurationChanged(Configuration var1) {
        super.onConfigurationChanged(var1);
        this.field_586 = this.method_614();
        this.method_615();
    }

    protected void onMeasure(int var1, int var2) {
        boolean var5 = this.method_616();
        if (var5 && this.field_589 >= 0) {
            super.setPadding(this.field_589, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }

        super.onMeasure(var1, var2);
        int var3 = MeasureSpec.getMode(var1);
        var1 = MeasureSpec.getSize(var1);
        int var4 = this.getMeasuredWidth();
        if (var3 == Integer.MIN_VALUE) {
            var1 = Math.min(var1, this.field_588);
        } else {
            var1 = this.field_588;
        }

        if (var3 != 1073741824 && this.field_588 > 0 && var4 < var1) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(var1, 1073741824), var2);
        }

        if (!var5 && this.field_584 != null) {
            super.setPadding((this.getMeasuredWidth() - this.field_584.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }

    }

    public void onRestoreInstanceState(Parcelable var1) {
        super.onRestoreInstanceState((Parcelable)null);
    }

    public boolean onTouchEvent(MotionEvent var1) {
        boolean var2;
        if (this.field_580.hasSubMenu() && this.field_585 != null && this.field_585.onTouch(this, var1)) {
            var2 = true;
        } else {
            var2 = super.onTouchEvent(var1);
        }

        return var2;
    }

    public void setCheckable(boolean var1) {
    }

    public void setChecked(boolean var1) {
    }

    public void setExpandedFormat(boolean var1) {
        if (this.field_587 != var1) {
            this.field_587 = var1;
            if (this.field_580 != null) {
                this.field_580.method_1436();
            }
        }

    }

    public void setIcon(Drawable var1) {
        this.field_584 = var1;
        if (var1 != null) {
            int var6 = var1.getIntrinsicWidth();
            int var5 = var1.getIntrinsicHeight();
            int var4 = var5;
            int var3 = var6;
            float var2;
            if (var6 > this.field_590) {
                var2 = (float)this.field_590 / (float)var6;
                var3 = this.field_590;
                var4 = (int)((float)var5 * var2);
            }

            var6 = var4;
            var5 = var3;
            if (var4 > this.field_590) {
                var2 = (float)this.field_590 / (float)var4;
                var6 = this.field_590;
                var5 = (int)((float)var3 * var2);
            }

            var1.setBounds(0, 0, var5, var6);
        }

        this.setCompoundDrawables(var1, (Drawable)null, (Drawable)null, (Drawable)null);
        this.method_615();
    }

    public void setItemInvoker(g$b var1) {
        this.field_581 = var1;
    }

    public void setPadding(int var1, int var2, int var3, int var4) {
        this.field_589 = var1;
        super.setPadding(var1, var2, var3, var4);
    }

    public void setPopupCallback(ActionMenuItemView.class_338 var1) {
        this.field_582 = var1;
    }

    public void setTitle(CharSequence var1) {
        this.field_583 = var1;
        this.method_615();
    }

    private class class_336 extends class_30 {
        public class_336() {
            super(ActionMenuItemView.this);
        }

        // $FF: renamed from: a () android.support.v7.view.menu.q
        public class_25 method_235() {
            class_25 var1;
            if (ActionMenuItemView.this.field_582 != null) {
                var1 = ActionMenuItemView.this.field_582.method_999();
            } else {
                var1 = null;
            }

            return var1;
        }

        // $FF: renamed from: b () boolean
        protected boolean method_236() {
            boolean var2 = false;
            boolean var1 = var2;
            if (ActionMenuItemView.this.field_581 != null) {
                var1 = var2;
                if (ActionMenuItemView.this.field_581.method_117(ActionMenuItemView.this.field_580)) {
                    class_25 var3 = this.method_235();
                    var1 = var2;
                    if (var3 != null) {
                        var1 = var2;
                        if (var3.method_149()) {
                            var1 = true;
                        }
                    }
                }
            }

            return var1;
        }
    }

    public abstract static class class_338 {
        // $FF: renamed from: a () android.support.v7.view.menu.q
        public abstract class_25 method_999();
    }
}
