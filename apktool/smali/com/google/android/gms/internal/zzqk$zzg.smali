.class final Lcom/google/android/gms/internal/zzqk$zzg;
.super Lcom/google/android/gms/internal/zzqj;


# instance fields
.field private final zzamC:Lcom/google/android/gms/common/api/internal/zza$zzb;

.field private final zzbbi:Lcom/google/android/gms/common/api/internal/zzq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;Lcom/google/android/gms/common/api/internal/zzq;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzqj;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzx;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/zza$zzb;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzqk$zzg;->zzamC:Lcom/google/android/gms/common/api/internal/zza$zzb;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzx;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/zzq;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzqk$zzg;->zzbbi:Lcom/google/android/gms/common/api/internal/zzq;

    return-void
.end method


# virtual methods
.method public final onEndpointFound(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v6, p0, Lcom/google/android/gms/internal/zzqk$zzg;->zzbbi:Lcom/google/android/gms/common/api/internal/zzq;

    new-instance v0, Lcom/google/android/gms/internal/zzqk$zzg$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzqk$zzg$1;-><init>(Lcom/google/android/gms/internal/zzqk$zzg;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Lcom/google/android/gms/common/api/internal/zzq;->zza(Lcom/google/android/gms/common/api/internal/zzq$zzb;)V

    return-void
.end method

.method public final onEndpointLost(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqk$zzg;->zzbbi:Lcom/google/android/gms/common/api/internal/zzq;

    new-instance v1, Lcom/google/android/gms/internal/zzqk$zzg$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/zzqk$zzg$2;-><init>(Lcom/google/android/gms/internal/zzqk$zzg;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/zzq;->zza(Lcom/google/android/gms/common/api/internal/zzq$zzb;)V

    return-void
.end method

.method public final zziW(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqk$zzg;->zzamC:Lcom/google/android/gms/common/api/internal/zza$zzb;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/internal/zza$zzb;->zzs(Ljava/lang/Object;)V

    return-void
.end method
