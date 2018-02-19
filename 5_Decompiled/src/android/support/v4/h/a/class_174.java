package android.support.v4.h.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

// $FF: renamed from: android.support.v4.h.a.d
class class_174 {
    // $FF: renamed from: a (android.support.v4.h.a.d$a) java.lang.Object
    public static Object method_1467(final d$a var0) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int var1) {
                return (AccessibilityNodeInfo)var0.method_130(var1);
            }

            public List findAccessibilityNodeInfosByText(String var1, int var2) {
                return var0.method_131(var1, var2);
            }

            public AccessibilityNodeInfo findFocus(int var1) {
                return (AccessibilityNodeInfo)var0.method_133(var1);
            }

            public boolean performAction(int var1, int var2, Bundle var3) {
                return var0.method_132(var1, var2, var3);
            }
        };
    }
}
