.class public final Lcom/google/android/gms/ads/MobileAds$Settings;
.super Ljava/lang/Object;


# instance fields
.field private final zzoM:Lcom/google/android/gms/ads/internal/client/zzae;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzae;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzae;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zzoM:Lcom/google/android/gms/ads/internal/client/zzae;

    return-void
.end method


# virtual methods
.method public final getTrackingId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zzoM:Lcom/google/android/gms/ads/internal/client/zzae;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzae;->getTrackingId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isGoogleAnalyticsEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zzoM:Lcom/google/android/gms/ads/internal/client/zzae;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzae;->isGoogleAnalyticsEnabled()Z

    move-result v0

    return v0
.end method

.method public final setGoogleAnalyticsEnabled(Z)Lcom/google/android/gms/ads/MobileAds$Settings;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zzoM:Lcom/google/android/gms/ads/internal/client/zzae;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzae;->zzm(Z)V

    return-object p0
.end method

.method public final setTrackingId(Ljava/lang/String;)Lcom/google/android/gms/ads/MobileAds$Settings;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zzoM:Lcom/google/android/gms/ads/internal/client/zzae;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/zzae;->zzJ(Ljava/lang/String;)V

    return-object p0
.end method

.method final zzaG()Lcom/google/android/gms/ads/internal/client/zzae;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/MobileAds$Settings;->zzoM:Lcom/google/android/gms/ads/internal/client/zzae;

    return-object v0
.end method
