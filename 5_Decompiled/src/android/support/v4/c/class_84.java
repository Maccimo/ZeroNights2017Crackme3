package android.support.v4.c;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

// $FF: renamed from: android.support.v4.c.d
class class_84 extends class_82 {
    // $FF: renamed from: a (android.os.ParcelFileDescriptor) java.io.File
    private File method_788(ParcelFileDescriptor var1) {
        File var4;
        try {
            StringBuilder var2 = new StringBuilder();
            String var5 = Os.readlink(var2.append("/proc/self/fd/").append(var1.getFd()).toString());
            if (OsConstants.S_ISREG(Os.stat(var5).st_mode)) {
                var4 = new File(var5);
                return var4;
            }
        } catch (ErrnoException var3) {
            var4 = null;
            return var4;
        }

        var4 = null;
        return var4;
    }

    // $FF: renamed from: a (android.content.Context, android.os.CancellationSignal, android.support.v4.f.b$b[], int) android.graphics.Typeface
    public Typeface method_135(Context param1, CancellationSignal param2, android.support.v4.f.b$b[] param3, int param4) {
        // $FF: Couldn't be decompiled
    }
}
