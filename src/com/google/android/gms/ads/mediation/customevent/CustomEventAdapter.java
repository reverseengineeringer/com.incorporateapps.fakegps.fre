package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.internal.zzin;

public final class CustomEventAdapter
  implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{
  CustomEventBanner zzOq;
  CustomEventInterstitial zzOr;
  CustomEventNative zzOs;
  private View zzbk;
  
  private void zza(View paramView)
  {
    zzbk = paramView;
  }
  
  private static Object zzj(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      zzin.zzaK("Could not instantiate custom event adapter: " + paramString + ". " + localThrowable.getMessage());
    }
    return null;
  }
  
  public final View getBannerView()
  {
    return zzbk;
  }
  
  public final void onDestroy()
  {
    if (zzOq != null) {
      zzOq.onDestroy();
    }
    if (zzOr != null) {
      zzOr.onDestroy();
    }
    if (zzOs != null) {
      zzOs.onDestroy();
    }
  }
  
  public final void onPause()
  {
    if (zzOq != null) {
      zzOq.onPause();
    }
    if (zzOr != null) {
      zzOr.onPause();
    }
    if (zzOs != null) {
      zzOs.onPause();
    }
  }
  
  public final void onResume()
  {
    if (zzOq != null) {
      zzOq.onResume();
    }
    if (zzOr != null) {
      zzOr.onResume();
    }
    if (zzOs != null) {
      zzOs.onResume();
    }
  }
  
  public final void requestBannerAd(Context paramContext, MediationBannerListener paramMediationBannerListener, Bundle paramBundle1, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    zzOq = ((CustomEventBanner)zzj(paramBundle1.getString("class_name")));
    if (zzOq == null)
    {
      paramMediationBannerListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (paramBundle2 = null;; paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      zzOq.requestBannerAd(paramContext, new CustomEventAdapter.zza(this, paramMediationBannerListener), paramBundle1.getString("parameter"), paramAdSize, paramMediationAdRequest, paramBundle2);
      return;
    }
  }
  
  public final void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    zzOr = ((CustomEventInterstitial)zzj(paramBundle1.getString("class_name")));
    if (zzOr == null)
    {
      paramMediationInterstitialListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (paramBundle2 = null;; paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      zzOr.requestInterstitialAd(paramContext, zza(paramMediationInterstitialListener), paramBundle1.getString("parameter"), paramMediationAdRequest, paramBundle2);
      return;
    }
  }
  
  public final void requestNativeAd(Context paramContext, MediationNativeListener paramMediationNativeListener, Bundle paramBundle1, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle2)
  {
    zzOs = ((CustomEventNative)zzj(paramBundle1.getString("class_name")));
    if (zzOs == null)
    {
      paramMediationNativeListener.onAdFailedToLoad(this, 0);
      return;
    }
    if (paramBundle2 == null) {}
    for (paramBundle2 = null;; paramBundle2 = paramBundle2.getBundle(paramBundle1.getString("class_name")))
    {
      zzOs.requestNativeAd(paramContext, new CustomEventAdapter.zzc(this, paramMediationNativeListener), paramBundle1.getString("parameter"), paramNativeMediationAdRequest, paramBundle2);
      return;
    }
  }
  
  public final void showInterstitial()
  {
    zzOr.showInterstitial();
  }
  
  final CustomEventAdapter.zzb zza(MediationInterstitialListener paramMediationInterstitialListener)
  {
    return new CustomEventAdapter.zzb(this, this, paramMediationInterstitialListener);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */