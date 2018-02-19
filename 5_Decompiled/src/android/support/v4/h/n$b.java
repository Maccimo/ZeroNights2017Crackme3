package android.support.v4.h;

import android.graphics.drawable.Drawable;
import android.view.View;

class n$b extends n$a {
    // $FF: renamed from: a (android.view.View) void
    public void method_1150(View var1) {
        var1.postInvalidateOnAnimation();
    }

    // $FF: renamed from: a (android.view.View, android.graphics.drawable.Drawable) void
    public void method_1153(View var1, Drawable var2) {
        var1.setBackground(var2);
    }

    // $FF: renamed from: a (android.view.View, java.lang.Runnable) void
    public void method_1155(View var1, Runnable var2) {
        var1.postOnAnimation(var2);
    }

    // $FF: renamed from: a (android.view.View, java.lang.Runnable, long) void
    public void method_1156(View var1, Runnable var2, long var3) {
        var1.postOnAnimationDelayed(var2, var3);
    }

    // $FF: renamed from: b (android.view.View) int
    public int method_1157(View var1) {
        return var1.getMinimumHeight();
    }

    // $FF: renamed from: c (android.view.View) void
    public void method_1158(View var1) {
        var1.requestFitSystemWindows();
    }
}
