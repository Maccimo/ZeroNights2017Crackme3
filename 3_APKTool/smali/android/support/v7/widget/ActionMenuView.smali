.class public Landroid/support/v7/widget/ActionMenuView;
.super Landroid/support/v7/widget/w;

# interfaces
.implements Landroid/support/v7/view/menu/g$b;
.implements Landroid/support/v7/view/menu/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/ActionMenuView$a;,
        Landroid/support/v7/widget/ActionMenuView$b;,
        Landroid/support/v7/widget/ActionMenuView$c;,
        Landroid/support/v7/widget/ActionMenuView$d;,
        Landroid/support/v7/widget/ActionMenuView$e;
    }
.end annotation


# instance fields
.field a:Landroid/support/v7/view/menu/g$a;

.field b:Landroid/support/v7/widget/ActionMenuView$e;

.field private c:Landroid/support/v7/view/menu/g;

.field private d:Landroid/content/Context;

.field private e:I

.field private f:Z

.field private g:Landroid/support/v7/widget/d;

.field private h:Landroid/support/v7/view/menu/m$a;

.field private i:Z

.field private j:I

.field private k:I

.field private l:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/w;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0, v2}, Landroid/support/v7/widget/ActionMenuView;->setBaselineAligned(Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x42600000    # 56.0f

    mul-float/2addr v1, v0

    float-to-int v1, v1

    iput v1, p0, Landroid/support/v7/widget/ActionMenuView;->k:I

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Landroid/support/v7/widget/ActionMenuView;->l:I

    iput-object p1, p0, Landroid/support/v7/widget/ActionMenuView;->d:Landroid/content/Context;

    iput v2, p0, Landroid/support/v7/widget/ActionMenuView;->e:I

    return-void
.end method

.method static a(Landroid/view/View;IIII)I
    .locals 8

    const/4 v4, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/ActionMenuView$c;

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    sub-int/2addr v1, p4

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    instance-of v1, p0, Landroid/support/v7/view/menu/ActionMenuItemView;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, Landroid/support/v7/view/menu/ActionMenuItemView;

    :goto_0
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/support/v7/view/menu/ActionMenuItemView;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    move v5, v4

    :goto_1
    if-lez p2, :cond_6

    if-eqz v5, :cond_0

    if-lt p2, v2, :cond_6

    :cond_0
    mul-int v1, p1, p2

    const/high16 v7, -0x80000000

    invoke-static {v1, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0, v1, v6}, Landroid/view/View;->measure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    div-int v1, v7, p1

    rem-int/2addr v7, p1

    if-eqz v7, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    if-eqz v5, :cond_2

    if-ge v1, v2, :cond_2

    move v1, v2

    :cond_2
    :goto_2
    iget-boolean v2, v0, Landroid/support/v7/widget/ActionMenuView$c;->a:Z

    if-nez v2, :cond_3

    if-eqz v5, :cond_3

    move v3, v4

    :cond_3
    iput-boolean v3, v0, Landroid/support/v7/widget/ActionMenuView$c;->d:Z

    iput v1, v0, Landroid/support/v7/widget/ActionMenuView$c;->b:I

    mul-int v0, v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p0, v0, v6}, Landroid/view/View;->measure(II)V

    return v1

    :cond_4
    const/4 v1, 0x0

    goto :goto_0

    :cond_5
    move v5, v3

    goto :goto_1

    :cond_6
    move v1, v3

    goto :goto_2
.end method

