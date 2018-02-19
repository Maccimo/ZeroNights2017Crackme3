package android.support.v4.g;

import java.util.ConcurrentModificationException;

// $FF: renamed from: android.support.v4.g.g
public class class_133 {
    // $FF: renamed from: b java.lang.Object[]
    static Object[] field_1071;
    // $FF: renamed from: c int
    static int field_1072;
    // $FF: renamed from: d java.lang.Object[]
    static Object[] field_1073;
    // $FF: renamed from: e int
    static int field_1074;
    // $FF: renamed from: f int[]
    int[] field_1075;
    // $FF: renamed from: g java.lang.Object[]
    Object[] field_1076;
    // $FF: renamed from: h int
    int field_1077;

    public class_133() {
        this.field_1075 = class_136.field_1079;
        this.field_1076 = class_136.field_1081;
        this.field_1077 = 0;
    }

    public class_133(int var1) {
        if (var1 == 0) {
            this.field_1075 = class_136.field_1079;
            this.field_1076 = class_136.field_1081;
        } else {
            this.method_1120(var1);
        }

        this.field_1077 = 0;
    }

    // $FF: renamed from: a (int[], int, int) int
    private static int method_1118(int[] var0, int var1, int var2) {
        try {
            var1 = class_136.method_1135(var0, var1, var2);
            return var1;
        } catch (ArrayIndexOutOfBoundsException var3) {
            throw new ConcurrentModificationException();
        }
    }

