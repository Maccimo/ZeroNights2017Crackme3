package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.view.menu.class_162;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

// $FF: renamed from: android.support.v7.widget.aa
public class class_28 extends class_27 implements class_8 {
    // $FF: renamed from: a java.lang.reflect.Method
    private static Method field_53;
    // $FF: renamed from: b android.support.v7.widget.z
    private class_8 field_54;

    static {
        try {
            field_53 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException var1) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }

    }

    public class_28(Context var1, AttributeSet var2, int var3, int var4) {
        super(var1, var2, var3, var4);
    }

    // $FF: renamed from: a (android.content.Context, boolean) android.support.v7.widget.t
    class_66 method_174(Context var1, boolean var2) {
        aa$a var3 = new aa$a(var1, var2);
        var3.setHoverListener(this);
        return var3;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g, android.view.MenuItem) void
    public void method_29(class_162 var1, MenuItem var2) {
        if (this.field_54 != null) {
            this.field_54.method_29(var1, var2);
        }

    }

    // $FF: renamed from: a (android.support.v7.widget.z) void
    public void method_200(class_8 var1) {
        this.field_54 = var1;
    }

    // $FF: renamed from: a (java.lang.Object) void
    public void method_201(Object var1) {
        if (VERSION.SDK_INT >= 23) {
            this.g.setEnterTransition((Transition)var1);
        }

    }

    // $FF: renamed from: b (android.support.v7.view.menu.g, android.view.MenuItem) void
    public void method_30(class_162 var1, MenuItem var2) {
        if (this.field_54 != null) {
            this.field_54.method_30(var1, var2);
        }

    }

    // $FF: renamed from: b (java.lang.Object) void
    public void method_202(Object var1) {
        if (VERSION.SDK_INT >= 23) {
            this.g.setExitTransition((Transition)var1);
        }

    }

    // $FF: renamed from: c (boolean) void
    public void method_203(boolean var1) {
        if (field_53 != null) {
            try {
                field_53.invoke(this.g, var1);
            } catch (Exception var3) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }

    }
}
