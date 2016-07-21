.class Lcom/google/android/gms/wearable/internal/zzx$3;
.super Lcom/google/android/gms/wearable/internal/zzi;


# instance fields
.field final synthetic zzbsq:Lcom/google/android/gms/wearable/internal/zzx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzx;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzx$3;->zzbsq:Lcom/google/android/gms/wearable/internal/zzx;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzi;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzx$3;->zza(Lcom/google/android/gms/wearable/internal/zzbp;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/wearable/internal/zzbp;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/wearable/internal/zzbp;->zzr(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    return-void
.end method

.method protected zzbw(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/DataItemBuffer;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/DataItemBuffer;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/common/data/DataHolder;->zzbI(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/wearable/DataItemBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzx$3;->zzbw(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/DataItemBuffer;

    move-result-object v0

    return-object v0
.end method
