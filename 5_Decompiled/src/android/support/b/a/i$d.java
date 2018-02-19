package android.support.b.a;

import android.graphics.Path;
import android.support.v4.c.b$b;
import android.support.v4.c.class_80;

class i$d {
    // $FF: renamed from: m android.support.v4.c.b$b[]
    protected b$b[] field_311 = null;
    // $FF: renamed from: n java.lang.String
    String field_312;
    // $FF: renamed from: o int
    int field_313;

    public i$d() {
    }

    public i$d(i$d var1) {
        this.field_312 = var1.field_312;
        this.field_313 = var1.field_313;
        this.field_311 = class_80.method_769(var1.field_311);
    }

    // $FF: renamed from: a (android.graphics.Path) void
    public void method_415(Path var1) {
        var1.reset();
        if (this.field_311 != null) {
            b$b.method_396(this.field_311, var1);
        }

    }

    // $FF: renamed from: a () boolean
    public boolean method_416() {
        return false;
    }

    public b$b[] getPathData() {
        return this.field_311;
    }

    public String getPathName() {
        return this.field_312;
    }

    public void setPathData(b$b[] var1) {
        if (!class_80.method_767(this.field_311, var1)) {
            this.field_311 = class_80.method_769(var1);
        } else {
            class_80.method_770(this.field_311, var1);
        }

    }
}