.method private c(II)V
    .locals 33

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v22

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v18

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingTop()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingBottom()I

    move-result v9

    add-int v17, v8, v9

    const/4 v8, -0x2

    move/from16 v0, p2

    move/from16 v1, v17

    invoke-static {v0, v1, v8}, Landroid/support/v7/widget/ActionMenuView;->getChildMeasureSpec(III)I

    move-result v23

    add-int/2addr v6, v7

    sub-int v24, v5, v6

    move-object/from16 v0, p0

    iget v5, v0, Landroid/support/v7/widget/ActionMenuView;->k:I

    div-int v13, v24, v5

    move-object/from16 v0, p0

    iget v5, v0, Landroid/support/v7/widget/ActionMenuView;->k:I

    if-nez v13, :cond_0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1, v5}, Landroid/support/v7/widget/ActionMenuView;->setMeasuredDimension(II)V

    :goto_0
    return-void

    :cond_0
    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v7/widget/ActionMenuView;->k:I

    rem-int v5, v24, v5

    div-int/2addr v5, v13

    add-int v25, v6, v5

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const-wide/16 v8, 0x0

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I

    move-result v26

    const/4 v5, 0x0

    move/from16 v16, v5

    :goto_1
    move/from16 v0, v16

    move/from16 v1, v26

    if-ge v0, v1, :cond_7

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v15, 0x8

    if-ne v5, v15, :cond_1

    move v7, v10

    move v10, v13

    move/from16 v31, v11

    move v11, v14

    move/from16 v32, v12

    move v12, v6

    move-wide v5, v8

    move/from16 v8, v31

    move/from16 v9, v32

    :goto_2
    add-int/lit8 v13, v16, 0x1

    move/from16 v16, v13

    move v14, v11

    move v11, v8

    move v13, v10

    move v10, v7

    move/from16 v31, v12

    move v12, v9

    move-wide v8, v5

    move/from16 v6, v31

    goto :goto_1

    :cond_1
    instance-of v0, v7, Landroid/support/v7/view/menu/ActionMenuItemView;

    move/from16 v19, v0

    add-int/lit8 v15, v6, 0x1

    if-eqz v19, :cond_2

    move-object/from16 v0, p0

    iget v5, v0, Landroid/support/v7/widget/ActionMenuView;->l:I

    const/4 v6, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/widget/ActionMenuView;->l:I

    move/from16 v20, v0

    const/16 v21, 0x0

    move/from16 v0, v20

    move/from16 v1, v21

    invoke-virtual {v7, v5, v6, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    :cond_2
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/support/v7/widget/ActionMenuView$c;

    const/4 v6, 0x0

    iput-boolean v6, v5, Landroid/support/v7/widget/ActionMenuView$c;->f:Z

    const/4 v6, 0x0

    iput v6, v5, Landroid/support/v7/widget/ActionMenuView$c;->c:I

    const/4 v6, 0x0

    iput v6, v5, Landroid/support/v7/widget/ActionMenuView$c;->b:I

    const/4 v6, 0x0

    iput-boolean v6, v5, Landroid/support/v7/widget/ActionMenuView$c;->d:Z

    const/4 v6, 0x0

    iput v6, v5, Landroid/support/v7/widget/ActionMenuView$c;->leftMargin:I

    const/4 v6, 0x0

    iput v6, v5, Landroid/support/v7/widget/ActionMenuView$c;->rightMargin:I

    if-eqz v19, :cond_5

    move-object v6, v7

    check-cast v6, Landroid/support/v7/view/menu/ActionMenuItemView;

    invoke-virtual {v6}, Landroid/support/v7/view/menu/ActionMenuItemView;->b()Z

    move-result v6

    if-eqz v6, :cond_5

    const/4 v6, 0x1

    :goto_3
    iput-boolean v6, v5, Landroid/support/v7/widget/ActionMenuView$c;->e:Z

    iget-boolean v6, v5, Landroid/support/v7/widget/ActionMenuView$c;->a:Z

    if-eqz v6, :cond_6

    const/4 v6, 0x1

    :goto_4
    move/from16 v0, v25

    move/from16 v1, v23

    move/from16 v2, v17

    invoke-static {v7, v0, v6, v1, v2}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/View;IIII)I

    move-result v6

    invoke-static {v14, v6}, Ljava/lang/Math;->max(II)I

    move-result v14

    iget-boolean v0, v5, Landroid/support/v7/widget/ActionMenuView$c;->d:Z

    move/from16 v19, v0

    if-eqz v19, :cond_3

    add-int/lit8 v10, v10, 0x1

    :cond_3
    iget-boolean v5, v5, Landroid/support/v7/widget/ActionMenuView$c;->a:Z

    if-eqz v5, :cond_4

    const/4 v11, 0x1

    :cond_4
    sub-int/2addr v13, v6

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    move-result v7

    const/4 v5, 0x1

    if-ne v6, v5, :cond_22

    const/4 v5, 0x1

    shl-int v5, v5, v16

    int-to-long v5, v5

    or-long/2addr v5, v8

    move v8, v11

    move v9, v7

    move v12, v15

    move v11, v14

    move v7, v10

    move v10, v13

    goto/16 :goto_2

    :cond_5
    const/4 v6, 0x0

    goto :goto_3

    :cond_6
    move v6, v13

    goto :goto_4

    :cond_7
    if-eqz v11, :cond_8

    const/4 v5, 0x2

    if-ne v6, v5, :cond_8

    const/4 v5, 0x1

    move v7, v5

    :goto_5
    const/16 v16, 0x0

    move-wide/from16 v19, v8

    move/from16 v17, v13

    :goto_6
    if-lez v10, :cond_21

    if-lez v17, :cond_21

    const v13, 0x7fffffff

    const-wide/16 v8, 0x0

    const/4 v15, 0x0

    const/4 v5, 0x0

    move/from16 v21, v5

    :goto_7
    move/from16 v0, v21

    move/from16 v1, v26

    if-ge v0, v1, :cond_b

    move-object/from16 v0, p0

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/support/v7/widget/ActionMenuView$c;

    iget-boolean v0, v5, Landroid/support/v7/widget/ActionMenuView$c;->d:Z

    move/from16 v27, v0

    if-nez v27, :cond_9

    move v5, v13

    move v13, v15

    :goto_8
    add-int/lit8 v15, v21, 0x1

    move/from16 v21, v15

    move v15, v13

    move v13, v5

    goto :goto_7

    :cond_8
    const/4 v5, 0x0

    move v7, v5

    goto :goto_5

    :cond_9
    iget v0, v5, Landroid/support/v7/widget/ActionMenuView$c;->b:I

    move/from16 v27, v0

    move/from16 v0, v27

    if-ge v0, v13, :cond_a

    iget v5, v5, Landroid/support/v7/widget/ActionMenuView$c;->b:I

    const/4 v8, 0x1

    shl-int v8, v8, v21

    int-to-long v8, v8

    const/4 v13, 0x1

    goto :goto_8

    :cond_a
    iget v5, v5, Landroid/support/v7/widget/ActionMenuView$c;->b:I

    if-ne v5, v13, :cond_20

    const/4 v5, 0x1

    shl-int v5, v5, v21

    int-to-long v0, v5

    move-wide/from16 v27, v0

    or-long v8, v8, v27

    add-int/lit8 v5, v15, 0x1

    move/from16 v31, v13

    move v13, v5

    move/from16 v5, v31

    goto :goto_8

    :cond_b
    or-long v19, v19, v8

    move/from16 v0, v17

    if-le v15, v0, :cond_e

    move-wide/from16 v9, v19

    :goto_9
    if-nez v11, :cond_12

    const/4 v5, 0x1

    if-ne v6, v5, :cond_12

    const/4 v5, 0x1

    :goto_a
    if-lez v17, :cond_1a

    const-wide/16 v7, 0x0

    cmp-long v7, v9, v7

    if-eqz v7, :cond_1a

    add-int/lit8 v6, v6, -0x1

    move/from16 v0, v17

    if-lt v0, v6, :cond_c

    if-nez v5, :cond_c

    const/4 v6, 0x1

    if-le v14, v6, :cond_1a

    :cond_c
    invoke-static {v9, v10}, Ljava/lang/Long;->bitCount(J)I

    move-result v6

    int-to-float v6, v6

    if-nez v5, :cond_23

    const-wide/16 v7, 0x1

    and-long/2addr v7, v9

    const-wide/16 v13, 0x0

    cmp-long v5, v7, v13

    if-eqz v5, :cond_d

    const/4 v5, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/support/v7/widget/ActionMenuView$c;

    iget-boolean v5, v5, Landroid/support/v7/widget/ActionMenuView$c;->e:Z

    if-nez v5, :cond_d

    const/high16 v5, 0x3f000000    # 0.5f

    sub-float/2addr v6, v5

    :cond_d
    const/4 v5, 0x1

    add-int/lit8 v7, v26, -0x1

    shl-int/2addr v5, v7

    int-to-long v7, v5

    and-long/2addr v7, v9

    const-wide/16 v13, 0x0

    cmp-long v5, v7, v13

    if-eqz v5, :cond_23

    add-int/lit8 v5, v26, -0x1

    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/support/v7/widget/ActionMenuView$c;

    iget-boolean v5, v5, Landroid/support/v7/widget/ActionMenuView$c;->e:Z

    if-nez v5, :cond_23

    const/high16 v5, 0x3f000000    # 0.5f

    sub-float v5, v6, v5

    :goto_b
    const/4 v6, 0x0

    cmpl-float v6, v5, v6

    if-lez v6, :cond_13

    mul-int v6, v17, v25

    int-to-float v6, v6

    div-float v5, v6, v5

    float-to-int v5, v5

    move v6, v5

    :goto_c
    const/4 v5, 0x0

    move v8, v5

    move/from16 v7, v16

    :goto_d
    move/from16 v0, v26

    if-ge v8, v0, :cond_1b

    const/4 v5, 0x1

    shl-int/2addr v5, v8

    int-to-long v13, v5

    and-long/2addr v13, v9

    const-wide/16 v15, 0x0

    cmp-long v5, v13, v15

    if-nez v5, :cond_14

    move v5, v7

    :goto_e
    add-int/lit8 v7, v8, 0x1

    move v8, v7

    move v7, v5

    goto :goto_d

    :cond_e
    const/4 v5, 0x0

    move-wide/from16 v15, v19

    move/from16 v19, v5

    :goto_f
    move/from16 v0, v19

    move/from16 v1, v26

    if-ge v0, v1, :cond_11

    move-object/from16 v0, p0

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/support/v7/widget/ActionMenuView$c;

    const/16 v21, 0x1

    shl-int v21, v21, v19

    move/from16 v0, v21

    int-to-long v0, v0

    move-wide/from16 v27, v0

    and-long v27, v27, v8

    const-wide/16 v29, 0x0

    cmp-long v21, v27, v29

    if-nez v21, :cond_f

    iget v5, v5, Landroid/support/v7/widget/ActionMenuView$c;->b:I

    add-int/lit8 v20, v13, 0x1

    move/from16 v0, v20

    if-ne v5, v0, :cond_1f

    const/4 v5, 0x1

    shl-int v5, v5, v19

    int-to-long v0, v5

    move-wide/from16 v20, v0

    or-long v15, v15, v20

    move/from16 v5, v17

    :goto_10
    add-int/lit8 v17, v19, 0x1

    move/from16 v19, v17

    move/from16 v17, v5

    goto :goto_f

    :cond_f
    if-eqz v7, :cond_10

    iget-boolean v0, v5, Landroid/support/v7/widget/ActionMenuView$c;->e:Z

    move/from16 v21, v0

    if-eqz v21, :cond_10

    const/16 v21, 0x1

    move/from16 v0, v17

    move/from16 v1, v21

    if-ne v0, v1, :cond_10

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/widget/ActionMenuView;->l:I

    move/from16 v21, v0

    add-int v21, v21, v25

    const/16 v27, 0x0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/widget/ActionMenuView;->l:I

    move/from16 v28, v0

    const/16 v29, 0x0

    move-object/from16 v0, v20

    move/from16 v1, v21

    move/from16 v2, v27

    move/from16 v3, v28

    move/from16 v4, v29

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    :cond_10
    iget v0, v5, Landroid/support/v7/widget/ActionMenuView$c;->b:I

    move/from16 v20, v0

    add-int/lit8 v20, v20, 0x1

    move/from16 v0, v20

    iput v0, v5, Landroid/support/v7/widget/ActionMenuView$c;->b:I

    const/16 v20, 0x1

    move/from16 v0, v20

    iput-boolean v0, v5, Landroid/support/v7/widget/ActionMenuView$c;->f:Z

    add-int/lit8 v5, v17, -0x1

    goto :goto_10

    :cond_11
    const/4 v5, 0x1

    move-wide/from16 v19, v15

    move/from16 v16, v5

    goto/16 :goto_6

    :cond_12
    const/4 v5, 0x0

    goto/16 :goto_a

    :cond_13
    const/4 v5, 0x0

    move v6, v5

    goto/16 :goto_c

    :cond_14
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/support/v7/widget/ActionMenuView$c;

    instance-of v11, v11, Landroid/support/v7/view/menu/ActionMenuItemView;

    if-eqz v11, :cond_16

    iput v6, v5, Landroid/support/v7/widget/ActionMenuView$c;->c:I

    const/4 v7, 0x1

    iput-boolean v7, v5, Landroid/support/v7/widget/ActionMenuView$c;->f:Z

    if-nez v8, :cond_15

    iget-boolean v7, v5, Landroid/support/v7/widget/ActionMenuView$c;->e:Z

    if-nez v7, :cond_15

    neg-int v7, v6

    div-int/lit8 v7, v7, 0x2

    iput v7, v5, Landroid/support/v7/widget/ActionMenuView$c;->leftMargin:I

    :cond_15
    const/4 v5, 0x1

    goto/16 :goto_e

    :cond_16
    iget-boolean v11, v5, Landroid/support/v7/widget/ActionMenuView$c;->a:Z

    if-eqz v11, :cond_17

    iput v6, v5, Landroid/support/v7/widget/ActionMenuView$c;->c:I

    const/4 v7, 0x1

    iput-boolean v7, v5, Landroid/support/v7/widget/ActionMenuView$c;->f:Z

    neg-int v7, v6

    div-int/lit8 v7, v7, 0x2

    iput v7, v5, Landroid/support/v7/widget/ActionMenuView$c;->rightMargin:I

    const/4 v5, 0x1

    goto/16 :goto_e

    :cond_17
    if-eqz v8, :cond_18

    div-int/lit8 v11, v6, 0x2

    iput v11, v5, Landroid/support/v7/widget/ActionMenuView$c;->leftMargin:I

    :cond_18
    add-int/lit8 v11, v26, -0x1

    if-eq v8, v11, :cond_19

    div-int/lit8 v11, v6, 0x2

    iput v11, v5, Landroid/support/v7/widget/ActionMenuView$c;->rightMargin:I

    :cond_19
    move v5, v7

    goto/16 :goto_e

    :cond_1a
    move/from16 v7, v16

    :cond_1b
    if-eqz v7, :cond_1d

    const/4 v5, 0x0

    move v6, v5

    :goto_11
    move/from16 v0, v26

    if-ge v6, v0, :cond_1d

    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/support/v7/widget/ActionMenuView$c;

    iget-boolean v8, v5, Landroid/support/v7/widget/ActionMenuView$c;->f:Z

    if-nez v8, :cond_1c

    :goto_12
    add-int/lit8 v5, v6, 0x1

    move v6, v5

    goto :goto_11

    :cond_1c
    iget v8, v5, Landroid/support/v7/widget/ActionMenuView$c;->b:I

    iget v5, v5, Landroid/support/v7/widget/ActionMenuView$c;->c:I

    mul-int v8, v8, v25

    add-int/2addr v5, v8

    const/high16 v8, 0x40000000    # 2.0f

    invoke-static {v5, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    move/from16 v0, v23

    invoke-virtual {v7, v5, v0}, Landroid/view/View;->measure(II)V

    goto :goto_12

    :cond_1d
    const/high16 v5, 0x40000000    # 2.0f

    move/from16 v0, v22

    if-eq v0, v5, :cond_1e

    :goto_13
    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1, v12}, Landroid/support/v7/widget/ActionMenuView;->setMeasuredDimension(II)V

    goto/16 :goto_0

    :cond_1e
    move/from16 v12, v18

    goto :goto_13

    :cond_1f
    move/from16 v5, v17

    goto/16 :goto_10

    :cond_20
    move v5, v13

    move v13, v15

    goto/16 :goto_8

    :cond_21
    move-wide/from16 v9, v19

    goto/16 :goto_9

    :cond_22
    move-wide v5, v8

    move v12, v15

    move v8, v11

    move v9, v7

    move v11, v14

    move v7, v10

    move v10, v13

    goto/16 :goto_2

    :cond_23
    move v5, v6

    goto/16 :goto_b
