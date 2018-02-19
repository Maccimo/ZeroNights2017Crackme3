package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.c.a.class_48;
import android.support.v4.d.a.class_12;
import android.support.v4.h.c$b;
import android.support.v4.h.class_129;
import android.support.v7.b.a.class_39;
import android.util.Log;
import android.view.ActionProvider;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

// $FF: renamed from: android.support.v7.view.menu.h
public final class class_168 implements class_12 {
    // $FF: renamed from: F java.lang.String
    private static String field_1289;
    // $FF: renamed from: G java.lang.String
    private static String field_1290;
    // $FF: renamed from: H java.lang.String
    private static String field_1291;
    // $FF: renamed from: I java.lang.String
    private static String field_1292;
    // $FF: renamed from: A android.view.View
    private View field_1293;
    // $FF: renamed from: B android.support.v4.h.c
    private class_129 field_1294;
    // $FF: renamed from: C android.view.MenuItem.OnActionExpandListener
    private OnActionExpandListener field_1295;
    // $FF: renamed from: D boolean
    private boolean field_1296 = false;
    // $FF: renamed from: E android.view.ContextMenu.ContextMenuInfo
    private ContextMenuInfo field_1297;
    // $FF: renamed from: a android.support.v7.view.menu.g
    class_162 field_1298;
    // $FF: renamed from: b int
    private final int field_1299;
    // $FF: renamed from: c int
    private final int field_1300;
    // $FF: renamed from: d int
    private final int field_1301;
    // $FF: renamed from: e int
    private final int field_1302;
    // $FF: renamed from: f java.lang.CharSequence
    private CharSequence field_1303;
    // $FF: renamed from: g java.lang.CharSequence
    private CharSequence field_1304;
    // $FF: renamed from: h android.content.Intent
    private Intent field_1305;
    // $FF: renamed from: i char
    private char field_1306;
    // $FF: renamed from: j int
    private int field_1307 = 4096;
    // $FF: renamed from: k char
    private char field_1308;
    // $FF: renamed from: l int
    private int field_1309 = 4096;
    // $FF: renamed from: m android.graphics.drawable.Drawable
    private Drawable field_1310;
    // $FF: renamed from: n int
    private int field_1311 = 0;
    // $FF: renamed from: o android.support.v7.view.menu.s
    private class_163 field_1312;
    // $FF: renamed from: p java.lang.Runnable
    private Runnable field_1313;
    // $FF: renamed from: q android.view.MenuItem.OnMenuItemClickListener
    private OnMenuItemClickListener field_1314;
    // $FF: renamed from: r java.lang.CharSequence
    private CharSequence field_1315;
    // $FF: renamed from: s java.lang.CharSequence
    private CharSequence field_1316;
    // $FF: renamed from: t android.content.res.ColorStateList
    private ColorStateList field_1317 = null;
    // $FF: renamed from: u android.graphics.PorterDuff.Mode
    private Mode field_1318 = null;
    // $FF: renamed from: v boolean
    private boolean field_1319 = false;
    // $FF: renamed from: w boolean
    private boolean field_1320 = false;
    // $FF: renamed from: x boolean
    private boolean field_1321 = false;
    // $FF: renamed from: y int
    private int field_1322 = 16;
    // $FF: renamed from: z int
    private int field_1323 = 0;

    class_168(class_162 var1, int var2, int var3, int var4, int var5, CharSequence var6, int var7) {
        this.field_1298 = var1;
        this.field_1299 = var3;
        this.field_1300 = var2;
        this.field_1301 = var4;
        this.field_1302 = var5;
        this.field_1303 = var6;
        this.field_1323 = var7;
    }

    // $FF: renamed from: a (android.graphics.drawable.Drawable) android.graphics.drawable.Drawable
    private Drawable method_1418(Drawable var1) {
        Drawable var2 = var1;
        if (var1 != null) {
            var2 = var1;
            if (this.field_1321) {
                if (!this.field_1319) {
                    var2 = var1;
                    if (!this.field_1320) {
                        return var2;
                    }
                }

                var2 = class_48.method_532(var1).mutate();
                if (this.field_1319) {
                    class_48.method_523(var2, this.field_1317);
                }

                if (this.field_1320) {
                    class_48.method_526(var2, this.field_1318);
                }

                this.field_1321 = false;
            }
        }

        return var2;
    }

