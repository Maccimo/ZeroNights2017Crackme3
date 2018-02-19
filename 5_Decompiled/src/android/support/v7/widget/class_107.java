package android.support.v7.widget;

// $FF: renamed from: android.support.v7.widget.ac
class class_107 {
    // $FF: renamed from: a int
    private int field_924 = 0;
    // $FF: renamed from: b int
    private int field_925 = 0;
    // $FF: renamed from: c int
    private int field_926 = Integer.MIN_VALUE;
    // $FF: renamed from: d int
    private int field_927 = Integer.MIN_VALUE;
    // $FF: renamed from: e int
    private int field_928 = 0;
    // $FF: renamed from: f int
    private int field_929 = 0;
    // $FF: renamed from: g boolean
    private boolean field_930 = false;
    // $FF: renamed from: h boolean
    private boolean field_931 = false;

    // $FF: renamed from: a () int
    public int method_936() {
        return this.field_924;
    }

    // $FF: renamed from: a (int, int) void
    public void method_937(int var1, int var2) {
        this.field_926 = var1;
        this.field_927 = var2;
        this.field_931 = true;
        if (this.field_930) {
            if (var2 != Integer.MIN_VALUE) {
                this.field_924 = var2;
            }

            if (var1 != Integer.MIN_VALUE) {
                this.field_925 = var1;
            }
        } else {
            if (var1 != Integer.MIN_VALUE) {
                this.field_924 = var1;
            }

            if (var2 != Integer.MIN_VALUE) {
                this.field_925 = var2;
            }
        }

    }

    // $FF: renamed from: a (boolean) void
    public void method_938(boolean var1) {
        if (var1 != this.field_930) {
            this.field_930 = var1;
            if (this.field_931) {
                int var2;
                if (var1) {
                    if (this.field_927 != Integer.MIN_VALUE) {
                        var2 = this.field_927;
                    } else {
                        var2 = this.field_928;
                    }

                    this.field_924 = var2;
                    if (this.field_926 != Integer.MIN_VALUE) {
                        var2 = this.field_926;
                    } else {
                        var2 = this.field_929;
                    }

                    this.field_925 = var2;
                } else {
                    if (this.field_926 != Integer.MIN_VALUE) {
                        var2 = this.field_926;
                    } else {
                        var2 = this.field_928;
                    }

                    this.field_924 = var2;
                    if (this.field_927 != Integer.MIN_VALUE) {
                        var2 = this.field_927;
                    } else {
                        var2 = this.field_929;
                    }

                    this.field_925 = var2;
                }
            } else {
                this.field_924 = this.field_928;
                this.field_925 = this.field_929;
            }
        }

    }

    // $FF: renamed from: b () int
    public int method_939() {
        return this.field_925;
    }

    // $FF: renamed from: b (int, int) void
    public void method_940(int var1, int var2) {
        this.field_931 = false;
        if (var1 != Integer.MIN_VALUE) {
            this.field_928 = var1;
            this.field_924 = var1;
        }

        if (var2 != Integer.MIN_VALUE) {
            this.field_929 = var2;
            this.field_925 = var2;
        }

    }

    // $FF: renamed from: c () int
    public int method_941() {
        int var1;
        if (this.field_930) {
            var1 = this.field_925;
        } else {
            var1 = this.field_924;
        }

        return var1;
    }

    // $FF: renamed from: d () int
    public int method_942() {
        int var1;
        if (this.field_930) {
            var1 = this.field_924;
        } else {
            var1 = this.field_925;
        }

        return var1;
    }
}
