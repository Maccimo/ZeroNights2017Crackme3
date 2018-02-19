package android.support.v4.h;

import android.os.Bundle;
import android.os.Build.VERSION;
import android.support.v4.h.a.class_172;
import android.support.v4.h.a.class_175;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;

// $FF: renamed from: android.support.v4.h.b
public class class_42 {
    // $FF: renamed from: b android.support.v4.h.b$b
    private static final b$b field_352;
    // $FF: renamed from: c android.view.View.AccessibilityDelegate
    private static final AccessibilityDelegate field_353;
    // $FF: renamed from: a android.view.View.AccessibilityDelegate
    final AccessibilityDelegate field_354;

    static {
        if (VERSION.SDK_INT >= 16) {
            field_352 = new b$a();
        } else {
            field_352 = new b$b();
        }

        field_353 = new AccessibilityDelegate();
    }

    public class_42() {
        this.field_354 = field_352.method_805(this);
    }

    // $FF: renamed from: a (android.view.View) android.support.v4.h.a.b
    public class_172 method_431(View var1) {
        return field_352.method_804(field_353, var1);
    }

    // $FF: renamed from: a () android.view.View.AccessibilityDelegate
    AccessibilityDelegate method_432() {
        return this.field_354;
    }

    // $FF: renamed from: a (android.view.View, int) void
    public void method_433(View var1, int var2) {
        field_353.sendAccessibilityEvent(var1, var2);
    }

    // $FF: renamed from: a (android.view.View, android.support.v4.h.a.a) void
    public void method_434(View var1, class_175 var2) {
        field_353.onInitializeAccessibilityNodeInfo(var1, var2.method_1470());
    }

    // $FF: renamed from: a (android.view.View, android.view.accessibility.AccessibilityEvent) void
    public void method_435(View var1, AccessibilityEvent var2) {
        field_353.sendAccessibilityEventUnchecked(var1, var2);
    }

    // $FF: renamed from: a (android.view.View, int, android.os.Bundle) boolean
    public boolean method_436(View var1, int var2, Bundle var3) {
        return field_352.method_806(field_353, var1, var2, var3);
    }

    // $FF: renamed from: a (android.view.ViewGroup, android.view.View, android.view.accessibility.AccessibilityEvent) boolean
    public boolean method_437(ViewGroup var1, View var2, AccessibilityEvent var3) {
        return field_353.onRequestSendAccessibilityEvent(var1, var2, var3);
    }

    // $FF: renamed from: b (android.view.View, android.view.accessibility.AccessibilityEvent) boolean
    public boolean method_438(View var1, AccessibilityEvent var2) {
        return field_353.dispatchPopulateAccessibilityEvent(var1, var2);
    }

    // $FF: renamed from: c (android.view.View, android.view.accessibility.AccessibilityEvent) void
    public void method_439(View var1, AccessibilityEvent var2) {
        field_353.onPopulateAccessibilityEvent(var1, var2);
    }

    // $FF: renamed from: d (android.view.View, android.view.accessibility.AccessibilityEvent) void
    public void method_440(View var1, AccessibilityEvent var2) {
        field_353.onInitializeAccessibilityEvent(var1, var2);
    }
}
