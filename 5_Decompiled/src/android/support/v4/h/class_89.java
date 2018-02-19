package android.support.v4.h;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

// $FF: renamed from: android.support.v4.h.a
public abstract class class_89 implements Parcelable {
    public static final Creator CREATOR = new ClassLoaderCreator() {
        // $FF: renamed from: a (android.os.Parcel) android.support.v4.h.a
        public class_89 method_818(Parcel var1) {
            return this.method_819(var1, (ClassLoader)null);
        }

        // $FF: renamed from: a (android.os.Parcel, java.lang.ClassLoader) android.support.v4.h.a
        public class_89 method_819(Parcel var1, ClassLoader var2) {
            if (var1.readParcelable(var2) != null) {
                throw new IllegalStateException("superState must be null");
            } else {
                return class_89.field_755;
            }
        }

        // $FF: renamed from: a (int) android.support.v4.h.a[]
        public class_89[] method_820(int var1) {
            return new class_89[var1];
        }

        // $FF: synthetic method
        public Object createFromParcel(Parcel var1) {
            return this.method_818(var1);
        }

        // $FF: synthetic method
        public Object createFromParcel(Parcel var1, ClassLoader var2) {
            return this.method_819(var1, var2);
        }

        // $FF: synthetic method
        public Object[] newArray(int var1) {
            return this.method_820(var1);
        }
    };
    // $FF: renamed from: a android.support.v4.h.a
    public static final class_89 field_755 = new class_89() {
    };
    // $FF: renamed from: b android.os.Parcelable
    private final Parcelable field_756;

    private class_89() {
        this.field_756 = null;
    }

    protected class_89(Parcel var1, ClassLoader var2) {
        Object var3 = var1.readParcelable(var2);
        if (var3 == null) {
            var3 = field_755;
        }

        this.field_756 = (Parcelable)var3;
    }

    protected class_89(Parcelable var1) {
        if (var1 == null) {
            throw new IllegalArgumentException("superState must not be null");
        } else {
            if (var1 == field_755) {
                var1 = null;
            }

            this.field_756 = var1;
        }
    }

    // $FF: synthetic method
    class_89(Object var1) {
        this();
    }

    // $FF: renamed from: a () android.os.Parcelable
    public final Parcelable method_822() {
        return this.field_756;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel var1, int var2) {
        var1.writeParcelable(this.field_756, var2);
    }
}
