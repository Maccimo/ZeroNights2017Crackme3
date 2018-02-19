.class final Landroid/support/v7/b/a/a;
.super Ljava/lang/Object;


# direct methods
.method private static a(IF)I
    .locals 1

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p0, v0}, Landroid/support/v4/c/a;->b(II)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 4

    const/4 v3, 0x2

    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    if-eq v1, v3, :cond_1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    :cond_1
    if-eq v1, v3, :cond_2

    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {p0, p1, v0, p2}, Landroid/support/v7/b/a/a;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 4

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "selector"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": invalid color state list tag "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    invoke-static {p0, p1, p2, p3}, Landroid/support/v7/b/a/a;->b(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0, p2, p3}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1, p2, p3, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    goto :goto_0
.end method

.method private static b(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 12

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    add-int/lit8 v7, v0, 0x1

    const/16 v0, 0x14

    new-array v1, v0, [[I

    array-length v0, v1

    new-array v0, v0, [I

    const/4 v2, 0x0

    move v3, v2

    move-object v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v4, 0x1

    if-eq v1, v4, :cond_7

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v4

    if-ge v4, v7, :cond_1

    const/4 v5, 0x3

    if-eq v1, v5, :cond_7

    :cond_1
    const/4 v5, 0x2

    if-ne v1, v5, :cond_0

    if-gt v4, v7, :cond_0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v4, "item"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroid/support/v7/a/a$j;->ColorStateListItem:[I

    invoke-static {p0, p3, p2, v1}, Landroid/support/v7/b/a/a;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    sget v1, Landroid/support/v7/a/a$j;->ColorStateListItem_android_color:I

    const v5, -0xff01

    invoke-virtual {v4, v1, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v8

    const/high16 v1, 0x3f800000    # 1.0f

    sget v5, Landroid/support/v7/a/a$j;->ColorStateListItem_android_alpha:I

    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_3

    sget v1, Landroid/support/v7/a/a$j;->ColorStateListItem_android_alpha:I

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v1, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    :cond_2
    :goto_1
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    const/4 v5, 0x0

    invoke-interface {p2}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result v9

    new-array v10, v9, [I

    const/4 v4, 0x0

    move v6, v4

    :goto_2
    if-ge v6, v9, :cond_5

    invoke-interface {p2, v6}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    move-result v4

    const v11, 0x10101a5

    if-eq v4, v11, :cond_8

    const v11, 0x101031f

    if-eq v4, v11, :cond_8

    sget v11, Landroid/support/v7/a/a$a;->alpha:I

    if-eq v4, v11, :cond_8

    const/4 v11, 0x0

    invoke-interface {p2, v6, v11}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    move-result v11

    if-eqz v11, :cond_4

    :goto_3
    aput v4, v10, v5

    add-int/lit8 v4, v5, 0x1

    :goto_4
    add-int/lit8 v5, v6, 0x1

    move v6, v5

    move v5, v4

    goto :goto_2

    :cond_3
    sget v5, Landroid/support/v7/a/a$j;->ColorStateListItem_alpha:I

    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_2

    sget v1, Landroid/support/v7/a/a$j;->ColorStateListItem_alpha:I

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v1, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    goto :goto_1

    :cond_4
    neg-int v4, v4

    goto :goto_3

    :cond_5
    invoke-static {v10, v5}, Landroid/util/StateSet;->trimStateSet([II)[I

    move-result-object v4

    invoke-static {v8, v1}, Landroid/support/v7/b/a/a;->a(IF)I

    move-result v1

    if-eqz v3, :cond_6

    array-length v5, v4

    if-nez v5, :cond_6

    :cond_6
    invoke-static {v0, v3, v1}, Landroid/support/v7/b/a/c;->a([III)[I

    move-result-object v1

    invoke-static {v2, v3, v4}, Landroid/support/v7/b/a/c;->a([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move-object v2, v0

    move-object v0, v1

    goto/16 :goto_0

    :cond_7
    new-array v1, v3, [I

    new-array v4, v3, [[I

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v0, v5, v1, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v0, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v0, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Landroid/content/res/ColorStateList;

    invoke-direct {v0, v4, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v0

    :cond_8
    move v4, v5

    goto :goto_4
.end method
