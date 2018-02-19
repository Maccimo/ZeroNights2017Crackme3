package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.b.a.class_51;
import android.support.v4.b.class_47;
import android.support.v4.c.class_81;
import android.support.v4.c.a.class_48;
import android.support.v4.g.class_132;
import android.support.v4.g.class_134;
import android.support.v7.a.a$c;
import android.support.v7.a.a$e;
import android.support.v7.b.a.class_39;
import android.util.Log;
import android.util.TypedValue;
import java.util.WeakHashMap;

// $FF: renamed from: android.support.v7.widget.h
public final class class_74 {
    // $FF: renamed from: a android.graphics.PorterDuff.Mode
    private static final Mode field_682;
    // $FF: renamed from: b android.support.v7.widget.h
    private static class_74 field_683;
    // $FF: renamed from: c android.support.v7.widget.h$b
    private static final h$b field_684;
    // $FF: renamed from: d int[]
    private static final int[] field_685;
    // $FF: renamed from: e int[]
    private static final int[] field_686;
    // $FF: renamed from: f int[]
    private static final int[] field_687;
    // $FF: renamed from: g int[]
    private static final int[] field_688;
    // $FF: renamed from: h int[]
    private static final int[] field_689;
    // $FF: renamed from: i int[]
    private static final int[] field_690;
    // $FF: renamed from: j java.util.WeakHashMap
    private WeakHashMap field_691;
    // $FF: renamed from: k android.support.v4.g.a
    private class_134 field_692;
    // $FF: renamed from: l android.support.v4.g.h
    private class_132 field_693;
    // $FF: renamed from: m java.lang.Object
    private final Object field_694 = new Object();
    // $FF: renamed from: n java.util.WeakHashMap
    private final WeakHashMap field_695 = new WeakHashMap(0);
    // $FF: renamed from: o android.util.TypedValue
    private TypedValue field_696;
    // $FF: renamed from: p boolean
    private boolean field_697;

    static {
        field_682 = Mode.SRC_IN;
        field_684 = new h$b(6);
        field_685 = new int[]{a$e.abc_textfield_search_default_mtrl_alpha, a$e.abc_textfield_default_mtrl_alpha, a$e.abc_ab_share_pack_mtrl_alpha};
        field_686 = new int[]{a$e.abc_ic_commit_search_api_mtrl_alpha, a$e.abc_seekbar_tick_mark_material, a$e.abc_ic_menu_share_mtrl_alpha, a$e.abc_ic_menu_copy_mtrl_am_alpha, a$e.abc_ic_menu_cut_mtrl_alpha, a$e.abc_ic_menu_selectall_mtrl_alpha, a$e.abc_ic_menu_paste_mtrl_am_alpha};
        field_687 = new int[]{a$e.abc_textfield_activated_mtrl_alpha, a$e.abc_textfield_search_activated_mtrl_alpha, a$e.abc_cab_background_top_mtrl_alpha, a$e.abc_text_cursor_material, a$e.abc_text_select_handle_left_mtrl_dark, a$e.abc_text_select_handle_middle_mtrl_dark, a$e.abc_text_select_handle_right_mtrl_dark, a$e.abc_text_select_handle_left_mtrl_light, a$e.abc_text_select_handle_middle_mtrl_light, a$e.abc_text_select_handle_right_mtrl_light};
        field_688 = new int[]{a$e.abc_popup_background_mtrl_mult, a$e.abc_cab_background_internal_bg, a$e.abc_menu_hardkey_panel_mtrl_mult};
        field_689 = new int[]{a$e.abc_tab_indicator_material, a$e.abc_textfield_search_material};
        field_690 = new int[]{a$e.abc_btn_check_material, a$e.abc_btn_radio_material};
    }

    // $FF: renamed from: a (android.util.TypedValue) long
    private static long method_710(TypedValue var0) {
        return (long)var0.assetCookie << 32 | (long)var0.data;
    }

    // $FF: renamed from: a (android.content.Context) android.content.res.ColorStateList
    private ColorStateList method_711(Context var1) {
        return this.method_734(var1, class_94.method_857(var1, android.support.v7.a.a$a.colorButtonNormal));
    }

