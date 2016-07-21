package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.reward.client.zzg;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.zzcg;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzgi;
import com.google.android.gms.internal.zzgm;

public class zzac
{
  private final Context mContext;
  private String zzaW;
  private RewardedVideoAdListener zzaX;
  private final zzh zzoB;
  private String zzpS;
  private AdListener zztA;
  private zza zztz;
  private final zzew zzuJ = new zzew();
  private zzu zzuL;
  private String zzuM;
  private InAppPurchaseListener zzuO;
  private PlayStorePurchaseListener zzuP;
  private OnCustomRenderedAdLoadedListener zzuQ;
  private Correlator zzuR;
  private PublisherInterstitialAd zzuT;
  private boolean zzuU;
  private AppEventListener zzun;
  
  public zzac(Context paramContext)
  {
    this(paramContext, zzh.zzcO(), null);
  }
  
  public zzac(Context paramContext, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    this(paramContext, zzh.zzcO(), paramPublisherInterstitialAd);
  }
  
  public zzac(Context paramContext, zzh paramzzh, PublisherInterstitialAd paramPublisherInterstitialAd)
  {
    mContext = paramContext;
    zzoB = paramzzh;
    zzuT = paramPublisherInterstitialAd;
  }
  
  private void zzH(String paramString)
  {
    if (zzpS == null) {
      zzI(paramString);
    }
    if (zzuU) {}
    for (paramString = AdSizeParcel.zzcP();; paramString = new AdSizeParcel())
    {
      zzuL = zzn.zzcT().zzb(mContext, paramString, zzpS, zzuJ);
      if (zztA != null) {
        zzuL.zza(new zzc(zztA));
      }
      if (zztz != null) {
        zzuL.zza(new zzb(zztz));
      }
      if (zzun != null) {
        zzuL.zza(new zzj(zzun));
      }
      if (zzuO != null) {
        zzuL.zza(new zzgi(zzuO));
      }
      if (zzuP != null) {
        zzuL.zza(new zzgm(zzuP), zzuM);
      }
      if (zzuQ != null) {
        zzuL.zza(new zzcg(zzuQ));
      }
      if (zzuR != null) {
        zzuL.zza(zzuR.zzaF());
      }
      if (zzaX != null) {
        zzuL.zza(new zzg(zzaX));
      }
      if (zzaW != null) {
        zzuL.setUserId(zzaW);
      }
      return;
    }
  }
  
