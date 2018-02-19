package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.util.ArrayList;

// $FF: renamed from: android.support.v7.widget.ah
public class class_96 extends ContextWrapper {
    // $FF: renamed from: a java.lang.Object
    private static final Object field_828 = new Object();
    // $FF: renamed from: b java.util.ArrayList
    private static ArrayList field_829;
    // $FF: renamed from: c android.content.res.Resources
    private final Resources field_830;
    // $FF: renamed from: d android.content.res.Resources.Theme
    private final Theme field_831;

    private class_96(Context var1) {
        super(var1);
        if (class_106.method_913()) {
            this.field_830 = new class_106(this, var1.getResources());
            this.field_831 = this.field_830.newTheme();
            this.field_831.setTo(var1.getTheme());
        } else {
            this.field_830 = new class_99(this, var1.getResources());
            this.field_831 = null;
        }

    }

    // $FF: renamed from: a (android.content.Context) android.content.Context
    public static Context method_863(Context param0) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: b (android.content.Context) boolean
    private static boolean method_864(Context var0) {
        boolean var2 = false;
        boolean var1 = var2;
        if (!(var0 instanceof class_96)) {
            var1 = var2;
            if (!(var0.getResources() instanceof class_99)) {
                if (var0.getResources() instanceof class_106) {
                    var1 = var2;
                } else {
                    if (VERSION.SDK_INT >= 21) {
                        var1 = var2;
                        if (!class_106.method_913()) {
                            return var1;
                        }
                    }

                    var1 = true;
                }
            }
        }

        return var1;
    }

    public AssetManager getAssets() {
        return this.field_830.getAssets();
    }

    public Resources getResources() {
        return this.field_830;
    }

    public Theme getTheme() {
        Theme var1;
        if (this.field_831 == null) {
            var1 = super.getTheme();
        } else {
            var1 = this.field_831;
        }

        return var1;
    }

    public void setTheme(int var1) {
        if (this.field_831 == null) {
            super.setTheme(var1);
        } else {
            this.field_831.applyStyle(var1, true);
        }

    }
}
