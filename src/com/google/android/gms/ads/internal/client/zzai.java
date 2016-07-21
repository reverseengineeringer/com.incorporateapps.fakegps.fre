package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.reward.client.zzb;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzfv;
import com.google.android.gms.internal.zzge;

public class zzai
  implements zzm
{
  public zzs createAdLoaderBuilder(Context paramContext, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return new zzag();
  }
  
  public zzfv createAdOverlay(Activity paramActivity)
  {
    return null;
  }
  
  public zzu createBannerAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return new zzah();
  }
  
  public zzge createInAppPurchaseManager(Activity paramActivity)
  {
    return null;
  }
  
  public zzu createInterstitialAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return new zzah();
  }
  
  public zzcj createNativeAdViewDelegate(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    return new zzak();
  }
  
  public zzb createRewardedVideoAd(Context paramContext, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return new zzal();
  }
  
  public zzy getMobileAdsSettingsManager(Context paramContext)
  {
    return new zzaj();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */