package android.support.v4.b.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.f.class_113;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// $FF: renamed from: android.support.v4.b.a.a
public class class_138 {
    // $FF: renamed from: a (org.xmlpull.v1.XmlPullParser, android.content.res.Resources) android.support.v4.b.a.a$a
    public static a$a method_1171(XmlPullParser var0, Resources var1) {
        int var2;
        do {
            var2 = var0.next();
        } while(var2 != 2 && var2 != 1);

        if (var2 != 2) {
            throw new XmlPullParserException("No start tag found");
        } else {
            return method_1175(var0, var1);
        }
    }

    // $FF: renamed from: a (android.content.res.Resources, int) java.util.List
    public static List method_1172(Resources var0, int var1) {
        Object var3 = null;
        Object var4 = null;
        if (var1 != 0) {
            TypedArray var5 = var0.obtainTypedArray(var1);
            var3 = var4;
            if (var5.length() > 0) {
                var3 = new ArrayList();
                boolean var2;
                if (var5.getResourceId(0, 0) != 0) {
                    var2 = true;
                } else {
                    var2 = false;
                }

                if (var2) {
                    for(var1 = 0; var1 < var5.length(); ++var1) {
                        ((List)var3).add(method_1173(var0.getStringArray(var5.getResourceId(var1, 0))));
                    }
                } else {
                    ((List)var3).add(method_1173(var0.getStringArray(var1)));
                }
            }

            var5.recycle();
        }

        if (var3 == null) {
            var3 = Collections.emptyList();
        }

        return (List)var3;
    }

    // $FF: renamed from: a (java.lang.String[]) java.util.List
    private static List method_1173(String[] var0) {
        ArrayList var3 = new ArrayList();
        int var2 = var0.length;

        for(int var1 = 0; var1 < var2; ++var1) {
            var3.add(Base64.decode(var0[var1], 0));
        }

        return var3;
    }

    // $FF: renamed from: a (org.xmlpull.v1.XmlPullParser) void
    private static void method_1174(XmlPullParser var0) {
        int var1 = 1;

        while(var1 > 0) {
            switch(var0.next()) {
            case 2:
                ++var1;
                break;
            case 3:
                --var1;
            }
        }

    }

    // $FF: renamed from: b (org.xmlpull.v1.XmlPullParser, android.content.res.Resources) android.support.v4.b.a.a$a
    private static a$a method_1175(XmlPullParser var0, Resources var1) {
        Object var2 = null;
        var0.require(2, (String)null, "font-family");
        a$a var3;
        if (var0.getName().equals("font-family")) {
            var3 = method_1176(var0, var1);
        } else {
            method_1174(var0);
            var3 = (a$a)var2;
        }

        return var3;
    }

    // $FF: renamed from: c (org.xmlpull.v1.XmlPullParser, android.content.res.Resources) android.support.v4.b.a.a$a
    private static a$a method_1176(XmlPullParser var0, Resources var1) {
        TypedArray var8 = var1.obtainAttributes(Xml.asAttributeSet(var0), android.support.a.a$a.FontFamily);
        String var7 = var8.getString(android.support.a.a$a.FontFamily_fontProviderAuthority);
        String var5 = var8.getString(android.support.a.a$a.FontFamily_fontProviderPackage);
        String var6 = var8.getString(android.support.a.a$a.FontFamily_fontProviderQuery);
        int var3 = var8.getResourceId(android.support.a.a$a.FontFamily_fontProviderCerts, 0);
        int var4 = var8.getInteger(android.support.a.a$a.FontFamily_fontProviderFetchStrategy, 1);
        int var2 = var8.getInteger(android.support.a.a$a.FontFamily_fontProviderFetchTimeout, 500);
        var8.recycle();
        Object var9;
        if (var7 != null && var5 != null && var6 != null) {
            while(true) {
                if (var0.next() == 3) {
                    var9 = new a$d(new class_113(var7, var5, var6, method_1172(var1, var3)), var4, var2);
                    break;
                }

                method_1174(var0);
            }
        } else {
            ArrayList var10 = new ArrayList();

            while(var0.next() != 3) {
                if (var0.getEventType() == 2) {
                    if (var0.getName().equals("font")) {
                        var10.add(method_1177(var0, var1));
                    } else {
                        method_1174(var0);
                    }
                }
            }

            if (var10.isEmpty()) {
                var9 = null;
            } else {
                var9 = new a$b((a$c[])var10.toArray(new a$c[var10.size()]));
            }
        }

        return (a$a)var9;
    }

    // $FF: renamed from: d (org.xmlpull.v1.XmlPullParser, android.content.res.Resources) android.support.v4.b.a.a$c
    private static a$c method_1177(XmlPullParser var0, Resources var1) {
        boolean var4 = true;
        TypedArray var6 = var1.obtainAttributes(Xml.asAttributeSet(var0), android.support.a.a$a.FontFamilyFont);
        int var2 = var6.getInt(android.support.a.a$a.FontFamilyFont_fontWeight, 400);
        if (1 != var6.getInt(android.support.a.a$a.FontFamilyFont_fontStyle, 0)) {
            var4 = false;
        }

        int var3 = var6.getResourceId(android.support.a.a$a.FontFamilyFont_font, 0);
        String var5 = var6.getString(android.support.a.a$a.FontFamilyFont_font);
        var6.recycle();

        while(var0.next() != 3) {
            method_1174(var0);
        }

        return new a$c(var5, var2, var4, var3);
    }
}
