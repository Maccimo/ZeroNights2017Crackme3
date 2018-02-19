.class public Lcom/googlecode/tesseract/android/TessBaseAPI$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/tesseract/android/TessBaseAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/googlecode/tesseract/android/TessBaseAPI;

.field private final b:I

.field private final c:Landroid/graphics/Rect;

.field private final d:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Lcom/googlecode/tesseract/android/TessBaseAPI;ILandroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lcom/googlecode/tesseract/android/TessBaseAPI$b;->a:Lcom/googlecode/tesseract/android/TessBaseAPI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/googlecode/tesseract/android/TessBaseAPI$b;->b:I

    iput-object p3, p0, Lcom/googlecode/tesseract/android/TessBaseAPI$b;->c:Landroid/graphics/Rect;

    iput-object p4, p0, Lcom/googlecode/tesseract/android/TessBaseAPI$b;->d:Landroid/graphics/Rect;

    return-void
.end method
