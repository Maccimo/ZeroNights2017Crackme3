package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

public abstract class a$a extends Binder implements class_14 {
    public a$a() {
        this.attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    // $FF: renamed from: a (android.os.IBinder) android.support.v4.media.session.a
    public static class_14 method_169(IBinder var0) {
        Object var2;
        if (var0 == null) {
            var2 = null;
        } else {
            IInterface var1 = var0.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (var1 != null && var1 instanceof class_14) {
                var2 = (class_14)var1;
            } else {
                var2 = new a$a.class_315(var0);
            }
        }

        return (class_14)var2;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
        boolean var5 = false;
        String var7 = null;
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        Object var6 = null;
        Bundle var13;
        switch(var1) {
        case 1:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            var7 = var2.readString();
            var13 = (Bundle)var6;
            if (var2.readInt() != 0) {
                var13 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            }

            this.a(var7, var13);
            var5 = true;
            break;
        case 2:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            this.a();
            var5 = true;
            break;
        case 3:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            PlaybackStateCompat var16 = var7;
            if (var2.readInt() != 0) {
                var16 = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(var2);
            }

            this.a(var16);
            var5 = true;
            break;
        case 4:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            MediaMetadataCompat var15 = (MediaMetadataCompat)var8;
            if (var2.readInt() != 0) {
                var15 = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(var2);
            }

            this.a(var15);
            var5 = true;
            break;
        case 5:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            this.a(var2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
            var5 = true;
            break;
        case 6:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            CharSequence var14 = (CharSequence)var9;
            if (var2.readInt() != 0) {
                var14 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var2);
            }

            this.a(var14);
            var5 = true;
            break;
        case 7:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            var13 = (Bundle)var10;
            if (var2.readInt() != 0) {
                var13 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            }

            this.a(var13);
            var5 = true;
            break;
        case 8:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            ParcelableVolumeInfo var12 = (ParcelableVolumeInfo)var11;
            if (var2.readInt() != 0) {
                var12 = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(var2);
            }

            this.a(var12);
            var5 = true;
            break;
        case 9:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            this.a(var2.readInt());
            var5 = true;
            break;
        case 10:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (var2.readInt() != 0) {
                var5 = true;
            } else {
                var5 = false;
            }

            this.a(var5);
            var5 = true;
            break;
        case 11:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (var2.readInt() != 0) {
                var5 = true;
            }

            this.b(var5);
            var5 = true;
            break;
        case 12:
            var2.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            this.b(var2.readInt());
            var5 = true;
            break;
        case 1598968902:
            var3.writeString("android.support.v4.media.session.IMediaControllerCallback");
            var5 = true;
            break;
        default:
            var5 = super.onTransact(var1, var2, var3, var4);
        }

        return var5;
    }

    private static class class_315 implements class_14 {
        // $FF: renamed from: a android.os.IBinder
        private IBinder field_936;

        class_315(IBinder var1) {
            this.field_936 = var1;
        }

        // $FF: renamed from: a () void
        public void method_44() {
            Parcel var1 = Parcel.obtain();

            try {
                var1.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                this.field_936.transact(2, var1, (Parcel)null, 1);
            } finally {
                var1.recycle();
            }

        }

        // $FF: renamed from: a (int) void
        public void method_45(int var1) {
            Parcel var2 = Parcel.obtain();

            try {
                var2.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                var2.writeInt(var1);
                this.field_936.transact(9, var2, (Parcel)null, 1);
            } finally {
                var2.recycle();
            }

        }

        // $FF: renamed from: a (android.os.Bundle) void
        public void method_46(Bundle param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (android.support.v4.media.MediaMetadataCompat) void
        public void method_47(MediaMetadataCompat param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (android.support.v4.media.session.ParcelableVolumeInfo) void
        public void method_48(ParcelableVolumeInfo param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (android.support.v4.media.session.PlaybackStateCompat) void
        public void method_49(PlaybackStateCompat param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (java.lang.CharSequence) void
        public void method_50(CharSequence param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (java.lang.String, android.os.Bundle) void
        public void method_51(String param1, Bundle param2) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (java.util.List) void
        public void method_52(List var1) {
            Parcel var2 = Parcel.obtain();

            try {
                var2.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                var2.writeTypedList(var1);
                this.field_936.transact(5, var2, (Parcel)null, 1);
            } finally {
                var2.recycle();
            }

        }

        // $FF: renamed from: a (boolean) void
        public void method_53(boolean param1) {
            // $FF: Couldn't be decompiled
        }

        public IBinder asBinder() {
            return this.field_936;
        }

        // $FF: renamed from: b (int) void
        public void method_54(int var1) {
            Parcel var2 = Parcel.obtain();

            try {
                var2.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                var2.writeInt(var1);
                this.field_936.transact(12, var2, (Parcel)null, 1);
            } finally {
                var2.recycle();
            }

        }

        // $FF: renamed from: b (boolean) void
        public void method_55(boolean param1) {
            // $FF: Couldn't be decompiled
        }
    }
}
