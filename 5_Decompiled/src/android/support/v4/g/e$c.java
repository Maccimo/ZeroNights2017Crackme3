package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class e$c implements Set {
    // $FF: renamed from: a android.support.v4.g.e
    // $FF: synthetic field
    final class_131 field_879;

    e$c(class_131 var1) {
        this.field_879 = var1;
    }

    public boolean add(Object var1) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection var1) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.field_879.method_1105();
    }

    public boolean contains(Object var1) {
        boolean var2;
        if (this.field_879.method_1096(var1) >= 0) {
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    public boolean containsAll(Collection var1) {
        return class_131.method_1091(this.field_879.method_1103(), var1);
    }

    public boolean equals(Object var1) {
        return class_131.method_1092(this, var1);
    }

    public int hashCode() {
        int var1 = this.field_879.method_1095();
        int var2 = 0;
        --var1;

        while(var1 >= 0) {
            Object var4 = this.field_879.method_1097(var1, 0);
            int var3;
            if (var4 == null) {
                var3 = 0;
            } else {
                var3 = var4.hashCode();
            }

            --var1;
            var2 += var3;
        }

        return var2;
    }

    public boolean isEmpty() {
        boolean var1;
        if (this.field_879.method_1095() == 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public Iterator iterator() {
        return new e$a(this.field_879, 0);
    }

    public boolean remove(Object var1) {
        int var2 = this.field_879.method_1096(var1);
        boolean var3;
        if (var2 >= 0) {
            this.field_879.method_1099(var2);
            var3 = true;
        } else {
            var3 = false;
        }

        return var3;
    }

    public boolean removeAll(Collection var1) {
        return class_131.method_1093(this.field_879.method_1103(), var1);
    }

    public boolean retainAll(Collection var1) {
        return class_131.method_1094(this.field_879.method_1103(), var1);
    }

    public int size() {
        return this.field_879.method_1095();
    }

    public Object[] toArray() {
        return this.field_879.method_1104(0);
    }

    public Object[] toArray(Object[] var1) {
        return this.field_879.method_1101(var1, 0);
    }
}
