package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

// $FF: renamed from: android.support.v4.g.a
public class class_134 extends class_133 implements Map {
    // $FF: renamed from: a android.support.v4.g.e
    class_131 field_1078;

    public class_134() {
    }

    public class_134(int var1) {
        super(var1);
    }

    // $FF: renamed from: b () android.support.v4.g.e
    private class_131 method_1130() {
        if (this.field_1078 == null) {
            this.field_1078 = new class_131() {
                // $FF: renamed from: a () int
                protected int method_1095() {
                    return class_134.this.h;
                }

                // $FF: renamed from: a (java.lang.Object) int
                protected int method_1096(Object var1) {
                    return class_134.this.a(var1);
                }

                // $FF: renamed from: a (int, int) java.lang.Object
                protected Object method_1097(int var1, int var2) {
                    return class_134.this.g[(var1 << 1) + var2];
                }

                // $FF: renamed from: a (int, java.lang.Object) java.lang.Object
                protected Object method_1098(int var1, Object var2) {
                    return class_134.this.a(var1, var2);
                }

                // $FF: renamed from: a (int) void
                protected void method_1099(int var1) {
                    class_134.this.d(var1);
                }

                // $FF: renamed from: a (java.lang.Object, java.lang.Object) void
                protected void method_1100(Object var1, Object var2) {
                    class_134.this.put(var1, var2);
                }

                // $FF: renamed from: b (java.lang.Object) int
                protected int method_1102(Object var1) {
                    return class_134.this.b(var1);
                }

                // $FF: renamed from: b () java.util.Map
                protected Map method_1103() {
                    return class_134.this;
                }

                // $FF: renamed from: c () void
                protected void method_1105() {
                    class_134.this.clear();
                }
            };
        }

        return this.field_1078;
    }

    public Set entrySet() {
        return this.method_1130().method_1106();
    }

    public Set keySet() {
        return this.method_1130().method_1107();
    }

    public void putAll(Map var1) {
        this.a(this.h + var1.size());
        Iterator var3 = var1.entrySet().iterator();

        while(var3.hasNext()) {
            Entry var2 = (Entry)var3.next();
            this.put(var2.getKey(), var2.getValue());
        }

    }

    public Collection values() {
        return this.method_1130().method_1108();
    }
}
