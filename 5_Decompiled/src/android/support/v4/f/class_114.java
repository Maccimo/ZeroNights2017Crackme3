package android.support.v4.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Handler.Callback;
import java.util.concurrent.Callable;

// $FF: renamed from: android.support.v4.f.c
public class class_114 {
    // $FF: renamed from: a java.lang.Object
    private final Object field_986 = new Object();
    // $FF: renamed from: b android.os.HandlerThread
    private HandlerThread field_987;
    // $FF: renamed from: c android.os.Handler
    private Handler field_988;
    // $FF: renamed from: d int
    private int field_989;
    // $FF: renamed from: e android.os.Handler.Callback
    private Callback field_990 = new Callback() {
        public boolean handleMessage(Message var1) {
            switch(var1.what) {
            case 0:
                class_114.this.method_1000();
                break;
            case 1:
                class_114.this.method_1004((Runnable)var1.obj);
            }

            return true;
        }
    };
    // $FF: renamed from: f int
    private final int field_991;
    // $FF: renamed from: g int
    private final int field_992;
    // $FF: renamed from: h java.lang.String
    private final String field_993;

    public class_114(String var1, int var2, int var3) {
        this.field_993 = var1;
        this.field_992 = var2;
        this.field_991 = var3;
        this.field_989 = 0;
    }

    // $FF: renamed from: a () void
    private void method_1000() {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (java.lang.Runnable) void
    private void method_1003(Runnable param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: b (java.lang.Runnable) void
    private void method_1004(Runnable param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (java.util.concurrent.Callable, int) java.lang.Object
    public Object method_1005(Callable param1, int param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (java.util.concurrent.Callable, android.support.v4.f.c$a) void
    public void method_1006(final Callable var1, final c$a var2) {
        this.method_1003(new Runnable(new Handler()) {
            // $FF: renamed from: b android.os.Handler
            // $FF: synthetic field
            final Handler field_1125;

            {
                this.field_1125 = var3;
            }

            public void run() {
                final Object var1x;
                try {
                    var1x = var1.call();
                } catch (Exception var2x) {
                    var1x = null;
                }

                this.field_1125.post(new Runnable() {
                    public void run() {
                        var2.method_111(var1x);
                    }
                });
            }
        });
    }
}
