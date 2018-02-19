.class Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;


# direct methods
.method constructor <init>(Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;)V
    .locals 0
    .param p1, "arg0"    # Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;

    .prologue
    iput-object p1, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity$1;->a:Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "arg0"    # Landroid/view/View;

    .prologue
    const v3, 0x7f0a0024

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity$1;->a:Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;

    const v1, 0x7f07002e

    invoke-virtual {v0, v1}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    sput-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity$1;->a:Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;

    const v1, 0x7f070060

    invoke-virtual {v0, v1}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    sput-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->b:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity$1;->a:Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;

    invoke-static {v0}, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a(Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;)V

    sget-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->a:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity$1;->a:Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;

    invoke-static {v0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity$1;->a:Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;

    const v1, 0x7f0a0025

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity$1;->a:Lcom/kaspersky/zeronights2017/nightwatcher/MainActivity;

    invoke-static {v0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
