package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.session.MediaController.PlaybackInfo;

public class c$c {
    // $FF: renamed from: a (android.media.AudioAttributes) int
    private static int method_1293(AudioAttributes var0) {
        byte var2 = 3;
        byte var1;
        if ((var0.getFlags() & 1) == 1) {
            var1 = 7;
        } else if ((var0.getFlags() & 4) == 4) {
            var1 = 6;
        } else {
            var1 = var2;
            switch(var0.getUsage()) {
            case 1:
            case 11:
            case 12:
            case 14:
                break;
            case 2:
                var1 = 0;
                break;
            case 3:
                var1 = 8;
                break;
            case 4:
                var1 = 4;
                break;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                var1 = 5;
                break;
            case 6:
                var1 = 2;
                break;
            case 13:
                var1 = 1;
                break;
            default:
                var1 = var2;
            }
        }

        return var1;
    }

    // $FF: renamed from: a (java.lang.Object) android.media.AudioAttributes
    public static AudioAttributes method_1294(Object var0) {
        return ((PlaybackInfo)var0).getAudioAttributes();
    }

    // $FF: renamed from: b (java.lang.Object) int
    public static int method_1295(Object var0) {
        return method_1293(method_1294(var0));
    }
}
