.class Lcom/google/android/gms/tagmanager/zzcp$zzb;
.super Ljava/lang/Object;


# instance fields
.field private zzbkH:Lcom/google/android/gms/tagmanager/zzbw;

.field private zzbkI:Lcom/google/android/gms/internal/zzag$zza;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tagmanager/zzbw;Lcom/google/android/gms/internal/zzag$zza;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzcp$zzb;->zzbkH:Lcom/google/android/gms/tagmanager/zzbw;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzcp$zzb;->zzbkI:Lcom/google/android/gms/internal/zzag$zza;

    return-void
.end method


# virtual methods
.method public getSize()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcp$zzb;->zzbkH:Lcom/google/android/gms/tagmanager/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzbw;->getObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzag$zza;->getCachedSize()I

    move-result v1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcp$zzb;->zzbkI:Lcom/google/android/gms/internal/zzag$zza;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcp$zzb;->zzbkI:Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzag$zza;->getCachedSize()I

    move-result v0

    goto :goto_0
.end method

.method public zzHg()Lcom/google/android/gms/tagmanager/zzbw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcp$zzb;->zzbkH:Lcom/google/android/gms/tagmanager/zzbw;

    return-object v0
.end method

.method public zzHh()Lcom/google/android/gms/internal/zzag$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcp$zzb;->zzbkI:Lcom/google/android/gms/internal/zzag$zza;

    return-object v0
.end method