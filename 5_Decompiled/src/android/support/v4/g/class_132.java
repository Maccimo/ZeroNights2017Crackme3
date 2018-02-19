package android.support.v4.g;

// $FF: renamed from: android.support.v4.g.h
public class class_132 implements Cloneable {
    // $FF: renamed from: a java.lang.Object
    private static final Object field_1066 = new Object();
    // $FF: renamed from: b boolean
    private boolean field_1067;
    // $FF: renamed from: c int[]
    private int[] field_1068;
    // $FF: renamed from: d java.lang.Object[]
    private Object[] field_1069;
    // $FF: renamed from: e int
    private int field_1070;

    public class_132() {
        this(10);
    }

    public class_132(int var1) {
        this.field_1067 = false;
        if (var1 == 0) {
            this.field_1068 = class_136.field_1079;
            this.field_1069 = class_136.field_1081;
        } else {
            var1 = class_136.method_1134(var1);
            this.field_1068 = new int[var1];
            this.field_1069 = new Object[var1];
        }

        this.field_1070 = 0;
    }

    // $FF: renamed from: c () void
    private void method_1109() {
        int var4 = this.field_1070;
        int[] var5 = this.field_1068;
        Object[] var6 = this.field_1069;
        int var3 = 0;

        int var2;
        for(int var1 = 0; var1 < var4; var3 = var2) {
            Object var7 = var6[var1];
            var2 = var3;
            if (var7 != field_1066) {
                if (var1 != var3) {
                    var5[var3] = var5[var1];
                    var6[var3] = var7;
                    var6[var1] = null;
                }

                var2 = var3 + 1;
            }

            ++var1;
        }

        this.field_1067 = false;
        this.field_1070 = var3;
    }

    // $FF: renamed from: a () android.support.v4.g.h
    public class_132 method_1110() {
        class_132 var1;
        try {
            var1 = (class_132)super.clone();
        } catch (CloneNotSupportedException var4) {
            var1 = null;
            return var1;
        }

        try {
            var1.field_1068 = (int[])this.field_1068.clone();
            var1.field_1069 = (Object[])this.field_1069.clone();
        } catch (CloneNotSupportedException var3) {
            ;
        }

        return var1;
    }

    // $FF: renamed from: a (int) java.lang.Object
    public Object method_1111(int var1) {
        return this.method_1112(var1, (Object)null);
    }

    // $FF: renamed from: a (int, java.lang.Object) java.lang.Object
    public Object method_1112(int var1, Object var2) {
        var1 = class_136.method_1135(this.field_1068, this.field_1070, var1);
        Object var3 = var2;
        if (var1 >= 0) {
            if (this.field_1069[var1] == field_1066) {
                var3 = var2;
            } else {
                var3 = this.field_1069[var1];
            }
        }

        return var3;
    }

    // $FF: renamed from: b () int
    public int method_1113() {
        if (this.field_1067) {
            this.method_1109();
        }

        return this.field_1070;
    }

    // $FF: renamed from: b (int) int
    public int method_1114(int var1) {
        if (this.field_1067) {
            this.method_1109();
        }

        return this.field_1068[var1];
    }

    // $FF: renamed from: b (int, java.lang.Object) void
    public void method_1115(int var1, Object var2) {
        int var3 = class_136.method_1135(this.field_1068, this.field_1070, var1);
        if (var3 >= 0) {
            this.field_1069[var3] = var2;
        } else {
            int var4 = ~var3;
            if (var4 < this.field_1070 && this.field_1069[var4] == field_1066) {
                this.field_1068[var4] = var1;
                this.field_1069[var4] = var2;
            } else {
                var3 = var4;
                if (this.field_1067) {
                    var3 = var4;
                    if (this.field_1070 >= this.field_1068.length) {
                        this.method_1109();
                        var3 = ~class_136.method_1135(this.field_1068, this.field_1070, var1);
                    }
                }

                if (this.field_1070 >= this.field_1068.length) {
                    var4 = class_136.method_1134(this.field_1070 + 1);
                    int[] var6 = new int[var4];
                    Object[] var5 = new Object[var4];
                    System.arraycopy(this.field_1068, 0, var6, 0, this.field_1068.length);
                    System.arraycopy(this.field_1069, 0, var5, 0, this.field_1069.length);
                    this.field_1068 = var6;
                    this.field_1069 = var5;
                }

                if (this.field_1070 - var3 != 0) {
                    System.arraycopy(this.field_1068, var3, this.field_1068, var3 + 1, this.field_1070 - var3);
                    System.arraycopy(this.field_1069, var3, this.field_1069, var3 + 1, this.field_1070 - var3);
                }

                this.field_1068[var3] = var1;
                this.field_1069[var3] = var2;
                ++this.field_1070;
            }
        }

    }

    // $FF: renamed from: c (int) java.lang.Object
    public Object method_1116(int var1) {
        if (this.field_1067) {
            this.method_1109();
        }

        return this.field_1069[var1];
    }

    // $FF: renamed from: c (int, java.lang.Object) void
    public void method_1117(int var1, Object var2) {
        if (this.field_1070 != 0 && var1 <= this.field_1068[this.field_1070 - 1]) {
            this.method_1115(var1, var2);
        } else {
            if (this.field_1067 && this.field_1070 >= this.field_1068.length) {
                this.method_1109();
            }

            int var3 = this.field_1070;
            if (var3 >= this.field_1068.length) {
                int var4 = class_136.method_1134(var3 + 1);
                int[] var6 = new int[var4];
                Object[] var5 = new Object[var4];
                System.arraycopy(this.field_1068, 0, var6, 0, this.field_1068.length);
                System.arraycopy(this.field_1069, 0, var5, 0, this.field_1069.length);
                this.field_1068 = var6;
                this.field_1069 = var5;
            }

            this.field_1068[var3] = var1;
            this.field_1069[var3] = var2;
            this.field_1070 = var3 + 1;
        }

    }

    // $FF: synthetic method
    public Object clone() {
        return this.method_1110();
    }

    public String toString() {
        String var2;
        if (this.method_1113() <= 0) {
            var2 = "{}";
        } else {
            StringBuilder var4 = new StringBuilder(this.field_1070 * 28);
            var4.append('{');

            for(int var1 = 0; var1 < this.field_1070; ++var1) {
                if (var1 > 0) {
                    var4.append(", ");
                }

                var4.append(this.method_1114(var1));
                var4.append('=');
                Object var3 = this.method_1116(var1);
                if (var3 != this) {
                    var4.append(var3);
                } else {
                    var4.append("(this Map)");
                }
            }

            var4.append('}');
            var2 = var4.toString();
        }

        return var2;
    }
}
