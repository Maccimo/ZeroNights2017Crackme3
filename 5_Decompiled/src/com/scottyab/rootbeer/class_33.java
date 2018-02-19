package com.scottyab.rootbeer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import com.scottyab.rootbeer.a.class_120;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// $FF: renamed from: com.scottyab.rootbeer.b
public class class_33 {
    // $FF: renamed from: a android.content.Context
    private final Context field_253;
    // $FF: renamed from: b boolean
    private boolean field_254 = true;

    public class_33(Context var1) {
        this.field_253 = var1;
    }

    // $FF: renamed from: a (java.util.List) boolean
    private boolean method_347(List var1) {
        PackageManager var3 = this.field_253.getPackageManager();
        Iterator var7 = var1.iterator();
        boolean var2 = false;

        while(var7.hasNext()) {
            String var5 = (String)var7.next();

            try {
                var3.getPackageInfo(var5, 0);
                StringBuilder var4 = new StringBuilder();
                class_120.method_1023(var4.append(var5).append(" ROOT management app detected!").toString());
            } catch (NameNotFoundException var6) {
                continue;
            }

            var2 = true;
        }

        return var2;
    }

    // $FF: renamed from: j () java.lang.String[]
    private String[] method_348() {
        InputStream var1;
        try {
            var1 = Runtime.getRuntime().exec("getprop").getInputStream();
        } catch (IOException var4) {
            var4.printStackTrace();
            var1 = null;
        }

        String var5;
        try {
            Scanner var2 = new Scanner(var1);
            var5 = var2.useDelimiter("\\A").next();
        } catch (NoSuchElementException var3) {
            class_120.method_1024("Error getprop, NoSuchElementException: " + var3.getMessage(), var3);
            var5 = "";
        }

        return var5.split("\n");
    }

    // $FF: renamed from: k () java.lang.String[]
    private String[] method_349() {
        String var2 = null;

        InputStream var1;
        try {
            var1 = Runtime.getRuntime().exec("mount").getInputStream();
        } catch (IOException var5) {
            var5.printStackTrace();
            var1 = null;
        }

        String[] var6;
        if (var1 == null) {
            var6 = var2;
        } else {
            var2 = "";

            String var7;
            try {
                Scanner var3 = new Scanner(var1);
                var7 = var3.useDelimiter("\\A").next();
            } catch (NoSuchElementException var4) {
                var4.printStackTrace();
                var7 = var2;
            }

            var6 = var7.split("\n");
        }

        return var6;
    }

    // $FF: renamed from: a () boolean
    public boolean method_350() {
        boolean var1;
        if (!this.method_355() && !this.method_356() && !this.method_351("su") && !this.method_351("busybox") && !this.method_357() && !this.method_358() && !this.method_353() && !this.method_359() && !this.method_361()) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    // $FF: renamed from: a (java.lang.String) boolean
    public boolean method_351(String var1) {
        boolean var4 = false;
        String[] var5 = class_32.field_251;
        int var3 = var5.length;

        for(int var2 = 0; var2 < var3; ++var2) {
            String var6 = var5[var2];
            var6 = var6 + var1;
            if ((new File(var6)).exists()) {
                class_120.method_1028(var6 + " binary detected!");
                var4 = true;
            }
        }

        return var4;
    }

    // $FF: renamed from: a (java.lang.String[]) boolean
    public boolean method_352(String[] var1) {
        ArrayList var2 = new ArrayList();
        var2.addAll(Arrays.asList(class_32.field_248));
        if (var1 != null && var1.length > 0) {
            var2.addAll(Arrays.asList(var1));
        }

        return this.method_347(var2);
    }

    // $FF: renamed from: b () boolean
    public boolean method_353() {
        String var2 = Build.TAGS;
        boolean var1;
        if (var2 != null && var2.contains("test-keys")) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: b (java.lang.String[]) boolean
    public boolean method_354(String[] var1) {
        ArrayList var2 = new ArrayList();
        var2.addAll(Arrays.asList(class_32.field_249));
        if (var1 != null && var1.length > 0) {
            var2.addAll(Arrays.asList(var1));
        }

        return this.method_347(var2);
    }

    // $FF: renamed from: c () boolean
    public boolean method_355() {
        return this.method_352((String[])null);
    }

    // $FF: renamed from: d () boolean
    public boolean method_356() {
        return this.method_354((String[])null);
    }

    // $FF: renamed from: e () boolean
    public boolean method_357() {
        boolean var3 = false;
        HashMap var8 = new HashMap();
        var8.put("ro.debuggable", "1");
        var8.put("ro.secure", "0");
        String[] var5 = this.method_348();
        int var2 = var5.length;

        for(int var1 = 0; var1 < var2; ++var1) {
            String var4 = var5[var1];
            Iterator var6 = var8.keySet().iterator();

            while(var6.hasNext()) {
                String var7 = (String)var6.next();
                if (var4.contains(var7)) {
                    String var9 = (String)var8.get(var7);
                    var9 = "[" + var9 + "]";
                    if (var4.contains(var9)) {
                        class_120.method_1028(var7 + " = " + var9 + " detected!");
                        var3 = true;
                    }
                }
            }
        }

        return var3;
    }

    // $FF: renamed from: f () boolean
    public boolean method_358() {
        String[] var11 = this.method_349();
        int var4 = var11.length;
        boolean var7 = false;

        boolean var8;
        for(int var1 = 0; var1 < var4; var7 = var8) {
            String var10 = var11[var1];
            String[] var12 = var10.split(" ");
            if (var12.length < 4) {
                class_120.method_1023("Error formatting mount line: " + var10);
                var8 = var7;
            } else {
                String var9 = var12[1];
                String var15 = var12[3];
                String[] var13 = class_32.field_252;
                int var5 = var13.length;
                int var2 = 0;

                while(true) {
                    var8 = var7;
                    if (var2 >= var5) {
                        break;
                    }

                    String var14 = var13[var2];
                    var8 = var7;
                    if (var9.equalsIgnoreCase(var14)) {
                        var12 = var15.split(",");
                        int var6 = var12.length;
                        int var3 = 0;

                        while(true) {
                            var8 = var7;
                            if (var3 >= var6) {
                                break;
                            }

                            if (var12[var3].equalsIgnoreCase("rw")) {
                                class_120.method_1028(var14 + " path is mounted with rw permissions! " + var10);
                                var8 = true;
                                break;
                            }

                            ++var3;
                        }
                    }

                    ++var2;
                    var7 = var8;
                }
            }

            ++var1;
        }

        return var7;
    }

    // $FF: renamed from: g () boolean
    public boolean method_359() {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: h () boolean
    public boolean method_360() {
        return (new RootBeerNative()).method_1031();
    }

    // $FF: renamed from: i () boolean
    public boolean method_361() {
        boolean var2 = false;
        if (!this.method_360()) {
            class_120.method_1023("We could not load the native library to test for root");
        } else {
            String[] var4 = new String[class_32.field_251.length];

            for(int var1 = 0; var1 < var4.length; ++var1) {
                var4[var1] = class_32.field_251[var1] + "su";
            }

            RootBeerNative var3 = new RootBeerNative();
            var3.setLogDebugMessages(this.field_254);
            if (var3.checkForRoot(var4) > 0) {
                var2 = true;
            }
        }

        return var2;
    }
}
