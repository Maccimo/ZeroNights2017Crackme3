package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.a.a$d;
import android.support.v7.a.a$g;
import android.support.v7.widget.class_28;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

// $FF: renamed from: android.support.v7.view.menu.r
final class class_166 extends class_164 implements class_23, OnKeyListener, OnItemClickListener, OnDismissListener {
    // $FF: renamed from: a android.support.v7.widget.aa
    final class_28 field_1257;
    // $FF: renamed from: b android.view.View
    View field_1258;
    // $FF: renamed from: c android.content.Context
    private final Context field_1259;
    // $FF: renamed from: d android.support.v7.view.menu.g
    private final class_162 field_1260;
    // $FF: renamed from: e android.support.v7.view.menu.f
    private final class_167 field_1261;
    // $FF: renamed from: f boolean
    private final boolean field_1262;
    // $FF: renamed from: g int
    private final int field_1263;
    // $FF: renamed from: h int
    private final int field_1264;
    // $FF: renamed from: i int
    private final int field_1265;
    // $FF: renamed from: j android.view.ViewTreeObserver.OnGlobalLayoutListener
    private final OnGlobalLayoutListener field_1266 = new OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (class_166.this.method_149() && !class_166.this.field_1257.g()) {
                View var1 = class_166.this.field_1258;
                if (var1 != null && var1.isShown()) {
                    class_166.this.field_1257.a();
                } else {
                    class_166.this.method_148();
                }
            }

        }
    };
    // $FF: renamed from: k android.view.View.OnAttachStateChangeListener
    private final OnAttachStateChangeListener field_1267 = new OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View var1) {
        }

        public void onViewDetachedFromWindow(View var1) {
            if (class_166.this.field_1271 != null) {
                if (!class_166.this.field_1271.isAlive()) {
                    class_166.this.field_1271 = var1.getViewTreeObserver();
                }

                class_166.this.field_1271.removeGlobalOnLayoutListener(class_166.this.field_1266);
            }

            var1.removeOnAttachStateChangeListener(this);
        }
    };
    // $FF: renamed from: l android.widget.PopupWindow.OnDismissListener
    private OnDismissListener field_1268;
    // $FF: renamed from: m android.view.View
    private View field_1269;
    // $FF: renamed from: n android.support.v7.view.menu.m$a
    private m$a field_1270;
    // $FF: renamed from: o android.view.ViewTreeObserver
    private ViewTreeObserver field_1271;
    // $FF: renamed from: p boolean
    private boolean field_1272;
    // $FF: renamed from: q boolean
    private boolean field_1273;
    // $FF: renamed from: r int
    private int field_1274;
    // $FF: renamed from: s int
    private int field_1275 = 0;
    // $FF: renamed from: t boolean
    private boolean field_1276;

    public class_166(Context var1, class_162 var2, View var3, int var4, int var5, boolean var6) {
        this.field_1259 = var1;
        this.field_1260 = var2;
        this.field_1262 = var6;
        this.field_1261 = new class_167(var2, LayoutInflater.from(var1), this.field_1262);
        this.field_1264 = var4;
        this.field_1265 = var5;
        Resources var7 = var1.getResources();
        this.field_1263 = Math.max(var7.getDisplayMetrics().widthPixels / 2, var7.getDimensionPixelSize(a$d.abc_config_prefDialogWidth));
        this.field_1269 = var3;
        this.field_1257 = new class_28(this.field_1259, (AttributeSet)null, this.field_1264, this.field_1265);
        var2.method_1351(this, var1);
    }

    // $FF: renamed from: h () boolean
    private boolean method_1408() {
        boolean var2;
        if (this.method_149()) {
            var2 = true;
        } else if (!this.field_1272 && this.field_1269 != null) {
            this.field_1258 = this.field_1269;
            this.field_1257.a(this);
            this.field_1257.a(this);
            this.field_1257.a(true);
            View var3 = this.field_1258;
            boolean var1;
            if (this.field_1271 == null) {
                var1 = true;
            } else {
                var1 = false;
            }

            this.field_1271 = var3.getViewTreeObserver();
            if (var1) {
                this.field_1271.addOnGlobalLayoutListener(this.field_1266);
            }

            var3.addOnAttachStateChangeListener(this.field_1267);
            this.field_1257.b(var3);
            this.field_1257.e(this.field_1275);
            if (!this.field_1273) {
                this.field_1274 = a(this.field_1261, (ViewGroup)null, this.field_1259, this.field_1263);
                this.field_1273 = true;
            }

            this.field_1257.g(this.field_1274);
            this.field_1257.h(2);
            this.field_1257.a(this.g());
            this.field_1257.a();
            ListView var6 = this.field_1257.e();
            var6.setOnKeyListener(this);
            if (this.field_1276 && this.field_1260.method_1376() != null) {
                FrameLayout var5 = (FrameLayout)LayoutInflater.from(this.field_1259).inflate(a$g.abc_popup_menu_header_item_layout, var6, false);
                TextView var4 = (TextView)var5.findViewById(16908310);
                if (var4 != null) {
                    var4.setText(this.field_1260.method_1376());
                }

                var5.setEnabled(false);
                var6.addHeaderView(var5, (Object)null, false);
            }

            this.field_1257.a(this.field_1261);
            this.field_1257.a();
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    // $FF: renamed from: a () void
    public void method_147() {
        if (!this.method_1408()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    // $FF: renamed from: a (int) void
    public void method_1384(int var1) {
        this.field_1275 = var1;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g) void
    public void method_1386(class_162 var1) {
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g, boolean) void
    public void method_140(class_162 var1, boolean var2) {
        if (var1 == this.field_1260) {
            this.method_148();
            if (this.field_1270 != null) {
                this.field_1270.method_128(var1, var2);
            }
        }

    }

    // $FF: renamed from: a (android.support.v7.view.menu.m$a) void
    public void method_141(m$a var1) {
        this.field_1270 = var1;
    }

    // $FF: renamed from: a (android.view.View) void
    public void method_1387(View var1) {
        this.field_1269 = var1;
    }

    // $FF: renamed from: a (android.widget.PopupWindow.OnDismissListener) void
    public void method_1388(OnDismissListener var1) {
        this.field_1268 = var1;
    }

    // $FF: renamed from: a (boolean) void
    public void method_1389(boolean var1) {
        this.field_1261.method_1416(var1);
    }

    // $FF: renamed from: a (android.support.v7.view.menu.s) boolean
    public boolean method_143(class_163 var1) {
        boolean var2;
        if (var1.hasVisibleItems()) {
            class_121 var3 = new class_121(this.field_1259, var1, this.field_1258, this.field_1262, this.field_1264, this.field_1265);
            var3.method_1038(this.field_1270);
            var3.method_1041(class_164.method_1383(var1));
            var3.method_1037(this.field_1275);
            var3.method_1040(this.field_1268);
            this.field_1268 = null;
            this.field_1260.method_1354(false);
            if (var3.method_1042(this.field_1257.j(), this.field_1257.k())) {
                if (this.field_1270 != null) {
                    this.field_1270.method_129(var1);
                }

                var2 = true;
                return var2;
            }
        }

        var2 = false;
        return var2;
    }

    // $FF: renamed from: b (int) void
    public void method_1390(int var1) {
        this.field_1257.c(var1);
    }

    // $FF: renamed from: b (boolean) void
    public void method_144(boolean var1) {
        this.field_1273 = false;
        if (this.field_1261 != null) {
            this.field_1261.notifyDataSetChanged();
        }

    }

    // $FF: renamed from: b () boolean
    public boolean method_145() {
        return false;
    }

    // $FF: renamed from: c () void
    public void method_148() {
        if (this.method_149()) {
            this.field_1257.c();
        }

    }

    // $FF: renamed from: c (int) void
    public void method_1391(int var1) {
        this.field_1257.d(var1);
    }

    // $FF: renamed from: c (boolean) void
    public void method_1392(boolean var1) {
        this.field_1276 = var1;
    }

    // $FF: renamed from: d () boolean
    public boolean method_149() {
        boolean var1;
        if (!this.field_1272 && this.field_1257.d()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: e () android.widget.ListView
    public ListView method_150() {
        return this.field_1257.e();
    }

    public void onDismiss() {
        this.field_1272 = true;
        this.field_1260.close();
        if (this.field_1271 != null) {
            if (!this.field_1271.isAlive()) {
                this.field_1271 = this.field_1258.getViewTreeObserver();
            }

            this.field_1271.removeGlobalOnLayoutListener(this.field_1266);
            this.field_1271 = null;
        }

        this.field_1258.removeOnAttachStateChangeListener(this.field_1267);
        if (this.field_1268 != null) {
            this.field_1268.onDismiss();
        }

    }

    public boolean onKey(View var1, int var2, KeyEvent var3) {
        boolean var4 = true;
        if (var3.getAction() == 1 && var2 == 82) {
            this.method_148();
        } else {
            var4 = false;
        }

        return var4;
    }
}
