.class final Lcom/google/android/gms/common/internal/zze$2;
.super Lcom/google/android/gms/common/internal/zze;


# instance fields
.field final synthetic zzakU:C

.field final synthetic zzakV:C


# direct methods
.method constructor <init>(CC)V
    .locals 0

    iput-char p1, p0, Lcom/google/android/gms/common/internal/zze$2;->zzakU:C

    iput-char p2, p0, Lcom/google/android/gms/common/internal/zze$2;->zzakV:C

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/zze;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzd(C)Z
    .locals 1

    iget-char v0, p0, Lcom/google/android/gms/common/internal/zze$2;->zzakU:C

    if-eq p1, v0, :cond_0

    iget-char v0, p0, Lcom/google/android/gms/common/internal/zze$2;->zzakV:C

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
