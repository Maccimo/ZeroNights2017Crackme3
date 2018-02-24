package com.kaspersky.zeronights2017.nightwatcher;

// $FF: renamed from: com.kaspersky.zeronights2017.nightwatcher.﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿
class CustomBase64 {

    public static final String ALPHABET = "ABCDEFGHIJKLONMPQRSTVUWXYZabcdefghijlkmnopqrstuvwxyz5193406782+/";

    // $FF: renamed from: ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿ (byte[]) java.lang.String
    public static String encode(byte[] var0) {
        char[] var6 = ALPHABET.toCharArray();
        StringBuilder var7 = new StringBuilder();
        int var1 = class_44.field_368;

        int var2;
        for(int var3 = class_44.field_368; var3 < var0.length; var3 += class_44.field_372) {
            var2 = (var0[var3] & class_44.field_386) << class_44.field_377 & class_44.field_390;
            if (class_44.field_370 + var3 < var0.length) {
                var2 |= (var0[class_44.field_370 + var3] & class_44.field_386) << class_44.field_375;
            } else {
                ++var1;
            }

            if (class_44.field_371 + var3 < var0.length) {
                var2 |= var0[class_44.field_371 + var3] & class_44.field_386;
            } else {
                ++var1;
            }

            int var5 = class_44.field_368;
            int var4 = var2;

            for(var2 = var5; var2 < class_44.field_373 - var1; ++var2) {
                var7.append(var6[(class_44.field_389 & var4) >> class_44.field_378]);
                var4 <<= class_44.field_374;
            }
        }

        for(var2 = class_44.field_368; var2 < var1; ++var2) {
            var7.append("=");
        }

        return var7.toString();
    }

}
