package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
    // $FF: renamed from: a android.util.TypedValue
    private TypedValue field_940;
    // $FF: renamed from: b android.util.TypedValue
    private TypedValue field_941;
    // $FF: renamed from: c android.util.TypedValue
    private TypedValue field_942;
    // $FF: renamed from: d android.util.TypedValue
    private TypedValue field_943;
    // $FF: renamed from: e android.util.TypedValue
    private TypedValue field_944;
    // $FF: renamed from: f android.util.TypedValue
    private TypedValue field_945;
    // $FF: renamed from: g android.graphics.Rect
    private final Rect field_946;
    // $FF: renamed from: h android.support.v7.widget.ContentFrameLayout$a
    private ContentFrameLayout.class_257 field_947;

    public ContentFrameLayout(Context var1) {
        this(var1, (AttributeSet)null);
    }

    public ContentFrameLayout(Context var1, AttributeSet var2) {
        this(var1, var2, 0);
    }

    public ContentFrameLayout(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        this.field_946 = new Rect();
    }

    // $FF: renamed from: a (android.graphics.Rect) void
    public void method_947(Rect var1) {
        this.fitSystemWindows(var1);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.field_944 == null) {
            this.field_944 = new TypedValue();
        }

        return this.field_944;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.field_945 == null) {
            this.field_945 = new TypedValue();
        }

        return this.field_945;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.field_942 == null) {
            this.field_942 = new TypedValue();
        }

        return this.field_942;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.field_943 == null) {
            this.field_943 = new TypedValue();
        }

        return this.field_943;
    }

    public TypedValue getMinWidthMajor() {
        if (this.field_940 == null) {
            this.field_940 = new TypedValue();
        }

        return this.field_940;
    }

    public TypedValue getMinWidthMinor() {
        if (this.field_941 == null) {
            this.field_941 = new TypedValue();
        }

        return this.field_941;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.field_947 != null) {
            this.field_947.method_15();
        }

    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.field_947 != null) {
            this.field_947.method_14();
        }

    }

    protected void onMeasure(int var1, int var2) {
        boolean var7 = true;
        DisplayMetrics var11 = this.getContext().getResources().getDisplayMetrics();
        boolean var4;
        if (var11.widthPixels < var11.heightPixels) {
            var4 = true;
        } else {
            var4 = false;
        }

        int var3;
        boolean var5;
        int var6;
        int var8;
        int var9;
        TypedValue var10;
        label92: {
            var8 = MeasureSpec.getMode(var1);
            var9 = MeasureSpec.getMode(var2);
            if (var8 == Integer.MIN_VALUE) {
                if (var4) {
                    var10 = this.field_943;
                } else {
                    var10 = this.field_942;
                }

                if (var10 != null && var10.type != 0) {
                    if (var10.type == 5) {
                        var3 = (int)var10.getDimension(var11);
                    } else if (var10.type == 6) {
                        var3 = (int)var10.getFraction((float)var11.widthPixels, (float)var11.widthPixels);
                    } else {
                        var3 = 0;
                    }

                    if (var3 > 0) {
                        var6 = MeasureSpec.makeMeasureSpec(Math.min(var3 - (this.field_946.left + this.field_946.right), MeasureSpec.getSize(var1)), 1073741824);
                        var5 = true;
                        break label92;
                    }
                }
            }

            var5 = false;
            var6 = var1;
        }

        var3 = var2;
        if (var9 == Integer.MIN_VALUE) {
            if (var4) {
                var10 = this.field_944;
            } else {
                var10 = this.field_945;
            }

            var3 = var2;
            if (var10 != null) {
                var3 = var2;
                if (var10.type != 0) {
                    if (var10.type == 5) {
                        var1 = (int)var10.getDimension(var11);
                    } else if (var10.type == 6) {
                        var1 = (int)var10.getFraction((float)var11.heightPixels, (float)var11.heightPixels);
                    } else {
                        var1 = 0;
                    }

                    var3 = var2;
                    if (var1 > 0) {
                        var3 = MeasureSpec.makeMeasureSpec(Math.min(var1 - (this.field_946.top + this.field_946.bottom), MeasureSpec.getSize(var2)), 1073741824);
                    }
                }
            }
        }

        boolean var12;
        label82: {
            super.onMeasure(var6, var3);
            var9 = this.getMeasuredWidth();
            var6 = MeasureSpec.makeMeasureSpec(var9, 1073741824);
            if (!var5 && var8 == Integer.MIN_VALUE) {
                if (var4) {
                    var10 = this.field_941;
                } else {
                    var10 = this.field_940;
                }

                if (var10 != null && var10.type != 0) {
                    if (var10.type == 5) {
                        var1 = (int)var10.getDimension(var11);
                    } else if (var10.type == 6) {
                        var1 = (int)var10.getFraction((float)var11.widthPixels, (float)var11.widthPixels);
                    } else {
                        var1 = 0;
                    }

                    var2 = var1;
                    if (var1 > 0) {
                        var2 = var1 - (this.field_946.left + this.field_946.right);
                    }

                    if (var9 < var2) {
                        var1 = MeasureSpec.makeMeasureSpec(var2, 1073741824);
                        var12 = var7;
                        break label82;
                    }
                }
            }

            var12 = false;
            var1 = var6;
        }

        if (var12) {
            super.onMeasure(var1, var3);
        }

    }

    public void setAttachListener(ContentFrameLayout.class_257 var1) {
        this.field_947 = var1;
    }

    public interface class_257 {
        // $FF: renamed from: a () void
        void method_14();

        // $FF: renamed from: b () void
        void method_15();
    }
}
