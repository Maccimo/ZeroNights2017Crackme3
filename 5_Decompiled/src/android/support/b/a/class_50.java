package android.support.b.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.b.a.class_140;
import android.support.v4.c.a.class_48;
import android.support.v4.g.class_134;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

// $FF: renamed from: android.support.b.a.c
public class class_50 extends class_49 implements class_4 {
    // $FF: renamed from: a android.graphics.drawable.Drawable.Callback
    final Callback field_510;
    // $FF: renamed from: c android.support.b.a.c$a
    private c$a field_511;
    // $FF: renamed from: d android.content.Context
    private Context field_512;
    // $FF: renamed from: e android.animation.ArgbEvaluator
    private ArgbEvaluator field_513;
    // $FF: renamed from: f android.animation.Animator.AnimatorListener
    private AnimatorListener field_514;
    // $FF: renamed from: g java.util.ArrayList
    private ArrayList field_515;

    class_50() {
        this((Context)null, (c$a)null, (Resources)null);
    }

    private class_50(Context var1) {
        this(var1, (c$a)null, (Resources)null);
    }

    private class_50(Context var1, c$a var2, Resources var3) {
        this.field_513 = null;
        this.field_514 = null;
        this.field_515 = null;
        this.field_510 = new Callback() {
            public void invalidateDrawable(Drawable var1) {
                class_50.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
                class_50.this.scheduleSelf(var2, var3);
            }

            public void unscheduleDrawable(Drawable var1, Runnable var2) {
                class_50.this.unscheduleSelf(var2);
            }
        };
        this.field_512 = var1;
        if (var2 != null) {
            this.field_511 = var2;
        } else {
            this.field_511 = new c$a(var1, var2, this.field_510, var3);
        }

    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources.Theme) android.support.b.a.c
    public static class_50 method_534(Context var0, Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
        class_50 var5 = new class_50(var0);
        var5.inflate(var1, var2, var3, var4);
        return var5;
    }

    // $FF: renamed from: a (android.animation.Animator) void
    private void method_535(Animator var1) {
        if (var1 instanceof AnimatorSet) {
            ArrayList var3 = ((AnimatorSet)var1).getChildAnimations();
            if (var3 != null) {
                for(int var2 = 0; var2 < var3.size(); ++var2) {
                    this.method_535((Animator)var3.get(var2));
                }
            }
        }

        if (var1 instanceof ObjectAnimator) {
            ObjectAnimator var5 = (ObjectAnimator)var1;
            String var4 = var5.getPropertyName();
            if ("fillColor".equals(var4) || "strokeColor".equals(var4)) {
                if (this.field_513 == null) {
                    this.field_513 = new ArgbEvaluator();
                }

                var5.setEvaluator(this.field_513);
            }
        }

    }

    // $FF: renamed from: a (java.lang.String, android.animation.Animator) void
    private void method_536(String var1, Animator var2) {
        var2.setTarget(this.field_511.field_531.method_545(var1));
        if (VERSION.SDK_INT < 21) {
            this.method_535(var2);
        }

        if (c$a.method_573(this.field_511) == null) {
            c$a.method_574(this.field_511, new ArrayList());
            this.field_511.field_533 = new class_134();
        }

        c$a.method_573(this.field_511).add(var2);
        this.field_511.field_533.put(var2, var1);
    }

    public void applyTheme(Theme var1) {
        if (this.b != null) {
            class_48.method_524(this.b, var1);
        }

    }

    public boolean canApplyTheme() {
        boolean var1;
        if (this.b != null) {
            var1 = class_48.method_530(this.b);
        } else {
            var1 = false;
        }

        return var1;
    }

    public void draw(Canvas var1) {
        if (this.b != null) {
            this.b.draw(var1);
        } else {
            this.field_511.field_531.draw(var1);
            if (this.field_511.field_532.isStarted()) {
                this.invalidateSelf();
            }
        }

    }

    public int getAlpha() {
        int var1;
        if (this.b != null) {
            var1 = class_48.method_529(this.b);
        } else {
            var1 = this.field_511.field_531.getAlpha();
        }

        return var1;
    }

    public int getChangingConfigurations() {
        int var1;
        if (this.b != null) {
            var1 = this.b.getChangingConfigurations();
        } else {
            var1 = super.getChangingConfigurations() | this.field_511.field_530;
        }

        return var1;
    }

    public ConstantState getConstantState() {
        c$b var1;
        if (this.b != null && VERSION.SDK_INT >= 24) {
            var1 = new c$b(this.b.getConstantState());
        } else {
            var1 = null;
        }

        return var1;
    }

    public int getIntrinsicHeight() {
        int var1;
        if (this.b != null) {
            var1 = this.b.getIntrinsicHeight();
        } else {
            var1 = this.field_511.field_531.getIntrinsicHeight();
        }

        return var1;
    }

    public int getIntrinsicWidth() {
        int var1;
        if (this.b != null) {
            var1 = this.b.getIntrinsicWidth();
        } else {
            var1 = this.field_511.field_531.getIntrinsicWidth();
        }

        return var1;
    }

