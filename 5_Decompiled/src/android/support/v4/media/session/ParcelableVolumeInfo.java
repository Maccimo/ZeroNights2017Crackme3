package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator CREATOR = new Creator() {
        // $FF: renamed from: a (android.os.Parcel) android.support.v4.media.session.ParcelableVolumeInfo
        public ParcelableVolumeInfo method_441(Parcel var1) {
            return new ParcelableVolumeInfo(var1);
        }

        // $FF: renamed from: a (int) android.support.v4.media.session.ParcelableVolumeInfo[]
        public ParcelableVolumeInfo[] method_442(int var1) {
            return new ParcelableVolumeInfo[var1];
        }

        // $FF: synthetic method
        public Object createFromParcel(Parcel var1) {
            return this.method_441(var1);
        }

        // $FF: synthetic method
        public Object[] newArray(int var1) {
            return this.method_442(var1);
        }
    };
    // $FF: renamed from: a int
    public int field_256;
    // $FF: renamed from: b int
    public int field_257;
    // $FF: renamed from: c int
    public int field_258;
    // $FF: renamed from: d int
    public int field_259;
    // $FF: renamed from: e int
    public int field_260;

    public ParcelableVolumeInfo(Parcel var1) {
        this.field_256 = var1.readInt();
        this.field_258 = var1.readInt();
        this.field_259 = var1.readInt();
        this.field_260 = var1.readInt();
        this.field_257 = var1.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel var1, int var2) {
        var1.writeInt(this.field_256);
        var1.writeInt(this.field_258);
        var1.writeInt(this.field_259);
        var1.writeInt(this.field_260);
        var1.writeInt(this.field_257);
    }
}
