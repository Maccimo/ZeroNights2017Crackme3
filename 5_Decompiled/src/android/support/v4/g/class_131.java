package android.support.v4.g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// $FF: renamed from: android.support.v4.g.e
abstract class class_131 {
    // $FF: renamed from: b android.support.v4.g.e$b
    e$b field_1062;
    // $FF: renamed from: c android.support.v4.g.e$c
    e$c field_1063;
    // $FF: renamed from: d android.support.v4.g.e$e
    e$e field_1064;

    // $FF: renamed from: a (java.util.Map, java.util.Collection) boolean
    public static boolean method_1091(Map var0, Collection var1) {
        Iterator var3 = var1.iterator();

        boolean var2;
        while(true) {
            if (var3.hasNext()) {
                if (var0.containsKey(var3.next())) {
                    continue;
                }

                var2 = false;
                break;
            }

            var2 = true;
            break;
        }

        return var2;
    }

    // $FF: renamed from: a (java.util.Set, java.lang.Object) boolean
    public static boolean method_1092(Set var0, Object var1) {
        boolean var3 = true;
        boolean var4 = false;
        boolean var2;
        if (var0 == var1) {
            var2 = true;
        } else {
            var2 = var4;
            if (var1 instanceof Set) {
                Set var7 = (Set)var1;

                label26: {
                    try {
                        if (var0.size() != var7.size()) {
                            break label26;
                        }

                        var2 = var0.containsAll(var7);
                    } catch (NullPointerException var5) {
                        var2 = var4;
                        return var2;
                    } catch (ClassCastException var6) {
                        var2 = var4;
                        return var2;
                    }

                    if (var2) {
                        var2 = var3;
                        return var2;
                    }
                }

                var2 = false;
            }
        }

        return var2;
    }

    // $FF: renamed from: b (java.util.Map, java.util.Collection) boolean
    public static boolean method_1093(Map var0, Collection var1) {
        int var2 = var0.size();
        Iterator var4 = var1.iterator();

        while(var4.hasNext()) {
            var0.remove(var4.next());
        }

        boolean var3;
        if (var2 != var0.size()) {
            var3 = true;
        } else {
            var3 = false;
        }

        return var3;
    }

    // $FF: renamed from: c (java.util.Map, java.util.Collection) boolean
    public static boolean method_1094(Map var0, Collection var1) {
        int var2 = var0.size();
        Iterator var4 = var0.keySet().iterator();

        while(var4.hasNext()) {
            if (!var1.contains(var4.next())) {
                var4.remove();
            }
        }

        boolean var3;
        if (var2 != var0.size()) {
            var3 = true;
        } else {
            var3 = false;
        }

        return var3;
    }

    // $FF: renamed from: a () int
    protected abstract int method_1095();

    // $FF: renamed from: a (java.lang.Object) int
    protected abstract int method_1096(Object var1);

    // $FF: renamed from: a (int, int) java.lang.Object
    protected abstract Object method_1097(int var1, int var2);

    // $FF: renamed from: a (int, java.lang.Object) java.lang.Object
    protected abstract Object method_1098(int var1, Object var2);

    // $FF: renamed from: a (int) void
    protected abstract void method_1099(int var1);

    // $FF: renamed from: a (java.lang.Object, java.lang.Object) void
    protected abstract void method_1100(Object var1, Object var2);

    // $FF: renamed from: a (java.lang.Object[], int) java.lang.Object[]
    public Object[] method_1101(Object[] var1, int var2) {
        int var4 = this.method_1095();
        if (var1.length < var4) {
            var1 = (Object[])((Object[])Array.newInstance(var1.getClass().getComponentType(), var4));
        }

        for(int var3 = 0; var3 < var4; ++var3) {
            var1[var3] = this.method_1097(var3, var2);
        }

        if (var1.length > var4) {
            var1[var4] = null;
        }

        return var1;
    }

    // $FF: renamed from: b (java.lang.Object) int
    protected abstract int method_1102(Object var1);

    // $FF: renamed from: b () java.util.Map
    protected abstract Map method_1103();

    // $FF: renamed from: b (int) java.lang.Object[]
    public Object[] method_1104(int var1) {
        int var3 = this.method_1095();
        Object[] var4 = new Object[var3];

        for(int var2 = 0; var2 < var3; ++var2) {
            var4[var2] = this.method_1097(var2, var1);
        }

        return var4;
    }

    // $FF: renamed from: c () void
    protected abstract void method_1105();

    // $FF: renamed from: d () java.util.Set
    public Set method_1106() {
        if (this.field_1062 == null) {
            this.field_1062 = new e$b(this);
        }

        return this.field_1062;
    }

    // $FF: renamed from: e () java.util.Set
    public Set method_1107() {
        if (this.field_1063 == null) {
            this.field_1063 = new e$c(this);
        }

        return this.field_1063;
    }

    // $FF: renamed from: f () java.util.Collection
    public Collection method_1108() {
        if (this.field_1064 == null) {
            this.field_1064 = new e$e(this);
        }

        return this.field_1064;
    }
}
