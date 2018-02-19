package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.widget.class_154;
import android.support.v7.b.a.class_39;
import android.util.AttributeSet;
import android.widget.ImageView;

// $FF: renamed from: android.support.v7.widget.k
public class class_79 {
    // $FF: renamed from: a android.widget.ImageView
    private final ImageView field_712;
    // $FF: renamed from: b android.support.v7.widget.ai
    private class_95 field_713;
    // $FF: renamed from: c android.support.v7.widget.ai
    private class_95 field_714;
    // $FF: renamed from: d android.support.v7.widget.ai
    private class_95 field_715;

    public class_79(ImageView var1) {
        this.field_712 = var1;
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) boolean
    private boolean method_753(Drawable var1) {
        boolean var2 = true;
        if (this.field_715 == null) {
            this.field_715 = new class_95();
        }

        class_95 var3 = this.field_715;
        var3.method_862();
        ColorStateList var4 = class_154.method_1281(this.field_712);
        if (var4 != null) {
            var3.field_827 = true;
            var3.field_824 = var4;
        }

        Mode var5 = class_154.method_1284(this.field_712);
        if (var5 != null) {
            var3.field_826 = true;
            var3.field_825 = var5;
        }

        if (!var3.field_827 && !var3.field_826) {
            var2 = false;
        } else {
            class_74.method_720(var1, var3, this.field_712.getDrawableState());
        }

        return var2;
    }

    // $FF: renamed from: e () boolean
    private boolean method_754() {
        boolean var2 = false;
        int var1 = VERSION.SDK_INT;
        if (var1 > 21) {
            if (this.field_713 == null) {
                return var2;
            }
        } else if (var1 != 21) {
            return var2;
        }

        var2 = true;
        return var2;
    }

    // $FF: renamed from: a (int) void
    public void method_755(int var1) {
        if (var1 != 0) {
            Drawable var2 = class_39.method_382(this.field_712.getContext(), var1);
            if (var2 != null) {
                class_67.method_656(var2);
            }

            this.field_712.setImageDrawable(var2);
        } else {
            this.field_712.setImageDrawable((Drawable)null);
        }

        this.method_762();
    }

    // $FF: renamed from: a (android.content.res.ColorStateList) void
    void method_756(ColorStateList var1) {
        if (this.field_714 == null) {
            this.field_714 = new class_95();
        }

        this.field_714.field_824 = var1;
        this.field_714.field_827 = true;
        this.method_762();
    }

    // $FF: renamed from: a (android.graphics.PorterDuff.Mode) void
    void method_757(Mode var1) {
        if (this.field_714 == null) {
            this.field_714 = new class_95();
        }

        this.field_714.field_825 = var1;
        this.field_714.field_826 = true;
        this.method_762();
    }

    // $FF: renamed from: a (android.util.AttributeSet, int) void
    public void method_758(AttributeSet param1, int param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a () boolean
    boolean method_759() {
        Drawable var2 = this.field_712.getBackground();
        boolean var1;
        if (VERSION.SDK_INT >= 21 && var2 instanceof RippleDrawable) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    // $FF: renamed from: b () android.content.res.ColorStateList
    ColorStateList method_760() {
        ColorStateList var1;
        if (this.field_714 != null) {
            var1 = this.field_714.field_824;
        } else {
            var1 = null;
        }

        return var1;
    }

    // $FF: renamed from: c () android.graphics.PorterDuff.Mode
    Mode method_761() {
        Mode var1;
        if (this.field_714 != null) {
            var1 = this.field_714.field_825;
        } else {
            var1 = null;
        }

        return var1;
    }

    // $FF: renamed from: d () void
    void method_762() {
        Drawable var1 = this.field_712.getDrawable();
        if (var1 != null) {
            class_67.method_656(var1);
        }

        if (var1 != null && (!this.method_754() || !this.method_753(var1))) {
            if (this.field_714 != null) {
                class_74.method_720(var1, this.field_714, this.field_712.getDrawableState());
            } else if (this.field_713 != null) {
                class_74.method_720(var1, this.field_713, this.field_712.getDrawableState());
            }
        }

    }
}
