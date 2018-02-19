package android.support.v4.h;

import android.view.View;
import java.lang.ref.WeakReference;

// $FF: renamed from: android.support.v4.h.p
public final class class_148 {
    // $FF: renamed from: a java.lang.ref.WeakReference
    private WeakReference field_1123;

    // $FF: renamed from: a () void
    public void method_1253() {
        View var1 = (View)this.field_1123.get();
        if (var1 != null) {
            var1.animate().cancel();
        }

    }
}
