package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.b.class_47;
import android.support.v4.d.a.class_10;
import android.support.v4.h.class_129;
import android.support.v7.a.a$b;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// $FF: renamed from: android.support.v7.view.menu.g
public class class_162 implements class_10 {
    // $FF: renamed from: d int[]
    private static final int[] field_1202 = new int[]{1, 4, 5, 3, 2, 0};
    // $FF: renamed from: a java.lang.CharSequence
    CharSequence field_1203;
    // $FF: renamed from: b android.graphics.drawable.Drawable
    Drawable field_1204;
    // $FF: renamed from: c android.view.View
    View field_1205;
    // $FF: renamed from: e android.content.Context
    private final Context field_1206;
    // $FF: renamed from: f android.content.res.Resources
    private final Resources field_1207;
    // $FF: renamed from: g boolean
    private boolean field_1208;
    // $FF: renamed from: h boolean
    private boolean field_1209;
    // $FF: renamed from: i android.support.v7.view.menu.g$a
    private g$a field_1210;
    // $FF: renamed from: j java.util.ArrayList
    private ArrayList field_1211;
    // $FF: renamed from: k java.util.ArrayList
    private ArrayList field_1212;
    // $FF: renamed from: l boolean
    private boolean field_1213;
    // $FF: renamed from: m java.util.ArrayList
    private ArrayList field_1214;
    // $FF: renamed from: n java.util.ArrayList
    private ArrayList field_1215;
    // $FF: renamed from: o boolean
    private boolean field_1216;
    // $FF: renamed from: p int
    private int field_1217 = 0;
    // $FF: renamed from: q android.view.ContextMenu.ContextMenuInfo
    private ContextMenuInfo field_1218;
    // $FF: renamed from: r boolean
    private boolean field_1219 = false;
    // $FF: renamed from: s boolean
    private boolean field_1220 = false;
    // $FF: renamed from: t boolean
    private boolean field_1221 = false;
    // $FF: renamed from: u boolean
    private boolean field_1222 = false;
    // $FF: renamed from: v boolean
    private boolean field_1223 = false;
    // $FF: renamed from: w java.util.ArrayList
    private ArrayList field_1224 = new ArrayList();
    // $FF: renamed from: x java.util.concurrent.CopyOnWriteArrayList
    private CopyOnWriteArrayList field_1225 = new CopyOnWriteArrayList();
    // $FF: renamed from: y android.support.v7.view.menu.h
    private class_168 field_1226;
    // $FF: renamed from: z boolean
    private boolean field_1227;

    public class_162(Context var1) {
        this.field_1206 = var1;
        this.field_1207 = var1.getResources();
        this.field_1211 = new ArrayList();
        this.field_1212 = new ArrayList();
        this.field_1213 = true;
        this.field_1214 = new ArrayList();
        this.field_1215 = new ArrayList();
        this.field_1216 = true;
        this.method_1339(true);
    }

    // $FF: renamed from: a (java.util.ArrayList, int) int
    private static int method_1333(ArrayList var0, int var1) {
        int var2 = var0.size() - 1;

        while(true) {
            if (var2 < 0) {
                var1 = 0;
                break;
            }

            if (((class_168)var0.get(var2)).method_1428() <= var1) {
                var1 = var2 + 1;
                break;
            }

            --var2;
        }

        return var1;
    }

    // $FF: renamed from: a (int, int, int, int, java.lang.CharSequence, int) android.support.v7.view.menu.h
    private class_168 method_1334(int var1, int var2, int var3, int var4, CharSequence var5, int var6) {
        return new class_168(this, var1, var2, var3, var4, var5, var6);
    }

    // $FF: renamed from: a (int, java.lang.CharSequence, int, android.graphics.drawable.Drawable, android.view.View) void
    private void method_1335(int var1, CharSequence var2, int var3, Drawable var4, View var5) {
        Resources var6 = this.method_1363();
        if (var5 != null) {
            this.field_1205 = var5;
            this.field_1203 = null;
            this.field_1204 = null;
        } else {
            if (var1 > 0) {
                this.field_1203 = var6.getText(var1);
            } else if (var2 != null) {
                this.field_1203 = var2;
            }

            if (var3 > 0) {
                this.field_1204 = class_47.method_513(this.method_1366(), var3);
            } else if (var4 != null) {
                this.field_1204 = var4;
            }

            this.field_1205 = null;
        }

        this.method_1361(false);
    }

