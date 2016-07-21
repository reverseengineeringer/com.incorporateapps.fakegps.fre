.class Lcom/google/android/gms/auth/api/credentials/internal/zzd$4;
.super Lcom/google/android/gms/auth/api/credentials/internal/zze;


# instance fields
.field final synthetic zzWw:Lcom/google/android/gms/auth/api/credentials/internal/zzd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/credentials/internal/zzd;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/internal/zzd$4;->zzWw:Lcom/google/android/gms/auth/api/credentials/internal/zzd;

    invoke-direct {p0, p2}, Lcom/google/android/gms/auth/api/credentials/internal/zze;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected zza(Landroid/content/Context;Lcom/google/android/gms/auth/api/credentials/internal/zzj;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/internal/zzd$zza;

    invoke-direct {v0, p0}, Lcom/google/android/gms/auth/api/credentials/internal/zzd$zza;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    invoke-interface {p2, v0}, Lcom/google/android/gms/auth/api/credentials/internal/zzj;->zza(Lcom/google/android/gms/auth/api/credentials/internal/zzi;)V

    return-void
.end method

.method protected zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/credentials/internal/zzd$4;->zzb(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
