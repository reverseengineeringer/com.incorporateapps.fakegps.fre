.class abstract Lcom/google/android/gms/internal/zzkk$zzb;
.super Lcom/google/android/gms/common/api/internal/zza$zza;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/appdatasearch/zza;->zzTy:Lcom/google/android/gms/common/api/Api$zzc;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/zza$zza;-><init>(Lcom/google/android/gms/common/api/Api$zzc;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zzki;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzkk$zzb;->zza(Lcom/google/android/gms/internal/zzki;)V

    return-void
.end method

.method protected abstract zza(Lcom/google/android/gms/internal/zzkf;)V
.end method

.method protected final zza(Lcom/google/android/gms/internal/zzki;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzki;->zzmj()Lcom/google/android/gms/internal/zzkf;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzkk$zzb;->zza(Lcom/google/android/gms/internal/zzkf;)V

    return-void
.end method