    // $FF: renamed from: a (int, boolean) void
    private void method_1336(int var1, boolean var2) {
        if (var1 >= 0 && var1 < this.field_1211.size()) {
            this.field_1211.remove(var1);
            if (var2) {
                this.method_1361(true);
            }
        }

    }

    // $FF: renamed from: a (android.support.v7.view.menu.s, android.support.v7.view.menu.m) boolean
    private boolean method_1337(class_163 var1, class_23 var2) {
        boolean var4 = false;
        boolean var3 = false;
        if (!this.field_1225.isEmpty()) {
            var3 = var4;
            if (var2 != null) {
                var3 = var2.method_143(var1);
            }

            Iterator var5 = this.field_1225.iterator();

            while(var5.hasNext()) {
                WeakReference var6 = (WeakReference)var5.next();
                var2 = (class_23)var6.get();
                if (var2 == null) {
                    this.field_1225.remove(var6);
                } else if (!var3) {
                    var3 = var2.method_143(var1);
                }
            }
        }

        return var3;
    }

    // $FF: renamed from: c (boolean) void
    private void method_1338(boolean var1) {
        if (!this.field_1225.isEmpty()) {
            this.method_1370();
            Iterator var3 = this.field_1225.iterator();

            while(var3.hasNext()) {
                WeakReference var4 = (WeakReference)var3.next();
                class_23 var2 = (class_23)var4.get();
                if (var2 == null) {
                    this.field_1225.remove(var4);
                } else {
                    var2.method_144(var1);
                }
            }

            this.method_1371();
        }

    }

