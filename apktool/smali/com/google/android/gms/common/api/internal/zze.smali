.class public abstract Lcom/google/android/gms/common/api/internal/zze;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/internal/zzq$zzb;


# instance fields
.field private final zzahi:Lcom/google/android/gms/common/data/DataHolder;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/zze;->zzahi:Lcom/google/android/gms/common/data/DataHolder;

    return-void
.end method


# virtual methods
.method protected abstract zza(Ljava/lang/Object;Lcom/google/android/gms/common/data/DataHolder;)V
.end method

.method public zzpr()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zze;->zzahi:Lcom/google/android/gms/common/data/DataHolder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zze;->zzahi:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    :cond_0
    return-void
.end method

.method public final zzt(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/zze;->zzahi:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/internal/zze;->zza(Ljava/lang/Object;Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method