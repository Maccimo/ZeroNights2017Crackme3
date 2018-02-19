.class Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;
.super Ljava/lang/Object;


# direct methods
.method public static ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿([B)Ljava/lang/String;
    .locals 9
    .param p0, "\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff"    # [B

    .prologue
    sget-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    sget v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_3

    aget-byte v2, p0, v0

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->s:I

    and-int/2addr v2, v3

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->j:I

    shl-int/2addr v2, v3

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->w:I

    and-int/2addr v2, v3

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->c:I

    add-int/2addr v3, v0

    array-length v6, p0

    if-ge v3, v6, :cond_0

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->c:I

    add-int/2addr v3, v0

    aget-byte v3, p0, v3

    sget v6, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->s:I

    sget v7, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->h:I

    and-int/2addr v3, v6

    shl-int/2addr v3, v7

    or-int/2addr v2, v3

    :goto_1
    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->d:I

    add-int/2addr v3, v0

    array-length v6, p0

    if-ge v3, v6, :cond_1

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->d:I

    add-int/2addr v3, v0

    aget-byte v3, p0, v3

    sget v6, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->s:I

    and-int/2addr v3, v6

    or-int/2addr v2, v3

    :goto_2
    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    move v8, v3

    move v3, v2

    move v2, v8

    :goto_3
    sget v6, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->f:I

    sub-int/2addr v6, v1

    if-ge v2, v6, :cond_2

    sget v6, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->v:I

    and-int/2addr v6, v3

    sget v7, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->k:I

    shr-int/2addr v6, v7

    aget-char v6, v4, v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget v6, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->g:I

    shl-int/2addr v3, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    sget v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->e:I

    add-int/2addr v0, v2

    goto :goto_0

    :cond_3
    sget v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    :goto_4
    if-ge v0, v1, :cond_4

    sget-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->n:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_4
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff"    # Ljava/lang/String;

    .prologue
    const/16 v3, 0x3d

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    sget v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->c:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v3, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    sget v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->d:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v3, :cond_0

    sget-object p0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->o:Ljava/lang/String;

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    sget v4, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->k:I

    shl-int/2addr v3, v4

    sget-object v4, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->b:Ljava/lang/String;

    sget v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->c:I

    add-int/2addr v5, v0

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    sget v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->i:I

    shl-int/2addr v4, v5

    add-int/2addr v3, v4

    sget-object v4, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->b:Ljava/lang/String;

    sget v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->d:I

    add-int/2addr v5, v0

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    sget v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->g:I

    shl-int/2addr v4, v5

    add-int/2addr v3, v4

    sget-object v4, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->b:Ljava/lang/String;

    sget v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->e:I

    add-int/2addr v5, v0

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    add-int/2addr v3, v4

    sget-object v4, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->j:I

    ushr-int v5, v3, v5

    sget v6, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->s:I

    and-int/2addr v5, v6

    int-to-char v5, v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    sget v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->h:I

    ushr-int v5, v3, v5

    sget v6, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->s:I

    and-int/2addr v5, v6

    int-to-char v5, v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    sget v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->s:I

    and-int/2addr v3, v5

    int-to-char v3, v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->f:I

    add-int/2addr v0, v3

    goto :goto_1

    :cond_0
    sget-object p0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->p:Ljava/lang/String;

    goto/16 :goto_0

    :cond_1
    sget-object p0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:Ljava/lang/String;

    goto/16 :goto_0

    :cond_2
    sget v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v1, v0, v2}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
