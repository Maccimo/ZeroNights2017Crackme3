package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// $FF: renamed from: android.support.v4.widget.i
public abstract class class_91 extends class_90 {
    // $FF: renamed from: j int
    private int field_785;
    // $FF: renamed from: k int
    private int field_786;
    // $FF: renamed from: l android.view.LayoutInflater
    private LayoutInflater field_787;

    @Deprecated
    public class_91(Context var1, int var2, Cursor var3, boolean var4) {
        super(var1, var3, var4);
        this.field_786 = var2;
        this.field_785 = var2;
        this.field_787 = (LayoutInflater)var1.getSystemService("layout_inflater");
    }

    // $FF: renamed from: a (android.content.Context, android.database.Cursor, android.view.ViewGroup) android.view.View
    public View method_827(Context var1, Cursor var2, ViewGroup var3) {
        return this.field_787.inflate(this.field_785, var3, false);
    }

    // $FF: renamed from: b (android.content.Context, android.database.Cursor, android.view.ViewGroup) android.view.View
    public View method_831(Context var1, Cursor var2, ViewGroup var3) {
        return this.field_787.inflate(this.field_786, var3, false);
    }
}
