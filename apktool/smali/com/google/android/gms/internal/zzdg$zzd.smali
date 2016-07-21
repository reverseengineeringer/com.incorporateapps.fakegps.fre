.class Lcom/google/android/gms/internal/zzdg$zzd;
.super Ljava/lang/Object;


# instance fields
.field private final zzxY:Ljava/lang/String;

.field private final zzzp:Ljava/lang/String;

.field private final zzzw:I

.field private final zzzx:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdg$zzd;->zzzp:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/internal/zzdg$zzd;->zzzw:I

    if-nez p3, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdg$zzd;->zzzx:Ljava/util/List;

    :goto_0
    iput-object p4, p0, Lcom/google/android/gms/internal/zzdg$zzd;->zzxY:Ljava/lang/String;

    return-void

    :cond_0
    iput-object p3, p0, Lcom/google/android/gms/internal/zzdg$zzd;->zzzx:Ljava/util/List;

    goto :goto_0
.end method


# virtual methods
.method public getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdg$zzd;->zzxY:Ljava/lang/String;

    return-object v0
.end method

.method public getResponseCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzdg$zzd;->zzzw:I

    return v0
.end method

.method public zzdU()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdg$zzd;->zzzp:Ljava/lang/String;

    return-object v0
.end method

.method public zzdZ()Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdg$zzd;->zzzx:Ljava/util/List;

    return-object v0
.end method
