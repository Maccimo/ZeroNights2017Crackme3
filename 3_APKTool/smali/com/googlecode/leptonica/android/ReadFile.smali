.class public Lcom/googlecode/leptonica/android/ReadFile;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "jpgt"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-string v0, "pngt"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-string v0, "lept"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-class v0, Lcom/googlecode/leptonica/android/ReadFile;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/googlecode/leptonica/android/ReadFile;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/graphics/Bitmap;)Lcom/googlecode/leptonica/android/Pix;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    sget-object v1, Lcom/googlecode/leptonica/android/ReadFile;->a:Ljava/lang/String;

    const-string v2, "Bitmap must be non-null"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-eq v1, v2, :cond_1

    sget-object v1, Lcom/googlecode/leptonica/android/ReadFile;->a:Ljava/lang/String;

    const-string v2, "Bitmap config must be ARGB_8888"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lcom/googlecode/leptonica/android/ReadFile;->nativeReadBitmap(Landroid/graphics/Bitmap;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_2

    sget-object v1, Lcom/googlecode/leptonica/android/ReadFile;->a:Ljava/lang/String;

    const-string v2, "Failed to read pix from bitmap"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/googlecode/leptonica/android/Pix;

    invoke-direct {v0, v1, v2}, Lcom/googlecode/leptonica/android/Pix;-><init>(J)V

    goto :goto_0
.end method

.method private static native nativeReadBitmap(Landroid/graphics/Bitmap;)J
.end method
