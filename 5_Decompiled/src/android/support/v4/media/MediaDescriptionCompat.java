package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator CREATOR = new Creator() {
        // $FF: renamed from: a (android.os.Parcel) android.support.v4.media.MediaDescriptionCompat
        public MediaDescriptionCompat method_517(Parcel var1) {
            MediaDescriptionCompat var2;
            if (VERSION.SDK_INT < 21) {
                var2 = new MediaDescriptionCompat(var1);
            } else {
                var2 = MediaDescriptionCompat.method_167(class_34.method_362(var1));
            }

            return var2;
        }

        // $FF: renamed from: a (int) android.support.v4.media.MediaDescriptionCompat[]
        public MediaDescriptionCompat[] method_518(int var1) {
            return new MediaDescriptionCompat[var1];
        }

        // $FF: synthetic method
        public Object createFromParcel(Parcel var1) {
            return this.method_517(var1);
        }

        // $FF: synthetic method
        public Object[] newArray(int var1) {
            return this.method_518(var1);
        }
    };
    // $FF: renamed from: a java.lang.String
    private final String field_4;
    // $FF: renamed from: b java.lang.CharSequence
    private final CharSequence field_5;
    // $FF: renamed from: c java.lang.CharSequence
    private final CharSequence field_6;
    // $FF: renamed from: d java.lang.CharSequence
    private final CharSequence field_7;
    // $FF: renamed from: e android.graphics.Bitmap
    private final Bitmap field_8;
    // $FF: renamed from: f android.net.Uri
    private final Uri field_9;
    // $FF: renamed from: g android.os.Bundle
    private final Bundle field_10;
    // $FF: renamed from: h android.net.Uri
    private final Uri field_11;
    // $FF: renamed from: i java.lang.Object
    private Object field_12;

    MediaDescriptionCompat(Parcel var1) {
        this.field_4 = var1.readString();
        this.field_5 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
        this.field_6 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
        this.field_7 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
        this.field_8 = (Bitmap)var1.readParcelable((ClassLoader)null);
        this.field_9 = (Uri)var1.readParcelable((ClassLoader)null);
        this.field_10 = var1.readBundle();
        this.field_11 = (Uri)var1.readParcelable((ClassLoader)null);
    }

    MediaDescriptionCompat(String var1, CharSequence var2, CharSequence var3, CharSequence var4, Bitmap var5, Uri var6, Bundle var7, Uri var8) {
        this.field_4 = var1;
        this.field_5 = var2;
        this.field_6 = var3;
        this.field_7 = var4;
        this.field_8 = var5;
        this.field_9 = var6;
        this.field_10 = var7;
        this.field_11 = var8;
    }

    // $FF: renamed from: a (java.lang.Object) android.support.v4.media.MediaDescriptionCompat
    public static MediaDescriptionCompat method_167(Object var0) {
        Bundle var2 = null;
        MediaDescriptionCompat var1 = var2;
        if (var0 != null) {
            var1 = var2;
            if (VERSION.SDK_INT >= 21) {
                MediaDescriptionCompat.class_178 var3 = new MediaDescriptionCompat.class_178();
                var3.method_454(class_34.method_363(var0));
                var3.method_453(class_34.method_365(var0));
                var3.method_457(class_34.method_366(var0));
                var3.method_458(class_34.method_367(var0));
                var3.method_450(class_34.method_368(var0));
                var3.method_451(class_34.method_369(var0));
                var2 = class_34.method_370(var0);
                Uri var4;
                if (var2 == null) {
                    var4 = null;
                } else {
                    var4 = (Uri)var2.getParcelable("android.support.v4.media.description.MEDIA_URI");
                }

                if (var4 != null) {
                    if (var2.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && var2.size() == 2) {
                        var2 = null;
                    } else {
                        var2.remove("android.support.v4.media.description.MEDIA_URI");
                        var2.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    }
                }

                var3.method_452(var2);
                if (var4 != null) {
                    var3.method_456(var4);
                } else if (VERSION.SDK_INT >= 23) {
                    var3.method_456(class_35.method_371(var0));
                }

                var1 = var3.method_455();
                var1.field_12 = var0;
            }
        }

        return var1;
    }

    // $FF: renamed from: a () java.lang.Object
    public Object method_168() {
        Object var1;
        if (this.field_12 == null && VERSION.SDK_INT >= 21) {
            Object var3 = a$a.method_1306();
            a$a.method_1312(var3, this.field_4);
            a$a.method_1311(var3, this.field_5);
            a$a.method_1313(var3, this.field_6);
            a$a.method_1314(var3, this.field_7);
            a$a.method_1308(var3, this.field_8);
            a$a.method_1309(var3, this.field_9);
            Bundle var2 = this.field_10;
            Bundle var4 = var2;
            if (VERSION.SDK_INT < 23) {
                var4 = var2;
                if (this.field_11 != null) {
                    var4 = var2;
                    if (var2 == null) {
                        var4 = new Bundle();
                        var4.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                    }

                    var4.putParcelable("android.support.v4.media.description.MEDIA_URI", this.field_11);
                }
            }

            a$a.method_1310(var3, var4);
            if (VERSION.SDK_INT >= 23) {
                b$a.method_1315(var3, this.field_11);
            }

            this.field_12 = a$a.method_1307(var3);
            var1 = this.field_12;
        } else {
            var1 = this.field_12;
        }

        return var1;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.field_5 + ", " + this.field_6 + ", " + this.field_7;
    }

    public void writeToParcel(Parcel var1, int var2) {
        if (VERSION.SDK_INT < 21) {
            var1.writeString(this.field_4);
            TextUtils.writeToParcel(this.field_5, var1, var2);
            TextUtils.writeToParcel(this.field_6, var1, var2);
            TextUtils.writeToParcel(this.field_7, var1, var2);
            var1.writeParcelable(this.field_8, var2);
            var1.writeParcelable(this.field_9, var2);
            var1.writeBundle(this.field_10);
            var1.writeParcelable(this.field_11, var2);
        } else {
            class_34.method_364(this.method_168(), var1, var2);
        }

    }

    public static final class class_178 {
        // $FF: renamed from: a java.lang.String
        private String field_356;
        // $FF: renamed from: b java.lang.CharSequence
        private CharSequence field_357;
        // $FF: renamed from: c java.lang.CharSequence
        private CharSequence field_358;
        // $FF: renamed from: d java.lang.CharSequence
        private CharSequence field_359;
        // $FF: renamed from: e android.graphics.Bitmap
        private Bitmap field_360;
        // $FF: renamed from: f android.net.Uri
        private Uri field_361;
        // $FF: renamed from: g android.os.Bundle
        private Bundle field_362;
        // $FF: renamed from: h android.net.Uri
        private Uri field_363;

        // $FF: renamed from: a (android.graphics.Bitmap) android.support.v4.media.MediaDescriptionCompat$a
        public MediaDescriptionCompat.class_178 method_450(Bitmap var1) {
            this.field_360 = var1;
            return this;
        }

        // $FF: renamed from: a (android.net.Uri) android.support.v4.media.MediaDescriptionCompat$a
        public MediaDescriptionCompat.class_178 method_451(Uri var1) {
            this.field_361 = var1;
            return this;
        }

        // $FF: renamed from: a (android.os.Bundle) android.support.v4.media.MediaDescriptionCompat$a
        public MediaDescriptionCompat.class_178 method_452(Bundle var1) {
            this.field_362 = var1;
            return this;
        }

        // $FF: renamed from: a (java.lang.CharSequence) android.support.v4.media.MediaDescriptionCompat$a
        public MediaDescriptionCompat.class_178 method_453(CharSequence var1) {
            this.field_357 = var1;
            return this;
        }

        // $FF: renamed from: a (java.lang.String) android.support.v4.media.MediaDescriptionCompat$a
        public MediaDescriptionCompat.class_178 method_454(String var1) {
            this.field_356 = var1;
            return this;
        }

        // $FF: renamed from: a () android.support.v4.media.MediaDescriptionCompat
        public MediaDescriptionCompat method_455() {
            return new MediaDescriptionCompat(this.field_356, this.field_357, this.field_358, this.field_359, this.field_360, this.field_361, this.field_362, this.field_363);
        }

        // $FF: renamed from: b (android.net.Uri) android.support.v4.media.MediaDescriptionCompat$a
        public MediaDescriptionCompat.class_178 method_456(Uri var1) {
            this.field_363 = var1;
            return this;
        }

        // $FF: renamed from: b (java.lang.CharSequence) android.support.v4.media.MediaDescriptionCompat$a
        public MediaDescriptionCompat.class_178 method_457(CharSequence var1) {
            this.field_358 = var1;
            return this;
        }

        // $FF: renamed from: c (java.lang.CharSequence) android.support.v4.media.MediaDescriptionCompat$a
        public MediaDescriptionCompat.class_178 method_458(CharSequence var1) {
            this.field_359 = var1;
            return this;
        }
    }
}
