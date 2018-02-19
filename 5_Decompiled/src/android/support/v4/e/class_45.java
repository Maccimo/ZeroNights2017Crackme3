package android.support.v4.e;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

// $FF: renamed from: android.support.v4.e.b
public class class_45 implements Parcelable {
    public static final Creator CREATOR = new Creator() {
        // $FF: renamed from: a (android.os.Parcel) android.support.v4.e.b
        public class_45 method_985(Parcel var1) {
            return new class_45(var1);
        }

        // $FF: renamed from: a (int) android.support.v4.e.b[]
        public class_45[] method_986(int var1) {
            return new class_45[var1];
        }

        // $FF: synthetic method
        public Object createFromParcel(Parcel var1) {
            return this.method_985(var1);
        }

        // $FF: synthetic method
        public Object[] newArray(int var1) {
            return this.method_986(var1);
        }
    };
    // $FF: renamed from: a boolean
    final boolean field_392 = false;
    // $FF: renamed from: b android.os.Handler
    final Handler field_393 = null;
    // $FF: renamed from: c android.support.v4.e.a
    class_13 field_394;

    class_45(Parcel var1) {
        this.field_394 = a$a.method_1296(var1.readStrongBinder());
    }

    // $FF: renamed from: a (int, android.os.Bundle) void
    protected void method_466(int var1, Bundle var2) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel param1, int param2) {
        // $FF: Couldn't be decompiled
    }
}
