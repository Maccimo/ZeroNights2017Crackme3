package com.kaspersky.zeronights2017.nightwatcher;

// $FF: renamed from: com.kaspersky.zeronights2017.nightwatcher.﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿
class SerialValidator {
    // $FF: renamed from: ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿ () boolean
    public static boolean validateSerial() {

        String email = MainActivity.emailEditText.getText().toString();
        String serial = MainActivity.serialEditText.getText().toString().toUpperCase();
        String expectedSerial = class_135.method_1132(
            class_135.method_1133(
                CustomBase64.encode(MainActivity.SALT.getBytes()) + email
            )
        );

        return
            (serial.length() == 40) &&
            serial.equals(expectedSerial);

    }

}
