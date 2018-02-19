package android.support.b.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.support.v4.b.a.class_140;
import android.support.v4.c.b$b;
import android.support.v4.c.class_80;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

// $FF: renamed from: android.support.b.a.e
public class class_55 {
    // $FF: renamed from: a (android.content.res.Resources, android.content.res.Resources.Theme, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser) int
    private static int method_554(Resources var0, Theme var1, AttributeSet var2, XmlPullParser var3) {
        byte var6 = 0;
        TypedArray var7 = class_140.method_1184(var0, var1, var2, class_56.field_546);
        TypedValue var8 = class_140.method_1189(var7, var3, "value", 0);
        boolean var4;
        if (var8 != null) {
            var4 = true;
        } else {
            var4 = false;
        }

        byte var5 = var6;
        if (var4) {
            var5 = var6;
            if (method_571(var8.type)) {
                var5 = 3;
            }
        }

        var7.recycle();
        return var5;
    }

    // $FF: renamed from: a (android.content.res.TypedArray, int, int) int
    private static int method_555(TypedArray var0, int var1, int var2) {
        byte var5 = 0;
        TypedValue var6 = var0.peekValue(var1);
        boolean var8;
        if (var6 != null) {
            var8 = true;
        } else {
            var8 = false;
        }

        int var3;
        if (var8) {
            var3 = var6.type;
        } else {
            var3 = 0;
        }

        TypedValue var7 = var0.peekValue(var2);
        boolean var9;
        if (var7 != null) {
            var9 = true;
        } else {
            var9 = false;
        }

        int var4;
        if (var9) {
            var4 = var7.type;
        } else {
            var4 = 0;
        }

        byte var10;
        if (!var8 || !method_571(var3)) {
            var10 = var5;
            if (!var9) {
                return var10;
            }

            var10 = var5;
            if (!method_571(var4)) {
                return var10;
            }
        }

        var10 = 3;
        return var10;
    }