    // $FF: renamed from: a (int) android.support.v4.d.a.b
    public class_12 method_1419(int var1) {
        Context var2 = this.field_1298.method_1366();
        this.method_1420(LayoutInflater.from(var2).inflate(var1, new LinearLayout(var2), false));
        return this;
    }

    // $FF: renamed from: a (android.support.v4.h.c) android.support.v4.d.a.b
    public class_12 method_36(class_129 var1) {
        if (this.field_1294 != null) {
            this.field_1294.method_1074();
        }

        this.field_1293 = null;
        this.field_1294 = var1;
        this.field_1298.method_1361(true);
        if (this.field_1294 != null) {
            this.field_1294.method_1067(new c$b() {
                // $FF: renamed from: a (boolean) void
                public void method_34(boolean var1) {
                    class_168.this.field_1298.method_1349(class_168.this);
                }
            });
        }

        return this;
    }

    // $FF: renamed from: a (android.view.View) android.support.v4.d.a.b
    public class_12 method_1420(View var1) {
        this.field_1293 = var1;
        this.field_1294 = null;
        if (var1 != null && var1.getId() == -1 && this.field_1299 > 0) {
            var1.setId(this.field_1299);
        }

        this.field_1298.method_1360(this);
        return this;
    }

    // $FF: renamed from: a (java.lang.CharSequence) android.support.v4.d.a.b
    public class_12 method_37(CharSequence var1) {
        this.field_1315 = var1;
        this.field_1298.method_1361(false);
        return this;
    }

    // $FF: renamed from: a () android.support.v4.h.c
    public class_129 method_38() {
        return this.field_1294;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.n$a) java.lang.CharSequence
    CharSequence method_1421(n$a var1) {
        CharSequence var2;
        if (var1 != null && var1.method_9()) {
            var2 = this.getTitleCondensed();
        } else {
            var2 = this.getTitle();
        }

        return var2;
    }

    // $FF: renamed from: a (android.support.v7.view.menu.s) void
    public void method_1422(class_163 var1) {
        this.field_1312 = var1;
        var1.setHeaderTitle(this.getTitle());
    }

    // $FF: renamed from: a (android.view.ContextMenu.ContextMenuInfo) void
    void method_1423(ContextMenuInfo var1) {
        this.field_1297 = var1;
    }

    // $FF: renamed from: a (boolean) void
    public void method_1424(boolean var1) {
        int var3 = this.field_1322;
        byte var2;
        if (var1) {
            var2 = 4;
        } else {
            var2 = 0;
        }

        this.field_1322 = var2 | var3 & -5;
    }

    // $FF: renamed from: b (int) android.support.v4.d.a.b
    public class_12 method_1425(int var1) {
        this.setShowAsAction(var1);
        return this;
    }

    // $FF: renamed from: b (java.lang.CharSequence) android.support.v4.d.a.b
    public class_12 method_39(CharSequence var1) {
        this.field_1316 = var1;
        this.field_1298.method_1361(false);
        return this;
    }

    // $FF: renamed from: b (boolean) void
    void method_1426(boolean var1) {
        int var3 = this.field_1322;
        int var4 = this.field_1322;
        byte var2;
        if (var1) {
            var2 = 2;
        } else {
            var2 = 0;
        }

        this.field_1322 = var2 | var4 & -3;
        if (var3 != this.field_1322) {
            this.field_1298.method_1361(false);
        }

    }

    // $FF: renamed from: b () boolean
    public boolean method_1427() {
        boolean var2 = true;
        boolean var1;
        if (this.field_1314 != null && this.field_1314.onMenuItemClick(this)) {
            var1 = var2;
        } else {
            var1 = var2;
            if (!this.field_1298.method_1356(this.field_1298, this)) {
                if (this.field_1313 != null) {
                    this.field_1313.run();
                    var1 = var2;
                } else {
                    if (this.field_1305 != null) {
                        label44: {
                            try {
                                this.field_1298.method_1366().startActivity(this.field_1305);
                            } catch (ActivityNotFoundException var4) {
                                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", var4);
                                break label44;
                            }

                            var1 = var2;
                            return var1;
                        }
                    }

                    if (this.field_1294 != null) {
                        var1 = var2;
                        if (this.field_1294.method_1072()) {
                            return var1;
                        }
                    }

                    var1 = false;
                }
            }
        }

        return var1;
    }

