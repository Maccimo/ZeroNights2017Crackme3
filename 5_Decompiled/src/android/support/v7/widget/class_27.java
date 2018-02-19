package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.h.class_146;
import android.support.v4.widget.class_152;
import android.support.v7.a.a$j;
import android.support.v7.view.menu.class_25;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

// $FF: renamed from: android.support.v7.widget.x
public class class_27 implements class_25 {
    // $FF: renamed from: a java.lang.reflect.Method
    private static Method field_17;
    // $FF: renamed from: b java.lang.reflect.Method
    private static Method field_18;
    // $FF: renamed from: h java.lang.reflect.Method
    private static Method field_19;
    // $FF: renamed from: A android.graphics.drawable.Drawable
    private Drawable field_20;
    // $FF: renamed from: B android.widget.AdapterView.OnItemClickListener
    private OnItemClickListener field_21;
    // $FF: renamed from: C android.widget.AdapterView.OnItemSelectedListener
    private OnItemSelectedListener field_22;
    // $FF: renamed from: D android.support.v7.widget.x$d
    private final x$d field_23;
    // $FF: renamed from: E android.support.v7.widget.x$c
    private final x$c field_24;
    // $FF: renamed from: F android.support.v7.widget.x$a
    private final x$a field_25;
    // $FF: renamed from: G java.lang.Runnable
    private Runnable field_26;
    // $FF: renamed from: H android.graphics.Rect
    private final Rect field_27;
    // $FF: renamed from: I android.graphics.Rect
    private Rect field_28;
    // $FF: renamed from: J boolean
    private boolean field_29;
    // $FF: renamed from: c android.support.v7.widget.t
    class_66 field_30;
    // $FF: renamed from: d int
    int field_31;
    // $FF: renamed from: e android.support.v7.widget.x$e
    final x$e field_32;
    // $FF: renamed from: f android.os.Handler
    final Handler field_33;
    // $FF: renamed from: g android.widget.PopupWindow
    PopupWindow field_34;
    // $FF: renamed from: i android.content.Context
    private Context field_35;
    // $FF: renamed from: j android.widget.ListAdapter
    private ListAdapter field_36;
    // $FF: renamed from: k int
    private int field_37;
    // $FF: renamed from: l int
    private int field_38;
    // $FF: renamed from: m int
    private int field_39;
    // $FF: renamed from: n int
    private int field_40;
    // $FF: renamed from: o int
    private int field_41;
    // $FF: renamed from: p boolean
    private boolean field_42;
    // $FF: renamed from: q boolean
    private boolean field_43;
    // $FF: renamed from: r boolean
    private boolean field_44;
    // $FF: renamed from: s boolean
    private boolean field_45;
    // $FF: renamed from: t int
    private int field_46;
    // $FF: renamed from: u boolean
    private boolean field_47;
    // $FF: renamed from: v boolean
    private boolean field_48;
    // $FF: renamed from: w android.view.View
    private View field_49;
    // $FF: renamed from: x int
    private int field_50;
    // $FF: renamed from: y android.database.DataSetObserver
    private DataSetObserver field_51;
    // $FF: renamed from: z android.view.View
    private View field_52;

    static {
        try {
            field_17 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException var3) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }

        try {
            field_18 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException var2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }

