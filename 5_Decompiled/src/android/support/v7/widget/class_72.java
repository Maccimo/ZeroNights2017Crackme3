package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.h.c$a;
import android.support.v4.h.class_129;
import android.support.v7.a.a$g;
import android.support.v7.view.class_159;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.class_162;
import android.support.v7.view.menu.class_163;
import android.support.v7.view.menu.class_168;
import android.support.v7.view.menu.class_24;
import android.support.v7.view.menu.class_71;
import android.support.v7.view.menu.n$a;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

// $FF: renamed from: android.support.v7.widget.d
class class_72 extends class_71 implements c$a {
    // $FF: renamed from: A android.support.v7.widget.d$b
    private d$b field_642;
    // $FF: renamed from: g android.support.v7.widget.d$d
    d$d field_643;
    // $FF: renamed from: h android.support.v7.widget.d$e
    d$e field_644;
    // $FF: renamed from: i android.support.v7.widget.d$a
    d$a field_645;
    // $FF: renamed from: j android.support.v7.widget.d$c
    d$c field_646;
    // $FF: renamed from: k android.support.v7.widget.d$f
    final d$f field_647 = new d$f(this);
    // $FF: renamed from: l int
    int field_648;
    // $FF: renamed from: m android.graphics.drawable.Drawable
    private Drawable field_649;
    // $FF: renamed from: n boolean
    private boolean field_650;
    // $FF: renamed from: o boolean
    private boolean field_651;
    // $FF: renamed from: p boolean
    private boolean field_652;
    // $FF: renamed from: q int
    private int field_653;
    // $FF: renamed from: r int
    private int field_654;
    // $FF: renamed from: s int
    private int field_655;
    // $FF: renamed from: t boolean
    private boolean field_656;
    // $FF: renamed from: u boolean
    private boolean field_657;
    // $FF: renamed from: v boolean
    private boolean field_658;
    // $FF: renamed from: w boolean
    private boolean field_659;
    // $FF: renamed from: x int
    private int field_660;
    // $FF: renamed from: y android.util.SparseBooleanArray
    private final SparseBooleanArray field_661 = new SparseBooleanArray();
    // $FF: renamed from: z android.view.View
    private View field_662;

    public class_72(Context var1) {
        super(var1, a$g.abc_action_menu_layout, a$g.abc_action_menu_item_layout);
    }

    // $FF: renamed from: a (android.support.v7.widget.d) android.support.v7.view.menu.g
    // $FF: synthetic method
    static class_162 method_678(class_72 var0) {
        return var0.c;
    }

    // $FF: renamed from: a (android.view.MenuItem) android.view.View
    private View method_679(MenuItem var1) {
        ViewGroup var6 = (ViewGroup)this.f;
        View var4;
        if (var6 == null) {
            var4 = null;
        } else {
            int var3 = var6.getChildCount();
            int var2 = 0;

            while(true) {
                if (var2 >= var3) {
                    var4 = null;
                    break;
                }

                View var5 = var6.getChildAt(var2);
                if (var5 instanceof n$a) {
                    var4 = var5;
                    if (((n$a)var5).getItemData() == var1) {
                        break;
                    }
                }

                ++var2;
            }
        }

        return var4;
    }

    // $FF: renamed from: b (android.support.v7.widget.d) android.support.v7.view.menu.g
    // $FF: synthetic method
    static class_162 method_680(class_72 var0) {
        return var0.c;
    }

    // $FF: renamed from: c (android.support.v7.widget.d) android.support.v7.view.menu.n
    // $FF: synthetic method
    static class_24 method_681(class_72 var0) {
        return var0.f;
    }

    // $FF: renamed from: d (android.support.v7.widget.d) android.support.v7.view.menu.g
    // $FF: synthetic method
    static class_162 method_682(class_72 var0) {
        return var0.c;
    }

    // $FF: renamed from: e (android.support.v7.widget.d) android.support.v7.view.menu.g
    // $FF: synthetic method
    static class_162 method_683(class_72 var0) {
        return var0.c;
    }

    // $FF: renamed from: f (android.support.v7.widget.d) android.support.v7.view.menu.n
    // $FF: synthetic method
    static class_24 method_684(class_72 var0) {
        return var0.f;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.h, android.view.View, android.view.ViewGroup) android.view.View
    public View method_673(class_168 var1, View var2, ViewGroup var3) {
        View var5 = var1.getActionView();
        if (var5 == null || var1.method_1442()) {
            var5 = super.method_673(var1, var2, var3);
        }

        byte var4;
        if (var1.isActionViewExpanded()) {
            var4 = 8;
        } else {
            var4 = 0;
        }

        var5.setVisibility(var4);
        ActionMenuView var7 = (ActionMenuView)var3;
        LayoutParams var6 = var5.getLayoutParams();
        if (!var7.checkLayoutParams(var6)) {
            var5.setLayoutParams(var7.method_295(var6));
        }

        return var5;
    }

