package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzfv;
import com.google.android.gms.internal.zzge;

public class zzl
{
  public static String zzuq = null;
  private zzm zzup;
  
  public zzl()
  {
    ClientApi.retainReference();
    if (zzuq != null) {
      try
      {
        zzup = ((zzm)zzl.class.getClassLoader().loadClass(zzuq).newInstance());
        return;
      }
      catch (Exception localException)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to instantiate ClientApi class.", localException);
        zzup = new zzai();
        return;
      }
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaK("No client jar implementation found.");
    zzup = new zzai();
  }
  
  public zzs createAdLoaderBuilder(Context paramContext, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return zzup.createAdLoaderBuilder(paramContext, paramString, paramzzew, paramVersionInfoParcel);
  }
  
  public zzfv createAdOverlay(Activity paramActivity)
  {
    return zzup.createAdOverlay(paramActivity);
  }
  
  public zzu createBannerAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return zzup.createBannerAdManager(paramContext, paramAdSizeParcel, paramString, paramzzew, paramVersionInfoParcel);
  }
  
  public zzge createInAppPurchaseManager(Activity paramActivity)
  {
    return zzup.createInAppPurchaseManager(paramActivity);
  }
  
  public zzu createInterstitialAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return zzup.createInterstitialAdManager(paramContext, paramAdSizeParcel, paramString, paramzzew, paramVersionInfoParcel);
  }
  
  public zzcj createNativeAdViewDelegate(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2)
  {
    return zzup.createNativeAdViewDelegate(paramFrameLayout1, paramFrameLayout2);
  }
  
  public com.google.android.gms.ads.internal.reward.client.zzb createRewardedVideoAd(Context paramContext, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel)
  {
    return zzup.createRewardedVideoAd(paramContext, paramzzew, paramVersionInfoParcel);
  }
  
  public zzy getMobileAdsSettingsManager(Context paramContext)
  {
    return zzup.getMobileAdsSettingsManager(paramContext);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */