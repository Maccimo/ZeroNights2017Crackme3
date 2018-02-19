package com.scottyab.rootbeer;

import com.scottyab.rootbeer.a.class_120;

public class RootBeerNative {
    // $FF: renamed from: a boolean
    static boolean field_1006 = false;

    static {
        try {
            System.loadLibrary("tool-checker");
            field_1006 = true;
        } catch (UnsatisfiedLinkError var1) {
            class_120.method_1023(var1);
        }

    }

    // $FF: renamed from: a () boolean
    public boolean method_1031() {
        return field_1006;
    }

    public native int checkForRoot(Object[] var1);

    public native int setLogDebugMessages(boolean var1);
}
