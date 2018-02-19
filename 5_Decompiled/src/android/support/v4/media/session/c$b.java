package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.os.Bundle;
import java.util.List;

class c$b extends Callback {
    // $FF: renamed from: a android.support.v4.media.session.c$a
    protected final c$a field_1171;

    public c$b(c$a var1) {
        this.field_1171 = var1;
    }

    public void onAudioInfoChanged(PlaybackInfo var1) {
        this.field_1171.method_121(var1.getPlaybackType(), c$c.method_1295(var1), var1.getVolumeControl(), var1.getMaxVolume(), var1.getCurrentVolume());
    }

    public void onExtrasChanged(Bundle var1) {
        this.field_1171.method_122(var1);
    }

    public void onMetadataChanged(MediaMetadata var1) {
        this.field_1171.method_127(var1);
    }

    public void onPlaybackStateChanged(PlaybackState var1) {
        this.field_1171.method_124(var1);
    }

    public void onQueueChanged(List var1) {
        this.field_1171.method_126(var1);
    }

    public void onQueueTitleChanged(CharSequence var1) {
        this.field_1171.method_123(var1);
    }

    public void onSessionDestroyed() {
        this.field_1171.method_120();
    }

    public void onSessionEvent(String var1, Bundle var2) {
        this.field_1171.method_125(var1, var2);
    }
}
