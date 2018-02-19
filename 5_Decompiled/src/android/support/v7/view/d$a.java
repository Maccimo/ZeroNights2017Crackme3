package android.support.v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

class d$a implements OnMenuItemClickListener {
    // $FF: renamed from: a java.lang.Class[]
    private static final Class[] field_447 = new Class[]{MenuItem.class};
    // $FF: renamed from: b java.lang.Object
    private Object field_448;
    // $FF: renamed from: c java.lang.reflect.Method
    private Method field_449;

    public d$a(Object var1, String var2) {
        this.field_448 = var1;
        Class var3 = var1.getClass();

        try {
            this.field_449 = var3.getMethod(var2, field_447);
        } catch (Exception var4) {
            InflateException var5 = new InflateException("Couldn't resolve menu item onClick handler " + var2 + " in class " + var3.getName());
            var5.initCause(var4);
            throw var5;
        }
    }

    public boolean onMenuItemClick(MenuItem var1) {
        boolean var2 = true;

        try {
            if (this.field_449.getReturnType() == Boolean.TYPE) {
                var2 = (Boolean)this.field_449.invoke(this.field_448, var1);
            } else {
                this.field_449.invoke(this.field_448, var1);
            }

            return var2;
        } catch (Exception var3) {
            throw new RuntimeException(var3);
        }
    }
}