    public int getOpacity() {
        int var1;
        if (this.b != null) {
            var1 = this.b.getOpacity();
        } else {
            var1 = this.field_511.field_531.getOpacity();
        }

        return var1;
    }

    public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3) {
        this.inflate(var1, var2, var3, (Theme)null);
    }

    public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
        if (this.b != null) {
            class_48.method_525(this.b, var1, var2, var3, var4);
        } else {
            int var5 = var2.getEventType();

            for(int var6 = var2.getDepth(); var5 != 1 && (var2.getDepth() >= var6 + 1 || var5 != 3); var5 = var2.next()) {
                if (var5 == 2) {
                    String var7 = var2.getName();
                    TypedArray var8;
                    if ("animated-vector".equals(var7)) {
                        var8 = class_140.method_1184(var1, var4, var3, class_56.field_541);
                        var5 = var8.getResourceId(0, 0);
                        if (var5 != 0) {
                            class_51 var9 = class_51.method_539(var1, var5, var4);
                            var9.method_546(false);
                            var9.setCallback(this.field_510);
                            if (this.field_511.field_531 != null) {
                                this.field_511.field_531.setCallback((Callback)null);
                            }

                            this.field_511.field_531 = var9;
                        }

                        var8.recycle();
                    } else if ("target".equals(var7)) {
                        var8 = var1.obtainAttributes(var3, class_56.field_542);
                        var7 = var8.getString(0);
                        var5 = var8.getResourceId(1, 0);
                        if (var5 != 0) {
                            if (this.field_512 == null) {
                                var8.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }

                            this.method_536(var7, class_55.method_556(this.field_512, var5));
                        }

                        var8.recycle();
                    }
                }
            }

            this.field_511.method_575();
        }

    }

    public boolean isAutoMirrored() {
        boolean var1;
        if (this.b != null) {
            var1 = class_48.method_528(this.b);
        } else {
            var1 = this.field_511.field_531.isAutoMirrored();
        }

        return var1;
    }

    public boolean isRunning() {
        boolean var1;
        if (this.b != null) {
            var1 = ((AnimatedVectorDrawable)this.b).isRunning();
        } else {
            var1 = this.field_511.field_532.isRunning();
        }

        return var1;
    }

    public boolean isStateful() {
        boolean var1;
        if (this.b != null) {
            var1 = this.b.isStateful();
        } else {
            var1 = this.field_511.field_531.isStateful();
        }

        return var1;
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        }

        return this;
    }

    protected void onBoundsChange(Rect var1) {
        if (this.b != null) {
            this.b.setBounds(var1);
        } else {
            this.field_511.field_531.setBounds(var1);
        }

    }

    protected boolean onLevelChange(int var1) {
        boolean var2;
        if (this.b != null) {
            var2 = this.b.setLevel(var1);
        } else {
            var2 = this.field_511.field_531.setLevel(var1);
        }

        return var2;
    }

    protected boolean onStateChange(int[] var1) {
        boolean var2;
        if (this.b != null) {
            var2 = this.b.setState(var1);
        } else {
            var2 = this.field_511.field_531.setState(var1);
        }

        return var2;
    }

    public void setAlpha(int var1) {
        if (this.b != null) {
            this.b.setAlpha(var1);
        } else {
            this.field_511.field_531.setAlpha(var1);
        }

    }

    public void setAutoMirrored(boolean var1) {
        if (this.b != null) {
            class_48.method_527(this.b, var1);
        } else {
            this.field_511.field_531.setAutoMirrored(var1);
        }

    }

    public void setColorFilter(ColorFilter var1) {
        if (this.b != null) {
            this.b.setColorFilter(var1);
        } else {
            this.field_511.field_531.setColorFilter(var1);
        }

    }

    public void setTint(int var1) {
        if (this.b != null) {
            class_48.method_521(this.b, var1);
        } else {
            this.field_511.field_531.setTint(var1);
        }

    }

    public void setTintList(ColorStateList var1) {
        if (this.b != null) {
            class_48.method_523(this.b, var1);
        } else {
            this.field_511.field_531.setTintList(var1);
        }

    }

    public void setTintMode(Mode var1) {
        if (this.b != null) {
            class_48.method_526(this.b, var1);
        } else {
            this.field_511.field_531.setTintMode(var1);
        }

    }

    public boolean setVisible(boolean var1, boolean var2) {
        if (this.b != null) {
            var1 = this.b.setVisible(var1, var2);
        } else {
            this.field_511.field_531.setVisible(var1, var2);
            var1 = super.setVisible(var1, var2);
        }

        return var1;
    }

    public void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable)this.b).start();
        } else if (!this.field_511.field_532.isStarted()) {
            this.field_511.field_532.start();
            this.invalidateSelf();
        }

    }

    public void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable)this.b).stop();
        } else {
            this.field_511.field_532.end();
        }

    }
}
