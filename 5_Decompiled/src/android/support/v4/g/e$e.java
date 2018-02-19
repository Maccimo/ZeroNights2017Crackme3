package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;

final class e$e implements Collection {
    // $FF: renamed from: a android.support.v4.g.e
    // $FF: synthetic field
    final class_131 field_874;

    e$e(class_131 var1) {
        this.field_874 = var1;
    }

    public boolean add(Object var1) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection var1) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.field_874.method_1105();
    }

    public boolean contains(Object var1) {
        boolean var2;
        if (this.field_874.method_1102(var1) >= 0) {
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
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

    public boolean isEmpty() {
        boolean var1;
        if (this.field_874.method_1095() == 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public Iterator iterator() {
        return new e$a(this.field_874, 1);
    }

    public boolean remove(Object var1) {
        int var2 = this.field_874.method_1102(var1);
        boolean var3;
        if (var2 >= 0) {
            this.field_874.method_1099(var2);
            var3 = true;
        } else {
            var3 = false;
        }

        return var3;
    }

    public boolean removeAll(Collection var1) {
        boolean var6 = false;
        int var4 = this.field_874.method_1095();

        int var3;
        for(int var2 = 0; var2 < var4; var4 = var3) {
            int var5 = var2;
            var3 = var4;
            if (var1.contains(this.field_874.method_1097(var2, 1))) {
                this.field_874.method_1099(var2);
                var3 = var4 - 1;
                var5 = var2 - 1;
                var6 = true;
            }

            var2 = var5 + 1;
        }

        return var6;
    }

    public boolean retainAll(Collection var1) {
        boolean var6 = false;
        int var4 = this.field_874.method_1095();

        int var3;
        for(int var2 = 0; var2 < var4; var4 = var3) {
            int var5 = var2;
            var3 = var4;
            if (!var1.contains(this.field_874.method_1097(var2, 1))) {
                this.field_874.method_1099(var2);
                var3 = var4 - 1;
                var5 = var2 - 1;
                var6 = true;
            }

            var2 = var5 + 1;
        }

        return var6;
    }

    public int size() {
        return this.field_874.method_1095();
    }

    public Object[] toArray() {
        return this.field_874.method_1104(1);
    }

    public Object[] toArray(Object[] var1) {
        return this.field_874.method_1101(var1, 1);
    }
}
