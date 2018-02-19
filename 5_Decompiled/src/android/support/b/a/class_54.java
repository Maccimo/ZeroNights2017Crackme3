package android.support.b.a;

import android.animation.TypeEvaluator;

// $FF: renamed from: android.support.b.a.f
public class class_54 implements TypeEvaluator {
    // $FF: renamed from: a android.support.b.a.f
    private static final class_54 field_528 = new class_54();

    // $FF: renamed from: a () android.support.b.a.f
    public static class_54 method_553() {
        return field_528;
    }

    public Object evaluate(float var1, Object var2, Object var3) {
        int var12 = (Integer)var2;
        float var5 = (float)(var12 >> 24 & 255) / 255.0F;
        float var9 = (float)(var12 >> 16 & 255) / 255.0F;
        float var6 = (float)(var12 >> 8 & 255) / 255.0F;
        float var7 = (float)(var12 & 255) / 255.0F;
        var12 = (Integer)var3;
        float var4 = (float)(var12 >> 24 & 255) / 255.0F;
        float var11 = (float)(var12 >> 16 & 255) / 255.0F;
        float var10 = (float)(var12 >> 8 & 255) / 255.0F;
        float var8 = (float)(var12 & 255) / 255.0F;
        var9 = (float)Math.pow((double)var9, 2.2D);
        var6 = (float)Math.pow((double)var6, 2.2D);
        var7 = (float)Math.pow((double)var7, 2.2D);
        var11 = (float)Math.pow((double)var11, 2.2D);
        var10 = (float)Math.pow((double)var10, 2.2D);
        var8 = (float)Math.pow((double)var8, 2.2D);
        var9 = (float)Math.pow((double)(var9 + (var11 - var9) * var1), 0.45454545454545453D);
        var6 = (float)Math.pow((double)(var6 + (var10 - var6) * var1), 0.45454545454545453D);
        var7 = (float)Math.pow((double)(var7 + (var8 - var7) * var1), 0.45454545454545453D);
        int var13 = Math.round((var5 + (var4 - var5) * var1) * 255.0F);
        int var14 = Math.round(var9 * 255.0F);
        var12 = Math.round(var6 * 255.0F);
        return Math.round(var7 * 255.0F) | var13 << 24 | var14 << 16 | var12 << 8;
    }
}
