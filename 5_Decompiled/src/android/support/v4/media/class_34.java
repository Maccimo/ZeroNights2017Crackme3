package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

// $FF: renamed from: android.support.v4.media.a
class class_34 {
    // $FF: renamed from: a (android.os.Parcel) java.lang.Object
    public static Object method_362(Parcel var0) {
        return MediaDescription.CREATOR.createFromParcel(var0);
    }

    // $FF: renamed from: a (java.lang.Object) java.lang.String
    public static String method_363(Object var0) {
        return ((MediaDescription)var0).getMediaId();
    }

    // $FF: renamed from: a (java.lang.Object, android.os.Parcel, int) void
    public static void method_364(Object var0, Parcel var1, int var2) {
        ((MediaDescription)var0).writeToParcel(var1, var2);
    }

    // $FF: renamed from: b (java.lang.Object) java.lang.CharSequence
    public static CharSequence method_365(Object var0) {
        return ((MediaDescription)var0).getTitle();
    }

    // $FF: renamed from: c (java.lang.Object) java.lang.CharSequence
    public static CharSequence method_366(Object var0) {
        return ((MediaDescription)var0).getSubtitle();
    }

    // $FF: renamed from: d (java.lang.Object) java.lang.CharSequence
    public static CharSequence method_367(Object var0) {
        return ((MediaDescription)var0).getDescription();
    }

    // $FF: renamed from: e (java.lang.Object) android.graphics.Bitmap
    public static Bitmap method_368(Object var0) {
        return ((MediaDescription)var0).getIconBitmap();
    }

    // $FF: renamed from: f (java.lang.Object) android.net.Uri
    public static Uri method_369(Object var0) {
        return ((MediaDescription)var0).getIconUri();
    }

    // $FF: renamed from: g (java.lang.Object) android.os.Bundle
    public static Bundle method_370(Object var0) {
        return ((MediaDescription)var0).getExtras();
    }
}
