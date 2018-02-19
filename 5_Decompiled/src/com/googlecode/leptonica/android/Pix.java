package com.googlecode.leptonica.android;

public class Pix {
    // $FF: renamed from: a long
    private final long field_364;
    // $FF: renamed from: b boolean
    private boolean field_365;

    static {
        System.loadLibrary("jpgt");
        System.loadLibrary("pngt");
        System.loadLibrary("lept");
    }

    public Pix(long var1) {
        this.field_364 = var1;
        this.field_365 = false;
    }

    private static native long nativeClone(long var0);

    private static native void nativeDestroy(long var0);

    // $FF: renamed from: a () long
    public long method_459() {
        if (this.field_365) {
            throw new IllegalStateException();
        } else {
            return this.field_364;
        }
    }

    // $FF: renamed from: b () com.googlecode.leptonica.android.Pix
    public Pix method_460() {
        if (this.field_365) {
            throw new IllegalStateException();
        } else {
            long var1 = nativeClone(this.field_364);
            if (var1 == 0L) {
                throw new OutOfMemoryError();
            } else {
                return new Pix(var1);
            }
        }
    }

    // $FF: renamed from: c () void
    public void method_461() {
        if (!this.field_365) {
            nativeDestroy(this.field_364);
            this.field_365 = true;
        }

    }

    // $FF: synthetic method
    public Object clone() {
        return this.method_460();
    }
}