    // $FF: renamed from: a (android.content.Context, android.support.v7.view.menu.g) void
    public void method_139(Context var1, class_162 var2) {
        super.method_139(var1, var2);
        Resources var6 = var1.getResources();
        class_159 var5 = class_159.method_1320(var1);
        if (!this.field_652) {
            this.field_651 = var5.method_1322();
        }

        if (!this.field_658) {
            this.field_653 = var5.method_1323();
        }

        if (!this.field_656) {
            this.field_655 = var5.method_1321();
        }

        int var3 = this.field_653;
        if (this.field_651) {
            if (this.field_643 == null) {
                this.field_643 = new d$d(this, this.a);
                if (this.field_650) {
                    this.field_643.setImageDrawable(this.field_649);
                    this.field_649 = null;
                    this.field_650 = false;
                }

                int var4 = MeasureSpec.makeMeasureSpec(0, 0);
                this.field_643.measure(var4, var4);
            }

            var3 -= this.field_643.getMeasuredWidth();
        } else {
            this.field_643 = null;
        }

        this.field_654 = var3;
        this.field_660 = (int)(56.0F * var6.getDisplayMetrics().density);
        this.field_662 = null;
    }

    // $FF: renamed from: a (android.content.res.Configuration) void
    public void method_685(Configuration var1) {
        if (!this.field_656) {
            this.field_655 = class_159.method_1320(this.b).method_1321();
        }

        if (this.c != null) {
            this.c.method_1361(true);
        }

    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) void
    public void method_686(Drawable var1) {
        if (this.field_643 != null) {
            this.field_643.setImageDrawable(var1);
        } else {
            this.field_650 = true;
            this.field_649 = var1;
        }

    }

    // $FF: renamed from: a (android.support.v7.view.menu.g, boolean) void
    public void method_140(class_162 var1, boolean var2) {
        this.method_693();
        super.method_140(var1, var2);
    }

    // $FF: renamed from: a (android.support.v7.view.menu.h, android.support.v7.view.menu.n$a) void
    public void method_674(class_168 var1, n$a var2) {
        var2.method_8(var1, 0);
        ActionMenuView var3 = (ActionMenuView)this.f;
        ActionMenuItemView var4 = (ActionMenuItemView)var2;
        var4.setItemInvoker(var3);
        if (this.field_642 == null) {
            this.field_642 = new d$b(this);
        }

        var4.setPopupCallback(this.field_642);
    }

    // $FF: renamed from: a (android.support.v7.widget.ActionMenuView) void
    public void method_687(ActionMenuView var1) {
        this.f = var1;
        var1.method_296(this.c);
    }

    // $FF: renamed from: a (boolean) void
    public void method_35(boolean var1) {
        if (var1) {
            super.method_143((class_163)null);
        } else if (this.c != null) {
            this.c.method_1354(false);
        }

    }

    // $FF: renamed from: a (int, android.support.v7.view.menu.h) boolean
    public boolean method_676(int var1, class_168 var2) {
        return var2.method_1438();
    }

    // $FF: renamed from: a (android.support.v7.view.menu.s) boolean
    public boolean method_143(class_163 var1) {
        boolean var5 = false;
        boolean var4;
        if (var1.hasVisibleItems()) {
            class_163 var6;
            for(var6 = var1; var6.method_1380() != this.c; var6 = (class_163)var6.method_1380()) {
                ;
            }

            View var7 = this.method_679(var6.getItem());
            if (var7 != null) {
                this.field_648 = var1.getItem().getItemId();
                int var3 = var1.size();
                int var2 = 0;

                while(true) {
                    var4 = var5;
                    if (var2 >= var3) {
                        break;
                    }

                    MenuItem var8 = var1.getItem(var2);
                    if (var8.isVisible() && var8.getIcon() != null) {
                        var4 = true;
                        break;
                    }

                    ++var2;
                }

                this.field_645 = new d$a(this, this.b, var1, var7);
                this.field_645.a(var4);
                this.field_645.a();
                super.method_143(var1);
                var4 = true;
                return var4;
            }
        }

        var4 = false;
        return var4;
    }

