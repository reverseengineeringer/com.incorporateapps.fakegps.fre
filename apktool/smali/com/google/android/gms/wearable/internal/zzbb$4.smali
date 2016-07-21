.class Lcom/google/android/gms/wearable/internal/zzbb$4;
.super Lcom/google/android/gms/wearable/internal/zzi;


# instance fields
.field final synthetic zzbsU:Lcom/google/android/gms/wearable/internal/zzbb;

.field final synthetic zzbsV:Lcom/google/android/gms/wearable/NodeApi$NodeListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzbb;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/NodeApi$NodeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbb$4;->zzbsU:Lcom/google/android/gms/wearable/internal/zzbb;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzbb$4;->zzbsV:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzi;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbb$4;->zza(Lcom/google/android/gms/wearable/internal/zzbp;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/wearable/internal/zzbp;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbb$4;->zzbsV:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/zzbp;->zza(Lcom/google/android/gms/common/api/internal/zza$zzb;Lcom/google/android/gms/wearable/NodeApi$NodeListener;)V

    return-void
.end method

.method public zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method

.method public synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbb$4;->zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
