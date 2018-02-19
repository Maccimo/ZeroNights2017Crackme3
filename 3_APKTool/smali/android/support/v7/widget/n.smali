.class Landroid/support/v7/widget/n;
.super Ljava/lang/Object;


# instance fields
.field final a:Landroid/widget/TextView;

.field private b:Landroid/support/v7/widget/ai;

.field private c:Landroid/support/v7/widget/ai;

.field private d:Landroid/support/v7/widget/ai;

.field private e:Landroid/support/v7/widget/ai;

.field private final f:Landroid/support/v7/widget/q;

.field private g:I

.field private h:Landroid/graphics/Typeface;


# direct methods
.method constructor <init>(Landroid/widget/TextView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/n;->g:I

    iput-object p1, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    new-instance v0, Landroid/support/v7/widget/q;

    iget-object v1, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-direct {v0, v1}, Landroid/support/v7/widget/q;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    return-void
.end method

.method protected static a(Landroid/content/Context;Landroid/support/v7/widget/h;I)Landroid/support/v7/widget/ai;
    .locals 3

    invoke-virtual {p1, p0, p2}, Landroid/support/v7/widget/h;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Landroid/support/v7/widget/ai;

    invoke-direct {v0}, Landroid/support/v7/widget/ai;-><init>()V

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroid/support/v7/widget/ai;->d:Z

    iput-object v1, v0, Landroid/support/v7/widget/ai;->a:Landroid/content/res/ColorStateList;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static a(Landroid/widget/TextView;)Landroid/support/v7/widget/n;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v7/widget/o;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/o;-><init>(Landroid/widget/TextView;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Landroid/support/v7/widget/n;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/n;-><init>(Landroid/widget/TextView;)V

    goto :goto_0
.end method

.method private a(Landroid/content/Context;Landroid/support/v7/widget/ak;)V
    .locals 3

    sget v0, Landroid/support/v7/a/a$j;->TextAppearance_android_textStyle:I

    iget v1, p0, Landroid/support/v7/widget/n;->g:I

    invoke-virtual {p2, v0, v1}, Landroid/support/v7/widget/ak;->a(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/n;->g:I

    sget v0, Landroid/support/v7/a/a$j;->TextAppearance_android_fontFamily:I

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Landroid/support/v7/a/a$j;->TextAppearance_fontFamily:I

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/n;->h:Landroid/graphics/Typeface;

    sget v0, Landroid/support/v7/a/a$j;->TextAppearance_android_fontFamily:I

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v0

    if-eqz v0, :cond_3

    sget v0, Landroid/support/v7/a/a$j;->TextAppearance_android_fontFamily:I

    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result v1

    if-nez v1, :cond_1

    :try_start_0
    iget v1, p0, Landroid/support/v7/widget/n;->g:I

    iget-object v2, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {p2, v0, v1, v2}, Landroid/support/v7/widget/ak;->a(IILandroid/widget/TextView;)Landroid/graphics/Typeface;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v7/widget/n;->h:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    iget-object v1, p0, Landroid/support/v7/widget/n;->h:Landroid/graphics/Typeface;

    if-nez v1, :cond_2

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/ak;->c(I)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Landroid/support/v7/widget/n;->g:I

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/n;->h:Landroid/graphics/Typeface;

    :cond_2
    return-void

    :cond_3
    sget v0, Landroid/support/v7/a/a$j;->TextAppearance_fontFamily:I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method private b(IF)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/q;->a(IF)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    iget-object v0, p0, Landroid/support/v7/widget/n;->b:Landroid/support/v7/widget/ai;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/n;->c:Landroid/support/v7/widget/ai;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/n;->d:Landroid/support/v7/widget/ai;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/n;->e:Landroid/support/v7/widget/ai;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    iget-object v2, p0, Landroid/support/v7/widget/n;->b:Landroid/support/v7/widget/ai;

    invoke-virtual {p0, v1, v2}, Landroid/support/v7/widget/n;->a(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/ai;)V

    const/4 v1, 0x1

    aget-object v1, v0, v1

    iget-object v2, p0, Landroid/support/v7/widget/n;->c:Landroid/support/v7/widget/ai;

    invoke-virtual {p0, v1, v2}, Landroid/support/v7/widget/n;->a(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/ai;)V

    const/4 v1, 0x2

    aget-object v1, v0, v1

    iget-object v2, p0, Landroid/support/v7/widget/n;->d:Landroid/support/v7/widget/ai;

    invoke-virtual {p0, v1, v2}, Landroid/support/v7/widget/n;->a(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/ai;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Landroid/support/v7/widget/n;->e:Landroid/support/v7/widget/ai;

    invoke-virtual {p0, v0, v1}, Landroid/support/v7/widget/n;->a(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/ai;)V

    :cond_1
    return-void
.end method

.method a(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/q;->a(I)V

    return-void
.end method

.method a(IF)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/n;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/n;->b(IF)V

    :cond_0
    return-void
.end method

.method a(IIII)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v7/widget/q;->a(IIII)V

    return-void
.end method

.method a(Landroid/content/Context;I)V
    .locals 3

    sget-object v0, Landroid/support/v7/a/a$j;->TextAppearance:[I

    invoke-static {p1, p2, v0}, Landroid/support/v7/widget/ak;->a(Landroid/content/Context;I[I)Landroid/support/v7/widget/ak;

    move-result-object v0

    sget v1, Landroid/support/v7/a/a$j;->TextAppearance_textAllCaps:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Landroid/support/v7/a/a$j;->TextAppearance_textAllCaps:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/ak;->a(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/n;->a(Z)V

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-ge v1, v2, :cond_1

    sget v1, Landroid/support/v7/a/a$j;->TextAppearance_android_textColor:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v1

    if-eqz v1, :cond_1

    sget v1, Landroid/support/v7/a/a$j;->TextAppearance_android_textColor:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ak;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1
    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/n;->a(Landroid/content/Context;Landroid/support/v7/widget/ak;)V

    invoke-virtual {v0}, Landroid/support/v7/widget/ak;->a()V

    iget-object v0, p0, Landroid/support/v7/widget/n;->h:Landroid/graphics/Typeface;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    iget-object v1, p0, Landroid/support/v7/widget/n;->h:Landroid/graphics/Typeface;

    iget v2, p0, Landroid/support/v7/widget/n;->g:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_2
    return-void
.end method

.method final a(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/ai;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Landroid/support/v7/widget/h;->a(Landroid/graphics/drawable/Drawable;Landroid/support/v7/widget/ai;[I)V

    :cond_0
    return-void
.end method

.method a(Landroid/util/AttributeSet;I)V
    .locals 11

    const/4 v2, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {}, Landroid/support/v7/widget/h;->a()Landroid/support/v7/widget/h;

    move-result-object v0

    sget-object v1, Landroid/support/v7/a/a$j;->AppCompatTextHelper:[I

    const/4 v3, 0x0

    invoke-static {v5, p1, v1, p2, v3}, Landroid/support/v7/widget/ak;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/ak;

    move-result-object v1

    sget v3, Landroid/support/v7/a/a$j;->AppCompatTextHelper_android_textAppearance:I

    const/4 v6, -0x1

    invoke-virtual {v1, v3, v6}, Landroid/support/v7/widget/ak;->g(II)I

    move-result v3

    sget v6, Landroid/support/v7/a/a$j;->AppCompatTextHelper_android_drawableLeft:I

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v6

    if-eqz v6, :cond_0

    sget v6, Landroid/support/v7/a/a$j;->AppCompatTextHelper_android_drawableLeft:I

    const/4 v7, 0x0

    invoke-virtual {v1, v6, v7}, Landroid/support/v7/widget/ak;->g(II)I

    move-result v6

    invoke-static {v5, v0, v6}, Landroid/support/v7/widget/n;->a(Landroid/content/Context;Landroid/support/v7/widget/h;I)Landroid/support/v7/widget/ai;

    move-result-object v6

    iput-object v6, p0, Landroid/support/v7/widget/n;->b:Landroid/support/v7/widget/ai;

    :cond_0
    sget v6, Landroid/support/v7/a/a$j;->AppCompatTextHelper_android_drawableTop:I

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v6

    if-eqz v6, :cond_1

    sget v6, Landroid/support/v7/a/a$j;->AppCompatTextHelper_android_drawableTop:I

    const/4 v7, 0x0

    invoke-virtual {v1, v6, v7}, Landroid/support/v7/widget/ak;->g(II)I

    move-result v6

    invoke-static {v5, v0, v6}, Landroid/support/v7/widget/n;->a(Landroid/content/Context;Landroid/support/v7/widget/h;I)Landroid/support/v7/widget/ai;

    move-result-object v6

    iput-object v6, p0, Landroid/support/v7/widget/n;->c:Landroid/support/v7/widget/ai;

    :cond_1
    sget v6, Landroid/support/v7/a/a$j;->AppCompatTextHelper_android_drawableRight:I

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v6

    if-eqz v6, :cond_2

    sget v6, Landroid/support/v7/a/a$j;->AppCompatTextHelper_android_drawableRight:I

    const/4 v7, 0x0

    invoke-virtual {v1, v6, v7}, Landroid/support/v7/widget/ak;->g(II)I

    move-result v6

    invoke-static {v5, v0, v6}, Landroid/support/v7/widget/n;->a(Landroid/content/Context;Landroid/support/v7/widget/h;I)Landroid/support/v7/widget/ai;

    move-result-object v6

    iput-object v6, p0, Landroid/support/v7/widget/n;->d:Landroid/support/v7/widget/ai;

    :cond_2
    sget v6, Landroid/support/v7/a/a$j;->AppCompatTextHelper_android_drawableBottom:I

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v6

    if-eqz v6, :cond_3

    sget v6, Landroid/support/v7/a/a$j;->AppCompatTextHelper_android_drawableBottom:I

    const/4 v7, 0x0

    invoke-virtual {v1, v6, v7}, Landroid/support/v7/widget/ak;->g(II)I

    move-result v6

    invoke-static {v5, v0, v6}, Landroid/support/v7/widget/n;->a(Landroid/content/Context;Landroid/support/v7/widget/h;I)Landroid/support/v7/widget/ai;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/n;->e:Landroid/support/v7/widget/ai;

    :cond_3
    invoke-virtual {v1}, Landroid/support/v7/widget/ak;->a()V

    iget-object v0, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v0

    instance-of v6, v0, Landroid/text/method/PasswordTransformationMethod;

    const/4 v0, -0x1

    if-eq v3, v0, :cond_12

    sget-object v0, Landroid/support/v7/a/a$j;->TextAppearance:[I

    invoke-static {v5, v3, v0}, Landroid/support/v7/widget/ak;->a(Landroid/content/Context;I[I)Landroid/support/v7/widget/ak;

    move-result-object v7

    if-nez v6, :cond_11

    sget v0, Landroid/support/v7/a/a$j;->TextAppearance_textAllCaps:I

    invoke-virtual {v7, v0}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v0

    if-eqz v0, :cond_11

    sget v0, Landroid/support/v7/a/a$j;->TextAppearance_textAllCaps:I

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Landroid/support/v7/widget/ak;->a(IZ)Z

    move-result v0

    const/4 v1, 0x1

    :goto_0
    invoke-direct {p0, v5, v7}, Landroid/support/v7/widget/n;->a(Landroid/content/Context;Landroid/support/v7/widget/ak;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-ge v2, v3, :cond_10

    sget v2, Landroid/support/v7/a/a$j;->TextAppearance_android_textColor:I

    invoke-virtual {v7, v2}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v2

    if-eqz v2, :cond_f

    sget v2, Landroid/support/v7/a/a$j;->TextAppearance_android_textColor:I

    invoke-virtual {v7, v2}, Landroid/support/v7/widget/ak;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    :goto_1
    sget v3, Landroid/support/v7/a/a$j;->TextAppearance_android_textColorHint:I

    invoke-virtual {v7, v3}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v3

    if-eqz v3, :cond_e

    sget v3, Landroid/support/v7/a/a$j;->TextAppearance_android_textColorHint:I

    invoke-virtual {v7, v3}, Landroid/support/v7/widget/ak;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :goto_2
    sget v8, Landroid/support/v7/a/a$j;->TextAppearance_android_textColorLink:I

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v8

    if-eqz v8, :cond_14

    sget v4, Landroid/support/v7/a/a$j;->TextAppearance_android_textColorLink:I

    invoke-virtual {v7, v4}, Landroid/support/v7/widget/ak;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    move-object v10, v4

    move-object v4, v2

    move-object v2, v10

    :goto_3
    invoke-virtual {v7}, Landroid/support/v7/widget/ak;->a()V

    move-object v10, v4

    move v4, v1

    move-object v1, v3

    move v3, v0

    move-object v0, v10

    :goto_4
    sget-object v7, Landroid/support/v7/a/a$j;->TextAppearance:[I

    const/4 v8, 0x0

    invoke-static {v5, p1, v7, p2, v8}, Landroid/support/v7/widget/ak;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/ak;

    move-result-object v7

    if-nez v6, :cond_4

    sget v8, Landroid/support/v7/a/a$j;->TextAppearance_textAllCaps:I

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v8

    if-eqz v8, :cond_4

    sget v3, Landroid/support/v7/a/a$j;->TextAppearance_textAllCaps:I

    const/4 v4, 0x0

    invoke-virtual {v7, v3, v4}, Landroid/support/v7/widget/ak;->a(IZ)Z

    move-result v3

    const/4 v4, 0x1

    :cond_4
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x17

    if-ge v8, v9, :cond_13

    sget v8, Landroid/support/v7/a/a$j;->TextAppearance_android_textColor:I

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v8

    if-eqz v8, :cond_5

    sget v0, Landroid/support/v7/a/a$j;->TextAppearance_android_textColor:I

    invoke-virtual {v7, v0}, Landroid/support/v7/widget/ak;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    :cond_5
    sget v8, Landroid/support/v7/a/a$j;->TextAppearance_android_textColorHint:I

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v8

    if-eqz v8, :cond_6

    sget v1, Landroid/support/v7/a/a$j;->TextAppearance_android_textColorHint:I

    invoke-virtual {v7, v1}, Landroid/support/v7/widget/ak;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    :cond_6
    sget v8, Landroid/support/v7/a/a$j;->TextAppearance_android_textColorLink:I

    invoke-virtual {v7, v8}, Landroid/support/v7/widget/ak;->f(I)Z

    move-result v8

    if-eqz v8, :cond_13

    sget v2, Landroid/support/v7/a/a$j;->TextAppearance_android_textColorLink:I

    invoke-virtual {v7, v2}, Landroid/support/v7/widget/ak;->d(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    move-object v10, v2

    move-object v2, v1

    move-object v1, v10

    :goto_5
    invoke-direct {p0, v5, v7}, Landroid/support/v7/widget/n;->a(Landroid/content/Context;Landroid/support/v7/widget/ak;)V

    invoke-virtual {v7}, Landroid/support/v7/widget/ak;->a()V

    if-eqz v0, :cond_7

    iget-object v5, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_7
    if-eqz v2, :cond_8

    iget-object v0, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    :cond_8
    if-eqz v1, :cond_9

    iget-object v0, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    :cond_9
    if-nez v6, :cond_a

    if-eqz v4, :cond_a

    invoke-virtual {p0, v3}, Landroid/support/v7/widget/n;->a(Z)V

    :cond_a
    iget-object v0, p0, Landroid/support/v7/widget/n;->h:Landroid/graphics/Typeface;

    if-eqz v0, :cond_b

    iget-object v0, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    iget-object v1, p0, Landroid/support/v7/widget/n;->h:Landroid/graphics/Typeface;

    iget v2, p0, Landroid/support/v7/widget/n;->g:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_b
    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/q;->a(Landroid/util/AttributeSet;I)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_c

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->a()I

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->e()[I

    move-result-object v0

    array-length v1, v0

    if-lez v1, :cond_c

    iget-object v1, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_d

    iget-object v0, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    iget-object v1, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v1}, Landroid/support/v7/widget/q;->c()I

    move-result v1

    iget-object v2, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v2}, Landroid/support/v7/widget/q;->d()I

    move-result v2

    iget-object v3, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v3}, Landroid/support/v7/widget/q;->b()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    :cond_c
    :goto_6
    return-void

    :cond_d
    iget-object v1, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    goto :goto_6

    :cond_e
    const/4 v3, 0x0

    goto/16 :goto_2

    :cond_f
    const/4 v2, 0x0

    goto/16 :goto_1

    :cond_10
    const/4 v3, 0x0

    const/4 v2, 0x0

    move-object v10, v4

    move-object v4, v2

    move-object v2, v10

    goto/16 :goto_3

    :cond_11
    const/4 v1, 0x0

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_12
    const/4 v1, 0x0

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    goto/16 :goto_4

    :cond_13
    move-object v10, v2

    move-object v2, v1

    move-object v1, v10

    goto/16 :goto_5

    :cond_14
    move-object v10, v4

    move-object v4, v2

    move-object v2, v10

    goto/16 :goto_3
.end method

.method a(Z)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    return-void
.end method

.method a(ZIIII)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/n;->b()V

    :cond_0
    return-void
.end method

.method a([II)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/q;->a([II)V

    return-void
.end method

.method b()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->f()V

    return-void
.end method

.method c()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->g()Z

    move-result v0

    return v0
.end method

.method d()I
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->a()I

    move-result v0

    return v0
.end method

.method e()I
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->b()I

    move-result v0

    return v0
.end method

.method f()I
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->c()I

    move-result v0

    return v0
.end method

.method g()I
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->d()I

    move-result v0

    return v0
.end method

.method h()[I
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/n;->f:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->e()[I

    move-result-object v0

    return-object v0
.end method
