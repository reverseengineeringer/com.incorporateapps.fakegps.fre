package com.google.ads.mediation;

import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;

final class b
  implements RewardedVideoAdListener
{
  b(a parama) {}
  
  public final void onRewarded(RewardItem paramRewardItem)
  {
    a.a(a).onRewarded(a, paramRewardItem);
  }
  
  public final void onRewardedVideoAdClosed()
  {
    a.a(a).onAdClosed(a);
    a.b(a);
  }
  
  public final void onRewardedVideoAdFailedToLoad(int paramInt)
  {
    a.a(a).onAdFailedToLoad(a, paramInt);
  }
  
  public final void onRewardedVideoAdLeftApplication()
  {
    a.a(a).onAdLeftApplication(a);
  }
  
  public final void onRewardedVideoAdLoaded()
  {
    a.a(a).onAdLoaded(a);
  }
  
  public final void onRewardedVideoAdOpened()
  {
    a.a(a).onAdOpened(a);
  }
  
  public final void onRewardedVideoStarted()
  {
    a.a(a).onVideoStarted(a);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */