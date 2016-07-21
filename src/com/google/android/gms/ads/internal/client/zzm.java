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

public abstract interface zzm
{
  public abstract zzs createAdLoaderBuilder(Context paramContext, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel);
  
  public abstract zzfv createAdOverlay(Activity paramActivity);
  
  public abstract zzu createBannerAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel);
  
  public abstract zzge createInAppPurchaseManager(Activity paramActivity);
  
  public abstract zzu createInterstitialAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel);
  
  public abstract zzcj createNativeAdViewDelegate(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2);
  
  public abstract zzb createRewardedVideoAd(Context paramContext, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel);
  
  public abstract zzy getMobileAdsSettingsManager(Context paramContext);
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */