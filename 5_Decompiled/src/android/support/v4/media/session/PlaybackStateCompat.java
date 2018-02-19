package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Creator CREATOR = new Creator() {
        // $FF: renamed from: a (android.os.Parcel) android.support.v4.media.session.PlaybackStateCompat
        public PlaybackStateCompat method_1291(Parcel var1) {
            return new PlaybackStateCompat(var1);
        }

        // $FF: renamed from: a (int) android.support.v4.media.session.PlaybackStateCompat[]
        public PlaybackStateCompat[] method_1292(int var1) {
            return new PlaybackStateCompat[var1];
        }

        // $FF: synthetic method
        public Object createFromParcel(Parcel var1) {
            return this.method_1291(var1);
        }

        // $FF: synthetic method
        public Object[] newArray(int var1) {
            return this.method_1292(var1);
        }
    };
    // $FF: renamed from: a int
    final int field_482;
    // $FF: renamed from: b long
    final long field_483;
    // $FF: renamed from: c long
    final long field_484;
    // $FF: renamed from: d float
    final float field_485;
    // $FF: renamed from: e long
    final long field_486;
    // $FF: renamed from: f int
    final int field_487;
    // $FF: renamed from: g java.lang.CharSequence
    final CharSequence field_488;
    // $FF: renamed from: h long
    final long field_489;
    // $FF: renamed from: i java.util.List
    List field_490;
    // $FF: renamed from: j long
    final long field_491;
    // $FF: renamed from: k android.os.Bundle
    final Bundle field_492;
    // $FF: renamed from: l java.lang.Object
    private Object field_493;

    PlaybackStateCompat(int var1, long var2, long var4, float var6, long var7, int var9, CharSequence var10, long var11, List var13, long var14, Bundle var16) {
        this.field_482 = var1;
        this.field_483 = var2;
        this.field_484 = var4;
        this.field_485 = var6;
        this.field_486 = var7;
        this.field_487 = var9;
        this.field_488 = var10;
        this.field_489 = var11;
        this.field_490 = new ArrayList(var13);
        this.field_491 = var14;
        this.field_492 = var16;
    }

    PlaybackStateCompat(Parcel var1) {
        this.field_482 = var1.readInt();
        this.field_483 = var1.readLong();
        this.field_485 = var1.readFloat();
        this.field_489 = var1.readLong();
        this.field_484 = var1.readLong();
        this.field_486 = var1.readLong();
        this.field_488 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
        this.field_490 = var1.createTypedArrayList(PlaybackStateCompat.CustomAction.CREATOR);
        this.field_491 = var1.readLong();
        this.field_492 = var1.readBundle();
        this.field_487 = var1.readInt();
    }

    // $FF: renamed from: a (java.lang.Object) android.support.v4.media.session.PlaybackStateCompat
    public static PlaybackStateCompat method_512(Object var0) {
        PlaybackStateCompat var4;
        if (var0 != null && VERSION.SDK_INT >= 21) {
            List var3 = class_109.method_965(var0);
            ArrayList var1 = null;
            if (var3 != null) {
                ArrayList var2 = new ArrayList(var3.size());
                Iterator var7 = var3.iterator();

                while(true) {
                    var1 = var2;
                    if (!var7.hasNext()) {
                        break;
                    }

                    var2.add(PlaybackStateCompat.CustomAction.method_1286(var7.next()));
                }
            }

            Bundle var6;
            if (VERSION.SDK_INT >= 22) {
                var6 = class_110.method_967(var0);
            } else {
                var6 = null;
            }

            PlaybackStateCompat var5 = new PlaybackStateCompat(class_109.method_958(var0), class_109.method_959(var0), class_109.method_960(var0), class_109.method_961(var0), class_109.method_962(var0), 0, class_109.method_963(var0), class_109.method_964(var0), var1, class_109.method_966(var0), var6);
            var5.field_493 = var0;
            var4 = var5;
        } else {
            var4 = null;
        }

        return var4;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder var1 = new StringBuilder("PlaybackState {");
        var1.append("state=").append(this.field_482);
        var1.append(", position=").append(this.field_483);
        var1.append(", buffered position=").append(this.field_484);
        var1.append(", speed=").append(this.field_485);
        var1.append(", updated=").append(this.field_489);
        var1.append(", actions=").append(this.field_486);
        var1.append(", error code=").append(this.field_487);
        var1.append(", error message=").append(this.field_488);
        var1.append(", custom actions=").append(this.field_490);
        var1.append(", active item id=").append(this.field_491);
        var1.append("}");
        return var1.toString();
    }

    public void writeToParcel(Parcel var1, int var2) {
        var1.writeInt(this.field_482);
        var1.writeLong(this.field_483);
        var1.writeFloat(this.field_485);
        var1.writeLong(this.field_489);
        var1.writeLong(this.field_484);
        var1.writeLong(this.field_486);
        TextUtils.writeToParcel(this.field_488, var1, var2);
        var1.writeTypedList(this.field_490);
        var1.writeLong(this.field_491);
        var1.writeBundle(this.field_492);
        var1.writeInt(this.field_487);
    }

    public static final class CustomAction implements Parcelable {
        public static final Creator CREATOR = new Creator() {
            // $FF: renamed from: a (android.os.Parcel) android.support.v4.media.session.PlaybackStateCompat$CustomAction
            public PlaybackStateCompat.CustomAction method_209(Parcel var1) {
                return new PlaybackStateCompat.CustomAction(var1);
            }

            // $FF: renamed from: a (int) android.support.v4.media.session.PlaybackStateCompat$CustomAction[]
            public PlaybackStateCompat.CustomAction[] method_210(int var1) {
                return new PlaybackStateCompat.CustomAction[var1];
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1) {
                return this.method_209(var1);
            }

            // $FF: synthetic method
            public Object[] newArray(int var1) {
                return this.method_210(var1);
            }
        };
        // $FF: renamed from: a java.lang.String
        private final String field_1158;
        // $FF: renamed from: b java.lang.CharSequence
        private final CharSequence field_1159;
        // $FF: renamed from: c int
        private final int field_1160;
        // $FF: renamed from: d android.os.Bundle
        private final Bundle field_1161;
        // $FF: renamed from: e java.lang.Object
        private Object field_1162;

        CustomAction(Parcel var1) {
            this.field_1158 = var1.readString();
            this.field_1159 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
            this.field_1160 = var1.readInt();
            this.field_1161 = var1.readBundle();
        }

        CustomAction(String var1, CharSequence var2, int var3, Bundle var4) {
            this.field_1158 = var1;
            this.field_1159 = var2;
            this.field_1160 = var3;
            this.field_1161 = var4;
        }

        // $FF: renamed from: a (java.lang.Object) android.support.v4.media.session.PlaybackStateCompat$CustomAction
        public static PlaybackStateCompat.CustomAction method_1286(Object var0) {
            PlaybackStateCompat.CustomAction var2;
            if (var0 != null && VERSION.SDK_INT >= 21) {
                PlaybackStateCompat.CustomAction var1 = new PlaybackStateCompat.CustomAction(e$a.method_446(var0), e$a.method_447(var0), e$a.method_448(var0), e$a.method_449(var0));
                var1.field_1162 = var0;
                var2 = var1;
            } else {
                var2 = null;
            }

            return var2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.field_1159 + ", mIcon=" + this.field_1160 + ", mExtras=" + this.field_1161;
        }

        public void writeToParcel(Parcel var1, int var2) {
            var1.writeString(this.field_1158);
            TextUtils.writeToParcel(this.field_1159, var1, var2);
            var1.writeInt(this.field_1160);
            var1.writeBundle(this.field_1161);
        }
    }
}
