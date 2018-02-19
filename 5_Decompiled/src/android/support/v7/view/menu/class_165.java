package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Build.VERSION;
import android.support.v4.h.class_142;
import android.support.v4.h.class_146;
import android.support.v7.a.a$d;
import android.support.v7.a.a$g;
import android.support.v7.widget.class_28;
import android.support.v7.widget.class_8;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// $FF: renamed from: android.support.v7.view.menu.e
final class class_165 extends class_164 implements class_23, OnKeyListener, OnDismissListener {
    // $FF: renamed from: a android.os.Handler
    final Handler field_1231;
    // $FF: renamed from: b java.util.List
    final List field_1232 = new ArrayList();
    // $FF: renamed from: c android.view.View
    View field_1233;
    // $FF: renamed from: d boolean
    boolean field_1234;
    // $FF: renamed from: e android.content.Context
    private final Context field_1235;
    // $FF: renamed from: f int
    private final int field_1236;
    // $FF: renamed from: g int
    private final int field_1237;
    // $FF: renamed from: h int
    private final int field_1238;
    // $FF: renamed from: i boolean
    private final boolean field_1239;
    // $FF: renamed from: j java.util.List
    private final List field_1240 = new LinkedList();
    // $FF: renamed from: k android.view.ViewTreeObserver.OnGlobalLayoutListener
    private final OnGlobalLayoutListener field_1241 = new OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (class_165.this.method_149() && class_165.this.field_1232.size() > 0 && !((e$a)class_165.this.field_1232.get(0)).field_752.g()) {
                View var1 = class_165.this.field_1233;
                if (var1 != null && var1.isShown()) {
                    Iterator var2 = class_165.this.field_1232.iterator();

                    while(var2.hasNext()) {
                        ((e$a)var2.next()).field_752.a();
                    }
                } else {
                    class_165.this.method_148();
                }
            }

        }
    };
    // $FF: renamed from: l android.view.View.OnAttachStateChangeListener
    private final OnAttachStateChangeListener field_1242 = new OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View var1) {
        }

        public void onViewDetachedFromWindow(View var1) {
            if (class_165.this.field_1255 != null) {
                if (!class_165.this.field_1255.isAlive()) {
                    class_165.this.field_1255 = var1.getViewTreeObserver();
                }

                class_165.this.field_1255.removeGlobalOnLayoutListener(class_165.this.field_1241);
            }

            var1.removeOnAttachStateChangeListener(this);
        }
    };
    // $FF: renamed from: m android.support.v7.widget.z
    private final class_8 field_1243 = new class_8() {
        // $FF: renamed from: a (android.support.v7.view.menu.g, android.view.MenuItem) void
        public void method_29(class_162 var1, MenuItem var2) {
            class_165.this.field_1231.removeCallbacksAndMessages(var1);
        }

        // $FF: renamed from: b (android.support.v7.view.menu.g, android.view.MenuItem) void
        public void method_30(final class_162 var1, final MenuItem var2) {
            class_165.this.field_1231.removeCallbacksAndMessages((Object)null);
            int var3 = 0;
            int var4 = class_165.this.field_1232.size();

            while(true) {
                if (var3 >= var4) {
                    var3 = -1;
                    break;
                }

                if (var1 == ((e$a)class_165.this.field_1232.get(var3)).field_753) {
                    break;
                }

                ++var3;
            }

            if (var3 != -1) {
                ++var3;
                final e$a var7;
                if (var3 < class_165.this.field_1232.size()) {
                    var7 = (e$a)class_165.this.field_1232.get(var3);
                } else {
                    var7 = null;
                }

                Runnable var8 = new Runnable() {
                    public void run() {
                        if (var7 != null) {
                            class_165.this.field_1234 = true;
                            var7.field_753.method_1354(false);
                            class_165.this.field_1234 = false;
                        }

                        if (var2.isEnabled() && var2.hasSubMenu()) {
                            var1.method_1357(var2, 4);
                        }

                    }
                };
                long var5 = SystemClock.uptimeMillis();
                class_165.this.field_1231.postAtTime(var8, var1, var5 + 200L);
            }

        }
    };
    // $FF: renamed from: n int
    private int field_1244 = 0;
    // $FF: renamed from: o int
    private int field_1245 = 0;
    // $FF: renamed from: p android.view.View
    private View field_1246;
    // $FF: renamed from: q int
    private int field_1247;
    // $FF: renamed from: r boolean
    private boolean field_1248;
    // $FF: renamed from: s boolean
    private boolean field_1249;
    // $FF: renamed from: t int
    private int field_1250;
    // $FF: renamed from: u int
    private int field_1251;
    // $FF: renamed from: v boolean
    private boolean field_1252;
    // $FF: renamed from: w boolean
    private boolean field_1253;
    // $FF: renamed from: x android.support.v7.view.menu.m$a
    private m$a field_1254;
    // $FF: renamed from: y android.view.ViewTreeObserver
    private ViewTreeObserver field_1255;
    // $FF: renamed from: z android.widget.PopupWindow.OnDismissListener
    private OnDismissListener field_1256;

    public class_165(Context var1, View var2, int var3, int var4, boolean var5) {
        this.field_1235 = var1;
        this.field_1246 = var2;
        this.field_1237 = var3;
        this.field_1238 = var4;
        this.field_1239 = var5;
        this.field_1252 = false;
        this.field_1247 = this.method_1404();
        Resources var6 = var1.getResources();
        this.field_1236 = Math.max(var6.getDisplayMetrics().widthPixels / 2, var6.getDimensionPixelSize(a$d.abc_config_prefDialogWidth));
        this.field_1231 = new Handler();
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g, android.support.v7.view.menu.g) android.view.MenuItem
    private MenuItem method_1395(class_162 var1, class_162 var2) {
        int var4 = var1.size();
        int var3 = 0;

        MenuItem var6;
        while(true) {
            if (var3 >= var4) {
                var6 = null;
                break;
            }

            MenuItem var5 = var1.getItem(var3);
            if (var5.hasSubMenu() && var2 == var5.getSubMenu()) {
                var6 = var5;
                break;
            }

            ++var3;
        }

        return var6;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.e$a, android.support.v7.view.menu.g) android.view.View
    private View method_1396(e$a var1, class_162 var2) {
        int var3 = 0;
        MenuItem var10 = this.method_1395(var1.field_753, var2);
        View var7;
        if (var10 == null) {
            var7 = null;
        } else {
            ListView var6 = var1.method_821();
            ListAdapter var8 = var6.getAdapter();
            int var4;
            class_167 var11;
            if (var8 instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter var9 = (HeaderViewListAdapter)var8;
                var4 = var9.getHeadersCount();
                var11 = (class_167)var9.getWrappedAdapter();
            } else {
                var11 = (class_167)var8;
                var4 = 0;
            }

            int var5 = var11.getCount();

            while(true) {
                if (var3 >= var5) {
                    var3 = -1;
                    break;
                }

                if (var10 == var11.method_1415(var3)) {
                    break;
                }

                ++var3;
            }

            if (var3 == -1) {
                var7 = null;
            } else {
                var3 = var4 + var3 - var6.getFirstVisiblePosition();
                if (var3 >= 0 && var3 < var6.getChildCount()) {
                    var7 = var6.getChildAt(var3);
                } else {
                    var7 = null;
                }
            }
        }

        return var7;
    }

    // $FF: renamed from: c (android.support.v7.view.menu.g) void
    private void method_1400(class_162 var1) {
        LayoutInflater var9 = LayoutInflater.from(this.field_1235);
        class_167 var6 = new class_167(var1, var9, this.field_1239);
        if (!this.method_149() && this.field_1252) {
            var6.method_1416(true);
        } else if (this.method_149()) {
            var6.method_1416(class_164.method_1383(var1));
        }

        int var5 = a(var6, (ViewGroup)null, this.field_1235, this.field_1236);
        class_28 var8 = this.method_1403();
        var8.a(var6);
        var8.g(var5);
        var8.e(this.field_1245);
        View var7;
        e$a var13;
        if (this.field_1232.size() > 0) {
            var13 = (e$a)this.field_1232.get(this.field_1232.size() - 1);
            var7 = this.method_1396(var13, var1);
        } else {
            var7 = null;
            var13 = null;
        }

        if (var7 != null) {
            var8.method_203(false);
            var8.method_201((Object)null);
            int var3 = this.method_1401(var5);
            boolean var2;
            if (var3 == 1) {
                var2 = true;
            } else {
                var2 = false;
            }

            this.field_1247 = var3;
            int var4;
            if (VERSION.SDK_INT >= 26) {
                var8.b(var7);
                var4 = 0;
                var3 = 0;
            } else {
                int[] var10 = new int[2];
                this.field_1246.getLocationOnScreen(var10);
                int[] var11 = new int[2];
                var7.getLocationOnScreen(var11);
                var4 = var11[0] - var10[0];
                var3 = var11[1] - var10[1];
            }

            int var12;
            if ((this.field_1245 & 5) == 5) {
                if (var2) {
                    var12 = var4 + var5;
                } else {
                    var12 = var4 - var7.getWidth();
                }
            } else if (var2) {
                var12 = var7.getWidth() + var4;
            } else {
                var12 = var4 - var5;
            }

            var8.c(var12);
            var8.b(true);
            var8.d(var3);
        } else {
            if (this.field_1248) {
                var8.c(this.field_1250);
            }

            if (this.field_1249) {
                var8.d(this.field_1251);
            }

            var8.a(this.g());
        }

        e$a var15 = new e$a(var8, var1, this.field_1247);
        this.field_1232.add(var15);
        var8.a();
        ListView var16 = var8.e();
        var16.setOnKeyListener(this);
        if (var13 == null && this.field_1253 && var1.method_1376() != null) {
            FrameLayout var14 = (FrameLayout)var9.inflate(a$g.abc_popup_menu_header_item_layout, var16, false);
            TextView var17 = (TextView)var14.findViewById(16908310);
            var14.setEnabled(false);
            var17.setText(var1.method_1376());
            var16.addHeaderView(var14, (Object)null, false);
            var8.a();
        }

    }

    // $FF: renamed from: d (int) int
    private int method_1401(int var1) {
        ListView var3 = ((e$a)this.field_1232.get(this.field_1232.size() - 1)).method_821();
        int[] var4 = new int[2];
        var3.getLocationOnScreen(var4);
        Rect var5 = new Rect();
        this.field_1233.getWindowVisibleDisplayFrame(var5);
        byte var6;
        if (this.field_1247 == 1) {
            int var2 = var4[0];
            if (var3.getWidth() + var2 + var1 > var5.right) {
                var6 = 0;
            } else {
                var6 = 1;
            }
        } else if (var4[0] - var1 < 0) {
            var6 = 1;
        } else {
            var6 = 0;
        }

        return var6;
    }

    // $FF: renamed from: d (android.support.v7.view.menu.g) int
    private int method_1402(class_162 var1) {
        int var2 = 0;
        int var3 = this.field_1232.size();

        while(true) {
            if (var2 >= var3) {
                var2 = -1;
                break;
            }

            if (var1 == ((e$a)this.field_1232.get(var2)).field_753) {
                break;
            }

            ++var2;
        }

        return var2;
    }

    // $FF: renamed from: h () android.support.v7.widget.aa
    private class_28 method_1403() {
        class_28 var1 = new class_28(this.field_1235, (AttributeSet)null, this.field_1237, this.field_1238);
        var1.method_200(this.field_1243);
        var1.a(this);
        var1.a(this);
        var1.b(this.field_1246);
        var1.e(this.field_1245);
        var1.a(true);
        var1.h(2);
        return var1;
    }

    // $FF: renamed from: i () int
    private int method_1404() {
        byte var1 = 1;
        if (class_146.method_1222(this.field_1246) == 1) {
            var1 = 0;
        }

        return var1;
    }

    // $FF: renamed from: a () void
    public void method_147() {
        if (!this.method_149()) {
            Iterator var2 = this.field_1240.iterator();

            while(var2.hasNext()) {
                this.method_1400((class_162)var2.next());
            }

            this.field_1240.clear();
            this.field_1233 = this.field_1246;
            if (this.field_1233 != null) {
                boolean var1;
                if (this.field_1255 == null) {
                    var1 = true;
                } else {
                    var1 = false;
                }

                this.field_1255 = this.field_1233.getViewTreeObserver();
                if (var1) {
                    this.field_1255.addOnGlobalLayoutListener(this.field_1241);
                }

                this.field_1233.addOnAttachStateChangeListener(this.field_1242);
            }
        }

    }

    // $FF: renamed from: a (int) void
    public void method_1384(int var1) {
        if (this.field_1244 != var1) {
            this.field_1244 = var1;
            this.field_1245 = class_142.method_1195(var1, class_146.method_1222(this.field_1246));
        }

    }

    // $FF: renamed from: a (android.support.v7.view.menu.g) void
    public void method_1386(class_162 var1) {
        var1.method_1351(this, this.field_1235);
        if (this.method_149()) {
            this.method_1400(var1);
        } else {
            this.field_1240.add(var1);
        }

    }

    // $FF: renamed from: a (android.support.v7.view.menu.g, boolean) void
    public void method_140(class_162 var1, boolean var2) {
        int var4 = this.method_1402(var1);
        if (var4 >= 0) {
            int var3 = var4 + 1;
            if (var3 < this.field_1232.size()) {
                ((e$a)this.field_1232.get(var3)).field_753.method_1354(false);
            }

            e$a var5 = (e$a)this.field_1232.remove(var4);
            var5.field_753.method_1350(this);
            if (this.field_1234) {
                var5.field_752.method_202((Object)null);
                var5.field_752.b(0);
            }

            var5.field_752.c();
            var3 = this.field_1232.size();
            if (var3 > 0) {
                this.field_1247 = ((e$a)this.field_1232.get(var3 - 1)).field_754;
            } else {
                this.field_1247 = this.method_1404();
            }

            if (var3 == 0) {
                this.method_148();
                if (this.field_1254 != null) {
                    this.field_1254.method_128(var1, true);
                }

                if (this.field_1255 != null) {
                    if (this.field_1255.isAlive()) {
                        this.field_1255.removeGlobalOnLayoutListener(this.field_1241);
                    }

                    this.field_1255 = null;
                }

                this.field_1233.removeOnAttachStateChangeListener(this.field_1242);
                this.field_1256.onDismiss();
            } else if (var2) {
                ((e$a)this.field_1232.get(0)).field_753.method_1354(false);
            }
        }

    }

    // $FF: renamed from: a (android.support.v7.view.menu.m$a) void
    public void method_141(m$a var1) {
        this.field_1254 = var1;
    }

    // $FF: renamed from: a (android.view.View) void
    public void method_1387(View var1) {
        if (this.field_1246 != var1) {
            this.field_1246 = var1;
            this.field_1245 = class_142.method_1195(this.field_1244, class_146.method_1222(this.field_1246));
        }

    }

    // $FF: renamed from: a (android.widget.PopupWindow.OnDismissListener) void
    public void method_1388(OnDismissListener var1) {
        this.field_1256 = var1;
    }

    // $FF: renamed from: a (boolean) void
    public void method_1389(boolean var1) {
        this.field_1252 = var1;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.s) boolean
    public boolean method_143(class_163 var1) {
        Iterator var3 = this.field_1232.iterator();

        boolean var2;
        while(true) {
            if (var3.hasNext()) {
                e$a var4 = (e$a)var3.next();
                if (var1 != var4.field_753) {
                    continue;
                }

                var4.method_821().requestFocus();
                var2 = true;
                break;
            }

            if (var1.hasVisibleItems()) {
                this.method_1386(var1);
                if (this.field_1254 != null) {
                    this.field_1254.method_129(var1);
                }

                var2 = true;
            } else {
                var2 = false;
            }
            break;
        }

        return var2;
    }

    // $FF: renamed from: b (int) void
    public void method_1390(int var1) {
        this.field_1248 = true;
        this.field_1250 = var1;
    }

    // $FF: renamed from: b (boolean) void
    public void method_144(boolean var1) {
        Iterator var2 = this.field_1232.iterator();

        while(var2.hasNext()) {
            a(((e$a)var2.next()).method_821().getAdapter()).notifyDataSetChanged();
        }

    }

    // $FF: renamed from: b () boolean
    public boolean method_145() {
        return false;
    }

    // $FF: renamed from: c () void
    public void method_148() {
        int var1 = this.field_1232.size();
        if (var1 > 0) {
            e$a[] var2 = (e$a[])this.field_1232.toArray(new e$a[var1]);
            --var1;

            for(; var1 >= 0; --var1) {
                e$a var3 = var2[var1];
                if (var3.field_752.d()) {
                    var3.field_752.c();
                }
            }
        }

    }

    // $FF: renamed from: c (int) void
    public void method_1391(int var1) {
        this.field_1249 = true;
        this.field_1251 = var1;
    }

    // $FF: renamed from: c (boolean) void
    public void method_1392(boolean var1) {
        this.field_1253 = var1;
    }

    // $FF: renamed from: d () boolean
    public boolean method_149() {
        boolean var1;
        if (this.field_1232.size() > 0 && ((e$a)this.field_1232.get(0)).field_752.d()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: e () android.widget.ListView
    public ListView method_150() {
        ListView var1;
        if (this.field_1232.isEmpty()) {
            var1 = null;
        } else {
            var1 = ((e$a)this.field_1232.get(this.field_1232.size() - 1)).method_821();
        }

        return var1;
    }

    // $FF: renamed from: f () boolean
    protected boolean method_1393() {
        return false;
    }

    public void onDismiss() {
        int var2 = this.field_1232.size();
        int var1 = 0;

        e$a var3;
        while(true) {
            if (var1 >= var2) {
                var3 = null;
                break;
            }

            var3 = (e$a)this.field_1232.get(var1);
            if (!var3.field_752.d()) {
                break;
            }

            ++var1;
        }

        if (var3 != null) {
            var3.field_753.method_1354(false);
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
