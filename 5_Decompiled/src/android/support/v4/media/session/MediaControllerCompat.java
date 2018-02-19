package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.ResultReceiver;
import android.os.Build.VERSION;
import android.os.IBinder.DeathRecipient;
import android.support.v4.a.class_43;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

public final class MediaControllerCompat {
    static class MediaControllerImplApi21 {
        // $FF: renamed from: a java.util.List
        private final List field_716;
        // $FF: renamed from: b android.support.v4.media.session.b
        private class_15 field_717;
        // $FF: renamed from: c java.util.HashMap
        private HashMap field_718;

        // $FF: renamed from: a () void
        private void method_774() {
            // $FF: Couldn't be decompiled
        }

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            // $FF: renamed from: a java.lang.ref.WeakReference
            private WeakReference field_281;

            protected void onReceiveResult(int var1, Bundle var2) {
                MediaControllerCompat.MediaControllerImplApi21 var3 = (MediaControllerCompat.MediaControllerImplApi21)this.field_281.get();
                if (var3 != null && var2 != null) {
                    var3.field_717 = b$a.method_1327(class_43.method_462(var2, "android.support.v4.media.session.EXTRA_BINDER"));
                    var3.method_774();
                }

            }
        }

        private static class class_289 extends MediaControllerCompat.class_308.class_181 {
            class_289(MediaControllerCompat.class_308 var1) {
                super(var1);
            }

            // $FF: renamed from: a () void
            public void method_44() {
                throw new AssertionError();
            }

            // $FF: renamed from: a (android.os.Bundle) void
            public void method_46(Bundle var1) {
                throw new AssertionError();
            }

            // $FF: renamed from: a (android.support.v4.media.MediaMetadataCompat) void
            public void method_47(MediaMetadataCompat var1) {
                throw new AssertionError();
            }

            // $FF: renamed from: a (android.support.v4.media.session.ParcelableVolumeInfo) void
            public void method_48(ParcelableVolumeInfo var1) {
                throw new AssertionError();
            }

            // $FF: renamed from: a (java.lang.CharSequence) void
            public void method_50(CharSequence var1) {
                throw new AssertionError();
            }

