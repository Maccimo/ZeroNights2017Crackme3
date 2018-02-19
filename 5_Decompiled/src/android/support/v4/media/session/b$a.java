package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public abstract class b$a extends Binder implements class_15 {
    // $FF: renamed from: a (android.os.IBinder) android.support.v4.media.session.b
    public static class_15 method_1327(IBinder var0) {
        Object var2;
        if (var0 == null) {
            var2 = null;
        } else {
            IInterface var1 = var0.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (var1 != null && var1 instanceof class_15) {
                var2 = (class_15)var1;
            } else {
                var2 = new b$a.class_221(var0);
            }
        }

        return (class_15)var2;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
        byte var6 = 0;
        byte var7 = 0;
        boolean var8 = false;
        boolean var9 = false;
        byte var5 = 0;
        byte var14;
        Bundle var15;
        MediaDescriptionCompat var16;
        Uri var23;
        String var25;
        String var27;
        switch(var1) {
        case 1:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            String var13 = var2.readString();
            Bundle var30;
            if (var2.readInt() != 0) {
                var30 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
                var30 = null;
            }

            MediaSessionCompat.ResultReceiverWrapper var29;
            if (var2.readInt() != 0) {
                var29 = (MediaSessionCompat.ResultReceiverWrapper)MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(var2);
            } else {
                var29 = null;
            }

            this.a(var13, var30, var29);
            var3.writeNoException();
            var8 = true;
            break;
        case 2:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            KeyEvent var28;
            if (var2.readInt() != 0) {
                var28 = (KeyEvent)KeyEvent.CREATOR.createFromParcel(var2);
            } else {
                var28 = null;
            }

            var8 = this.a(var28);
            var3.writeNoException();
            if (var8) {
                var14 = 1;
            } else {
                var14 = 0;
            }

            var3.writeInt(var14);
            var8 = true;
            break;
        case 3:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.a(a$a.method_169(var2.readStrongBinder()));
            var3.writeNoException();
            var8 = true;
            break;
        case 4:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.b(a$a.method_169(var2.readStrongBinder()));
            var3.writeNoException();
            var8 = true;
            break;
        case 5:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var8 = this.a();
            var3.writeNoException();
            var14 = var5;
            if (var8) {
                var14 = 1;
            }

            var3.writeInt(var14);
            var8 = true;
            break;
        case 6:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var27 = this.b();
            var3.writeNoException();
            var3.writeString(var27);
            var8 = true;
            break;
        case 7:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var27 = this.c();
            var3.writeNoException();
            var3.writeString(var27);
            var8 = true;
            break;
        case 8:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            PendingIntent var26 = this.d();
            var3.writeNoException();
            if (var26 != null) {
                var3.writeInt(1);
                var26.writeToParcel(var3, 1);
                var8 = true;
            } else {
                var3.writeInt(0);
                var8 = true;
            }
            break;
        case 9:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            long var10 = this.e();
            var3.writeNoException();
            var3.writeLong(var10);
            var8 = true;
            break;
        case 10:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            ParcelableVolumeInfo var24 = this.f();
            var3.writeNoException();
            if (var24 != null) {
                var3.writeInt(1);
                var24.writeToParcel(var3, 1);
                var8 = true;
            } else {
                var3.writeInt(0);
                var8 = true;
            }
            break;
        case 11:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.a(var2.readInt(), var2.readInt(), var2.readString());
            var3.writeNoException();
            var8 = true;
            break;
        case 12:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.b(var2.readInt(), var2.readInt(), var2.readString());
            var3.writeNoException();
            var8 = true;
            break;
        case 13:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.r();
            var3.writeNoException();
            var8 = true;
            break;
        case 14:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var25 = var2.readString();
            if (var2.readInt() != 0) {
                var15 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
                var15 = null;
            }

            this.c(var25, var15);
            var3.writeNoException();
            var8 = true;
            break;
        case 15:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var25 = var2.readString();
            if (var2.readInt() != 0) {
                var15 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
                var15 = null;
            }

            this.d(var25, var15);
            var3.writeNoException();
            var8 = true;
            break;
        case 16:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            if (var2.readInt() != 0) {
                var23 = (Uri)Uri.CREATOR.createFromParcel(var2);
            } else {
                var23 = null;
            }

            if (var2.readInt() != 0) {
                var15 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
                var15 = null;
            }

            this.b(var23, var15);
            var3.writeNoException();
            var8 = true;
            break;
        case 17:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.a(var2.readLong());
            var3.writeNoException();
            var8 = true;
            break;
        case 18:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.s();
            var3.writeNoException();
            var8 = true;
            break;
        case 19:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.t();
            var3.writeNoException();
            var8 = true;
            break;
        case 20:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.u();
            var3.writeNoException();
            var8 = true;
            break;
        case 21:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.v();
            var3.writeNoException();
            var8 = true;
            break;
        case 22:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.w();
            var3.writeNoException();
            var8 = true;
            break;
        case 23:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.x();
            var3.writeNoException();
            var8 = true;
            break;
        case 24:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.b(var2.readLong());
            var3.writeNoException();
            var8 = true;
            break;
        case 25:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            RatingCompat var21;
            if (var2.readInt() != 0) {
                var21 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(var2);
            } else {
                var21 = null;
            }

            this.a(var21);
            var3.writeNoException();
            var8 = true;
            break;
        case 26:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var25 = var2.readString();
            if (var2.readInt() != 0) {
                var15 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
                var15 = null;
            }

            this.e(var25, var15);
            var3.writeNoException();
            var8 = true;
            break;
        case 27:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            MediaMetadataCompat var20 = this.g();
            var3.writeNoException();
            if (var20 != null) {
                var3.writeInt(1);
                var20.writeToParcel(var3, 1);
                var8 = true;
            } else {
                var3.writeInt(0);
                var8 = true;
            }
            break;
        case 28:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            PlaybackStateCompat var19 = this.h();
            var3.writeNoException();
            if (var19 != null) {
                var3.writeInt(1);
                var19.writeToParcel(var3, 1);
                var8 = true;
            } else {
                var3.writeInt(0);
                var8 = true;
            }
            break;
        case 29:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            List var18 = this.i();
            var3.writeNoException();
            var3.writeTypedList(var18);
            var8 = true;
            break;
        case 30:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            CharSequence var17 = this.j();
            var3.writeNoException();
            if (var17 != null) {
                var3.writeInt(1);
                TextUtils.writeToParcel(var17, var3, 1);
                var8 = true;
            } else {
                var3.writeInt(0);
                var8 = true;
            }
            break;
        case 31:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var15 = this.k();
            var3.writeNoException();
            if (var15 != null) {
                var3.writeInt(1);
                var15.writeToParcel(var3, 1);
                var8 = true;
            } else {
                var3.writeInt(0);
                var8 = true;
            }
            break;
        case 32:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var1 = this.l();
            var3.writeNoException();
            var3.writeInt(var1);
            var8 = true;
            break;
        case 33:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.q();
            var3.writeNoException();
            var8 = true;
            break;
        case 34:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var25 = var2.readString();
            if (var2.readInt() != 0) {
                var15 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
                var15 = null;
            }

            this.a(var25, var15);
            var3.writeNoException();
            var8 = true;
            break;
        case 35:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var25 = var2.readString();
            if (var2.readInt() != 0) {
                var15 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
                var15 = null;
            }

            this.b(var25, var15);
            var3.writeNoException();
            var8 = true;
            break;
        case 36:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            if (var2.readInt() != 0) {
                var23 = (Uri)Uri.CREATOR.createFromParcel(var2);
            } else {
                var23 = null;
            }

            if (var2.readInt() != 0) {
                var15 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
                var15 = null;
            }

            this.a(var23, var15);
            var3.writeNoException();
            var8 = true;
            break;
        case 37:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var1 = this.n();
            var3.writeNoException();
            var3.writeInt(var1);
            var8 = true;
            break;
        case 38:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var8 = this.o();
            var3.writeNoException();
            var14 = var7;
            if (var8) {
                var14 = 1;
            }

            var3.writeInt(var14);
            var8 = true;
            break;
        case 39:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.b(var2.readInt());
            var3.writeNoException();
            var8 = true;
            break;
        case 40:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var8 = var9;
            if (var2.readInt() != 0) {
                var8 = true;
            }

            this.b(var8);
            var3.writeNoException();
            var8 = true;
            break;
        case 41:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            if (var2.readInt() != 0) {
                var16 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(var2);
            } else {
                var16 = null;
            }

            this.a(var16);
            var3.writeNoException();
            var8 = true;
            break;
        case 42:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            MediaDescriptionCompat var22;
            if (var2.readInt() != 0) {
                var22 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(var2);
            } else {
                var22 = null;
            }

            this.a(var22, var2.readInt());
            var3.writeNoException();
            var8 = true;
            break;
        case 43:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            if (var2.readInt() != 0) {
                var16 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(var2);
            } else {
                var16 = null;
            }

            this.b(var16);
            var3.writeNoException();
            var8 = true;
            break;
        case 44:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.a(var2.readInt());
            var3.writeNoException();
            var8 = true;
            break;
        case 45:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var8 = this.m();
            var3.writeNoException();
            var14 = var6;
            if (var8) {
                var14 = 1;
            }

            var3.writeInt(var14);
            var8 = true;
            break;
        case 46:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            if (var2.readInt() != 0) {
                var8 = true;
            }

            this.a(var8);
            var3.writeNoException();
            var8 = true;
            break;
        case 47:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            var1 = this.p();
            var3.writeNoException();
            var3.writeInt(var1);
            var8 = true;
            break;
        case 48:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            this.c(var2.readInt());
            var3.writeNoException();
            var8 = true;
            break;
        case 51:
            var2.enforceInterface("android.support.v4.media.session.IMediaSession");
            RatingCompat var12;
            if (var2.readInt() != 0) {
                var12 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(var2);
            } else {
                var12 = null;
            }

            if (var2.readInt() != 0) {
                var15 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
                var15 = null;
            }

            this.a(var12, var15);
            var3.writeNoException();
            var8 = true;
            break;
        case 1598968902:
            var3.writeString("android.support.v4.media.session.IMediaSession");
            var8 = true;
            break;
        default:
            var8 = super.onTransact(var1, var2, var3, var4);
        }

        return var8;
    }

    private static class class_221 implements class_15 {
        // $FF: renamed from: a android.os.IBinder
        private IBinder field_211;

        class_221(IBinder var1) {
            this.field_211 = var1;
        }

        // $FF: renamed from: a (int) void
        public void method_56(int var1) {
            Parcel var4 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            try {
                var4.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                var4.writeInt(var1);
                this.field_211.transact(44, var4, var2, 0);
                var2.readException();
            } finally {
                var2.recycle();
                var4.recycle();
            }

        }

        // $FF: renamed from: a (int, int, java.lang.String) void
        public void method_57(int var1, int var2, String var3) {
            Parcel var4 = Parcel.obtain();
            Parcel var5 = Parcel.obtain();

            try {
                var4.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                var4.writeInt(var1);
                var4.writeInt(var2);
                var4.writeString(var3);
                this.field_211.transact(11, var4, var5, 0);
                var5.readException();
            } finally {
                var5.recycle();
                var4.recycle();
            }

        }

        // $FF: renamed from: a (long) void
        public void method_58(long var1) {
            Parcel var3 = Parcel.obtain();
            Parcel var5 = Parcel.obtain();

            try {
                var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                var3.writeLong(var1);
                this.field_211.transact(17, var3, var5, 0);
                var5.readException();
            } finally {
                var5.recycle();
                var3.recycle();
            }

        }

        // $FF: renamed from: a (android.net.Uri, android.os.Bundle) void
        public void method_59(Uri param1, Bundle param2) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (android.support.v4.media.MediaDescriptionCompat) void
        public void method_60(MediaDescriptionCompat param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (android.support.v4.media.MediaDescriptionCompat, int) void
        public void method_61(MediaDescriptionCompat param1, int param2) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (android.support.v4.media.RatingCompat) void
        public void method_62(RatingCompat param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (android.support.v4.media.RatingCompat, android.os.Bundle) void
        public void method_63(RatingCompat param1, Bundle param2) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (android.support.v4.media.session.a) void
        public void method_64(class_14 param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (java.lang.String, android.os.Bundle) void
        public void method_65(String param1, Bundle param2) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (java.lang.String, android.os.Bundle, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper) void
        public void method_66(String param1, Bundle param2, MediaSessionCompat.ResultReceiverWrapper param3) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a (boolean) void
        public void method_67(boolean param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: a () boolean
        public boolean method_68() {
            boolean var2 = false;
            Parcel var3 = Parcel.obtain();
            Parcel var4 = Parcel.obtain();
            boolean var7 = false;

            int var1;
            try {
                var7 = true;
                var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(5, var3, var4, 0);
                var4.readException();
                var1 = var4.readInt();
                var7 = false;
            } finally {
                if (var7) {
                    var4.recycle();
                    var3.recycle();
                }
            }

            if (var1 != 0) {
                var2 = true;
            }

            var4.recycle();
            var3.recycle();
            return var2;
        }

        // $FF: renamed from: a (android.view.KeyEvent) boolean
        public boolean method_69(KeyEvent param1) {
            // $FF: Couldn't be decompiled
        }

        public IBinder asBinder() {
            return this.field_211;
        }

        // $FF: renamed from: b () java.lang.String
        public String method_70() {
            Parcel var1 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            String var3;
            try {
                var1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(6, var1, var2, 0);
                var2.readException();
                var3 = var2.readString();
            } finally {
                var2.recycle();
                var1.recycle();
            }

            return var3;
        }

        // $FF: renamed from: b (int) void
        public void method_71(int var1) {
            Parcel var4 = Parcel.obtain();
            Parcel var3 = Parcel.obtain();

            try {
                var4.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                var4.writeInt(var1);
                this.field_211.transact(39, var4, var3, 0);
                var3.readException();
            } finally {
                var3.recycle();
                var4.recycle();
            }

        }

        // $FF: renamed from: b (int, int, java.lang.String) void
        public void method_72(int var1, int var2, String var3) {
            Parcel var4 = Parcel.obtain();
            Parcel var5 = Parcel.obtain();

            try {
                var4.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                var4.writeInt(var1);
                var4.writeInt(var2);
                var4.writeString(var3);
                this.field_211.transact(12, var4, var5, 0);
                var5.readException();
            } finally {
                var5.recycle();
                var4.recycle();
            }

        }

        // $FF: renamed from: b (long) void
        public void method_73(long var1) {
            Parcel var5 = Parcel.obtain();
            Parcel var3 = Parcel.obtain();

            try {
                var5.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                var5.writeLong(var1);
                this.field_211.transact(24, var5, var3, 0);
                var3.readException();
            } finally {
                var3.recycle();
                var5.recycle();
            }

        }

        // $FF: renamed from: b (android.net.Uri, android.os.Bundle) void
        public void method_74(Uri param1, Bundle param2) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: b (android.support.v4.media.MediaDescriptionCompat) void
        public void method_75(MediaDescriptionCompat param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: b (android.support.v4.media.session.a) void
        public void method_76(class_14 param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: b (java.lang.String, android.os.Bundle) void
        public void method_77(String param1, Bundle param2) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: b (boolean) void
        public void method_78(boolean param1) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: c () java.lang.String
        public String method_79() {
            Parcel var1 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            String var3;
            try {
                var1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(7, var1, var2, 0);
                var2.readException();
                var3 = var2.readString();
            } finally {
                var2.recycle();
                var1.recycle();
            }

            return var3;
        }

        // $FF: renamed from: c (int) void
        public void method_80(int var1) {
            Parcel var4 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            try {
                var4.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                var4.writeInt(var1);
                this.field_211.transact(48, var4, var2, 0);
                var2.readException();
            } finally {
                var2.recycle();
                var4.recycle();
            }

        }

        // $FF: renamed from: c (java.lang.String, android.os.Bundle) void
        public void method_81(String param1, Bundle param2) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: d () android.app.PendingIntent
        public PendingIntent method_82() {
            Parcel var3 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();
            boolean var5 = false;

            PendingIntent var1;
            label36: {
                try {
                    var5 = true;
                    var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.field_211.transact(8, var3, var2, 0);
                    var2.readException();
                    if (var2.readInt() != 0) {
                        var1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(var2);
                        var5 = false;
                        break label36;
                    }

                    var5 = false;
                } finally {
                    if (var5) {
                        var2.recycle();
                        var3.recycle();
                    }
                }

                var1 = null;
            }

            var2.recycle();
            var3.recycle();
            return var1;
        }

        // $FF: renamed from: d (java.lang.String, android.os.Bundle) void
        public void method_83(String param1, Bundle param2) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: e () long
        public long method_84() {
            Parcel var5 = Parcel.obtain();
            Parcel var3 = Parcel.obtain();

            long var1;
            try {
                var5.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(9, var5, var3, 0);
                var3.readException();
                var1 = var3.readLong();
            } finally {
                var3.recycle();
                var5.recycle();
            }

            return var1;
        }

        // $FF: renamed from: e (java.lang.String, android.os.Bundle) void
        public void method_85(String param1, Bundle param2) {
            // $FF: Couldn't be decompiled
        }

        // $FF: renamed from: f () android.support.v4.media.session.ParcelableVolumeInfo
        public ParcelableVolumeInfo method_86() {
            Parcel var2 = Parcel.obtain();
            Parcel var3 = Parcel.obtain();
            boolean var5 = false;

            ParcelableVolumeInfo var1;
            label36: {
                try {
                    var5 = true;
                    var2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.field_211.transact(10, var2, var3, 0);
                    var3.readException();
                    if (var3.readInt() != 0) {
                        var1 = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(var3);
                        var5 = false;
                        break label36;
                    }

                    var5 = false;
                } finally {
                    if (var5) {
                        var3.recycle();
                        var2.recycle();
                    }
                }

                var1 = null;
            }

            var3.recycle();
            var2.recycle();
            return var1;
        }

        // $FF: renamed from: g () android.support.v4.media.MediaMetadataCompat
        public MediaMetadataCompat method_87() {
            Parcel var3 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();
            boolean var5 = false;

            MediaMetadataCompat var1;
            label36: {
                try {
                    var5 = true;
                    var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.field_211.transact(27, var3, var2, 0);
                    var2.readException();
                    if (var2.readInt() != 0) {
                        var1 = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(var2);
                        var5 = false;
                        break label36;
                    }

                    var5 = false;
                } finally {
                    if (var5) {
                        var2.recycle();
                        var3.recycle();
                    }
                }

                var1 = null;
            }

            var2.recycle();
            var3.recycle();
            return var1;
        }

        // $FF: renamed from: h () android.support.v4.media.session.PlaybackStateCompat
        public PlaybackStateCompat method_88() {
            Parcel var2 = Parcel.obtain();
            Parcel var3 = Parcel.obtain();
            boolean var5 = false;

            PlaybackStateCompat var1;
            label36: {
                try {
                    var5 = true;
                    var2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.field_211.transact(28, var2, var3, 0);
                    var3.readException();
                    if (var3.readInt() != 0) {
                        var1 = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(var3);
                        var5 = false;
                        break label36;
                    }

                    var5 = false;
                } finally {
                    if (var5) {
                        var3.recycle();
                        var2.recycle();
                    }
                }

                var1 = null;
            }

            var3.recycle();
            var2.recycle();
            return var1;
        }

        // $FF: renamed from: i () java.util.List
        public List method_89() {
            Parcel var1 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            ArrayList var3;
            try {
                var1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(29, var1, var2, 0);
                var2.readException();
                var3 = var2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
            } finally {
                var2.recycle();
                var1.recycle();
            }

            return var3;
        }

        // $FF: renamed from: j () java.lang.CharSequence
        public CharSequence method_90() {
            Parcel var3 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();
            boolean var5 = false;

            CharSequence var1;
            label36: {
                try {
                    var5 = true;
                    var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.field_211.transact(30, var3, var2, 0);
                    var2.readException();
                    if (var2.readInt() != 0) {
                        var1 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var2);
                        var5 = false;
                        break label36;
                    }

                    var5 = false;
                } finally {
                    if (var5) {
                        var2.recycle();
                        var3.recycle();
                    }
                }

                var1 = null;
            }

            var2.recycle();
            var3.recycle();
            return var1;
        }

        // $FF: renamed from: k () android.os.Bundle
        public Bundle method_91() {
            Parcel var2 = Parcel.obtain();
            Parcel var3 = Parcel.obtain();
            boolean var5 = false;

            Bundle var1;
            label36: {
                try {
                    var5 = true;
                    var2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.field_211.transact(31, var2, var3, 0);
                    var3.readException();
                    if (var3.readInt() != 0) {
                        var1 = (Bundle)Bundle.CREATOR.createFromParcel(var3);
                        var5 = false;
                        break label36;
                    }

                    var5 = false;
                } finally {
                    if (var5) {
                        var3.recycle();
                        var2.recycle();
                    }
                }

                var1 = null;
            }

            var3.recycle();
            var2.recycle();
            return var1;
        }

        // $FF: renamed from: l () int
        public int method_92() {
            Parcel var3 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            int var1;
            try {
                var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(32, var3, var2, 0);
                var2.readException();
                var1 = var2.readInt();
            } finally {
                var2.recycle();
                var3.recycle();
            }

            return var1;
        }

        // $FF: renamed from: m () boolean
        public boolean method_93() {
            boolean var2 = false;
            Parcel var3 = Parcel.obtain();
            Parcel var4 = Parcel.obtain();
            boolean var7 = false;

            int var1;
            try {
                var7 = true;
                var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(45, var3, var4, 0);
                var4.readException();
                var1 = var4.readInt();
                var7 = false;
            } finally {
                if (var7) {
                    var4.recycle();
                    var3.recycle();
                }
            }

            if (var1 != 0) {
                var2 = true;
            }

            var4.recycle();
            var3.recycle();
            return var2;
        }

        // $FF: renamed from: n () int
        public int method_94() {
            Parcel var3 = Parcel.obtain();
            Parcel var4 = Parcel.obtain();

            int var1;
            try {
                var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(37, var3, var4, 0);
                var4.readException();
                var1 = var4.readInt();
            } finally {
                var4.recycle();
                var3.recycle();
            }

            return var1;
        }

        // $FF: renamed from: o () boolean
        public boolean method_95() {
            boolean var2 = false;
            Parcel var5 = Parcel.obtain();
            Parcel var3 = Parcel.obtain();
            boolean var7 = false;

            int var1;
            try {
                var7 = true;
                var5.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(38, var5, var3, 0);
                var3.readException();
                var1 = var3.readInt();
                var7 = false;
            } finally {
                if (var7) {
                    var3.recycle();
                    var5.recycle();
                }
            }

            if (var1 != 0) {
                var2 = true;
            }

            var3.recycle();
            var5.recycle();
            return var2;
        }

        // $FF: renamed from: p () int
        public int method_96() {
            Parcel var3 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            int var1;
            try {
                var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(47, var3, var2, 0);
                var2.readException();
                var1 = var2.readInt();
            } finally {
                var2.recycle();
                var3.recycle();
            }

            return var1;
        }

        // $FF: renamed from: q () void
        public void method_97() {
            Parcel var2 = Parcel.obtain();
            Parcel var1 = Parcel.obtain();

            try {
                var2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(33, var2, var1, 0);
                var1.readException();
            } finally {
                var1.recycle();
                var2.recycle();
            }

        }

        // $FF: renamed from: r () void
        public void method_98() {
            Parcel var3 = Parcel.obtain();
            Parcel var1 = Parcel.obtain();

            try {
                var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(13, var3, var1, 0);
                var1.readException();
            } finally {
                var1.recycle();
                var3.recycle();
            }

        }

        // $FF: renamed from: s () void
        public void method_99() {
            Parcel var3 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            try {
                var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(18, var3, var2, 0);
                var2.readException();
            } finally {
                var2.recycle();
                var3.recycle();
            }

        }

        // $FF: renamed from: t () void
        public void method_100() {
            Parcel var3 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            try {
                var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(19, var3, var2, 0);
                var2.readException();
            } finally {
                var2.recycle();
                var3.recycle();
            }

        }

        // $FF: renamed from: u () void
        public void method_101() {
            Parcel var3 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            try {
                var3.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(20, var3, var2, 0);
                var2.readException();
            } finally {
                var2.recycle();
                var3.recycle();
            }

        }

        // $FF: renamed from: v () void
        public void method_102() {
            Parcel var1 = Parcel.obtain();
            Parcel var3 = Parcel.obtain();

            try {
                var1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(21, var1, var3, 0);
                var3.readException();
            } finally {
                var3.recycle();
                var1.recycle();
            }

        }

        // $FF: renamed from: w () void
        public void method_103() {
            Parcel var1 = Parcel.obtain();
            Parcel var2 = Parcel.obtain();

            try {
                var1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(22, var1, var2, 0);
                var2.readException();
            } finally {
                var2.recycle();
                var1.recycle();
            }

        }

        // $FF: renamed from: x () void
        public void method_104() {
            Parcel var2 = Parcel.obtain();
            Parcel var1 = Parcel.obtain();

            try {
                var2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                this.field_211.transact(23, var2, var1, 0);
                var1.readException();
            } finally {
                var1.recycle();
                var2.recycle();
            }

        }
    }
}
