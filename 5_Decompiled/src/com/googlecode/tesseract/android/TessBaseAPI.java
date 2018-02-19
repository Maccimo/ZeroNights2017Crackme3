package com.googlecode.tesseract.android;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.googlecode.leptonica.android.Pix;
import com.googlecode.leptonica.android.ReadFile;
import java.io.File;

public class TessBaseAPI {
    // $FF: renamed from: a long
    private long field_982 = this.nativeConstruct();
    // $FF: renamed from: b com.googlecode.tesseract.android.TessBaseAPI$a
    private TessBaseAPI.class_339 field_983;
    // $FF: renamed from: c boolean
    private boolean field_984;

    static {
        System.loadLibrary("jpgt");
        System.loadLibrary("pngt");
        System.loadLibrary("lept");
        System.loadLibrary("tess");
        nativeClassInit();
    }

    public TessBaseAPI() {
        if (this.field_982 == 0L) {
            throw new RuntimeException("Can't create TessBaseApi object");
        } else {
            this.field_984 = false;
        }
    }

    private static native void nativeClassInit();

    private native long nativeConstruct();

    private native String nativeGetUTF8Text(long var1);

    private native boolean nativeInitOem(long var1, String var3, String var4, int var5);

    private native void nativeSetImagePix(long var1, long var3);

    // $FF: renamed from: a () java.lang.String
    public String method_995() {
        if (this.field_984) {
            throw new IllegalStateException();
        } else {
            String var1 = this.nativeGetUTF8Text(this.field_982);
            if (var1 != null) {
                var1 = var1.trim();
            } else {
                var1 = null;
            }

            return var1;
        }
    }

    // $FF: renamed from: a (android.graphics.Bitmap) void
    public void method_996(Bitmap var1) {
        if (this.field_984) {
            throw new IllegalStateException();
        } else {
            Pix var2 = ReadFile.method_1191(var1);
            if (var2 == null) {
                throw new RuntimeException("Failed to read bitmap");
            } else {
                this.nativeSetImagePix(this.field_982, var2.method_459());
                var2.method_461();
            }
        }
    }

    // $FF: renamed from: a (java.lang.String, java.lang.String) boolean
    public boolean method_997(String var1, String var2) {
        return this.method_998(var1, var2, 3);
    }

    // $FF: renamed from: a (java.lang.String, java.lang.String, int) boolean
    public boolean method_998(String var1, String var2, int var3) {
        if (var1 == null) {
            throw new IllegalArgumentException("Data path must not be null!");
        } else {
            if (!var1.endsWith(File.separator)) {
                var1 = var1 + File.separator;
            }

            if (!(new File(var1)).exists()) {
                throw new IllegalArgumentException("Data path does not exist!");
            } else {
                File var7 = new File(var1 + "tessdata");
                if (var7.exists() && var7.isDirectory()) {
                    if (var3 != 1) {
                        String[] var8 = var2.split("\\+");
                        int var5 = var8.length;

                        for(int var4 = 0; var4 < var5; ++var4) {
                            String var9 = var8[var4];
                            if (!var9.startsWith("~")) {
                                File var10 = new File(var7 + File.separator + var9 + ".traineddata");
                                if (!var10.exists()) {
                                    throw new IllegalArgumentException("Data file not found at " + var10);
                                }
                            }
                        }
                    }

                    boolean var6 = this.nativeInitOem(this.field_982, var1, var2, var3);
                    if (var6) {
                        this.field_984 = false;
                    }

                    return var6;
                } else {
                    throw new IllegalArgumentException("Data path must contain subfolder tessdata!");
                }
            }
        }
    }

    protected void onProgressValues(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        if (this.field_983 != null) {
            TessBaseAPI.class_340 var10 = new TessBaseAPI.class_340(var1, new Rect(var2, var8 - var4, var3, var8 - var5), new Rect(var6, var9, var7, var8));
            this.field_983.method_162(var10);
        }

    }

    public interface class_339 {
        // $FF: renamed from: a (com.googlecode.tesseract.android.TessBaseAPI$b) void
        void method_162(TessBaseAPI.class_340 var1);
    }

    public class class_340 {
        // $FF: renamed from: b int
        private final int field_1370;
        // $FF: renamed from: c android.graphics.Rect
        private final Rect field_1371;
        // $FF: renamed from: d android.graphics.Rect
        private final Rect field_1372;

        public class_340(int var2, Rect var3, Rect var4) {
            this.field_1370 = var2;
            this.field_1371 = var3;
            this.field_1372 = var4;
        }
    }
}
