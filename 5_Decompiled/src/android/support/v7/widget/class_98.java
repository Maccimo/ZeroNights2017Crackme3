package android.support.v7.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.Resources.Theme;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

// $FF: renamed from: android.support.v7.widget.ab
class class_98 extends Resources {
    // $FF: renamed from: a android.content.res.Resources
    private final Resources field_835;

    public class_98(Resources var1) {
        super(var1.getAssets(), var1.getDisplayMetrics(), var1.getConfiguration());
        this.field_835 = var1;
    }

    public XmlResourceParser getAnimation(int var1) {
        return this.field_835.getAnimation(var1);
    }

    public boolean getBoolean(int var1) {
        return this.field_835.getBoolean(var1);
    }

    public int getColor(int var1) {
        return this.field_835.getColor(var1);
    }

    public ColorStateList getColorStateList(int var1) {
        return this.field_835.getColorStateList(var1);
    }

    public Configuration getConfiguration() {
        return this.field_835.getConfiguration();
    }

    public float getDimension(int var1) {
        return this.field_835.getDimension(var1);
    }

    public int getDimensionPixelOffset(int var1) {
        return this.field_835.getDimensionPixelOffset(var1);
    }

    public int getDimensionPixelSize(int var1) {
        return this.field_835.getDimensionPixelSize(var1);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.field_835.getDisplayMetrics();
    }

    public Drawable getDrawable(int var1) {
        return this.field_835.getDrawable(var1);
    }

    public Drawable getDrawable(int var1, Theme var2) {
        return this.field_835.getDrawable(var1, var2);
    }

    public Drawable getDrawableForDensity(int var1, int var2) {
        return this.field_835.getDrawableForDensity(var1, var2);
    }

    public Drawable getDrawableForDensity(int var1, int var2, Theme var3) {
        return this.field_835.getDrawableForDensity(var1, var2, var3);
    }

    public float getFraction(int var1, int var2, int var3) {
        return this.field_835.getFraction(var1, var2, var3);
    }

    public int getIdentifier(String var1, String var2, String var3) {
        return this.field_835.getIdentifier(var1, var2, var3);
    }

    public int[] getIntArray(int var1) {
        return this.field_835.getIntArray(var1);
    }

    public int getInteger(int var1) {
        return this.field_835.getInteger(var1);
    }

    public XmlResourceParser getLayout(int var1) {
        return this.field_835.getLayout(var1);
    }

    public Movie getMovie(int var1) {
        return this.field_835.getMovie(var1);
    }

    public String getQuantityString(int var1, int var2) {
        return this.field_835.getQuantityString(var1, var2);
    }

    public String getQuantityString(int var1, int var2, Object... var3) {
        return this.field_835.getQuantityString(var1, var2, var3);
    }

    public CharSequence getQuantityText(int var1, int var2) {
        return this.field_835.getQuantityText(var1, var2);
    }

    public String getResourceEntryName(int var1) {
        return this.field_835.getResourceEntryName(var1);
    }

    public String getResourceName(int var1) {
        return this.field_835.getResourceName(var1);
    }

    public String getResourcePackageName(int var1) {
        return this.field_835.getResourcePackageName(var1);
    }

    public String getResourceTypeName(int var1) {
        return this.field_835.getResourceTypeName(var1);
    }

    public String getString(int var1) {
        return this.field_835.getString(var1);
    }

    public String getString(int var1, Object... var2) {
        return this.field_835.getString(var1, var2);
    }

    public String[] getStringArray(int var1) {
        return this.field_835.getStringArray(var1);
    }

    public CharSequence getText(int var1) {
        return this.field_835.getText(var1);
    }

    public CharSequence getText(int var1, CharSequence var2) {
        return this.field_835.getText(var1, var2);
    }

    public CharSequence[] getTextArray(int var1) {
        return this.field_835.getTextArray(var1);
    }

    public void getValue(int var1, TypedValue var2, boolean var3) {
        this.field_835.getValue(var1, var2, var3);
    }

    public void getValue(String var1, TypedValue var2, boolean var3) {
        this.field_835.getValue(var1, var2, var3);
    }

    public void getValueForDensity(int var1, int var2, TypedValue var3, boolean var4) {
        this.field_835.getValueForDensity(var1, var2, var3, var4);
    }

    public XmlResourceParser getXml(int var1) {
        return this.field_835.getXml(var1);
    }

    public TypedArray obtainAttributes(AttributeSet var1, int[] var2) {
        return this.field_835.obtainAttributes(var1, var2);
    }

    public TypedArray obtainTypedArray(int var1) {
        return this.field_835.obtainTypedArray(var1);
    }

    public InputStream openRawResource(int var1) {
        return this.field_835.openRawResource(var1);
    }

    public InputStream openRawResource(int var1, TypedValue var2) {
        return this.field_835.openRawResource(var1, var2);
    }

    public AssetFileDescriptor openRawResourceFd(int var1) {
        return this.field_835.openRawResourceFd(var1);
    }

    public void parseBundleExtra(String var1, AttributeSet var2, Bundle var3) {
        this.field_835.parseBundleExtra(var1, var2, var3);
    }

    public void parseBundleExtras(XmlResourceParser var1, Bundle var2) {
        this.field_835.parseBundleExtras(var1, var2);
    }

    public void updateConfiguration(Configuration var1, DisplayMetrics var2) {
        super.updateConfiguration(var1, var2);
        if (this.field_835 != null) {
            this.field_835.updateConfiguration(var1, var2);
        }

    }
}
