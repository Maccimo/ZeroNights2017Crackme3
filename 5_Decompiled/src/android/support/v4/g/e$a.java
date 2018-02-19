package android.support.v4.g;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class e$a implements Iterator {
    // $FF: renamed from: a int
    final int field_881;
    // $FF: renamed from: b int
    int field_882;
    // $FF: renamed from: c int
    int field_883;
    // $FF: renamed from: d boolean
    boolean field_884;
    // $FF: renamed from: e android.support.v4.g.e
    // $FF: synthetic field
    final class_131 field_885;

    e$a(class_131 var1, int var2) {
        this.field_885 = var1;
        this.field_884 = false;
        this.field_881 = var2;
        this.field_882 = var1.method_1095();
    }

    public boolean hasNext() {
        boolean var1;
        if (this.field_883 < this.field_882) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        } else {
            Object var1 = this.field_885.method_1097(this.field_883, this.field_881);
            ++this.field_883;
            this.field_884 = true;
            return var1;
        }
    }

    public void remove() {
        if (!this.field_884) {
            throw new IllegalStateException();
        } else {
            --this.field_883;
            --this.field_882;
            this.field_884 = false;
            this.field_885.method_1099(this.field_883);
        }
    }
}