    // $FF: renamed from: a (int) android.graphics.PorterDuff.Mode
    static Mode method_712(int var0) {
        Mode var1 = null;
        if (var0 == a$e.abc_switch_thumb_material) {
            var1 = Mode.MULTIPLY;
        }

        return var1;
    }

    // $FF: renamed from: a (int, android.graphics.PorterDuff.Mode) android.graphics.PorterDuffColorFilter
    public static PorterDuffColorFilter method_713(int var0, Mode var1) {
        PorterDuffColorFilter var3 = field_684.method_667(var0, var1);
        PorterDuffColorFilter var2 = var3;
        if (var3 == null) {
            var2 = new PorterDuffColorFilter(var0, var1);
            field_684.method_668(var0, var1, var2);
        }

        return var2;
    }

    // $FF: renamed from: a (android.content.res.ColorStateList, android.graphics.PorterDuff.Mode, int[]) android.graphics.PorterDuffColorFilter
    private static PorterDuffColorFilter method_714(ColorStateList var0, Mode var1, int[] var2) {
        PorterDuffColorFilter var3;
        if (var0 != null && var1 != null) {
            var3 = method_713(var0.getColorForState(var2, 0), var1);
        } else {
            var3 = null;
        }

        return var3;
    }

    // $FF: renamed from: a (android.content.Context, int, boolean, android.graphics.drawable.Drawable) android.graphics.drawable.Drawable
    private Drawable method_715(Context var1, int var2, boolean var3, Drawable var4) {
        ColorStateList var5 = this.method_738(var1, var2);
        Drawable var8;
        if (var5 != null) {
            Drawable var6 = var4;
            if (class_67.method_657(var4)) {
                var6 = var4.mutate();
            }

            var6 = class_48.method_532(var6);
            class_48.method_523(var6, var5);
            Mode var7 = method_712(var2);
            var8 = var6;
            if (var7 != null) {
                class_48.method_526(var6, var7);
                var8 = var6;
            }
        } else {
            LayerDrawable var9;
            if (var2 == a$e.abc_seekbar_track_material) {
                var9 = (LayerDrawable)var4;
                method_719(var9.findDrawableByLayerId(16908288), class_94.method_857(var1, android.support.v7.a.a$a.colorControlNormal), field_682);
                method_719(var9.findDrawableByLayerId(16908303), class_94.method_857(var1, android.support.v7.a.a$a.colorControlNormal), field_682);
                method_719(var9.findDrawableByLayerId(16908301), class_94.method_857(var1, android.support.v7.a.a$a.colorControlActivated), field_682);
                var8 = var4;
            } else if (var2 != a$e.abc_ratingbar_material && var2 != a$e.abc_ratingbar_indicator_material && var2 != a$e.abc_ratingbar_small_material) {
                var8 = var4;
                if (!method_723(var1, var2, var4)) {
                    var8 = var4;
                    if (var3) {
                        var8 = null;
                    }
                }
            } else {
                var9 = (LayerDrawable)var4;
                method_719(var9.findDrawableByLayerId(16908288), class_94.method_861(var1, android.support.v7.a.a$a.colorControlNormal), field_682);
                method_719(var9.findDrawableByLayerId(16908303), class_94.method_857(var1, android.support.v7.a.a$a.colorControlActivated), field_682);
                method_719(var9.findDrawableByLayerId(16908301), class_94.method_857(var1, android.support.v7.a.a$a.colorControlActivated), field_682);
                var8 = var4;
            }
        }

        return var8;
    }