        try {
            field_19 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException var1) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }

    }

    public class_27(Context var1) {
        this(var1, (AttributeSet)null, android.support.v7.a.a$a.listPopupWindowStyle);
    }

    public class_27(Context var1, AttributeSet var2, int var3) {
        this(var1, var2, var3, 0);
    }

    public class_27(Context var1, AttributeSet var2, int var3, int var4) {
        this.field_37 = -2;
        this.field_38 = -2;
        this.field_41 = 1002;
        this.field_43 = true;
        this.field_46 = 0;
        this.field_47 = false;
        this.field_48 = false;
        this.field_31 = Integer.MAX_VALUE;
        this.field_50 = 0;
        this.field_32 = new x$e(this);
        this.field_23 = new x$d(this);
        this.field_24 = new x$c(this);
        this.field_25 = new x$a(this);
        this.field_27 = new Rect();
        this.field_35 = var1;
        this.field_33 = new Handler(var1.getMainLooper());
        TypedArray var5 = var1.obtainStyledAttributes(var2, a$j.ListPopupWindow, var3, var4);
        this.field_39 = var5.getDimensionPixelOffset(a$j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.field_40 = var5.getDimensionPixelOffset(a$j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.field_40 != 0) {
            this.field_42 = true;
        }

        var5.recycle();
        this.field_34 = new class_78(var1, var2, var3, var4);
        this.field_34.setInputMethodMode(1);
    }

    // $FF: renamed from: a (android.view.View, int, boolean) int
    private int method_170(View var1, int var2, boolean var3) {
        if (field_18 != null) {
            label23: {
                int var4;
                try {
                    var4 = (Integer)field_18.invoke(this.field_34, var1, var2, var3);
                } catch (Exception var6) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    break label23;
                }

                var2 = var4;
                return var2;
            }
        }

        var2 = this.field_34.getMaxAvailableHeight(var1, var2);
        return var2;
    }

    // $FF: renamed from: b () void
    private void method_171() {
        if (this.field_49 != null) {
            ViewParent var1 = this.field_49.getParent();
            if (var1 instanceof ViewGroup) {
                ((ViewGroup)var1).removeView(this.field_49);
            }
        }

    }

    // $FF: renamed from: c (boolean) void
    private void method_172(boolean var1) {
        if (field_17 != null) {
            try {
                field_17.invoke(this.field_34, var1);
            } catch (Exception var3) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }

    }

    // $FF: renamed from: f () int
    private int method_173() {
        boolean var6 = true;
        int var1;
        int var2;
        boolean var5;
        LayoutParams var13;
        if (this.field_30 == null) {
            Context var7 = this.field_35;
            this.field_26 = new Runnable() {
                public void run() {
                    View var1 = class_27.this.method_193();
                    if (var1 != null && var1.getWindowToken() != null) {
                        class_27.this.method_147();
                    }

                }
            };
            if (!this.field_29) {
                var5 = true;
            } else {
                var5 = false;
            }

            this.field_30 = this.method_174(var7, var5);
            if (this.field_20 != null) {
                this.field_30.setSelector(this.field_20);
            }

            this.field_30.setAdapter(this.field_36);
            this.field_30.setOnItemClickListener(this.field_21);
            this.field_30.setFocusable(true);
            this.field_30.setFocusableInTouchMode(true);
            this.field_30.setOnItemSelectedListener(new OnItemSelectedListener() {
                public void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
                    if (var3 != -1) {
                        class_66 var6 = class_27.this.field_30;
                        if (var6 != null) {
                            var6.setListSelectionHidden(false);
                        }
                    }

                }

                public void onNothingSelected(AdapterView var1) {
                }
            });
            this.field_30.setOnScrollListener(this.field_24);
            if (this.field_22 != null) {
                this.field_30.setOnItemSelectedListener(this.field_22);
            }

            class_66 var8 = this.field_30;
            View var9 = this.field_49;
            Object var11;
            if (var9 != null) {
                var11 = new LinearLayout(var7);
                ((LinearLayout)var11).setOrientation(1);
                LayoutParams var10 = new LayoutParams(-1, 0, 1.0F);
                switch(this.field_50) {
                case 0:
                    ((LinearLayout)var11).addView(var9);
                    ((LinearLayout)var11).addView(var8, var10);
                    break;
                case 1:
                    ((LinearLayout)var11).addView(var8, var10);
                    ((LinearLayout)var11).addView(var9);
                    break;
                default:
                    Log.e("ListPopupWindow", "Invalid hint position " + this.field_50);
                }

                if (this.field_38 >= 0) {
                    var1 = this.field_38;
                    var2 = Integer.MIN_VALUE;
                } else {
                    var2 = 0;
                    var1 = 0;
                }

                var9.measure(MeasureSpec.makeMeasureSpec(var1, var2), 0);
                var13 = (LayoutParams)var9.getLayoutParams();
                var2 = var9.getMeasuredHeight();
                var1 = var13.topMargin;
                var1 = var13.bottomMargin + var2 + var1;
            } else {
                var1 = 0;
                var11 = var8;
            }

            this.field_34.setContentView((View)var11);
        } else {
            ViewGroup var12 = (ViewGroup)this.field_34.getContentView();
            View var14 = this.field_49;
            if (var14 != null) {
                var13 = (LayoutParams)var14.getLayoutParams();
                var2 = var14.getMeasuredHeight();
                var1 = var13.topMargin;
                var1 = var13.bottomMargin + var2 + var1;
            } else {
                var1 = 0;
            }
        }

        Drawable var15 = this.field_34.getBackground();
        if (var15 != null) {
            var15.getPadding(this.field_27);
            var2 = this.field_27.top + this.field_27.bottom;
            if (!this.field_42) {
                this.field_40 = -this.field_27.top;
            }
        } else {
            this.field_27.setEmpty();
            var2 = 0;
        }

        if (this.field_34.getInputMethodMode() == 2) {
            var5 = var6;
        } else {
            var5 = false;
        }

        int var4 = this.method_170(this.method_193(), this.field_40, var5);
        if (!this.field_47 && this.field_37 != -1) {
            int var3;
            int var10001;
            switch(this.field_38) {
            case -2:
                var10001 = this.field_27.left + this.field_27.right;
                var3 = MeasureSpec.makeMeasureSpec(this.field_35.getResources().getDisplayMetrics().widthPixels - var10001, Integer.MIN_VALUE);
                break;
            case -1:
                var10001 = this.field_27.left + this.field_27.right;
                var3 = MeasureSpec.makeMeasureSpec(this.field_35.getResources().getDisplayMetrics().widthPixels - var10001, 1073741824);
                break;
            default:
                var3 = MeasureSpec.makeMeasureSpec(this.field_38, 1073741824);
            }

            var3 = this.field_30.a(var3, 0, -1, var4 - var1, -1);
            if (var3 > 0) {
                var1 += this.field_30.getPaddingTop() + this.field_30.getPaddingBottom() + var2;
            }

            var1 += var3;
        } else {
            var1 = var4 + var2;
        }

        return var1;
    }

    // $FF: renamed from: a (android.content.Context, boolean) android.support.v7.widget.t
    class_66 method_174(Context var1, boolean var2) {
        return new class_66(var1, var2);
    }

    // $FF: renamed from: a () void
    public void method_147() {
        boolean var7 = true;
        boolean var8 = false;
        byte var4 = -1;
        int var2 = this.method_173();
        boolean var9 = this.method_199();
        class_152.method_1278(this.field_34, this.field_41);
        int var1;
        PopupWindow var10;
        if (this.field_34.isShowing()) {
            if (class_146.method_1229(this.method_193())) {
                if (this.field_38 == -1) {
                    var1 = -1;
                } else if (this.field_38 == -2) {
                    var1 = this.method_193().getWidth();
                } else {
                    var1 = this.field_38;
                }

                if (this.field_37 == -1) {
                    if (!var9) {
                        var2 = -1;
                    }

                    byte var3;
                    if (var9) {
                        var10 = this.field_34;
                        if (this.field_38 == -1) {
                            var3 = -1;
                        } else {
                            var3 = 0;
                        }

                        var10.setWidth(var3);
                        this.field_34.setHeight(0);
                    } else {
                        var10 = this.field_34;
                        if (this.field_38 == -1) {
                            var3 = -1;
                        } else {
                            var3 = 0;
                        }

                        var10.setWidth(var3);
                        this.field_34.setHeight(-1);
                    }
                } else if (this.field_37 != -2) {
                    var2 = this.field_37;
                }

                var10 = this.field_34;
                var7 = var8;
                if (!this.field_48) {
                    var7 = var8;
                    if (!this.field_47) {
                        var7 = true;
                    }
                }

                var10.setOutsideTouchable(var7);
                PopupWindow var11 = this.field_34;
                View var14 = this.method_193();
                int var5 = this.field_39;
                int var6 = this.field_40;
                int var13 = var1;
                if (var1 < 0) {
                    var13 = -1;
                }

                if (var2 < 0) {
                    var1 = var4;
                } else {
                    var1 = var2;
                }

                var11.update(var14, var5, var6, var13, var1);
            }
        } else {
            if (this.field_38 == -1) {
                var1 = -1;
            } else if (this.field_38 == -2) {
                var1 = this.method_193().getWidth();
            } else {
                var1 = this.field_38;
            }

            if (this.field_37 == -1) {
                var2 = -1;
            } else if (this.field_37 != -2) {
                var2 = this.field_37;
            }

            this.field_34.setWidth(var1);
            this.field_34.setHeight(var2);
            this.method_172(true);
            var10 = this.field_34;
            if (this.field_48 || this.field_47) {
                var7 = false;
            }

            var10.setOutsideTouchable(var7);
            this.field_34.setTouchInterceptor(this.field_23);
            if (this.field_45) {
                class_152.method_1280(this.field_34, this.field_44);
            }

            if (field_19 != null) {
                try {
                    field_19.invoke(this.field_34, this.field_28);
                } catch (Exception var12) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", var12);
                }
            }

            class_152.method_1279(this.field_34, this.method_193(), this.field_39, this.field_40, this.field_46);
            this.field_30.setSelection(-1);
            if (!this.field_29 || this.field_30.isInTouchMode()) {
                this.method_198();
            }

            if (!this.field_29) {
                this.field_33.post(this.field_25);
            }
        }

    }

    // $FF: renamed from: a (int) void
    public void method_175(int var1) {
        this.field_50 = var1;
    }

    // $FF: renamed from: a (android.graphics.Rect) void
    public void method_176(Rect var1) {
        this.field_28 = var1;
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) void
    public void method_177(Drawable var1) {
        this.field_34.setBackgroundDrawable(var1);
    }

    // $FF: renamed from: a (android.widget.AdapterView.OnItemClickListener) void
    public void method_178(OnItemClickListener var1) {
        this.field_21 = var1;
    }

    // $FF: renamed from: a (android.widget.ListAdapter) void
    public void method_179(ListAdapter var1) {
        if (this.field_51 == null) {
            this.field_51 = new x$b(this);
        } else if (this.field_36 != null) {
            this.field_36.unregisterDataSetObserver(this.field_51);
        }

        this.field_36 = var1;
        if (this.field_36 != null) {
            var1.registerDataSetObserver(this.field_51);
        }

        if (this.field_30 != null) {
            this.field_30.setAdapter(this.field_36);
        }

    }

    // $FF: renamed from: a (android.widget.PopupWindow.OnDismissListener) void
    public void method_180(OnDismissListener var1) {
        this.field_34.setOnDismissListener(var1);
    }

    // $FF: renamed from: a (boolean) void
    public void method_181(boolean var1) {
        this.field_29 = var1;
        this.field_34.setFocusable(var1);
    }

    // $FF: renamed from: b (int) void
    public void method_182(int var1) {
        this.field_34.setAnimationStyle(var1);
    }

    // $FF: renamed from: b (android.view.View) void
    public void method_183(View var1) {
        this.field_52 = var1;
    }

    // $FF: renamed from: b (boolean) void
    public void method_184(boolean var1) {
        this.field_45 = true;
        this.field_44 = var1;
    }

    // $FF: renamed from: c () void
    public void method_148() {
        this.field_34.dismiss();
        this.method_171();
        this.field_34.setContentView((View)null);
        this.field_30 = null;
        this.field_33.removeCallbacks(this.field_32);
    }

    // $FF: renamed from: c (int) void
    public void method_185(int var1) {
        this.field_39 = var1;
    }

    // $FF: renamed from: d (int) void
    public void method_186(int var1) {
        this.field_40 = var1;
        this.field_42 = true;
    }

    // $FF: renamed from: d () boolean
    public boolean method_149() {
        return this.field_34.isShowing();
    }

    // $FF: renamed from: e () android.widget.ListView
    public ListView method_150() {
        return this.field_30;
    }

    // $FF: renamed from: e (int) void
    public void method_187(int var1) {
        this.field_46 = var1;
    }

    // $FF: renamed from: f (int) void
    public void method_188(int var1) {
        this.field_38 = var1;
    }

    // $FF: renamed from: g (int) void
    public void method_189(int var1) {
        Drawable var2 = this.field_34.getBackground();
        if (var2 != null) {
            var2.getPadding(this.field_27);
            this.field_38 = this.field_27.left + this.field_27.right + var1;
        } else {
            this.method_188(var1);
        }

    }

    // $FF: renamed from: g () boolean
    public boolean method_190() {
        return this.field_29;
    }

    // $FF: renamed from: h () android.graphics.drawable.Drawable
    public Drawable method_191() {
        return this.field_34.getBackground();
    }

    // $FF: renamed from: h (int) void
    public void method_192(int var1) {
        this.field_34.setInputMethodMode(var1);
    }

    // $FF: renamed from: i () android.view.View
    public View method_193() {
        return this.field_52;
    }

    // $FF: renamed from: i (int) void
    public void method_194(int var1) {
        class_66 var2 = this.field_30;
        if (this.method_149() && var2 != null) {
            var2.setListSelectionHidden(false);
            var2.setSelection(var1);
            if (var2.getChoiceMode() != 0) {
                var2.setItemChecked(var1, true);
            }
        }

    }

    // $FF: renamed from: j () int
    public int method_195() {
        return this.field_39;
    }

    // $FF: renamed from: k () int
    public int method_196() {
        int var1;
        if (!this.field_42) {
            var1 = 0;
        } else {
            var1 = this.field_40;
        }

        return var1;
    }

    // $FF: renamed from: l () int
    public int method_197() {
        return this.field_38;
    }

    // $FF: renamed from: m () void
    public void method_198() {
        class_66 var1 = this.field_30;
        if (var1 != null) {
            var1.setListSelectionHidden(true);
            var1.requestLayout();
        }

    }

    // $FF: renamed from: n () boolean
    public boolean method_199() {
        boolean var1;
        if (this.field_34.getInputMethodMode() == 2) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }
}