    // $FF: renamed from: c () int
    public int method_1428() {
        return this.field_1302;
    }

    // $FF: renamed from: c (boolean) boolean
    boolean method_1429(boolean var1) {
        boolean var5 = false;
        int var4 = this.field_1322;
        int var3 = this.field_1322;
        byte var2;
        if (var1) {
            var2 = 0;
        } else {
            var2 = 8;
        }

        this.field_1322 = var2 | var3 & -9;
        var1 = var5;
        if (var4 != this.field_1322) {
            var1 = true;
        }

        return var1;
    }

    public boolean collapseActionView() {
        boolean var1 = false;
        if ((this.field_1323 & 8) != 0) {
            if (this.field_1293 == null) {
                var1 = true;
            } else if (this.field_1295 == null || this.field_1295.onMenuItemActionCollapse(this)) {
                var1 = this.field_1298.method_1368(this);
            }
        }

        return var1;
    }

    // $FF: renamed from: d () char
    char method_1430() {
        char var1;
        if (this.field_1298.method_1355()) {
            var1 = this.field_1308;
        } else {
            var1 = this.field_1306;
        }

        return var1;
    }

    // $FF: renamed from: d (boolean) void
    public void method_1431(boolean var1) {
        if (var1) {
            this.field_1322 |= 32;
        } else {
            this.field_1322 &= -33;
        }

    }

    // $FF: renamed from: e () java.lang.String
    String method_1432() {
        char var1 = this.method_1430();
        String var2;
        if (var1 == 0) {
            var2 = "";
        } else {
            StringBuilder var3 = new StringBuilder(field_1289);
            switch(var1) {
            case '\b':
                var3.append(field_1291);
                break;
            case '\n':
                var3.append(field_1290);
                break;
            case ' ':
                var3.append(field_1292);
                break;
            default:
                var3.append(var1);
            }

            var2 = var3.toString();
        }

        return var2;
    }

    // $FF: renamed from: e (boolean) void
    public void method_1433(boolean var1) {
        this.field_1296 = var1;
        this.field_1298.method_1361(false);
    }

    public boolean expandActionView() {
        boolean var1 = false;
        if (this.method_1442() && (this.field_1295 == null || this.field_1295.onMenuItemActionExpand(this))) {
            var1 = this.field_1298.method_1365(this);
        }

        return var1;
    }

