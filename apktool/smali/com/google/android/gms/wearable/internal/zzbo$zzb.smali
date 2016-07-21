.class abstract Lcom/google/android/gms/wearable/internal/zzbo$zzb;
.super Lcom/google/android/gms/wearable/internal/zza;


# instance fields
.field private zzUz:Lcom/google/android/gms/common/api/internal/zza$zzb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbo$zzb;->zzUz:Lcom/google/android/gms/common/api/internal/zza$zzb;

    return-void
.end method


# virtual methods
.method public zzX(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbo$zzb;->zzUz:Lcom/google/android/gms/common/api/internal/zza$zzb;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/internal/zza$zzb;->zzs(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbo$zzb;->zzUz:Lcom/google/android/gms/common/api/internal/zza$zzb;

    :cond_0
    return-void
.end method
