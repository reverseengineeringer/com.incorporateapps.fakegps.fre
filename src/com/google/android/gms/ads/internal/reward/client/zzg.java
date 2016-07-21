package com.google.android.gms.ads.internal.reward.client;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class zzg
  extends zzd.zza
{
  private final RewardedVideoAdListener zzaX;
  
  public zzg(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    zzaX = paramRewardedVideoAdListener;
  }
  
  public void onRewardedVideoAdClosed()
  {
    if (zzaX != null) {
      zzaX.onRewardedVideoAdClosed();
    }
  }
  
  public void onRewardedVideoAdFailedToLoad(int paramInt)
  {
    if (zzaX != null) {
      zzaX.onRewardedVideoAdFailedToLoad(paramInt);
    }
  }
  
  public void onRewardedVideoAdLeftApplication()
  {
    if (zzaX != null) {
      zzaX.onRewardedVideoAdLeftApplication();
    }
  }
  
  public void onRewardedVideoAdLoaded()
  {
    if (zzaX != null) {
      zzaX.onRewardedVideoAdLoaded();
    }
  }
  
  public void onRewardedVideoAdOpened()
  {
    if (zzaX != null) {
      zzaX.onRewardedVideoAdOpened();
    }
  }
  
  public void onRewardedVideoStarted()
  {
    if (zzaX != null) {
      zzaX.onRewardedVideoStarted();
    }
  }
  
  public void zza(zza paramzza)
  {
    if (zzaX != null) {
      zzaX.onRewarded(new zze(paramzza));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */