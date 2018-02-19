package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;

class a$a {
    // $FF: renamed from: a () java.lang.Object
    public static Object method_1306() {
        return new Builder();
    }

    // $FF: renamed from: a (java.lang.Object) java.lang.Object
    public static Object method_1307(Object var0) {
        return ((Builder)var0).build();
    }

    // $FF: renamed from: a (java.lang.Object, android.graphics.Bitmap) void
    public static void method_1308(Object var0, Bitmap var1) {
        ((Builder)var0).setIconBitmap(var1);
    }

    // $FF: renamed from: a (java.lang.Object, android.net.Uri) void
    public static void method_1309(Object var0, Uri var1) {
        ((Builder)var0).setIconUri(var1);
    }

    // $FF: renamed from: a (java.lang.Object, android.os.Bundle) void
    public static void method_1310(Object var0, Bundle var1) {
        ((Builder)var0).setExtras(var1);
    }

    // $FF: renamed from: a (java.lang.Object, java.lang.CharSequence) void
    public static void method_1311(Object var0, CharSequence var1) {
        ((Builder)var0).setTitle(var1);
    }

    // $FF: renamed from: a (java.lang.Object, java.lang.String) void
    public static void method_1312(Object var0, String var1) {
        ((Builder)var0).setMediaId(var1);
    }

    // $FF: renamed from: b (java.lang.Object, java.lang.CharSequence) void
    public static void method_1313(Object var0, CharSequence var1) {
        ((Builder)var0).setSubtitle(var1);
    }

    // $FF: renamed from: c (java.lang.Object, java.lang.CharSequence) void
    public static void method_1314(Object var0, CharSequence var1) {
        ((Builder)var0).setDescription(var1);
    }
}
