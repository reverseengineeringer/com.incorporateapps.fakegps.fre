.class public final Lcom/google/android/gms/internal/zzmh;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzmg;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzf(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzmh$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzmh$1;-><init>(Lcom/google/android/gms/internal/zzmh;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzb(Lcom/google/android/gms/common/api/internal/zza$zza;)Lcom/google/android/gms/common/api/internal/zza$zza;

    move-result-object v0

    return-object v0
.end method
