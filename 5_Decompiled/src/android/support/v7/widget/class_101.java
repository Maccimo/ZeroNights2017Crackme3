package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a$e;
import android.support.v7.a.a$h;
import android.support.v7.a.a$j;
import android.support.v7.b.a.class_39;
import android.support.v7.view.menu.class_169;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

// $FF: renamed from: android.support.v7.widget.al
public class class_101 implements class_6 {
    // $FF: renamed from: a android.support.v7.widget.Toolbar
    Toolbar field_838;
    // $FF: renamed from: b java.lang.CharSequence
    CharSequence field_839;
    // $FF: renamed from: c android.view.Window.Callback
    Callback field_840;
    // $FF: renamed from: d boolean
    boolean field_841;
    // $FF: renamed from: e int
    private int field_842;
    // $FF: renamed from: f android.view.View
    private View field_843;
    // $FF: renamed from: g android.graphics.drawable.Drawable
    private Drawable field_844;
    // $FF: renamed from: h android.graphics.drawable.Drawable
    private Drawable field_845;
    // $FF: renamed from: i android.graphics.drawable.Drawable
    private Drawable field_846;
    // $FF: renamed from: j boolean
    private boolean field_847;
    // $FF: renamed from: k java.lang.CharSequence
    private CharSequence field_848;
    // $FF: renamed from: l java.lang.CharSequence
    private CharSequence field_849;
    // $FF: renamed from: m int
    private int field_850;
    // $FF: renamed from: n int
    private int field_851;
    // $FF: renamed from: o android.graphics.drawable.Drawable
    private Drawable field_852;

    public class_101(Toolbar var1, boolean var2) {
        this(var1, var2, a$h.abc_action_bar_up_description, a$e.abc_ic_ab_back_material);
    }

    public class_101(Toolbar var1, boolean var2, int var3, int var4) {
        this.field_850 = 0;
        this.field_851 = 0;
        this.field_838 = var1;
        this.field_839 = var1.getTitle();
        this.field_848 = var1.getSubtitle();
        boolean var6;
        if (this.field_839 != null) {
            var6 = true;
        } else {
            var6 = false;
        }

        this.field_847 = var6;
        this.field_846 = var1.getNavigationIcon();
        class_97 var8 = class_97.method_867(var1.getContext(), (AttributeSet)null, a$j.ActionBar, android.support.v7.a.a$a.actionBarStyle, 0);
        this.field_852 = var8.method_871(a$j.ActionBar_homeAsUpIndicator);
        if (var2) {
            CharSequence var7 = var8.method_875(a$j.ActionBar_title);
            if (!TextUtils.isEmpty(var7)) {
                this.method_894(var7);
            }

            var7 = var8.method_875(a$j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(var7)) {
                this.method_897(var7);
            }

            Drawable var9 = var8.method_871(a$j.ActionBar_logo);
            if (var9 != null) {
                this.method_893(var9);
            }

            var9 = var8.method_871(a$j.ActionBar_icon);
            if (var9 != null) {
                this.method_23(var9);
            }

            if (this.field_846 == null && this.field_852 != null) {
                this.method_896(this.field_852);
            }

            this.method_898(var8.method_869(a$j.ActionBar_displayOptions, 0));
            var4 = var8.method_884(a$j.ActionBar_customNavigationLayout, 0);
            if (var4 != 0) {
                this.method_891(LayoutInflater.from(this.field_838.getContext()).inflate(var4, this.field_838, false));
                this.method_898(this.field_842 | 16);
            }

            var4 = var8.method_882(a$j.ActionBar_height, 0);
            if (var4 > 0) {
                LayoutParams var10 = this.field_838.getLayoutParams();
                var10.height = var4;
                this.field_838.setLayoutParams(var10);
            }

            int var5 = var8.method_878(a$j.ActionBar_contentInsetStart, -1);
            var4 = var8.method_878(a$j.ActionBar_contentInsetEnd, -1);
            if (var5 >= 0 || var4 >= 0) {
                this.field_838.method_492(Math.max(var5, 0), Math.max(var4, 0));
            }

            var4 = var8.method_884(a$j.ActionBar_titleTextStyle, 0);
            if (var4 != 0) {
                this.field_838.method_493(this.field_838.getContext(), var4);
            }

            var4 = var8.method_884(a$j.ActionBar_subtitleTextStyle, 0);
            if (var4 != 0) {
                this.field_838.method_495(this.field_838.getContext(), var4);
            }

            var4 = var8.method_884(a$j.ActionBar_popupTheme, 0);
            if (var4 != 0) {
                this.field_838.setPopupTheme(var4);
            }
        } else {
            this.field_842 = this.method_886();
        }

        var8.method_872();
        this.method_895(var3);
        this.field_849 = this.field_838.getNavigationContentDescription();
        this.field_838.setNavigationOnClickListener(new OnClickListener() {
            // $FF: renamed from: a android.support.v7.view.menu.a
            final class_169 field_66;

            {
                this.field_66 = new class_169(class_101.this.field_838.getContext(), 0, 16908332, 0, 0, class_101.this.field_839);
            }

            public void onClick(View var1) {
                if (class_101.this.field_840 != null && class_101.this.field_841) {
                    class_101.this.field_840.onMenuItemSelected(0, this.field_66);
                }

            }
        });
    }

    // $FF: renamed from: c () int
    private int method_886() {
        byte var1 = 11;
        if (this.field_838.getNavigationIcon() != null) {
            var1 = 15;
            this.field_852 = this.field_838.getNavigationIcon();
        }

        return var1;
    }

