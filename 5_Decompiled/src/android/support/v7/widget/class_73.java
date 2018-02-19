package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// $FF: renamed from: android.support.v7.widget.e
class class_73 extends DataSetObservable {
    // $FF: renamed from: a java.lang.String
    static final String field_665 = e.class.getSimpleName();
    // $FF: renamed from: e java.lang.Object
    private static final Object field_666 = new Object();
    // $FF: renamed from: f java.util.Map
    private static final Map field_667 = new HashMap();
    // $FF: renamed from: b android.content.Context
    final Context field_668;
    // $FF: renamed from: c java.lang.String
    final String field_669;
    // $FF: renamed from: d boolean
    boolean field_670;
    // $FF: renamed from: g java.lang.Object
    private final Object field_671;
    // $FF: renamed from: h java.util.List
    private final List field_672;
    // $FF: renamed from: i java.util.List
    private final List field_673;
    // $FF: renamed from: j android.content.Intent
    private Intent field_674;
    // $FF: renamed from: k android.support.v7.widget.e$b
    private e$b field_675;
    // $FF: renamed from: l int
    private int field_676;
    // $FF: renamed from: m boolean
    private boolean field_677;
    // $FF: renamed from: n boolean
    private boolean field_678;
    // $FF: renamed from: o boolean
    private boolean field_679;
    // $FF: renamed from: p android.support.v7.widget.e$d
    private e$d field_680;

    // $FF: renamed from: a (android.support.v7.widget.e$c) boolean
    private boolean method_696(e$c var1) {
        boolean var2 = this.field_673.add(var1);
        if (var2) {
            this.field_678 = true;
            this.method_702();
            this.method_697();
            this.method_699();
            this.notifyChanged();
        }

        return var2;
    }

    // $FF: renamed from: c () void
    private void method_697() {
        if (!this.field_677) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else {
            if (this.field_678) {
                this.field_678 = false;
                if (!TextUtils.isEmpty(this.field_669)) {
                    (new e$e(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.field_673), this.field_669});
                }
            }

        }
    }

    // $FF: renamed from: d () void
    private void method_698() {
        boolean var2 = this.method_700();
        boolean var1 = this.method_701();
        this.method_702();
        if (var2 | var1) {
            this.method_699();
            this.notifyChanged();
        }

    }

    // $FF: renamed from: e () boolean
    private boolean method_699() {
        boolean var1;
        if (this.field_675 != null && this.field_674 != null && !this.field_672.isEmpty() && !this.field_673.isEmpty()) {
            this.field_675.method_41(this.field_674, this.field_672, Collections.unmodifiableList(this.field_673));
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: f () boolean
    private boolean method_700() {
        boolean var4 = false;
        boolean var3 = var4;
        if (this.field_679) {
            var3 = var4;
            if (this.field_674 != null) {
                this.field_679 = false;
                this.field_672.clear();
                List var6 = this.field_668.getPackageManager().queryIntentActivities(this.field_674, 0);
                int var2 = var6.size();

                for(int var1 = 0; var1 < var2; ++var1) {
                    ResolveInfo var5 = (ResolveInfo)var6.get(var1);
                    this.field_672.add(new e$a(var5));
                }

                var3 = true;
            }
        }

        return var3;
    }

    // $FF: renamed from: g () boolean
    private boolean method_701() {
        boolean var1 = true;
        if (this.field_670 && this.field_678 && !TextUtils.isEmpty(this.field_669)) {
            this.field_670 = false;
            this.field_677 = true;
            this.method_703();
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: h () void
    private void method_702() {
        int var2 = this.field_673.size() - this.field_676;
        if (var2 > 0) {
            this.field_678 = true;

            for(int var1 = 0; var1 < var2; ++var1) {
                e$c var3 = (e$c)this.field_673.remove(0);
            }
        }

    }

    // $FF: renamed from: i () void
    private void method_703() {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a () int
    public int method_704() {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.content.pm.ResolveInfo) int
    public int method_705(ResolveInfo param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (int) android.content.pm.ResolveInfo
    public ResolveInfo method_706(int param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: b (int) android.content.Intent
    public Intent method_707(int param1) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: b () android.content.pm.ResolveInfo
    public ResolveInfo method_708() {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: c (int) void
    public void method_709(int param1) {
        // $FF: Couldn't be decompiled
    }
}