    // $FF: renamed from: f () boolean
    boolean method_1434() {
        boolean var1;
        if (this.field_1298.method_1362() && this.method_1430() != 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: g () boolean
    public boolean method_1435() {
        boolean var1;
        if ((this.field_1322 & 4) != 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View var1;
        if (this.field_1293 != null) {
            var1 = this.field_1293;
        } else if (this.field_1294 != null) {
            this.field_1293 = this.field_1294.method_1065(this);
            var1 = this.field_1293;
        } else {
            var1 = null;
        }

        return var1;
    }

    public int getAlphabeticModifiers() {
        return this.field_1309;
    }

    public char getAlphabeticShortcut() {
        return this.field_1308;
    }

    public CharSequence getContentDescription() {
        return this.field_1315;
    }

    public int getGroupId() {
        return this.field_1300;
    }

    public Drawable getIcon() {
        Drawable var1;
        if (this.field_1310 != null) {
            var1 = this.method_1418(this.field_1310);
        } else if (this.field_1311 != 0) {
            var1 = class_39.method_382(this.field_1298.method_1366(), this.field_1311);
            this.field_1311 = 0;
            this.field_1310 = var1;
            var1 = this.method_1418(var1);
        } else {
            var1 = null;
        }

        return var1;
    }

    public ColorStateList getIconTintList() {
        return this.field_1317;
    }

    public Mode getIconTintMode() {
        return this.field_1318;
    }

    public Intent getIntent() {
        return this.field_1305;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.field_1299;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.field_1297;
    }

    public int getNumericModifiers() {
        return this.field_1307;
    }

    public char getNumericShortcut() {
        return this.field_1306;
    }

    public int getOrder() {
        return this.field_1301;
    }

    public SubMenu getSubMenu() {
        return this.field_1312;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.field_1303;
    }

    public CharSequence getTitleCondensed() {
        CharSequence var1;
        if (this.field_1304 != null) {
            var1 = this.field_1304;
        } else {
            var1 = this.field_1303;
        }

        Object var2 = var1;
        if (VERSION.SDK_INT < 18) {
            var2 = var1;
            if (var1 != null) {
                var2 = var1;
                if (!(var1 instanceof String)) {
                    var2 = var1.toString();
                }
            }
        }

        return (CharSequence)var2;
    }

    public CharSequence getTooltipText() {
        return this.field_1316;
    }

    // $FF: renamed from: h () void
    public void method_1436() {
        this.field_1298.method_1360(this);
    }

    public boolean hasSubMenu() {
        boolean var1;
        if (this.field_1312 != null) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: i () boolean
    public boolean method_1437() {
        return this.field_1298.method_1378();
    }

    public boolean isActionViewExpanded() {
        return this.field_1296;
    }

    public boolean isCheckable() {
        boolean var1 = true;
        if ((this.field_1322 & 1) != 1) {
            var1 = false;
        }

        return var1;
    }

    public boolean isChecked() {
        boolean var1;
        if ((this.field_1322 & 2) == 2) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public boolean isEnabled() {
        boolean var1;
        if ((this.field_1322 & 16) != 0) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    public boolean isVisible() {
        boolean var1 = true;
        if (this.field_1294 != null && this.field_1294.method_1070()) {
            if ((this.field_1322 & 8) != 0 || !this.field_1294.method_1071()) {
                var1 = false;
            }
        } else if ((this.field_1322 & 8) != 0) {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: j () boolean
    public boolean method_1438() {
        boolean var1;
        if ((this.field_1322 & 32) == 32) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: k () boolean
    public boolean method_1439() {
        boolean var1 = true;
        if ((this.field_1323 & 1) != 1) {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: l () boolean
    public boolean method_1440() {
        boolean var1;
        if ((this.field_1323 & 2) == 2) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: m () boolean
    public boolean method_1441() {
        boolean var1;
        if ((this.field_1323 & 4) == 4) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: n () boolean
    public boolean method_1442() {
        boolean var2 = false;
        boolean var1 = var2;
        if ((this.field_1323 & 8) != 0) {
            if (this.field_1293 == null && this.field_1294 != null) {
                this.field_1293 = this.field_1294.method_1065(this);
            }

            var1 = var2;
            if (this.field_1293 != null) {
                var1 = true;
            }
        }

        return var1;
    }

    public MenuItem setActionProvider(ActionProvider var1) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    // $FF: synthetic method
    public MenuItem setActionView(int var1) {
        return this.method_1419(var1);
    }

    // $FF: synthetic method
    public MenuItem setActionView(View var1) {
        return this.method_1420(var1);
    }

    public MenuItem setAlphabeticShortcut(char var1) {
        if (this.field_1308 != var1) {
            this.field_1308 = Character.toLowerCase(var1);
            this.field_1298.method_1361(false);
        }

        return this;
    }

    public MenuItem setAlphabeticShortcut(char var1, int var2) {
        if (this.field_1308 != var1 || this.field_1309 != var2) {
            this.field_1308 = Character.toLowerCase(var1);
            this.field_1309 = KeyEvent.normalizeMetaState(var2);
            this.field_1298.method_1361(false);
        }

        return this;
    }

    public MenuItem setCheckable(boolean var1) {
        int var3 = this.field_1322;
        int var4 = this.field_1322;
        byte var2;
        if (var1) {
            var2 = 1;
        } else {
            var2 = 0;
        }

        this.field_1322 = var2 | var4 & -2;
        if (var3 != this.field_1322) {
            this.field_1298.method_1361(false);
        }

        return this;
    }

    public MenuItem setChecked(boolean var1) {
        if ((this.field_1322 & 4) != 0) {
            this.field_1298.method_1352(this);
        } else {
            this.method_1426(var1);
        }

        return this;
    }

    // $FF: synthetic method
    public MenuItem setContentDescription(CharSequence var1) {
        return this.method_37(var1);
    }

    public MenuItem setEnabled(boolean var1) {
        if (var1) {
            this.field_1322 |= 16;
        } else {
            this.field_1322 &= -17;
        }

        this.field_1298.method_1361(false);
        return this;
    }

    public MenuItem setIcon(int var1) {
        this.field_1310 = null;
        this.field_1311 = var1;
        this.field_1321 = true;
        this.field_1298.method_1361(false);
        return this;
    }

    public MenuItem setIcon(Drawable var1) {
        this.field_1311 = 0;
        this.field_1310 = var1;
        this.field_1321 = true;
        this.field_1298.method_1361(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList var1) {
        this.field_1317 = var1;
        this.field_1319 = true;
        this.field_1321 = true;
        this.field_1298.method_1361(false);
        return this;
    }

    public MenuItem setIconTintMode(Mode var1) {
        this.field_1318 = var1;
        this.field_1320 = true;
        this.field_1321 = true;
        this.field_1298.method_1361(false);
        return this;
    }

    public MenuItem setIntent(Intent var1) {
        this.field_1305 = var1;
        return this;
    }

    public MenuItem setNumericShortcut(char var1) {
        if (this.field_1306 != var1) {
            this.field_1306 = var1;
            this.field_1298.method_1361(false);
        }

        return this;
    }

    public MenuItem setNumericShortcut(char var1, int var2) {
        if (this.field_1306 != var1 || this.field_1307 != var2) {
            this.field_1306 = var1;
            this.field_1307 = KeyEvent.normalizeMetaState(var2);
            this.field_1298.method_1361(false);
        }

        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener var1) {
        this.field_1295 = var1;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener var1) {
        this.field_1314 = var1;
        return this;
    }

    public MenuItem setShortcut(char var1, char var2) {
        this.field_1306 = var1;
        this.field_1308 = Character.toLowerCase(var2);
        this.field_1298.method_1361(false);
        return this;
    }

    public MenuItem setShortcut(char var1, char var2, int var3, int var4) {
        this.field_1306 = var1;
        this.field_1307 = KeyEvent.normalizeMetaState(var3);
        this.field_1308 = Character.toLowerCase(var2);
        this.field_1309 = KeyEvent.normalizeMetaState(var4);
        this.field_1298.method_1361(false);
        return this;
    }

    public void setShowAsAction(int var1) {
        switch(var1 & 3) {
        case 0:
        case 1:
        case 2:
            this.field_1323 = var1;
            this.field_1298.method_1360(this);
            return;
        default:
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    // $FF: synthetic method
    public MenuItem setShowAsActionFlags(int var1) {
        return this.method_1425(var1);
    }

    public MenuItem setTitle(int var1) {
        return this.setTitle(this.field_1298.method_1366().getString(var1));
    }

    public MenuItem setTitle(CharSequence var1) {
        this.field_1303 = var1;
        this.field_1298.method_1361(false);
        if (this.field_1312 != null) {
            this.field_1312.setHeaderTitle(var1);
        }

        return this;
    }

    public MenuItem setTitleCondensed(CharSequence var1) {
        this.field_1304 = var1;
        if (var1 == null) {
            var1 = this.field_1303;
        }

        this.field_1298.method_1361(false);
        return this;
    }

    // $FF: synthetic method
    public MenuItem setTooltipText(CharSequence var1) {
        return this.method_39(var1);
    }

    public MenuItem setVisible(boolean var1) {
        if (this.method_1429(var1)) {
            this.field_1298.method_1349(this);
        }

        return this;
    }

    public String toString() {
        String var1;
        if (this.field_1303 != null) {
            var1 = this.field_1303.toString();
        } else {
            var1 = null;
        }

        return var1;
    }
}
