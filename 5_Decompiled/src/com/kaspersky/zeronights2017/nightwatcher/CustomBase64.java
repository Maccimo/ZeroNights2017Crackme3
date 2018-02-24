package com.kaspersky.zeronights2017.nightwatcher;

// $FF: renamed from: com.kaspersky.zeronights2017.nightwatcher.﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿
class CustomBase64 {

    public static final String ALPHABET = "ABCDEFGHIJKLONMPQRSTVUWXYZabcdefghijlkmnopqrstuvwxyz5193406782+/";

    // $FF: renamed from: ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿ (byte[]) java.lang.String
    public static String encode(byte[] var0) {
        char[] var6 = ALPHABET.toCharArray();
        StringBuilder var7 = new StringBuilder();
        int var1 = 0;

        int var2;
        for(int var3 = 0; var3 < var0.length; var3 += 3) {
            var2 = (var0[var3] & 0xff) << 16 & 0xffffff;
            if (1 + var3 < var0.length) {
                var2 |= (var0[1 + var3] & 0xff) << 8;
            } else {
                ++var1;
            }

            if (2 + var3 < var0.length) {
                var2 |= var0[2 + var3] & 0xff;
            } else {
                ++var1;
            }

            int var5 = 0;
            int var4 = var2;

            for(var2 = var5; var2 < 4 - var1; ++var2) {
                var7.append(var6[(0xfc0000 & var4) >> 18]);
                var4 <<= 6;
            }
        }

        for(var2 = 0; var2 < var1; ++var2) {
            var7.append("=");
        }

        return var7.toString();
    }

}
