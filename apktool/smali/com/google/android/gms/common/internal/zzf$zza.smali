.class public final Lcom/google/android/gms/common/internal/zzf$zza;
.super Ljava/lang/Object;


# instance fields
.field public final zzXf:Ljava/util/Set;

.field public final zzalf:Z


# direct methods
.method public constructor <init>(Ljava/util/Set;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzx;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/internal/zzf$zza;->zzXf:Ljava/util/Set;

    iput-boolean p2, p0, Lcom/google/android/gms/common/internal/zzf$zza;->zzalf:Z

    return-void
.end method
