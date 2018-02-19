package android.arch.lifecycle;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class ReflectiveGenericLifecycleObserver implements class_0 {
    // $FF: renamed from: a java.util.Map
    static final Map field_746 = new HashMap();
    // $FF: renamed from: b java.lang.Object
    private final Object field_747;
    // $FF: renamed from: c android.arch.lifecycle.ReflectiveGenericLifecycleObserver$a
    private final ReflectiveGenericLifecycleObserver.class_292 field_748;

    ReflectiveGenericLifecycleObserver(Object var1) {
        this.field_747 = var1;
        this.field_748 = method_808(this.field_747.getClass());
    }

    // $FF: renamed from: a (java.lang.Class) android.arch.lifecycle.ReflectiveGenericLifecycleObserver$a
    private static ReflectiveGenericLifecycleObserver.class_292 method_808(Class var0) {
        ReflectiveGenericLifecycleObserver.class_292 var1 = (ReflectiveGenericLifecycleObserver.class_292)field_746.get(var0);
        ReflectiveGenericLifecycleObserver.class_292 var2;
        if (var1 != null) {
            var2 = var1;
        } else {
            var2 = method_810(var0);
        }

        return var2;
    }

    // $FF: renamed from: a (java.util.Map, android.arch.lifecycle.ReflectiveGenericLifecycleObserver$b, android.arch.lifecycle.b$a, java.lang.Class) void
    private static void method_809(Map var0, ReflectiveGenericLifecycleObserver.class_293 var1, b$a var2, Class var3) {
        b$a var4 = (b$a)var0.get(var1);
        if (var4 != null && var2 != var4) {
            Method var5 = var1.field_901;
            throw new IllegalArgumentException("Method " + var5.getName() + " in " + var3.getName() + " already declared with different @OnLifecycleEvent value: previous" + " value " + var4 + ", new value " + var2);
        } else {
            if (var4 == null) {
                var0.put(var1, var2);
            }

        }
    }

    // $FF: renamed from: b (java.lang.Class) android.arch.lifecycle.ReflectiveGenericLifecycleObserver$a
    private static ReflectiveGenericLifecycleObserver.class_292 method_810(Class var0) {
        Class var5 = var0.getSuperclass();
        HashMap var4 = new HashMap();
        if (var5 != null) {
            ReflectiveGenericLifecycleObserver.class_292 var11 = method_808(var5);
            if (var11 != null) {
                var4.putAll(var11.field_1044);
            }
        }

        Method[] var12 = var0.getDeclaredMethods();
        Class[] var8 = var0.getInterfaces();
        int var2 = var8.length;

        for(int var1 = 0; var1 < var2; ++var1) {
            Iterator var7 = method_808(var8[var1]).field_1044.entrySet().iterator();

            while(var7.hasNext()) {
                Entry var6 = (Entry)var7.next();
                method_809(var4, (ReflectiveGenericLifecycleObserver.class_293)var6.getKey(), (b$a)var6.getValue(), var0);
            }
        }

        int var3 = var12.length;

        for(var2 = 0; var2 < var3; ++var2) {
            Method var13 = var12[var2];
            class_2 var15 = (class_2)var13.getAnnotation(d.class);
            if (var15 != null) {
                Class[] var14 = var13.getParameterTypes();
                byte var9;
                if (var14.length > 0) {
                    if (!var14[0].isAssignableFrom(c.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }

                    var9 = 1;
                } else {
                    var9 = 0;
                }

                b$a var16 = var15.method_7();
                if (var14.length > 1) {
                    if (!var14[1].isAssignableFrom(b$a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }

                    if (var16 != b$a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }

                    var9 = 2;
                }

                if (var14.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }

                method_809(var4, new ReflectiveGenericLifecycleObserver.class_293(var9, var13), var16, var0);
            }
        }

        ReflectiveGenericLifecycleObserver.class_292 var10 = new ReflectiveGenericLifecycleObserver.class_292(var4);
        field_746.put(var0, var10);
        return var10;
    }

    static class class_292 {
        // $FF: renamed from: a java.util.Map
        final Map field_1043;
        // $FF: renamed from: b java.util.Map
        final Map field_1044;

        class_292(Map var1) {
            this.field_1044 = var1;
            this.field_1043 = new HashMap();

            Entry var3;
            Object var6;
            for(Iterator var5 = var1.entrySet().iterator(); var5.hasNext(); ((List)var6).add(var3.getKey())) {
                var3 = (Entry)var5.next();
                b$a var4 = (b$a)var3.getValue();
                List var2 = (List)this.field_1043.get(var4);
                var6 = var2;
                if (var2 == null) {
                    var6 = new ArrayList();
                    this.field_1043.put(var4, var6);
                }
            }

        }
    }

    static class class_293 {
        // $FF: renamed from: a int
        final int field_900;
        // $FF: renamed from: b java.lang.reflect.Method
        final Method field_901;

        class_293(int var1, Method var2) {
            this.field_900 = var1;
            this.field_901 = var2;
            this.field_901.setAccessible(true);
        }

        public boolean equals(Object var1) {
            boolean var2 = true;
            if (this != var1) {
                if (var1 != null && this.getClass() == var1.getClass()) {
                    ReflectiveGenericLifecycleObserver.class_293 var3 = (ReflectiveGenericLifecycleObserver.class_293)var1;
                    if (this.field_900 != var3.field_900 || !this.field_901.getName().equals(var3.field_901.getName())) {
                        var2 = false;
                    }
                } else {
                    var2 = false;
                }
            }

            return var2;
        }

        public int hashCode() {
            return this.field_900 * 31 + this.field_901.getName().hashCode();
        }
    }
}
