.class Landroid/support/v4/c/a/a$a;
.super Landroid/support/v4/c/a/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static a:Ljava/lang/reflect/Method;

.field private static b:Z


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/c/a/a$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;)I
    .locals 5

    const/4 v4, 0x1

    const/4 v1, 0x0

    sget-boolean v0, Landroid/support/v4/c/a/a$a;->b:Z

    if-nez v0, :cond_0

    :try_start_0
    const-class v0, Landroid/graphics/drawable/Drawable;

    const-string v2, "getLayoutDirection"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Landroid/support/v4/c/a/a$a;->a:Ljava/lang/reflect/Method;

    sget-object v0, Landroid/support/v4/c/a/a$a;->a:Ljava/lang/reflect/Method;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sput-boolean v4, Landroid/support/v4/c/a/a$a;->b:Z

    :cond_0
    sget-object v0, Landroid/support/v4/c/a/a$a;->a:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    :try_start_1
    sget-object v0, Landroid/support/v4/c/a/a$a;->a:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    :goto_1
    return v0

    :catch_0
    move-exception v0

    const-string v2, "DrawableCompatApi17"

    const-string v3, "Failed to retrieve getLayoutDirection() method"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v2, "DrawableCompatApi17"

    const-string v3, "Failed to invoke getLayoutDirection() via reflection"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    sput-object v0, Landroid/support/v4/c/a/a$a;->a:Ljava/lang/reflect/Method;

    :cond_1
    move v0, v1

    goto :goto_1
.end method