  private void zzI(String paramString)
  {
    if (zzuL == null) {
      throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + paramString + " is called.");
    }
  }
  
  public AdListener getAdListener()
  {
    return zztA;
  }
  
  public String getAdUnitId()
  {
    return zzpS;
  }
  
  public AppEventListener getAppEventListener()
  {
    return zzun;
  }
  
  public InAppPurchaseListener getInAppPurchaseListener()
  {
    return zzuO;
  }
  
  public String getMediationAdapterClassName()
  {
    try
    {
      if (zzuL != null)
      {
        String str = zzuL.getMediationAdapterClassName();
        return str;
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to get the mediation adapter class name.", localRemoteException);
    }
    return null;
  }
  
  public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
  {
    return zzuQ;
  }
  
  public boolean isLoaded()
  {
    try
    {
      if (zzuL == null) {
        return false;
      }
      boolean bool = zzuL.isReady();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to check if ad is ready.", localRemoteException);
    }
    return false;
  }
  
  public boolean isLoading()
  {
    try
    {
      if (zzuL == null) {
        return false;
      }
      boolean bool = zzuL.isLoading();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to check if ad is loading.", localRemoteException);
    }
    return false;
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    try
    {
      zztA = paramAdListener;
      zzu localzzu;
      if (zzuL != null)
      {
        localzzu = zzuL;
        if (paramAdListener == null) {
          break label38;
        }
      }
      label38:
      for (paramAdListener = new zzc(paramAdListener);; paramAdListener = null)
      {
        localzzu.zza(paramAdListener);
        return;
      }
      return;
    }
    catch (RemoteException paramAdListener)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the AdListener.", paramAdListener);
    }
  }
  
  public void setAdUnitId(String paramString)
  {
    if (zzpS != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }
    zzpS = paramString;
  }
  
  public void setAppEventListener(AppEventListener paramAppEventListener)
  {
    try
    {
      zzun = paramAppEventListener;
      zzu localzzu;
      if (zzuL != null)
      {
        localzzu = zzuL;
        if (paramAppEventListener == null) {
          break label38;
        }
      }
      label38:
      for (paramAppEventListener = new zzj(paramAppEventListener);; paramAppEventListener = null)
      {
        localzzu.zza(paramAppEventListener);
        return;
      }
      return;
    }
    catch (RemoteException paramAppEventListener)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the AppEventListener.", paramAppEventListener);
    }
  }
  
  public void setCorrelator(Correlator paramCorrelator)
  {
    zzuR = paramCorrelator;
    try
    {
      if (zzuL != null)
      {
        zzu localzzu = zzuL;
        if (zzuR == null) {}
        for (paramCorrelator = null;; paramCorrelator = zzuR.zzaF())
        {
          localzzu.zza(paramCorrelator);
          return;
        }
      }
      return;
    }
    catch (RemoteException paramCorrelator)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set correlator.", paramCorrelator);
    }
  }
  
  public void setInAppPurchaseListener(InAppPurchaseListener paramInAppPurchaseListener)
  {
    if (zzuP != null) {
      throw new IllegalStateException("Play store purchase parameter has already been set.");
    }
    try
    {
      zzuO = paramInAppPurchaseListener;
      zzu localzzu;
      if (zzuL != null)
      {
        localzzu = zzuL;
        if (paramInAppPurchaseListener == null) {
          break label55;
        }
      }
      label55:
      for (paramInAppPurchaseListener = new zzgi(paramInAppPurchaseListener);; paramInAppPurchaseListener = null)
      {
        localzzu.zza(paramInAppPurchaseListener);
        return;
      }
      return;
    }
    catch (RemoteException paramInAppPurchaseListener)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the InAppPurchaseListener.", paramInAppPurchaseListener);
    }
  }
  
  public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    try
    {
      zzuQ = paramOnCustomRenderedAdLoadedListener;
      zzu localzzu;
      if (zzuL != null)
      {
        localzzu = zzuL;
        if (paramOnCustomRenderedAdLoadedListener == null) {
          break label38;
        }
      }
      label38:
      for (paramOnCustomRenderedAdLoadedListener = new zzcg(paramOnCustomRenderedAdLoadedListener);; paramOnCustomRenderedAdLoadedListener = null)
      {
        localzzu.zza(paramOnCustomRenderedAdLoadedListener);
        return;
      }
      return;
    }
    catch (RemoteException paramOnCustomRenderedAdLoadedListener)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the OnCustomRenderedAdLoadedListener.", paramOnCustomRenderedAdLoadedListener);
    }
  }
  
  public void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    if (zzuO != null) {
      throw new IllegalStateException("In app purchase parameter has already been set.");
    }
    try
    {
      zzuP = paramPlayStorePurchaseListener;
      zzuM = paramString;
      zzu localzzu;
      if (zzuL != null)
      {
        localzzu = zzuL;
        if (paramPlayStorePurchaseListener == null) {
          break label62;
        }
      }
      label62:
      for (paramPlayStorePurchaseListener = new zzgm(paramPlayStorePurchaseListener);; paramPlayStorePurchaseListener = null)
      {
        localzzu.zza(paramPlayStorePurchaseListener, paramString);
        return;
      }
      return;
    }
    catch (RemoteException paramPlayStorePurchaseListener)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the play store purchase parameter.", paramPlayStorePurchaseListener);
    }
  }
  
  public void setRewardedVideoAdListener(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    try
    {
      zzaX = paramRewardedVideoAdListener;
      zzu localzzu;
      if (zzuL != null)
      {
        localzzu = zzuL;
        if (paramRewardedVideoAdListener == null) {
          break label38;
        }
      }
      label38:
      for (paramRewardedVideoAdListener = new zzg(paramRewardedVideoAdListener);; paramRewardedVideoAdListener = null)
      {
        localzzu.zza(paramRewardedVideoAdListener);
        return;
      }
      return;
    }
    catch (RemoteException paramRewardedVideoAdListener)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the AdListener.", paramRewardedVideoAdListener);
    }
  }
  
  public void setUserId(String paramString)
  {
    try
    {
      zzaW = paramString;
      if (zzuL != null) {
        zzuL.setUserId(paramString);
      }
      return;
    }
    catch (RemoteException paramString)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the AdListener.", paramString);
    }
  }
  
  public void show()
  {
    try
    {
      zzI("show");
      zzuL.showInterstitial();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to show interstitial.", localRemoteException);
    }
  }
  
  public void zza(zza paramzza)
  {
    try
    {
      zztz = paramzza;
      zzu localzzu;
      if (zzuL != null)
      {
        localzzu = zzuL;
        if (paramzza == null) {
          break label38;
        }
      }
      label38:
      for (paramzza = new zzb(paramzza);; paramzza = null)
      {
        localzzu.zza(paramzza);
        return;
      }
      return;
    }
    catch (RemoteException paramzza)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the AdClickListener.", paramzza);
    }
  }
  
  public void zza(zzaa paramzzaa)
  {
    try
    {
      if (zzuL == null) {
        zzH("loadAd");
      }
      if (zzuL.zzb(zzoB.zza(mContext, paramzzaa))) {
        zzuJ.zzg(paramzzaa.zzdb());
      }
      return;
    }
    catch (RemoteException paramzzaa)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to load ad.", paramzzaa);
    }
  }
  
  public void zza(boolean paramBoolean)
  {
    zzuU = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */