package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v4.h.class_18;
import android.support.v4.widget.class_21;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView implements class_18, class_21 {
    // $FF: renamed from: a android.support.v7.widget.g
    private final class_75 field_1027;
    // $FF: renamed from: b android.support.v7.widget.k
    private final class_79 field_1028;

    public AppCompatImageView(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public AppCompatImageView(Context var1, AttributeSet var2) {
        this(var1, var2, 0);
    }

    public AppCompatImageView(Context var1, AttributeSet var2, int var3) {
        super(class_96.method_863(var1), var2, var3);
        this.field_1027 = new class_75(this);
        this.field_1027.method_746(var2, var3);
        this.field_1028 = new class_79(this);
        this.field_1028.method_758(var2, var3);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.field_1027 != null) {
            this.field_1027.method_749();
        }

        if (this.field_1028 != null) {
            this.field_1028.method_762();
        }

    }

    public ColorStateList getSupportBackgroundTintList() {
        ColorStateList var1;
        if (this.field_1027 != null) {
            var1 = this.field_1027.method_741();
        } else {
            var1 = null;
        }

        return var1;
    }

    public Mode getSupportBackgroundTintMode() {
        Mode var1;
        if (this.field_1027 != null) {
            var1 = this.field_1027.method_747();
        } else {
            var1 = null;
        }

        return var1;
    }

    public ColorStateList getSupportImageTintList() {
        ColorStateList var1;
        if (this.field_1028 != null) {
            var1 = this.field_1028.method_760();
        } else {
            var1 = null;
        }

        return var1;
    }

    public Mode getSupportImageTintMode() {
        Mode var1;
        if (this.field_1028 != null) {
            var1 = this.field_1028.method_761();
        } else {
            var1 = null;
        }

        return var1;
    }

    public boolean hasOverlappingRendering() {
        boolean var1;
        if (this.field_1028.method_759() && super.hasOverlappingRendering()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public void setBackgroundDrawable(Drawable var1) {
        super.setBackgroundDrawable(var1);
        if (this.field_1027 != null) {
            this.field_1027.method_745(var1);
        }

    }

    public void setBackgroundResource(int var1) {
        super.setBackgroundResource(var1);
        if (this.field_1027 != null) {
            this.field_1027.method_742(var1);
        }

    }

    public void setImageBitmap(Bitmap var1) {
        super.setImageBitmap(var1);
        if (this.field_1028 != null) {
            this.field_1028.method_762();
        }

    }

    public void setImageDrawable(Drawable var1) {
        super.setImageDrawable(var1);
        if (this.field_1028 != null) {
            this.field_1028.method_762();
        }

    }

    public void setImageIcon(Icon var1) {
        super.setImageIcon(var1);
        if (this.field_1028 != null) {
            this.field_1028.method_762();
        }

    }

    public void setImageResource(int var1) {
        if (this.field_1028 != null) {
            this.field_1028.method_755(var1);
        }

    }

    public void setImageURI(Uri var1) {
        super.setImageURI(var1);
        if (this.field_1028 != null) {
            this.field_1028.method_762();
        }

    }

    public void setSupportBackgroundTintList(ColorStateList var1) {
        if (this.field_1027 != null) {
            this.field_1027.method_743(var1);
        }

    }

    public void setSupportBackgroundTintMode(Mode var1) {
        if (this.field_1027 != null) {
            this.field_1027.method_744(var1);
        }

    }

    public void setSupportImageTintList(ColorStateList var1) {
        if (this.field_1028 != null) {
            this.field_1028.method_756(var1);
        }

    }

    public void setSupportImageTintMode(Mode var1) {
        if (this.field_1028 != null) {
            this.field_1028.method_757(var1);
        }

    }
}
