.class Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;
.super Ljava/lang/Object;


# direct methods
.method private static ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff"    # Ljava/lang/String;
    .param p1, "\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff"    # Ljava/lang/String;

    .prologue
    sget v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_0
    sget v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->o:I

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->d:I

    shl-int/2addr v2, v3

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->d:I

    mul-int/2addr v2, v3

    if-ge v0, v2, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    rem-int v3, v0, v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    xor-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->n:I

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->f:I

    shr-int/2addr v2, v3

    add-int/2addr v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff"    # Ljava/lang/String;

    .prologue
    :try_start_0
    sget-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->r:Ljava/lang/String;

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    sget-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->s:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    array-length v0, v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v0, 0x0

    :goto_0
    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->s:Ljava/lang/String;

    invoke-virtual {p0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v3

    array-length v3, v3

    if-ge v0, v3, :cond_0

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->c:Ljava/lang/String;

    sget-object v4, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->s:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    aget-byte v4, v4, v0

    sget v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->f:I

    shr-int/2addr v4, v5

    sget v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:I

    and-int/2addr v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->c:Ljava/lang/String;

    sget-object v5, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->s:Ljava/lang/String;

    invoke-virtual {p0, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v5

    aget-byte v5, v5, v0

    sget v6, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:I

    and-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object p0

    :goto_1
    return-object p0

    :catch_0
    move-exception p0

    :goto_2
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_2
.end method

.method public static ﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff\ufeff"    # Ljava/lang/String;

    .prologue
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->q:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v0, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:I

    :goto_0
    sget v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->p:I

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->d:I

    shl-int/2addr v2, v3

    if-ge v0, v2, :cond_0

    sget v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->f:I

    shl-int v2, v0, v2

    or-int/2addr v2, v0

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->r:I

    mul-int/2addr v3, v0

    shl-int/2addr v2, v3

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->u:I

    rem-int/2addr v2, v3

    sget v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->t:I

    rem-int/2addr v2, v3

    sget-object v3, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->a:Ljava/lang/String;

    sget v4, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->c:I

    add-int/2addr v4, v2

    invoke-virtual {v3, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v2, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->m:I

    add-int/2addr v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/kaspersky/zeronights2017/nightwatcher/﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿;->﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿﻿(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
