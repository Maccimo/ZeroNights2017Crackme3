package android.support.v4.f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.b.a.class_138;
import android.support.v4.c.class_86;
import android.support.v4.c.class_88;
import android.support.v4.g.class_133;
import android.support.v4.g.class_68;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// $FF: renamed from: android.support.v4.f.b
public class class_115 {
    // $FF: renamed from: a android.support.v4.g.d
    private static final class_68 field_994 = new class_68(16);
    // $FF: renamed from: b android.support.v4.f.c
    private static final class_114 field_995 = new class_114("fonts", 10, 10000);
    // $FF: renamed from: c java.lang.Object
    private static final Object field_996 = new Object();
    // $FF: renamed from: d android.support.v4.g.g
    private static final class_133 field_997 = new class_133();
    // $FF: renamed from: e java.util.Comparator
    private static final Comparator field_998 = new Comparator() {
        // $FF: renamed from: a (byte[], byte[]) int
        public int method_1170(byte[] var1, byte[] var2) {
            byte var5 = 0;
            int var3;
            if (var1.length != var2.length) {
                var3 = var1.length - var2.length;
            } else {
                int var4 = 0;

                while(true) {
                    var3 = var5;
                    if (var4 >= var1.length) {
                        break;
                    }

                    if (var1[var4] != var2[var4]) {
                        var3 = var1[var4] - var2[var4];
                        break;
                    }

                    ++var4;
                }
            }

            return var3;
        }

        // $FF: synthetic method
        public int compare(Object var1, Object var2) {
            return this.method_1170((byte[])var1, (byte[])var2);
        }
    };

    // $FF: renamed from: a (android.content.pm.PackageManager, android.support.v4.f.a, android.content.res.Resources) android.content.pm.ProviderInfo
    public static ProviderInfo method_1007(PackageManager var0, class_113 var1, Resources var2) {
        String var5 = var1.method_989();
        ProviderInfo var4 = var0.resolveContentProvider(var5, 0);
        if (var4 == null) {
            throw new NameNotFoundException("No package found for authority: " + var5);
        } else if (!var4.packageName.equals(var1.method_990())) {
            throw new NameNotFoundException("Found content provider " + var5 + ", but package was not " + var1.method_990());
        } else {
            List var6 = method_1013(var0.getPackageInfo(var4.packageName, 64).signatures);
            Collections.sort(var6, field_998);
            List var8 = method_1012(var1, var2);
            int var3 = 0;

            ProviderInfo var7;
            while(true) {
                if (var3 >= var8.size()) {
                    var7 = null;
                    break;
                }

                ArrayList var9 = new ArrayList((Collection)var8.get(var3));
                Collections.sort(var9, field_998);
                if (method_1015(var6, var9)) {
                    var7 = var4;
                    break;
                }

                ++var3;
            }

            return var7;
        }
    }

    // $FF: renamed from: a (android.content.Context, android.support.v4.f.a, int) android.graphics.Typeface
    // $FF: synthetic method
    static Typeface method_1008(Context var0, class_113 var1, int var2) {
        return method_1017(var0, var1, var2);
    }

    // $FF: renamed from: a (android.content.Context, android.support.v4.f.a, android.widget.TextView, int, int, int) android.graphics.Typeface
    public static Typeface method_1009(Context param0, class_113 param1, TextView param2, int param3, int param4, int param5) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.content.Context, android.os.CancellationSignal, android.support.v4.f.a) android.support.v4.f.b$a
    public static b$a method_1010(Context var0, CancellationSignal var1, class_113 var2) {
        ProviderInfo var3 = method_1007(var0.getPackageManager(), var2, var0.getResources());
        b$a var4;
        if (var3 == null) {
            var4 = new b$a(1, (b$b[])null);
        } else {
            var4 = new b$a(0, method_1016(var0, var2, var3.authority, var1));
        }

        return var4;
    }

    // $FF: renamed from: a () android.support.v4.g.d
    // $FF: synthetic method
    static class_68 method_1011() {
        return field_994;
    }

    // $FF: renamed from: a (android.support.v4.f.a, android.content.res.Resources) java.util.List
    private static List method_1012(class_113 var0, Resources var1) {
        List var2;
        if (var0.method_992() != null) {
            var2 = var0.method_992();
        } else {
            var2 = class_138.method_1172(var1, var0.method_993());
        }

        return var2;
    }

    // $FF: renamed from: a (android.content.pm.Signature[]) java.util.List
    private static List method_1013(Signature[] var0) {
        ArrayList var2 = new ArrayList();

        for(int var1 = 0; var1 < var0.length; ++var1) {
            var2.add(var0[var1].toByteArray());
        }

        return var2;
    }

    // $FF: renamed from: a (android.content.Context, android.support.v4.f.b$b[], android.os.CancellationSignal) java.util.Map
    public static Map method_1014(Context var0, b$b[] var1, CancellationSignal var2) {
        HashMap var5 = new HashMap();
        int var4 = var1.length;

        for(int var3 = 0; var3 < var4; ++var3) {
            b$b var6 = var1[var3];
            if (var6.method_1054() == 0) {
                Uri var7 = var6.method_1050();
                if (!var5.containsKey(var7)) {
                    var5.put(var7, class_88.method_813(var0, var2, var7));
                }
            }
        }

        return Collections.unmodifiableMap(var5);
    }

    // $FF: renamed from: a (java.util.List, java.util.List) boolean
    private static boolean method_1015(List var0, List var1) {
        boolean var3;
        if (var0.size() != var1.size()) {
            var3 = false;
        } else {
            int var2 = 0;

            while(true) {
                if (var2 >= var0.size()) {
                    var3 = true;
                    break;
                }

                if (!Arrays.equals((byte[])var0.get(var2), (byte[])var1.get(var2))) {
                    var3 = false;
                    break;
                }

                ++var2;
            }
        }

        return var3;
    }

    // $FF: renamed from: a (android.content.Context, android.support.v4.f.a, java.lang.String, android.os.CancellationSignal) android.support.v4.f.b$b[]
    static b$b[] method_1016(Context param0, class_113 param1, String param2, CancellationSignal param3) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: b (android.content.Context, android.support.v4.f.a, int) android.graphics.Typeface
    private static Typeface method_1017(Context var0, class_113 var1, int var2) {
        Object var3 = null;

        b$a var4;
        Typeface var6;
        try {
            var4 = method_1010(var0, (CancellationSignal)null, var1);
        } catch (NameNotFoundException var5) {
            var6 = (Typeface)var3;
            return var6;
        }

        var6 = (Typeface)var3;
        if (var4.method_1048() == 0) {
            var6 = class_86.method_797(var0, (CancellationSignal)null, var4.method_1049(), var2);
        }

        return var6;
    }

    // $FF: renamed from: b () java.lang.Object
    // $FF: synthetic method
    static Object method_1018() {
        return field_996;
    }

    // $FF: renamed from: c () android.support.v4.g.g
    // $FF: synthetic method
    static class_133 method_1019() {
        return field_997;
    }
}
