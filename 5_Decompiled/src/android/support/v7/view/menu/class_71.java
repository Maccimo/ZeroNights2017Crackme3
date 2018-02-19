package android.support.v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// $FF: renamed from: android.support.v7.view.menu.b
public abstract class class_71 implements class_23 {
    // $FF: renamed from: a android.content.Context
    protected Context field_633;
    // $FF: renamed from: b android.content.Context
    protected Context field_634;
    // $FF: renamed from: c android.support.v7.view.menu.g
    protected class_162 field_635;
    // $FF: renamed from: d android.view.LayoutInflater
    protected LayoutInflater field_636;
    // $FF: renamed from: e android.view.LayoutInflater
    protected LayoutInflater field_637;
    // $FF: renamed from: f android.support.v7.view.menu.n
    protected class_24 field_638;
    // $FF: renamed from: g android.support.v7.view.menu.m$a
    private m$a field_639;
    // $FF: renamed from: h int
    private int field_640;
    // $FF: renamed from: i int
    private int field_641;

    public class_71(Context var1, int var2, int var3) {
        this.field_633 = var1;
        this.field_636 = LayoutInflater.from(var1);
        this.field_640 = var2;
        this.field_641 = var3;
    }

    // $FF: renamed from: a () android.support.v7.view.menu.m$a
    public m$a method_671() {
        return this.field_639;
    }

    // $FF: renamed from: a (android.view.ViewGroup) android.support.v7.view.menu.n$a
    public n$a method_672(ViewGroup var1) {
        return (n$a)this.field_636.inflate(this.field_641, var1, false);
    }

    // $FF: renamed from: a (android.support.v7.view.menu.h, android.view.View, android.view.ViewGroup) android.view.View
    public View method_673(class_168 var1, View var2, ViewGroup var3) {
        n$a var4;
        if (var2 instanceof n$a) {
            var4 = (n$a)var2;
        } else {
            var4 = this.method_672(var3);
        }

        this.method_674(var1, var4);
        return (View)var4;
    }

    // $FF: renamed from: a (android.content.Context, android.support.v7.view.menu.g) void
    public void method_139(Context var1, class_162 var2) {
        this.field_634 = var1;
        this.field_637 = LayoutInflater.from(this.field_634);
        this.field_635 = var2;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g, boolean) void
    public void method_140(class_162 var1, boolean var2) {
        if (this.field_639 != null) {
            this.field_639.method_128(var1, var2);
        }

    }

    // $FF: renamed from: a (android.support.v7.view.menu.h, android.support.v7.view.menu.n$a) void
    public abstract void method_674(class_168 var1, n$a var2);

    // $FF: renamed from: a (android.support.v7.view.menu.m$a) void
    public void method_141(m$a var1) {
        this.field_639 = var1;
    }

    // $FF: renamed from: a (android.view.View, int) void
    protected void method_675(View var1, int var2) {
        ViewGroup var3 = (ViewGroup)var1.getParent();
        if (var3 != null) {
            var3.removeView(var1);
        }

        ((ViewGroup)this.field_638).addView(var1, var2);
    }

    // $FF: renamed from: a (int, android.support.v7.view.menu.h) boolean
    public boolean method_676(int var1, class_168 var2) {
        return true;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g, android.support.v7.view.menu.h) boolean
    public boolean method_142(class_162 var1, class_168 var2) {
        return false;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.s) boolean
    public boolean method_143(class_163 var1) {
        boolean var2;
        if (this.field_639 != null) {
            var2 = this.field_639.method_129(var1);
        } else {
            var2 = false;
        }

        return var2;
    }

    // $FF: renamed from: a (android.view.ViewGroup, int) boolean
    protected boolean method_677(ViewGroup var1, int var2) {
        var1.removeViewAt(var2);
        return true;
    }

    // $FF: renamed from: b (boolean) void
    public void method_144(boolean var1) {
        ViewGroup var9 = (ViewGroup)this.field_638;
        if (var9 != null) {
            int var3;
            if (this.field_635 != null) {
                this.field_635.method_1373();
                ArrayList var8 = this.field_635.method_1372();
                int var5 = var8.size();
                int var4 = 0;
                int var2 = 0;

                while(true) {
                    var3 = var2;
                    if (var4 >= var5) {
                        break;
                    }

                    class_168 var10 = (class_168)var8.get(var4);
                    if (this.method_676(var2, var10)) {
                        View var7 = var9.getChildAt(var2);
                        class_168 var6;
                        if (var7 instanceof n$a) {
                            var6 = ((n$a)var7).getItemData();
                        } else {
                            var6 = null;
                        }

                        View var11 = this.method_673(var10, var7, var9);
                        if (var10 != var6) {
                            var11.setPressed(false);
                            var11.jumpDrawablesToCurrentState();
                        }

                        if (var11 != var7) {
                            this.method_675(var11, var2);
                        }

                        ++var2;
                    }

                    ++var4;
                }
            } else {
                var3 = 0;
            }

            while(var3 < var9.getChildCount()) {
                if (!this.method_677(var9, var3)) {
                    ++var3;
                }
            }
        }

    }

    // $FF: renamed from: b () boolean
    public boolean method_145() {
        return false;
    }

    // $FF: renamed from: b (android.support.v7.view.menu.g, android.support.v7.view.menu.h) boolean
    public boolean method_146(class_162 var1, class_168 var2) {
        return false;
    }
}
