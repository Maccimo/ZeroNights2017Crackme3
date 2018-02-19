package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat implements Parcelable {
    public static final Creator CREATOR = new Creator() {
        // $FF: renamed from: a (android.os.Parcel) android.support.v4.media.RatingCompat
        public RatingCompat method_345(Parcel var1) {
            return new RatingCompat(var1.readInt(), var1.readFloat());
        }

        // $FF: renamed from: a (int) android.support.v4.media.RatingCompat[]
        public RatingCompat[] method_346(int var1) {
            return new RatingCompat[var1];
        }

        // $FF: synthetic method
        public Object createFromParcel(Parcel var1) {
            return this.method_345(var1);
        }

        // $FF: synthetic method
        public Object[] newArray(int var1) {
            return this.method_346(var1);
        }
    };
    // $FF: renamed from: a int
    private final int field_350;
    // $FF: renamed from: b float
    private final float field_351;

    RatingCompat(int var1, float var2) {
        this.field_350 = var1;
        this.field_351 = var2;
    }

    public int describeContents() {
        return this.field_350;
    }

    public String toString() {
        StringBuilder var2 = (new StringBuilder()).append("Rating:style=").append(this.field_350).append(" rating=");
        String var1;
        if (this.field_351 < 0.0F) {
            var1 = "unrated";
        } else {
            var1 = String.valueOf(this.field_351);
        }

        return var2.append(var1).toString();
    }

    public void writeToParcel(Parcel var1, int var2) {
        var1.writeInt(this.field_350);
        var1.writeFloat(this.field_351);
    }
}
