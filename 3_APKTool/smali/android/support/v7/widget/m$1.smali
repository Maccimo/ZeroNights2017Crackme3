.class Landroid/support/v7/widget/m$1;
.super Landroid/support/v7/widget/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/widget/m;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/m$b;

.field final synthetic b:Landroid/support/v7/widget/m;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/m;Landroid/view/View;Landroid/support/v7/widget/m$b;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/widget/m$1;->b:Landroid/support/v7/widget/m;

    iput-object p3, p0, Landroid/support/v7/widget/m$1;->a:Landroid/support/v7/widget/m$b;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/v;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/support/v7/view/menu/q;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/m$1;->a:Landroid/support/v7/widget/m$b;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/m$1;->b:Landroid/support/v7/widget/m;

    invoke-static {v0}, Landroid/support/v7/widget/m;->a(Landroid/support/v7/widget/m;)Landroid/support/v7/widget/m$b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/m$b;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/m$1;->b:Landroid/support/v7/widget/m;

    invoke-static {v0}, Landroid/support/v7/widget/m;->a(Landroid/support/v7/widget/m;)Landroid/support/v7/widget/m$b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/m$b;->a()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
