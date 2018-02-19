package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.widget.class_97;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public final class ExpandedMenuView extends ListView implements g$b, class_24, OnItemClickListener {
    // $FF: renamed from: a int[]
    private static final int[] field_208 = new int[]{16842964, 16843049};
    // $FF: renamed from: b android.support.v7.view.menu.g
    private class_162 field_209;
    // $FF: renamed from: c int
    private int field_210;

    public ExpandedMenuView(Context var1, AttributeSet var2) {
        this(var1, var2, 16842868);
    }

    public ExpandedMenuView(Context var1, AttributeSet var2, int var3) {
        super(var1, var2);
        this.setOnItemClickListener(this);
        class_97 var4 = class_97.method_867(var1, var2, field_208, var3, 0);
        if (var4.method_883(0)) {
            this.setBackgroundDrawable(var4.method_871(0));
        }

        if (var4.method_883(1)) {
            this.setDivider(var4.method_871(1));
        }

        var4.method_872();
    }

    // $FF: renamed from: a (android.support.v7.view.menu.h) boolean
    public boolean method_117(class_168 var1) {
        return this.field_209.method_1357(var1, 0);
    }

    public int getWindowAnimations() {
        return this.field_210;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
        this.method_117((class_168)this.getAdapter().getItem(var3));
    }
}
