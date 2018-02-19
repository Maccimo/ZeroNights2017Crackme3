package android.support.v4.h.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

// $FF: renamed from: android.support.v4.h.a.c
class class_171 {
    // $FF: renamed from: a (android.support.v4.h.a.c$a) java.lang.Object
    public static Object method_1459(final c$a var0) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int var1) {
                return (AccessibilityNodeInfo)var0.method_151(var1);
            }

            public List findAccessibilityNodeInfosByText(String var1, int var2) {
                return var0.method_152(var1, var2);
            }

            public boolean performAction(int var1, int var2, Bundle var3) {
                return var0.method_153(var1, var2, var3);
            }
        };
    }
}
