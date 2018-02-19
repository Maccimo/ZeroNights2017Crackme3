package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.a.a$j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    // $FF: renamed from: a int
    private int field_1106;
    // $FF: renamed from: b int
    private int field_1107;
    // $FF: renamed from: c java.lang.ref.WeakReference
    private WeakReference field_1108;
    // $FF: renamed from: d android.view.LayoutInflater
    private LayoutInflater field_1109;
    // $FF: renamed from: e android.support.v7.widget.ViewStubCompat$a
    private ViewStubCompat.class_278 field_1110;

    public ViewStubCompat(Context var1, AttributeSet var2) {
        this(var1, var2, 0);
    }

    public ViewStubCompat(Context var1, AttributeSet var2, int var3) {
        super(var1, var2, var3);
        this.field_1106 = 0;
        TypedArray var4 = var1.obtainStyledAttributes(var2, a$j.ViewStubCompat, var3, 0);
        this.field_1107 = var4.getResourceId(a$j.ViewStubCompat_android_inflatedId, -1);
        this.field_1106 = var4.getResourceId(a$j.ViewStubCompat_android_layout, 0);
        this.setId(var4.getResourceId(a$j.ViewStubCompat_android_id, -1));
        var4.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }

    // $FF: renamed from: a () android.view.View
    public View method_1192() {
        ViewParent var2 = this.getParent();
        if (var2 != null && var2 instanceof ViewGroup) {
            if (this.field_1106 != 0) {
                ViewGroup var3 = (ViewGroup)var2;
                LayoutInflater var5;
                if (this.field_1109 != null) {
                    var5 = this.field_1109;
                } else {
                    var5 = LayoutInflater.from(this.getContext());
                }

                View var4 = var5.inflate(this.field_1106, var3, false);
                if (this.field_1107 != -1) {
                    var4.setId(this.field_1107);
                }

                int var1 = var3.indexOfChild(this);
                var3.removeViewInLayout(this);
                LayoutParams var6 = this.getLayoutParams();
                if (var6 != null) {
                    var3.addView(var4, var1, var6);
                } else {
                    var3.addView(var4, var1);
                }

                this.field_1108 = new WeakReference(var4);
                if (this.field_1110 != null) {
                    this.field_1110.method_27(this, var4);
                }

                return var4;
            } else {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
        } else {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    protected void dispatchDraw(Canvas var1) {
    }

    public void draw(Canvas var1) {
    }

    public int getInflatedId() {
        return this.field_1107;
    }

    public LayoutInflater getLayoutInflater() {
        return this.field_1109;
    }

    public int getLayoutResource() {
        return this.field_1106;
    }

    protected void onMeasure(int var1, int var2) {
        this.setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int var1) {
        this.field_1107 = var1;
    }

    public void setLayoutInflater(LayoutInflater var1) {
        this.field_1109 = var1;
    }

    public void setLayoutResource(int var1) {
        this.field_1106 = var1;
    }

    public void setOnInflateListener(ViewStubCompat.class_278 var1) {
        this.field_1110 = var1;
    }

    public void setVisibility(int var1) {
        if (this.field_1108 != null) {
            View var2 = (View)this.field_1108.get();
            if (var2 == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }

            var2.setVisibility(var1);
        } else {
            super.setVisibility(var1);
            if (var1 == 0 || var1 == 4) {
                this.method_1192();
            }
        }

    }

    public interface class_278 {
        // $FF: renamed from: a (android.support.v7.widget.ViewStubCompat, android.view.View) void
        void method_27(ViewStubCompat var1, View var2);
    }
}
