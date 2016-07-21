package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzad;
import com.google.android.gms.ads.reward.RewardedVideoAd;

public class MobileAds
{
  public static RewardedVideoAd getRewardedVideoAdInstance(Context paramContext)
  {
    return zzad.zzdi().getRewardedVideoAdInstance(paramContext);
  }
  
  public static void initialize(Context paramContext)
  {
    zzad.zzdi().initialize(paramContext);
  }
  
  public static void initialize(Context paramContext, String paramString)
  {
    initialize(paramContext, paramString, null);
  }
  
  public static void initialize(Context paramContext, String paramString, MobileAds.Settings paramSettings)
  {
    zzad localzzad = zzad.zzdi();
    if (paramSettings == null) {}
    for (paramSettings = null;; paramSettings = paramSettings.zzaG())
    {
      localzzad.zza(paramContext, paramString, paramSettings);
      return;
    }
  }
  
  public static void setAppVolume(float paramFloat)
  {
    zzad.zzdi().setAppVolume(paramFloat);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.MobileAds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */