.class Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;
.super Lcom/google/android/gms/auth/api/credentials/internal/zze;


# instance fields
.field final synthetic zzWv:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

.field final synthetic zzWw:Lcom/google/android/gms/auth/api/credentials/internal/zzd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/credentials/internal/zzd;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;->zzWw:Lcom/google/android/gms/auth/api/credentials/internal/zzd;

    iput-object p3, p0, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;->zzWv:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/auth/api/credentials/internal/zze;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected zza(Landroid/content/Context;Lcom/google/android/gms/auth/api/credentials/internal/zzj;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1$1;-><init>(Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;)V

    iget-object v1, p0, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;->zzWv:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/auth/api/credentials/internal/zzj;->zza(Lcom/google/android/gms/auth/api/credentials/internal/zzi;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)V

    return-void
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/credentials/internal/zzd$1;->zzi(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;

    move-result-object v0

    return-object v0
.end method

.method protected zzi(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/auth/api/credentials/internal/zzc;->zzh(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/api/credentials/internal/zzc;

    move-result-object v0

    return-object v0
.end method
