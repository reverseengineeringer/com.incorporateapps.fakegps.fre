package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class zzfe
  extends zzey.zza
{
  private final MediationAdapter zzCI;
  private zzff zzCJ;
  
  public zzfe(MediationAdapter paramMediationAdapter)
  {
    zzCI = paramMediationAdapter;
  }
  
  private Bundle zza(String paramString1, int paramInt, String paramString2)
  {
    com.google.android.gms.ads.internal.util.client.zzb.zzaK("Server parameters: " + paramString1);
    Bundle localBundle;
    try
    {
      localBundle = new Bundle();
      if (paramString1 != null)
      {
        paramString1 = new JSONObject(paramString1);
        localBundle = new Bundle();
        Iterator localIterator = paramString1.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localBundle.putString(str, paramString1.getString(str));
        }
      }
      if (!(zzCI instanceof AdMobAdapter)) {
        break label135;
      }
    }
    catch (Throwable paramString1)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get Server Parameters Bundle.", paramString1);
      throw new RemoteException();
    }
    localBundle.putString("adJson", paramString2);
    localBundle.putInt("tagForChildDirectedTreatment", paramInt);
    label135:
    return localBundle;
  }
  
  public final void destroy()
  {
    try
    {
      zzCI.onDestroy();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not destroy adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final Bundle getInterstitialAdapterInfo()
  {
    if (!(zzCI instanceof zzka))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a v2 MediationInterstitialAdapter: " + zzCI.getClass().getCanonicalName());
      return new Bundle();
    }
    return ((zzka)zzCI).getInterstitialAdapterInfo();
  }
  
  public final zzd getView()
  {
    if (!(zzCI instanceof MediationBannerAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationBannerAdapter: " + zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      zzd localzzd = zze.zzC(((MediationBannerAdapter)zzCI).getBannerView());
      return localzzd;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get banner view from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final boolean isInitialized()
  {
    if (!(zzCI instanceof MediationRewardedVideoAdAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Check if adapter is initialized.");
    try
    {
      boolean bool = ((MediationRewardedVideoAdAdapter)zzCI).isInitialized();
      return bool;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not check if adapter is initialized.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void pause()
  {
    try
    {
      zzCI.onPause();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not pause adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void resume()
  {
    try
    {
      zzCI.onResume();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not resume adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void showInterstitial()
  {
    if (!(zzCI instanceof MediationInterstitialAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationInterstitialAdapter: " + zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Showing interstitial from adapter.");
    try
    {
      ((MediationInterstitialAdapter)zzCI).showInterstitial();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show interstitial from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void showVideo()
  {
    if (!(zzCI instanceof MediationRewardedVideoAdAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Show rewarded video ad from adapter.");
    try
    {
      ((MediationRewardedVideoAdAdapter)zzCI).showVideo();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show rewarded video ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }
  
  public final void zza(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
  {
    if (!(zzCI instanceof MediationRewardedVideoAdAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Requesting rewarded video ad from adapter.");
    for (;;)
    {
      try
      {
        MediationRewardedVideoAdAdapter localMediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter)zzCI;
        if (zztE == null) {
          break label210;
        }
        localObject1 = new HashSet(zztE);
        Object localObject2;
        if (zztC == -1L)
        {
          localObject2 = null;
          localObject2 = new zzfd((Date)localObject2, zztD, (Set)localObject1, zztK, zztF, zztG, zztR);
          if (zztM != null)
          {
            localObject1 = zztM.getBundle(localMediationRewardedVideoAdAdapter.getClass().getName());
            localMediationRewardedVideoAdAdapter.loadAd((MediationAdRequest)localObject2, zza(paramString1, zztG, paramString2), (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(zztC);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable paramAdRequestParcel)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not load rewarded video ad from adapter.", paramAdRequestParcel);
        throw new RemoteException();
      }
      continue;
      label210:
      Object localObject1 = null;
    }
  }
  
  public final void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, com.google.android.gms.ads.internal.reward.mediation.client.zza paramzza, String paramString2)
  {
    if (!(zzCI instanceof MediationRewardedVideoAdAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Initialize rewarded video adapter.");
    for (;;)
    {
      try
      {
        MediationRewardedVideoAdAdapter localMediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter)zzCI;
        if (zztE == null) {
          break label229;
        }
        localObject1 = new HashSet(zztE);
        Object localObject2;
        if (zztC == -1L)
        {
          localObject2 = null;
          localObject2 = new zzfd((Date)localObject2, zztD, (Set)localObject1, zztK, zztF, zztG, zztR);
          if (zztM != null)
          {
            localObject1 = zztM.getBundle(localMediationRewardedVideoAdAdapter.getClass().getName());
            localMediationRewardedVideoAdAdapter.initialize((Context)zze.zzp(paramzzd), (MediationAdRequest)localObject2, paramString1, new com.google.android.gms.ads.internal.reward.mediation.client.zzb(paramzza), zza(paramString2, zztG, null), (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(zztC);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable paramzzd)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not initialize rewarded video adapter.", paramzzd);
        throw new RemoteException();
      }
      continue;
      label229:
      Object localObject1 = null;
    }
  }
  
  public final void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
  {
    zza(paramzzd, paramAdRequestParcel, paramString, null, paramzzez);
  }
  
  public final void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
  {
    if (!(zzCI instanceof MediationInterstitialAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationInterstitialAdapter: " + zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Requesting interstitial ad from adapter.");
    for (;;)
    {
      try
      {
        MediationInterstitialAdapter localMediationInterstitialAdapter = (MediationInterstitialAdapter)zzCI;
        if (zztE == null) {
          break label229;
        }
        localObject1 = new HashSet(zztE);
        Object localObject2;
        if (zztC == -1L)
        {
          localObject2 = null;
          localObject2 = new zzfd((Date)localObject2, zztD, (Set)localObject1, zztK, zztF, zztG, zztR);
          if (zztM != null)
          {
            localObject1 = zztM.getBundle(localMediationInterstitialAdapter.getClass().getName());
            localMediationInterstitialAdapter.requestInterstitialAd((Context)zze.zzp(paramzzd), new zzff(paramzzez), zza(paramString1, zztG, paramString2), (MediationAdRequest)localObject2, (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(zztC);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable paramzzd)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request interstitial ad from adapter.", paramzzd);
        throw new RemoteException();
      }
      continue;
      label229:
      Object localObject1 = null;
    }
  }
  
  public final void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList)
  {
    if (!(zzCI instanceof MediationNativeAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationNativeAdapter: " + zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    for (;;)
    {
      try
      {
        MediationNativeAdapter localMediationNativeAdapter = (MediationNativeAdapter)zzCI;
        if (zztE == null) {
          break label236;
        }
        localHashSet = new HashSet(zztE);
        Date localDate;
        if (zztC == -1L)
        {
          localDate = null;
          paramList = new zzfi(localDate, zztD, localHashSet, zztK, zztF, zztG, paramNativeAdOptionsParcel, paramList, zztR);
          if (zztM != null)
          {
            paramNativeAdOptionsParcel = zztM.getBundle(localMediationNativeAdapter.getClass().getName());
            zzCJ = new zzff(paramzzez);
            localMediationNativeAdapter.requestNativeAd((Context)zze.zzp(paramzzd), zzCJ, zza(paramString1, zztG, paramString2), paramList, paramNativeAdOptionsParcel);
          }
        }
        else
        {
          localDate = new Date(zztC);
          continue;
        }
        paramNativeAdOptionsParcel = null;
      }
      catch (Throwable paramzzd)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request native ad from adapter.", paramzzd);
        throw new RemoteException();
      }
      continue;
      label236:
      HashSet localHashSet = null;
    }
  }
  
  public final void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
  {
    zza(paramzzd, paramAdSizeParcel, paramAdRequestParcel, paramString, null, paramzzez);
  }
  
  public final void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
  {
    if (!(zzCI instanceof MediationBannerAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationBannerAdapter: " + zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Requesting banner ad from adapter.");
    for (;;)
    {
      try
      {
        MediationBannerAdapter localMediationBannerAdapter = (MediationBannerAdapter)zzCI;
        if (zztE == null) {
          break label245;
        }
        localObject1 = new HashSet(zztE);
        Object localObject2;
        if (zztC == -1L)
        {
          localObject2 = null;
          localObject2 = new zzfd((Date)localObject2, zztD, (Set)localObject1, zztK, zztF, zztG, zztR);
          if (zztM != null)
          {
            localObject1 = zztM.getBundle(localMediationBannerAdapter.getClass().getName());
            localMediationBannerAdapter.requestBannerAd((Context)zze.zzp(paramzzd), new zzff(paramzzez), zza(paramString1, zztG, paramString2), com.google.android.gms.ads.zza.zza(width, height, zzuh), (MediationAdRequest)localObject2, (Bundle)localObject1);
          }
        }
        else
        {
          localObject2 = new Date(zztC);
          continue;
        }
        localObject1 = null;
      }
      catch (Throwable paramzzd)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request banner ad from adapter.", paramzzd);
        throw new RemoteException();
      }
      continue;
      label245:
      Object localObject1 = null;
    }
  }
  
  public final void zzb(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    zza(paramAdRequestParcel, paramString, null);
  }
  
  public final zzfb zzeF()
  {
    NativeAdMapper localNativeAdMapper = zzCJ.zzeJ();
    if ((localNativeAdMapper instanceof NativeAppInstallAdMapper)) {
      return new zzfg((NativeAppInstallAdMapper)localNativeAdMapper);
    }
    return null;
  }
  
  public final zzfc zzeG()
  {
    NativeAdMapper localNativeAdMapper = zzCJ.zzeJ();
    if ((localNativeAdMapper instanceof NativeContentAdMapper)) {
      return new zzfh((NativeContentAdMapper)localNativeAdMapper);
    }
    return null;
  }
  
  public final Bundle zzeH()
  {
    if (!(zzCI instanceof zzjz))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a v2 MediationBannerAdapter: " + zzCI.getClass().getCanonicalName());
      return new Bundle();
    }
    return ((zzjz)zzCI).zzeH();
  }
  
  public final Bundle zzeI()
  {
    return new Bundle();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */