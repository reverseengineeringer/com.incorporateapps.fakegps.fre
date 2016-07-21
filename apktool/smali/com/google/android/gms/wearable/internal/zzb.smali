.class final Lcom/google/android/gms/wearable/internal/zzb;
.super Lcom/google/android/gms/wearable/internal/zzi;


# instance fields
.field private mListener:Ljava/lang/Object;

.field private zzbbi:Lcom/google/android/gms/common/api/internal/zzq;

.field private zzbrA:Lcom/google/android/gms/wearable/internal/zzb$zza;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/zzq;Lcom/google/android/gms/wearable/internal/zzb$zza;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzi;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzx;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzb;->mListener:Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzx;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/zzq;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzb;->zzbbi:Lcom/google/android/gms/common/api/internal/zzq;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/zzx;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/zzb$zza;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzb;->zzbrA:Lcom/google/android/gms/wearable/internal/zzb$zza;

    return-void
.end method

.method static zza(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/internal/zzb$zza;Ljava/lang/Object;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2

    invoke-virtual {p0, p2}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzr(Ljava/lang/Object;)Lcom/google/android/gms/common/api/internal/zzq;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/wearable/internal/zzb;

    invoke-direct {v1, p0, p2, v0, p1}, Lcom/google/android/gms/wearable/internal/zzb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/zzq;Lcom/google/android/gms/wearable/internal/zzb$zza;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->zza(Lcom/google/android/gms/common/api/internal/zza$zza;)Lcom/google/android/gms/common/api/internal/zza$zza;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzb;->zza(Lcom/google/android/gms/wearable/internal/zzbp;)V

    return-void
.end method

.method protected final zza(Lcom/google/android/gms/wearable/internal/zzbp;)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzb;->zzbrA:Lcom/google/android/gms/wearable/internal/zzb$zza;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/zzb;->mListener:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/zzb;->zzbbi:Lcom/google/android/gms/common/api/internal/zzq;

    invoke-interface {v0, p1, p0, v1, v2}, Lcom/google/android/gms/wearable/internal/zzb$zza;->zza(Lcom/google/android/gms/wearable/internal/zzbp;Lcom/google/android/gms/common/api/internal/zza$zzb;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/zzq;)V

    iput-object v3, p0, Lcom/google/android/gms/wearable/internal/zzb;->mListener:Ljava/lang/Object;

    iput-object v3, p0, Lcom/google/android/gms/wearable/internal/zzb;->zzbbi:Lcom/google/android/gms/common/api/internal/zzq;

    return-void
.end method

.method protected final zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzb;->mListener:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzb;->zzbbi:Lcom/google/android/gms/common/api/internal/zzq;

    return-object p1
.end method

.method protected final synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzb;->zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
