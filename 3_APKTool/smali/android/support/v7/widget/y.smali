.class public Landroid/support/v7/widget/y;
.super Landroid/widget/ListView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/y$a;
    }
.end annotation


# static fields
.field private static final g:[I


# instance fields
.field final a:Landroid/graphics/Rect;

.field b:I

.field c:I

.field d:I

.field e:I

.field protected f:I

.field private h:Ljava/lang/reflect/Field;

.field private i:Landroid/support/v7/widget/y$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x1

    new-array v0, v0, [I

    aput v1, v0, v1

    sput-object v0, Landroid/support/v7/widget/y;->g:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/y;->a:Landroid/graphics/Rect;

    iput v1, p0, Landroid/support/v7/widget/y;->b:I

    iput v1, p0, Landroid/support/v7/widget/y;->c:I

    iput v1, p0, Landroid/support/v7/widget/y;->d:I

    iput v1, p0, Landroid/support/v7/widget/y;->e:I

    :try_start_0
    const-class v0, Landroid/widget/AbsListView;

    const-string v1, "mIsChildViewEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/y;->h:Ljava/lang/reflect/Field;

    iget-object v0, p0, Landroid/support/v7/widget/y;->h:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NoSuchFieldException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public a(IIIII)I
    .locals 10

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getListPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getListPaddingBottom()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getListPaddingLeft()I

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getListPaddingRight()I

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getDividerHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getDivider()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v7

    if-nez v7, :cond_1

    add-int p4, v1, v2

    :cond_0
    :goto_0
    return p4

    :cond_1
    add-int v4, v2, v1

    if-lez v0, :cond_3

    if-eqz v3, :cond_3

    :goto_1
    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-interface {v7}, Landroid/widget/ListAdapter;->getCount()I

    move-result v8

    const/4 v2, 0x0

    move v6, v2

    move v2, v4

    :goto_2
    if-ge v6, v8, :cond_7

    invoke-interface {v7, v6}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v4

    if-eq v4, v5, :cond_8

    const/4 v1, 0x0

    :goto_3
    invoke-interface {v7, v6, v1, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    iget v9, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v9, :cond_4

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v1, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    :goto_4
    invoke-virtual {v5, p1, v1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v5}, Landroid/view/View;->forceLayout()V

    if-lez v6, :cond_9

    add-int v1, v2, v0

    :goto_5
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v1, v2

    if-lt v1, p4, :cond_5

    if-ltz p5, :cond_0

    if-le v6, p5, :cond_0

    if-lez v3, :cond_0

    if-eq v1, p4, :cond_0

    move p4, v3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    const/4 v9, 0x0

    invoke-static {v1, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    goto :goto_4

    :cond_5
    if-ltz p5, :cond_6

    if-lt v6, p5, :cond_6

    move v3, v1

    :cond_6
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    move v2, v1

    move-object v1, v5

    move v5, v4

    goto :goto_2

    :cond_7
    move p4, v2

    goto :goto_0

    :cond_8
    move v4, v5

    goto :goto_3

    :cond_9
    move v1, v2

    goto :goto_5
.end method

.method protected a(ILandroid/view/View;)V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_2

    const/4 v2, -0x1

    if-eq p1, v2, :cond_2

    move v2, v0

    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {v3, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/y;->b(ILandroid/view/View;)V

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroid/support/v7/widget/y;->a:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v4

    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getVisibility()I

    move-result v5

    if-nez v5, :cond_3

    :goto_1
    invoke-virtual {v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    invoke-static {v3, v4, v2}, Landroid/support/v4/c/a/a;->a(Landroid/graphics/drawable/Drawable;FF)V

    :cond_1
    return-void

    :cond_2
    move v2, v1

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method protected a(ILandroid/view/View;FF)V
    .locals 2

    invoke-virtual {p0, p1, p2}, Landroid/support/v7/widget/y;->a(ILandroid/view/View;)V

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    invoke-static {v0, p3, p4}, Landroid/support/v4/c/a/a;->a(Landroid/graphics/drawable/Drawable;FF)V

    :cond_0
    return-void
.end method

.method protected a(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/y;->a:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/y;->a:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method protected a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected b()V
    .locals 2

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    return-void
.end method

.method protected b(ILandroid/view/View;)V
    .locals 5

    iget-object v0, p0, Landroid/support/v7/widget/y;->a:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, p0, Landroid/support/v7/widget/y;->b:I

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->left:I

    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v2, p0, Landroid/support/v7/widget/y;->c:I

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->top:I

    iget v1, v0, Landroid/graphics/Rect;->right:I

    iget v2, p0, Landroid/support/v7/widget/y;->d:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->right:I

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget v2, p0, Landroid/support/v7/widget/y;->e:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    :try_start_0
    iget-object v0, p0, Landroid/support/v7/widget/y;->h:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p2}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eq v1, v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/widget/y;->h:Ljava/lang/reflect/Field;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->refreshDrawableState()V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_1
.end method

.method protected c()Z
    .locals 1

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/y;->a(Landroid/graphics/Canvas;)V

    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/ListView;->drawableStateChanged()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/y;->setSelectorEnabled(Z)V

    invoke-virtual {p0}, Landroid/support/v7/widget/y;->b()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0, v0, v1}, Landroid/support/v7/widget/y;->pointToPosition(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/y;->f:I

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public setSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    if-eqz p1, :cond_1

    new-instance v0, Landroid/support/v7/widget/y$a;

    invoke-direct {v0, p1}, Landroid/support/v7/widget/y$a;-><init>(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    iput-object v0, p0, Landroid/support/v7/widget/y;->i:Landroid/support/v7/widget/y$a;

    iget-object v0, p0, Landroid/support/v7/widget/y;->i:Landroid/support/v7/widget/y$a;

    invoke-super {p0, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    :cond_0
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iput v1, p0, Landroid/support/v7/widget/y;->b:I

    iget v1, v0, Landroid/graphics/Rect;->top:I

    iput v1, p0, Landroid/support/v7/widget/y;->c:I

    iget v1, v0, Landroid/graphics/Rect;->right:I

    iput v1, p0, Landroid/support/v7/widget/y;->d:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iput v0, p0, Landroid/support/v7/widget/y;->e:I

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected setSelectorEnabled(Z)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/y;->i:Landroid/support/v7/widget/y$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/y;->i:Landroid/support/v7/widget/y$a;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/y$a;->a(Z)V

    :cond_0
    return-void
.end method
