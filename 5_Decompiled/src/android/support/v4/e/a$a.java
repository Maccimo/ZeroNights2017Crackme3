package android.support.v4.e;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a$a extends Binder implements class_13 {
    public a$a() {
        this.attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    // $FF: renamed from: a (android.os.IBinder) android.support.v4.e.a
    public static class_13 method_1296(IBinder var0) {
        Object var2;
        if (var0 == null) {
            var2 = null;
        } else {
            IInterface var1 = var0.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (var1 != null && var1 instanceof class_13) {
                var2 = (class_13)var1;
            } else {
                var2 = new a$a.class_365(var0);
            }
        }

        return (class_13)var2;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
        boolean var5;
        switch(var1) {
        case 1:
            var2.enforceInterface("android.support.v4.os.IResultReceiver");
            var1 = var2.readInt();
            Bundle var6;
            if (var2.readInt() != 0) {
                var6 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
                var6 = null;
            }

            this.a(var1, var6);
            var5 = true;
            break;
        case 1598968902:
            var3.writeString("android.support.v4.os.IResultReceiver");
            var5 = true;
            break;
        default:
            var5 = super.onTransact(var1, var2, var3, var4);
        }

        return var5;
    }

    private static class class_365 implements class_13 {
        // $FF: renamed from: a android.os.IBinder
        private IBinder field_1349;

        class_365(IBinder var1) {
            this.field_1349 = var1;
        }

        // $FF: renamed from: a (int, android.os.Bundle) void
        public void method_40(int param1, Bundle param2) {
            // $FF: Couldn't be decompiled
        }

        public IBinder asBinder() {
            return this.field_1349;
        }
    }
}