    // $FF: renamed from: a (android.content.Context, long) android.graphics.drawable.Drawable
    private Drawable method_716(Context param1, long param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a () android.support.v7.widget.h
    public static class_74 method_717() {
        if (field_683 == null) {
            field_683 = new class_74();
            method_721(field_683);
        }

        return field_683;
    }

    // $FF: renamed from: a (android.content.Context, int, android.content.res.ColorStateList) void
    private void method_718(Context var1, int var2, ColorStateList var3) {
        if (this.field_691 == null) {
            this.field_691 = new WeakHashMap();
        }

        class_132 var5 = (class_132)this.field_691.get(var1);
        class_132 var4 = var5;
        if (var5 == null) {
            var4 = new class_132();
            this.field_691.put(var1, var4);
        }

        var4.method_1117(var2, var3);
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, int, android.graphics.PorterDuff.Mode) void
    private static void method_719(Drawable var0, int var1, Mode var2) {
        Drawable var3 = var0;
        if (class_67.method_657(var0)) {
            var3 = var0.mutate();
        }

        Mode var4 = var2;
        if (var2 == null) {
            var4 = field_682;
        }

        var3.setColorFilter(method_713(var1, var4));
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable, android.support.v7.widget.ai, int[]) void
    static void method_720(Drawable var0, class_95 var1, int[] var2) {
        if (class_67.method_657(var0) && var0.mutate() != var0) {
            Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
        } else {
            if (!var1.field_827 && !var1.field_826) {
                var0.clearColorFilter();
            } else {
                ColorStateList var3;
                if (var1.field_827) {
                    var3 = var1.field_824;
                } else {
                    var3 = null;
                }

                Mode var4;
                if (var1.field_826) {
                    var4 = var1.field_825;
                } else {
                    var4 = field_682;
                }

                var0.setColorFilter(method_714(var3, var4, var2));
            }

            if (VERSION.SDK_INT <= 23) {
                var0.invalidateSelf();
            }
        }

    }

    // $FF: renamed from: a (android.support.v7.widget.h) void
    private static void method_721(class_74 var0) {
        if (VERSION.SDK_INT < 24) {
            var0.method_722("vector", new h$d());
            if (VERSION.SDK_INT >= 11) {
                var0.method_722("animated-vector", new h$a());
            }
        }

    }

    // $FF: renamed from: a (java.lang.String, android.support.v7.widget.h$c) void
    private void method_722(String var1, h$c var2) {
        if (this.field_692 == null) {
            this.field_692 = new class_134();
        }

        this.field_692.put(var1, var2);
    }

    // $FF: renamed from: a (android.content.Context, int, android.graphics.drawable.Drawable) boolean
    static boolean method_723(Context var0, int var1, Drawable var2) {
        boolean var6 = true;
        Mode var7 = field_682;
        int var3;
        int var4;
        boolean var9;
        if (method_726(field_685, var1)) {
            var3 = android.support.v7.a.a$a.colorControlNormal;
            var4 = -1;
            var9 = true;
        } else if (method_726(field_687, var1)) {
            var3 = android.support.v7.a.a$a.colorControlActivated;
            var4 = -1;
            var9 = true;
        } else if (method_726(field_688, var1)) {
            var7 = Mode.MULTIPLY;
            var3 = 16842801;
            var4 = -1;
            var9 = true;
        } else if (var1 == a$e.abc_list_divider_mtrl_alpha) {
            var4 = Math.round(40.8F);
            var3 = 16842800;
            var9 = true;
        } else if (var1 == a$e.abc_dialog_material_background) {
            var3 = 16842801;
            var4 = -1;
            var9 = true;
        } else {
            var9 = false;
            var3 = 0;
            var4 = -1;
        }

        boolean var5;
        if (var9) {
            Drawable var8 = var2;
            if (class_67.method_657(var2)) {
                var8 = var2.mutate();
            }

            var8.setColorFilter(method_713(class_94.method_857(var0, var3), var7));
            var5 = var6;
            if (var4 != -1) {
                var8.setAlpha(var4);
                var5 = var6;
            }
        } else {
            var5 = false;
        }

        return var5;
    }

    // $FF: renamed from: a (android.content.Context, long, android.graphics.drawable.Drawable) boolean
    private boolean method_724(Context param1, long param2, Drawable param4) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) boolean
    private static boolean method_725(Drawable var0) {
        boolean var1;
        if (!(var0 instanceof class_51) && !"android.graphics.drawable.VectorDrawable".equals(var0.getClass().getName())) {
            var1 = false;
        } else {
            var1 = true;
        }

        return var1;
    }

