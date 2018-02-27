package com.googlecode.tesseract.android;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.googlecode.leptonica.android.Pix;
import com.googlecode.leptonica.android.ReadFile;
import java.io.File;

public class TessBaseAPI {
    // $FF: renamed from: a long
    private long mNativeData = this.nativeConstruct();
    // $FF: renamed from: b com.googlecode.tesseract.android.TessBaseAPI$a
    private ProgressNotifier progressNotifier;
    // $FF: renamed from: c boolean
    private boolean mRecycled;

    static {
        System.loadLibrary("jpgt");
        System.loadLibrary("pngt");
        System.loadLibrary("lept");
        System.loadLibrary("tess");
        nativeClassInit();
    }

    public TessBaseAPI() {
        if (this.mNativeData == 0L) {
            throw new RuntimeException("Can't create TessBaseApi object");
        } else {
            this.mRecycled = false;
        }
    }

    private static native void nativeClassInit();

    private native long nativeConstruct();

    private native String nativeGetUTF8Text(long var1);

    private native boolean nativeInitOem(long var1, String var3, String var4, int var5);

    private native void nativeSetImagePix(long var1, long var3);

    // $FF: renamed from: a () java.lang.String
    public String getUTF8Text() {
        if (this.mRecycled) {
            throw new IllegalStateException();
        } else {
            String text = this.nativeGetUTF8Text(this.mNativeData);
            return text != null ? text.trim() : null;
        }
    }

    // $FF: renamed from: a (android.graphics.Bitmap) void
    public void setImage(Bitmap bmp) {
        if (this.mRecycled) {
            throw new IllegalStateException();
        } else {
            Pix image = ReadFile.readBitmap(bmp);
            if (image == null) {
                throw new RuntimeException("Failed to read bitmap");
            } else {
                this.nativeSetImagePix(this.mNativeData, image.getNativePix());
                image.recycle();
            }
        }
    }

    // $FF: renamed from: a (java.lang.String, java.lang.String) boolean
    public boolean init(String datapath, String language) {
        return this.init(datapath, language, 3);
    }

    // $FF: renamed from: a (java.lang.String, java.lang.String, int) boolean
    public boolean init(String datapath, String language, int ocrEngineMode) {
        if (datapath == null) {
            throw new IllegalArgumentException("Data path must not be null!");
        } else {
            if (!datapath.endsWith(File.separator)) {
                datapath = datapath + File.separator;
            }

            if (!(new File(datapath)).exists()) {
                throw new IllegalArgumentException("Data path does not exist!");
            } else {
                File var7 = new File(datapath + "tessdata");
                if (var7.exists() && var7.isDirectory()) {
                    if (ocrEngineMode != 1) {
                        String[] var8 = language.split("\\+");
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

                    boolean var6 = this.nativeInitOem(this.mNativeData, datapath, language, ocrEngineMode);
                    if (var6) {
                        this.mRecycled = false;
                    }

                    return var6;
                } else {
                    throw new IllegalArgumentException("Data path must contain subfolder tessdata!");
                }
            }
        }
    }

    protected void onProgressValues(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        if (this.progressNotifier != null) {
            ProgressValues var10 = new ProgressValues(var1, new Rect(var2, var8 - var4, var3, var8 - var5), new Rect(var6, var9, var7, var8));
            this.progressNotifier.onProgressValues(var10);
        }

    }

    public interface ProgressNotifier {
        // $FF: renamed from: a (com.googlecode.tesseract.android.TessBaseAPI$b) void
        void onProgressValues(ProgressValues var1);
    }

    public class ProgressValues {
        // $FF: renamed from: b int
        private final int percent;
        // $FF: renamed from: c android.graphics.Rect
        private final Rect wordRect;
        // $FF: renamed from: d android.graphics.Rect
        private final Rect textRect;

        public ProgressValues(int percent, Rect wordRect, Rect textRect) {
            this.percent = percent;
            this.wordRect = wordRect;
            this.textRect = textRect;
        }
    }
}
