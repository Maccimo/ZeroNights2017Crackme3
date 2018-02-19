.class public Landroid/support/v4/h/n;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/h/n$a;,
        Landroid/support/v4/h/n$b;,
        Landroid/support/v4/h/n$c;,
        Landroid/support/v4/h/n$d;,
        Landroid/support/v4/h/n$e;,
        Landroid/support/v4/h/n$f;,
        Landroid/support/v4/h/n$g;,
        Landroid/support/v4/h/n$h;,
        Landroid/support/v4/h/n$i;,
        Landroid/support/v4/h/n$j;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/h/n$j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/h/n$i;

    invoke-direct {v0}, Landroid/support/v4/h/n$i;-><init>()V

    sput-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    :goto_0
    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/h/n$h;

    invoke-direct {v0}, Landroid/support/v4/h/n$h;-><init>()V

    sput-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    goto :goto_0

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/h/n$g;

    invoke-direct {v0}, Landroid/support/v4/h/n$g;-><init>()V

    sput-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    goto :goto_0

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    new-instance v0, Landroid/support/v4/h/n$f;

    invoke-direct {v0}, Landroid/support/v4/h/n$f;-><init>()V

    sput-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    goto :goto_0

    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_4

    new-instance v0, Landroid/support/v4/h/n$e;

    invoke-direct {v0}, Landroid/support/v4/h/n$e;-><init>()V

    sput-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    goto :goto_0

    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_5

    new-instance v0, Landroid/support/v4/h/n$d;

    invoke-direct {v0}, Landroid/support/v4/h/n$d;-><init>()V

    sput-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    goto :goto_0

    :cond_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_6

    new-instance v0, Landroid/support/v4/h/n$c;

    invoke-direct {v0}, Landroid/support/v4/h/n$c;-><init>()V

    sput-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    goto :goto_0

    :cond_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_7

    new-instance v0, Landroid/support/v4/h/n$b;

    invoke-direct {v0}, Landroid/support/v4/h/n$b;-><init>()V

    sput-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    goto :goto_0

    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xf

    if-lt v0, v1, :cond_8

    new-instance v0, Landroid/support/v4/h/n$a;

    invoke-direct {v0}, Landroid/support/v4/h/n$a;-><init>()V

    sput-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    goto :goto_0

    :cond_8
    new-instance v0, Landroid/support/v4/h/n$j;

    invoke-direct {v0}, Landroid/support/v4/h/n$j;-><init>()V

    sput-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    goto :goto_0
.end method

.method public static a(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0}, Landroid/support/v4/h/n$j;->a(Landroid/view/View;)V

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/content/res/ColorStateList;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/h/n$j;->a(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/h/n$j;->a(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/h/n$j;->a(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/support/v4/h/b;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/h/n$j;->a(Landroid/view/View;Landroid/support/v4/h/b;)V

    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/h/n$j;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0, p1, p2, p3}, Landroid/support/v4/h/n$j;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static b(Landroid/view/View;)I
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0}, Landroid/support/v4/h/n$j;->d(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static c(Landroid/view/View;)I
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0}, Landroid/support/v4/h/n$j;->b(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static d(Landroid/view/View;)I
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0}, Landroid/support/v4/h/n$j;->e(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static e(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0}, Landroid/support/v4/h/n$j;->c(Landroid/view/View;)V

    return-void
.end method

.method public static f(Landroid/view/View;)Landroid/content/res/ColorStateList;
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0}, Landroid/support/v4/h/n$j;->h(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0}, Landroid/support/v4/h/n$j;->i(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public static h(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0}, Landroid/support/v4/h/n$j;->g(Landroid/view/View;)V

    return-void
.end method

.method public static i(Landroid/view/View;)Z
    .locals 1

    sget-object v0, Landroid/support/v4/h/n;->a:Landroid/support/v4/h/n$j;

    invoke-virtual {v0, p0}, Landroid/support/v4/h/n$j;->f(Landroid/view/View;)Z

    move-result v0

    return v0
.end method
