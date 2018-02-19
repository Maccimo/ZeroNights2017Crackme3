.class public Lcom/googlecode/leptonica/android/Pix;
.super Ljava/lang/Object;


# instance fields
.field private final a:J

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "jpgt"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-string v0, "pngt"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-string v0, "lept"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/googlecode/leptonica/android/Pix;->a:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/googlecode/leptonica/android/Pix;->b:Z

    return-void
.end method

.method private static native nativeClone(J)J
.end method

.method private static native nativeDestroy(J)V
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-boolean v0, p0, Lcom/googlecode/leptonica/android/Pix;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    iget-wide v0, p0, Lcom/googlecode/leptonica/android/Pix;->a:J

    return-wide v0
.end method

.method public b()Lcom/googlecode/leptonica/android/Pix;
    .locals 4

    iget-boolean v0, p0, Lcom/googlecode/leptonica/android/Pix;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    iget-wide v0, p0, Lcom/googlecode/leptonica/android/Pix;->a:J

    invoke-static {v0, v1}, Lcom/googlecode/leptonica/android/Pix;->nativeClone(J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    new-instance v0, Ljava/lang/OutOfMemoryError;

    invoke-direct {v0}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw v0

    :cond_1
    new-instance v2, Lcom/googlecode/leptonica/android/Pix;

    invoke-direct {v2, v0, v1}, Lcom/googlecode/leptonica/android/Pix;-><init>(J)V

    return-object v2
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, Lcom/googlecode/leptonica/android/Pix;->b:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/googlecode/leptonica/android/Pix;->a:J

    invoke-static {v0, v1}, Lcom/googlecode/leptonica/android/Pix;->nativeDestroy(J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/googlecode/leptonica/android/Pix;->b:Z

    :cond_0
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/googlecode/leptonica/android/Pix;->b()Lcom/googlecode/leptonica/android/Pix;

    move-result-object v0

    return-object v0
.end method