            // $FF: renamed from: a (java.util.List) void
            public void method_52(List var1) {
                throw new AssertionError();
            }
        }
    }

    public abstract static class class_308 implements DeathRecipient {
        // $FF: renamed from: a android.support.v4.media.session.MediaControllerCompat$a$a
        MediaControllerCompat.class_308.class_177 field_892;
        // $FF: renamed from: b boolean
        boolean field_893;
        // $FF: renamed from: c java.lang.Object
        private final Object field_894;

        public class_308() {
            if (VERSION.SDK_INT >= 21) {
                this.field_894 = class_111.method_987(new MediaControllerCompat.class_308.class_183(this));
            } else {
                this.field_894 = new MediaControllerCompat.class_308.class_181(this);
            }

        }

        // $FF: renamed from: a () void
        public void method_917() {
        }

        // $FF: renamed from: a (int) void
        public void method_918(int var1) {
        }

        // $FF: renamed from: a (int, java.lang.Object, android.os.Bundle) void
        void method_919(int var1, Object var2, Bundle var3) {
            if (this.field_892 != null) {
                Message var4 = this.field_892.obtainMessage(var1, var2);
                var4.setData(var3);
                var4.sendToTarget();
            }

        }

        // $FF: renamed from: a (android.os.Bundle) void
        public void method_920(Bundle var1) {
        }

        // $FF: renamed from: a (android.support.v4.media.MediaMetadataCompat) void
        public void method_921(MediaMetadataCompat var1) {
        }

        // $FF: renamed from: a (android.support.v4.media.session.MediaControllerCompat$b) void
        public void method_922(MediaControllerCompat.class_307 var1) {
        }

        // $FF: renamed from: a (android.support.v4.media.session.PlaybackStateCompat) void
        public void method_923(PlaybackStateCompat var1) {
        }

        // $FF: renamed from: a (java.lang.CharSequence) void
        public void method_924(CharSequence var1) {
        }

        // $FF: renamed from: a (java.lang.String, android.os.Bundle) void
        public void method_925(String var1, Bundle var2) {
        }

        // $FF: renamed from: a (java.util.List) void
        public void method_926(List var1) {
        }

        // $FF: renamed from: a (boolean) void
        public void method_927(boolean var1) {
        }

        // $FF: renamed from: b (int) void
        public void method_928(int var1) {
        }

        // $FF: renamed from: b (boolean) void
        @Deprecated
        public void method_929(boolean var1) {
        }

        private class class_177 extends Handler {
            // $FF: renamed from: a boolean
            boolean field_2;
            // $FF: renamed from: b android.support.v4.media.session.MediaControllerCompat$a
            // $FF: synthetic field
            final MediaControllerCompat.class_308 field_3;

            public void handleMessage(Message var1) {
                if (this.field_2) {
                    switch(var1.what) {
                    case 1:
                        this.field_3.method_925((String)var1.obj, var1.getData());
                        break;
                    case 2:
                        this.field_3.method_923((PlaybackStateCompat)var1.obj);
                        break;
                    case 3:
                        this.field_3.method_921((MediaMetadataCompat)var1.obj);
                        break;
                    case 4:
                        this.field_3.method_922((MediaControllerCompat.class_307)var1.obj);
                        break;
                    case 5:
                        this.field_3.method_926((List)var1.obj);
                        break;
                    case 6:
                        this.field_3.method_924((CharSequence)var1.obj);
                        break;
                    case 7:
                        this.field_3.method_920((Bundle)var1.obj);
                        break;
                    case 8:
                        this.field_3.method_917();
                        break;
                    case 9:
                        this.field_3.method_918((Integer)var1.obj);
                        break;
                    case 10:
                        this.field_3.method_929((Boolean)var1.obj);
                        break;
                    case 11:
                        this.field_3.method_927((Boolean)var1.obj);
                        break;
                    case 12:
                        this.field_3.method_928((Integer)var1.obj);
                    }
                }

            }
        }

        private static class class_183 implements c$a {
            // $FF: renamed from: a java.lang.ref.WeakReference
            private final WeakReference field_16;

            class_183(MediaControllerCompat.class_308 var1) {
                this.field_16 = new WeakReference(var1);
            }

            // $FF: renamed from: a () void
            public void method_120() {
                MediaControllerCompat.class_308 var1 = (MediaControllerCompat.class_308)this.field_16.get();
                if (var1 != null) {
                    var1.method_917();
                }

            }

            // $FF: renamed from: a (int, int, int, int, int) void
            public void method_121(int var1, int var2, int var3, int var4, int var5) {
                MediaControllerCompat.class_308 var6 = (MediaControllerCompat.class_308)this.field_16.get();
                if (var6 != null) {
                    var6.method_922(new MediaControllerCompat.class_307(var1, var2, var3, var4, var5));
                }

            }

            // $FF: renamed from: a (android.os.Bundle) void
            public void method_122(Bundle var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_16.get();
                if (var2 != null) {
                    var2.method_920(var1);
                }

            }

            // $FF: renamed from: a (java.lang.CharSequence) void
            public void method_123(CharSequence var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_16.get();
                if (var2 != null) {
                    var2.method_924(var1);
                }

            }

            // $FF: renamed from: a (java.lang.Object) void
            public void method_124(Object var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_16.get();
                if (var2 != null && !var2.field_893) {
                    var2.method_923(PlaybackStateCompat.method_512(var1));
                }

            }

            // $FF: renamed from: a (java.lang.String, android.os.Bundle) void
            public void method_125(String var1, Bundle var2) {
                MediaControllerCompat.class_308 var3 = (MediaControllerCompat.class_308)this.field_16.get();
                if (var3 != null && (!var3.field_893 || VERSION.SDK_INT >= 23)) {
                    var3.method_925(var1, var2);
                }

            }

            // $FF: renamed from: a (java.util.List) void
            public void method_126(List var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_16.get();
                if (var2 != null) {
                    var2.method_926(MediaSessionCompat.QueueItem.method_212(var1));
                }

            }

            // $FF: renamed from: b (java.lang.Object) void
            public void method_127(Object var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_16.get();
                if (var2 != null) {
                    var2.method_921(MediaMetadataCompat.method_803(var1));
                }

            }
        }

        private static class class_181 extends a$a {
            // $FF: renamed from: a java.lang.ref.WeakReference
            private final WeakReference field_15;

            class_181(MediaControllerCompat.class_308 var1) {
                this.field_15 = new WeakReference(var1);
            }

            // $FF: renamed from: a () void
            public void method_44() {
                MediaControllerCompat.class_308 var1 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var1 != null) {
                    var1.method_919(8, (Object)null, (Bundle)null);
                }

            }

            // $FF: renamed from: a (int) void
            public void method_45(int var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var2 != null) {
                    var2.method_919(9, var1, (Bundle)null);
                }

            }

            // $FF: renamed from: a (android.os.Bundle) void
            public void method_46(Bundle var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var2 != null) {
                    var2.method_919(7, var1, (Bundle)null);
                }

            }

            // $FF: renamed from: a (android.support.v4.media.MediaMetadataCompat) void
            public void method_47(MediaMetadataCompat var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var2 != null) {
                    var2.method_919(3, var1, (Bundle)null);
                }

            }

            // $FF: renamed from: a (android.support.v4.media.session.ParcelableVolumeInfo) void
            public void method_48(ParcelableVolumeInfo var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var2 != null) {
                    MediaControllerCompat.class_307 var3;
                    if (var1 != null) {
                        var3 = new MediaControllerCompat.class_307(var1.field_256, var1.field_257, var1.field_258, var1.field_259, var1.field_260);
                    } else {
                        var3 = null;
                    }

                    var2.method_919(4, var3, (Bundle)null);
                }

            }

            // $FF: renamed from: a (android.support.v4.media.session.PlaybackStateCompat) void
            public void method_49(PlaybackStateCompat var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var2 != null) {
                    var2.method_919(2, var1, (Bundle)null);
                }

            }

            // $FF: renamed from: a (java.lang.CharSequence) void
            public void method_50(CharSequence var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var2 != null) {
                    var2.method_919(6, var1, (Bundle)null);
                }

            }

            // $FF: renamed from: a (java.lang.String, android.os.Bundle) void
            public void method_51(String var1, Bundle var2) {
                MediaControllerCompat.class_308 var3 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var3 != null) {
                    var3.method_919(1, var1, var2);
                }

            }

            // $FF: renamed from: a (java.util.List) void
            public void method_52(List var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var2 != null) {
                    var2.method_919(5, var1, (Bundle)null);
                }

            }

            // $FF: renamed from: a (boolean) void
            public void method_53(boolean var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var2 != null) {
                    var2.method_919(10, var1, (Bundle)null);
                }

            }

            // $FF: renamed from: b (int) void
            public void method_54(int var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var2 != null) {
                    var2.method_919(12, var1, (Bundle)null);
                }

            }

            // $FF: renamed from: b (boolean) void
            public void method_55(boolean var1) {
                MediaControllerCompat.class_308 var2 = (MediaControllerCompat.class_308)this.field_15.get();
                if (var2 != null) {
                    var2.method_919(11, var1, (Bundle)null);
                }

            }
        }
    }

    public static final class class_307 {
        // $FF: renamed from: a int
        private final int field_886;
        // $FF: renamed from: b int
        private final int field_887;
        // $FF: renamed from: c int
        private final int field_888;
        // $FF: renamed from: d int
        private final int field_889;
        // $FF: renamed from: e int
        private final int field_890;

        class_307(int var1, int var2, int var3, int var4, int var5) {
            this.field_886 = var1;
            this.field_887 = var2;
            this.field_888 = var3;
            this.field_889 = var4;
            this.field_890 = var5;
        }
    }
}