    // $FF: renamed from: a (android.content.Context, int) android.animation.Animator
    public static Animator method_556(Context var0, int var1) {
        Animator var2;
        if (VERSION.SDK_INT >= 24) {
            var2 = AnimatorInflater.loadAnimator(var0, var1);
        } else {
            var2 = method_557(var0, var0.getResources(), var0.getTheme(), var1);
        }

        return var2;
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.content.res.Resources.Theme, int) android.animation.Animator
    public static Animator method_557(Context var0, Resources var1, Theme var2, int var3) {
        return method_558(var0, var1, var2, var3, 1.0F);
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.content.res.Resources.Theme, int, float) android.animation.Animator
    public static Animator method_558(Context param0, Resources param1, Theme param2, int param3, float param4) {
        // $FF: Couldn't be decompiled
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.content.res.Resources.Theme, org.xmlpull.v1.XmlPullParser, float) android.animation.Animator
    private static Animator method_559(Context var0, Resources var1, Theme var2, XmlPullParser var3, float var4) {
        return method_560(var0, var1, var2, var3, Xml.asAttributeSet(var3), (AnimatorSet)null, 0, var4);
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.content.res.Resources.Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float) android.animation.Animator
    private static Animator method_560(Context var0, Resources var1, Theme var2, XmlPullParser var3, AttributeSet var4, AnimatorSet var5, int var6, float var7) {
        Object var12 = null;
        int var9 = var3.getDepth();
        ArrayList var11 = null;

        while(true) {
            int var8 = var3.next();
            if (var8 == 3 && var3.getDepth() <= var9 || var8 == 1) {
                if (var5 != null && var11 != null) {
                    Animator[] var13 = new Animator[var11.size()];
                    Iterator var14 = var11.iterator();

                    for(var8 = 0; var14.hasNext(); ++var8) {
                        var13[var8] = (Animator)var14.next();
                    }

                    if (var6 == 0) {
                        var5.playTogether(var13);
                    } else {
                        var5.playSequentially(var13);
                    }
                }

                return (Animator)var12;
            }

            if (var8 == 2) {
                String var10 = var3.getName();
                boolean var15;
                Object var16;
                if (var10.equals("objectAnimator")) {
                    var16 = method_563(var0, var1, var2, var4, var7, var3);
                    var15 = false;
                } else if (var10.equals("animator")) {
                    var16 = method_566(var0, var1, var2, var4, (ValueAnimator)null, var7, var3);
                    var15 = false;
                } else if (var10.equals("set")) {
                    var16 = new AnimatorSet();
                    TypedArray var18 = class_140.method_1184(var1, var2, var4, class_56.field_544);
                    var8 = class_140.method_1183(var18, var3, "ordering", 0, 0);
                    method_560(var0, var1, var2, var3, var4, (AnimatorSet)var16, var8, var7);
                    var18.recycle();
                    var15 = false;
                } else {
                    if (!var10.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + var3.getName());
                    }

                    PropertyValuesHolder[] var17 = method_572(var0, var1, var2, var3, Xml.asAttributeSet(var3));
                    if (var17 != null && var12 != null && var12 instanceof ValueAnimator) {
                        ((ValueAnimator)var12).setValues(var17);
                    }

                    var15 = true;
                    var16 = var12;
                }

                var12 = var16;
                if (var5 != null) {
                    var12 = var16;
                    if (!var15) {
                        if (var11 == null) {
                            var11 = new ArrayList();
                        }

                        var11.add(var16);
                        var12 = var16;
                    }
                }
            }
        }
    }

    // $FF: renamed from: a (android.animation.Keyframe, float) android.animation.Keyframe
    private static Keyframe method_561(Keyframe var0, float var1) {
        if (var0.getType() == Float.TYPE) {
            var0 = Keyframe.ofFloat(var1);
        } else if (var0.getType() == Integer.TYPE) {
            var0 = Keyframe.ofInt(var1);
        } else {
            var0 = Keyframe.ofObject(var1);
        }

        return var0;
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.content.res.Resources.Theme, android.util.AttributeSet, int, org.xmlpull.v1.XmlPullParser) android.animation.Keyframe
    private static Keyframe method_562(Context var0, Resources var1, Theme var2, AttributeSet var3, int var4, XmlPullParser var5) {
        TypedArray var11 = class_140.method_1184(var1, var2, var3, class_56.field_546);
        var2 = null;
        float var6 = class_140.method_1182(var11, var5, "fraction", 3, -1.0F);
        TypedValue var9 = class_140.method_1189(var11, var5, "value", 0);
        boolean var8;
        if (var9 != null) {
            var8 = true;
        } else {
            var8 = false;
        }

        int var7 = var4;
        if (var4 == 4) {
            if (var8 && method_571(var9.type)) {
                var7 = 3;
            } else {
                var7 = 0;
            }
        }

        Keyframe var10;
        if (var8) {
            var10 = var2;
            switch(var7) {
            case 0:
                var10 = Keyframe.ofFloat(var6, class_140.method_1182(var11, var5, "value", 0, 0.0F));
                break;
            case 1:
            case 3:
                var10 = Keyframe.ofInt(var6, class_140.method_1183(var11, var5, "value", 0, 0));
            case 2:
                break;
            default:
                var10 = var2;
            }
        } else if (var7 == 0) {
            var10 = Keyframe.ofFloat(var6);
        } else {
            var10 = Keyframe.ofInt(var6);
        }

        var4 = class_140.method_1190(var11, var5, "interpolator", 1, 0);
        if (var4 > 0) {
            var10.setInterpolator(class_53.method_551(var0, var4));
        }

        var11.recycle();
        return var10;
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.content.res.Resources.Theme, android.util.AttributeSet, float, org.xmlpull.v1.XmlPullParser) android.animation.ObjectAnimator
    private static ObjectAnimator method_563(Context var0, Resources var1, Theme var2, AttributeSet var3, float var4, XmlPullParser var5) {
        ObjectAnimator var6 = new ObjectAnimator();
        method_566(var0, var1, var2, var3, var6, var4, var5);
        return var6;
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.content.res.Resources.Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int) android.animation.PropertyValuesHolder
    private static PropertyValuesHolder method_564(Context var0, Resources var1, Theme var2, XmlPullParser var3, String var4, int var5) {
        ArrayList var12 = null;
        int var7 = var5;

        while(true) {
            var5 = var3.next();
            if (var5 == 3 || var5 == 1) {
                PropertyValuesHolder var14;
                if (var12 != null) {
                    var5 = var12.size();
                    if (var5 > 0) {
                        Keyframe var17 = (Keyframe)var12.get(0);
                        Keyframe var15 = (Keyframe)var12.get(var5 - 1);
                        float var6 = var15.getFraction();
                        if (var6 < 1.0F) {
                            if (var6 < 0.0F) {
                                var15.setFraction(1.0F);
                            } else {
                                var12.add(var12.size(), method_561(var15, 1.0F));
                                ++var5;
                            }
                        }

                        var6 = var17.getFraction();
                        int var9 = var5;
                        if (var6 != 0.0F) {
                            if (var6 < 0.0F) {
                                var17.setFraction(0.0F);
                                var9 = var5;
                            } else {
                                var12.add(0, method_561(var17, 0.0F));
                                var9 = var5 + 1;
                            }
                        }

                        Keyframe[] var16 = new Keyframe[var9];
                        var12.toArray(var16);

                        for(var5 = 0; var5 < var9; ++var5) {
                            var17 = var16[var5];
                            if (var17.getFraction() < 0.0F) {
                                if (var5 == 0) {
                                    var17.setFraction(0.0F);
                                } else if (var5 == var9 - 1) {
                                    var17.setFraction(1.0F);
                                } else {
                                    int var8 = var5 + 1;

                                    int var10;
                                    int var11;
                                    for(var10 = var5; var8 < var9 - 1 && var16[var8].getFraction() < 0.0F; var8 = var11) {
                                        var11 = var8 + 1;
                                        var10 = var8;
                                    }

                                    method_570(var16, var16[var10 + 1].getFraction() - var16[var5 - 1].getFraction(), var5, var10);
                                }
                            }
                        }

                        PropertyValuesHolder var18 = PropertyValuesHolder.ofKeyframe(var4, var16);
                        var14 = var18;
                        if (var7 == 3) {
                            var18.setEvaluator(class_54.method_553());
                            var14 = var18;
                        }

                        return var14;
                    }
                }

                var14 = null;
                return var14;
            }

            if (var3.getName().equals("keyframe")) {
                if (var7 == 4) {
                    var5 = method_554(var1, var2, Xml.asAttributeSet(var3), var3);
                } else {
                    var5 = var7;
                }

                Keyframe var13 = method_562(var0, var1, var2, Xml.asAttributeSet(var3), var5, var3);
                if (var13 != null) {
                    if (var12 == null) {
                        var12 = new ArrayList();
                    }

                    var12.add(var13);
                }

                var3.next();
                var7 = var5;
            }
        }
    }

    // $FF: renamed from: a (android.content.res.TypedArray, int, int, int, java.lang.String) android.animation.PropertyValuesHolder
    private static PropertyValuesHolder method_565(TypedArray var0, int var1, int var2, int var3, String var4) {
        TypedValue var12 = var0.peekValue(var2);
        boolean var9;
        if (var12 != null) {
            var9 = true;
        } else {
            var9 = false;
        }

        int var11;
        if (var9) {
            var11 = var12.type;
        } else {
            var11 = 0;
        }

        var12 = var0.peekValue(var3);
        boolean var8;
        if (var12 != null) {
            var8 = true;
        } else {
            var8 = false;
        }

        int var10;
        if (var8) {
            var10 = var12.type;
        } else {
            var10 = 0;
        }

        int var7 = var1;
        if (var1 == 4) {
            if (var9 && method_571(var11) || var8 && method_571(var10)) {
                var7 = 3;
            } else {
                var7 = 0;
            }
        }

        boolean var18;
        if (var7 == 0) {
            var18 = true;
        } else {
            var18 = false;
        }

        PropertyValuesHolder var19;
        if (var7 == 2) {
            String var20 = var0.getString(var2);
            String var15 = var0.getString(var3);
            b$b[] var14 = class_80.method_771(var20);
            b$b[] var13 = class_80.method_771(var15);
            if (var14 != null || var13 != null) {
                if (var14 != null) {
                    e$a var16 = new e$a();
                    if (var13 != null) {
                        if (!class_80.method_767(var14, var13)) {
                            throw new InflateException(" Can't morph from " + var20 + " to " + var15);
                        }

                        var19 = PropertyValuesHolder.ofObject(var4, var16, new Object[]{var14, var13});
                    } else {
                        var19 = PropertyValuesHolder.ofObject(var4, var16, new Object[]{var14});
                    }

                    return var19;
                }

                if (var13 != null) {
                    var19 = PropertyValuesHolder.ofObject(var4, new e$a(), new Object[]{var13});
                    return var19;
                }
            }

            var19 = null;
        } else {
            class_54 var21;
            if (var7 == 3) {
                var21 = class_54.method_553();
            } else {
                var21 = null;
            }

            PropertyValuesHolder var17;
            if (var18) {
                float var5;
                if (var9) {
                    if (var11 == 5) {
                        var5 = var0.getDimension(var2, 0.0F);
                    } else {
                        var5 = var0.getFloat(var2, 0.0F);
                    }

                    if (var8) {
                        float var6;
                        if (var10 == 5) {
                            var6 = var0.getDimension(var3, 0.0F);
                        } else {
                            var6 = var0.getFloat(var3, 0.0F);
                        }

                        var17 = PropertyValuesHolder.ofFloat(var4, new float[]{var5, var6});
                    } else {
                        var17 = PropertyValuesHolder.ofFloat(var4, new float[]{var5});
                    }
                } else {
                    if (var10 == 5) {
                        var5 = var0.getDimension(var3, 0.0F);
                    } else {
                        var5 = var0.getFloat(var3, 0.0F);
                    }

                    var17 = PropertyValuesHolder.ofFloat(var4, new float[]{var5});
                }
            } else if (var9) {
                if (var11 == 5) {
                    var1 = (int)var0.getDimension(var2, 0.0F);
                } else if (method_571(var11)) {
                    var1 = var0.getColor(var2, 0);
                } else {
                    var1 = var0.getInt(var2, 0);
                }

                if (var8) {
                    if (var10 == 5) {
                        var2 = (int)var0.getDimension(var3, 0.0F);
                    } else if (method_571(var10)) {
                        var2 = var0.getColor(var3, 0);
                    } else {
                        var2 = var0.getInt(var3, 0);
                    }

                    var17 = PropertyValuesHolder.ofInt(var4, new int[]{var1, var2});
                } else {
                    var17 = PropertyValuesHolder.ofInt(var4, new int[]{var1});
                }
            } else if (var8) {
                if (var10 == 5) {
                    var1 = (int)var0.getDimension(var3, 0.0F);
                } else if (method_571(var10)) {
                    var1 = var0.getColor(var3, 0);
                } else {
                    var1 = var0.getInt(var3, 0);
                }

                var17 = PropertyValuesHolder.ofInt(var4, new int[]{var1});
            } else {
                var17 = null;
            }

            var19 = var17;
            if (var17 != null) {
                var19 = var17;
                if (var21 != null) {
                    var17.setEvaluator(var21);
                    var19 = var17;
                }
            }
        }

        return var19;
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.content.res.Resources.Theme, android.util.AttributeSet, android.animation.ValueAnimator, float, org.xmlpull.v1.XmlPullParser) android.animation.ValueAnimator
    private static ValueAnimator method_566(Context var0, Resources var1, Theme var2, AttributeSet var3, ValueAnimator var4, float var5, XmlPullParser var6) {
        TypedArray var8 = class_140.method_1184(var1, var2, var3, class_56.field_543);
        TypedArray var10 = class_140.method_1184(var1, var2, var3, class_56.field_547);
        ValueAnimator var9 = var4;
        if (var4 == null) {
            var9 = new ValueAnimator();
        }

        method_568(var9, var8, var10, var5, var6);
        int var7 = class_140.method_1190(var8, var6, "interpolator", 0, 0);
        if (var7 > 0) {
            var9.setInterpolator(class_53.method_551(var0, var7));
        }

        var8.recycle();
        if (var10 != null) {
            var10.recycle();
        }

        return var9;
    }

    // $FF: renamed from: a (android.animation.ValueAnimator, android.content.res.TypedArray, int, float, org.xmlpull.v1.XmlPullParser) void
    private static void method_567(ValueAnimator var0, TypedArray var1, int var2, float var3, XmlPullParser var4) {
        ObjectAnimator var7 = (ObjectAnimator)var0;
        String var5 = class_140.method_1185(var1, var4, "pathData", 1);
        if (var5 != null) {
            String var6 = class_140.method_1185(var1, var4, "propertyXName", 2);
            String var8 = class_140.method_1185(var1, var4, "propertyYName", 3);
            if (var2 != 2 && var2 == 4) {
                ;
            }

            if (var6 == null && var8 == null) {
                throw new InflateException(var1.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }

            method_569(class_80.method_764(var5), var7, 0.5F * var3, var6, var8);
        } else {
            var7.setPropertyName(class_140.method_1185(var1, var4, "propertyName", 0));
        }

    }

    // $FF: renamed from: a (android.animation.ValueAnimator, android.content.res.TypedArray, android.content.res.TypedArray, float, org.xmlpull.v1.XmlPullParser) void
    private static void method_568(ValueAnimator var0, TypedArray var1, TypedArray var2, float var3, XmlPullParser var4) {
        long var8 = (long)class_140.method_1183(var1, var4, "duration", 1, 300);
        long var10 = (long)class_140.method_1183(var1, var4, "startOffset", 2, 0);
        int var6 = class_140.method_1183(var1, var4, "valueType", 7, 4);
        int var7 = var6;
        if (class_140.method_1187(var4, "valueFrom")) {
            var7 = var6;
            if (class_140.method_1187(var4, "valueTo")) {
                int var5 = var6;
                if (var6 == 4) {
                    var5 = method_555(var1, 5, 6);
                }

                PropertyValuesHolder var12 = method_565(var1, var5, 5, 6, "");
                var7 = var5;
                if (var12 != null) {
                    var0.setValues(new PropertyValuesHolder[]{var12});
                    var7 = var5;
                }
            }
        }

        var0.setDuration(var8);
        var0.setStartDelay(var10);
        var0.setRepeatCount(class_140.method_1183(var1, var4, "repeatCount", 3, 0));
        var0.setRepeatMode(class_140.method_1183(var1, var4, "repeatMode", 4, 1));
        if (var2 != null) {
            method_567(var0, var2, var7, var3, var4);
        }

    }

    // $FF: renamed from: a (android.graphics.Path, android.animation.ObjectAnimator, float, java.lang.String, java.lang.String) void
    private static void method_569(Path var0, ObjectAnimator var1, float var2, String var3, String var4) {
        PathMeasure var11 = new PathMeasure(var0, false);
        float var5 = 0.0F;
        ArrayList var10 = new ArrayList();
        var10.add(0.0F);

        float var6;
        do {
            var6 = var5 + var11.getLength();
            var10.add(var6);
            var5 = var6;
        } while(var11.nextContour());

        PathMeasure var13 = new PathMeasure(var0, false);
        int var9 = Math.min(100, (int)(var6 / var2) + 1);
        float[] var12 = new float[var9];
        float[] var17 = new float[var9];
        float[] var14 = new float[2];
        int var7 = 0;
        var5 = var6 / (float)(var9 - 1);
        int var8 = 0;

        for(var2 = 0.0F; var8 < var9; ++var8) {
            var13.getPosTan(var2, var14, (float[])null);
            var13.getPosTan(var2, var14, (float[])null);
            var12[var8] = var14[0];
            var17[var8] = var14[1];
            var2 += var5;
            if (var7 + 1 < var10.size() && var2 > (Float)var10.get(var7 + 1)) {
                var6 = (Float)var10.get(var7 + 1);
                ++var7;
                var13.nextContour();
                var2 -= var6;
            }
        }

        PropertyValuesHolder var15 = null;
        var10 = null;
        if (var3 != null) {
            var15 = PropertyValuesHolder.ofFloat(var3, var12);
        }

        PropertyValuesHolder var16 = var10;
        if (var4 != null) {
            var16 = PropertyValuesHolder.ofFloat(var4, var17);
        }

        if (var15 == null) {
            var1.setValues(new PropertyValuesHolder[]{var16});
        } else if (var16 == null) {
            var1.setValues(new PropertyValuesHolder[]{var15});
        } else {
            var1.setValues(new PropertyValuesHolder[]{var15, var16});
        }

    }

    // $FF: renamed from: a (android.animation.Keyframe[], float, int, int) void
    private static void method_570(Keyframe[] var0, float var1, int var2, int var3) {
        for(var1 /= (float)(var3 - var2 + 2); var2 <= var3; ++var2) {
            var0[var2].setFraction(var0[var2 - 1].getFraction() + var1);
        }

    }

    // $FF: renamed from: a (int) boolean
    private static boolean method_571(int var0) {
        boolean var1;
        if (var0 >= 28 && var0 <= 31) {
            var1 = true;
        } else {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: a (android.content.Context, android.content.res.Resources, android.content.res.Resources.Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet) android.animation.PropertyValuesHolder[]
    private static PropertyValuesHolder[] method_572(Context var0, Resources var1, Theme var2, XmlPullParser var3, AttributeSet var4) {
        ArrayList var7 = null;

        while(true) {
            int var5 = var3.getEventType();
            if (var5 == 3 || var5 == 1) {
                PropertyValuesHolder[] var11 = null;
                if (var7 != null) {
                    int var6 = var7.size();
                    var11 = new PropertyValuesHolder[var6];

                    for(var5 = 0; var5 < var6; ++var5) {
                        var11[var5] = (PropertyValuesHolder)var7.get(var5);
                    }
                }

                return var11;
            }

            if (var5 != 2) {
                var3.next();
            } else {
                ArrayList var8 = var7;
                if (var3.getName().equals("propertyValuesHolder")) {
                    TypedArray var9 = class_140.method_1184(var1, var2, var4, class_56.field_545);
                    String var10 = class_140.method_1185(var9, var3, "propertyName", 3);
                    var5 = class_140.method_1183(var9, var3, "valueType", 2, 4);
                    PropertyValuesHolder var12 = method_564(var0, var1, var2, var3, var10, var5);
                    if (var12 == null) {
                        var12 = method_565(var9, var5, 0, 1, var10);
                    }

                    if (var12 != null) {
                        if (var7 == null) {
                            var7 = new ArrayList();
                        }

                        var7.add(var12);
                    }

                    var9.recycle();
                    var8 = var7;
                }

                var3.next();
                var7 = var8;
            }
        }
    }
}
