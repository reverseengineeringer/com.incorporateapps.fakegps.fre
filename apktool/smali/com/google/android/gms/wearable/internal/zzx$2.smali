.class Lcom/google/android/gms/wearable/internal/zzx$2;
.super Lcom/google/android/gms/wearable/internal/zzi;


# instance fields
.field final synthetic zzbds:Landroid/net/Uri;

.field final synthetic zzbsq:Lcom/google/android/gms/wearable/internal/zzx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/zzx;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzx$2;->zzbsq:Lcom/google/android/gms/wearable/internal/zzx;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/zzx$2;->zzbds:Landroid/net/Uri;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/zzi;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzbp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzx$2;->zza(Lcom/google/android/gms/wearable/internal/zzbp;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/wearable/internal/zzbp;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzx$2;->zzbds:Landroid/net/Uri;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/zzbp;->zza(Lcom/google/android/gms/common/api/internal/zza$zzb;Landroid/net/Uri;)V

    return-void
.end method

.method protected zzbv(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/DataApi$DataItemResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/zzx$zza;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/zzx$zza;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/DataItem;)V

    return-object v0
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzx$2;->zzbv(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/DataApi$DataItemResult;

    move-result-object v0

    return-object v0
.end method