.end method


# virtual methods
.method protected a()Landroid/support/v7/widget/ActionMenuView$c;
    .locals 2

    const/4 v1, -0x2

    new-instance v0, Landroid/support/v7/widget/ActionMenuView$c;

    invoke-direct {v0, v1, v1}, Landroid/support/v7/widget/ActionMenuView$c;-><init>(II)V

    const/16 v1, 0x10

    iput v1, v0, Landroid/support/v7/widget/ActionMenuView$c;->h:I

    return-object v0
.end method

.method public a(Landroid/util/AttributeSet;)Landroid/support/v7/widget/ActionMenuView$c;
    .locals 2

    new-instance v0, Landroid/support/v7/widget/ActionMenuView$c;

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/support/v7/widget/ActionMenuView$c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/ActionMenuView$c;
    .locals 2

    if-eqz p1, :cond_2

    instance-of v0, p1, Landroid/support/v7/widget/ActionMenuView$c;

    if-eqz v0, :cond_1

    new-instance v0, Landroid/support/v7/widget/ActionMenuView$c;

    check-cast p1, Landroid/support/v7/widget/ActionMenuView$c;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/ActionMenuView$c;-><init>(Landroid/support/v7/widget/ActionMenuView$c;)V

    :goto_0
    iget v1, v0, Landroid/support/v7/widget/ActionMenuView$c;->h:I

    if-gtz v1, :cond_0

    const/16 v1, 0x10

    iput v1, v0, Landroid/support/v7/widget/ActionMenuView$c;->h:I

    :cond_0
    :goto_1
    return-object v0

    :cond_1
    new-instance v0, Landroid/support/v7/widget/ActionMenuView$c;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/ActionMenuView$c;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->a()Landroid/support/v7/widget/ActionMenuView$c;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Landroid/support/v7/view/menu/g;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/ActionMenuView;->c:Landroid/support/v7/view/menu/g;

    return-void
