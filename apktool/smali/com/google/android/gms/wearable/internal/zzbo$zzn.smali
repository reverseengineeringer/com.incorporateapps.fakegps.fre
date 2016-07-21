.class final Lcom/google/android/gms/wearable/internal/zzbo$zzn;
.super Lcom/google/android/gms/wearable/internal/zzbo$zzb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbo$zzb;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/internal/GetLocalNodeResponse;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzbb$zzb;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/GetLocalNodeResponse;->statusCode:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzbk;->zzgc(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    iget-object v2, p1, Lcom/google/android/gms/wearable/internal/GetLocalNodeResponse;->zzbsL:Lcom/google/android/gms/wearable/internal/NodeParcelable;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/zzbb$zzb;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/Node;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/zzbo$zzn;->zzX(Ljava/lang/Object;)V

    return-void
.end method
