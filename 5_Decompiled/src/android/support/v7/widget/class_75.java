package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.class_146;
import android.util.AttributeSet;
import android.view.View;

// $FF: renamed from: android.support.v7.widget.g
class class_75 {
    // $FF: renamed from: a android.view.View
    private final View field_699;
    // $FF: renamed from: b android.support.v7.widget.h
    private final class_74 field_700;
    // $FF: renamed from: c int
    private int field_701 = -1;
    // $FF: renamed from: d android.support.v7.widget.ai
    private class_95 field_702;
    // $FF: renamed from: e android.support.v7.widget.ai
    private class_95 field_703;
    // $FF: renamed from: f android.support.v7.widget.ai
    private class_95 field_704;

    class_75(View var1) {
        this.field_699 = var1;
        this.field_700 = class_74.method_717();
    }

    // $FF: renamed from: b (android.graphics.drawable.Drawable) boolean
    private boolean method_739(Drawable var1) {
        boolean var2 = true;
        if (this.field_704 == null) {
            this.field_704 = new class_95();
        }

        class_95 var3 = this.field_704;
        var3.method_862();
        ColorStateList var4 = class_146.method_1226(this.field_699);
        if (var4 != null) {
            var3.field_827 = true;
            var3.field_824 = var4;
        }

        Mode var5 = class_146.method_1227(this.field_699);
        if (var5 != null) {
            var3.field_826 = true;
            var3.field_825 = var5;
        }

        if (!var3.field_827 && !var3.field_826) {
            var2 = false;
        } else {
            class_74.method_720(var1, var3, this.field_699.getDrawableState());
        }

        return var2;
    }

    // $FF: renamed from: d () boolean
    private boolean method_740() {
        boolean var2 = false;
        int var1 = VERSION.SDK_INT;
        if (var1 > 21) {
            if (this.field_702 == null) {
                return var2;
            }
        } else if (var1 != 21) {
            return var2;
        }

        var2 = true;
        return var2;
    }

    // $FF: renamed from: a () android.content.res.ColorStateList
    ColorStateList method_741() {
        ColorStateList var1;
        if (this.field_703 != null) {
            var1 = this.field_703.field_824;
        } else {
            var1 = null;
        }

        return var1;
    }

    // $FF: renamed from: a (int) void
    void method_742(int var1) {
        this.field_701 = var1;
        ColorStateList var2;
        if (this.field_700 != null) {
            var2 = this.field_700.method_738(this.field_699.getContext(), var1);
        } else {
            var2 = null;
        }

        this.method_748(var2);
        this.method_749();
    }

    // $FF: renamed from: a (android.content.res.ColorStateList) void
    void method_743(ColorStateList var1) {
        if (this.field_703 == null) {
            this.field_703 = new class_95();
        }

        this.field_703.field_824 = var1;
        this.field_703.field_827 = true;
        this.method_749();
    }

    // $FF: renamed from: a (android.graphics.PorterDuff.Mode) void
    void method_744(Mode var1) {
        if (this.field_703 == null) {
            this.field_703 = new class_95();
        }

        this.field_703.field_825 = var1;
        this.field_703.field_826 = true;
        this.method_749();
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) void
    void method_745(Drawable var1) {
        this.field_701 = -1;
        this.method_748((ColorStateList)null);
        this.method_749();
    }

    // $FF: renamed from: a (android.util.AttributeSet, int) void
    void method_746(AttributeSet param1, int param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: b () android.graphics.PorterDuff.Mode
    Mode method_747() {
        Mode var1;
        if (this.field_703 != null) {
            var1 = this.field_703.field_825;
        } else {
            var1 = null;
        }

        return var1;
    }

    // $FF: renamed from: b (android.content.res.ColorStateList) void
    void method_748(ColorStateList var1) {
        if (var1 != null) {
            if (this.field_702 == null) {
                this.field_702 = new class_95();
            }

            this.field_702.field_824 = var1;
            this.field_702.field_827 = true;
        } else {
            this.field_702 = null;
        }

        this.method_749();
    }

    // $FF: renamed from: c () void
    void method_749() {
        Drawable var1 = this.field_699.getBackground();
        if (var1 != null && (!this.method_740() || !this.method_739(var1))) {
            if (this.field_703 != null) {
                class_74.method_720(var1, this.field_703, this.field_699.getDrawableState());
            } else if (this.field_702 != null) {
                class_74.method_720(var1, this.field_702, this.field_699.getDrawableState());
            }
        }

    }
}
