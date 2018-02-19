package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import org.xmlpull.v1.XmlPullParser;

// $FF: renamed from: android.support.v7.view.d
public class class_156 extends MenuInflater {
    // $FF: renamed from: a java.lang.Class[]
    static final Class[] field_1184 = new Class[]{Context.class};
    // $FF: renamed from: b java.lang.Class[]
    static final Class[] field_1185;
    // $FF: renamed from: c java.lang.Object[]
    final Object[] field_1186;
    // $FF: renamed from: d java.lang.Object[]
    final Object[] field_1187;
    // $FF: renamed from: e android.content.Context
    Context field_1188;
    // $FF: renamed from: f java.lang.Object
    private Object field_1189;

    static {
        field_1185 = field_1184;
    }

    public class_156(Context var1) {
        super(var1);
        this.field_1188 = var1;
        this.field_1186 = new Object[]{var1};
        this.field_1187 = this.field_1186;
    }

    // $FF: renamed from: a (java.lang.Object) java.lang.Object
    private Object method_1303(Object var1) {
        Object var2;
        if (var1 instanceof Activity) {
            var2 = var1;
        } else {
            var2 = var1;
            if (var1 instanceof ContextWrapper) {
                var2 = this.method_1303(((ContextWrapper)var1).getBaseContext());
            }
        }

        return var2;
    }

    // $FF: renamed from: a (org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu) void
    private void method_1304(XmlPullParser var1, AttributeSet var2, Menu var3) {
        d$b var10 = new d$b(this, var3);
        int var4 = var1.getEventType();

        String var12;
        while(true) {
            if (var4 == 2) {
                var12 = var1.getName();
                if (!var12.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + var12);
                }

                var4 = var1.next();
                break;
            }

            int var5 = var1.next();
            var4 = var5;
            if (var5 == 1) {
                var4 = var5;
                break;
            }
        }

        boolean var13 = false;
        String var9 = null;

        int var8;
        for(boolean var6 = false; !var6; var4 = var8) {
            boolean var7;
            boolean var14;
            switch(var4) {
            case 1:
                throw new RuntimeException("Unexpected end of document");
            case 2:
                var7 = var6;
                var14 = var13;
                var12 = var9;
                if (!var13) {
                    var12 = var1.getName();
                    if (var12.equals("group")) {
                        var10.method_507(var2);
                        var7 = var6;
                        var14 = var13;
                        var12 = var9;
                    } else if (var12.equals("item")) {
                        var10.method_509(var2);
                        var7 = var6;
                        var14 = var13;
                        var12 = var9;
                    } else if (var12.equals("menu")) {
                        this.method_1304(var1, var2, var10.method_510());
                        var7 = var6;
                        var14 = var13;
                        var12 = var9;
                    } else {
                        var14 = true;
                        var7 = var6;
                    }
                }
                break;
            case 3:
                String var11 = var1.getName();
                if (var13 && var11.equals(var9)) {
                    var14 = false;
                    var12 = null;
                    var7 = var6;
                } else if (var11.equals("group")) {
                    var10.method_506();
                    var7 = var6;
                    var14 = var13;
                    var12 = var9;
                } else if (var11.equals("item")) {
                    var7 = var6;
                    var14 = var13;
                    var12 = var9;
                    if (!var10.method_511()) {
                        if (var10.field_456 != null && var10.field_456.method_1073()) {
                            var10.method_510();
                            var7 = var6;
                            var14 = var13;
                            var12 = var9;
                        } else {
                            var10.method_508();
                            var7 = var6;
                            var14 = var13;
                            var12 = var9;
                        }
                    }
                } else {
                    var7 = var6;
                    var14 = var13;
                    var12 = var9;
                    if (var11.equals("menu")) {
                        var7 = true;
                        var14 = var13;
                        var12 = var9;
                    }
                }
                break;
            default:
                var12 = var9;
                var14 = var13;
                var7 = var6;
            }

            var8 = var1.next();
            var6 = var7;
            var13 = var14;
            var9 = var12;
        }

    }

    // $FF: renamed from: a () java.lang.Object
    Object method_1305() {
        if (this.field_1189 == null) {
            this.field_1189 = this.method_1303(this.field_1188);
        }

        return this.field_1189;
    }

    public void inflate(int param1, Menu param2) {
        // $FF: Couldn't be decompiled
    }
}