    // $FF: renamed from: d (boolean) void
    private void method_1339(boolean var1) {
        boolean var2 = true;
        if (var1 && this.field_1207.getConfiguration().keyboard != 1 && this.field_1207.getBoolean(a$b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            var1 = var2;
        } else {
            var1 = false;
        }

        this.field_1209 = var1;
    }

    // $FF: renamed from: e (int) int
    private static int method_1340(int var0) {
        int var1 = (-65536 & var0) >> 16;
        if (var1 >= 0 && var1 < field_1202.length) {
            return field_1202[var1] << 16 | '\uffff' & var0;
        } else {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
    }

    // $FF: renamed from: a (int) int
    public int method_1341(int var1) {
        int var3 = this.size();
        int var2 = 0;

        while(true) {
            if (var2 >= var3) {
                var1 = -1;
                break;
            }

            if (((class_168)this.field_1211.get(var2)).getItemId() == var1) {
                var1 = var2;
                break;
            }

            ++var2;
        }

        return var1;
    }

    // $FF: renamed from: a (int, int) int
    public int method_1342(int var1, int var2) {
        int var4 = this.size();
        int var3 = var2;
        if (var2 < 0) {
            var3 = 0;
        }

        var2 = var3;

        while(true) {
            if (var2 >= var4) {
                var2 = -1;
                break;
            }

            if (((class_168)this.field_1211.get(var2)).getGroupId() == var1) {
                break;
            }

            ++var2;
        }

        return var2;
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) android.support.v7.view.menu.g
    protected class_162 method_1343(Drawable var1) {
        this.method_1335(0, (CharSequence)null, 0, var1, (View)null);
        return this;
    }

    // $FF: renamed from: a (android.view.View) android.support.v7.view.menu.g
    protected class_162 method_1344(View var1) {
        this.method_1335(0, (CharSequence)null, 0, (Drawable)null, var1);
        return this;
    }

    // $FF: renamed from: a (java.lang.CharSequence) android.support.v7.view.menu.g
    protected class_162 method_1345(CharSequence var1) {
        this.method_1335(0, var1, 0, (Drawable)null, (View)null);
        return this;
    }

    // $FF: renamed from: a (int, android.view.KeyEvent) android.support.v7.view.menu.h
    class_168 method_1346(int var1, KeyEvent var2) {
        ArrayList var10 = this.field_1224;
        var10.clear();
        this.method_1353(var10, var1, var2);
        class_168 var11;
        if (var10.isEmpty()) {
            var11 = null;
        } else {
            int var6 = var2.getMetaState();
            KeyData var9 = new KeyData();
            var2.getKeyData(var9);
            int var5 = var10.size();
            if (var5 == 1) {
                var11 = (class_168)var10.get(0);
            } else {
                boolean var7 = this.method_1355();

                for(int var3 = 0; var3 < var5; ++var3) {
                    class_168 var8 = (class_168)var10.get(var3);
                    char var4;
                    if (var7) {
                        var4 = var8.getAlphabeticShortcut();
                    } else {
                        var4 = var8.getNumericShortcut();
                    }

                    if (var4 == var9.meta[0]) {
                        var11 = var8;
                        if ((var6 & 2) == 0) {
                            return var11;
                        }
                    }

                    if (var4 == var9.meta[2]) {
                        var11 = var8;
                        if ((var6 & 2) != 0) {
                            return var11;
                        }
                    }

                    if (var7 && var4 == '\b') {
                        var11 = var8;
                        if (var1 == 67) {
                            return var11;
                        }
                    }
                }

                var11 = null;
            }
        }

        return var11;
    }

    // $FF: renamed from: a (int, int, int, java.lang.CharSequence) android.view.MenuItem
    protected MenuItem method_1347(int var1, int var2, int var3, CharSequence var4) {
        int var5 = method_1340(var3);
        class_168 var6 = this.method_1334(var1, var2, var3, var5, var4, this.field_1217);
        if (this.field_1218 != null) {
            var6.method_1423(this.field_1218);
        }

        this.field_1211.add(method_1333(this.field_1211, var5), var6);
        this.method_1361(true);
        return var6;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g$a) void
    public void method_1348(g$a var1) {
        this.field_1210 = var1;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.h) void
    void method_1349(class_168 var1) {
        this.field_1213 = true;
        this.method_1361(true);
    }

    // $FF: renamed from: a (android.support.v7.view.menu.m) void
    public void method_1350(class_23 var1) {
        Iterator var2 = this.field_1225.iterator();

        while(true) {
            class_23 var3;
            WeakReference var4;
            do {
                if (!var2.hasNext()) {
                    return;
                }

                var4 = (WeakReference)var2.next();
                var3 = (class_23)var4.get();
            } while(var3 != null && var3 != var1);

            this.field_1225.remove(var4);
        }
    }

    // $FF: renamed from: a (android.support.v7.view.menu.m, android.content.Context) void
    public void method_1351(class_23 var1, Context var2) {
        this.field_1225.add(new WeakReference(var1));
        var1.method_139(var2, this);
        this.field_1216 = true;
    }

    // $FF: renamed from: a (android.view.MenuItem) void
    void method_1352(MenuItem var1) {
        int var4 = var1.getGroupId();
        int var3 = this.field_1211.size();
        this.method_1370();

        for(int var2 = 0; var2 < var3; ++var2) {
            class_168 var6 = (class_168)this.field_1211.get(var2);
            if (var6.getGroupId() == var4 && var6.method_1435() && var6.isCheckable()) {
                boolean var5;
                if (var6 == var1) {
                    var5 = true;
                } else {
                    var5 = false;
                }

                var6.method_1426(var5);
            }
        }

        this.method_1371();
    }

    // $FF: renamed from: a (java.util.List, int, android.view.KeyEvent) void
    void method_1353(List var1, int var2, KeyEvent var3) {
        boolean var9 = this.method_1355();
        int var8 = var3.getModifiers();
        KeyData var11 = new KeyData();
        if (var3.getKeyData(var11) || var2 == 67) {
            int var7 = this.field_1211.size();

            for(int var4 = 0; var4 < var7; ++var4) {
                class_168 var10 = (class_168)this.field_1211.get(var4);
                if (var10.hasSubMenu()) {
                    ((class_162)var10.getSubMenu()).method_1353(var1, var2, var3);
                }

                char var5;
                if (var9) {
                    var5 = var10.getAlphabeticShortcut();
                } else {
                    var5 = var10.getNumericShortcut();
                }

                int var6;
                if (var9) {
                    var6 = var10.getAlphabeticModifiers();
                } else {
                    var6 = var10.getNumericModifiers();
                }

                boolean var12;
                if ((var8 & 69647) == (var6 & 69647)) {
                    var12 = true;
                } else {
                    var12 = false;
                }

                if (var12 && var5 != 0 && (var5 == var11.meta[0] || var5 == var11.meta[2] || var9 && var5 == '\b' && var2 == 67) && var10.isEnabled()) {
                    var1.add(var10);
                }
            }
        }

    }

    // $FF: renamed from: a (boolean) void
    public final void method_1354(boolean var1) {
        if (!this.field_1223) {
            this.field_1223 = true;
            Iterator var3 = this.field_1225.iterator();

            while(var3.hasNext()) {
                WeakReference var4 = (WeakReference)var3.next();
                class_23 var2 = (class_23)var4.get();
                if (var2 == null) {
                    this.field_1225.remove(var4);
                } else {
                    var2.method_140(this, var1);
                }
            }

            this.field_1223 = false;
        }

    }

    // $FF: renamed from: a () boolean
    boolean method_1355() {
        return this.field_1208;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.g, android.view.MenuItem) boolean
    boolean method_1356(class_162 var1, MenuItem var2) {
        boolean var3;
        if (this.field_1210 != null && this.field_1210.method_119(var1, var2)) {
            var3 = true;
        } else {
            var3 = false;
        }

        return var3;
    }

    // $FF: renamed from: a (android.view.MenuItem, int) boolean
    public boolean method_1357(MenuItem var1, int var2) {
        return this.method_1358(var1, (class_23)null, var2);
    }

    // $FF: renamed from: a (android.view.MenuItem, android.support.v7.view.menu.m, int) boolean
    public boolean method_1358(MenuItem var1, class_23 var2, int var3) {
        boolean var6 = false;
        class_168 var7 = (class_168)var1;
        boolean var5 = var6;
        if (var7 != null) {
            if (!var7.isEnabled()) {
                var5 = var6;
            } else {
                var5 = var7.method_1427();
                class_129 var8 = var7.method_38();
                boolean var4;
                if (var8 != null && var8.method_1073()) {
                    var4 = true;
                } else {
                    var4 = false;
                }

                if (var7.method_1442()) {
                    var6 = var7.expandActionView() | var5;
                    var5 = var6;
                    if (var6) {
                        this.method_1354(true);
                        var5 = var6;
                    }
                } else if (!var7.hasSubMenu() && !var4) {
                    if ((var3 & 1) == 0) {
                        this.method_1354(true);
                    }
                } else {
                    if ((var3 & 4) == 0) {
                        this.method_1354(false);
                    }

                    if (!var7.hasSubMenu()) {
                        var7.method_1422(new class_163(this.method_1366(), this, var7));
                    }

                    class_163 var9 = (class_163)var7.getSubMenu();
                    if (var4) {
                        var8.method_1068(var9);
                    }

                    var6 = this.method_1337(var9, var2) | var5;
                    var5 = var6;
                    if (!var6) {
                        this.method_1354(true);
                        var5 = var6;
                    }
                }
            }
        }

        return var5;
    }

    public MenuItem add(int var1) {
        return this.method_1347(0, 0, 0, this.field_1207.getString(var1));
    }

    public MenuItem add(int var1, int var2, int var3, int var4) {
        return this.method_1347(var1, var2, var3, this.field_1207.getString(var4));
    }

    public MenuItem add(int var1, int var2, int var3, CharSequence var4) {
        return this.method_1347(var1, var2, var3, var4);
    }

    public MenuItem add(CharSequence var1) {
        return this.method_1347(0, 0, 0, var1);
    }

    public int addIntentOptions(int var1, int var2, int var3, ComponentName var4, Intent[] var5, Intent var6, int var7, MenuItem[] var8) {
        PackageManager var10 = this.field_1206.getPackageManager();
        List var11 = var10.queryIntentActivityOptions(var4, var5, var6, 0);
        int var9;
        if (var11 != null) {
            var9 = var11.size();
        } else {
            var9 = 0;
        }

        if ((var7 & 1) == 0) {
            this.removeGroup(var1);
        }

        for(var7 = 0; var7 < var9; ++var7) {
            ResolveInfo var12 = (ResolveInfo)var11.get(var7);
            Intent var13;
            if (var12.specificIndex < 0) {
                var13 = var6;
            } else {
                var13 = var5[var12.specificIndex];
            }

            var13 = new Intent(var13);
            var13.setComponent(new ComponentName(var12.activityInfo.applicationInfo.packageName, var12.activityInfo.name));
            MenuItem var14 = this.add(var1, var2, var3, var12.loadLabel(var10)).setIcon(var12.loadIcon(var10)).setIntent(var13);
            if (var8 != null && var12.specificIndex >= 0) {
                var8[var12.specificIndex] = var14;
            }
        }

        return var9;
    }

    public SubMenu addSubMenu(int var1) {
        return this.addSubMenu(0, 0, 0, this.field_1207.getString(var1));
    }

    public SubMenu addSubMenu(int var1, int var2, int var3, int var4) {
        return this.addSubMenu(var1, var2, var3, this.field_1207.getString(var4));
    }

    public SubMenu addSubMenu(int var1, int var2, int var3, CharSequence var4) {
        class_168 var5 = (class_168)this.method_1347(var1, var2, var3, var4);
        class_163 var6 = new class_163(this.field_1206, this, var5);
        var5.method_1422(var6);
        return var6;
    }

    public SubMenu addSubMenu(CharSequence var1) {
        return this.addSubMenu(0, 0, 0, var1);
    }

    // $FF: renamed from: b (int) int
    public int method_1359(int var1) {
        return this.method_1342(var1, 0);
    }

    // $FF: renamed from: b (android.support.v7.view.menu.h) void
    void method_1360(class_168 var1) {
        this.field_1216 = true;
        this.method_1361(true);
    }

    // $FF: renamed from: b (boolean) void
    public void method_1361(boolean var1) {
        if (!this.field_1219) {
            if (var1) {
                this.field_1213 = true;
                this.field_1216 = true;
            }

            this.method_1338(var1);
        } else {
            this.field_1220 = true;
            if (var1) {
                this.field_1221 = true;
            }
        }

    }

    // $FF: renamed from: b () boolean
    public boolean method_1362() {
        return this.field_1209;
    }

    // $FF: renamed from: c () android.content.res.Resources
    Resources method_1363() {
        return this.field_1207;
    }

    // $FF: renamed from: c (int) android.support.v7.view.menu.g
    protected class_162 method_1364(int var1) {
        this.method_1335(var1, (CharSequence)null, 0, (Drawable)null, (View)null);
        return this;
    }

    // $FF: renamed from: c (android.support.v7.view.menu.h) boolean
    public boolean method_1365(class_168 var1) {
        boolean var3 = false;
        if (!this.field_1225.isEmpty()) {
            this.method_1370();
            Iterator var6 = this.field_1225.iterator();
            boolean var2 = false;

            while(var6.hasNext()) {
                WeakReference var4 = (WeakReference)var6.next();
                class_23 var5 = (class_23)var4.get();
                if (var5 == null) {
                    this.field_1225.remove(var4);
                } else {
                    var3 = var5.method_142(this, var1);
                    var2 = var3;
                    if (var3) {
                        var2 = var3;
                        break;
                    }
                }
            }

            this.method_1371();
            var3 = var2;
            if (var2) {
                this.field_1226 = var1;
                var3 = var2;
            }
        }

        return var3;
    }

    public void clear() {
        if (this.field_1226 != null) {
            this.method_1368(this.field_1226);
        }

        this.field_1211.clear();
        this.method_1361(true);
    }

    public void clearHeader() {
        this.field_1204 = null;
        this.field_1203 = null;
        this.field_1205 = null;
        this.method_1361(false);
    }

    public void close() {
        this.method_1354(true);
    }

    // $FF: renamed from: d () android.content.Context
    public Context method_1366() {
        return this.field_1206;
    }

    // $FF: renamed from: d (int) android.support.v7.view.menu.g
    protected class_162 method_1367(int var1) {
        this.method_1335(0, (CharSequence)null, var1, (Drawable)null, (View)null);
        return this;
    }

    // $FF: renamed from: d (android.support.v7.view.menu.h) boolean
    public boolean method_1368(class_168 var1) {
        boolean var2 = false;
        boolean var3 = var2;
        if (!this.field_1225.isEmpty()) {
            if (this.field_1226 != var1) {
                var3 = var2;
            } else {
                this.method_1370();
                Iterator var5 = this.field_1225.iterator();
                var2 = false;

                while(var5.hasNext()) {
                    WeakReference var6 = (WeakReference)var5.next();
                    class_23 var4 = (class_23)var6.get();
                    if (var4 == null) {
                        this.field_1225.remove(var6);
                    } else {
                        var3 = var4.method_146(this, var1);
                        var2 = var3;
                        if (var3) {
                            var2 = var3;
                            break;
                        }
                    }
                }

                this.method_1371();
                var3 = var2;
                if (var2) {
                    this.field_1226 = null;
                    var3 = var2;
                }
            }
        }

        return var3;
    }

    // $FF: renamed from: e () void
    public void method_1369() {
        if (this.field_1210 != null) {
            this.field_1210.method_118(this);
        }

    }

    // $FF: renamed from: f () void
    public void method_1370() {
        if (!this.field_1219) {
            this.field_1219 = true;
            this.field_1220 = false;
            this.field_1221 = false;
        }

    }

    public MenuItem findItem(int var1) {
        int var3 = this.size();
        int var2 = 0;

        Object var4;
        while(true) {
            if (var2 >= var3) {
                var4 = null;
                break;
            }

            var4 = (class_168)this.field_1211.get(var2);
            if (((class_168)var4).getItemId() == var1) {
                break;
            }

            if (((class_168)var4).hasSubMenu()) {
                MenuItem var5 = ((class_168)var4).getSubMenu().findItem(var1);
                var4 = var5;
                if (var5 != null) {
                    break;
                }
            }

            ++var2;
        }

        return (MenuItem)var4;
    }

    // $FF: renamed from: g () void
    public void method_1371() {
        this.field_1219 = false;
        if (this.field_1220) {
            this.field_1220 = false;
            this.method_1361(this.field_1221);
        }

    }

    public MenuItem getItem(int var1) {
        return (MenuItem)this.field_1211.get(var1);
    }

    // $FF: renamed from: h () java.util.ArrayList
    public ArrayList method_1372() {
        ArrayList var3;
        if (!this.field_1213) {
            var3 = this.field_1212;
        } else {
            this.field_1212.clear();
            int var2 = this.field_1211.size();

            for(int var1 = 0; var1 < var2; ++var1) {
                class_168 var4 = (class_168)this.field_1211.get(var1);
                if (var4.isVisible()) {
                    this.field_1212.add(var4);
                }
            }

            this.field_1213 = false;
            this.field_1216 = true;
            var3 = this.field_1212;
        }

        return var3;
    }

    public boolean hasVisibleItems() {
        boolean var3;
        if (this.field_1227) {
            var3 = true;
        } else {
            int var2 = this.size();
            int var1 = 0;

            while(true) {
                if (var1 >= var2) {
                    var3 = false;
                    break;
                }

                if (((class_168)this.field_1211.get(var1)).isVisible()) {
                    var3 = true;
                    break;
                }

                ++var1;
            }
        }

        return var3;
    }

    // $FF: renamed from: i () void
    public void method_1373() {
        ArrayList var3 = this.method_1372();
        if (this.field_1216) {
            Iterator var6 = this.field_1225.iterator();
            boolean var1 = false;

            while(var6.hasNext()) {
                WeakReference var5 = (WeakReference)var6.next();
                class_23 var4 = (class_23)var5.get();
                if (var4 == null) {
                    this.field_1225.remove(var5);
                } else {
                    var1 |= var4.method_145();
                }
            }

            if (var1) {
                this.field_1214.clear();
                this.field_1215.clear();
                int var2 = var3.size();

                for(int var7 = 0; var7 < var2; ++var7) {
                    class_168 var8 = (class_168)var3.get(var7);
                    if (var8.method_1438()) {
                        this.field_1214.add(var8);
                    } else {
                        this.field_1215.add(var8);
                    }
                }
            } else {
                this.field_1214.clear();
                this.field_1215.clear();
                this.field_1215.addAll(this.method_1372());
            }

            this.field_1216 = false;
        }

    }

    public boolean isShortcutKey(int var1, KeyEvent var2) {
        boolean var3;
        if (this.method_1346(var1, var2) != null) {
            var3 = true;
        } else {
            var3 = false;
        }

        return var3;
    }

    // $FF: renamed from: j () java.util.ArrayList
    public ArrayList method_1374() {
        this.method_1373();
        return this.field_1214;
    }

    // $FF: renamed from: k () java.util.ArrayList
    public ArrayList method_1375() {
        this.method_1373();
        return this.field_1215;
    }

    // $FF: renamed from: l () java.lang.CharSequence
    public CharSequence method_1376() {
        return this.field_1203;
    }

    // $FF: renamed from: m () android.support.v7.view.menu.g
    public class_162 method_1377() {
        return this;
    }

    // $FF: renamed from: n () boolean
    boolean method_1378() {
        return this.field_1222;
    }

    // $FF: renamed from: o () android.support.v7.view.menu.h
    public class_168 method_1379() {
        return this.field_1226;
    }

    public boolean performIdentifierAction(int var1, int var2) {
        return this.method_1357(this.findItem(var1), var2);
    }

    public boolean performShortcut(int var1, KeyEvent var2, int var3) {
        class_168 var5 = this.method_1346(var1, var2);
        boolean var4 = false;
        if (var5 != null) {
            var4 = this.method_1357(var5, var3);
        }

        if ((var3 & 2) != 0) {
            this.method_1354(true);
        }

        return var4;
    }

    public void removeGroup(int var1) {
        int var3 = this.method_1359(var1);
        if (var3 >= 0) {
            int var4 = this.field_1211.size();

            for(int var2 = 0; var2 < var4 - var3 && ((class_168)this.field_1211.get(var3)).getGroupId() == var1; ++var2) {
                this.method_1336(var3, false);
            }

            this.method_1361(true);
        }

    }

    public void removeItem(int var1) {
        this.method_1336(this.method_1341(var1), true);
    }

    public void setGroupCheckable(int var1, boolean var2, boolean var3) {
        int var5 = this.field_1211.size();

        for(int var4 = 0; var4 < var5; ++var4) {
            class_168 var6 = (class_168)this.field_1211.get(var4);
            if (var6.getGroupId() == var1) {
                var6.method_1424(var3);
                var6.setCheckable(var2);
            }
        }

    }

    public void setGroupEnabled(int var1, boolean var2) {
        int var4 = this.field_1211.size();

        for(int var3 = 0; var3 < var4; ++var3) {
            class_168 var5 = (class_168)this.field_1211.get(var3);
            if (var5.getGroupId() == var1) {
                var5.setEnabled(var2);
            }
        }

    }

    public void setGroupVisible(int var1, boolean var2) {
        int var5 = this.field_1211.size();
        int var4 = 0;

        boolean var3;
        for(var3 = false; var4 < var5; ++var4) {
            class_168 var6 = (class_168)this.field_1211.get(var4);
            if (var6.getGroupId() == var1 && var6.method_1429(var2)) {
                var3 = true;
            }
        }

        if (var3) {
            this.method_1361(true);
        }

    }

    public void setQwertyMode(boolean var1) {
        this.field_1208 = var1;
        this.method_1361(false);
    }

    public int size() {
        return this.field_1211.size();
    }
}