    // $FF: renamed from: d () void
    private void method_887() {
        Drawable var1 = null;
        if ((this.field_842 & 2) != 0) {
            if ((this.field_842 & 1) != 0) {
                if (this.field_845 != null) {
                    var1 = this.field_845;
                } else {
                    var1 = this.field_844;
                }
            } else {
                var1 = this.field_844;
            }
        }

        this.field_838.setLogo(var1);
    }

    // $FF: renamed from: e () void
    private void method_888() {
        if ((this.field_842 & 4) != 0) {
            Toolbar var2 = this.field_838;
            Drawable var1;
            if (this.field_846 != null) {
                var1 = this.field_846;
            } else {
                var1 = this.field_852;
            }

            var2.setNavigationIcon(var1);
        } else {
            this.field_838.setNavigationIcon((Drawable)null);
        }

    }

    // $FF: renamed from: e (java.lang.CharSequence) void
    private void method_889(CharSequence var1) {
        this.field_839 = var1;
        if ((this.field_842 & 8) != 0) {
            this.field_838.setTitle(var1);
        }

    }

    // $FF: renamed from: f () void
    private void method_890() {
        if ((this.field_842 & 4) != 0) {
            if (TextUtils.isEmpty(this.field_849)) {
                this.field_838.setNavigationContentDescription(this.field_851);
            } else {
                this.field_838.setNavigationContentDescription(this.field_849);
            }
        }

    }

    // $FF: renamed from: a () java.lang.CharSequence
    public CharSequence method_21() {
        return this.field_838.getTitle();
    }

    // $FF: renamed from: a (int) void
    public void method_22(int var1) {
        Drawable var2;
        if (var1 != 0) {
            var2 = class_39.method_382(this.method_892(), var1);
        } else {
            var2 = null;
        }

        this.method_23(var2);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) void
    public void method_23(Drawable var1) {
        this.field_844 = var1;
        this.method_887();
    }

    // $FF: renamed from: a (android.view.View) void
    public void method_891(View var1) {
        if (this.field_843 != null && (this.field_842 & 16) != 0) {
            this.field_838.removeView(this.field_843);
        }

        this.field_843 = var1;
        if (var1 != null && (this.field_842 & 16) != 0) {
            this.field_838.addView(this.field_843);
        }

    }

    // $FF: renamed from: a (android.view.Window.Callback) void
    public void method_24(Callback var1) {
        this.field_840 = var1;
    }

    // $FF: renamed from: a (java.lang.CharSequence) void
    public void method_25(CharSequence var1) {
        if (!this.field_847) {
            this.method_889(var1);
        }

    }

    // $FF: renamed from: b () android.content.Context
    public Context method_892() {
        return this.field_838.getContext();
    }

    // $FF: renamed from: b (int) void
    public void method_26(int var1) {
        Drawable var2;
        if (var1 != 0) {
            var2 = class_39.method_382(this.method_892(), var1);
        } else {
            var2 = null;
        }

        this.method_893(var2);
    }

    // $FF: renamed from: b (android.graphics.drawable.Drawable) void
    public void method_893(Drawable var1) {
        this.field_845 = var1;
        this.method_887();
    }

    // $FF: renamed from: b (java.lang.CharSequence) void
    public void method_894(CharSequence var1) {
        this.field_847 = true;
        this.method_889(var1);
    }

    // $FF: renamed from: c (int) void
    public void method_895(int var1) {
        if (var1 != this.field_851) {
            this.field_851 = var1;
            if (TextUtils.isEmpty(this.field_838.getNavigationContentDescription())) {
                this.method_900(this.field_851);
            }
        }

    }

    // $FF: renamed from: c (android.graphics.drawable.Drawable) void
    public void method_896(Drawable var1) {
        this.field_846 = var1;
        this.method_888();
    }

    // $FF: renamed from: c (java.lang.CharSequence) void
    public void method_897(CharSequence var1) {
        this.field_848 = var1;
        if ((this.field_842 & 8) != 0) {
            this.field_838.setSubtitle(var1);
        }

    }

    // $FF: renamed from: d (int) void
    public void method_898(int var1) {
        int var2 = this.field_842 ^ var1;
        this.field_842 = var1;
        if (var2 != 0) {
            if ((var2 & 4) != 0) {
                if ((var1 & 4) != 0) {
                    this.method_890();
                }

                this.method_888();
            }

            if ((var2 & 3) != 0) {
                this.method_887();
            }

            if ((var2 & 8) != 0) {
                if ((var1 & 8) != 0) {
                    this.field_838.setTitle(this.field_839);
                    this.field_838.setSubtitle(this.field_848);
                } else {
                    this.field_838.setTitle((CharSequence)null);
                    this.field_838.setSubtitle((CharSequence)null);
                }
            }

            if ((var2 & 16) != 0 && this.field_843 != null) {
                if ((var1 & 16) != 0) {
                    this.field_838.addView(this.field_843);
                } else {
                    this.field_838.removeView(this.field_843);
                }
            }
        }

    }

    // $FF: renamed from: d (java.lang.CharSequence) void
    public void method_899(CharSequence var1) {
        this.field_849 = var1;
        this.method_890();
    }

    // $FF: renamed from: e (int) void
    public void method_900(int var1) {
        String var2;
        if (var1 == 0) {
            var2 = null;
        } else {
            var2 = this.method_892().getString(var1);
        }

        this.method_899(var2);
    }
}