    // $FF: renamed from: a (int[], java.lang.Object[], int) void
    private static void method_1119(int[] param0, Object[] param1, int param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: e (int) void
    private void method_1120(int param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a () int
    int method_1121() {
        int var4 = this.field_1077;
        int var1;
        if (var4 == 0) {
            var1 = -1;
        } else {
            int var3 = method_1118(this.field_1075, var4, 0);
            var1 = var3;
            if (var3 >= 0) {
                var1 = var3;
                if (this.field_1076[var3 << 1] != null) {
                    int var2;
                    for(var2 = var3 + 1; var2 < var4 && this.field_1075[var2] == 0; ++var2) {
                        var1 = var2;
                        if (this.field_1076[var2 << 1] == null) {
                            return var1;
                        }
                    }

                    --var3;

                    while(var3 >= 0 && this.field_1075[var3] == 0) {
                        var1 = var3;
                        if (this.field_1076[var3 << 1] == null) {
                            return var1;
                        }

                        --var3;
                    }

                    var1 = ~var2;
                }
            }
        }

        return var1;
    }

    // $FF: renamed from: a (java.lang.Object) int
    public int method_1122(Object var1) {
        int var2;
        if (var1 == null) {
            var2 = this.method_1121();
        } else {
            var2 = this.method_1123(var1, var1.hashCode());
        }

        return var2;
    }

    // $FF: renamed from: a (java.lang.Object, int) int
    int method_1123(Object var1, int var2) {
        int var6 = this.field_1077;
        int var3;
        if (var6 == 0) {
            var3 = -1;
        } else {
            int var5 = method_1118(this.field_1075, var6, var2);
            var3 = var5;
            if (var5 >= 0) {
                var3 = var5;
                if (!var1.equals(this.field_1076[var5 << 1])) {
                    int var4;
                    for(var4 = var5 + 1; var4 < var6 && this.field_1075[var4] == var2; ++var4) {
                        var3 = var4;
                        if (var1.equals(this.field_1076[var4 << 1])) {
                            return var3;
                        }
                    }

                    --var5;

                    while(var5 >= 0 && this.field_1075[var5] == var2) {
                        var3 = var5;
                        if (var1.equals(this.field_1076[var5 << 1])) {
                            return var3;
                        }

                        --var5;
                    }

                    var3 = ~var4;
                }
            }
        }

        return var3;
    }

    // $FF: renamed from: a (int, java.lang.Object) java.lang.Object
    public Object method_1124(int var1, Object var2) {
        var1 = (var1 << 1) + 1;
        Object var3 = this.field_1076[var1];
        this.field_1076[var1] = var2;
        return var3;
    }

    // $FF: renamed from: a (int) void
    public void method_1125(int var1) {
        int var2 = this.field_1077;
        if (this.field_1075.length < var1) {
            int[] var3 = this.field_1075;
            Object[] var4 = this.field_1076;
            this.method_1120(var1);
            if (this.field_1077 > 0) {
                System.arraycopy(var3, 0, this.field_1075, 0, var2);
                System.arraycopy(var4, 0, this.field_1076, 0, var2 << 1);
            }

            method_1119(var3, var4, var2);
        }

        if (this.field_1077 != var2) {
            throw new ConcurrentModificationException();
        }
    }

    // $FF: renamed from: b (java.lang.Object) int
    int method_1126(Object var1) {
        int var2 = 1;
        byte var3 = 1;
        int var4 = this.field_1077 * 2;
        Object[] var5 = this.field_1076;
        if (var1 == null) {
            for(var2 = var3; var2 < var4; var2 += 2) {
                if (var5[var2] == null) {
                    var2 >>= 1;
                    return var2;
                }
            }
        } else {
            while(var2 < var4) {
                if (var1.equals(var5[var2])) {
                    var2 >>= 1;
                    return var2;
                }

                var2 += 2;
            }
        }

        var2 = -1;
        return var2;
    }

    // $FF: renamed from: b (int) java.lang.Object
    public Object method_1127(int var1) {
        return this.field_1076[var1 << 1];
    }

    // $FF: renamed from: c (int) java.lang.Object
    public Object method_1128(int var1) {
        return this.field_1076[(var1 << 1) + 1];
    }

    public void clear() {
        if (this.field_1077 > 0) {
            int[] var2 = this.field_1075;
            Object[] var3 = this.field_1076;
            int var1 = this.field_1077;
            this.field_1075 = class_136.field_1079;
            this.field_1076 = class_136.field_1081;
            this.field_1077 = 0;
            method_1119(var2, var3, var1);
        }

        if (this.field_1077 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object var1) {
        boolean var2;
        if (this.method_1122(var1) >= 0) {
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    public boolean containsValue(Object var1) {
        boolean var2;
        if (this.method_1126(var1) >= 0) {
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    // $FF: renamed from: d (int) java.lang.Object
    public Object method_1129(int var1) {
        int var3 = 8;
        byte var2 = 0;
        Object var7 = this.field_1076[(var1 << 1) + 1];
        int var4 = this.field_1077;
        if (var4 <= 1) {
            method_1119(this.field_1075, this.field_1076, var4);
            this.field_1075 = class_136.field_1079;
            this.field_1076 = class_136.field_1081;
            var1 = var2;
        } else {
            int var8 = var4 - 1;
            if (this.field_1075.length > 8 && this.field_1077 < this.field_1075.length / 3) {
                if (var4 > 8) {
                    var3 = (var4 >> 1) + var4;
                }

                int[] var5 = this.field_1075;
                Object[] var6 = this.field_1076;
                this.method_1120(var3);
                if (var4 != this.field_1077) {
                    throw new ConcurrentModificationException();
                }

                if (var1 > 0) {
                    System.arraycopy(var5, 0, this.field_1075, 0, var1);
                    System.arraycopy(var6, 0, this.field_1076, 0, var1 << 1);
                }

                if (var1 < var8) {
                    System.arraycopy(var5, var1 + 1, this.field_1075, var1, var8 - var1);
                    System.arraycopy(var6, var1 + 1 << 1, this.field_1076, var1 << 1, var8 - var1 << 1);
                }

                var1 = var8;
            } else {
                if (var1 < var8) {
                    System.arraycopy(this.field_1075, var1 + 1, this.field_1075, var1, var8 - var1);
                    System.arraycopy(this.field_1076, var1 + 1 << 1, this.field_1076, var1 << 1, var8 - var1 << 1);
                }

                this.field_1076[var8 << 1] = null;
                this.field_1076[(var8 << 1) + 1] = null;
                var1 = var8;
            }
        }

        if (var4 != this.field_1077) {
            throw new ConcurrentModificationException();
        } else {
            this.field_1077 = var1;
            return var7;
        }
    }

    public boolean equals(Object param1) {
        // $FF: Couldn't be decompiled
    }

    public Object get(Object var1) {
        int var2 = this.method_1122(var1);
        if (var2 >= 0) {
            var1 = this.field_1076[(var2 << 1) + 1];
        } else {
            var1 = null;
        }

        return var1;
    }

    public int hashCode() {
        int[] var9 = this.field_1075;
        Object[] var7 = this.field_1076;
        int var5 = this.field_1077;
        int var2 = 1;
        int var3 = 0;

        for(int var1 = 0; var1 < var5; var2 += 2) {
            Object var8 = var7[var2];
            int var6 = var9[var1];
            int var4;
            if (var8 == null) {
                var4 = 0;
            } else {
                var4 = var8.hashCode();
            }

            var3 += var4 ^ var6;
            ++var1;
        }

        return var3;
    }

    public boolean isEmpty() {
        boolean var1;
        if (this.field_1077 <= 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public Object put(Object var1, Object var2) {
        byte var5 = 4;
        int var6 = this.field_1077;
        int var3;
        int var4;
        if (var1 == null) {
            var3 = this.method_1121();
            var4 = 0;
        } else {
            var4 = var1.hashCode();
            var3 = this.method_1123(var1, var4);
        }

        if (var3 >= 0) {
            var3 = (var3 << 1) + 1;
            var1 = this.field_1076[var3];
            this.field_1076[var3] = var2;
        } else {
            int var7 = ~var3;
            if (var6 >= this.field_1075.length) {
                if (var6 >= 8) {
                    var3 = (var6 >> 1) + var6;
                } else {
                    var3 = var5;
                    if (var6 >= 4) {
                        var3 = 8;
                    }
                }

                int[] var9 = this.field_1075;
                Object[] var8 = this.field_1076;
                this.method_1120(var3);
                if (var6 != this.field_1077) {
                    throw new ConcurrentModificationException();
                }

                if (this.field_1075.length > 0) {
                    System.arraycopy(var9, 0, this.field_1075, 0, var9.length);
                    System.arraycopy(var8, 0, this.field_1076, 0, var8.length);
                }

                method_1119(var9, var8, var6);
            }

            if (var7 < var6) {
                System.arraycopy(this.field_1075, var7, this.field_1075, var7 + 1, var6 - var7);
                System.arraycopy(this.field_1076, var7 << 1, this.field_1076, var7 + 1 << 1, this.field_1077 - var7 << 1);
            }

            if (var6 != this.field_1077 || var7 >= this.field_1075.length) {
                throw new ConcurrentModificationException();
            }

            this.field_1075[var7] = var4;
            this.field_1076[var7 << 1] = var1;
            this.field_1076[(var7 << 1) + 1] = var2;
            ++this.field_1077;
            var1 = null;
        }

        return var1;
    }

    public Object remove(Object var1) {
        int var2 = this.method_1122(var1);
        if (var2 >= 0) {
            var1 = this.method_1129(var2);
        } else {
            var1 = null;
        }

        return var1;
    }

    public int size() {
        return this.field_1077;
    }

    public String toString() {
        String var2;
        if (this.isEmpty()) {
            var2 = "{}";
        } else {
            StringBuilder var4 = new StringBuilder(this.field_1077 * 28);
            var4.append('{');

            for(int var1 = 0; var1 < this.field_1077; ++var1) {
                if (var1 > 0) {
                    var4.append(", ");
                }

                Object var3 = this.method_1127(var1);
                if (var3 != this) {
                    var4.append(var3);
                } else {
                    var4.append("(this Map)");
                }

                var4.append('=');
                var3 = this.method_1128(var1);
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
