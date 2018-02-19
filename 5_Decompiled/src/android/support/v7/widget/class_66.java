package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.h.class_148;
import android.support.v4.widget.class_150;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

// $FF: renamed from: android.support.v7.widget.t
class class_66 extends class_65 {
    // $FF: renamed from: g boolean
    private boolean field_612;
    // $FF: renamed from: h boolean
    private boolean field_613;
    // $FF: renamed from: i boolean
    private boolean field_614;
    // $FF: renamed from: j android.support.v4.h.p
    private class_148 field_615;
    // $FF: renamed from: k android.support.v4.widget.f
    private class_150 field_616;

    public class_66(Context var1, boolean var2) {
        super(var1, (AttributeSet)null, android.support.v7.a.a$a.dropDownListViewStyle);
        this.field_613 = var2;
        this.setCacheColorHint(0);
    }

    // $FF: renamed from: a (android.view.View, int) void
    private void method_651(View var1, int var2) {
        this.performItemClick(var1, var2, this.getItemIdAtPosition(var2));
    }

    // $FF: renamed from: a (android.view.View, int, float, float) void
    private void method_652(View var1, int var2, float var3, float var4) {
        this.field_614 = true;
        if (VERSION.SDK_INT >= 21) {
            this.drawableHotspotChanged(var3, var4);
        }

        if (!this.isPressed()) {
            this.setPressed(true);
        }

        this.layoutChildren();
        if (this.f != -1) {
            View var7 = this.getChildAt(this.f - this.getFirstVisiblePosition());
            if (var7 != null && var7 != var1 && var7.isPressed()) {
                var7.setPressed(false);
            }
        }

        this.f = var2;
        float var6 = (float)var1.getLeft();
        float var5 = (float)var1.getTop();
        if (VERSION.SDK_INT >= 21) {
            var1.drawableHotspotChanged(var3 - var6, var4 - var5);
        }

        if (!var1.isPressed()) {
            var1.setPressed(true);
        }

        this.a(var2, var1, var3, var4);
        this.setSelectorEnabled(false);
        this.refreshDrawableState();
    }

    // $FF: renamed from: d () void
    private void method_653() {
        this.field_614 = false;
        this.setPressed(false);
        this.drawableStateChanged();
        View var1 = this.getChildAt(this.f - this.getFirstVisiblePosition());
        if (var1 != null) {
            var1.setPressed(false);
        }

        if (this.field_615 != null) {
            this.field_615.method_1253();
            this.field_615 = null;
        }

    }

    // $FF: renamed from: a () boolean
    protected boolean method_647() {
        boolean var1;
        if (!this.field_614 && !super.method_647()) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    // $FF: renamed from: a (android.view.MotionEvent, int) boolean
    public boolean method_654(MotionEvent var1, int var2) {
        boolean var6;
        boolean var8;
        label46: {
            label49: {
                int var3 = var1.getActionMasked();
                switch(var3) {
                case 1:
                    var6 = false;
                    break;
                case 2:
                    var6 = true;
                    break;
                case 3:
                    var6 = false;
                    var8 = false;
                    break label46;
                default:
                    break label49;
                }

                int var4 = var1.findPointerIndex(var2);
                if (var4 < 0) {
                    var6 = false;
                    var8 = false;
                    break label46;
                }

                var2 = (int)var1.getX(var4);
                int var5 = (int)var1.getY(var4);
                var4 = this.pointToPosition(var2, var5);
                if (var4 == -1) {
                    var8 = true;
                    break label46;
                }

                View var7 = this.getChildAt(var4 - this.getFirstVisiblePosition());
                this.method_652(var7, var4, (float)var2, (float)var5);
                if (var3 == 1) {
                    this.method_651(var7, var4);
                }
            }

            var6 = true;
            var8 = false;
        }

        if (!var6 || var8) {
            this.method_653();
        }

        if (var6) {
            if (this.field_616 == null) {
                this.field_616 = new class_150(this);
            }

            this.field_616.a(true);
            this.field_616.onTouch(this, var1);
        } else if (this.field_616 != null) {
            this.field_616.a(false);
        }

        return var6;
    }

    public boolean hasFocus() {
        boolean var1;
        if (!this.field_613 && !super.hasFocus()) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    public boolean hasWindowFocus() {
        boolean var1;
        if (!this.field_613 && !super.hasWindowFocus()) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    public boolean isFocused() {
        boolean var1;
        if (!this.field_613 && !super.isFocused()) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    public boolean isInTouchMode() {
        boolean var1;
        if ((!this.field_613 || !this.field_612) && !super.isInTouchMode()) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    void setListSelectionHidden(boolean var1) {
        this.field_612 = var1;
    }
}
