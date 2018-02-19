.class public Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;
.super Landroid/app/Activity;


# static fields
.field public static a:Landroid/widget/EditText;

.field public static b:Landroid/widget/EditText;

.field public static c:Ljava/lang/String;


# instance fields
.field private d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    sget-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:Ljava/lang/String;

    iput-object v0, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    sget-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->e:Ljava/lang/String;

    return-void
.end method

.method private a()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    invoke-virtual {p0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060062

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-le v1, v2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    new-instance v1, Lcom/googlecode/tesseract/android/TessBaseAPI;

    invoke-direct {v1}, Lcom/googlecode/tesseract/android/TessBaseAPI;-><init>()V

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->i:Ljava/lang/String;

    invoke-direct {p0, v2, v3}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a(Ljava/io/File;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Ljava/lang/String;Ljava/lang/String;)Z

    invoke-virtual {v1, v0}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Landroid/graphics/Bitmap;)V

    invoke-virtual {v1}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->c:Ljava/lang/String;

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->j:Ljava/lang/String;

    invoke-direct {p0, v2, v3}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a(Ljava/io/File;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Ljava/lang/String;Ljava/lang/String;)Z

    invoke-virtual {v1, v0}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Landroid/graphics/Bitmap;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->c:Ljava/lang/String;

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->k:Ljava/lang/String;

    invoke-direct {p0, v2, v3}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a(Ljava/io/File;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->h:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Ljava/lang/String;Ljava/lang/String;)Z

    invoke-virtual {v1, v0}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Landroid/graphics/Bitmap;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->c:Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    new-instance v1, Lcom/googlecode/tesseract/android/TessBaseAPI;

    invoke-direct {v1}, Lcom/googlecode/tesseract/android/TessBaseAPI;-><init>()V

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->i:Ljava/lang/String;

    invoke-direct {p0, v2, v3}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a(Ljava/io/File;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Ljava/lang/String;Ljava/lang/String;)Z

    invoke-virtual {v1, v0}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Landroid/graphics/Bitmap;)V

    invoke-virtual {v1}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, v5

    sput-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->c:Ljava/lang/String;

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->j:Ljava/lang/String;

    invoke-direct {p0, v2, v3}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a(Ljava/io/File;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->g:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Ljava/lang/String;Ljava/lang/String;)Z

    invoke-virtual {v1, v0}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Landroid/graphics/Bitmap;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a()Ljava/lang/String;

    move-result-object v3

    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->c:Ljava/lang/String;

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->k:Ljava/lang/String;

    invoke-direct {p0, v2, v3}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a(Ljava/io/File;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->h:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Ljava/lang/String;Ljava/lang/String;)Z

    invoke-virtual {v1, v0}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a(Landroid/graphics/Bitmap;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Lcom/googlecode/tesseract/android/TessBaseAPI;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->c:Ljava/lang/String;

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;)V
    .locals 0
    .param p0, "arg0"    # Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;

    .prologue
    invoke-direct {p0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a()V

    return-void
.end method

.method private a(Ljava/io/File;Ljava/lang/String;)V
    .locals 3
    .param p1, "arg0"    # Ljava/io/File;
    .param p2, "arg1"    # Ljava/lang/String;

    .prologue
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p2}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p2}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 8
    .param p1, "arg0"    # Ljava/lang/String;

    .prologue
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    sget v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->x:I

    new-array v4, v1, [B

    :goto_0
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    sget v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->b:I

    if-eq v5, v1, :cond_2

    sget v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    :goto_1
    if-ge v1, v5, :cond_0

    aget-byte v6, v4, v1

    sget v7, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->l:I

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    sget v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    invoke-virtual {v3, v4, v1, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    move-object v0, p1

    .end local p1    # "arg0":Ljava/lang/String;
    .local v0, "arg0":Ljava/lang/String;
    move-object p1, v1

    .end local v0    # "arg0":Ljava/lang/String;
    .restart local p1    # "arg0":Ljava/lang/String;
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    :cond_1
    return-void

    :cond_2
    :try_start_1
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance p1, Ljava/io/FileNotFoundException;

    invoke-direct {p1}, Ljava/io/FileNotFoundException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "arg0"    # Landroid/os/Bundle;

    .prologue
    const/16 v2, 0x400

    const/4 v1, 0x1

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0, v1}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->requestWindowFeature(I)Z

    invoke-virtual {p0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    const v0, 0x7f09001b

    invoke-virtual {p0, v0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->setContentView(I)V

    const v0, 0x7f070021

    invoke-virtual {p0, v0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .end local p1    # "arg0":Landroid/os/Bundle;
    check-cast p1, Landroid/widget/Button;

    .restart local p1    # "arg0":Landroid/os/Bundle;
    new-instance v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;

    invoke-direct {v0, p0}, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0a0023

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {p0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->finish()V

    :cond_0
    new-instance v0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity$1;

    invoke-direct {v0, p0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity$1;-><init>(Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
