package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.e.class_45;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class MediaBrowserCompat {
    // $FF: renamed from: a boolean
    static final boolean field_751 = Log.isLoggable("MediaBrowserCompat", 3);

    private static class CustomActionResultReceiver extends class_45 {
        // $FF: renamed from: d java.lang.String
        private final String field_397;
        // $FF: renamed from: e android.os.Bundle
        private final Bundle field_398;
        // $FF: renamed from: f android.support.v4.media.MediaBrowserCompat$a
        private final MediaBrowserCompat.class_295 field_399;

        // $FF: renamed from: a (int, android.os.Bundle) void
        protected void method_466(int var1, Bundle var2) {
            if (this.field_399 != null) {
                switch(var1) {
                case -1:
                    this.field_399.method_1450(this.field_397, this.field_398, var2);
                    break;
                case 0:
                    this.field_399.method_1449(this.field_397, this.field_398, var2);
                    break;
                case 1:
                    this.field_399.method_1448(this.field_397, this.field_398, var2);
                    break;
                default:
                    Log.w("MediaBrowserCompat", "Unknown result code: " + var1 + " (extras=" + this.field_398 + ", resultData=" + var2 + ")");
                }
            }

        }
    }

    private static class ItemReceiver extends class_45 {
        // $FF: renamed from: d java.lang.String
        private final String field_395;
        // $FF: renamed from: e android.support.v4.media.MediaBrowserCompat$b
        private final MediaBrowserCompat.class_296 field_396;

        // $FF: renamed from: a (int, android.os.Bundle) void
        protected void method_466(int var1, Bundle var2) {
            if (var2 != null) {
                var2.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }

            if (var1 == 0 && var2 != null && var2.containsKey("media_item")) {
                Parcelable var3 = var2.getParcelable("media_item");
                if (var3 != null && !(var3 instanceof MediaBrowserCompat.MediaItem)) {
                    this.field_396.method_1413(this.field_395);
                } else {
                    this.field_396.method_1412((MediaBrowserCompat.MediaItem)var3);
                }
            } else {
                this.field_396.method_1413(this.field_395);
            }

        }
    }

    public static class MediaItem implements Parcelable {
        public static final Creator CREATOR = new Creator() {
            // $FF: renamed from: a (android.os.Parcel) android.support.v4.media.MediaBrowserCompat$MediaItem
            public MediaBrowserCompat.MediaItem method_1301(Parcel var1) {
                return new MediaBrowserCompat.MediaItem(var1);
            }

            // $FF: renamed from: a (int) android.support.v4.media.MediaBrowserCompat$MediaItem[]
            public MediaBrowserCompat.MediaItem[] method_1302(int var1) {
                return new MediaBrowserCompat.MediaItem[var1];
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1) {
                return this.method_1301(var1);
            }

            // $FF: synthetic method
            public Object[] newArray(int var1) {
                return this.method_1302(var1);
            }
        };
        // $FF: renamed from: a int
        private final int field_1103;
        // $FF: renamed from: b android.support.v4.media.MediaDescriptionCompat
        private final MediaDescriptionCompat field_1104;

        MediaItem(Parcel var1) {
            this.field_1103 = var1.readInt();
            this.field_1104 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(var1);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder var1 = new StringBuilder("MediaItem{");
            var1.append("mFlags=").append(this.field_1103);
            var1.append(", mDescription=").append(this.field_1104);
            var1.append('}');
            return var1.toString();
        }

        public void writeToParcel(Parcel var1, int var2) {
            var1.writeInt(this.field_1103);
            this.field_1104.writeToParcel(var1, var2);
        }
    }

    private static class SearchResultReceiver extends class_45 {
        // $FF: renamed from: d java.lang.String
        private final String field_400;
        // $FF: renamed from: e android.os.Bundle
        private final Bundle field_401;
        // $FF: renamed from: f android.support.v4.media.MediaBrowserCompat$c
        private final MediaBrowserCompat.class_297 field_402;

        // $FF: renamed from: a (int, android.os.Bundle) void
        protected void method_466(int var1, Bundle var2) {
            if (var2 != null) {
                var2.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }

            if (var1 == 0 && var2 != null && var2.containsKey("search_results")) {
                Parcelable[] var4 = var2.getParcelableArray("search_results");
                ArrayList var5 = null;
                if (var4 != null) {
                    var5 = new ArrayList();
                    int var3 = var4.length;

                    for(var1 = 0; var1 < var3; ++var1) {
                        var5.add((MediaBrowserCompat.MediaItem)var4[var1]);
                    }
                }

                this.field_402.method_1411(this.field_400, this.field_401, var5);
            } else {
                this.field_402.method_1410(this.field_400, this.field_401);
            }

        }
    }

    public abstract static class class_295 {
        // $FF: renamed from: a (java.lang.String, android.os.Bundle, android.os.Bundle) void
        public void method_1448(String var1, Bundle var2, Bundle var3) {
        }

        // $FF: renamed from: b (java.lang.String, android.os.Bundle, android.os.Bundle) void
        public void method_1449(String var1, Bundle var2, Bundle var3) {
        }

        // $FF: renamed from: c (java.lang.String, android.os.Bundle, android.os.Bundle) void
        public void method_1450(String var1, Bundle var2, Bundle var3) {
        }
    }

    public abstract static class class_296 {
        // $FF: renamed from: a (android.support.v4.media.MediaBrowserCompat$MediaItem) void
        public void method_1412(MediaBrowserCompat.MediaItem var1) {
        }

        // $FF: renamed from: a (java.lang.String) void
        public void method_1413(String var1) {
        }
    }

    public abstract static class class_297 {
        // $FF: renamed from: a (java.lang.String, android.os.Bundle) void
        public void method_1410(String var1, Bundle var2) {
        }

        // $FF: renamed from: a (java.lang.String, android.os.Bundle, java.util.List) void
        public void method_1411(String var1, Bundle var2, List var3) {
        }
    }
}
