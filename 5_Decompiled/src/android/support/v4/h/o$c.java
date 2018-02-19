package android.support.v4.h;

import android.view.View;
import android.view.ViewParent;

class o$c {
    // $FF: renamed from: a (android.view.ViewParent, android.view.View) void
    public void method_1246(ViewParent var1, View var2) {
        if (var1 instanceof class_19) {
            ((class_19)var1).onStopNestedScroll(var2);
        }

    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, int, int, int, int) void
    public void method_1247(ViewParent var1, View var2, int var3, int var4, int var5, int var6) {
        if (var1 instanceof class_19) {
            ((class_19)var1).onNestedScroll(var2, var3, var4, var5, var6);
        }

    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, int, int, int[]) void
    public void method_1248(ViewParent var1, View var2, int var3, int var4, int[] var5) {
        if (var1 instanceof class_19) {
            ((class_19)var1).onNestedPreScroll(var2, var3, var4, var5);
        }

    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, float, float) boolean
    public boolean method_1249(ViewParent var1, View var2, float var3, float var4) {
        boolean var5;
        if (var1 instanceof class_19) {
            var5 = ((class_19)var1).onNestedPreFling(var2, var3, var4);
        } else {
            var5 = false;
        }

        return var5;
    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, float, float, boolean) boolean
    public boolean method_1250(ViewParent var1, View var2, float var3, float var4, boolean var5) {
        if (var1 instanceof class_19) {
            var5 = ((class_19)var1).onNestedFling(var2, var3, var4, var5);
        } else {
            var5 = false;
        }

        return var5;
    }

    // $FF: renamed from: a (android.view.ViewParent, android.view.View, android.view.View, int) boolean
    public boolean method_1251(ViewParent var1, View var2, View var3, int var4) {
        boolean var5;
        if (var1 instanceof class_19) {
            var5 = ((class_19)var1).onStartNestedScroll(var2, var3, var4);
        } else {
            var5 = false;
        }

        return var5;
    }

    // $FF: renamed from: b (android.view.ViewParent, android.view.View, android.view.View, int) void
    public void method_1252(ViewParent var1, View var2, View var3, int var4) {
        if (var1 instanceof class_19) {
            ((class_19)var1).onNestedScrollAccepted(var2, var3, var4);
        }

    }
}