    // $FF: renamed from: a (int[], int) boolean
    private static boolean method_726(int[] var0, int var1) {
        boolean var5 = false;
        int var3 = var0.length;
        int var2 = 0;

        boolean var4;
        while(true) {
            var4 = var5;
            if (var2 >= var3) {
                break;
            }

            if (var0[var2] == var1) {
                var4 = true;
                break;
            }

            ++var2;
        }

        return var4;
    }

    // $FF: renamed from: b (android.content.Context) android.content.res.ColorStateList
    private ColorStateList method_727(Context var1) {
        return this.method_734(var1, 0);
    }

    // $FF: renamed from: c (android.content.Context) android.content.res.ColorStateList
    private ColorStateList method_728(Context var1) {
        return this.method_734(var1, class_94.method_857(var1, android.support.v7.a.a$a.colorAccent));
    }

    // $FF: renamed from: c (android.content.Context, int) android.graphics.drawable.Drawable
    private Drawable method_729(Context var1, int var2) {
        if (this.field_696 == null) {
            this.field_696 = new TypedValue();
        }

        TypedValue var7 = this.field_696;
        var1.getResources().getValue(var2, var7, true);
        long var3 = method_710(var7);
        Object var5 = this.method_716(var1, var3);
        Object var6;
        if (var5 != null) {
            var6 = var5;
        } else {
            if (var2 == a$e.abc_cab_background_top_material) {
                var5 = new LayerDrawable(new Drawable[]{this.method_735(var1, a$e.abc_cab_background_internal_bg), this.method_735(var1, a$e.abc_cab_background_top_mtrl_alpha)});
            }

            var6 = var5;
            if (var5 != null) {
                ((Drawable)var5).setChangingConfigurations(var7.changingConfigurations);
                this.method_724(var1, var3, (Drawable)var5);
                var6 = var5;
            }
        }

        return (Drawable)var6;
    }

    // $FF: renamed from: d (android.content.Context) android.content.res.ColorStateList
    private ColorStateList method_730(Context var1) {
        int[][] var4 = new int[3][];
        int[] var3 = new int[3];
        ColorStateList var2 = class_94.method_860(var1, android.support.v7.a.a$a.colorSwitchThumbNormal);
        if (var2 != null && var2.isStateful()) {
            var4[0] = class_94.field_813;
            var3[0] = var2.getColorForState(var4[0], 0);
            var4[1] = class_94.field_817;
            var3[1] = class_94.method_857(var1, android.support.v7.a.a$a.colorControlActivated);
            var4[2] = class_94.field_820;
            var3[2] = var2.getDefaultColor();
        } else {
            var4[0] = class_94.field_813;
            var3[0] = class_94.method_861(var1, android.support.v7.a.a$a.colorSwitchThumbNormal);
            var4[1] = class_94.field_817;
            var3[1] = class_94.method_857(var1, android.support.v7.a.a$a.colorControlActivated);
            var4[2] = class_94.field_820;
            var3[2] = class_94.method_857(var1, android.support.v7.a.a$a.colorSwitchThumbNormal);
        }

        return new ColorStateList(var4, var3);
    }

    // $FF: renamed from: d (android.content.Context, int) android.graphics.drawable.Drawable
    private Drawable method_731(Context param1, int param2) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: e (android.content.Context, int) android.content.res.ColorStateList
    private ColorStateList method_732(Context var1, int var2) {
        ColorStateList var4;
        if (this.field_691 != null) {
            class_132 var3 = (class_132)this.field_691.get(var1);
            if (var3 != null) {
                var4 = (ColorStateList)var3.method_1111(var2);
            } else {
                var4 = null;
            }
        } else {
            var4 = null;
        }

        return var4;
    }

