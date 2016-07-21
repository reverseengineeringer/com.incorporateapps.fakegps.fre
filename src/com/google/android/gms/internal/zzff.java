package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.common.internal.zzx;

public final class zzff
  implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener
{
  private final zzez zzCK;
  private NativeAdMapper zzCL;
  
  public zzff(zzez paramzzez)
  {
    zzCK = paramzzez;
  }
  
  public final void onAdClicked(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClicked.");
    try
    {
      zzCK.onAdClicked();
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzb.zzd("Could not call onAdClicked.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdClicked(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClicked.");
    try
    {
      zzCK.onAdClicked();
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzb.zzd("Could not call onAdClicked.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdClicked(MediationNativeAdapter paramMediationNativeAdapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClicked.");
    try
    {
      zzCK.onAdClicked();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzb.zzd("Could not call onAdClicked.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdClosed(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClosed.");
    try
    {
      zzCK.onAdClosed();
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzb.zzd("Could not call onAdClosed.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdClosed(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClosed.");
    try
    {
      zzCK.onAdClosed();
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzb.zzd("Could not call onAdClosed.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdClosed(MediationNativeAdapter paramMediationNativeAdapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClosed.");
    try
    {
      zzCK.onAdClosed();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzb.zzd("Could not call onAdClosed.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdFailedToLoad(MediationBannerAdapter paramMediationBannerAdapter, int paramInt)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdFailedToLoad with error. " + paramInt);
    try
    {
      zzCK.onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdFailedToLoad(MediationInterstitialAdapter paramMediationInterstitialAdapter, int paramInt)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      zzCK.onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdFailedToLoad(MediationNativeAdapter paramMediationNativeAdapter, int paramInt)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdFailedToLoad with error " + paramInt + ".");
    try
    {
      zzCK.onAdFailedToLoad(paramInt);
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdLeftApplication(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLeftApplication.");
    try
    {
      zzCK.onAdLeftApplication();
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzb.zzd("Could not call onAdLeftApplication.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdLeftApplication(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLeftApplication.");
    try
    {
      zzCK.onAdLeftApplication();
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzb.zzd("Could not call onAdLeftApplication.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdLeftApplication(MediationNativeAdapter paramMediationNativeAdapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLeftApplication.");
    try
    {
      zzCK.onAdLeftApplication();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzb.zzd("Could not call onAdLeftApplication.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdLoaded(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLoaded.");
    try
    {
      zzCK.onAdLoaded();
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzb.zzd("Could not call onAdLoaded.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdLoaded(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLoaded.");
    try
    {
      zzCK.onAdLoaded();
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzb.zzd("Could not call onAdLoaded.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdLoaded(MediationNativeAdapter paramMediationNativeAdapter, NativeAdMapper paramNativeAdMapper)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLoaded.");
    zzCL = paramNativeAdMapper;
    try
    {
      zzCK.onAdLoaded();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzb.zzd("Could not call onAdLoaded.", paramMediationNativeAdapter);
    }
  }
  
  public final void onAdOpened(MediationBannerAdapter paramMediationBannerAdapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdOpened.");
    try
    {
      zzCK.onAdOpened();
      return;
    }
    catch (RemoteException paramMediationBannerAdapter)
    {
      zzb.zzd("Could not call onAdOpened.", paramMediationBannerAdapter);
    }
  }
  
  public final void onAdOpened(MediationInterstitialAdapter paramMediationInterstitialAdapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdOpened.");
    try
    {
      zzCK.onAdOpened();
      return;
    }
    catch (RemoteException paramMediationInterstitialAdapter)
    {
      zzb.zzd("Could not call onAdOpened.", paramMediationInterstitialAdapter);
    }
  }
  
  public final void onAdOpened(MediationNativeAdapter paramMediationNativeAdapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdOpened.");
    try
    {
      zzCK.onAdOpened();
      return;
    }
    catch (RemoteException paramMediationNativeAdapter)
    {
      zzb.zzd("Could not call onAdOpened.", paramMediationNativeAdapter);
    }
  }
  
  public final NativeAdMapper zzeJ()
  {
    return zzCL;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzff
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */