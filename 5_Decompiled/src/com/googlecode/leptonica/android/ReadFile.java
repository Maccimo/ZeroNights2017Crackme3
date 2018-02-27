package com.googlecode.leptonica.android;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;

public class ReadFile {
    // $FF: renamed from: a java.lang.String
    private static final String field_1105;

    static {
        System.loadLibrary("jpgt");
        System.loadLibrary("pngt");
        System.loadLibrary("lept");
        field_1105 = ReadFile.class.getSimpleName();
    }

    // $FF: renamed from: a (android.graphics.Bitmap) com.googlecode.leptonica.android.Pix
    public static Pix readBitmap(Bitmap var0) {
        Object var3 = null;
        Pix var4;
        if (var0 == null) {
            Log.e(field_1105, "Bitmap must be non-null");
            var4 = (Pix)var3;
        } else if (var0.getConfig() != Config.ARGB_8888) {
            Log.e(field_1105, "Bitmap config must be ARGB_8888");
            var4 = (Pix)var3;
        } else {
            long var1 = nativeReadBitmap(var0);
            if (var1 == 0L) {
                Log.e(field_1105, "Failed to read pix from bitmap");
                var4 = (Pix)var3;
            } else {
                var4 = new Pix(var1);
            }
        }

        return var4;
    }

    private static native long nativeReadBitmap(Bitmap var0);
}
