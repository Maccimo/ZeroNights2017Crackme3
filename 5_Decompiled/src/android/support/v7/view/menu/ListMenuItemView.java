package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.h.class_146;
import android.support.v7.a.a$a;
import android.support.v7.a.a$f;
import android.support.v7.a.a$g;
import android.support.v7.a.a$j;
import android.support.v7.widget.class_97;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements n$a {
    // $FF: renamed from: a android.support.v7.view.menu.h
    private class_168 field_909;
    // $FF: renamed from: b android.widget.ImageView
    private ImageView field_910;
    // $FF: renamed from: c android.widget.RadioButton
    private RadioButton field_911;
    // $FF: renamed from: d android.widget.TextView
    private TextView field_912;
    // $FF: renamed from: e android.widget.CheckBox
    private CheckBox field_913;
    // $FF: renamed from: f android.widget.TextView
    private TextView field_914;
    // $FF: renamed from: g android.widget.ImageView
    private ImageView field_915;
    // $FF: renamed from: h android.graphics.drawable.Drawable
    private Drawable field_916;
    // $FF: renamed from: i int
    private int field_917;
    // $FF: renamed from: j android.content.Context
    private Context field_918;
    // $FF: renamed from: k boolean
    private boolean field_919;
    // $FF: renamed from: l android.graphics.drawable.Drawable
    private Drawable field_920;
    // $FF: renamed from: m int
    private int field_921;
    // $FF: renamed from: n android.view.LayoutInflater
    private LayoutInflater field_922;
    // $FF: renamed from: o boolean
    private boolean field_923;

    public ListMenuItemView(Context var1, AttributeSet var2) {
        this(var1, var2, a$a.listMenuViewStyle);
    }

    public ListMenuItemView(Context var1, AttributeSet var2, int var3) {
        super(var1, var2);
        class_97 var4 = class_97.method_867(this.getContext(), var2, a$j.MenuView, var3, 0);
        this.field_916 = var4.method_871(a$j.MenuView_android_itemBackground);
        this.field_917 = var4.method_884(a$j.MenuView_android_itemTextAppearance, -1);
        this.field_919 = var4.method_873(a$j.MenuView_preserveIconSpacing, false);
        this.field_918 = var1;
        this.field_920 = var4.method_871(a$j.MenuView_subMenuArrow);
        var4.method_872();
    }

    // $FF: renamed from: b () void
    private void method_932() {
        this.field_910 = (ImageView)this.getInflater().inflate(a$g.abc_list_menu_item_icon, this, false);
        this.addView(this.field_910, 0);
    }

    // $FF: renamed from: c () void
    private void method_933() {
        this.field_911 = (RadioButton)this.getInflater().inflate(a$g.abc_list_menu_item_radio, this, false);
        this.addView(this.field_911);
    }

    // $FF: renamed from: d () void
    private void method_934() {
        this.field_913 = (CheckBox)this.getInflater().inflate(a$g.abc_list_menu_item_checkbox, this, false);
        this.addView(this.field_913);
    }

    private LayoutInflater getInflater() {
        if (this.field_922 == null) {
            this.field_922 = LayoutInflater.from(this.getContext());
        }

        return this.field_922;
    }

    private void setSubMenuArrowVisible(boolean var1) {
        if (this.field_915 != null) {
            ImageView var3 = this.field_915;
            byte var2;
            if (var1) {
                var2 = 0;
            } else {
                var2 = 8;
            }

            var3.setVisibility(var2);
        }

    }

    // $FF: renamed from: a (android.support.v7.view.menu.h, int) void
    public void method_8(class_168 var1, int var2) {
        this.field_909 = var1;
        this.field_921 = var2;
        byte var3;
        if (var1.isVisible()) {
            var3 = 0;
        } else {
            var3 = 8;
        }

        this.setVisibility(var3);
        this.setTitle(var1.method_1421(this));
        this.setCheckable(var1.isCheckable());
        this.method_935(var1.method_1434(), var1.method_1430());
        this.setIcon(var1.getIcon());
        this.setEnabled(var1.isEnabled());
        this.setSubMenuArrowVisible(var1.hasSubMenu());
        this.setContentDescription(var1.getContentDescription());
    }

    // $FF: renamed from: a (boolean, char) void
    public void method_935(boolean var1, char var2) {
        byte var3;
        if (var1 && this.field_909.method_1434()) {
            var3 = 0;
        } else {
            var3 = 8;
        }

        if (var3 == 0) {
            this.field_914.setText(this.field_909.method_1432());
        }

        if (this.field_914.getVisibility() != var3) {
            this.field_914.setVisibility(var3);
        }

    }

    // $FF: renamed from: a () boolean
    public boolean method_9() {
        return false;
    }

    public class_168 getItemData() {
        return this.field_909;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        class_146.method_1218(this, this.field_916);
        this.field_912 = (TextView)this.findViewById(a$f.title);
        if (this.field_917 != -1) {
            this.field_912.setTextAppearance(this.field_918, this.field_917);
        }

        this.field_914 = (TextView)this.findViewById(a$f.shortcut);
        this.field_915 = (ImageView)this.findViewById(a$f.submenuarrow);
        if (this.field_915 != null) {
            this.field_915.setImageDrawable(this.field_920);
        }

    }

    protected void onMeasure(int var1, int var2) {
        if (this.field_910 != null && this.field_919) {
            LayoutParams var4 = this.getLayoutParams();
            android.widget.LinearLayout.LayoutParams var3 = (android.widget.LinearLayout.LayoutParams)this.field_910.getLayoutParams();
            if (var4.height > 0 && var3.width <= 0) {
                var3.width = var4.height;
            }
        }

        super.onMeasure(var1, var2);
    }

    public void setCheckable(boolean var1) {
        if (var1 || this.field_911 != null || this.field_913 != null) {
            Object var3;
            Object var4;
            if (this.field_909.method_1435()) {
                if (this.field_911 == null) {
                    this.method_933();
                }

                var3 = this.field_911;
                var4 = this.field_913;
            } else {
                if (this.field_913 == null) {
                    this.method_934();
                }

                var3 = this.field_913;
                var4 = this.field_911;
            }

            if (var1) {
                ((CompoundButton)var3).setChecked(this.field_909.isChecked());
                byte var2;
                if (var1) {
                    var2 = 0;
                } else {
                    var2 = 8;
                }

                if (((CompoundButton)var3).getVisibility() != var2) {
                    ((CompoundButton)var3).setVisibility(var2);
                }

                if (var4 != null && ((CompoundButton)var4).getVisibility() != 8) {
                    ((CompoundButton)var4).setVisibility(8);
                }
            } else {
                if (this.field_913 != null) {
                    this.field_913.setVisibility(8);
                }

                if (this.field_911 != null) {
                    this.field_911.setVisibility(8);
                }
            }
        }

    }

    public void setChecked(boolean var1) {
        Object var2;
        if (this.field_909.method_1435()) {
            if (this.field_911 == null) {
                this.method_933();
            }

            var2 = this.field_911;
        } else {
            if (this.field_913 == null) {
                this.method_934();
            }

            var2 = this.field_913;
        }

        ((CompoundButton)var2).setChecked(var1);
    }

    public void setForceShowIcon(boolean var1) {
        this.field_923 = var1;
        this.field_919 = var1;
    }

    public void setIcon(Drawable var1) {
        boolean var2;
        if (!this.field_909.method_1437() && !this.field_923) {
            var2 = false;
        } else {
            var2 = true;
        }

        if ((var2 || this.field_919) && (this.field_910 != null || var1 != null || this.field_919)) {
            if (this.field_910 == null) {
                this.method_932();
            }

            if (var1 == null && !this.field_919) {
                this.field_910.setVisibility(8);
            } else {
                ImageView var3 = this.field_910;
                if (!var2) {
                    var1 = null;
                }

                var3.setImageDrawable(var1);
                if (this.field_910.getVisibility() != 0) {
                    this.field_910.setVisibility(0);
                }
            }
        }

    }

    public void setTitle(CharSequence var1) {
        if (var1 != null) {
            this.field_912.setText(var1);
            if (this.field_912.getVisibility() != 0) {
                this.field_912.setVisibility(0);
            }
        } else if (this.field_912.getVisibility() != 8) {
            this.field_912.setVisibility(8);
        }

    }
}
