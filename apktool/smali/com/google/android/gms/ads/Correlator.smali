.class public final Lcom/google/android/gms/ads/Correlator;
.super Ljava/lang/Object;


# instance fields
.field private zzoK:Lcom/google/android/gms/ads/internal/client/zzo;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzo;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzo;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/Correlator;->zzoK:Lcom/google/android/gms/ads/internal/client/zzo;

    return-void
.end method


# virtual methods
.method public final reset()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/Correlator;->zzoK:Lcom/google/android/gms/ads/internal/client/zzo;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzo;->zzcY()V

    return-void
.end method

.method public final zzaF()Lcom/google/android/gms/ads/internal/client/zzo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/Correlator;->zzoK:Lcom/google/android/gms/ads/internal/client/zzo;

    return-object v0
.end method
