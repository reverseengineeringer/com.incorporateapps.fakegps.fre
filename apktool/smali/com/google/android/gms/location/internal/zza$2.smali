.class Lcom/google/android/gms/location/internal/zza$2;
.super Lcom/google/android/gms/location/internal/zza$zza;


# instance fields
.field final synthetic zzaOq:Landroid/app/PendingIntent;

.field final synthetic zzaOr:Lcom/google/android/gms/location/internal/zza;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/internal/zza;Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/internal/zza$2;->zzaOr:Lcom/google/android/gms/location/internal/zza;

    iput-object p3, p0, Lcom/google/android/gms/location/internal/zza$2;->zzaOq:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lcom/google/android/gms/location/internal/zza$zza;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/internal/zzl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/zza$2;->zza(Lcom/google/android/gms/location/internal/zzl;)V

    return-void
.end method

.method protected zza(Lcom/google/android/gms/location/internal/zzl;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/zza$2;->zzaOq:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/internal/zzl;->zza(Landroid/app/PendingIntent;)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->zzagC:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/location/internal/zza$2;->zza(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
