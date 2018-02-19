package android.support.v7.widget;

import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff.Mode;
import android.support.v4.g.class_68;

class h$b extends class_68 {
    public h$b(int var1) {
        super(var1);
    }

    // $FF: renamed from: b (int, android.graphics.PorterDuff.Mode) int
    private static int method_666(int var0, Mode var1) {
        return (var0 + 31) * 31 + var1.hashCode();
    }

    // $FF: renamed from: a (int, android.graphics.PorterDuff.Mode) android.graphics.PorterDuffColorFilter
    PorterDuffColorFilter method_667(int var1, Mode var2) {
        return (PorterDuffColorFilter)this.a(method_666(var1, var2));
    }

    // $FF: renamed from: a (int, android.graphics.PorterDuff.Mode, android.graphics.PorterDuffColorFilter) android.graphics.PorterDuffColorFilter
    PorterDuffColorFilter method_668(int var1, Mode var2, PorterDuffColorFilter var3) {
        return (PorterDuffColorFilter)this.a(method_666(var1, var2), var3);
    }
}