    // $FF: renamed from: a (android.view.ViewGroup, int) boolean
    public boolean method_677(ViewGroup var1, int var2) {
        boolean var3;
        if (var1.getChildAt(var2) == this.field_643) {
            var3 = false;
        } else {
            var3 = super.method_677(var1, var2);
        }

        return var3;
    }

    // $FF: renamed from: b (boolean) void
    public void method_144(boolean var1) {
        boolean var3 = false;
        super.method_144(var1);
        ((View)this.f).requestLayout();
        int var2;
        ArrayList var5;
        if (this.c != null) {
            var5 = this.c.method_1374();
            int var4 = var5.size();

            for(var2 = 0; var2 < var4; ++var2) {
                class_129 var6 = ((class_168)var5.get(var2)).method_38();
                if (var6 != null) {
                    var6.method_1066(this);
                }
            }
        }

        if (this.c != null) {
            var5 = this.c.method_1375();
        } else {
            var5 = null;
        }

        boolean var7 = var3;
        if (this.field_651) {
            var7 = var3;
            if (var5 != null) {
                var2 = var5.size();
                if (var2 == 1) {
                    var7 = var3;
                    if (!((class_168)var5.get(0)).isActionViewExpanded()) {
                        var7 = true;
                    }
                } else if (var2 > 0) {
                    var7 = true;
                } else {
                    var7 = false;
                }
            }
        }

        if (var7) {
            if (this.field_643 == null) {
                this.field_643 = new d$d(this, this.a);
            }

            ViewGroup var8 = (ViewGroup)this.field_643.getParent();
            if (var8 != this.f) {
                if (var8 != null) {
                    var8.removeView(this.field_643);
                }

                ActionMenuView var9 = (ActionMenuView)this.f;
                var9.addView(this.field_643, var9.method_299());
            }
        } else if (this.field_643 != null && this.field_643.getParent() == this.f) {
            ((ViewGroup)this.f).removeView(this.field_643);
        }

        ((ActionMenuView)this.f).setOverflowReserved(this.field_651);
    }

