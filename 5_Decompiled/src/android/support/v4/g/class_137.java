package android.support.v4.g;

// $FF: renamed from: android.support.v4.g.c
public class class_137 implements Cloneable {
    // $FF: renamed from: a java.lang.Object
    private static final Object field_1082 = new Object();
    // $FF: renamed from: b boolean
    private boolean field_1083;
    // $FF: renamed from: c long[]
    private long[] field_1084;
    // $FF: renamed from: d java.lang.Object[]
    private Object[] field_1085;
    // $FF: renamed from: e int
    private int field_1086;

    public class_137() {
        this(10);
    }

    public class_137(int var1) {
        this.field_1083 = false;
        if (var1 == 0) {
            this.field_1084 = class_136.field_1080;
            this.field_1085 = class_136.field_1081;
        } else {
            var1 = class_136.method_1138(var1);
            this.field_1084 = new long[var1];
            this.field_1085 = new Object[var1];
        }

        this.field_1086 = 0;
    }

    // $FF: renamed from: c () void
    private void method_1140() {
        int var4 = this.field_1086;
        long[] var6 = this.field_1084;
        Object[] var5 = this.field_1085;
        int var2 = 0;

        int var3;
        for(int var1 = 0; var1 < var4; var2 = var3) {
            Object var7 = var5[var1];
            var3 = var2;
            if (var7 != field_1082) {
                if (var1 != var2) {
                    var6[var2] = var6[var1];
                    var5[var2] = var7;
                    var5[var1] = null;
                }

                var3 = var2 + 1;
            }

            ++var1;
        }

        this.field_1083 = false;
        this.field_1086 = var2;
    }

    // $FF: renamed from: a (int) long
    public long method_1141(int var1) {
        if (this.field_1083) {
            this.method_1140();
        }

        return this.field_1084[var1];
    }

    // $FF: renamed from: a () android.support.v4.g.c
    public class_137 method_1142() {
        class_137 var1;
        try {
            var1 = (class_137)super.clone();
        } catch (CloneNotSupportedException var4) {
            var1 = null;
            return var1;
        }

        try {
            var1.field_1084 = (long[])this.field_1084.clone();
            var1.field_1085 = (Object[])this.field_1085.clone();
        } catch (CloneNotSupportedException var3) {
            ;
        }

        return var1;
    }

    // $FF: renamed from: a (long) java.lang.Object
    public Object method_1143(long var1) {
        return this.method_1144(var1, (Object)null);
    }

    // $FF: renamed from: a (long, java.lang.Object) java.lang.Object
    public Object method_1144(long var1, Object var3) {
        int var4 = class_136.method_1136(this.field_1084, this.field_1086, var1);
        Object var5 = var3;
        if (var4 >= 0) {
            if (this.field_1085[var4] == field_1082) {
                var5 = var3;
            } else {
                var5 = this.field_1085[var4];
            }
        }

        return var5;
    }

    // $FF: renamed from: b () int
    public int method_1145() {
        if (this.field_1083) {
            this.method_1140();
        }

        return this.field_1086;
    }

    // $FF: renamed from: b (int) java.lang.Object
    public Object method_1146(int var1) {
        if (this.field_1083) {
            this.method_1140();
        }

        return this.field_1085[var1];
    }

    // $FF: renamed from: b (long) void
    public void method_1147(long var1) {
        int var3 = class_136.method_1136(this.field_1084, this.field_1086, var1);
        if (var3 >= 0 && this.field_1085[var3] != field_1082) {
            this.field_1085[var3] = field_1082;
            this.field_1083 = true;
        }

    }

    // $FF: renamed from: b (long, java.lang.Object) void
    public void method_1148(long var1, Object var3) {
        int var4 = class_136.method_1136(this.field_1084, this.field_1086, var1);
        if (var4 >= 0) {
            this.field_1085[var4] = var3;
        } else {
            int var5 = ~var4;
            if (var5 < this.field_1086 && this.field_1085[var5] == field_1082) {
                this.field_1084[var5] = var1;
                this.field_1085[var5] = var3;
            } else {
                var4 = var5;
                if (this.field_1083) {
                    var4 = var5;
                    if (this.field_1086 >= this.field_1084.length) {
                        this.method_1140();
                        var4 = ~class_136.method_1136(this.field_1084, this.field_1086, var1);
                    }
                }

                if (this.field_1086 >= this.field_1084.length) {
                    var5 = class_136.method_1138(this.field_1086 + 1);
                    long[] var6 = new long[var5];
                    Object[] var7 = new Object[var5];
                    System.arraycopy(this.field_1084, 0, var6, 0, this.field_1084.length);
                    System.arraycopy(this.field_1085, 0, var7, 0, this.field_1085.length);
                    this.field_1084 = var6;
                    this.field_1085 = var7;
                }

                if (this.field_1086 - var4 != 0) {
                    System.arraycopy(this.field_1084, var4, this.field_1084, var4 + 1, this.field_1086 - var4);
                    System.arraycopy(this.field_1085, var4, this.field_1085, var4 + 1, this.field_1086 - var4);
                }

                this.field_1084[var4] = var1;
                this.field_1085[var4] = var3;
                ++this.field_1086;
            }
        }

    }

    // $FF: synthetic method
    public Object clone() {
        return this.method_1142();
    }

    public String toString() {
        String var2;
        if (this.method_1145() <= 0) {
            var2 = "{}";
        } else {
            StringBuilder var3 = new StringBuilder(this.field_1086 * 28);
            var3.append('{');

            for(int var1 = 0; var1 < this.field_1086; ++var1) {
                if (var1 > 0) {
                    var3.append(", ");
                }

                var3.append(this.method_1141(var1));
                var3.append('=');
                Object var4 = this.method_1146(var1);
                if (var4 != this) {
                    var3.append(var4);
                } else {
                    var3.append("(this Map)");
                }
            }

            var3.append('}');
            var2 = var3.toString();
        }

        return var2;
    }
}
