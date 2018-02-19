package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.os.Parcelable.Creator;
import android.support.v4.g.class_134;

public final class MediaMetadataCompat implements Parcelable {
    public static final Creator CREATOR;
    // $FF: renamed from: a android.support.v4.g.a
    static final class_134 field_733 = new class_134();
    // $FF: renamed from: c java.lang.String[]
    private static final String[] field_734;
    // $FF: renamed from: d java.lang.String[]
    private static final String[] field_735;
    // $FF: renamed from: e java.lang.String[]
    private static final String[] field_736;
    // $FF: renamed from: b android.os.Bundle
    final Bundle field_737;
    // $FF: renamed from: f java.lang.Object
    private Object field_738;

    static {
        field_733.put("android.media.metadata.TITLE", 1);
        field_733.put("android.media.metadata.ARTIST", 1);
        field_733.put("android.media.metadata.DURATION", 0);
        field_733.put("android.media.metadata.ALBUM", 1);
        field_733.put("android.media.metadata.AUTHOR", 1);
        field_733.put("android.media.metadata.WRITER", 1);
        field_733.put("android.media.metadata.COMPOSER", 1);
        field_733.put("android.media.metadata.COMPILATION", 1);
        field_733.put("android.media.metadata.DATE", 1);
        field_733.put("android.media.metadata.YEAR", 0);
        field_733.put("android.media.metadata.GENRE", 1);
        field_733.put("android.media.metadata.TRACK_NUMBER", 0);
        field_733.put("android.media.metadata.NUM_TRACKS", 0);
        field_733.put("android.media.metadata.DISC_NUMBER", 0);
        field_733.put("android.media.metadata.ALBUM_ARTIST", 1);
        field_733.put("android.media.metadata.ART", 2);
        field_733.put("android.media.metadata.ART_URI", 1);
        field_733.put("android.media.metadata.ALBUM_ART", 2);
        field_733.put("android.media.metadata.ALBUM_ART_URI", 1);
        field_733.put("android.media.metadata.USER_RATING", 3);
        field_733.put("android.media.metadata.RATING", 3);
        field_733.put("android.media.metadata.DISPLAY_TITLE", 1);
        field_733.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        field_733.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        field_733.put("android.media.metadata.DISPLAY_ICON", 2);
        field_733.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        field_733.put("android.media.metadata.MEDIA_ID", 1);
        field_733.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        field_733.put("android.media.metadata.MEDIA_URI", 1);
        field_733.put("android.media.metadata.ADVERTISEMENT", 0);
        field_733.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        field_734 = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        field_735 = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        field_736 = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new Creator() {
            // $FF: renamed from: a (android.os.Parcel) android.support.v4.media.MediaMetadataCompat
            public MediaMetadataCompat method_669(Parcel var1) {
                return new MediaMetadataCompat(var1);
            }

            // $FF: renamed from: a (int) android.support.v4.media.MediaMetadataCompat[]
            public MediaMetadataCompat[] method_670(int var1) {
                return new MediaMetadataCompat[var1];
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1) {
                return this.method_669(var1);
            }

            // $FF: synthetic method
            public Object[] newArray(int var1) {
                return this.method_670(var1);
            }
        };
    }

    MediaMetadataCompat(Parcel var1) {
        this.field_737 = var1.readBundle();
    }

    // $FF: renamed from: a (java.lang.Object) android.support.v4.media.MediaMetadataCompat
    public static MediaMetadataCompat method_803(Object var0) {
        MediaMetadataCompat var3;
        if (var0 != null && VERSION.SDK_INT >= 21) {
            Parcel var2 = Parcel.obtain();
            class_36.method_372(var0, var2, 0);
            var2.setDataPosition(0);
            MediaMetadataCompat var1 = (MediaMetadataCompat)CREATOR.createFromParcel(var2);
            var2.recycle();
            var1.field_738 = var0;
            var3 = var1;
        } else {
            var3 = null;
        }

        return var3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel var1, int var2) {
        var1.writeBundle(this.field_737);
    }
}
