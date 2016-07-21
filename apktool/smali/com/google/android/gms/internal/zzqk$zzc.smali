.class Lcom/google/android/gms/internal/zzqk$zzc;
.super Lcom/google/android/gms/internal/zzqj;


# instance fields
.field private final zzbbf:Lcom/google/android/gms/common/api/internal/zza$zzb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzqj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzqk$zzc;->zzbbf:Lcom/google/android/gms/common/api/internal/zza$zzb;

    return-void
.end method


# virtual methods
.method public zzja(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzqk$zzc;->zzbbf:Lcom/google/android/gms/common/api/internal/zza$zzb;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/internal/zza$zzb;->zzs(Ljava/lang/Object;)V

    return-void
.end method
