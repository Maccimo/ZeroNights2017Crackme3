package android.support.v4.h.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo;

// $FF: renamed from: android.support.v4.h.a.a
public class class_175 {
    // $FF: renamed from: a android.support.v4.h.a.a$i
    static final a$i field_1377;
    // $FF: renamed from: b int
    public int field_1378 = -1;
    // $FF: renamed from: c android.view.accessibility.AccessibilityNodeInfo
    private final AccessibilityNodeInfo field_1379;

    static {
        if (VERSION.SDK_INT >= 24) {
            field_1377 = new a$h();
        } else if (VERSION.SDK_INT >= 23) {
            field_1377 = new a$g();
        } else if (VERSION.SDK_INT >= 22) {
            field_1377 = new a$f();
        } else if (VERSION.SDK_INT >= 21) {
            field_1377 = new a$e();
        } else if (VERSION.SDK_INT >= 19) {
            field_1377 = new a$d();
        } else if (VERSION.SDK_INT >= 18) {
            field_1377 = new a$c();
        } else if (VERSION.SDK_INT >= 17) {
            field_1377 = new a$b();
        } else if (VERSION.SDK_INT >= 16) {
            field_1377 = new a$a();
        } else {
            field_1377 = new a$i();
        }

    }

    private class_175(AccessibilityNodeInfo var1) {
        this.field_1379 = var1;
    }

    // $FF: renamed from: a (android.view.accessibility.AccessibilityNodeInfo) android.support.v4.h.a.a
    public static class_175 method_1468(AccessibilityNodeInfo var0) {
        return new class_175(var0);
    }

    // $FF: renamed from: b (int) java.lang.String
    private static String method_1469(int var0) {
        String var1;
        switch(var0) {
        case 1:
            var1 = "ACTION_FOCUS";
            break;
        case 2:
            var1 = "ACTION_CLEAR_FOCUS";
            break;
        case 4:
            var1 = "ACTION_SELECT";
            break;
        case 8:
            var1 = "ACTION_CLEAR_SELECTION";
            break;
        case 16:
            var1 = "ACTION_CLICK";
            break;
        case 32:
            var1 = "ACTION_LONG_CLICK";
            break;
        case 64:
            var1 = "ACTION_ACCESSIBILITY_FOCUS";
            break;
        case 128:
            var1 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            break;
        case 256:
            var1 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            break;
        case 512:
            var1 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            break;
        case 1024:
            var1 = "ACTION_NEXT_HTML_ELEMENT";
            break;
        case 2048:
            var1 = "ACTION_PREVIOUS_HTML_ELEMENT";
            break;
        case 4096:
            var1 = "ACTION_SCROLL_FORWARD";
            break;
        case 8192:
            var1 = "ACTION_SCROLL_BACKWARD";
            break;
        case 16384:
            var1 = "ACTION_COPY";
            break;
        case 32768:
            var1 = "ACTION_PASTE";
            break;
        case 65536:
            var1 = "ACTION_CUT";
            break;
        case 131072:
            var1 = "ACTION_SET_SELECTION";
            break;
        default:
            var1 = "ACTION_UNKNOWN";
        }

        return var1;
    }

    // $FF: renamed from: a () android.view.accessibility.AccessibilityNodeInfo
    public AccessibilityNodeInfo method_1470() {
        return this.field_1379;
    }

    // $FF: renamed from: a (int) void
    public void method_1471(int var1) {
        this.field_1379.addAction(var1);
    }

    // $FF: renamed from: a (android.graphics.Rect) void
    public void method_1472(Rect var1) {
        this.field_1379.getBoundsInParent(var1);
    }

    // $FF: renamed from: a (java.lang.CharSequence) void
    public void method_1473(CharSequence var1) {
        this.field_1379.setClassName(var1);
    }

    // $FF: renamed from: a (boolean) void
    public void method_1474(boolean var1) {
        this.field_1379.setScrollable(var1);
    }

    // $FF: renamed from: b () int
    public int method_1475() {
        return this.field_1379.getActions();
    }

    // $FF: renamed from: b (android.graphics.Rect) void
    public void method_1476(Rect var1) {
        this.field_1379.getBoundsInScreen(var1);
    }

