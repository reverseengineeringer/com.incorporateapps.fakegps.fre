.class final Lcom/google/ads/mediation/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/reward/RewardedVideoAdListener;


# instance fields
.field final synthetic a:Lcom/google/ads/mediation/a;


# direct methods
.method constructor <init>(Lcom/google/ads/mediation/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onRewarded(Lcom/google/android/gms/ads/reward/RewardItem;)V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-static {v0}, Lcom/google/ads/mediation/a;->a(Lcom/google/ads/mediation/a;)Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;->onRewarded(Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;Lcom/google/android/gms/ads/reward/RewardItem;)V

    return-void
.end method

.method public final onRewardedVideoAdClosed()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-static {v0}, Lcom/google/ads/mediation/a;->a(Lcom/google/ads/mediation/a;)Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;->onAdClosed(Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;)V

    iget-object v0, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-static {v0}, Lcom/google/ads/mediation/a;->b(Lcom/google/ads/mediation/a;)Lcom/google/android/gms/ads/InterstitialAd;

    return-void
.end method

.method public final onRewardedVideoAdFailedToLoad(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-static {v0}, Lcom/google/ads/mediation/a;->a(Lcom/google/ads/mediation/a;)Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;->onAdFailedToLoad(Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;I)V

    return-void
.end method

.method public final onRewardedVideoAdLeftApplication()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-static {v0}, Lcom/google/ads/mediation/a;->a(Lcom/google/ads/mediation/a;)Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;->onAdLeftApplication(Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;)V

    return-void
.end method

.method public final onRewardedVideoAdLoaded()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-static {v0}, Lcom/google/ads/mediation/a;->a(Lcom/google/ads/mediation/a;)Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;->onAdLoaded(Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;)V

    return-void
.end method

.method public final onRewardedVideoAdOpened()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-static {v0}, Lcom/google/ads/mediation/a;->a(Lcom/google/ads/mediation/a;)Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;->onAdOpened(Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;)V

    return-void
.end method

.method public final onRewardedVideoStarted()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-static {v0}, Lcom/google/ads/mediation/a;->a(Lcom/google/ads/mediation/a;)Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/mediation/b;->a:Lcom/google/ads/mediation/a;

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdListener;->onVideoStarted(Lcom/google/android/gms/ads/reward/mediation/MediationRewardedVideoAdAdapter;)V

    return-void
.end method
