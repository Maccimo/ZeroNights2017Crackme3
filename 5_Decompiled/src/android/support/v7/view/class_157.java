package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.a.a$i;
import android.view.LayoutInflater;

// $FF: renamed from: android.support.v7.view.c
public class class_157 extends ContextWrapper {
    // $FF: renamed from: a int
    private int field_1190;
    // $FF: renamed from: b android.content.res.Resources.Theme
    private Theme field_1191;
    // $FF: renamed from: c android.view.LayoutInflater
    private LayoutInflater field_1192;
    // $FF: renamed from: d android.content.res.Configuration
    private Configuration field_1193;
    // $FF: renamed from: e android.content.res.Resources
    private Resources field_1194;

    public class_157() {
        super((Context)null);
    }

    public class_157(Context var1, int var2) {
        super(var1);
        this.field_1190 = var2;
    }

    public class_157(Context var1, Theme var2) {
        super(var1);
        this.field_1191 = var2;
    }

    // $FF: renamed from: a () android.content.res.Resources
    private Resources method_1316() {
        if (this.field_1194 == null) {
            if (this.field_1193 == null) {
                this.field_1194 = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.field_1194 = this.createConfigurationContext(this.field_1193).getResources();
            }
        }

        return this.field_1194;
    }

    // $FF: renamed from: b () void
    private void method_1317() {
        boolean var1;
        if (this.field_1191 == null) {
            var1 = true;
        } else {
            var1 = false;
        }

        if (var1) {
            this.field_1191 = this.getResources().newTheme();
            Theme var2 = this.getBaseContext().getTheme();
            if (var2 != null) {
                this.field_1191.setTo(var2);
            }
        }

        this.method_1318(this.field_1191, this.field_1190, var1);
    }

    // $FF: renamed from: a (android.content.res.Resources.Theme, int, boolean) void
    protected void method_1318(Theme var1, int var2, boolean var3) {
        var1.applyStyle(var2, true);
    }

    protected void attachBaseContext(Context var1) {
        super.attachBaseContext(var1);
    }

    public AssetManager getAssets() {
        return this.getResources().getAssets();
    }

    public Resources getResources() {
        return this.method_1316();
    }

    public Object getSystemService(String var1) {
        Object var2;
        if ("layout_inflater".equals(var1)) {
            if (this.field_1192 == null) {
                this.field_1192 = LayoutInflater.from(this.getBaseContext()).cloneInContext(this);
            }

            var2 = this.field_1192;
        } else {
            var2 = this.getBaseContext().getSystemService(var1);
        }

        return var2;
    }

    public Theme getTheme() {
        Theme var1;
        if (this.field_1191 != null) {
            var1 = this.field_1191;
        } else {
            if (this.field_1190 == 0) {
                this.field_1190 = a$i.Theme_AppCompat_Light;
            }

            this.method_1317();
            var1 = this.field_1191;
        }

        return var1;
    }

    public void setTheme(int var1) {
        if (this.field_1190 != var1) {
            this.field_1190 = var1;
            this.method_1317();
        }

    }
}
