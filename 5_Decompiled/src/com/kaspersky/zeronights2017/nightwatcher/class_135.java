package com.kaspersky.zeronights2017.nightwatcher;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// $FF: renamed from: com.kaspersky.zeronights2017.nightwatcher.﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿
class class_135 {

    public static final String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam et maximus eros. Mauris laoreet molestie semper. Aliquam erat volutpat. Sed euismod neque ac ante viverra pellentesque. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras efficitur ac augue a mattis. Nunc facilisis elementum lobortis. Ut vehicula malesuada pharetra. Pellentesque a interdum eros, nec pulvinar sem. Morbi dapibus in quam ut ullamcorper. Vivamus volutpat vehicula condimentum.\n\nNullam commodo vestibulum cursus. Aliquam semper ligula ac tortor rutrum molestie. Vivamus nec orci auctor quam vehicula tempor et id neque. Suspendisse fermentum velit ut ipsum pellentesque hendrerit. Fusce convallis aliquam ante non elementum. Donec at scelerisque lacus, eu eleifend nulla. Pellentesque congue nisi in dolor dignissim, non lobortis neque luctus. Mauris ac cursus turpis. Phasellus finibus facilisis justo, convallis mattis lorem lobortis et. Nam ac interdum est. Etiam ac molestie ligula. Maecenas vel purus a odio accumsan venenatis. Nunc ligula dui, pharetra id arcu laoreet, mollis semper leo. Phasellus id magna molestie, semper risus nec, vehicula sem.\n\nDonec eget nisl purus. Phasellus non nisi felis. Aliquam ut odio sit amet neque euismod vulputate non vel mauris. Suspendisse sit amet ligula sed leo condimentum vulputate convallis eu dui. Vestibulum tortor lacus, maximus quis tincidunt a, pretium sed lacus. Maecenas porta dui nisi, vel molestie tortor luctus at. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam odio ante, sollicitudin sed diam quis, ultricies pretium ex. Proin nisi arcu, tristique id leo et, lacinia semper nisi. Fusce posuere lacus at ex pretium venenatis. Sed porta nibh mauris, ut vestibulum nulla aliquam non. Nunc id tortor non nisi blandit volutpat. Phasellus malesuada hendrerit orci a semper. Nam a risus ac arcu dictum imperdiet.\n\nCras ut risus eget leo ultricies dictum vitae et enim. Aliquam erat volutpat. Fusce ut porttitor nisi. Praesent vel pulvinar orci. Aenean ac libero sed tortor sagittis tristique commodo in velit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nam eu enim orci. Nullam consectetur lobortis tellus, ac facilisis ex dapibus sed.\n\nAliquam mollis eget turpis id vestibulum. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque vitae lectus non metus convallis aliquam. Donec rutrum tincidunt quam, iaculis gravida nisl dictum id. Donec malesuada dapibus magna tristique convallis. Curabitur at turpis sed tellus accumsan condimentum. Nam accumsan nisi a ex hendrerit, in sagittis turpis feugiat. Morbi congue et est eu venenatis. Phasellus erat dui, rutrum sit amet fringilla sit amet, imperdiet in nulla. Quisque laoreet neque ac augue sodales, at mollis magna mollis. Mauris nec consectetur purus, quis aliquam leo. Sed lobortis magna efficitur vehicula finibus.";
    public static final String HEX_DIGITS = "0123456789ABCDEF";

    // $FF: renamed from: ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿ (java.lang.String, java.lang.String) java.lang.String
    private static String method_1131(String var0, String var1) {
        int var2 = class_44.field_368;

        StringBuilder var3;
        for(var3 = new StringBuilder(""); var2 < (class_44.field_382 << class_44.field_371) * class_44.field_371; var2 += class_44.field_381 >> class_44.field_373) {
            var3.append(String.valueOf(var0.charAt(var2) ^ var1.charAt(var2 % var1.length())));
        }

        return CustomBase64.encode(var3.toString().getBytes());
    }

    // $FF: renamed from: ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿ (java.lang.String) java.lang.String
    public static String method_1132(String var0) {
        try {
            MessageDigest var2 = MessageDigest.getInstance("SHA-1");
            StringBuilder var3 = new StringBuilder(var2.digest(var0.getBytes("UTF-8")).length);

            for(int var1 = 0; var1 < var2.digest(var0.getBytes("UTF-8")).length; ++var1) {
                var3.append(HEX_DIGITS.charAt(var2.digest(var0.getBytes("UTF-8"))[var1] >> class_44.field_373 & class_44.field_384)).append(HEX_DIGITS.charAt(var2.digest(var0.getBytes("UTF-8"))[var1] & class_44.field_384));
            }

            var0 = var3.toString();
            return var0;
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException var4) {
            var4.printStackTrace();
            return null;
        }
    }

    // $FF: renamed from: ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿ (java.lang.String) java.lang.String
    public static String method_1133(String var0) {
        StringBuilder var3 = new StringBuilder("");

        for(int var1 = class_44.field_368; var1 < class_44.field_383 << class_44.field_371; var1 += class_44.field_380) {
            int var2 = ((var1 << class_44.field_373 | var1) << class_44.field_385 * var1) % class_44.field_388 % class_44.field_387;
            var3.append(LOREM_IPSUM.substring(var2, class_44.field_370 + var2));
        }

        return method_1131(var3.toString(), var0);
    }
}
