package com.kaspersky.zeronights2017.nightwatcher;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// $FF: renamed from: com.kaspersky.zeronights2017.nightwatcher.﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿
class class_135 {
    // $FF: renamed from: ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿ (java.lang.String, java.lang.String) java.lang.String
    private static String method_1131(String var0, String var1) {
        int var2 = class_44.field_368;

        StringBuilder var3;
        for(var3 = new StringBuilder(class_170.field_1366); var2 < (class_44.field_382 << class_44.field_371) * class_44.field_371; var2 += class_44.field_381 >> class_44.field_373) {
            var3.append(String.valueOf(var0.charAt(var2) ^ var1.charAt(var2 % var1.length())));
        }

        return class_87.method_801(var3.toString().getBytes());
    }

    // $FF: renamed from: ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿ (java.lang.String) java.lang.String
    public static String method_1132(String var0) {
        try {
            MessageDigest var2 = MessageDigest.getInstance(class_170.field_1367);
            StringBuilder var3 = new StringBuilder(var2.digest(var0.getBytes(class_170.field_1368)).length);

            for(int var1 = 0; var1 < var2.digest(var0.getBytes(class_170.field_1368)).length; ++var1) {
                var3.append(class_170.field_1352.charAt(var2.digest(var0.getBytes(class_170.field_1368))[var1] >> class_44.field_373 & class_44.field_384)).append(class_170.field_1352.charAt(var2.digest(var0.getBytes(class_170.field_1368))[var1] & class_44.field_384));
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
        StringBuilder var3 = new StringBuilder(class_170.field_1366);

        for(int var1 = class_44.field_368; var1 < class_44.field_383 << class_44.field_371; var1 += class_44.field_380) {
            int var2 = ((var1 << class_44.field_373 | var1) << class_44.field_385 * var1) % class_44.field_388 % class_44.field_387;
            var3.append(class_170.field_1350.substring(var2, class_44.field_370 + var2));
        }

        return method_1131(var3.toString(), var0);
    }
}
