package android.support.v7.view.menu;

import android.support.v7.view.class_22;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

class i$b extends FrameLayout implements class_22 {
    // $FF: renamed from: a android.view.CollapsibleActionView
    final CollapsibleActionView field_1052;

    i$b(View var1) {
        super(var1.getContext());
        this.field_1052 = (CollapsibleActionView)var1;
        this.addView(var1);
    }

    // $FF: renamed from: a () void
    public void method_137() {
        this.field_1052.onActionViewExpanded();
    }

    // $FF: renamed from: b () void
    public void method_138() {
        this.field_1052.onActionViewCollapsed();
    }

    // $FF: renamed from: c () android.view.View
    View method_1063() {
        return (View)this.field_1052;
    }
}
