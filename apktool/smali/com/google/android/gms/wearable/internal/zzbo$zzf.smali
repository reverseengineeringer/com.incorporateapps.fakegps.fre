.class final Lcom/google/android/gms/wearable/internal/zzbo$zzf;
.super Lcom/google/android/gms/wearable/internal/zzbo$zzb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbo$zzb;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzj$zzd;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;->statusCode:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzbk;->zzgc(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;->zzbsA:Ljava/util/List;

    invoke-static {v2}, Lcom/google/android/gms/wearable/internal/zzbo;->zzH(Ljava/util/List;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/zzj$zzd;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/zzbo$zzf;->zzX(Ljava/lang/Object;)V

    return-void
.end method
