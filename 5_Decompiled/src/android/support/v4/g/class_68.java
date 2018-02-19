package android.support.v4.g;

import java.util.LinkedHashMap;

// $FF: renamed from: android.support.v4.g.d
public class class_68 {
    // $FF: renamed from: a java.util.LinkedHashMap
    private final LinkedHashMap field_623;
    // $FF: renamed from: b int
    private int field_624;
    // $FF: renamed from: c int
    private int field_625;
    // $FF: renamed from: d int
    private int field_626;
    // $FF: renamed from: e int
    private int field_627;
    // $FF: renamed from: f int
    private int field_628;
    // $FF: renamed from: g int
    private int field_629;
    // $FF: renamed from: h int
    private int field_630;

    public class_68(int var1) {
        if (var1 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else {
            this.field_625 = var1;
            this.field_623 = new LinkedHashMap(0, 0.75F, true);
        }
    }

    // $FF: renamed from: c (java.lang.Object, java.lang.Object) int
    private int method_659(Object var1, Object var2) {
        int var3 = this.method_664(var1, var2);
        if (var3 < 0) {
            throw new IllegalStateException("Negative size: " + var1 + "=" + var2);
        } else {
            return var3;
        }
    }

    // $FF: renamed from: a (java.lang.Object) java.lang.Object
    public final Object method_660(Object param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (java.lang.Object, java.lang.Object) java.lang.Object
    public final Object method_661(Object param1, Object param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (int) void
    public void method_662(int param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (boolean, java.lang.Object, java.lang.Object, java.lang.Object) void
    protected void method_663(boolean var1, Object var2, Object var3, Object var4) {
    }

    // $FF: renamed from: b (java.lang.Object, java.lang.Object) int
    protected int method_664(Object var1, Object var2) {
        return 1;
    }

    // $FF: renamed from: b (java.lang.Object) java.lang.Object
    protected Object method_665(Object var1) {
        return null;
    }

    public final String toString() {
        // $FF: Couldn't be decompiled
    }
}