.end method

.method public a(Landroid/support/v7/view/menu/m$a;Landroid/support/v7/view/menu/g$a;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/ActionMenuView;->h:Landroid/support/v7/view/menu/m$a;

    iput-object p2, p0, Landroid/support/v7/widget/ActionMenuView;->a:Landroid/support/v7/view/menu/g$a;

    return-void
.end method

.method protected a(I)Z
    .locals 4

    const/4 v2, 0x0

    if-nez p1, :cond_0

    move v0, v2

    :goto_0
    return v0

    :cond_0
    add-int/lit8 v0, p1, -0x1

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I

    move-result v3

    if-ge p1, v3, :cond_1

    instance-of v3, v0, Landroid/support/v7/widget/ActionMenuView$a;

    if-eqz v3, :cond_1

    check-cast v0, Landroid/support/v7/widget/ActionMenuView$a;

    invoke-interface {v0}, Landroid/support/v7/widget/ActionMenuView$a;->d()Z

    move-result v0

    or-int/lit8 v2, v0, 0x0

    :cond_1
    if-lez p1, :cond_2

    instance-of v0, v1, Landroid/support/v7/widget/ActionMenuView$a;

    if-eqz v0, :cond_2

    move-object v0, v1

    check-cast v0, Landroid/support/v7/widget/ActionMenuView$a;

    invoke-interface {v0}, Landroid/support/v7/widget/ActionMenuView$a;->c()Z

    move-result v0

    or-int/2addr v0, v2

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method public a(Landroid/support/v7/view/menu/h;)Z
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Landroid/support/v7/view/menu/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/support/v7/view/menu/g;->a(Landroid/view/MenuItem;I)Z

    move-result v0

    return v0
.end method

.method public b()Landroid/support/v7/widget/ActionMenuView$c;
    .locals 2

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->a()Landroid/support/v7/widget/ActionMenuView$c;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/widget/ActionMenuView$c;->a:Z

    return-object v0
.end method

.method public synthetic b(Landroid/util/AttributeSet;)Landroid/support/v7/widget/w$a;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/util/AttributeSet;)Landroid/support/v7/widget/ActionMenuView$c;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic b(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/w$a;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/ActionMenuView$c;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/support/v7/view/menu/g;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Landroid/support/v7/view/menu/g;

    return-object v0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    if-eqz p1, :cond_0

    instance-of v0, p1, Landroid/support/v7/widget/ActionMenuView$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->f()Z

    :cond_0
    return-void
.end method

.method protected synthetic g()Landroid/support/v7/widget/w$a;
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->a()Landroid/support/v7/widget/ActionMenuView$c;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->a()Landroid/support/v7/widget/ActionMenuView$c;

    move-result-object v0

    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/util/AttributeSet;)Landroid/support/v7/widget/ActionMenuView$c;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/ActionMenuView;->a(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/widget/ActionMenuView$c;

    move-result-object v0

    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 3

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Landroid/support/v7/view/menu/g;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/support/v7/view/menu/g;

    invoke-direct {v1, v0}, Landroid/support/v7/view/menu/g;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->c:Landroid/support/v7/view/menu/g;

    iget-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->c:Landroid/support/v7/view/menu/g;

    new-instance v2, Landroid/support/v7/widget/ActionMenuView$d;

    invoke-direct {v2, p0}, Landroid/support/v7/widget/ActionMenuView$d;-><init>(Landroid/support/v7/widget/ActionMenuView;)V

    invoke-virtual {v1, v2}, Landroid/support/v7/view/menu/g;->a(Landroid/support/v7/view/menu/g$a;)V

    new-instance v1, Landroid/support/v7/widget/d;

    invoke-direct {v1, v0}, Landroid/support/v7/widget/d;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/d;->c(Z)V

    iget-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->h:Landroid/support/v7/view/menu/m$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->h:Landroid/support/v7/view/menu/m$a;

    :goto_0
    invoke-virtual {v1, v0}, Landroid/support/v7/widget/d;->a(Landroid/support/v7/view/menu/m$a;)V

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Landroid/support/v7/view/menu/g;

    iget-object v1, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    iget-object v2, p0, Landroid/support/v7/widget/ActionMenuView;->d:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/view/menu/g;->a(Landroid/support/v7/view/menu/m;Landroid/content/Context;)V

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/d;->a(Landroid/support/v7/widget/ActionMenuView;)V

    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Landroid/support/v7/view/menu/g;

    return-object v0

    :cond_1
    new-instance v0, Landroid/support/v7/widget/ActionMenuView$b;

    invoke-direct {v0}, Landroid/support/v7/widget/ActionMenuView$b;-><init>()V

    goto :goto_0
.end method

.method public getOverflowIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->c()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getPopupTheme()I
    .locals 1

    iget v0, p0, Landroid/support/v7/widget/ActionMenuView;->e:I

    return v0
.end method

.method public getWindowAnimations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/support/v7/widget/w;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/d;->b(Z)V

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->e()Z

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0}, Landroid/support/v7/widget/d;->d()Z

    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/support/v7/widget/w;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->f()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 17

    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroid/support/v7/widget/ActionMenuView;->i:Z

    if-nez v1, :cond_1

    invoke-super/range {p0 .. p5}, Landroid/support/v7/widget/w;->onLayout(ZIIII)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I

    move-result v8

    sub-int v1, p5, p3

    div-int/lit8 v9, v1, 0x2

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getDividerWidth()I

    move-result v10

    const/4 v2, 0x0

    const/4 v4, 0x0

    sub-int v1, p4, p2

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I

    move-result v3

    sub-int/2addr v1, v3

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I

    move-result v3

    sub-int v3, v1, v3

    const/4 v5, 0x0

    invoke-static/range {p0 .. p0}, Landroid/support/v7/widget/aq;->a(Landroid/view/View;)Z

    move-result v11

    const/4 v1, 0x0

    move v7, v1

    :goto_1
    if-ge v7, v8, :cond_7

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v6, 0x8

    if-ne v1, v6, :cond_2

    move v1, v2

    move v2, v3

    move v3, v4

    move v4, v5

    :goto_2
    add-int/lit8 v5, v7, 0x1

    move v7, v5

    move v5, v4

    move v4, v3

    move v3, v2

    move v2, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/ActionMenuView$c;

    iget-boolean v6, v1, Landroid/support/v7/widget/ActionMenuView$c;->a:Z

    if-eqz v6, :cond_5

    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Landroid/support/v7/widget/ActionMenuView;->a(I)Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/2addr v5, v10

    :cond_3
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    if-eqz v11, :cond_4

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I

    move-result v6

    iget v1, v1, Landroid/support/v7/widget/ActionMenuView$c;->leftMargin:I

    add-int/2addr v1, v6

    add-int v6, v1, v5

    :goto_3
    div-int/lit8 v14, v13, 0x2

    sub-int v14, v9, v14

    add-int/2addr v13, v14

    invoke-virtual {v12, v1, v14, v6, v13}, Landroid/view/View;->layout(IIII)V

    sub-int v1, v3, v5

    const/4 v3, 0x1

    move v15, v2

    move v2, v1

    move v1, v15

    move/from16 v16, v4

    move v4, v3

    move/from16 v3, v16

    goto :goto_2

    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getWidth()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I

    move-result v14

    sub-int/2addr v6, v14

    iget v1, v1, Landroid/support/v7/widget/ActionMenuView$c;->rightMargin:I

    sub-int/2addr v6, v1

    sub-int v1, v6, v5

    goto :goto_3

    :cond_5
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    iget v12, v1, Landroid/support/v7/widget/ActionMenuView$c;->leftMargin:I

    add-int/2addr v6, v12

    iget v1, v1, Landroid/support/v7/widget/ActionMenuView$c;->rightMargin:I

    add-int/2addr v6, v1

    add-int v1, v2, v6

    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Landroid/support/v7/widget/ActionMenuView;->a(I)Z

    move-result v2

    if-eqz v2, :cond_6

    add-int/2addr v1, v10

    :cond_6
    sub-int v2, v3, v6

    add-int/lit8 v3, v4, 0x1

    move v4, v5

    goto :goto_2

    :cond_7
    const/4 v1, 0x1

    if-ne v8, v1, :cond_8

    if-nez v5, :cond_8

    const/4 v1, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    sub-int v4, p4, p2

    div-int/lit8 v4, v4, 0x2

    div-int/lit8 v5, v2, 0x2

    sub-int/2addr v4, v5

    div-int/lit8 v5, v3, 0x2

    sub-int v5, v9, v5

    add-int/2addr v2, v4

    add-int/2addr v3, v5

    invoke-virtual {v1, v4, v5, v2, v3}, Landroid/view/View;->layout(IIII)V

    goto/16 :goto_0

    :cond_8
    if-eqz v5, :cond_9

    const/4 v1, 0x0

    :goto_4
    sub-int v1, v4, v1

    if-lez v1, :cond_a

    div-int v1, v3, v1

    :goto_5
    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-eqz v11, :cond_c

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingRight()I

    move-result v2

    sub-int v2, v1, v2

    const/4 v1, 0x0

    move v3, v1

    :goto_6
    if-ge v3, v8, :cond_0

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/ActionMenuView$c;

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v7, 0x8

    if-eq v6, v7, :cond_f

    iget-boolean v6, v1, Landroid/support/v7/widget/ActionMenuView$c;->a:Z

    if-eqz v6, :cond_b

    move v1, v2

    :goto_7
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v1

    goto :goto_6

    :cond_9
    const/4 v1, 0x1

    goto :goto_4

    :cond_a
    const/4 v1, 0x0

    goto :goto_5

    :cond_b
    iget v6, v1, Landroid/support/v7/widget/ActionMenuView$c;->rightMargin:I

    sub-int/2addr v2, v6

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    div-int/lit8 v10, v7, 0x2

    sub-int v10, v9, v10

    sub-int v11, v2, v6

    add-int/2addr v7, v10

    invoke-virtual {v5, v11, v10, v2, v7}, Landroid/view/View;->layout(IIII)V

    iget v1, v1, Landroid/support/v7/widget/ActionMenuView$c;->leftMargin:I

    add-int/2addr v1, v6

    add-int/2addr v1, v4

    sub-int v1, v2, v1

    goto :goto_7

    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/widget/ActionMenuView;->getPaddingLeft()I

    move-result v2

    const/4 v1, 0x0

    move v3, v1

    :goto_8
    if-ge v3, v8, :cond_0

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/ActionMenuView$c;

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v7, 0x8

    if-eq v6, v7, :cond_e

    iget-boolean v6, v1, Landroid/support/v7/widget/ActionMenuView$c;->a:Z

    if-eqz v6, :cond_d

    move v1, v2

    :goto_9
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v1

    goto :goto_8

    :cond_d
    iget v6, v1, Landroid/support/v7/widget/ActionMenuView$c;->leftMargin:I

    add-int/2addr v2, v6

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    div-int/lit8 v10, v7, 0x2

    sub-int v10, v9, v10

    add-int v11, v2, v6

    add-int/2addr v7, v10

    invoke-virtual {v5, v2, v10, v11, v7}, Landroid/view/View;->layout(IIII)V

    iget v1, v1, Landroid/support/v7/widget/ActionMenuView$c;->rightMargin:I

    add-int/2addr v1, v6

    add-int/2addr v1, v4

    add-int/2addr v1, v2

    goto :goto_9

    :cond_e
    move v1, v2

    goto :goto_9

    :cond_f
    move v1, v2

    goto :goto_7
