.class Landroid/support/b/a/i$e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/b/a/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# static fields
.field private static final k:Landroid/graphics/Matrix;


# instance fields
.field final a:Landroid/support/b/a/i$c;

.field b:F

.field c:F

.field d:F

.field e:F

.field f:I

.field g:Ljava/lang/String;

.field final h:Landroid/support/v4/g/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/g/a",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Landroid/graphics/Path;

.field private final j:Landroid/graphics/Path;

.field private final l:Landroid/graphics/Matrix;

.field private m:Landroid/graphics/Paint;

.field private n:Landroid/graphics/Paint;

.field private o:Landroid/graphics/PathMeasure;

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Landroid/support/b/a/i$e;->k:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroid/support/b/a/i$e;->l:Landroid/graphics/Matrix;

    iput v1, p0, Landroid/support/b/a/i$e;->b:F

    iput v1, p0, Landroid/support/b/a/i$e;->c:F

    iput v1, p0, Landroid/support/b/a/i$e;->d:F

    iput v1, p0, Landroid/support/b/a/i$e;->e:F

    const/16 v0, 0xff

    iput v0, p0, Landroid/support/b/a/i$e;->f:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/b/a/i$e;->g:Ljava/lang/String;

    new-instance v0, Landroid/support/v4/g/a;

    invoke-direct {v0}, Landroid/support/v4/g/a;-><init>()V

    iput-object v0, p0, Landroid/support/b/a/i$e;->h:Landroid/support/v4/g/a;

    new-instance v0, Landroid/support/b/a/i$c;

    invoke-direct {v0}, Landroid/support/b/a/i$c;-><init>()V

    iput-object v0, p0, Landroid/support/b/a/i$e;->a:Landroid/support/b/a/i$c;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Landroid/support/b/a/i$e;->i:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Landroid/support/b/a/i$e;->j:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Landroid/support/b/a/i$e;)V
    .locals 3

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroid/support/b/a/i$e;->l:Landroid/graphics/Matrix;

    iput v1, p0, Landroid/support/b/a/i$e;->b:F

    iput v1, p0, Landroid/support/b/a/i$e;->c:F

    iput v1, p0, Landroid/support/b/a/i$e;->d:F

    iput v1, p0, Landroid/support/b/a/i$e;->e:F

    const/16 v0, 0xff

    iput v0, p0, Landroid/support/b/a/i$e;->f:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/b/a/i$e;->g:Ljava/lang/String;

    new-instance v0, Landroid/support/v4/g/a;

    invoke-direct {v0}, Landroid/support/v4/g/a;-><init>()V

    iput-object v0, p0, Landroid/support/b/a/i$e;->h:Landroid/support/v4/g/a;

    new-instance v0, Landroid/support/b/a/i$c;

    iget-object v1, p1, Landroid/support/b/a/i$e;->a:Landroid/support/b/a/i$c;

    iget-object v2, p0, Landroid/support/b/a/i$e;->h:Landroid/support/v4/g/a;

    invoke-direct {v0, v1, v2}, Landroid/support/b/a/i$c;-><init>(Landroid/support/b/a/i$c;Landroid/support/v4/g/a;)V

    iput-object v0, p0, Landroid/support/b/a/i$e;->a:Landroid/support/b/a/i$c;

    new-instance v0, Landroid/graphics/Path;

    iget-object v1, p1, Landroid/support/b/a/i$e;->i:Landroid/graphics/Path;

    invoke-direct {v0, v1}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v0, p0, Landroid/support/b/a/i$e;->i:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    iget-object v1, p1, Landroid/support/b/a/i$e;->j:Landroid/graphics/Path;

    invoke-direct {v0, v1}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v0, p0, Landroid/support/b/a/i$e;->j:Landroid/graphics/Path;

    iget v0, p1, Landroid/support/b/a/i$e;->b:F

    iput v0, p0, Landroid/support/b/a/i$e;->b:F

    iget v0, p1, Landroid/support/b/a/i$e;->c:F

    iput v0, p0, Landroid/support/b/a/i$e;->c:F

    iget v0, p1, Landroid/support/b/a/i$e;->d:F

    iput v0, p0, Landroid/support/b/a/i$e;->d:F

    iget v0, p1, Landroid/support/b/a/i$e;->e:F

    iput v0, p0, Landroid/support/b/a/i$e;->e:F

    iget v0, p1, Landroid/support/b/a/i$e;->p:I

    iput v0, p0, Landroid/support/b/a/i$e;->p:I

    iget v0, p1, Landroid/support/b/a/i$e;->f:I

    iput v0, p0, Landroid/support/b/a/i$e;->f:I

    iget-object v0, p1, Landroid/support/b/a/i$e;->g:Ljava/lang/String;

    iput-object v0, p0, Landroid/support/b/a/i$e;->g:Ljava/lang/String;

    iget-object v0, p1, Landroid/support/b/a/i$e;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/b/a/i$e;->h:Landroid/support/v4/g/a;

    iget-object v1, p1, Landroid/support/b/a/i$e;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Landroid/support/v4/g/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static a(FFFF)F
    .locals 2

    mul-float v0, p0, p3

    mul-float v1, p1, p2

    sub-float/2addr v0, v1

    return v0
