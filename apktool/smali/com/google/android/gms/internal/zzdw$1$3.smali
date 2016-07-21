.class Lcom/google/android/gms/internal/zzdw$1$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzdw$zza;


# instance fields
.field final synthetic zzAd:Lcom/google/android/gms/internal/zzdw$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzdw$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdw$1$3;->zzAd:Lcom/google/android/gms/internal/zzdw$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzb(Lcom/google/android/gms/internal/zzdx;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/internal/zzdx;->zzpK:Lcom/google/android/gms/ads/internal/client/zzq;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/zzdx;->zzpK:Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/zzq;->onAdLeftApplication()V

    :cond_0
    return-void
.end method