    // $FF: renamed from: b () boolean
    public boolean method_145() {
        int var6;
        ArrayList var14;
        if (this.c != null) {
            var14 = this.c.method_1372();
            var6 = var14.size();
        } else {
            var14 = null;
            var6 = 0;
        }

        int var1 = this.field_655;
        int var9 = this.field_654;
        int var10 = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup var15 = (ViewGroup)this.f;
        int var3 = 0;
        int var5 = 0;
        boolean var4 = false;

        int var2;
        for(var2 = 0; var2 < var6; ++var2) {
            class_168 var16 = (class_168)var14.get(var2);
            if (var16.method_1440()) {
                ++var3;
            } else if (var16.method_1439()) {
                ++var5;
            } else {
                var4 = true;
            }

            if (this.field_659 && var16.isActionViewExpanded()) {
                var1 = 0;
            }
        }

        var2 = var1;
        if (this.field_651) {
            label161: {
                if (!var4) {
                    var2 = var1;
                    if (var3 + var5 <= var1) {
                        break label161;
                    }
                }

                var2 = var1 - 1;
            }
        }

        var2 -= var3;
        SparseBooleanArray var22 = this.field_661;
        var22.clear();
        int var7;
        int var19;
        if (this.field_657) {
            var1 = var9 / this.field_660;
            var19 = this.field_660;
            var3 = this.field_660;
            var7 = var9 % var19 / var1 + var3;
        } else {
            var7 = 0;
            var1 = 0;
        }

        byte var21 = 0;
        int var8 = 0;
        var3 = var1;
        var19 = var9;
        var1 = var2;

        for(var2 = var21; var8 < var6; var19 = var5) {
            class_168 var17 = (class_168)var14.get(var8);
            View var18;
            if (var17.method_1440()) {
                var18 = this.method_673(var17, this.field_662, var15);
                if (this.field_662 == null) {
                    this.field_662 = var18;
                }

                if (this.field_657) {
                    var5 = var3 - ActionMenuView.method_291(var18, var7, var3, var10, 0);
                } else {
                    var18.measure(var10, var10);
                    var5 = var3;
                }

                var9 = var18.getMeasuredWidth();
                var3 = var2;
                if (var2 == 0) {
                    var3 = var9;
                }

                var2 = var17.getGroupId();
                if (var2 != 0) {
                    var22.put(var2, true);
                }

                var17.method_1431(true);
                var2 = var3;
                var3 = var19 - var9;
                var19 = var5;
            } else if (!var17.method_1439()) {
                var17.method_1431(false);
                var5 = var19;
                var19 = var3;
                var3 = var5;
            } else {
                int var11 = var17.getGroupId();
                boolean var13 = var22.get(var11);
                boolean var12;
                if (var1 <= 0 && !var13 || var19 <= 0 || this.field_657 && var3 <= 0) {
                    var12 = false;
                } else {
                    var12 = true;
                }

                if (var12) {
                    var18 = this.method_673(var17, this.field_662, var15);
                    if (this.field_662 == null) {
                        this.field_662 = var18;
                    }

                    if (this.field_657) {
                        var5 = ActionMenuView.method_291(var18, var7, var3, var10, 0);
                        if (var5 == 0) {
                            var12 = false;
                        }

                        var3 -= var5;
                    } else {
                        var18.measure(var10, var10);
                    }

                    var9 = var18.getMeasuredWidth();
                    var5 = var19 - var9;
                    var19 = var2;
                    if (var2 == 0) {
                        var19 = var9;
                    }

                    boolean var20;
                    if (this.field_657) {
                        if (var5 >= 0) {
                            var20 = true;
                        } else {
                            var20 = false;
                        }

                        var12 &= var20;
                        var2 = var3;
                        var3 = var19;
                        var19 = var5;
                    } else {
                        if (var5 + var19 > 0) {
                            var20 = true;
                        } else {
                            var20 = false;
                        }

                        var12 &= var20;
                        var9 = var5;
                        var5 = var19;
                        var2 = var3;
                        var19 = var9;
                        var3 = var5;
                    }
                } else {
                    var5 = var2;
                    var2 = var3;
                    var3 = var5;
                }

                if (var12 && var11 != 0) {
                    var22.put(var11, true);
                } else if (var13) {
                    var22.put(var11, false);

                    for(var9 = 0; var9 < var8; var1 = var5) {
                        class_168 var23 = (class_168)var14.get(var9);
                        var5 = var1;
                        if (var23.getGroupId() == var11) {
                            var5 = var1;
                            if (var23.method_1438()) {
                                var5 = var1 + 1;
                            }

                            var23.method_1431(false);
                        }

                        ++var9;
                    }
                }

                var5 = var1;
                if (var12) {
                    var5 = var1 - 1;
                }

                var17.method_1431(var12);
                var1 = var5;
                var5 = var19;
                var19 = var2;
                var2 = var3;
                var3 = var5;
            }

            ++var8;
            var5 = var3;
            var3 = var19;
        }

        return true;
    }

    // $FF: renamed from: c () android.graphics.drawable.Drawable
    public Drawable method_688() {
        Drawable var1;
        if (this.field_643 != null) {
            var1 = this.field_643.getDrawable();
        } else if (this.field_650) {
            var1 = this.field_649;
        } else {
            var1 = null;
        }

        return var1;
    }

    // $FF: renamed from: c (boolean) void
    public void method_689(boolean var1) {
        this.field_651 = var1;
        this.field_652 = true;
    }

    // $FF: renamed from: d (boolean) void
    public void method_690(boolean var1) {
        this.field_659 = var1;
    }

    // $FF: renamed from: d () boolean
    public boolean method_691() {
        boolean var1 = true;
        if (this.field_651 && !this.method_695() && this.c != null && this.f != null && this.field_646 == null && !this.c.method_1375().isEmpty()) {
            this.field_646 = new d$c(this, new d$e(this, this.b, this.c, this.field_643, true));
            ((View)this.f).post(this.field_646);
            super.method_143((class_163)null);
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: e () boolean
    public boolean method_692() {
        boolean var1;
        if (this.field_646 != null && this.f != null) {
            ((View)this.f).removeCallbacks(this.field_646);
            this.field_646 = null;
            var1 = true;
        } else {
            d$e var2 = this.field_644;
            if (var2 != null) {
                var2.method_1045();
                var1 = true;
            } else {
                var1 = false;
            }
        }

        return var1;
    }

    // $FF: renamed from: f () boolean
    public boolean method_693() {
        return this.method_692() | this.method_694();
    }

    // $FF: renamed from: g () boolean
    public boolean method_694() {
        boolean var1;
        if (this.field_645 != null) {
            this.field_645.d();
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: h () boolean
    public boolean method_695() {
        boolean var1;
        if (this.field_644 != null && this.field_644.f()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }
}
