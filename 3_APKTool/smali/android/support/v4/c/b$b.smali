.class public Landroid/support/v4/c/b$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:C

.field public b:[F


# direct methods
.method constructor <init>(C[F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, Landroid/support/v4/c/b$b;->a:C

    iput-object p2, p0, Landroid/support/v4/c/b$b;->b:[F

    return-void
.end method

.method constructor <init>(Landroid/support/v4/c/b$b;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-char v0, p1, Landroid/support/v4/c/b$b;->a:C

    iput-char v0, p0, Landroid/support/v4/c/b$b;->a:C

    iget-object v0, p1, Landroid/support/v4/c/b$b;->b:[F

    const/4 v1, 0x0

    iget-object v2, p1, Landroid/support/v4/c/b$b;->b:[F

    array-length v2, v2

    invoke-static {v0, v1, v2}, Landroid/support/v4/c/b;->a([FII)[F

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/c/b$b;->b:[F

    return-void
.end method

.method private static a(Landroid/graphics/Path;DDDDDDDDD)V
    .locals 33

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    mul-double v2, v2, p17

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    move/from16 v20, v0

    invoke-static/range {p13 .. p14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v21

    invoke-static/range {p13 .. p14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v23

    invoke-static/range {p15 .. p16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    invoke-static/range {p15 .. p16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    move-wide/from16 v0, p5

    neg-double v9, v0

    move-wide/from16 v0, p5

    neg-double v3, v0

    move/from16 v0, v20

    int-to-double v11, v0

    div-double v25, p17, v11

    const/4 v2, 0x0

    mul-double v3, v3, v23

    mul-double/2addr v3, v7

    mul-double v11, p7, v21

    mul-double/2addr v11, v5

    add-double/2addr v3, v11

    mul-double v9, v9, v21

    mul-double/2addr v7, v9

    mul-double v9, p7, v23

    mul-double/2addr v5, v9

    sub-double v5, v7, v5

    move v9, v2

    move-wide/from16 v31, v3

    move-wide v2, v5

    move-wide/from16 v4, v31

    :goto_0
    move/from16 v0, v20

    if-ge v9, v0, :cond_0

    add-double v10, p15, v25

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v14

    mul-double v12, p5, v21

    mul-double/2addr v12, v14

    add-double v12, v12, p1

    mul-double v16, p7, v23

    mul-double v16, v16, v6

    sub-double v12, v12, v16

    mul-double v16, p7, v21

    mul-double v16, v16, v6

    mul-double v18, p5, v23

    mul-double v18, v18, v14

    add-double v18, v18, p3

    add-double v16, v16, v18

    move-wide/from16 v0, p5

    neg-double v0, v0

    move-wide/from16 v18, v0

    mul-double v18, v18, v21

    mul-double v18, v18, v6

    mul-double v27, p7, v23

    mul-double v27, v27, v14

    sub-double v18, v18, v27

    mul-double v27, p7, v21

    mul-double v14, v14, v27

    move-wide/from16 v0, p5

    neg-double v0, v0

    move-wide/from16 v27, v0

    mul-double v27, v27, v23

    mul-double v6, v6, v27

    add-double/2addr v14, v6

    sub-double v6, v10, p15

    const-wide/high16 v27, 0x4000000000000000L    # 2.0

    div-double v6, v6, v27

    invoke-static {v6, v7}, Ljava/lang/Math;->tan(D)D

    move-result-wide v6

    sub-double v27, v10, p15

    invoke-static/range {v27 .. v28}, Ljava/lang/Math;->sin(D)D

    move-result-wide v27

    const-wide/high16 v29, 0x4008000000000000L    # 3.0

    mul-double v29, v29, v6

    mul-double v6, v6, v29

    const-wide/high16 v29, 0x4010000000000000L    # 4.0

    add-double v6, v6, v29

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v29, 0x3ff0000000000000L    # 1.0

    sub-double v6, v6, v29

    mul-double v6, v6, v27

    const-wide/high16 v27, 0x4008000000000000L    # 3.0

    div-double v6, v6, v27

    const/4 v8, 0x0

    const/16 v27, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v27

    invoke-virtual {v0, v8, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    mul-double/2addr v2, v6

    add-double v2, v2, p9

    double-to-float v3, v2

    mul-double/2addr v4, v6

    add-double v4, v4, p11

    double-to-float v4, v4

    mul-double v27, v6, v18

    sub-double v27, v12, v27

    move-wide/from16 v0, v27

    double-to-float v5, v0

    mul-double/2addr v6, v14

    sub-double v6, v16, v6

    double-to-float v6, v6

    double-to-float v7, v12

    move-wide/from16 v0, v16

    double-to-float v8, v0

    move-object/from16 v2, p0

    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-int/lit8 v2, v9, 0x1

    move v9, v2

    move-wide/from16 p15, v10

    move-wide/from16 p9, v12

    move-wide v4, v14

    move-wide/from16 p11, v16

    move-wide/from16 v2, v18

    goto/16 :goto_0

    :cond_0
    return-void
.end method

.method private static a(Landroid/graphics/Path;FFFFFFFZZ)V
    .locals 31

    move/from16 v0, p7

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    move/from16 v0, p1

    float-to-double v2, v0

    mul-double/2addr v2, v7

    move/from16 v0, p2

    float-to-double v4, v0

    mul-double/2addr v4, v9

    add-double/2addr v2, v4

    move/from16 v0, p5

    float-to-double v4, v0

    div-double v11, v2, v4

    move/from16 v0, p1

    neg-float v2, v0

    float-to-double v2, v2

    mul-double/2addr v2, v9

    move/from16 v0, p2

    float-to-double v4, v0

    mul-double/2addr v4, v7

    add-double/2addr v2, v4

    move/from16 v0, p6

    float-to-double v4, v0

    div-double v13, v2, v4

    move/from16 v0, p3

    float-to-double v2, v0

    mul-double/2addr v2, v7

    move/from16 v0, p4

    float-to-double v4, v0

    mul-double/2addr v4, v9

    add-double/2addr v2, v4

    move/from16 v0, p5

    float-to-double v4, v0

    div-double v19, v2, v4

    move/from16 v0, p3

    neg-float v2, v0

    float-to-double v2, v2

    mul-double/2addr v2, v9

    move/from16 v0, p4

    float-to-double v4, v0

    mul-double/2addr v4, v7

    add-double/2addr v2, v4

    move/from16 v0, p6

    float-to-double v4, v0

    div-double v21, v2, v4

    sub-double v2, v11, v19

    sub-double v4, v13, v21

    add-double v17, v11, v19

    const-wide/high16 v23, 0x4000000000000000L    # 2.0

    div-double v17, v17, v23

    add-double v23, v13, v21

    const-wide/high16 v25, 0x4000000000000000L    # 2.0

    div-double v23, v23, v25

    mul-double v25, v2, v2

    mul-double v27, v4, v4

    add-double v25, v25, v27

    const-wide/16 v27, 0x0

    cmpl-double v6, v25, v27

    if-nez v6, :cond_0

    const-string v2, "PathParser"

    const-string v3, " Points are coincident"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_0
    const-wide/high16 v27, 0x3ff0000000000000L    # 1.0

    div-double v27, v27, v25

    const-wide/high16 v29, 0x3fd0000000000000L    # 0.25

    sub-double v27, v27, v29

    const-wide/16 v29, 0x0

    cmpg-double v6, v27, v29

    if-gez v6, :cond_1

    const-string v2, "PathParser"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Points are too far apart "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-wide/from16 v0, v25

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static/range {v25 .. v26}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    const-wide v4, 0x3ffffff583a53b8eL    # 1.99999

    div-double/2addr v2, v4

    double-to-float v2, v2

    mul-float v7, p5, v2

    mul-float v8, p6, v2

    move-object/from16 v2, p0

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    invoke-static/range {v2 .. v11}, Landroid/support/v4/c/b$b;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    goto :goto_0

    :cond_1
    invoke-static/range {v27 .. v28}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v25

    mul-double v27, v2, v25

    mul-double v2, v4, v25

    move/from16 v0, p8

    move/from16 v1, p9

    if-ne v0, v1, :cond_3

    sub-double v2, v17, v2

    add-double v4, v27, v23

    :goto_1
    sub-double/2addr v13, v4

    sub-double/2addr v11, v2

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v17

    sub-double v11, v21, v4

    sub-double v13, v19, v2

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v11

    sub-double v19, v11, v17

    const-wide/16 v11, 0x0

    cmpl-double v6, v19, v11

    if-ltz v6, :cond_4

    const/4 v6, 0x1

    :goto_2
    move/from16 v0, p9

    if-eq v0, v6, :cond_2

    const-wide/16 v11, 0x0

    cmpl-double v6, v19, v11

    if-lez v6, :cond_5

    const-wide v11, 0x401921fb54442d18L    # 6.283185307179586

    sub-double v19, v19, v11

    :cond_2
    :goto_3
    move/from16 v0, p5

    float-to-double v11, v0

    mul-double/2addr v11, v2

    move/from16 v0, p6

    float-to-double v2, v0

    mul-double v5, v4, v2

    mul-double v2, v11, v7

    mul-double v13, v5, v9

    sub-double v3, v2, v13

    mul-double/2addr v9, v11

    mul-double/2addr v5, v7

    add-double/2addr v5, v9

    move/from16 v0, p5

    float-to-double v7, v0

    move/from16 v0, p6

    float-to-double v9, v0

    move/from16 v0, p1

    float-to-double v11, v0

    move/from16 v0, p2

    float-to-double v13, v0

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v20}, Landroid/support/v4/c/b$b;->a(Landroid/graphics/Path;DDDDDDDDD)V

    goto/16 :goto_0

    :cond_3
    add-double v2, v2, v17

    sub-double v4, v23, v27

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    goto :goto_2

    :cond_5
    const-wide v11, 0x401921fb54442d18L    # 6.283185307179586

    add-double v19, v19, v11

    goto :goto_3
.end method

.method private static a(Landroid/graphics/Path;[FCC[F)V
    .locals 17

    const/4 v1, 0x0

    aget v4, p1, v1

    const/4 v1, 0x1

    aget v2, p1, v1

    const/4 v1, 0x2

    aget v6, p1, v1

    const/4 v1, 0x3

    aget v7, p1, v1

    const/4 v1, 0x4

    aget v5, p1, v1

    const/4 v1, 0x5

    aget v3, p1, v1

    sparse-switch p3, :sswitch_data_0

    const/4 v1, 0x2

    move v11, v1

    move v1, v2

    move v2, v4

    move v4, v6

    move v6, v7

    :goto_0
    const/4 v7, 0x0

    move v12, v7

    move v13, v2

    move v14, v1

    move v15, v3

    move/from16 v16, v5

    :goto_1
    move-object/from16 v0, p4

    array-length v1, v0

    if-ge v12, v1, :cond_a

    sparse-switch p3, :sswitch_data_1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    :goto_2
    add-int v1, v12, v11

    move v12, v1

    move v13, v2

    move v14, v3

    move v15, v5

    move/from16 v16, v7

    move/from16 p2, p3

    goto :goto_1

    :sswitch_0
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Path;->close()V

    move-object/from16 v0, p0

    invoke-virtual {v0, v5, v3}, Landroid/graphics/Path;->moveTo(FF)V

    const/4 v1, 0x2

    move v11, v1

    move v2, v5

    move v4, v5

    move v6, v3

    move v1, v3

    goto :goto_0

    :sswitch_1
    const/4 v1, 0x2

    move v11, v1

    move v1, v2

    move v2, v4

    move v4, v6

    move v6, v7

    goto :goto_0

    :sswitch_2
    const/4 v1, 0x1

    move v11, v1

    move v1, v2

    move v2, v4

    move v4, v6

    move v6, v7

    goto :goto_0

    :sswitch_3
    const/4 v1, 0x6

    move v11, v1

    move v1, v2

    move v2, v4

    move v4, v6

    move v6, v7

    goto :goto_0

    :sswitch_4
    const/4 v1, 0x4

    move v11, v1

    move v1, v2

    move v2, v4

    move v4, v6

    move v6, v7

    goto :goto_0

    :sswitch_5
    const/4 v1, 0x7

    move v11, v1

    move v1, v2

    move v2, v4

    move v4, v6

    move v6, v7

    goto :goto_0

    :sswitch_6
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-float/2addr v13, v1

    add-int/lit8 v1, v12, 0x1

    aget v1, p4, v1

    add-float/2addr v14, v1

    if-lez v12, :cond_0

    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->rMoveTo(FF)V

    move v2, v13

    move v3, v14

    move v7, v13

    move v5, v14

    goto :goto_2

    :sswitch_7
    add-int/lit8 v1, v12, 0x0

    aget v13, p4, v1

    add-int/lit8 v1, v12, 0x1

    aget v14, p4, v1

    if-lez v12, :cond_1

    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :cond_1
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    move v2, v13

    move v3, v14

    move v7, v13

    move v5, v14

    goto/16 :goto_2

    :sswitch_8
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    add-float/2addr v14, v2

    add-float/2addr v13, v1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_9
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v1, v12, 0x0

    aget v13, p4, v1

    add-int/lit8 v1, v12, 0x1

    aget v14, p4, v1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_a
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-float/2addr v13, v1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_b
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v14}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v1, v12, 0x0

    aget v13, p4, v1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_c
    const/4 v1, 0x0

    add-int/lit8 v2, v12, 0x0

    aget v2, p4, v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-float/2addr v14, v1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_d
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    move-object/from16 v0, p0

    invoke-virtual {v0, v13, v1}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v1, v12, 0x0

    aget v14, p4, v1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_e
    add-int/lit8 v1, v12, 0x0

    aget v2, p4, v1

    add-int/lit8 v1, v12, 0x1

    aget v3, p4, v1

    add-int/lit8 v1, v12, 0x2

    aget v4, p4, v1

    add-int/lit8 v1, v12, 0x3

    aget v5, p4, v1

    add-int/lit8 v1, v12, 0x4

    aget v6, p4, v1

    add-int/lit8 v1, v12, 0x5

    aget v7, p4, v1

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    add-int/lit8 v1, v12, 0x2

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x3

    aget v2, p4, v2

    add-int/lit8 v3, v12, 0x4

    aget v5, p4, v3

    add-int/lit8 v3, v12, 0x5

    aget v3, p4, v3

    add-float v4, v13, v1

    add-float/2addr v3, v14

    add-float/2addr v13, v5

    add-float v6, v2, v14

    move v2, v13

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_f
    add-int/lit8 v1, v12, 0x0

    aget v2, p4, v1

    add-int/lit8 v1, v12, 0x1

    aget v3, p4, v1

    add-int/lit8 v1, v12, 0x2

    aget v4, p4, v1

    add-int/lit8 v1, v12, 0x3

    aget v5, p4, v1

    add-int/lit8 v1, v12, 0x4

    aget v6, p4, v1

    add-int/lit8 v1, v12, 0x5

    aget v7, p4, v1

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-int/lit8 v1, v12, 0x4

    aget v13, p4, v1

    add-int/lit8 v1, v12, 0x5

    aget v14, p4, v1

    add-int/lit8 v1, v12, 0x2

    aget v4, p4, v1

    add-int/lit8 v1, v12, 0x3

    aget v6, p4, v1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_10
    const/16 v1, 0x63

    move/from16 v0, p2

    if-eq v0, v1, :cond_2

    const/16 v1, 0x73

    move/from16 v0, p2

    if-eq v0, v1, :cond_2

    const/16 v1, 0x43

    move/from16 v0, p2

    if-eq v0, v1, :cond_2

    const/16 v1, 0x53

    move/from16 v0, p2

    if-ne v0, v1, :cond_d

    :cond_2
    sub-float v2, v13, v4

    sub-float v3, v14, v6

    :goto_3
    add-int/lit8 v1, v12, 0x0

    aget v4, p4, v1

    add-int/lit8 v1, v12, 0x1

    aget v5, p4, v1

    add-int/lit8 v1, v12, 0x2

    aget v6, p4, v1

    add-int/lit8 v1, v12, 0x3

    aget v7, p4, v1

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    add-int/lit8 v3, v12, 0x2

    aget v5, p4, v3

    add-int/lit8 v3, v12, 0x3

    aget v3, p4, v3

    add-float v4, v13, v1

    add-float/2addr v3, v14

    add-float/2addr v13, v5

    add-float v6, v2, v14

    move v2, v13

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_11
    const/16 v1, 0x63

    move/from16 v0, p2

    if-eq v0, v1, :cond_3

    const/16 v1, 0x73

    move/from16 v0, p2

    if-eq v0, v1, :cond_3

    const/16 v1, 0x43

    move/from16 v0, p2

    if-eq v0, v1, :cond_3

    const/16 v1, 0x53

    move/from16 v0, p2

    if-ne v0, v1, :cond_c

    :cond_3
    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v13

    sub-float v2, v1, v4

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v14

    sub-float v3, v1, v6

    :goto_4
    add-int/lit8 v1, v12, 0x0

    aget v4, p4, v1

    add-int/lit8 v1, v12, 0x1

    aget v5, p4, v1

    add-int/lit8 v1, v12, 0x2

    aget v6, p4, v1

    add-int/lit8 v1, v12, 0x3

    aget v7, p4, v1

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-int/lit8 v1, v12, 0x0

    aget v4, p4, v1

    add-int/lit8 v1, v12, 0x1

    aget v6, p4, v1

    add-int/lit8 v1, v12, 0x2

    aget v13, p4, v1

    add-int/lit8 v1, v12, 0x3

    aget v14, p4, v1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_12
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    add-int/lit8 v3, v12, 0x2

    aget v3, p4, v3

    add-int/lit8 v4, v12, 0x3

    aget v4, p4, v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    add-int/lit8 v3, v12, 0x2

    aget v5, p4, v3

    add-int/lit8 v3, v12, 0x3

    aget v3, p4, v3

    add-float v4, v13, v1

    add-float/2addr v3, v14

    add-float/2addr v13, v5

    add-float v6, v2, v14

    move v2, v13

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_13
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    add-int/lit8 v3, v12, 0x2

    aget v3, p4, v3

    add-int/lit8 v4, v12, 0x3

    aget v4, p4, v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->quadTo(FFFF)V

    add-int/lit8 v1, v12, 0x0

    aget v4, p4, v1

    add-int/lit8 v1, v12, 0x1

    aget v6, p4, v1

    add-int/lit8 v1, v12, 0x2

    aget v13, p4, v1

    add-int/lit8 v1, v12, 0x3

    aget v14, p4, v1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_14
    const/16 v1, 0x71

    move/from16 v0, p2

    if-eq v0, v1, :cond_4

    const/16 v1, 0x74

    move/from16 v0, p2

    if-eq v0, v1, :cond_4

    const/16 v1, 0x51

    move/from16 v0, p2

    if-eq v0, v1, :cond_4

    const/16 v1, 0x54

    move/from16 v0, p2

    if-ne v0, v1, :cond_b

    :cond_4
    sub-float v1, v13, v4

    sub-float v2, v14, v6

    :goto_5
    add-int/lit8 v3, v12, 0x0

    aget v3, p4, v3

    add-int/lit8 v4, v12, 0x1

    aget v4, p4, v4

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    add-int/lit8 v3, v12, 0x0

    aget v5, p4, v3

    add-int/lit8 v3, v12, 0x1

    aget v3, p4, v3

    add-float v4, v13, v1

    add-float/2addr v3, v14

    add-float/2addr v13, v5

    add-float v6, v2, v14

    move v2, v13

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_15
    const/16 v1, 0x71

    move/from16 v0, p2

    if-eq v0, v1, :cond_5

    const/16 v1, 0x74

    move/from16 v0, p2

    if-eq v0, v1, :cond_5

    const/16 v1, 0x51

    move/from16 v0, p2

    if-eq v0, v1, :cond_5

    const/16 v1, 0x54

    move/from16 v0, p2

    if-ne v0, v1, :cond_e

    :cond_5
    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v13

    sub-float v4, v1, v4

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v14

    sub-float v6, v1, v6

    :goto_6
    add-int/lit8 v1, v12, 0x0

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x1

    aget v2, p4, v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v4, v6, v1, v2}, Landroid/graphics/Path;->quadTo(FFFF)V

    add-int/lit8 v1, v12, 0x0

    aget v13, p4, v1

    add-int/lit8 v1, v12, 0x1

    aget v14, p4, v1

    move v2, v13

    move v3, v14

    move/from16 v7, v16

    move v5, v15

    goto/16 :goto_2

    :sswitch_16
    add-int/lit8 v1, v12, 0x5

    aget v1, p4, v1

    add-int/lit8 v2, v12, 0x6

    aget v2, p4, v2

    add-int/lit8 v3, v12, 0x0

    aget v6, p4, v3

    add-int/lit8 v3, v12, 0x1

    aget v7, p4, v3

    add-int/lit8 v3, v12, 0x2

    aget v8, p4, v3

    add-int/lit8 v3, v12, 0x3

    aget v3, p4, v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_6

    const/4 v9, 0x1

    :goto_7
    add-int/lit8 v3, v12, 0x4

    aget v3, p4, v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_7

    const/4 v10, 0x1

    :goto_8
    add-float v4, v1, v13

    add-float v5, v2, v14

    move-object/from16 v1, p0

    move v2, v13

    move v3, v14

    invoke-static/range {v1 .. v10}, Landroid/support/v4/c/b$b;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    add-int/lit8 v1, v12, 0x5

    aget v1, p4, v1

    add-float/2addr v13, v1

    add-int/lit8 v1, v12, 0x6

    aget v1, p4, v1

    add-float/2addr v14, v1

    move v2, v13

    move v3, v14

    move v4, v13

    move/from16 v7, v16

    move v6, v14

    move v5, v15

    goto/16 :goto_2

    :cond_6
    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    const/4 v10, 0x0

    goto :goto_8

    :sswitch_17
    add-int/lit8 v1, v12, 0x5

    aget v4, p4, v1

    add-int/lit8 v1, v12, 0x6

    aget v5, p4, v1

    add-int/lit8 v1, v12, 0x0

    aget v6, p4, v1

    add-int/lit8 v1, v12, 0x1

    aget v7, p4, v1

    add-int/lit8 v1, v12, 0x2

    aget v8, p4, v1

    add-int/lit8 v1, v12, 0x3

    aget v1, p4, v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_8

    const/4 v9, 0x1

    :goto_9
    add-int/lit8 v1, v12, 0x4

    aget v1, p4, v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_9

    const/4 v10, 0x1

    :goto_a
    move-object/from16 v1, p0

    move v2, v13

    move v3, v14

    invoke-static/range {v1 .. v10}, Landroid/support/v4/c/b$b;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    add-int/lit8 v1, v12, 0x5

    aget v13, p4, v1

    add-int/lit8 v1, v12, 0x6

    aget v14, p4, v1

    move v2, v13

    move v3, v14

    move v4, v13

    move/from16 v7, v16

    move v6, v14

    move v5, v15

    goto/16 :goto_2

    :cond_8
    const/4 v9, 0x0

    goto :goto_9

    :cond_9
    const/4 v10, 0x0

    goto :goto_a

    :cond_a
    const/4 v1, 0x0

    aput v13, p1, v1

    const/4 v1, 0x1

    aput v14, p1, v1

    const/4 v1, 0x2

    aput v4, p1, v1

    const/4 v1, 0x3

    aput v6, p1, v1

    const/4 v1, 0x4

    aput v16, p1, v1

    const/4 v1, 0x5

    aput v15, p1, v1

    return-void

    :cond_b
    const/4 v2, 0x0

    const/4 v1, 0x0

    goto/16 :goto_5

    :cond_c
    move v3, v14

    move v2, v13

    goto/16 :goto_4

    :cond_d
    const/4 v3, 0x0

    const/4 v2, 0x0

    goto/16 :goto_3

    :cond_e
    move v6, v14

    move v4, v13

    goto/16 :goto_6

    nop

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_5
        0x43 -> :sswitch_3
        0x48 -> :sswitch_2
        0x4c -> :sswitch_1
        0x4d -> :sswitch_1
        0x51 -> :sswitch_4
        0x53 -> :sswitch_4
        0x54 -> :sswitch_1
        0x56 -> :sswitch_2
        0x5a -> :sswitch_0
        0x61 -> :sswitch_5
        0x63 -> :sswitch_3
        0x68 -> :sswitch_2
        0x6c -> :sswitch_1
        0x6d -> :sswitch_1
        0x71 -> :sswitch_4
        0x73 -> :sswitch_4
        0x74 -> :sswitch_1
        0x76 -> :sswitch_2
        0x7a -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x41 -> :sswitch_17
        0x43 -> :sswitch_f
        0x48 -> :sswitch_b
        0x4c -> :sswitch_9
        0x4d -> :sswitch_7
        0x51 -> :sswitch_13
        0x53 -> :sswitch_11
        0x54 -> :sswitch_15
        0x56 -> :sswitch_d
        0x61 -> :sswitch_16
        0x63 -> :sswitch_e
        0x68 -> :sswitch_a
        0x6c -> :sswitch_8
        0x6d -> :sswitch_6
        0x71 -> :sswitch_12
        0x73 -> :sswitch_10
        0x74 -> :sswitch_14
        0x76 -> :sswitch_c
    .end sparse-switch
.end method

.method public static a([Landroid/support/v4/c/b$b;Landroid/graphics/Path;)V
    .locals 5

    const/4 v0, 0x6

    new-array v2, v0, [F

    const/16 v1, 0x6d

    const/4 v0, 0x0

    :goto_0
    array-length v3, p0

    if-ge v0, v3, :cond_0

    aget-object v3, p0, v0

    iget-char v3, v3, Landroid/support/v4/c/b$b;->a:C

    aget-object v4, p0, v0

    iget-object v4, v4, Landroid/support/v4/c/b$b;->b:[F

    invoke-static {p1, v2, v1, v3, v4}, Landroid/support/v4/c/b$b;->a(Landroid/graphics/Path;[FCC[F)V

    aget-object v1, p0, v0

    iget-char v1, v1, Landroid/support/v4/c/b$b;->a:C

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/c/b$b;Landroid/support/v4/c/b$b;F)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Landroid/support/v4/c/b$b;->b:[F

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroid/support/v4/c/b$b;->b:[F

    iget-object v2, p1, Landroid/support/v4/c/b$b;->b:[F

    aget v2, v2, v0

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v3, p3

    mul-float/2addr v2, v3

    iget-object v3, p2, Landroid/support/v4/c/b$b;->b:[F

    aget v3, v3, v0

    mul-float/2addr v3, p3

    add-float/2addr v2, v3

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