.end method

.method protected onMeasure(II)V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-boolean v3, p0, Landroid/support/v7/widget/ActionMenuView;->i:Z

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v4, 0x40000000    # 2.0f

    if-ne v0, v4, :cond_2

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Landroid/support/v7/widget/ActionMenuView;->i:Z

    iget-boolean v0, p0, Landroid/support/v7/widget/ActionMenuView;->i:Z

    if-eq v3, v0, :cond_0

    iput v2, p0, Landroid/support/v7/widget/ActionMenuView;->j:I

    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iget-boolean v3, p0, Landroid/support/v7/widget/ActionMenuView;->i:Z

    if-eqz v3, :cond_1

    iget-object v3, p0, Landroid/support/v7/widget/ActionMenuView;->c:Landroid/support/v7/view/menu/g;

    if-eqz v3, :cond_1

    iget v3, p0, Landroid/support/v7/widget/ActionMenuView;->j:I

    if-eq v0, v3, :cond_1

    iput v0, p0, Landroid/support/v7/widget/ActionMenuView;->j:I

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->c:Landroid/support/v7/view/menu/g;

    invoke-virtual {v0, v1}, Landroid/support/v7/view/menu/g;->b(Z)V

    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getChildCount()I

    move-result v3

    iget-boolean v0, p0, Landroid/support/v7/widget/ActionMenuView;->i:Z

    if-eqz v0, :cond_3

    if-lez v3, :cond_3

    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/ActionMenuView;->c(II)V

    :goto_1
    return-void

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_2
    if-ge v1, v3, :cond_4

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/ActionMenuView$c;

    iput v2, v0, Landroid/support/v7/widget/ActionMenuView$c;->rightMargin:I

    iput v2, v0, Landroid/support/v7/widget/ActionMenuView$c;->leftMargin:I

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_4
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/w;->onMeasure(II)V

    goto :goto_1
.end method

.method public setExpandedActionViewsExclusive(Z)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/d;->d(Z)V

    return-void
.end method

.method public setOnMenuItemClickListener(Landroid/support/v7/widget/ActionMenuView$e;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/ActionMenuView;->b:Landroid/support/v7/widget/ActionMenuView$e;

    return-void
.end method

.method public setOverflowIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/d;->a(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setOverflowReserved(Z)V
    .locals 0

    iput-boolean p1, p0, Landroid/support/v7/widget/ActionMenuView;->f:Z

    return-void
.end method

.method public setPopupTheme(I)V
    .locals 2

    iget v0, p0, Landroid/support/v7/widget/ActionMenuView;->e:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Landroid/support/v7/widget/ActionMenuView;->e:I

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->d:Landroid/content/Context;

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/support/v7/widget/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->d:Landroid/content/Context;

    goto :goto_0
.end method

.method public setPresenter(Landroid/support/v7/widget/d;)V
    .locals 1

    iput-object p1, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    iget-object v0, p0, Landroid/support/v7/widget/ActionMenuView;->g:Landroid/support/v7/widget/d;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/d;->a(Landroid/support/v7/widget/ActionMenuView;)V

    return-void
.end method
