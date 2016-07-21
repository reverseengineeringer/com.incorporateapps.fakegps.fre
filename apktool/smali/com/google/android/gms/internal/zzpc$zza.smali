.class Lcom/google/android/gms/internal/zzpc$zza;
.super Lcom/google/android/gms/internal/zzoh$zza;


# instance fields
.field private zzaAc:I

.field private zzaAd:Lcom/google/android/gms/fitness/result/DataReadResult;

.field private final zzamC:Lcom/google/android/gms/common/api/internal/zza$zzb;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzoh$zza;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAc:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAd:Lcom/google/android/gms/fitness/result/DataReadResult;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzamC:Lcom/google/android/gms/common/api/internal/zza$zzb;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;Lcom/google/android/gms/internal/zzpc$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzpc$zza;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/fitness/result/DataReadResult;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "Fitness"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Fitness"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Received batch result "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAc:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAd:Lcom/google/android/gms/fitness/result/DataReadResult;

    if-nez v0, :cond_2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAd:Lcom/google/android/gms/fitness/result/DataReadResult;

    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAc:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAc:I

    iget v0, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAc:I

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAd:Lcom/google/android/gms/fitness/result/DataReadResult;

    invoke-virtual {v1}, Lcom/google/android/gms/fitness/result/DataReadResult;->zzvj()I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzamC:Lcom/google/android/gms/common/api/internal/zza$zzb;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAd:Lcom/google/android/gms/fitness/result/DataReadResult;

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/internal/zza$zzb;->zzs(Ljava/lang/Object;)V

    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpc$zza;->zzaAd:Lcom/google/android/gms/fitness/result/DataReadResult;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/result/DataReadResult;->zzb(Lcom/google/android/gms/fitness/result/DataReadResult;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
