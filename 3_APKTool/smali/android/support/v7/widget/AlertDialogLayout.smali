.class public Landroid/support/v7/widget/AlertDialogLayout;
.super Landroid/support/v7/widget/w;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/widget/w;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/w;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private a(Landroid/view/View;IIII)V
    .locals 2

    add-int v0, p2, p4

    add-int v1, p3, p5

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private static c(Landroid/view/View;)I
    .locals 3

    const/4 v0, 0x0

    invoke-static {p0}, Landroid/support/v4/h/n;->c(Landroid/view/View;)I

    move-result v1

    if-lez v1, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/AlertDialogLayout;->c(Landroid/view/View;)I

    move-result v0

    goto :goto_0
.end method

.method private c(II)Z
    .locals 13

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getChildCount()I

    move-result v8

    const/4 v1, 0x0

    const/4 v0, 0x0

    move v4, v1

    :goto_0
    if-ge v4, v8, :cond_6

    invoke-virtual {p0, v4}, Landroid/support/v7/widget/AlertDialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_0

    move-object v1, v2

    move-object v2, v3

    :goto_1
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    move-object v3, v2

    move-object v2, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v5

    sget v6, Landroid/support/v7/a/a$f;->topPanel:I

    if-ne v5, v6, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    sget v6, Landroid/support/v7/a/a$f;->buttonPanel:I

    if-ne v5, v6, :cond_2

    move-object v12, v2

    move-object v2, v1

    move-object v1, v12

    goto :goto_1

    :cond_2
    sget v6, Landroid/support/v7/a/a$f;->contentPanel:I

    if-eq v5, v6, :cond_3

    sget v6, Landroid/support/v7/a/a$f;->customPanel:I

    if-ne v5, v6, :cond_5

    :cond_3
    if-eqz v0, :cond_4

    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_4
    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    goto :goto_2

    :cond_6
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v9

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v10

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    const/4 v5, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingBottom()I

    move-result v4

    add-int v6, v4, v1

    if-eqz v2, :cond_7

    const/4 v1, 0x0

    invoke-virtual {v2, p1, v1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v6, v1

    const/4 v1, 0x0

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    invoke-static {v1, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v5

    :cond_7
    const/4 v2, 0x0

    if-eqz v3, :cond_f

    const/4 v1, 0x0

    invoke-virtual {v3, p1, v1}, Landroid/view/View;->measure(II)V

    invoke-static {v3}, Landroid/support/v7/widget/AlertDialogLayout;->c(Landroid/view/View;)I

    move-result v2

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v6, v2

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I

    move-result v4

    invoke-static {v5, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v5

    sub-int/2addr v1, v2

    move v4, v1

    :goto_3
    if-eqz v0, :cond_e

    if-nez v9, :cond_a

    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, p1, v1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v6, v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredState()I

    move-result v7

    invoke-static {v5, v7}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v5

    move v7, v1

    :goto_5
    sub-int v1, v10, v6

    if-eqz v3, :cond_d

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v10

    if-lez v10, :cond_10

    sub-int v4, v1, v10

    add-int v1, v2, v10

    :goto_6
    const/high16 v10, 0x40000000    # 2.0f

    invoke-static {v1, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v3, p1, v1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredState()I

    move-result v1

    invoke-static {v5, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v1

    sub-int v2, v6, v2

    add-int/2addr v2, v10

    :goto_7
    if-eqz v0, :cond_8

    if-lez v4, :cond_8

    add-int v3, v4, v7

    invoke-static {v3, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v0, p1, v3}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredState()I

    move-result v0

    invoke-static {v1, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v0

    sub-int v1, v2, v7

    add-int/2addr v1, v3

    move v2, v1

    move v1, v0

    :cond_8
    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_8
    if-ge v3, v8, :cond_b

    invoke-virtual {p0, v3}, Landroid/support/v7/widget/AlertDialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_9

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_a
    const/4 v1, 0x0

    sub-int v7, v10, v6

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v1, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    goto :goto_4

    :cond_b
    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v0, v3

    invoke-static {v0, p1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v2, p2, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/support/v7/widget/AlertDialogLayout;->setMeasuredDimension(II)V

    const/high16 v0, 0x40000000    # 2.0f

    if-eq v11, v0, :cond_c

    invoke-direct {p0, v8, p2}, Landroid/support/v7/widget/AlertDialogLayout;->d(II)V

    :cond_c
    const/4 v0, 0x1

    goto/16 :goto_2

    :cond_d
    move v4, v1

    move v2, v6

    move v1, v5

    goto :goto_7

    :cond_e
    const/4 v1, 0x0

    move v7, v1

    goto/16 :goto_5

    :cond_f
    const/4 v1, 0x0

    move v4, v1

    goto/16 :goto_3

    :cond_10
    move v4, v1

    move v1, v2

    goto/16 :goto_6
.end method

.method private d(II)V
    .locals 9

    const/4 v3, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getMeasuredWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    move v7, v3

    :goto_0
    if-ge v7, p1, :cond_1

    invoke-virtual {p0, v7}, Landroid/support/v7/widget/AlertDialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v4, 0x8

    if-eq v0, v4, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/support/v7/widget/w$a;

    iget v0, v6, Landroid/support/v7/widget/w$a;->width:I

    const/4 v4, -0x1

    if-ne v0, v4, :cond_0

    iget v8, v6, Landroid/support/v7/widget/w$a;->height:I

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, v6, Landroid/support/v7/widget/w$a;->height:I

    move-object v0, p0

    move v4, p2

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/AlertDialogLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    iput v8, v6, Landroid/support/v7/widget/w$a;->height:I

    :cond_0
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 15

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingLeft()I

    move-result v9

    sub-int v10, p4, p2

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingRight()I

    move-result v11

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingRight()I

    move-result v12

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getChildCount()I

    move-result v13

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getGravity()I

    move-result v14

    and-int/lit8 v1, v14, 0x70

    sparse-switch v1, :sswitch_data_0

    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingTop()I

    move-result v0

    :goto_0
    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getDividerDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    move v7, v1

    :goto_1
    const/4 v1, 0x0

    move v8, v1

    move v3, v0

    :goto_2
    if-ge v8, v13, :cond_4

    invoke-virtual {p0, v8}, Landroid/support/v7/widget/AlertDialogLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-eq v0, v2, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/support/v7/widget/w$a;

    iget v0, v6, Landroid/support/v7/widget/w$a;->h:I

    if-gez v0, :cond_0

    const v0, 0x800007

    and-int/2addr v0, v14

    :cond_0
    invoke-static {p0}, Landroid/support/v4/h/n;->b(Landroid/view/View;)I

    move-result v2

    invoke-static {v0, v2}, Landroid/support/v4/h/d;->a(II)I

    move-result v0

    and-int/lit8 v0, v0, 0x7

    sparse-switch v0, :sswitch_data_1

    iget v0, v6, Landroid/support/v7/widget/w$a;->leftMargin:I

    add-int v2, v9, v0

    :goto_3
    invoke-virtual {p0, v8}, Landroid/support/v7/widget/AlertDialogLayout;->c(I)Z

    move-result v0

    if-eqz v0, :cond_3

    add-int v0, v3, v7

    :goto_4
    iget v3, v6, Landroid/support/v7/widget/w$a;->topMargin:I

    add-int/2addr v3, v0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/widget/AlertDialogLayout;->a(Landroid/view/View;IIII)V

    iget v0, v6, Landroid/support/v7/widget/w$a;->bottomMargin:I

    add-int/2addr v0, v5

    add-int/2addr v3, v0

    :cond_1
    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_2

    :sswitch_0
    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingTop()I

    move-result v1

    add-int v1, v1, p5

    sub-int v1, v1, p3

    sub-int v0, v1, v0

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0}, Landroid/support/v7/widget/AlertDialogLayout;->getPaddingTop()I

    move-result v1

    sub-int v2, p5, p3

    sub-int v0, v2, v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    move v7, v1

    goto :goto_1

    :sswitch_2
    sub-int v0, v10, v9

    sub-int/2addr v0, v12

    sub-int/2addr v0, v4

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v9

    iget v2, v6, Landroid/support/v7/widget/w$a;->leftMargin:I

    add-int/2addr v0, v2

    iget v2, v6, Landroid/support/v7/widget/w$a;->rightMargin:I

    sub-int v2, v0, v2

    goto :goto_3

    :sswitch_3
    sub-int v0, v10, v11

    sub-int/2addr v0, v4

    iget v2, v6, Landroid/support/v7/widget/w$a;->rightMargin:I

    sub-int v2, v0, v2

    goto :goto_3

    :cond_3
    move v0, v3

    goto :goto_4

    :cond_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x50 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x1 -> :sswitch_2
        0x5 -> :sswitch_3
    .end sparse-switch
.end method

.method protected onMeasure(II)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/AlertDialogLayout;->c(II)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/w;->onMeasure(II)V

    :cond_0
    return-void
.end method
