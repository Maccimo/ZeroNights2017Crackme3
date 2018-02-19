package android.support.v4.h;

import android.view.View;
import android.view.ViewGroup;

// $FF: renamed from: android.support.v4.h.l
public class class_144 {
    // $FF: renamed from: a android.view.ViewGroup
    private final ViewGroup field_1114;
    // $FF: renamed from: b int
    private int field_1115;

    public class_144(ViewGroup var1) {
        this.field_1114 = var1;
    }

    // $FF: renamed from: a () int
    public int method_1203() {
        return this.field_1115;
    }

    // $FF: renamed from: a (android.view.View) void
    public void method_1204(View var1) {
        this.method_1205(var1, 0);
    }

    // $FF: renamed from: a (android.view.View, int) void
    public void method_1205(View var1, int var2) {
        this.field_1115 = 0;
    }

    // $FF: renamed from: a (android.view.View, android.view.View, int) void
    public void method_1206(View var1, View var2, int var3) {
        this.method_1207(var1, var2, var3, 0);
    }

    // $FF: renamed from: a (android.view.View, android.view.View, int, int) void
    public void method_1207(View var1, View var2, int var3, int var4) {
        this.field_1115 = var3;
    }
}
