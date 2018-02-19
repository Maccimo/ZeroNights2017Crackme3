package android.support.v4.media.session;

import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;

final class e$a {
    // $FF: renamed from: a (java.lang.Object) java.lang.String
    public static String method_446(Object var0) {
        return ((CustomAction)var0).getAction();
    }

    // $FF: renamed from: b (java.lang.Object) java.lang.CharSequence
    public static CharSequence method_447(Object var0) {
        return ((CustomAction)var0).getName();
    }

    // $FF: renamed from: c (java.lang.Object) int
    public static int method_448(Object var0) {
        return ((CustomAction)var0).getIcon();
    }

    // $FF: renamed from: d (java.lang.Object) android.os.Bundle
    public static Bundle method_449(Object var0) {
        return ((CustomAction)var0).getExtras();
    }
}
