package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

final class e$b implements Set {
    // $FF: renamed from: a android.support.v4.g.e
    // $FF: synthetic field
    final class_131 field_880;

    e$b(class_131 var1) {
        this.field_880 = var1;
    }

    // $FF: renamed from: a (java.util.Map.Entry) boolean
    public boolean method_916(Entry var1) {
        throw new UnsupportedOperationException();
    }

    // $FF: synthetic method
    public boolean add(Object var1) {
        return this.method_916((Entry)var1);
    }

    public boolean addAll(Collection var1) {
        int var2 = this.field_880.method_1095();
        Iterator var5 = var1.iterator();

        while(var5.hasNext()) {
            Entry var4 = (Entry)var5.next();
            this.field_880.method_1100(var4.getKey(), var4.getValue());
        }

        boolean var3;
        if (var2 != this.field_880.method_1095()) {
            var3 = true;
        } else {
            var3 = false;
        }

        return var3;
    }

    public void clear() {
        this.field_880.method_1105();
    }

    public boolean contains(Object var1) {
        boolean var3 = false;
        if (var1 instanceof Entry) {
            Entry var4 = (Entry)var1;
            int var2 = this.field_880.method_1096(var4.getKey());
            if (var2 >= 0) {
                var3 = class_136.method_1137(this.field_880.method_1097(var2, 1), var4.getValue());
            }
        }

        return var3;
    }

    public boolean containsAll(Collection var1) {
        Iterator var3 = var1.iterator();

        boolean var2;
        while(true) {
            if (var3.hasNext()) {
                if (this.contains(var3.next())) {
                    continue;
                }

                var2 = false;
                break;
            }

            var2 = true;
            break;
        }

        return var2;
    }

    public boolean equals(Object var1) {
        return class_131.method_1092(this, var1);
    }

    public int hashCode() {
        int var2 = this.field_880.method_1095() - 1;

        int var1;
        int var3;
        int var4;
        for(var1 = 0; var2 >= 0; var1 += var4 ^ var3) {
            Object var6 = this.field_880.method_1097(var2, 0);
            Object var5 = this.field_880.method_1097(var2, 1);
            if (var6 == null) {
                var3 = 0;
            } else {
                var3 = var6.hashCode();
            }

            if (var5 == null) {
                var4 = 0;
            } else {
                var4 = var5.hashCode();
            }

            --var2;
        }

        return var1;
    }

    public boolean isEmpty() {
        boolean var1;
        if (this.field_880.method_1095() == 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public Iterator iterator() {
        return new e$d(this.field_880);
    }

    public boolean remove(Object var1) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection var1) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection var1) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.field_880.method_1095();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray(Object[] var1) {
        throw new UnsupportedOperationException();
    }
}
