.class final Lcom/google/android/gms/wearable/internal/zzbo$zzt;
.super Lcom/google/android/gms/wearable/internal/zzbo$zzb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbo$zzb;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/internal/SendMessageResponse;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzaz$zzb;

    iget v1, p1, Lcom/google/android/gms/wearable/internal/SendMessageResponse;->statusCode:I

    invoke-static {v1}, Lcom/google/android/gms/wearable/internal/zzbk;->zzgc(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    iget v2, p1, Lcom/google/android/gms/wearable/internal/SendMessageResponse;->zzaNj:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/zzaz$zzb;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/zzbo$zzt;->zzX(Ljava/lang/Object;)V

    return-void
.end method