    // $FF: renamed from: c () boolean
    public boolean method_1477() {
        return this.field_1379.isCheckable();
    }

    // $FF: renamed from: d () boolean
    public boolean method_1478() {
        return this.field_1379.isChecked();
    }

    // $FF: renamed from: e () boolean
    public boolean method_1479() {
        return this.field_1379.isFocusable();
    }

    public boolean equals(Object var1) {
        boolean var3 = false;
        boolean var2;
        if (this != var1) {
            var2 = var3;
            if (var1 == null) {
                return var2;
            }

            var2 = var3;
            if (this.getClass() != var1.getClass()) {
                return var2;
            }

            class_175 var4 = (class_175)var1;
            if (this.field_1379 == null) {
                if (var4.field_1379 != null) {
                    var2 = var3;
                    return var2;
                }
            } else if (!this.field_1379.equals(var4.field_1379)) {
                var2 = var3;
                return var2;
            }
        }

        var2 = true;
        return var2;
    }

    // $FF: renamed from: f () boolean
    public boolean method_1480() {
        return this.field_1379.isFocused();
    }

    // $FF: renamed from: g () boolean
    public boolean method_1481() {
        return this.field_1379.isSelected();
    }

    // $FF: renamed from: h () boolean
    public boolean method_1482() {
        return this.field_1379.isClickable();
    }

    public int hashCode() {
        int var1;
        if (this.field_1379 == null) {
            var1 = 0;
        } else {
            var1 = this.field_1379.hashCode();
        }

        return var1;
    }

    // $FF: renamed from: i () boolean
    public boolean method_1483() {
        return this.field_1379.isLongClickable();
    }

    // $FF: renamed from: j () boolean
    public boolean method_1484() {
        return this.field_1379.isEnabled();
    }

    // $FF: renamed from: k () boolean
    public boolean method_1485() {
        return this.field_1379.isPassword();
    }

    // $FF: renamed from: l () boolean
    public boolean method_1486() {
        return this.field_1379.isScrollable();
    }

    // $FF: renamed from: m () java.lang.CharSequence
    public CharSequence method_1487() {
        return this.field_1379.getPackageName();
    }

    // $FF: renamed from: n () java.lang.CharSequence
    public CharSequence method_1488() {
        return this.field_1379.getClassName();
    }

    // $FF: renamed from: o () java.lang.CharSequence
    public CharSequence method_1489() {
        return this.field_1379.getText();
    }

    // $FF: renamed from: p () java.lang.CharSequence
    public CharSequence method_1490() {
        return this.field_1379.getContentDescription();
    }

    // $FF: renamed from: q () java.lang.String
    public String method_1491() {
        return field_1377.method_988(this.field_1379);
    }

    public String toString() {
        StringBuilder var4 = new StringBuilder();
        var4.append(super.toString());
        Rect var5 = new Rect();
        this.method_1472(var5);
        var4.append("; boundsInParent: " + var5);
        this.method_1476(var5);
        var4.append("; boundsInScreen: " + var5);
        var4.append("; packageName: ").append(this.method_1487());
        var4.append("; className: ").append(this.method_1488());
        var4.append("; text: ").append(this.method_1489());
        var4.append("; contentDescription: ").append(this.method_1490());
        var4.append("; viewId: ").append(this.method_1491());
        var4.append("; checkable: ").append(this.method_1477());
        var4.append("; checked: ").append(this.method_1478());
        var4.append("; focusable: ").append(this.method_1479());
        var4.append("; focused: ").append(this.method_1480());
        var4.append("; selected: ").append(this.method_1481());
        var4.append("; clickable: ").append(this.method_1482());
        var4.append("; longClickable: ").append(this.method_1483());
        var4.append("; enabled: ").append(this.method_1484());
        var4.append("; password: ").append(this.method_1485());
        var4.append("; scrollable: " + this.method_1486());
        var4.append("; [");
        int var1 = this.method_1475();

        while(var1 != 0) {
            int var3 = 1 << Integer.numberOfTrailingZeros(var1);
            int var2 = var1 & ~var3;
            var4.append(method_1469(var3));
            var1 = var2;
            if (var2 != 0) {
                var4.append(", ");
                var1 = var2;
            }
        }

        var4.append("]");
        return var4.toString();
    }
}
