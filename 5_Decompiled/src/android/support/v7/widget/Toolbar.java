package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.h.class_141;
import android.support.v4.h.class_142;
import android.support.v4.h.class_146;
import android.support.v4.h.class_89;
import android.support.v7.a.a$j;
import android.support.v7.b.a.class_39;
import android.support.v7.view.class_156;
import android.support.v7.view.class_22;
import android.support.v7.view.menu.class_162;
import android.support.v7.view.menu.class_163;
import android.support.v7.view.menu.class_168;
import android.support.v7.view.menu.class_23;
import android.support.v7.view.menu.g$a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    // $FF: renamed from: A int
    private int field_406;
    // $FF: renamed from: B int
    private int field_407;
    // $FF: renamed from: C boolean
    private boolean field_408;
    // $FF: renamed from: D boolean
    private boolean field_409;
    // $FF: renamed from: E java.util.ArrayList
    private final ArrayList field_410;
    // $FF: renamed from: F java.util.ArrayList
    private final ArrayList field_411;
    // $FF: renamed from: G int[]
    private final int[] field_412;
    // $FF: renamed from: H android.support.v7.widget.ActionMenuView$e
    private final ActionMenuView.class_215 field_413;
    // $FF: renamed from: I android.support.v7.widget.al
    private class_101 field_414;
    // $FF: renamed from: J android.support.v7.widget.d
    private class_72 field_415;
    // $FF: renamed from: K android.support.v7.widget.Toolbar$a
    private Toolbar.class_261 field_416;
    // $FF: renamed from: L android.support.v7.view.menu.m$a
    private android.support.v7.view.menu.m$a field_417;
    // $FF: renamed from: M android.support.v7.view.menu.g$a
    private g$a field_418;
    // $FF: renamed from: N boolean
    private boolean field_419;
    // $FF: renamed from: O java.lang.Runnable
    private final Runnable field_420;
    // $FF: renamed from: a android.widget.ImageButton
    ImageButton field_421;
    // $FF: renamed from: b android.view.View
    View field_422;
    // $FF: renamed from: c int
    int field_423;
    // $FF: renamed from: d android.support.v7.widget.Toolbar$c
    Toolbar.class_263 field_424;
    // $FF: renamed from: e android.support.v7.widget.ActionMenuView
    private ActionMenuView field_425;
    // $FF: renamed from: f android.widget.TextView
    private TextView field_426;
    // $FF: renamed from: g android.widget.TextView
    private TextView field_427;
    // $FF: renamed from: h android.widget.ImageButton
    private ImageButton field_428;
    // $FF: renamed from: i android.widget.ImageView
    private ImageView field_429;
    // $FF: renamed from: j android.graphics.drawable.Drawable
    private Drawable field_430;
    // $FF: renamed from: k java.lang.CharSequence
    private CharSequence field_431;
    // $FF: renamed from: l android.content.Context
    private Context field_432;
    // $FF: renamed from: m int
    private int field_433;
    // $FF: renamed from: n int
    private int field_434;
    // $FF: renamed from: o int
    private int field_435;
    // $FF: renamed from: p int
    private int field_436;
    // $FF: renamed from: q int
    private int field_437;
    // $FF: renamed from: r int
    private int field_438;
    // $FF: renamed from: s int
    private int field_439;
    // $FF: renamed from: t int
    private int field_440;
    // $FF: renamed from: u android.support.v7.widget.ac
    private class_107 field_441;
    // $FF: renamed from: v int
    private int field_442;
    // $FF: renamed from: w int
    private int field_443;
    // $FF: renamed from: x int
    private int field_444;
    // $FF: renamed from: y java.lang.CharSequence
    private CharSequence field_445;
    // $FF: renamed from: z java.lang.CharSequence
    private CharSequence field_446;

    public Toolbar(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public Toolbar(Context var1, AttributeSet var2) {
        this(var1, var2, android.support.v7.a.a$a.toolbarStyle);
    }

    public Toolbar(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        this.field_444 = 8388627;
        this.field_410 = new ArrayList();
        this.field_411 = new ArrayList();
        this.field_412 = new int[2];
        this.field_413 = new ActionMenuView.class_215() {
            // $FF: renamed from: a (android.view.MenuItem) boolean
            public boolean method_12(MenuItem var1) {
                boolean var2;
                if (Toolbar.this.field_424 != null) {
                    var2 = Toolbar.this.field_424.method_33(var1);
                } else {
                    var2 = false;
                }

                return var2;
            }
        };
        this.field_420 = new Runnable() {
            public void run() {
                Toolbar.this.method_496();
            }
        };
        class_97 var7 = class_97.method_867(this.getContext(), var2, a$j.Toolbar, var3, 0);
        this.field_434 = var7.method_884(a$j.Toolbar_titleTextAppearance, 0);
        this.field_435 = var7.method_884(a$j.Toolbar_subtitleTextAppearance, 0);
        this.field_444 = var7.method_876(a$j.Toolbar_android_gravity, this.field_444);
        this.field_423 = var7.method_876(a$j.Toolbar_buttonGravity, 48);
        int var4 = var7.method_878(a$j.Toolbar_titleMargin, 0);
        var3 = var4;
        if (var7.method_883(a$j.Toolbar_titleMargins)) {
            var3 = var7.method_878(a$j.Toolbar_titleMargins, var4);
        }

        this.field_440 = var3;
        this.field_439 = var3;
        this.field_438 = var3;
        this.field_437 = var3;
        var3 = var7.method_878(a$j.Toolbar_titleMarginStart, -1);
        if (var3 >= 0) {
            this.field_437 = var3;
        }

        var3 = var7.method_878(a$j.Toolbar_titleMarginEnd, -1);
        if (var3 >= 0) {
            this.field_438 = var3;
        }

        var3 = var7.method_878(a$j.Toolbar_titleMarginTop, -1);
        if (var3 >= 0) {
            this.field_439 = var3;
        }

        var3 = var7.method_878(a$j.Toolbar_titleMarginBottom, -1);
        if (var3 >= 0) {
            this.field_440 = var3;
        }

        this.field_436 = var7.method_880(a$j.Toolbar_maxButtonHeight, -1);
        var3 = var7.method_878(a$j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int var6 = var7.method_878(a$j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int var5 = var7.method_880(a$j.Toolbar_contentInsetLeft, 0);
        var4 = var7.method_880(a$j.Toolbar_contentInsetRight, 0);
        this.method_489();
        this.field_441.method_940(var5, var4);
        if (var3 != Integer.MIN_VALUE || var6 != Integer.MIN_VALUE) {
            this.field_441.method_937(var3, var6);
        }

        this.field_442 = var7.method_878(a$j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.field_443 = var7.method_878(a$j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.field_430 = var7.method_871(a$j.Toolbar_collapseIcon);
        this.field_431 = var7.method_875(a$j.Toolbar_collapseContentDescription);
        CharSequence var8 = var7.method_875(a$j.Toolbar_title);
        if (!TextUtils.isEmpty(var8)) {
            this.setTitle(var8);
        }

        var8 = var7.method_875(a$j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(var8)) {
            this.setSubtitle(var8);
        }

        this.field_432 = this.getContext();
        this.setPopupTheme(var7.method_884(a$j.Toolbar_popupTheme, 0));
        Drawable var9 = var7.method_871(a$j.Toolbar_navigationIcon);
        if (var9 != null) {
            this.setNavigationIcon(var9);
        }

        var8 = var7.method_875(a$j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(var8)) {
            this.setNavigationContentDescription(var8);
        }

        var9 = var7.method_871(a$j.Toolbar_logo);
        if (var9 != null) {
            this.setLogo(var9);
        }

        var8 = var7.method_875(a$j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(var8)) {
            this.setLogoDescription(var8);
        }

        if (var7.method_883(a$j.Toolbar_titleTextColor)) {
            this.setTitleTextColor(var7.method_874(a$j.Toolbar_titleTextColor, -1));
        }

        if (var7.method_883(a$j.Toolbar_subtitleTextColor)) {
            this.setSubtitleTextColor(var7.method_874(a$j.Toolbar_subtitleTextColor, -1));
        }

        var7.method_872();
    }

    // $FF: renamed from: a (int) int
    private int method_469(int var1) {
        int var2 = var1 & 112;
        var1 = var2;
        switch(var2) {
        default:
            var1 = this.field_444 & 112;
        case 16:
        case 48:
        case 80:
            return var1;
        }
    }

    // $FF: renamed from: a (android.view.View, int) int
    private int method_470(View var1, int var2) {
        Toolbar.class_262 var7 = (Toolbar.class_262)var1.getLayoutParams();
        int var4 = var1.getMeasuredHeight();
        if (var2 > 0) {
            var2 = (var4 - var2) / 2;
        } else {
            var2 = 0;
        }

        switch(this.method_469(var7.a)) {
        case 48:
            var2 = this.getPaddingTop() - var2;
            break;
        case 80:
            var2 = this.getHeight() - this.getPaddingBottom() - var4 - var7.bottomMargin - var2;
            break;
        default:
            int var3 = this.getPaddingTop();
            int var5 = this.getPaddingBottom();
            int var6 = this.getHeight();
            var2 = (var6 - var3 - var5 - var4) / 2;
            if (var2 < var7.topMargin) {
                var2 = var7.topMargin;
            } else {
                var4 = var6 - var5 - var4 - var2 - var3;
                if (var4 < var7.bottomMargin) {
                    var2 = Math.max(0, var2 - (var7.bottomMargin - var4));
                }
            }

            var2 += var3;
        }

        return var2;
    }

    // $FF: renamed from: a (android.view.View, int, int, int, int, int[]) int
    private int method_471(View var1, int var2, int var3, int var4, int var5, int[] var6) {
        MarginLayoutParams var10 = (MarginLayoutParams)var1.getLayoutParams();
        int var7 = var10.leftMargin - var6[0];
        int var8 = var10.rightMargin - var6[1];
        int var9 = Math.max(0, var7) + Math.max(0, var8);
        var6[0] = Math.max(0, -var7);
        var6[1] = Math.max(0, -var8);
        var1.measure(getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight() + var9 + var3, var10.width), getChildMeasureSpec(var4, this.getPaddingTop() + this.getPaddingBottom() + var10.topMargin + var10.bottomMargin + var5, var10.height));
        return var1.getMeasuredWidth() + var9;
    }

    // $FF: renamed from: a (android.view.View, int, int[], int) int
    private int method_472(View var1, int var2, int[] var3, int var4) {
        Toolbar.class_262 var6 = (Toolbar.class_262)var1.getLayoutParams();
        int var5 = var6.leftMargin - var3[0];
        var2 += Math.max(0, var5);
        var3[0] = Math.max(0, -var5);
        var4 = this.method_470(var1, var4);
        var5 = var1.getMeasuredWidth();
        var1.layout(var2, var4, var2 + var5, var1.getMeasuredHeight() + var4);
        return var6.rightMargin + var5 + var2;
    }

    // $FF: renamed from: a (java.util.List, int[]) int
    private int method_473(List var1, int[] var2) {
        int var5 = var2[0];
        int var6 = var2[1];
        int var7 = var1.size();
        int var4 = 0;

        int var3;
        int var8;
        int var9;
        int var10;
        for(var3 = 0; var4 < var7; var3 += var10 + var8 + var9) {
            View var11 = (View)var1.get(var4);
            Toolbar.class_262 var12 = (Toolbar.class_262)var11.getLayoutParams();
            var5 = var12.leftMargin - var5;
            var6 = var12.rightMargin - var6;
            var8 = Math.max(0, var5);
            var9 = Math.max(0, var6);
            var5 = Math.max(0, -var5);
            var6 = Math.max(0, -var6);
            var10 = var11.getMeasuredWidth();
            ++var4;
        }

        return var3;
    }

    // $FF: renamed from: a (android.view.View, int, int, int, int, int) void
    private void method_474(View var1, int var2, int var3, int var4, int var5, int var6) {
        MarginLayoutParams var8 = (MarginLayoutParams)var1.getLayoutParams();
        int var7 = getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight() + var8.leftMargin + var8.rightMargin + var3, var8.width);
        var3 = getChildMeasureSpec(var4, this.getPaddingTop() + this.getPaddingBottom() + var8.topMargin + var8.bottomMargin + var5, var8.height);
        var4 = MeasureSpec.getMode(var3);
        var2 = var3;
        if (var4 != 1073741824) {
            var2 = var3;
            if (var6 >= 0) {
                var2 = var6;
                if (var4 != 0) {
                    var2 = Math.min(MeasureSpec.getSize(var3), var6);
                }

                var2 = MeasureSpec.makeMeasureSpec(var2, 1073741824);
            }
        }

        var1.measure(var7, var2);
    }

    // $FF: renamed from: a (android.view.View, boolean) void
    private void method_475(View var1, boolean var2) {
        LayoutParams var3 = var1.getLayoutParams();
        Toolbar.class_262 var4;
        if (var3 == null) {
            var4 = this.method_499();
        } else if (!this.checkLayoutParams(var3)) {
            var4 = this.method_491(var3);
        } else {
            var4 = (Toolbar.class_262)var3;
        }

        var4.field_558 = 1;
        if (var2 && this.field_422 != null) {
            var1.setLayoutParams(var4);
            this.field_411.add(var1);
        } else {
            this.addView(var1, var4);
        }

    }

    // $FF: renamed from: a (java.util.List, int) void
    private void method_476(List var1, int var2) {
        boolean var3 = true;
        byte var4 = 0;
        if (class_146.method_1222(this) != 1) {
            var3 = false;
        }

        int var6 = this.getChildCount();
        int var5 = class_142.method_1195(var2, class_146.method_1222(this));
        var1.clear();
        var2 = var4;
        if (var3) {
            for(var2 = var6 - 1; var2 >= 0; --var2) {
                View var9 = this.getChildAt(var2);
                Toolbar.class_262 var10 = (Toolbar.class_262)var9.getLayoutParams();
                if (var10.field_558 == 0 && this.method_477(var9) && this.method_478(var10.a) == var5) {
                    var1.add(var9);
                }
            }
        } else {
            for(; var2 < var6; ++var2) {
                View var8 = this.getChildAt(var2);
                Toolbar.class_262 var7 = (Toolbar.class_262)var8.getLayoutParams();
                if (var7.field_558 == 0 && this.method_477(var8) && this.method_478(var7.a) == var5) {
                    var1.add(var8);
                }
            }
        }

    }

    // $FF: renamed from: a (android.view.View) boolean
    private boolean method_477(View var1) {
        boolean var2;
        if (var1 != null && var1.getParent() == this && var1.getVisibility() != 8) {
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    // $FF: renamed from: b (int) int
    private int method_478(int var1) {
        int var3 = class_146.method_1222(this);
        int var2 = class_142.method_1195(var1, var3) & 7;
        var1 = var2;
        switch(var2) {
        case 2:
        case 4:
        default:
            if (var3 == 1) {
                var1 = 5;
            } else {
                var1 = 3;
            }
        case 1:
        case 3:
        case 5:
            return var1;
        }
    }

    // $FF: renamed from: b (android.view.View) int
    private int method_479(View var1) {
        MarginLayoutParams var3 = (MarginLayoutParams)var1.getLayoutParams();
        int var2 = class_141.method_1193(var3);
        return class_141.method_1194(var3) + var2;
    }

    // $FF: renamed from: b (android.view.View, int, int[], int) int
    private int method_480(View var1, int var2, int[] var3, int var4) {
        Toolbar.class_262 var6 = (Toolbar.class_262)var1.getLayoutParams();
        int var5 = var6.rightMargin - var3[1];
        var2 -= Math.max(0, var5);
        var3[1] = Math.max(0, -var5);
        var5 = this.method_470(var1, var4);
        var4 = var1.getMeasuredWidth();
        var1.layout(var2 - var4, var5, var2, var1.getMeasuredHeight() + var5);
        return var2 - (var6.leftMargin + var4);
    }

    // $FF: renamed from: c (android.view.View) int
    private int method_481(View var1) {
        MarginLayoutParams var3 = (MarginLayoutParams)var1.getLayoutParams();
        int var2 = var3.topMargin;
        return var3.bottomMargin + var2;
    }

    // $FF: renamed from: d (android.view.View) boolean
    private boolean method_482(View var1) {
        boolean var2;
        if (var1.getParent() != this && !this.field_411.contains(var1)) {
            var2 = false;
        } else {
            var2 = true;
        }

        return var2;
    }

    private MenuInflater getMenuInflater() {
        return new class_156(this.getContext());
    }

    // $FF: renamed from: h () void
    private void method_483() {
        if (this.field_429 == null) {
            this.field_429 = new AppCompatImageView(this.getContext());
        }

    }

    // $FF: renamed from: i () void
    private void method_484() {
        this.method_485();
        if (this.field_425.method_300() == null) {
            class_162 var1 = (class_162)this.field_425.getMenu();
            if (this.field_416 == null) {
                this.field_416 = new Toolbar.class_261();
            }

            this.field_425.setExpandedActionViewsExclusive(true);
            var1.method_1351(this.field_416, this.field_432);
        }

    }

    // $FF: renamed from: j () void
    private void method_485() {
        if (this.field_425 == null) {
            this.field_425 = new ActionMenuView(this.getContext());
            this.field_425.setPopupTheme(this.field_433);
            this.field_425.setOnMenuItemClickListener(this.field_413);
            this.field_425.method_297(this.field_417, this.field_418);
            Toolbar.class_262 var1 = this.method_499();
            var1.a = 8388613 | this.field_423 & 112;
            this.field_425.setLayoutParams(var1);
            this.method_475(this.field_425, false);
        }

    }

    // $FF: renamed from: k () void
    private void method_486() {
        if (this.field_428 == null) {
            this.field_428 = new class_76(this.getContext(), (AttributeSet)null, android.support.v7.a.a$a.toolbarNavigationButtonStyle);
            Toolbar.class_262 var1 = this.method_499();
            var1.a = 8388611 | this.field_423 & 112;
            this.field_428.setLayoutParams(var1);
        }

    }

    // $FF: renamed from: l () void
    private void method_487() {
        this.removeCallbacks(this.field_420);
        this.post(this.field_420);
    }

    // $FF: renamed from: m () boolean
    private boolean method_488() {
        boolean var4 = false;
        boolean var3;
        if (!this.field_419) {
            var3 = var4;
        } else {
            int var2 = this.getChildCount();
            int var1 = 0;

            while(true) {
                if (var1 >= var2) {
                    var3 = true;
                    break;
                }

                View var5 = this.getChildAt(var1);
                if (this.method_477(var5) && var5.getMeasuredWidth() > 0) {
                    var3 = var4;
                    if (var5.getMeasuredHeight() > 0) {
                        break;
                    }
                }

                ++var1;
            }
        }

        return var3;
    }

    // $FF: renamed from: n () void
    private void method_489() {
        if (this.field_441 == null) {
            this.field_441 = new class_107();
        }

    }

    // $FF: renamed from: a (android.util.AttributeSet) android.support.v7.widget.Toolbar$b
    public Toolbar.class_262 method_490(AttributeSet var1) {
        return new Toolbar.class_262(this.getContext(), var1);
    }

    // $FF: renamed from: a (android.view.ViewGroup.LayoutParams) android.support.v7.widget.Toolbar$b
    protected Toolbar.class_262 method_491(LayoutParams var1) {
        Toolbar.class_262 var2;
        if (var1 instanceof Toolbar.class_262) {
            var2 = new Toolbar.class_262((Toolbar.class_262)var1);
        } else if (var1 instanceof android.support.v7.app.a$a) {
            var2 = new Toolbar.class_262((android.support.v7.app.a$a)var1);
        } else if (var1 instanceof MarginLayoutParams) {
            var2 = new Toolbar.class_262((MarginLayoutParams)var1);
        } else {
            var2 = new Toolbar.class_262(var1);
        }

        return var2;
    }

    // $FF: renamed from: a (int, int) void
    public void method_492(int var1, int var2) {
        this.method_489();
        this.field_441.method_937(var1, var2);
    }

    // $FF: renamed from: a (android.content.Context, int) void
    public void method_493(Context var1, int var2) {
        this.field_434 = var2;
        if (this.field_426 != null) {
            this.field_426.setTextAppearance(var1, var2);
        }

    }

    // $FF: renamed from: a () boolean
    public boolean method_494() {
        boolean var1;
        if (this.field_425 != null && this.field_425.method_302()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: b (android.content.Context, int) void
    public void method_495(Context var1, int var2) {
        this.field_435 = var2;
        if (this.field_427 != null) {
            this.field_427.setTextAppearance(var1, var2);
        }

    }

    // $FF: renamed from: b () boolean
    public boolean method_496() {
        boolean var1;
        if (this.field_425 != null && this.field_425.method_301()) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: c () void
    public void method_497() {
        class_168 var1;
        if (this.field_416 == null) {
            var1 = null;
        } else {
            var1 = this.field_416.field_872;
        }

        if (var1 != null) {
            var1.collapseActionView();
        }

    }

    protected boolean checkLayoutParams(LayoutParams var1) {
        boolean var2;
        if (super.checkLayoutParams(var1) && var1 instanceof Toolbar.class_262) {
            var2 = true;
        } else {
            var2 = false;
        }

        return var2;
    }

    // $FF: renamed from: d () void
    void method_498() {
        if (this.field_421 == null) {
            this.field_421 = new class_76(this.getContext(), (AttributeSet)null, android.support.v7.a.a$a.toolbarNavigationButtonStyle);
            this.field_421.setImageDrawable(this.field_430);
            this.field_421.setContentDescription(this.field_431);
            Toolbar.class_262 var1 = this.method_499();
            var1.a = 8388611 | this.field_423 & 112;
            var1.field_558 = 2;
            this.field_421.setLayoutParams(var1);
            this.field_421.setOnClickListener(new OnClickListener() {
                public void onClick(View var1) {
                    Toolbar.this.method_497();
                }
            });
        }

    }

    // $FF: renamed from: e () android.support.v7.widget.Toolbar$b
    protected Toolbar.class_262 method_499() {
        return new Toolbar.class_262(-2, -2);
    }

    // $FF: renamed from: f () void
    void method_500() {
        for(int var1 = this.getChildCount() - 1; var1 >= 0; --var1) {
            View var2 = this.getChildAt(var1);
            if (((Toolbar.class_262)var2.getLayoutParams()).field_558 != 2 && var2 != this.field_425) {
                this.removeViewAt(var1);
                this.field_411.add(var2);
            }
        }

    }

    // $FF: renamed from: g () void
    void method_501() {
        for(int var1 = this.field_411.size() - 1; var1 >= 0; --var1) {
            this.addView((View)this.field_411.get(var1));
        }

        this.field_411.clear();
    }

    // $FF: synthetic method
    protected LayoutParams generateDefaultLayoutParams() {
        return this.method_499();
    }

    // $FF: synthetic method
    public LayoutParams generateLayoutParams(AttributeSet var1) {
        return this.method_490(var1);
    }

    // $FF: synthetic method
    protected LayoutParams generateLayoutParams(LayoutParams var1) {
        return this.method_491(var1);
    }

    public int getContentInsetEnd() {
        int var1;
        if (this.field_441 != null) {
            var1 = this.field_441.method_942();
        } else {
            var1 = 0;
        }

        return var1;
    }

    public int getContentInsetEndWithActions() {
        int var1;
        if (this.field_443 != Integer.MIN_VALUE) {
            var1 = this.field_443;
        } else {
            var1 = this.getContentInsetEnd();
        }

        return var1;
    }

    public int getContentInsetLeft() {
        int var1;
        if (this.field_441 != null) {
            var1 = this.field_441.method_936();
        } else {
            var1 = 0;
        }

        return var1;
    }

    public int getContentInsetRight() {
        int var1;
        if (this.field_441 != null) {
            var1 = this.field_441.method_939();
        } else {
            var1 = 0;
        }

        return var1;
    }

    public int getContentInsetStart() {
        int var1;
        if (this.field_441 != null) {
            var1 = this.field_441.method_941();
        } else {
            var1 = 0;
        }

        return var1;
    }

    public int getContentInsetStartWithNavigation() {
        int var1;
        if (this.field_442 != Integer.MIN_VALUE) {
            var1 = this.field_442;
        } else {
            var1 = this.getContentInsetStart();
        }

        return var1;
    }

    public int getCurrentContentInsetEnd() {
        boolean var1;
        if (this.field_425 != null) {
            class_162 var2 = this.field_425.method_300();
            if (var2 != null && var2.hasVisibleItems()) {
                var1 = true;
            } else {
                var1 = false;
            }
        } else {
            var1 = false;
        }

        int var3;
        if (var1) {
            var3 = Math.max(this.getContentInsetEnd(), Math.max(this.field_443, 0));
        } else {
            var3 = this.getContentInsetEnd();
        }

        return var3;
    }

    public int getCurrentContentInsetLeft() {
        int var1;
        if (class_146.method_1222(this) == 1) {
            var1 = this.getCurrentContentInsetEnd();
        } else {
            var1 = this.getCurrentContentInsetStart();
        }

        return var1;
    }

    public int getCurrentContentInsetRight() {
        int var1;
        if (class_146.method_1222(this) == 1) {
            var1 = this.getCurrentContentInsetStart();
        } else {
            var1 = this.getCurrentContentInsetEnd();
        }

        return var1;
    }

    public int getCurrentContentInsetStart() {
        int var1;
        if (this.getNavigationIcon() != null) {
            var1 = Math.max(this.getContentInsetStart(), Math.max(this.field_442, 0));
        } else {
            var1 = this.getContentInsetStart();
        }

        return var1;
    }

    public Drawable getLogo() {
        Drawable var1;
        if (this.field_429 != null) {
            var1 = this.field_429.getDrawable();
        } else {
            var1 = null;
        }

        return var1;
    }

    public CharSequence getLogoDescription() {
        CharSequence var1;
        if (this.field_429 != null) {
            var1 = this.field_429.getContentDescription();
        } else {
            var1 = null;
        }

        return var1;
    }

    public Menu getMenu() {
        this.method_484();
        return this.field_425.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        CharSequence var1;
        if (this.field_428 != null) {
            var1 = this.field_428.getContentDescription();
        } else {
            var1 = null;
        }

        return var1;
    }

    public Drawable getNavigationIcon() {
        Drawable var1;
        if (this.field_428 != null) {
            var1 = this.field_428.getDrawable();
        } else {
            var1 = null;
        }

        return var1;
    }

    class_72 getOuterActionMenuPresenter() {
        return this.field_415;
    }

    public Drawable getOverflowIcon() {
        this.method_484();
        return this.field_425.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.field_432;
    }

    public int getPopupTheme() {
        return this.field_433;
    }

    public CharSequence getSubtitle() {
        return this.field_446;
    }

    public CharSequence getTitle() {
        return this.field_445;
    }

    public int getTitleMarginBottom() {
        return this.field_440;
    }

    public int getTitleMarginEnd() {
        return this.field_438;
    }

    public int getTitleMarginStart() {
        return this.field_437;
    }

    public int getTitleMarginTop() {
        return this.field_439;
    }

    public class_6 getWrapper() {
        if (this.field_414 == null) {
            this.field_414 = new class_101(this, true);
        }

        return this.field_414;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.field_420);
    }

    public boolean onHoverEvent(MotionEvent var1) {
        int var2 = var1.getActionMasked();
        if (var2 == 9) {
            this.field_409 = false;
        }

        if (!this.field_409) {
            boolean var3 = super.onHoverEvent(var1);
            if (var2 == 9 && !var3) {
                this.field_409 = true;
            }
        }

        if (var2 == 10 || var2 == 3) {
            this.field_409 = false;
        }

        return true;
    }

    protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
        boolean var8;
        if (class_146.method_1222(this) == 1) {
            var8 = true;
        } else {
            var8 = false;
        }

        int var11 = this.getWidth();
        int var14 = this.getHeight();
        int var7 = this.getPaddingLeft();
        int var12 = this.getPaddingRight();
        int var13 = this.getPaddingTop();
        int var15 = this.getPaddingBottom();
        var4 = var11 - var12;
        int[] var19 = this.field_412;
        var19[1] = 0;
        var19[0] = 0;
        var2 = class_146.method_1223(this);
        int var6;
        if (var2 >= 0) {
            var6 = Math.min(var2, var5 - var3);
        } else {
            var6 = 0;
        }

        if (this.method_477(this.field_428)) {
            if (var8) {
                var5 = this.method_480(this.field_428, var4, var19, var6);
                var2 = var7;
            } else {
                var2 = this.method_472(this.field_428, var7, var19, var6);
                var5 = var4;
            }
        } else {
            var2 = var7;
            var5 = var4;
        }

        var4 = var2;
        var3 = var5;
        if (this.method_477(this.field_421)) {
            if (var8) {
                var3 = this.method_480(this.field_421, var5, var19, var6);
                var4 = var2;
            } else {
                var4 = this.method_472(this.field_421, var2, var19, var6);
                var3 = var5;
            }
        }

        var5 = var4;
        var2 = var3;
        if (this.method_477(this.field_425)) {
            if (var8) {
                var5 = this.method_472(this.field_425, var4, var19, var6);
                var2 = var3;
            } else {
                var2 = this.method_480(this.field_425, var3, var19, var6);
                var5 = var4;
            }
        }

        var3 = this.getCurrentContentInsetLeft();
        var4 = this.getCurrentContentInsetRight();
        var19[0] = Math.max(0, var3 - var5);
        var19[1] = Math.max(0, var4 - (var11 - var12 - var2));
        var3 = Math.max(var5, var3);
        var4 = Math.min(var2, var11 - var12 - var4);
        if (this.method_477(this.field_422)) {
            if (var8) {
                var4 = this.method_480(this.field_422, var4, var19, var6);
                var2 = var3;
                var3 = var4;
            } else {
                var2 = this.method_472(this.field_422, var3, var19, var6);
                var3 = var4;
            }
        } else {
            var2 = var3;
            var3 = var4;
        }

        if (this.method_477(this.field_429)) {
            if (var8) {
                var4 = this.method_480(this.field_429, var3, var19, var6);
                var3 = var2;
            } else {
                var2 = this.method_472(this.field_429, var2, var19, var6);
                var4 = var3;
                var3 = var2;
            }
        } else {
            var4 = var3;
            var3 = var2;
        }

        var1 = this.method_477(this.field_426);
        boolean var16 = this.method_477(this.field_427);
        var2 = 0;
        Toolbar.class_262 var17;
        if (var1) {
            var17 = (Toolbar.class_262)this.field_426.getLayoutParams();
            var2 = var17.topMargin;
            var5 = this.field_426.getMeasuredHeight();
            var2 = var17.bottomMargin + var2 + var5 + 0;
        }

        int var10;
        if (var16) {
            var17 = (Toolbar.class_262)this.field_427.getLayoutParams();
            int var9 = var17.topMargin;
            var5 = this.field_427.getMeasuredHeight();
            var10 = var17.bottomMargin + var9 + var5 + var2;
        } else {
            var10 = var2;
        }

        label190: {
            if (!var1) {
                var2 = var3;
                var5 = var4;
                if (!var16) {
                    break label190;
                }
            }

            TextView var23;
            if (var1) {
                var23 = this.field_426;
            } else {
                var23 = this.field_427;
            }

            TextView var18;
            if (var16) {
                var18 = this.field_427;
            } else {
                var18 = this.field_426;
            }

            var17 = (Toolbar.class_262)var23.getLayoutParams();
            Toolbar.class_262 var24 = (Toolbar.class_262)var18.getLayoutParams();
            boolean var20;
            if ((!var1 || this.field_426.getMeasuredWidth() <= 0) && (!var16 || this.field_427.getMeasuredWidth() <= 0)) {
                var20 = false;
            } else {
                var20 = true;
            }

            switch(this.field_444 & 112) {
            case 48:
                var2 = this.getPaddingTop();
                var2 = var17.topMargin + var2 + this.field_439;
                break;
            case 80:
                var2 = var14 - var15 - var24.bottomMargin - this.field_440 - var10;
                break;
            default:
                var2 = (var14 - var13 - var15 - var10) / 2;
                if (var2 < var17.topMargin + this.field_439) {
                    var2 = var17.topMargin + this.field_439;
                } else {
                    var5 = var14 - var15 - var10 - var2 - var13;
                    if (var5 < var17.bottomMargin + this.field_440) {
                        var2 = Math.max(0, var2 - (var24.bottomMargin + this.field_440 - var5));
                    }
                }

                var2 += var13;
            }

            int var22;
            if (var8) {
                if (var20) {
                    var5 = this.field_437;
                } else {
                    var5 = 0;
                }

                var5 -= var19[1];
                var4 -= Math.max(0, var5);
                var19[1] = Math.max(0, -var5);
                if (var1) {
                    var17 = (Toolbar.class_262)this.field_426.getLayoutParams();
                    var5 = var4 - this.field_426.getMeasuredWidth();
                    var10 = this.field_426.getMeasuredHeight() + var2;
                    this.field_426.layout(var5, var2, var4, var10);
                    var22 = this.field_438;
                    var2 = var10 + var17.bottomMargin;
                    var5 -= var22;
                } else {
                    var5 = var4;
                }

                if (var16) {
                    var17 = (Toolbar.class_262)this.field_427.getLayoutParams();
                    var22 = var17.topMargin + var2;
                    var2 = this.field_427.getMeasuredWidth();
                    var10 = this.field_427.getMeasuredHeight();
                    this.field_427.layout(var4 - var2, var22, var4, var10 + var22);
                    var22 = this.field_438;
                    var2 = var17.bottomMargin;
                    var2 = var4 - var22;
                } else {
                    var2 = var4;
                }

                if (var20) {
                    var2 = Math.min(var5, var2);
                } else {
                    var2 = var4;
                }

                var5 = var2;
                var2 = var3;
            } else {
                if (var20) {
                    var5 = this.field_437;
                } else {
                    var5 = 0;
                }

                var5 -= var19[0];
                var3 += Math.max(0, var5);
                var19[0] = Math.max(0, -var5);
                if (var1) {
                    var17 = (Toolbar.class_262)this.field_426.getLayoutParams();
                    var5 = this.field_426.getMeasuredWidth() + var3;
                    var22 = this.field_426.getMeasuredHeight() + var2;
                    this.field_426.layout(var3, var2, var5, var22);
                    var10 = this.field_438;
                    var2 = var17.bottomMargin + var22;
                    var22 = var5 + var10;
                } else {
                    var22 = var3;
                }

                if (var16) {
                    var17 = (Toolbar.class_262)this.field_427.getLayoutParams();
                    var5 = var2 + var17.topMargin;
                    var2 = this.field_427.getMeasuredWidth() + var3;
                    var10 = this.field_427.getMeasuredHeight();
                    this.field_427.layout(var3, var5, var2, var10 + var5);
                    var10 = this.field_438;
                    var5 = var17.bottomMargin;
                    var10 += var2;
                } else {
                    var10 = var3;
                }

                var2 = var3;
                var5 = var4;
                if (var20) {
                    var2 = Math.max(var22, var10);
                    var5 = var4;
                }
            }
        }

        this.method_476(this.field_410, 3);
        var4 = this.field_410.size();

        for(var3 = 0; var3 < var4; ++var3) {
            var2 = this.method_472((View)this.field_410.get(var3), var2, var19, var6);
        }

        this.method_476(this.field_410, 5);
        var4 = this.field_410.size();

        for(var3 = 0; var3 < var4; ++var3) {
            var5 = this.method_480((View)this.field_410.get(var3), var5, var19, var6);
        }

        this.method_476(this.field_410, 1);
        var4 = this.method_473(this.field_410, var19);
        var3 = (var11 - var7 - var12) / 2 + var7 - var4 / 2;
        var4 += var3;
        if (var3 >= var2) {
            var2 = var3;
            if (var4 > var5) {
                var2 = var3 - (var4 - var5);
            }
        }

        var5 = this.field_410.size();
        byte var21 = 0;
        var3 = var2;

        for(var2 = var21; var2 < var5; ++var2) {
            var3 = this.method_472((View)this.field_410.get(var2), var3, var19, var6);
        }

        this.field_410.clear();
    }

    protected void onMeasure(int var1, int var2) {
        int[] var14 = this.field_412;
        byte var7;
        byte var8;
        if (class_105.method_912(this)) {
            var8 = 1;
            var7 = 0;
        } else {
            var8 = 0;
            var7 = 1;
        }

        int var3 = 0;
        int var4;
        int var5;
        int var6;
        if (this.method_477(this.field_428)) {
            this.method_474(this.field_428, var1, 0, var2, 0, this.field_436);
            var3 = this.field_428.getMeasuredWidth();
            var5 = this.method_479(this.field_428);
            var6 = Math.max(0, this.field_428.getMeasuredHeight() + this.method_481(this.field_428));
            var4 = View.combineMeasuredStates(0, this.field_428.getMeasuredState());
            var3 += var5;
        } else {
            var6 = 0;
            var4 = 0;
        }

        int var9 = var3;
        var5 = var6;
        var3 = var4;
        if (this.method_477(this.field_421)) {
            this.method_474(this.field_421, var1, 0, var2, 0, this.field_436);
            var9 = this.field_421.getMeasuredWidth() + this.method_479(this.field_421);
            var5 = Math.max(var6, this.field_421.getMeasuredHeight() + this.method_481(this.field_421));
            var3 = View.combineMeasuredStates(var4, this.field_421.getMeasuredState());
        }

        var4 = this.getCurrentContentInsetStart();
        int var10 = Math.max(var4, var9) + 0;
        var14[var8] = Math.max(0, var4 - var9);
        int var16 = 0;
        var6 = var5;
        var4 = var3;
        if (this.method_477(this.field_425)) {
            this.method_474(this.field_425, var1, var10, var2, 0, this.field_436);
            var16 = this.field_425.getMeasuredWidth() + this.method_479(this.field_425);
            var6 = Math.max(var5, this.field_425.getMeasuredHeight() + this.method_481(this.field_425));
            var4 = View.combineMeasuredStates(var3, this.field_425.getMeasuredState());
        }

        var3 = this.getCurrentContentInsetEnd();
        var5 = var10 + Math.max(var3, var16);
        var14[var7] = Math.max(0, var3 - var16);
        var16 = var5;
        int var15 = var6;
        var3 = var4;
        if (this.method_477(this.field_422)) {
            var16 = var5 + this.method_471(this.field_422, var1, var5, var2, 0, var14);
            var15 = Math.max(var6, this.field_422.getMeasuredHeight() + this.method_481(this.field_422));
            var3 = View.combineMeasuredStates(var4, this.field_422.getMeasuredState());
        }

        var5 = var16;
        var4 = var15;
        var6 = var3;
        if (this.method_477(this.field_429)) {
            var5 = var16 + this.method_471(this.field_429, var1, var16, var2, 0, var14);
            var4 = Math.max(var15, this.field_429.getMeasuredHeight() + this.method_481(this.field_429));
            var6 = View.combineMeasuredStates(var3, this.field_429.getMeasuredState());
        }

        var9 = this.getChildCount();
        var7 = 0;
        var3 = var6;
        var6 = var7;

        for(var16 = var5; var6 < var9; ++var6) {
            View var13 = this.getChildAt(var6);
            if (((Toolbar.class_262)var13.getLayoutParams()).field_558 == 0 && this.method_477(var13)) {
                var16 += this.method_471(var13, var1, var16, var2, 0, var14);
                var4 = Math.max(var4, var13.getMeasuredHeight() + this.method_481(var13));
                var3 = View.combineMeasuredStates(var3, var13.getMeasuredState());
            }
        }

        var15 = 0;
        var6 = 0;
        int var11 = this.field_439 + this.field_440;
        int var12 = this.field_437 + this.field_438;
        var5 = var3;
        if (this.method_477(this.field_426)) {
            this.method_471(this.field_426, var1, var16 + var12, var2, var11, var14);
            var15 = this.field_426.getMeasuredWidth() + this.method_479(this.field_426);
            var6 = this.field_426.getMeasuredHeight() + this.method_481(this.field_426);
            var5 = View.combineMeasuredStates(var3, this.field_426.getMeasuredState());
        }

        var9 = var15;
        var10 = var6;
        var3 = var5;
        if (this.method_477(this.field_427)) {
            var9 = Math.max(var15, this.method_471(this.field_427, var1, var16 + var12, var2, var11 + var6, var14));
            var10 = var6 + this.field_427.getMeasuredHeight() + this.method_481(this.field_427);
            var3 = View.combineMeasuredStates(var5, this.field_427.getMeasuredState());
        }

        var6 = Math.max(var4, var10);
        var10 = this.getPaddingLeft();
        var15 = this.getPaddingRight();
        var5 = this.getPaddingTop();
        var4 = this.getPaddingBottom();
        var15 = View.resolveSizeAndState(Math.max(var9 + var16 + var10 + var15, this.getSuggestedMinimumWidth()), var1, -16777216 & var3);
        var1 = View.resolveSizeAndState(Math.max(var5 + var4 + var6, this.getSuggestedMinimumHeight()), var2, var3 << 16);
        if (this.method_488()) {
            var1 = 0;
        }

        this.setMeasuredDimension(var15, var1);
    }

    protected void onRestoreInstanceState(Parcelable var1) {
        if (!(var1 instanceof Toolbar.class_254)) {
            super.onRestoreInstanceState(var1);
        } else {
            Toolbar.class_254 var2 = (Toolbar.class_254)var1;
            super.onRestoreInstanceState(var2.a());
            class_162 var3;
            if (this.field_425 != null) {
                var3 = this.field_425.method_300();
            } else {
                var3 = null;
            }

            if (var2.field_758 != 0 && this.field_416 != null && var3 != null) {
                MenuItem var4 = var3.findItem(var2.field_758);
                if (var4 != null) {
                    var4.expandActionView();
                }
            }

            if (var2.field_759) {
                this.method_487();
            }
        }

    }

    public void onRtlPropertiesChanged(int var1) {
        boolean var2 = true;
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(var1);
        }

        this.method_489();
        class_107 var3 = this.field_441;
        if (var1 != 1) {
            var2 = false;
        }

        var3.method_938(var2);
    }

    protected Parcelable onSaveInstanceState() {
        Toolbar.class_254 var1 = new Toolbar.class_254(super.onSaveInstanceState());
        if (this.field_416 != null && this.field_416.field_872 != null) {
            var1.field_758 = this.field_416.field_872.getItemId();
        }

        var1.field_759 = this.method_494();
        return var1;
    }

    public boolean onTouchEvent(MotionEvent var1) {
        int var2 = var1.getActionMasked();
        if (var2 == 0) {
            this.field_408 = false;
        }

        if (!this.field_408) {
            boolean var3 = super.onTouchEvent(var1);
            if (var2 == 0 && !var3) {
                this.field_408 = true;
            }
        }

        if (var2 == 1 || var2 == 3) {
            this.field_408 = false;
        }

        return true;
    }

    public void setCollapsible(boolean var1) {
        this.field_419 = var1;
        this.requestLayout();
    }

    public void setContentInsetEndWithActions(int var1) {
        int var2 = var1;
        if (var1 < 0) {
            var2 = Integer.MIN_VALUE;
        }

        if (var2 != this.field_443) {
            this.field_443 = var2;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }

    }

    public void setContentInsetStartWithNavigation(int var1) {
        int var2 = var1;
        if (var1 < 0) {
            var2 = Integer.MIN_VALUE;
        }

        if (var2 != this.field_442) {
            this.field_442 = var2;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }

    }

    public void setLogo(int var1) {
        this.setLogo(class_39.method_382(this.getContext(), var1));
    }

    public void setLogo(Drawable var1) {
        if (var1 != null) {
            this.method_483();
            if (!this.method_482(this.field_429)) {
                this.method_475(this.field_429, true);
            }
        } else if (this.field_429 != null && this.method_482(this.field_429)) {
            this.removeView(this.field_429);
            this.field_411.remove(this.field_429);
        }

        if (this.field_429 != null) {
            this.field_429.setImageDrawable(var1);
        }

    }

    public void setLogoDescription(int var1) {
        this.setLogoDescription(this.getContext().getText(var1));
    }

    public void setLogoDescription(CharSequence var1) {
        if (!TextUtils.isEmpty(var1)) {
            this.method_483();
        }

        if (this.field_429 != null) {
            this.field_429.setContentDescription(var1);
        }

    }

    public void setNavigationContentDescription(int var1) {
        CharSequence var2;
        if (var1 != 0) {
            var2 = this.getContext().getText(var1);
        } else {
            var2 = null;
        }

        this.setNavigationContentDescription(var2);
    }

    public void setNavigationContentDescription(CharSequence var1) {
        if (!TextUtils.isEmpty(var1)) {
            this.method_486();
        }

        if (this.field_428 != null) {
            this.field_428.setContentDescription(var1);
        }

    }

    public void setNavigationIcon(int var1) {
        this.setNavigationIcon(class_39.method_382(this.getContext(), var1));
    }

    public void setNavigationIcon(Drawable var1) {
        if (var1 != null) {
            this.method_486();
            if (!this.method_482(this.field_428)) {
                this.method_475(this.field_428, true);
            }
        } else if (this.field_428 != null && this.method_482(this.field_428)) {
            this.removeView(this.field_428);
            this.field_411.remove(this.field_428);
        }

        if (this.field_428 != null) {
            this.field_428.setImageDrawable(var1);
        }

    }

    public void setNavigationOnClickListener(OnClickListener var1) {
        this.method_486();
        this.field_428.setOnClickListener(var1);
    }

    public void setOnMenuItemClickListener(Toolbar.class_263 var1) {
        this.field_424 = var1;
    }

    public void setOverflowIcon(Drawable var1) {
        this.method_484();
        this.field_425.setOverflowIcon(var1);
    }

    public void setPopupTheme(int var1) {
        if (this.field_433 != var1) {
            this.field_433 = var1;
            if (var1 == 0) {
                this.field_432 = this.getContext();
            } else {
                this.field_432 = new ContextThemeWrapper(this.getContext(), var1);
            }
        }

    }

    public void setSubtitle(int var1) {
        this.setSubtitle(this.getContext().getText(var1));
    }

    public void setSubtitle(CharSequence var1) {
        if (!TextUtils.isEmpty(var1)) {
            if (this.field_427 == null) {
                Context var2 = this.getContext();
                this.field_427 = new class_63(var2);
                this.field_427.setSingleLine();
                this.field_427.setEllipsize(TruncateAt.END);
                if (this.field_435 != 0) {
                    this.field_427.setTextAppearance(var2, this.field_435);
                }

                if (this.field_407 != 0) {
                    this.field_427.setTextColor(this.field_407);
                }
            }

            if (!this.method_482(this.field_427)) {
                this.method_475(this.field_427, true);
            }
        } else if (this.field_427 != null && this.method_482(this.field_427)) {
            this.removeView(this.field_427);
            this.field_411.remove(this.field_427);
        }

        if (this.field_427 != null) {
            this.field_427.setText(var1);
        }

        this.field_446 = var1;
    }

    public void setSubtitleTextColor(int var1) {
        this.field_407 = var1;
        if (this.field_427 != null) {
            this.field_427.setTextColor(var1);
        }

    }

    public void setTitle(int var1) {
        this.setTitle(this.getContext().getText(var1));
    }

    public void setTitle(CharSequence var1) {
        if (!TextUtils.isEmpty(var1)) {
            if (this.field_426 == null) {
                Context var2 = this.getContext();
                this.field_426 = new class_63(var2);
                this.field_426.setSingleLine();
                this.field_426.setEllipsize(TruncateAt.END);
                if (this.field_434 != 0) {
                    this.field_426.setTextAppearance(var2, this.field_434);
                }

                if (this.field_406 != 0) {
                    this.field_426.setTextColor(this.field_406);
                }
            }

            if (!this.method_482(this.field_426)) {
                this.method_475(this.field_426, true);
            }
        } else if (this.field_426 != null && this.method_482(this.field_426)) {
            this.removeView(this.field_426);
            this.field_411.remove(this.field_426);
        }

        if (this.field_426 != null) {
            this.field_426.setText(var1);
        }

        this.field_445 = var1;
    }

    public void setTitleMarginBottom(int var1) {
        this.field_440 = var1;
        this.requestLayout();
    }

    public void setTitleMarginEnd(int var1) {
        this.field_438 = var1;
        this.requestLayout();
    }

    public void setTitleMarginStart(int var1) {
        this.field_437 = var1;
        this.requestLayout();
    }

    public void setTitleMarginTop(int var1) {
        this.field_439 = var1;
        this.requestLayout();
    }

    public void setTitleTextColor(int var1) {
        this.field_406 = var1;
        if (this.field_426 != null) {
            this.field_426.setTextColor(var1);
        }

    }

    private class class_261 implements class_23 {
        // $FF: renamed from: a android.support.v7.view.menu.g
        class_162 field_871;
        // $FF: renamed from: b android.support.v7.view.menu.h
        class_168 field_872;

        // $FF: renamed from: a (android.content.Context, android.support.v7.view.menu.g) void
        public void method_139(Context var1, class_162 var2) {
            if (this.field_871 != null && this.field_872 != null) {
                this.field_871.method_1368(this.field_872);
            }

            this.field_871 = var2;
        }

        // $FF: renamed from: a (android.support.v7.view.menu.g, boolean) void
        public void method_140(class_162 var1, boolean var2) {
        }

        // $FF: renamed from: a (android.support.v7.view.menu.m$a) void
        public void method_141(android.support.v7.view.menu.m$a var1) {
        }

        // $FF: renamed from: a (android.support.v7.view.menu.g, android.support.v7.view.menu.h) boolean
        public boolean method_142(class_162 var1, class_168 var2) {
            Toolbar.this.method_498();
            if (Toolbar.this.field_421.getParent() != Toolbar.this) {
                Toolbar.this.addView(Toolbar.this.field_421);
            }

            Toolbar.this.field_422 = var2.getActionView();
            this.field_872 = var2;
            if (Toolbar.this.field_422.getParent() != Toolbar.this) {
                Toolbar.class_262 var3 = Toolbar.this.method_499();
                var3.a = 8388611 | Toolbar.this.field_423 & 112;
                var3.field_558 = 2;
                Toolbar.this.field_422.setLayoutParams(var3);
                Toolbar.this.addView(Toolbar.this.field_422);
            }

            Toolbar.this.method_500();
            Toolbar.this.requestLayout();
            var2.method_1433(true);
            if (Toolbar.this.field_422 instanceof class_22) {
                ((class_22)Toolbar.this.field_422).method_137();
            }

            return true;
        }

        // $FF: renamed from: a (android.support.v7.view.menu.s) boolean
        public boolean method_143(class_163 var1) {
            return false;
        }

        // $FF: renamed from: b (boolean) void
        public void method_144(boolean var1) {
            boolean var4 = false;
            if (this.field_872 != null) {
                boolean var2 = var4;
                if (this.field_871 != null) {
                    int var5 = this.field_871.size();
                    int var3 = 0;

                    while(true) {
                        var2 = var4;
                        if (var3 >= var5) {
                            break;
                        }

                        if (this.field_871.getItem(var3) == this.field_872) {
                            var2 = true;
                            break;
                        }

                        ++var3;
                    }
                }

                if (!var2) {
                    this.method_146(this.field_871, this.field_872);
                }
            }

        }

        // $FF: renamed from: b () boolean
        public boolean method_145() {
            return false;
        }

        // $FF: renamed from: b (android.support.v7.view.menu.g, android.support.v7.view.menu.h) boolean
        public boolean method_146(class_162 var1, class_168 var2) {
            if (Toolbar.this.field_422 instanceof class_22) {
                ((class_22)Toolbar.this.field_422).method_138();
            }

            Toolbar.this.removeView(Toolbar.this.field_422);
            Toolbar.this.removeView(Toolbar.this.field_421);
            Toolbar.this.field_422 = null;
            Toolbar.this.method_501();
            this.field_872 = null;
            Toolbar.this.requestLayout();
            var2.method_1433(false);
            return true;
        }
    }

    public static class class_262 extends android.support.v7.app.a$a {
        // $FF: renamed from: b int
        int field_558 = 0;

        public class_262(int var1, int var2) {
            super(var1, var2);
            this.a = 8388627;
        }

        public class_262(Context var1, AttributeSet var2) {
            super(var1, var2);
        }

        public class_262(android.support.v7.app.a$a var1) {
            super(var1);
        }

        public class_262(Toolbar.class_262 var1) {
            super((android.support.v7.app.a$a)var1);
            this.field_558 = var1.field_558;
        }

        public class_262(LayoutParams var1) {
            super(var1);
        }

        public class_262(MarginLayoutParams var1) {
            super((LayoutParams)var1);
            this.method_588(var1);
        }

        // $FF: renamed from: a (android.view.ViewGroup.MarginLayoutParams) void
        void method_588(MarginLayoutParams var1) {
            this.leftMargin = var1.leftMargin;
            this.topMargin = var1.topMargin;
            this.rightMargin = var1.rightMargin;
            this.bottomMargin = var1.bottomMargin;
        }
    }

    public interface class_263 {
        // $FF: renamed from: a (android.view.MenuItem) boolean
        boolean method_33(MenuItem var1);
    }

    public static class class_254 extends class_89 {
        public static final Creator CREATOR = new ClassLoaderCreator() {
            // $FF: renamed from: a (android.os.Parcel) android.support.v7.widget.Toolbar$d
            public Toolbar.class_254 method_428(Parcel var1) {
                return new Toolbar.class_254(var1, (ClassLoader)null);
            }

            // $FF: renamed from: a (android.os.Parcel, java.lang.ClassLoader) android.support.v7.widget.Toolbar$d
            public Toolbar.class_254 method_429(Parcel var1, ClassLoader var2) {
                return new Toolbar.class_254(var1, var2);
            }

            // $FF: renamed from: a (int) android.support.v7.widget.Toolbar$d[]
            public Toolbar.class_254[] method_430(int var1) {
                return new Toolbar.class_254[var1];
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1) {
                return this.method_428(var1);
            }

            // $FF: synthetic method
            public Object createFromParcel(Parcel var1, ClassLoader var2) {
                return this.method_429(var1, var2);
            }

            // $FF: synthetic method
            public Object[] newArray(int var1) {
                return this.method_430(var1);
            }
        };
        // $FF: renamed from: b int
        int field_758;
        // $FF: renamed from: c boolean
        boolean field_759;

        public class_254(Parcel var1, ClassLoader var2) {
            super(var1, var2);
            this.field_758 = var1.readInt();
            boolean var3;
            if (var1.readInt() != 0) {
                var3 = true;
            } else {
                var3 = false;
            }

            this.field_759 = var3;
        }

        public class_254(Parcelable var1) {
            super(var1);
        }

        public void writeToParcel(Parcel var1, int var2) {
            super.writeToParcel(var1, var2);
            var1.writeInt(this.field_758);
            byte var3;
            if (this.field_759) {
                var3 = 1;
            } else {
                var3 = 0;
            }

            var1.writeInt(var3);
        }
    }
}
