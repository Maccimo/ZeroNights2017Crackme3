package android.support.b.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.v4.g.class_134;
import java.util.ArrayList;

class c$a extends ConstantState {
    // $FF: renamed from: a int
    int field_530;
    // $FF: renamed from: b android.support.b.a.i
    class_51 field_531;
    // $FF: renamed from: c android.animation.AnimatorSet
    AnimatorSet field_532;
    // $FF: renamed from: d android.support.v4.g.a
    class_134 field_533;
    // $FF: renamed from: e java.util.ArrayList
    private ArrayList field_534;

    public c$a(Context var1, c$a var2, Callback var3, Resources var4) {
        int var5 = 0;
        super();
        if (var2 != null) {
            this.field_530 = var2.field_530;
            if (var2.field_531 != null) {
                ConstantState var7 = var2.field_531.getConstantState();
                if (var4 != null) {
                    this.field_531 = (class_51)var7.newDrawable(var4);
                } else {
                    this.field_531 = (class_51)var7.newDrawable();
                }

                this.field_531 = (class_51)this.field_531.mutate();
                this.field_531.setCallback(var3);
                this.field_531.setBounds(var2.field_531.getBounds());
                this.field_531.method_546(false);
            }

            if (var2.field_534 != null) {
                int var6 = var2.field_534.size();
                this.field_534 = new ArrayList(var6);

                for(this.field_533 = new class_134(var6); var5 < var6; ++var5) {
                    Animator var9 = (Animator)var2.field_534.get(var5);
                    Animator var8 = var9.clone();
                    String var10 = (String)var2.field_533.get(var9);
                    var8.setTarget(this.field_531.method_545(var10));
                    this.field_534.add(var8);
                    this.field_533.put(var8, var10);
                }

                this.method_575();
            }
        }

    }

    // $FF: renamed from: a (android.support.b.a.c$a) java.util.ArrayList
    // $FF: synthetic method
    static ArrayList method_573(c$a var0) {
        return var0.field_534;
    }

    // $FF: renamed from: a (android.support.b.a.c$a, java.util.ArrayList) java.util.ArrayList
    // $FF: synthetic method
    static ArrayList method_574(c$a var0, ArrayList var1) {
        var0.field_534 = var1;
        return var1;
    }

    // $FF: renamed from: a () void
    public void method_575() {
        if (this.field_532 == null) {
            this.field_532 = new AnimatorSet();
        }

        this.field_532.playTogether(this.field_534);
    }

    public int getChangingConfigurations() {
        return this.field_530;
    }

    public Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public Drawable newDrawable(Resources var1) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
