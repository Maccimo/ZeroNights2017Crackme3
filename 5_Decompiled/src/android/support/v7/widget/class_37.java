package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.h.class_18;
import android.support.v7.b.a.class_39;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

// $FF: renamed from: android.support.v7.widget.f
public class class_37 extends AutoCompleteTextView implements class_18 {
    // $FF: renamed from: a int[]
    private static final int[] field_261 = new int[]{16843126};
    // $FF: renamed from: b android.support.v7.widget.g
    private final class_75 field_262;
    // $FF: renamed from: c android.support.v7.widget.n
    private final class_60 field_263;

    public class_37(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public class_37(Context var1, AttributeSet var2) {
        this(var1, var2, android.support.v7.a.a$a.autoCompleteTextViewStyle);
    }

    public class_37(Context var1, AttributeSet var2, int var3) {
        super(class_96.method_863(var1), var2, var3);
        class_97 var4 = class_97.method_867(this.getContext(), var2, field_261, var3, 0);
        if (var4.method_883(0)) {
            this.setDropDownBackgroundDrawable(var4.method_871(0));
        }

        var4.method_872();
        this.field_262 = new class_75(this);
        this.field_262.method_746(var2, var3);
        this.field_263 = class_60.method_590(this);
        this.field_263.method_599(var2, var3);
        this.field_263.method_593();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.field_262 != null) {
            this.field_262.method_749();
        }

        if (this.field_263 != null) {
            this.field_263.method_593();
        }

    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList var1;
        if (this.field_262 != null) {
            var1 = this.field_262.method_741();
        } else {
            var1 = null;
        }

        return var1;
    }

    public Mode getSupportBackgroundTintMode() {
        Mode var1;
        if (this.field_262 != null) {
            var1 = this.field_262.method_747();
        } else {
            var1 = null;
        }

        return var1;
    }

    public void setBackgroundDrawable(Drawable var1) {
        super.setBackgroundDrawable(var1);
        if (this.field_262 != null) {
            this.field_262.method_745(var1);
        }

    }

    public void setBackgroundResource(int var1) {
        super.setBackgroundResource(var1);
        if (this.field_262 != null) {
            this.field_262.method_742(var1);
        }

    }

    public void setDropDownBackgroundResource(int var1) {
        this.setDropDownBackgroundDrawable(class_39.method_382(this.getContext(), var1));
    }

    public void setSupportBackgroundTintList(ColorStateList var1) {
        if (this.field_262 != null) {
            this.field_262.method_743(var1);
        }

    }

    public void setSupportBackgroundTintMode(Mode var1) {
        if (this.field_262 != null) {
            this.field_262.method_744(var1);
        }

    }

    public void setTextAppearance(Context var1, int var2) {
        super.setTextAppearance(var1, var2);
        if (this.field_263 != null) {
            this.field_263.method_597(var1, var2);
        }

    }
}
