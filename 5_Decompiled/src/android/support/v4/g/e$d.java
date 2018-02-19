package android.support.v4.g;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Map.Entry;

final class e$d implements Iterator, Entry {
    // $FF: renamed from: a int
    int field_875;
    // $FF: renamed from: b int
    int field_876;
    // $FF: renamed from: c boolean
    boolean field_877;
    // $FF: renamed from: d android.support.v4.g.e
    // $FF: synthetic field
    final class_131 field_878;

    e$d(class_131 var1) {
        this.field_878 = var1;
        this.field_877 = false;
        this.field_875 = var1.method_1095() - 1;
        this.field_876 = -1;
    }

    // $FF: renamed from: a () java.util.Map.Entry
    public Entry method_915() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        } else {
            ++this.field_876;
            this.field_877 = true;
            return this;
        }
    }

    public final boolean equals(Object var1) {
        boolean var3 = false;
        if (!this.field_877) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else {
            boolean var2;
            if (!(var1 instanceof Entry)) {
                var2 = var3;
            } else {
                Entry var4 = (Entry)var1;
                var2 = var3;
                if (class_136.method_1137(var4.getKey(), this.field_878.method_1097(this.field_876, 0))) {
                    var2 = var3;
                    if (class_136.method_1137(var4.getValue(), this.field_878.method_1097(this.field_876, 1))) {
                        var2 = true;
                    }
                }
            }

            return var2;
        }
    }

    public Object getKey() {
        if (!this.field_877) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else {
            return this.field_878.method_1097(this.field_876, 0);
        }
    }

    public Object getValue() {
        if (!this.field_877) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else {
            return this.field_878.method_1097(this.field_876, 1);
        }
    }

    public boolean hasNext() {
        boolean var1;
        if (this.field_876 < this.field_875) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public final int hashCode() {
        int var2 = 0;
        if (!this.field_877) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else {
            Object var3 = this.field_878.method_1097(this.field_876, 0);
            Object var4 = this.field_878.method_1097(this.field_876, 1);
            int var1;
            if (var3 == null) {
                var1 = 0;
            } else {
                var1 = var3.hashCode();
            }

            if (var4 != null) {
                var2 = var4.hashCode();
            }

            return var2 ^ var1;
        }
    }

    // $FF: synthetic method
    public Object next() {
        return this.method_915();
    }

    public void remove() {
        if (!this.field_877) {
            throw new IllegalStateException();
        } else {
            this.field_878.method_1099(this.field_876);
            --this.field_876;
            --this.field_875;
            this.field_877 = false;
        }
    }

    public Object setValue(Object var1) {
        if (!this.field_877) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else {
            return this.field_878.method_1098(this.field_876, var1);
        }
    }

    public final String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}
