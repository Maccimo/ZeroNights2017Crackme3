package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.Build.VERSION;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {
    public static final class QueueItem implements Parcelable {
        public static final Creator CREATOR = new Creator() {
            // $FF: renamed from: a (android.os.Parcel) android.support.v4.media.session.MediaSessionCompat$QueueItem
            public MediaSessionCompat.QueueItem method_969(Parcel var1) {
                return new MediaSessionCompat.QueueItem(var1);
            }

            // $FF: renamed from: a (int) android.support.v4.media.session.MediaSessionCompat$QueueItem[]
            public MediaSessionCompat.QueueItem[] method_970(int var1) {
                return new MediaSessionCompat.QueueItem[var1];
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1) {
                return this.method_969(var1);
            }

            // $FF: synthetic method
            public Object[] newArray(int var1) {
                return this.method_970(var1);
            }
        };
        // $FF: renamed from: a android.support.v4.media.MediaDescriptionCompat
        private final MediaDescriptionCompat field_60;
        // $FF: renamed from: b long
        private final long field_61;
        // $FF: renamed from: c java.lang.Object
        private Object field_62;

        QueueItem(Parcel var1) {
            this.field_60 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(var1);
            this.field_61 = var1.readLong();
        }

        private QueueItem(Object var1, MediaDescriptionCompat var2, long var3) {
            if (var2 == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (var3 == -1L) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            } else {
                this.field_60 = var2;
                this.field_61 = var3;
                this.field_62 = var1;
            }
        }

        // $FF: renamed from: a (java.lang.Object) android.support.v4.media.session.MediaSessionCompat$QueueItem
        public static MediaSessionCompat.QueueItem method_211(Object var0) {
            MediaSessionCompat.QueueItem var1;
            if (var0 != null && VERSION.SDK_INT >= 21) {
                var1 = new MediaSessionCompat.QueueItem(var0, MediaDescriptionCompat.method_167(d$a.method_1287(var0)), d$a.method_1288(var0));
            } else {
                var1 = null;
            }

            return var1;
        }

        // $FF: renamed from: a (java.util.List) java.util.List
        public static List method_212(List var0) {
            ArrayList var3;
            if (var0 != null && VERSION.SDK_INT >= 21) {
                ArrayList var1 = new ArrayList();
                Iterator var2 = var0.iterator();

                while(true) {
                    var3 = var1;
                    if (!var2.hasNext()) {
                        break;
                    }

                    var1.add(method_211(var2.next()));
                }
            } else {
                var3 = null;
            }

            return var3;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.field_60 + ", Id=" + this.field_61 + " }";
        }

        public void writeToParcel(Parcel var1, int var2) {
            this.field_60.writeToParcel(var1, var2);
            var1.writeLong(this.field_61);
        }
    }

    static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator CREATOR = new Creator() {
            // $FF: renamed from: a (android.os.Parcel) android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
            public MediaSessionCompat.ResultReceiverWrapper method_1165(Parcel var1) {
                return new MediaSessionCompat.ResultReceiverWrapper(var1);
            }

            // $FF: renamed from: a (int) android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper[]
            public MediaSessionCompat.ResultReceiverWrapper[] method_1166(int var1) {
                return new MediaSessionCompat.ResultReceiverWrapper[var1];
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1) {
                return this.method_1165(var1);
            }

            // $FF: synthetic method
            public Object[] newArray(int var1) {
                return this.method_1166(var1);
            }
        };
        // $FF: renamed from: a android.os.ResultReceiver
        private ResultReceiver field_255;

        ResultReceiverWrapper(Parcel var1) {
            this.field_255 = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(var1);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel var1, int var2) {
            this.field_255.writeToParcel(var1, var2);
        }
    }

    public static final class Token implements Parcelable {
        public static final Creator CREATOR = new Creator() {
            // $FF: renamed from: a (android.os.Parcel) android.support.v4.media.session.MediaSessionCompat$Token
            public MediaSessionCompat.Token method_463(Parcel var1) {
                Object var2;
                if (VERSION.SDK_INT >= 21) {
                    var2 = var1.readParcelable((ClassLoader)null);
                } else {
                    var2 = var1.readStrongBinder();
                }

                return new MediaSessionCompat.Token(var2);
            }

            // $FF: renamed from: a (int) android.support.v4.media.session.MediaSessionCompat$Token[]
            public MediaSessionCompat.Token[] method_464(int var1) {
                return new MediaSessionCompat.Token[var1];
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1) {
                return this.method_463(var1);
            }

            // $FF: synthetic method
            public Object[] newArray(int var1) {
                return this.method_464(var1);
            }
        };
        // $FF: renamed from: a java.lang.Object
        private final Object field_904;
        // $FF: renamed from: b android.support.v4.media.session.b
        private final class_15 field_905;

        Token(Object var1) {
            this(var1, (class_15)null);
        }

        Token(Object var1, class_15 var2) {
            this.field_904 = var1;
            this.field_905 = var2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object var1) {
            boolean var3 = false;
            boolean var2;
            if (this != var1) {
                var2 = var3;
                if (!(var1 instanceof MediaSessionCompat.Token)) {
                    return var2;
                }

                MediaSessionCompat.Token var4 = (MediaSessionCompat.Token)var1;
                if (this.field_904 != null) {
                    var2 = var3;
                    if (var4.field_904 != null) {
                        var2 = this.field_904.equals(var4.field_904);
                    }

                    return var2;
                }

                if (var4.field_904 != null) {
                    var2 = var3;
                    return var2;
                }
            }

            var2 = true;
            return var2;
        }

        public int hashCode() {
            int var1;
            if (this.field_904 == null) {
                var1 = 0;
            } else {
                var1 = this.field_904.hashCode();
            }

            return var1;
        }

        public void writeToParcel(Parcel var1, int var2) {
            if (VERSION.SDK_INT >= 21) {
                var1.writeParcelable((Parcelable)this.field_904, var2);
            } else {
                var1.writeStrongBinder((IBinder)this.field_904);
            }

        }
    }
}
