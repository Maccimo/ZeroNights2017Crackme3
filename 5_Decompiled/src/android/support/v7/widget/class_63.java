package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.class_18;
import android.util.AttributeSet;
import android.widget.TextView;

// $FF: renamed from: android.support.v7.widget.p
public class class_63 extends TextView implements class_18 {
    // $FF: renamed from: a android.support.v7.widget.g
    private final class_75 field_578;
    // $FF: renamed from: b android.support.v7.widget.n
    private final class_60 field_579;

    public class_63(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public class_63(Context var1, AttributeSet var2) {
        this(var1, var2, 16842884);
    }

    public class_63(Context var1, AttributeSet var2, int var3) {
        super(class_96.method_863(var1), var2, var3);
        this.field_578 = new class_75(this);
        this.field_578.method_746(var2, var3);
        this.field_579 = class_60.method_590(this);
        this.field_579.method_599(var2, var3);
        this.field_579.method_593();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.field_578 != null) {
            this.field_578.method_749();
        }

        if (this.field_579 != null) {
            this.field_579.method_593();
        }

    }

    public int getAutoSizeMaxTextSize() {
        int var1;
        if (VERSION.SDK_INT >= 26) {
            var1 = super.getAutoSizeMaxTextSize();
        } else if (this.field_579 != null) {
            var1 = this.field_579.method_608();
        } else {
            var1 = -1;
        }

        return var1;
    }

    public int getAutoSizeMinTextSize() {
        int var1;
        if (VERSION.SDK_INT >= 26) {
            var1 = super.getAutoSizeMinTextSize();
        } else if (this.field_579 != null) {
            var1 = this.field_579.method_607();
        } else {
            var1 = -1;
        }

        return var1;
    }

    public int getAutoSizeStepGranularity() {
        int var1;
        if (VERSION.SDK_INT >= 26) {
            var1 = super.getAutoSizeStepGranularity();
        } else if (this.field_579 != null) {
            var1 = this.field_579.method_606();
        } else {
            var1 = -1;
        }

        return var1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        int[] var1;
        if (VERSION.SDK_INT >= 26) {
            var1 = super.getAutoSizeTextAvailableSizes();
        } else if (this.field_579 != null) {
            var1 = this.field_579.method_609();
        } else {
            var1 = new int[0];
        }

        return var1;
    }

    public int getAutoSizeTextType() {
        int var1 = 0;
        if (VERSION.SDK_INT >= 26) {
            if (super.getAutoSizeTextType() == 1) {
                var1 = 1;
            }
        } else if (this.field_579 != null) {
            var1 = this.field_579.method_605();
        }

        return var1;
    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList var1;
        if (this.field_578 != null) {
            var1 = this.field_578.method_741();
        } else {
            var1 = null;
        }

        return var1;
    }

    public Mode getSupportBackgroundTintMode() {
        Mode var1;
        if (this.field_578 != null) {
            var1 = this.field_578.method_747();
        } else {
            var1 = null;
        }

        return var1;
    }

    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        super.onLayout(var1, var2, var3, var4, var5);
        if (this.field_579 != null) {
            this.field_579.method_601(var1, var2, var3, var4, var5);
        }

    }

    protected void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
        super.onTextChanged(var1, var2, var3, var4);
        if (this.field_579 != null && VERSION.SDK_INT < 26 && this.field_579.method_604()) {
            this.field_579.method_603();
        }

    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int var1, int var2, int var3, int var4) {
        if (VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeUniformWithConfiguration(var1, var2, var3, var4);
        } else if (this.field_579 != null) {
            this.field_579.method_596(var1, var2, var3, var4);
        }

    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] var1, int var2) {
        if (VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(var1, var2);
        } else if (this.field_579 != null) {
            this.field_579.method_602(var1, var2);
        }

    }

    public void setAutoSizeTextTypeWithDefaults(int var1) {
        if (VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeWithDefaults(var1);
        } else if (this.field_579 != null) {
            this.field_579.method_594(var1);
        }

    }

    public void setBackgroundDrawable(Drawable var1) {
        super.setBackgroundDrawable(var1);
        if (this.field_578 != null) {
            this.field_578.method_745(var1);
        }

    }

    public void setBackgroundResource(int var1) {
        super.setBackgroundResource(var1);
        if (this.field_578 != null) {
            this.field_578.method_742(var1);
        }

    }

    public void setSupportBackgroundTintList(ColorStateList var1) {
        if (this.field_578 != null) {
            this.field_578.method_743(var1);
        }

    }

    public void setSupportBackgroundTintMode(Mode var1) {
        if (this.field_578 != null) {
            this.field_578.method_744(var1);
        }

    }

    public void setTextAppearance(Context var1, int var2) {
        super.setTextAppearance(var1, var2);
        if (this.field_579 != null) {
            this.field_579.method_597(var1, var2);
        }

    }

    public void setTextSize(int var1, float var2) {
        if (VERSION.SDK_INT >= 26) {
            super.setTextSize(var1, var2);
        } else if (this.field_579 != null) {
            this.field_579.method_595(var1, var2);
        }

    }
}
