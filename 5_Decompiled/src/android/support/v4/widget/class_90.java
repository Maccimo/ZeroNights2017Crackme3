package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

// $FF: renamed from: android.support.v4.widget.b
public abstract class class_90 extends BaseAdapter implements c$a, Filterable {
    // $FF: renamed from: a boolean
    protected boolean field_776;
    // $FF: renamed from: b boolean
    protected boolean field_777;
    // $FF: renamed from: c android.database.Cursor
    protected Cursor field_778;
    // $FF: renamed from: d android.content.Context
    protected Context field_779;
    // $FF: renamed from: e int
    protected int field_780;
    // $FF: renamed from: f android.support.v4.widget.b$a
    protected b$a field_781;
    // $FF: renamed from: g android.database.DataSetObserver
    protected DataSetObserver field_782;
    // $FF: renamed from: h android.support.v4.widget.c
    protected class_153 field_783;
    // $FF: renamed from: i android.widget.FilterQueryProvider
    protected FilterQueryProvider field_784;

    public class_90(Context var1, Cursor var2, boolean var3) {
        byte var4;
        if (var3) {
            var4 = 1;
        } else {
            var4 = 2;
        }

        this.method_828(var1, var2, var4);
    }

    // $FF: renamed from: a () android.database.Cursor
    public Cursor method_107() {
        return this.field_778;
    }

    // $FF: renamed from: a (java.lang.CharSequence) android.database.Cursor
    public Cursor method_108(CharSequence var1) {
        Cursor var2;
        if (this.field_784 != null) {
            var2 = this.field_784.runQuery(var1);
        } else {
            var2 = this.field_778;
        }

        return var2;
    }

    // $FF: renamed from: a (android.content.Context, android.database.Cursor, android.view.ViewGroup) android.view.View
    public abstract View method_827(Context var1, Cursor var2, ViewGroup var3);

    // $FF: renamed from: a (android.content.Context, android.database.Cursor, int) void
    void method_828(Context var1, Cursor var2, int var3) {
        boolean var5 = false;
        if ((var3 & 1) == 1) {
            var3 |= 2;
            this.field_777 = true;
        } else {
            this.field_777 = false;
        }

        if (var2 != null) {
            var5 = true;
        }

        this.field_778 = var2;
        this.field_776 = var5;
        this.field_779 = var1;
        int var4;
        if (var5) {
            var4 = var2.getColumnIndexOrThrow("_id");
        } else {
            var4 = -1;
        }

        this.field_780 = var4;
        if ((var3 & 2) == 2) {
            this.field_781 = new b$a(this);
            this.field_782 = new b$b(this);
        } else {
            this.field_781 = null;
            this.field_782 = null;
        }

        if (var5) {
            if (this.field_781 != null) {
                var2.registerContentObserver(this.field_781);
            }

            if (this.field_782 != null) {
                var2.registerDataSetObserver(this.field_782);
            }
        }

    }

    // $FF: renamed from: a (android.database.Cursor) void
    public void method_109(Cursor var1) {
        var1 = this.method_830(var1);
        if (var1 != null) {
            var1.close();
        }

    }

    // $FF: renamed from: a (android.view.View, android.content.Context, android.database.Cursor) void
    public abstract void method_829(View var1, Context var2, Cursor var3);

    // $FF: renamed from: b (android.database.Cursor) android.database.Cursor
    public Cursor method_830(Cursor var1) {
        if (var1 == this.field_778) {
            var1 = null;
        } else {
            Cursor var2 = this.field_778;
            if (var2 != null) {
                if (this.field_781 != null) {
                    var2.unregisterContentObserver(this.field_781);
                }

                if (this.field_782 != null) {
                    var2.unregisterDataSetObserver(this.field_782);
                }
            }

            this.field_778 = var1;
            if (var1 != null) {
                if (this.field_781 != null) {
                    var1.registerContentObserver(this.field_781);
                }

                if (this.field_782 != null) {
                    var1.registerDataSetObserver(this.field_782);
                }

                this.field_780 = var1.getColumnIndexOrThrow("_id");
                this.field_776 = true;
                this.notifyDataSetChanged();
                var1 = var2;
            } else {
                this.field_780 = -1;
                this.field_776 = false;
                this.notifyDataSetInvalidated();
                var1 = var2;
            }
        }

        return var1;
    }

    // $FF: renamed from: b (android.content.Context, android.database.Cursor, android.view.ViewGroup) android.view.View
    public View method_831(Context var1, Cursor var2, ViewGroup var3) {
        return this.method_827(var1, var2, var3);
    }

    // $FF: renamed from: b () void
    protected void method_832() {
        if (this.field_777 && this.field_778 != null && !this.field_778.isClosed()) {
            this.field_776 = this.field_778.requery();
        }

    }

    // $FF: renamed from: c (android.database.Cursor) java.lang.CharSequence
    public CharSequence method_110(Cursor var1) {
        String var2;
        if (var1 == null) {
            var2 = "";
        } else {
            var2 = var1.toString();
        }

        return var2;
    }

    public int getCount() {
        int var1;
        if (this.field_776 && this.field_778 != null) {
            var1 = this.field_778.getCount();
        } else {
            var1 = 0;
        }

        return var1;
    }

    public View getDropDownView(int var1, View var2, ViewGroup var3) {
        View var4;
        if (this.field_776) {
            this.field_778.moveToPosition(var1);
            var4 = var2;
            if (var2 == null) {
                var4 = this.method_831(this.field_779, this.field_778, var3);
            }

            this.method_829(var4, this.field_779, this.field_778);
        } else {
            var4 = null;
        }

        return var4;
    }

    public Filter getFilter() {
        if (this.field_783 == null) {
            this.field_783 = new class_153(this);
        }

        return this.field_783;
    }

    public Object getItem(int var1) {
        Cursor var2;
        if (this.field_776 && this.field_778 != null) {
            this.field_778.moveToPosition(var1);
            var2 = this.field_778;
        } else {
            var2 = null;
        }

        return var2;
    }

    public long getItemId(int var1) {
        long var4 = 0L;
        long var2 = var4;
        if (this.field_776) {
            var2 = var4;
            if (this.field_778 != null) {
                var2 = var4;
                if (this.field_778.moveToPosition(var1)) {
                    var2 = this.field_778.getLong(this.field_780);
                }
            }
        }

        return var2;
    }

    public View getView(int var1, View var2, ViewGroup var3) {
        if (!this.field_776) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (!this.field_778.moveToPosition(var1)) {
            throw new IllegalStateException("couldn't move cursor to position " + var1);
        } else {
            View var4 = var2;
            if (var2 == null) {
                var4 = this.method_827(this.field_779, this.field_778, var3);
            }

            this.method_829(var4, this.field_779, this.field_778);
            return var4;
        }
    }

    public boolean hasStableIds() {
        return true;
    }
}
