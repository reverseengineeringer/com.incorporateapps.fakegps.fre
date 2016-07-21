.class Lcom/google/android/gms/wearable/internal/zzj$2;
.super Lcom/google/android/gms/wearable/internal/zzi;


# instance fields
.field final synthetic zzbrN:I

.field final synthetic zzbrO:Lcom/google/android/gms/wearable/internal/zzj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzj;Lcom/google/android/gms/common/api/GoogleApiClient;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzj$2;->zzbrO:Lcom/google/android/gms/wearable/internal/zzj;

    iput p3, p0, Lcom/google/android/gms/wearable/internal/zzj$2;->zzbrN:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzi;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzj$2;->zza(Lcom/google/android/gms/wearable/internal/zzbp;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/wearable/internal/zzbp;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wearable/internal/zzj$2;->zzbrN:I

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/zzbp;->zzb(Lcom/google/android/gms/common/api/internal/zza$zzb;I)V

    return-void
.end method

.method protected zzbp(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/CapabilityApi$GetAllCapabilitiesResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzj$zzd;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/zzj$zzd;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/util/Map;)V

    return-object v0
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzj$2;->zzbp(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/CapabilityApi$GetAllCapabilitiesResult;

    move-result-object v0

    return-object v0
.end method
