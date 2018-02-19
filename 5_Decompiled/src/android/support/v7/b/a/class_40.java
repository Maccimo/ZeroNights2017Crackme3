package android.support.v7.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Color;
import android.support.v4.c.class_81;
import android.support.v7.a.a$a;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// $FF: renamed from: android.support.v7.b.a.a
final class class_40 {
    // $FF: renamed from: a (int, float) int
    private static int method_386(int var0, float var1) {
        return class_81.method_778(var0, Math.round((float)Color.alpha(var0) * var1));
    }

    // $FF: renamed from: a (android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources.Theme) android.content.res.ColorStateList
    public static ColorStateList method_387(Resources var0, XmlPullParser var1, Theme var2) {
        AttributeSet var4 = Xml.asAttributeSet(var1);

        int var3;
        do {
            var3 = var1.next();
        } while(var3 != 2 && var3 != 1);

        if (var3 != 2) {
            throw new XmlPullParserException("No start tag found");
        } else {
            return method_388(var0, var1, var4, var2);
        }
    }

    // $FF: renamed from: a (android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources.Theme) android.content.res.ColorStateList
    private static ColorStateList method_388(Resources var0, XmlPullParser var1, AttributeSet var2, Theme var3) {
        String var4 = var1.getName();
        if (!var4.equals("selector")) {
            throw new XmlPullParserException(var1.getPositionDescription() + ": invalid color state list tag " + var4);
        } else {
            return method_390(var0, var1, var2, var3);
        }
    }

    // $FF: renamed from: a (android.content.res.Resources, android.content.res.Resources.Theme, android.util.AttributeSet, int[]) android.content.res.TypedArray
    private static TypedArray method_389(Resources var0, Theme var1, AttributeSet var2, int[] var3) {
        TypedArray var4;
        if (var1 == null) {
            var4 = var0.obtainAttributes(var2, var3);
        } else {
            var4 = var1.obtainStyledAttributes(var2, var3, 0, 0);
        }

        return var4;
    }

    // $FF: renamed from: b (android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources.Theme) android.content.res.ColorStateList
    private static ColorStateList method_390(Resources var0, XmlPullParser var1, AttributeSet var2, Theme var3) {
        int var9 = var1.getDepth() + 1;
        int[][] var12 = new int[20][];
        int[] var13 = new int[var12.length];
        int var6 = 0;

        while(true) {
            int var5 = var1.next();
            if (var5 == 1) {
                break;
            }

            int var7 = var1.getDepth();
            if (var7 < var9 && var5 == 3) {
                break;
            }

            if (var5 == 2 && var7 <= var9 && var1.getName().equals("item")) {
                TypedArray var14 = method_389(var0, var3, var2, a$j.ColorStateListItem);
                int var10 = var14.getColor(a$j.ColorStateListItem_android_color, -65281);
                float var4 = 1.0F;
                if (var14.hasValue(a$j.ColorStateListItem_android_alpha)) {
                    var4 = var14.getFloat(a$j.ColorStateListItem_android_alpha, 1.0F);
                } else if (var14.hasValue(a$j.ColorStateListItem_alpha)) {
                    var4 = var14.getFloat(a$j.ColorStateListItem_alpha, 1.0F);
                }

                var14.recycle();
                var5 = 0;
                int var11 = var2.getAttributeCount();
                int[] var17 = new int[var11];

                for(var7 = 0; var7 < var11; ++var7) {
                    int var8 = var2.getAttributeNameResource(var7);
                    if (var8 != 16843173 && var8 != 16843551 && var8 != a$a.alpha) {
                        if (!var2.getAttributeBooleanValue(var7, false)) {
                            var8 = -var8;
                        }

                        var17[var5] = var8;
                        ++var5;
                    }
                }

                var17 = StateSet.trimStateSet(var17, var5);
                var5 = method_386(var10, var4);
                if (var6 != 0 && var17.length == 0) {
                    ;
                }

                var13 = class_38.method_377(var13, var6, var5);
                var12 = (int[][])class_38.method_378(var12, var6, var17);
                ++var6;
            }
        }

        int[] var15 = new int[var6];
        int[][] var16 = new int[var6][];
        System.arraycopy(var13, 0, var15, 0, var6);
        System.arraycopy(var12, 0, var16, 0, var6);
        return new ColorStateList(var16, var15);
    }
}
