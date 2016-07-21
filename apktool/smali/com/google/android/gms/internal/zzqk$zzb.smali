.class Lcom/google/android/gms/internal/zzqk$zzb;
.super Lcom/google/android/gms/internal/zzqj;


# instance fields
.field private final zzbbb:Lcom/google/android/gms/common/api/internal/zzq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/zzq;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzqj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzqk$zzb;->zzbbb:Lcom/google/android/gms/common/api/internal/zzq;

    return-void
.end method


# virtual methods
.method public onDisconnected(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqk$zzb;->zzbbb:Lcom/google/android/gms/common/api/internal/zzq;

    new-instance v1, Lcom/google/android/gms/internal/zzqk$zzb$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/zzqk$zzb$2;-><init>(Lcom/google/android/gms/internal/zzqk$zzb;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/zzq;->zza(Lcom/google/android/gms/common/api/internal/zzq$zzb;)V

    return-void
.end method

.method public onMessageReceived(Ljava/lang/String;[BZ)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqk$zzb;->zzbbb:Lcom/google/android/gms/common/api/internal/zzq;

    new-instance v1, Lcom/google/android/gms/internal/zzqk$zzb$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzqk$zzb$1;-><init>(Lcom/google/android/gms/internal/zzqk$zzb;Ljava/lang/String;[BZ)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/zzq;->zza(Lcom/google/android/gms/common/api/internal/zzq$zzb;)V

    return-void
.end method