    // $FF: renamed from: e (android.content.Context) void
    private void method_733(Context var1) {
        if (!this.field_697) {
            this.field_697 = true;
            Drawable var2 = this.method_735(var1, a$e.abc_vector_test);
            if (var2 == null || !method_725(var2)) {
                this.field_697 = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }

    }

    // $FF: renamed from: f (android.content.Context, int) android.content.res.ColorStateList
    private ColorStateList method_734(Context var1, int var2) {
        int var5 = class_94.method_857(var1, android.support.v7.a.a$a.colorControlHighlight);
        int var3 = class_94.method_861(var1, android.support.v7.a.a$a.colorButtonNormal);
        int[] var6 = class_94.field_813;
        int[] var8 = class_94.field_816;
        int var4 = class_81.method_776(var5, var2);
        int[] var7 = class_94.field_814;
        var5 = class_81.method_776(var5, var2);
        return new ColorStateList(new int[][]{var6, var8, var7, class_94.field_820}, new int[]{var3, var4, var5, var2});
    }

    // $FF: renamed from: a (android.content.Context, int) android.graphics.drawable.Drawable
    public Drawable method_735(Context var1, int var2) {
        return this.method_736(var1, var2, false);
    }

    // $FF: renamed from: a (android.content.Context, int, boolean) android.graphics.drawable.Drawable
    Drawable method_736(Context var1, int var2, boolean var3) {
        this.method_733(var1);
        Drawable var5 = this.method_731(var1, var2);
        Drawable var4 = var5;
        if (var5 == null) {
            var4 = this.method_729(var1, var2);
        }

        var5 = var4;
        if (var4 == null) {
            var5 = class_47.method_513(var1, var2);
        }

        var4 = var5;
        if (var5 != null) {
            var4 = this.method_715(var1, var2, var3, var5);
        }

        if (var4 != null) {
            class_67.method_656(var4);
        }

        return var4;
    }

    // $FF: renamed from: a (android.content.Context, android.support.v7.widget.ap, int) android.graphics.drawable.Drawable
    Drawable method_737(Context var1, class_106 var2, int var3) {
        Drawable var5 = this.method_731(var1, var3);
        Drawable var4 = var5;
        if (var5 == null) {
            var4 = var2.method_914(var3);
        }

        Drawable var6;
        if (var4 != null) {
            var6 = this.method_715(var1, var3, false, var4);
        } else {
            var6 = null;
        }

        return var6;
    }

    // $FF: renamed from: b (android.content.Context, int) android.content.res.ColorStateList
    ColorStateList method_738(Context var1, int var2) {
        ColorStateList var3 = this.method_732(var1, var2);
        ColorStateList var4 = var3;
        if (var3 == null) {
            if (var2 == a$e.abc_edit_text_material) {
                var3 = class_39.method_379(var1, a$c.abc_tint_edittext);
            } else if (var2 == a$e.abc_switch_track_mtrl_alpha) {
                var3 = class_39.method_379(var1, a$c.abc_tint_switch_track);
            } else if (var2 == a$e.abc_switch_thumb_material) {
                var3 = this.method_730(var1);
            } else if (var2 == a$e.abc_btn_default_mtrl_shape) {
                var3 = this.method_711(var1);
            } else if (var2 == a$e.abc_btn_borderless_material) {
                var3 = this.method_727(var1);
            } else if (var2 == a$e.abc_btn_colored_material) {
                var3 = this.method_728(var1);
            } else if (var2 != a$e.abc_spinner_mtrl_am_alpha && var2 != a$e.abc_spinner_textfield_background_material) {
                if (method_726(field_686, var2)) {
                    var3 = class_94.method_860(var1, android.support.v7.a.a$a.colorControlNormal);
                } else if (method_726(field_689, var2)) {
                    var3 = class_39.method_379(var1, a$c.abc_tint_default);
                } else if (method_726(field_690, var2)) {
                    var3 = class_39.method_379(var1, a$c.abc_tint_btn_checkable);
                } else if (var2 == a$e.abc_seekbar_thumb_material) {
                    var3 = class_39.method_379(var1, a$c.abc_tint_seek_thumb);
                }
            } else {
                var3 = class_39.method_379(var1, a$c.abc_tint_spinner);
            }

            var4 = var3;
            if (var3 != null) {
                this.method_718(var1, var2, var3);
                var4 = var3;
            }
        }

        return var4;
    }
}
