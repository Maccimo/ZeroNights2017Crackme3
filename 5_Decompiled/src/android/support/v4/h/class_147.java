package android.support.v4.h;

import android.view.View;
import android.view.ViewParent;

// $FF: renamed from: android.support.v4.h.i
public class class_147 {
    // $FF: renamed from: a android.view.ViewParent
    private ViewParent field_1118;
    // $FF: renamed from: b android.view.ViewParent
    private ViewParent field_1119;
    // $FF: renamed from: c android.view.View
    private final View field_1120;
    // $FF: renamed from: d boolean
    private boolean field_1121;
    // $FF: renamed from: e int[]
    private int[] field_1122;

    public class_147(View var1) {
        this.field_1120 = var1;
    }

    // $FF: renamed from: a (int, android.view.ViewParent) void
    private void method_1230(int var1, ViewParent var2) {
        switch(var1) {
        case 0:
            this.field_1118 = var2;
            break;
        case 1:
            this.field_1119 = var2;
        }

    }

    // $FF: renamed from: d (int) android.view.ViewParent
    private ViewParent method_1231(int var1) {
        ViewParent var2;
        switch(var1) {
        case 0:
            var2 = this.field_1118;
            break;
        case 1:
            var2 = this.field_1119;
            break;
        default:
            var2 = null;
        }

        return var2;
    }

    // $FF: renamed from: a (boolean) void
    public void method_1232(boolean var1) {
        if (this.field_1121) {
            class_146.method_1228(this.field_1120);
        }

        this.field_1121 = var1;
    }

    // $FF: renamed from: a () boolean
    public boolean method_1233() {
        return this.field_1121;
    }

    // $FF: renamed from: a (float, float) boolean
    public boolean method_1234(float var1, float var2) {
        boolean var4 = false;
        boolean var3 = var4;
        if (this.method_1233()) {
            ViewParent var5 = this.method_1231(0);
            var3 = var4;
            if (var5 != null) {
                var3 = class_145.method_1211(var5, this.field_1120, var1, var2);
            }
        }

        return var3;
    }

    // $FF: renamed from: a (float, float, boolean) boolean
    public boolean method_1235(float var1, float var2, boolean var3) {
        boolean var5 = false;
        boolean var4 = var5;
        if (this.method_1233()) {
            ViewParent var6 = this.method_1231(0);
            var4 = var5;
            if (var6 != null) {
                var4 = class_145.method_1212(var6, this.field_1120, var1, var2, var3);
            }
        }

        return var4;
    }

    // $FF: renamed from: a (int) boolean
    public boolean method_1236(int var1) {
        boolean var2;
        if (this.method_1231(var1) != null) {
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    // $FF: renamed from: a (int, int) boolean
    public boolean method_1237(int var1, int var2) {
        boolean var3;
        if (this.method_1236(var2)) {
            var3 = true;
        } else {
            if (this.method_1233()) {
                ViewParent var4 = this.field_1120.getParent();

                for(View var5 = this.field_1120; var4 != null; var4 = var4.getParent()) {
                    if (class_145.method_1213(var4, var5, this.field_1120, var1, var2)) {
                        this.method_1230(var2, var4);
                        class_145.method_1214(var4, var5, this.field_1120, var1, var2);
                        var3 = true;
                        return var3;
                    }

                    if (var4 instanceof View) {
                        var5 = (View)var4;
                    }
                }
            }

            var3 = false;
        }

        return var3;
    }

    // $FF: renamed from: a (int, int, int, int, int[]) boolean
    public boolean method_1238(int var1, int var2, int var3, int var4, int[] var5) {
        return this.method_1239(var1, var2, var3, var4, var5, 0);
    }

    // $FF: renamed from: a (int, int, int, int, int[], int) boolean
    public boolean method_1239(int var1, int var2, int var3, int var4, int[] var5, int var6) {
        boolean var9;
        if (this.method_1233()) {
            ViewParent var10 = this.method_1231(var6);
            if (var10 == null) {
                var9 = false;
                return var9;
            }

            if (var1 != 0 || var2 != 0 || var3 != 0 || var4 != 0) {
                int var7;
                int var8;
                if (var5 != null) {
                    this.field_1120.getLocationInWindow(var5);
                    var8 = var5[0];
                    var7 = var5[1];
                } else {
                    var7 = 0;
                    var8 = 0;
                }

                class_145.method_1209(var10, this.field_1120, var1, var2, var3, var4, var6);
                if (var5 != null) {
                    this.field_1120.getLocationInWindow(var5);
                    var5[0] -= var8;
                    var5[1] -= var7;
                }

                var9 = true;
                return var9;
            }

            if (var5 != null) {
                var5[0] = 0;
                var5[1] = 0;
            }
        }

        var9 = false;
        return var9;
    }

    // $FF: renamed from: a (int, int, int[], int[]) boolean
    public boolean method_1240(int var1, int var2, int[] var3, int[] var4) {
        return this.method_1241(var1, var2, var3, var4, 0);
    }

    // $FF: renamed from: a (int, int, int[], int[], int) boolean
    public boolean method_1241(int var1, int var2, int[] var3, int[] var4, int var5) {
        boolean var8;
        if (this.method_1233()) {
            ViewParent var9 = this.method_1231(var5);
            if (var9 == null) {
                var8 = false;
                return var8;
            }

            if (var1 != 0 || var2 != 0) {
                int var6;
                int var7;
                if (var4 != null) {
                    this.field_1120.getLocationInWindow(var4);
                    var7 = var4[0];
                    var6 = var4[1];
                } else {
                    var6 = 0;
                    var7 = 0;
                }

                if (var3 == null) {
                    if (this.field_1122 == null) {
                        this.field_1122 = new int[2];
                    }

                    var3 = this.field_1122;
                }

                var3[0] = 0;
                var3[1] = 0;
                class_145.method_1210(var9, this.field_1120, var1, var2, var3, var5);
                if (var4 != null) {
                    this.field_1120.getLocationInWindow(var4);
                    var4[0] -= var7;
                    var4[1] -= var6;
                }

                if (var3[0] == 0 && var3[1] == 0) {
                    var8 = false;
                } else {
                    var8 = true;
                }

                return var8;
            }

            if (var4 != null) {
                var4[0] = 0;
                var4[1] = 0;
                var8 = false;
                return var8;
            }
        }

        var8 = false;
        return var8;
    }

    // $FF: renamed from: b () boolean
    public boolean method_1242() {
        return this.method_1236(0);
    }

    // $FF: renamed from: b (int) boolean
    public boolean method_1243(int var1) {
        return this.method_1237(var1, 0);
    }

    // $FF: renamed from: c () void
    public void method_1244() {
        this.method_1245(0);
    }

    // $FF: renamed from: c (int) void
    public void method_1245(int var1) {
        ViewParent var2 = this.method_1231(var1);
        if (var2 != null) {
            class_145.method_1208(var2, this.field_1120, var1);
            this.method_1230(var1, (ViewParent)null);
        }

    }
}
