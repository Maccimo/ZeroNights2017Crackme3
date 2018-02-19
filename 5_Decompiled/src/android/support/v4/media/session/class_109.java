package android.support.v4.media.session;

import android.media.session.PlaybackState;
import java.util.List;

// $FF: renamed from: android.support.v4.media.session.e
class class_109 {
    // $FF: renamed from: a (java.lang.Object) int
    public static int method_958(Object var0) {
        return ((PlaybackState)var0).getState();
    }

    // $FF: renamed from: b (java.lang.Object) long
    public static long method_959(Object var0) {
        return ((PlaybackState)var0).getPosition();
    }

    // $FF: renamed from: c (java.lang.Object) long
    public static long method_960(Object var0) {
        return ((PlaybackState)var0).getBufferedPosition();
    }

    // $FF: renamed from: d (java.lang.Object) float
    public static float method_961(Object var0) {
        return ((PlaybackState)var0).getPlaybackSpeed();
    }

    // $FF: renamed from: e (java.lang.Object) long
    public static long method_962(Object var0) {
        return ((PlaybackState)var0).getActions();
    }

    // $FF: renamed from: f (java.lang.Object) java.lang.CharSequence
    public static CharSequence method_963(Object var0) {
        return ((PlaybackState)var0).getErrorMessage();
    }

    // $FF: renamed from: g (java.lang.Object) long
    public static long method_964(Object var0) {
        return ((PlaybackState)var0).getLastPositionUpdateTime();
    }

    // $FF: renamed from: h (java.lang.Object) java.util.List
    public static List method_965(Object var0) {
        return ((PlaybackState)var0).getCustomActions();
    }

    // $FF: renamed from: i (java.lang.Object) long
    public static long method_966(Object var0) {
        return ((PlaybackState)var0).getActiveQueueItemId();
    }
}
