.class final Lcom/google/android/gms/internal/zzig$zza;
.super Ljava/lang/Object;


# instance fields
.field private zzLo:J

.field private zzLp:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzig$zza;->zzLo:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzig$zza;->zzLp:J

    return-void
.end method


# virtual methods
.method public final toBundle()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "topen"

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzig$zza;->zzLo:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string v1, "tclose"

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzig$zza;->zzLp:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object v0
.end method

.method public final zzgV()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzig$zza;->zzLp:J

    return-wide v0
.end method

.method public final zzgW()V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzig$zza;->zzLp:J

    return-void
.end method

.method public final zzgX()V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzig$zza;->zzLo:J

    return-void
.end method
