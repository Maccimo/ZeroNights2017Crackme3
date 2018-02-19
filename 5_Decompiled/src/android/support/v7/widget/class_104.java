package android.support.v7.widget;

import android.support.v4.h.class_146;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.accessibility.AccessibilityManager;

// $FF: renamed from: android.support.v7.widget.an
class class_104 implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {
    // $FF: renamed from: i android.support.v7.widget.an
    private static class_104 field_860;
    // $FF: renamed from: a android.view.View
    private final View field_861;
    // $FF: renamed from: b java.lang.CharSequence
    private final CharSequence field_862;
    // $FF: renamed from: c java.lang.Runnable
    private final Runnable field_863 = new Runnable() {
        public void run() {
            class_104.this.method_910(false);
        }
    };
    // $FF: renamed from: d java.lang.Runnable
    private final Runnable field_864 = new Runnable() {
        public void run() {
            class_104.this.method_906();
        }
    };
    // $FF: renamed from: e int
    private int field_865;
    // $FF: renamed from: f int
    private int field_866;
    // $FF: renamed from: g android.support.v7.widget.ao
    private class_102 field_867;
    // $FF: renamed from: h boolean
    private boolean field_868;

    private class_104(View var1, CharSequence var2) {
        this.field_861 = var1;
        this.field_862 = var2;
        this.field_861.setOnLongClickListener(this);
        this.field_861.setOnHoverListener(this);
    }

    // $FF: renamed from: a () void
    private void method_906() {
        if (field_860 == this) {
            field_860 = null;
            if (this.field_867 != null) {
                this.field_867.method_903();
                this.field_867 = null;
                this.field_861.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }

        this.field_861.removeCallbacks(this.field_863);
        this.field_861.removeCallbacks(this.field_864);
    }

    // $FF: renamed from: a (android.view.View, java.lang.CharSequence) void
    public static void method_909(View var0, CharSequence var1) {
        if (TextUtils.isEmpty(var1)) {
            if (field_860 != null && field_860.field_861 == var0) {
                field_860.method_906();
            }

            var0.setOnLongClickListener((OnLongClickListener)null);
            var0.setLongClickable(false);
            var0.setOnHoverListener((OnHoverListener)null);
        } else {
            new class_104(var0, var1);
        }

    }

    // $FF: renamed from: a (boolean) void
    private void method_910(boolean var1) {
        if (class_146.method_1229(this.field_861)) {
            if (field_860 != null) {
                field_860.method_906();
            }

            field_860 = this;
            this.field_868 = var1;
            this.field_867 = new class_102(this.field_861.getContext());
            this.field_867.method_904(this.field_861, this.field_865, this.field_866, this.field_868, this.field_862);
            this.field_861.addOnAttachStateChangeListener(this);
            long var2;
            if (this.field_868) {
                var2 = 2500L;
            } else if ((class_146.method_1224(this.field_861) & 1) == 1) {
                var2 = 3000L - (long)ViewConfiguration.getLongPressTimeout();
            } else {
                var2 = 15000L - (long)ViewConfiguration.getLongPressTimeout();
            }

            this.field_861.removeCallbacks(this.field_864);
            this.field_861.postDelayed(this.field_864, var2);
        }

    }

    public boolean onHover(View var1, MotionEvent var2) {
        if (this.field_867 == null || !this.field_868) {
            AccessibilityManager var3 = (AccessibilityManager)this.field_861.getContext().getSystemService("accessibility");
            if (!var3.isEnabled() || !var3.isTouchExplorationEnabled()) {
                switch(var2.getAction()) {
                case 7:
                    if (this.field_861.isEnabled() && this.field_867 == null) {
                        this.field_865 = (int)var2.getX();
                        this.field_866 = (int)var2.getY();
                        this.field_861.removeCallbacks(this.field_863);
                        this.field_861.postDelayed(this.field_863, (long)ViewConfiguration.getLongPressTimeout());
                    }
                case 8:
                case 9:
                default:
                    break;
                case 10:
                    this.method_906();
                }
            }
        }

        return false;
    }

    public boolean onLongClick(View var1) {
        this.field_865 = var1.getWidth() / 2;
        this.field_866 = var1.getHeight() / 2;
        this.method_910(true);
        return true;
    }

    public void onViewAttachedToWindow(View var1) {
    }

    public void onViewDetachedFromWindow(View var1) {
        this.method_906();
    }
}
