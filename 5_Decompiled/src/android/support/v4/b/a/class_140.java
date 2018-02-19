package android.support.v4.b.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

// $FF: renamed from: android.support.v4.b.a.c
public class class_140 {
    // $FF: renamed from: a (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, float) float
    public static float method_1182(TypedArray var0, XmlPullParser var1, String var2, int var3, float var4) {
        if (method_1187(var1, var2)) {
            var4 = var0.getFloat(var3, var4);
        }

        return var4;
    }

    // $FF: renamed from: a (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int) int
    public static int method_1183(TypedArray var0, XmlPullParser var1, String var2, int var3, int var4) {
        if (method_1187(var1, var2)) {
            var4 = var0.getInt(var3, var4);
        }

        return var4;
    }

    // $FF: renamed from: a (android.content.res.Resources, android.content.res.Resources.Theme, android.util.AttributeSet, int[]) android.content.res.TypedArray
    public static TypedArray method_1184(Resources var0, Theme var1, AttributeSet var2, int[] var3) {
        TypedArray var4;
        if (var1 == null) {
            var4 = var0.obtainAttributes(var2, var3);
        } else {
            var4 = var1.obtainStyledAttributes(var2, var3, 0, 0);
        }

        return var4;
    }

    // $FF: renamed from: a (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int) java.lang.String
    public static String method_1185(TypedArray var0, XmlPullParser var1, String var2, int var3) {
        String var4;
        if (!method_1187(var1, var2)) {
            var4 = null;
        } else {
            var4 = var0.getString(var3);
        }

        return var4;
    }

    // $FF: renamed from: a (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, boolean) boolean
    public static boolean method_1186(TypedArray var0, XmlPullParser var1, String var2, int var3, boolean var4) {
        if (method_1187(var1, var2)) {
            var4 = var0.getBoolean(var3, var4);
        }

        return var4;
    }

    // $FF: renamed from: a (org.xmlpull.v1.XmlPullParser, java.lang.String) boolean
    public static boolean method_1187(XmlPullParser var0, String var1) {
        boolean var2;
        if (var0.getAttributeValue("http://schemas.android.com/apk/res/android", var1) != null) {
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    // $FF: renamed from: b (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int) int
    public static int method_1188(TypedArray var0, XmlPullParser var1, String var2, int var3, int var4) {
        if (method_1187(var1, var2)) {
            var4 = var0.getColor(var3, var4);
        }

        return var4;
    }

    // $FF: renamed from: b (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int) android.util.TypedValue
    public static TypedValue method_1189(TypedArray var0, XmlPullParser var1, String var2, int var3) {
        TypedValue var4;
        if (!method_1187(var1, var2)) {
            var4 = null;
        } else {
            var4 = var0.peekValue(var3);
        }

        return var4;
    }

    // $FF: renamed from: c (android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int) int
    public static int method_1190(TypedArray var0, XmlPullParser var1, String var2, int var3, int var4) {
        if (method_1187(var1, var2)) {
            var4 = var0.getResourceId(var3, var4);
        }

        return var4;
    }
}
