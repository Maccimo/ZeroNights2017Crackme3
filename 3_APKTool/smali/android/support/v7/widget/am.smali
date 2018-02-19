.class public Landroid/support/v7/widget/am;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/am$a;,
        Landroid/support/v7/widget/am$b;,
        Landroid/support/v7/widget/am$c;
    }
.end annotation


# static fields
.field private static final a:Landroid/support/v7/widget/am$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v7/widget/am$a;

    invoke-direct {v0, v2}, Landroid/support/v7/widget/am$a;-><init>(Landroid/support/v7/widget/am$1;)V

    sput-object v0, Landroid/support/v7/widget/am;->a:Landroid/support/v7/widget/am$c;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/v7/widget/am$b;

    invoke-direct {v0, v2}, Landroid/support/v7/widget/am$b;-><init>(Landroid/support/v7/widget/am$1;)V

    sput-object v0, Landroid/support/v7/widget/am;->a:Landroid/support/v7/widget/am$c;

    goto :goto_0
.end method

.method public static a(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 1

    sget-object v0, Landroid/support/v7/widget/am;->a:Landroid/support/v7/widget/am$c;

    invoke-interface {v0, p0, p1}, Landroid/support/v7/widget/am$c;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method