.end method

.method private a(Landroid/graphics/Matrix;)F
    .locals 11

    const/4 v10, 0x3

    const/4 v9, 0x2

    const/4 v8, 0x1

    const/4 v7, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x4

    new-array v1, v1, [F

    aput v0, v1, v7

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v1, v8

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v1, v9

    aput v0, v1, v10

    invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->mapVectors([F)V

    aget v2, v1, v7

    float-to-double v2, v2

    aget v4, v1, v8

    float-to-double v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v2

    double-to-float v2, v2

    aget v3, v1, v9

    float-to-double v3, v3

    aget v5, v1, v10

    float-to-double v5, v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v3

    double-to-float v3, v3

    aget v4, v1, v7

    aget v5, v1, v8

    aget v6, v1, v9

    aget v1, v1, v10

    invoke-static {v4, v5, v6, v1}, Landroid/support/b/a/i$e;->a(FFFF)F

    move-result v1

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    cmpl-float v3, v2, v0

    if-lez v3, :cond_0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    div-float/2addr v0, v2

    :cond_0
    return v0
.end method

.method static synthetic a(Landroid/support/b/a/i$e;)Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Landroid/support/b/a/i$e;->n:Landroid/graphics/Paint;

    return-object v0
.end method

.method static synthetic a(Landroid/support/b/a/i$e;Landroid/graphics/Paint;)Landroid/graphics/Paint;
    .locals 0

    iput-object p1, p0, Landroid/support/b/a/i$e;->n:Landroid/graphics/Paint;

    return-object p1
.end method

.method private a(Landroid/support/b/a/i$c;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
    .locals 8

    invoke-static {p1}, Landroid/support/b/a/i$c;->a(Landroid/support/b/a/i$c;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    invoke-static {p1}, Landroid/support/b/a/i$c;->a(Landroid/support/b/a/i$c;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-static {p1}, Landroid/support/b/a/i$c;->b(Landroid/support/b/a/i$c;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    const/4 v0, 0x0

    move v7, v0

    :goto_0
    iget-object v0, p1, Landroid/support/b/a/i$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    iget-object v0, p1, Landroid/support/b/a/i$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v0, v1, Landroid/support/b/a/i$c;

    if-eqz v0, :cond_1

    check-cast v1, Landroid/support/b/a/i$c;

    invoke-static {p1}, Landroid/support/b/a/i$c;->a(Landroid/support/b/a/i$c;)Landroid/graphics/Matrix;

    move-result-object v2

    move-object v0, p0

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Landroid/support/b/a/i$e;->a(Landroid/support/b/a/i$c;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    :cond_0
    :goto_1
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_0

    :cond_1
    instance-of v0, v1, Landroid/support/b/a/i$d;

    if-eqz v0, :cond_0

    move-object v2, v1

    check-cast v2, Landroid/support/b/a/i$d;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Landroid/support/b/a/i$e;->a(Landroid/support/b/a/i$c;Landroid/support/b/a/i$d;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method private a(Landroid/support/b/a/i$c;Landroid/support/b/a/i$d;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
    .locals 11

    int-to-float v1, p4

    iget v2, p0, Landroid/support/b/a/i$e;->d:F

    div-float/2addr v1, v2

    move/from16 v0, p5

    int-to-float v2, v0

    iget v3, p0, Landroid/support/b/a/i$e;->e:F

    div-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {p1}, Landroid/support/b/a/i$c;->a(Landroid/support/b/a/i$c;)Landroid/graphics/Matrix;

    move-result-object v4

    iget-object v5, p0, Landroid/support/b/a/i$e;->l:Landroid/graphics/Matrix;

    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v5, p0, Landroid/support/b/a/i$e;->l:Landroid/graphics/Matrix;

    invoke-virtual {v5, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-direct {p0, v4}, Landroid/support/b/a/i$e;->a(Landroid/graphics/Matrix;)F

    move-result v2

    const/4 v1, 0x0

    cmpl-float v1, v2, v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Landroid/support/b/a/i$e;->i:Landroid/graphics/Path;

    invoke-virtual {p2, v1}, Landroid/support/b/a/i$d;->a(Landroid/graphics/Path;)V

    iget-object v1, p0, Landroid/support/b/a/i$e;->i:Landroid/graphics/Path;

    iget-object v4, p0, Landroid/support/b/a/i$e;->j:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    invoke-virtual {p2}, Landroid/support/b/a/i$d;->a()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v2, p0, Landroid/support/b/a/i$e;->j:Landroid/graphics/Path;

    iget-object v3, p0, Landroid/support/b/a/i$e;->l:Landroid/graphics/Matrix;

    invoke-virtual {v2, v1, v3}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    iget-object v1, p0, Landroid/support/b/a/i$e;->j:Landroid/graphics/Path;

    invoke-virtual {p3, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    goto :goto_0

    :cond_2
    check-cast p2, Landroid/support/b/a/i$b;

    iget v4, p2, Landroid/support/b/a/i$b;->g:F

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-nez v4, :cond_3

    iget v4, p2, Landroid/support/b/a/i$b;->h:F

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_5

    :cond_3
    iget v4, p2, Landroid/support/b/a/i$b;->g:F

    iget v5, p2, Landroid/support/b/a/i$b;->i:F

    iget v6, p2, Landroid/support/b/a/i$b;->h:F

    iget v7, p2, Landroid/support/b/a/i$b;->i:F

    iget-object v8, p0, Landroid/support/b/a/i$e;->o:Landroid/graphics/PathMeasure;

    if-nez v8, :cond_4

    new-instance v8, Landroid/graphics/PathMeasure;

    invoke-direct {v8}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v8, p0, Landroid/support/b/a/i$e;->o:Landroid/graphics/PathMeasure;

    :cond_4
    iget-object v8, p0, Landroid/support/b/a/i$e;->o:Landroid/graphics/PathMeasure;

    iget-object v9, p0, Landroid/support/b/a/i$e;->i:Landroid/graphics/Path;

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v8, p0, Landroid/support/b/a/i$e;->o:Landroid/graphics/PathMeasure;

    invoke-virtual {v8}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v8

    add-float/2addr v4, v5

    const/high16 v5, 0x3f800000    # 1.0f

    rem-float/2addr v4, v5

    mul-float/2addr v4, v8

    add-float v5, v6, v7

    const/high16 v6, 0x3f800000    # 1.0f

    rem-float/2addr v5, v6

    mul-float/2addr v5, v8

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    cmpl-float v6, v4, v5

    if-lez v6, :cond_b

    iget-object v6, p0, Landroid/support/b/a/i$e;->o:Landroid/graphics/PathMeasure;

    const/4 v7, 0x1

    invoke-virtual {v6, v4, v8, v1, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    iget-object v4, p0, Landroid/support/b/a/i$e;->o:Landroid/graphics/PathMeasure;

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-virtual {v4, v6, v5, v1, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/graphics/Path;->rLineTo(FF)V

    :cond_5
    iget-object v4, p0, Landroid/support/b/a/i$e;->j:Landroid/graphics/Path;

    iget-object v5, p0, Landroid/support/b/a/i$e;->l:Landroid/graphics/Matrix;

    invoke-virtual {v4, v1, v5}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    iget v1, p2, Landroid/support/b/a/i$b;->c:I

    if-eqz v1, :cond_7

    iget-object v1, p0, Landroid/support/b/a/i$e;->n:Landroid/graphics/Paint;

    if-nez v1, :cond_6

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Landroid/support/b/a/i$e;->n:Landroid/graphics/Paint;

    iget-object v1, p0, Landroid/support/b/a/i$e;->n:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Landroid/support/b/a/i$e;->n:Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    :cond_6
    iget-object v4, p0, Landroid/support/b/a/i$e;->n:Landroid/graphics/Paint;

    iget v1, p2, Landroid/support/b/a/i$b;->c:I

    iget v5, p2, Landroid/support/b/a/i$b;->f:F

    invoke-static {v1, v5}, Landroid/support/b/a/i;->a(IF)I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v0, p6

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget-object v5, p0, Landroid/support/b/a/i$e;->j:Landroid/graphics/Path;

    iget v1, p2, Landroid/support/b/a/i$b;->e:I

    if-nez v1, :cond_c

    sget-object v1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    :goto_2
    invoke-virtual {v5, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    iget-object v1, p0, Landroid/support/b/a/i$e;->j:Landroid/graphics/Path;

    invoke-virtual {p3, v1, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_7
    iget v1, p2, Landroid/support/b/a/i$b;->a:I

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/b/a/i$e;->m:Landroid/graphics/Paint;

    if-nez v1, :cond_8

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Landroid/support/b/a/i$e;->m:Landroid/graphics/Paint;

    iget-object v1, p0, Landroid/support/b/a/i$e;->m:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Landroid/support/b/a/i$e;->m:Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    :cond_8
    iget-object v1, p0, Landroid/support/b/a/i$e;->m:Landroid/graphics/Paint;

    iget-object v4, p2, Landroid/support/b/a/i$b;->k:Landroid/graphics/Paint$Join;

    if-eqz v4, :cond_9

    iget-object v4, p2, Landroid/support/b/a/i$b;->k:Landroid/graphics/Paint$Join;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    :cond_9
    iget-object v4, p2, Landroid/support/b/a/i$b;->j:Landroid/graphics/Paint$Cap;

    if-eqz v4, :cond_a

    iget-object v4, p2, Landroid/support/b/a/i$b;->j:Landroid/graphics/Paint$Cap;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    :cond_a
    iget v4, p2, Landroid/support/b/a/i$b;->l:F

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    iget v4, p2, Landroid/support/b/a/i$b;->a:I

    iget v5, p2, Landroid/support/b/a/i$b;->d:F

    invoke-static {v4, v5}, Landroid/support/b/a/i;->a(IF)I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v0, p6

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    mul-float/2addr v2, v3

    iget v3, p2, Landroid/support/b/a/i$b;->b:F

    mul-float/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v2, p0, Landroid/support/b/a/i$e;->j:Landroid/graphics/Path;

    invoke-virtual {p3, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_0

    :cond_b
    iget-object v6, p0, Landroid/support/b/a/i$e;->o:Landroid/graphics/PathMeasure;

    const/4 v7, 0x1

    invoke-virtual {v6, v4, v5, v1, v7}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    goto/16 :goto_1

    :cond_c
    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    goto :goto_2
.end method

.method static synthetic b(Landroid/support/b/a/i$e;)Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Landroid/support/b/a/i$e;->m:Landroid/graphics/Paint;

    return-object v0
.end method

.method static synthetic b(Landroid/support/b/a/i$e;Landroid/graphics/Paint;)Landroid/graphics/Paint;
    .locals 0

    iput-object p1, p0, Landroid/support/b/a/i$e;->m:Landroid/graphics/Paint;

    return-object p1
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
    .locals 7

    iget-object v1, p0, Landroid/support/b/a/i$e;->a:Landroid/support/b/a/i$c;

    sget-object v2, Landroid/support/b/a/i$e;->k:Landroid/graphics/Matrix;

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Landroid/support/b/a/i$e;->a(Landroid/support/b/a/i$c;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    return-void
.end method

.method public getAlpha()F
    .locals 2

    invoke-virtual {p0}, Landroid/support/b/a/i$e;->getRootAlpha()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public getRootAlpha()I
    .locals 1

    iget v0, p0, Landroid/support/b/a/i$e;->f:I

    return v0
.end method

.method public setAlpha(F)V
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v0, p1

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Landroid/support/b/a/i$e;->setRootAlpha(I)V

    return-void
.end method

.method public setRootAlpha(I)V
    .locals 0

    iput p1, p0, Landroid/support/b/a/i$e;->f:I

    return-void
.end method
