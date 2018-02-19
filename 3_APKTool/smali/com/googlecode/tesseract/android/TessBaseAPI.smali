.class public Lcom/googlecode/tesseract/android/TessBaseAPI;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/tesseract/android/TessBaseAPI$a;,
        Lcom/googlecode/tesseract/android/TessBaseAPI$b;
    }
.end annotation


# instance fields
.field private a:J

.field private b:Lcom/googlecode/tesseract/android/TessBaseAPI$a;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "jpgt"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-string v0, "pngt"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-string v0, "lept"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-string v0, "tess"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-static {}, Lcom/googlecode/tesseract/android/TessBaseAPI;->nativeClassInit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Lcom/googlecode/tesseract/android/TessBaseAPI;->nativeConstruct()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->a:J

    iget-wide v0, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Can\'t create TessBaseApi object"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->c:Z

    return-void
.end method

.method private static native nativeClassInit()V
.end method

.method private native nativeConstruct()J
.end method

.method private native nativeGetUTF8Text(J)Ljava/lang/String;
.end method

.method private native nativeInitOem(JLjava/lang/String;Ljava/lang/String;I)Z
.end method

.method private native nativeSetImagePix(JJ)V
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-boolean v0, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    iget-wide v0, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->a:J

    invoke-direct {p0, v0, v1}, Lcom/googlecode/tesseract/android/TessBaseAPI;->nativeGetUTF8Text(J)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 5

    iget-boolean v0, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    invoke-static {p1}, Lcom/googlecode/leptonica/android/ReadFile;->a(Landroid/graphics/Bitmap;)Lcom/googlecode/leptonica/android/Pix;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to read bitmap"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v1, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->a:J

    invoke-virtual {v0}, Lcom/googlecode/leptonica/android/Pix;->a()J

    move-result-wide v3

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/googlecode/tesseract/android/TessBaseAPI;->nativeSetImagePix(JJ)V

    invoke-virtual {v0}, Lcom/googlecode/leptonica/android/Pix;->c()V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, p1, p2, v0}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 10

    const/4 v6, 0x0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Data path must not be null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Data path does not exist!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "tessdata"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Data path must contain subfolder tessdata!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const/4 v0, 0x1

    if-eq p3, v0, :cond_5

    const-string v0, "\\+"

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v4, v2

    move v0, v6

    :goto_1
    if-ge v0, v4, :cond_5

    aget-object v5, v2, v0

    const-string v7, "~"

    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_4

    new-instance v7, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v8, ".traineddata"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_4

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Data file not found at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    iget-wide v1, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->a:J

    move-object v0, p0

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/googlecode/tesseract/android/TessBaseAPI;->nativeInitOem(JLjava/lang/String;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_6

    iput-boolean v6, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->c:Z

    :cond_6
    return v0

    :cond_7
    move-object v3, p1

    goto/16 :goto_0
.end method

.method protected onProgressValues(IIIIIIIII)V
    .locals 4

    iget-object v0, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->b:Lcom/googlecode/tesseract/android/TessBaseAPI$a;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/googlecode/tesseract/android/TessBaseAPI$b;

    new-instance v1, Landroid/graphics/Rect;

    sub-int v2, p8, p4

    sub-int v3, p8, p5

    invoke-direct {v1, p2, v2, p3, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, p6, p9, p7, p8}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/googlecode/tesseract/android/TessBaseAPI$b;-><init>(Lcom/googlecode/tesseract/android/TessBaseAPI;ILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget-object v1, p0, Lcom/googlecode/tesseract/android/TessBaseAPI;->b:Lcom/googlecode/tesseract/android/TessBaseAPI$a;

    invoke-interface {v1, v0}, Lcom/googlecode/tesseract/android/TessBaseAPI$a;->a(Lcom/googlecode/tesseract/android/TessBaseAPI$b;)V

    :cond_0
    return-void
.end method
