.class Lcom/google/android/gms/location/internal/zzd$3;
.super Lcom/google/android/gms/location/internal/zzd$zza;


# instance fields
.field final synthetic zzaOx:Lcom/google/android/gms/location/internal/zzd;

.field final synthetic zzaOz:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/internal/zzd;Lcom/google/android/gms/common/api/GoogleApiClient;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/internal/zzd$3;->zzaOx:Lcom/google/android/gms/location/internal/zzd;

    iput-boolean p3, p0, Lcom/google/android/gms/location/internal/zzd$3;->zzaOz:Z

    invoke-direct {p0, p2}, Lcom/google/android/gms/location/internal/zzd$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/internal/zzl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/zzd$3;->zza(Lcom/google/android/gms/location/internal/zzl;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/location/internal/zzl;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/internal/zzd$3;->zzaOz:Z

    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/internal/zzl;->zzam(Z)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->zzagC:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/location/internal/zzd$3;->zza(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
