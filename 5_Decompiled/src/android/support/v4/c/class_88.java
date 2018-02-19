package android.support.v4.c;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Process;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// $FF: renamed from: android.support.v4.c.h
public class class_88 {
    // $FF: renamed from: a (android.content.Context) java.io.File
    public static File method_811(Context var0) {
        String var4 = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int var1 = 0;

        File var6;
        while(true) {
            if (var1 >= 100) {
                var6 = null;
                break;
            }

            File var3 = new File(var0.getCacheDir(), var4 + var1);

            label20: {
                boolean var2;
                try {
                    var2 = var3.createNewFile();
                } catch (IOException var5) {
                    break label20;
                }

                if (var2) {
                    var6 = var3;
                    break;
                }
            }

            ++var1;
        }

        return var6;
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, int) java.nio.ByteBuffer
    public static ByteBuffer method_812(Context param0, Resources param1, int param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.content.Context, android.os.CancellationSignal, android.net.Uri) java.nio.ByteBuffer
    public static ByteBuffer method_813(Context param0, CancellationSignal param1, Uri param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (java.io.File) java.nio.ByteBuffer
    private static ByteBuffer method_814(File param0) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (java.io.Closeable) void
    public static void method_815(Closeable var0) {
        if (var0 != null) {
            try {
                var0.close();
            } catch (IOException var1) {
                ;
            }
        }

    }

    // $FF: renamed from: a (java.io.File, android.content.res.Resources, int) boolean
    public static boolean method_816(File param0, Resources param1, int param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (java.io.File, java.io.InputStream) boolean
    public static boolean method_817(File param0, InputStream param1) {
        // $FF: Couldn't be decompiled
    }
}
