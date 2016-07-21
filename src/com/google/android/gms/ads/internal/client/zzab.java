package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzcg;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzgi;
import com.google.android.gms.internal.zzgm;
import java.util.concurrent.atomic.AtomicBoolean;

public class zzab
{
  private final zzh zzoB;
  private boolean zzpE;
  private String zzpS;
  private AdListener zztA;
  private zza zztz;
  private final zzew zzuJ = new zzew();
  private final AtomicBoolean zzuK;
  private zzu zzuL;
  private String zzuM;
  private ViewGroup zzuN;
  private InAppPurchaseListener zzuO;
  private PlayStorePurchaseListener zzuP;
  private OnCustomRenderedAdLoadedListener zzuQ;
  private Correlator zzuR;
  private boolean zzuS;
  private AppEventListener zzun;
  private AdSize[] zzuo;
  
  public zzab(ViewGroup paramViewGroup)
  {
    this(paramViewGroup, null, false, zzh.zzcO(), false);
  }
  
  public zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean, zzh.zzcO(), false);
  }
  
  zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, zzh paramzzh, zzu paramzzu, boolean paramBoolean2)
  {
    zzuN = paramViewGroup;
    zzoB = paramzzh;
    zzuL = paramzzu;
    zzuK = new AtomicBoolean(false);
    zzuS = paramBoolean2;
    if (paramAttributeSet != null) {
      paramzzh = paramViewGroup.getContext();
    }
    try
    {
      paramAttributeSet = new zzk(paramzzh, paramAttributeSet);
      zzuo = paramAttributeSet.zzj(paramBoolean1);
      zzpS = paramAttributeSet.getAdUnitId();
      if (paramViewGroup.isInEditMode()) {
        zzn.zzcS().zza(paramViewGroup, zza(paramzzh, zzuo[0], zzuS), "Ads by Google");
      }
      return;
    }
    catch (IllegalArgumentException paramAttributeSet)
    {
      zzn.zzcS().zza(paramViewGroup, new AdSizeParcel(paramzzh, AdSize.BANNER), paramAttributeSet.getMessage(), paramAttributeSet.getMessage());
    }
  }
  
  zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, zzh paramzzh, boolean paramBoolean2)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean1, paramzzh, null, paramBoolean2);
  }
  
  public zzab(ViewGroup paramViewGroup, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramViewGroup, paramAttributeSet, paramBoolean1, zzh.zzcO(), paramBoolean2);
  }
  
  public zzab(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    this(paramViewGroup, null, false, zzh.zzcO(), paramBoolean);
  }
  
  private static AdSizeParcel zza(Context paramContext, AdSize paramAdSize, boolean paramBoolean)
  {
    paramContext = new AdSizeParcel(paramContext, paramAdSize);
    paramContext.zzi(paramBoolean);
    return paramContext;
  }
  
  private static AdSizeParcel zza(Context paramContext, AdSize[] paramArrayOfAdSize, boolean paramBoolean)
  {
    paramContext = new AdSizeParcel(paramContext, paramArrayOfAdSize);
    paramContext.zzi(paramBoolean);
    return paramContext;
  }
  
  private void zzdf()
  {
    try
    {
      zzd localzzd = zzuL.zzaM();
      if (localzzd == null) {
        return;
      }
      zzuN.addView((View)com.google.android.gms.dynamic.zze.zzp(localzzd));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to get an ad frame.", localRemoteException);
    }
  }
  
  public void destroy()
  {
    try
    {
      if (zzuL != null) {
        zzuL.destroy();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to destroy AdView.", localRemoteException);
    }
  }
  
  public AdListener getAdListener()
  {
    return zztA;
  }
  
  public AdSize getAdSize()
  {
    try
    {
      if (zzuL != null)
      {
        Object localObject = zzuL.zzaN();
        if (localObject != null)
        {
          localObject = ((AdSizeParcel)localObject).zzcQ();
          return (AdSize)localObject;
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to get the current AdSize.", localRemoteException);
      if (zzuo != null) {
        return zzuo[0];
      }
    }
    return null;
  }
  
  public AdSize[] getAdSizes()
  {
    return zzuo;
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
  
  public boolean isLoading()
  {
    try
    {
      if (zzuL != null)
      {
        boolean bool = zzuL.isLoading();
        return bool;
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to check if ad is loading.", localRemoteException);
    }
    return false;
  }
  
  public void pause()
  {
    try
    {
      if (zzuL != null) {
        zzuL.pause();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to call pause.", localRemoteException);
    }
  }
  
  public void recordManualImpression()
  {
    if (zzuK.getAndSet(true)) {}
    for (;;)
    {
      return;
      try
      {
        if (zzuL != null)
        {
          zzuL.zzaP();
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to record impression.", localRemoteException);
      }
    }
  }
  
  public void resume()
  {
    try
    {
      if (zzuL != null) {
        zzuL.resume();
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to call resume.", localRemoteException);
    }
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
  
  public void setAdSizes(AdSize... paramVarArgs)
  {
    if (zzuo != null) {
      throw new IllegalStateException("The ad size can only be set once on AdView.");
    }
    zza(paramVarArgs);
  }
  
  public void setAdUnitId(String paramString)
  {
    if (zzpS != null) {
      throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
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
          break label56;
        }
      }
      label56:
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
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    zzpE = paramBoolean;
    try
    {
      if (zzuL != null) {
        zzuL.setManualImpressionsEnabled(zzpE);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set manual impressions.", localRemoteException);
    }
  }
  
  public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    zzuQ = paramOnCustomRenderedAdLoadedListener;
    try
    {
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
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the onCustomRenderedAdLoadedListener.", paramOnCustomRenderedAdLoadedListener);
    }
  }
  
  public void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    if (zzuO != null) {
      throw new IllegalStateException("InAppPurchaseListener has already been set.");
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
        zzdg();
      }
      if (zzuL.zzb(zzoB.zza(zzuN.getContext(), paramzzaa))) {
        zzuJ.zzg(paramzzaa.zzdb());
      }
      return;
    }
    catch (RemoteException paramzzaa)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to load ad.", paramzzaa);
    }
  }
  
  public void zza(AdSize... paramVarArgs)
  {
    zzuo = paramVarArgs;
    try
    {
      if (zzuL != null) {
        zzuL.zza(zza(zzuN.getContext(), zzuo, zzuS));
      }
      zzuN.requestLayout();
      return;
    }
    catch (RemoteException paramVarArgs)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to set the ad size.", paramVarArgs);
      }
    }
  }
  
  void zzdg()
  {
    if (((zzuo == null) || (zzpS == null)) && (zzuL == null)) {
      throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
    }
    zzuL = zzdh();
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
    zzuL.setManualImpressionsEnabled(zzpE);
    zzdf();
  }
  
  protected zzu zzdh()
  {
    Context localContext = zzuN.getContext();
    return zzn.zzcT().zza(localContext, zza(localContext, zzuo, zzuS), zzpS, zzuJ);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */