.class abstract Lcom/google/android/gms/internal/zzre$zzb;
.super Lcom/google/android/gms/internal/zzrb;


# instance fields
.field protected zzbgC:Lcom/google/android/gms/internal/zzrc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzrb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    new-instance v0, Lcom/google/android/gms/internal/zzre$zzb$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzre$zzb$1;-><init>(Lcom/google/android/gms/internal/zzre$zzb;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzre$zzb;->zzbgC:Lcom/google/android/gms/internal/zzrc;

    return-void
.end method


# virtual methods
.method protected zzbh(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/safetynet/SafetyNetApi$AttestationResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzre$zza;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/zzre$zza;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/safetynet/AttestationData;)V

    return-object v0
.end method

.method protected synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzre$zzb;->zzbh(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/safetynet/SafetyNetApi$AttestationResult;

    move-result-object v0

    return-object v0
.end method
