package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzin;

public class zzb
  implements MediationRewardedVideoAdListener
{
  private final zza zzKR;
  
  public zzb(zza paramzza)
  {
    zzKR = paramzza;
  }
  
  public void onAdClicked(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdClicked.");
    try
    {
      zzKR.zzl(zze.zzC(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException paramMediationRewardedVideoAdAdapter)
    {
      zzin.zzd("Could not call onAdClicked.", paramMediationRewardedVideoAdAdapter);
    }
  }
  
  public void onAdClosed(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdClosed.");
    try
    {
      zzKR.zzk(zze.zzC(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException paramMediationRewardedVideoAdAdapter)
    {
      zzin.zzd("Could not call onAdClosed.", paramMediationRewardedVideoAdAdapter);
    }
  }
  
  public void onAdFailedToLoad(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, int paramInt)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdFailedToLoad.");
    try
    {
      zzKR.zzc(zze.zzC(paramMediationRewardedVideoAdAdapter), paramInt);
      return;
    }
    catch (RemoteException paramMediationRewardedVideoAdAdapter)
    {
      zzin.zzd("Could not call onAdFailedToLoad.", paramMediationRewardedVideoAdAdapter);
    }
  }
  
  public void onAdLeftApplication(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdLeftApplication.");
    try
    {
      zzKR.zzm(zze.zzC(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException paramMediationRewardedVideoAdAdapter)
    {
      zzin.zzd("Could not call onAdLeftApplication.", paramMediationRewardedVideoAdAdapter);
    }
  }
  
  public void onAdLoaded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdLoaded.");
    try
    {
      zzKR.zzh(zze.zzC(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException paramMediationRewardedVideoAdAdapter)
    {
      zzin.zzd("Could not call onAdLoaded.", paramMediationRewardedVideoAdAdapter);
    }
  }
  
  public void onAdOpened(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdOpened.");
    try
    {
      zzKR.zzi(zze.zzC(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException paramMediationRewardedVideoAdAdapter)
    {
      zzin.zzd("Could not call onAdOpened.", paramMediationRewardedVideoAdAdapter);
    }
  }
  
  public void onInitializationFailed(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, int paramInt)
  {
    zzx.zzcD("onInitializationFailed must be called on the main UI thread.");
    zzin.zzaI("Adapter called onInitializationFailed.");
    try
    {
      zzKR.zzb(zze.zzC(paramMediationRewardedVideoAdAdapter), paramInt);
      return;
    }
    catch (RemoteException paramMediationRewardedVideoAdAdapter)
    {
      zzin.zzd("Could not call onInitializationFailed.", paramMediationRewardedVideoAdAdapter);
    }
  }
  
  public void onInitializationSucceeded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onInitializationSucceeded must be called on the main UI thread.");
    zzin.zzaI("Adapter called onInitializationSucceeded.");
    try
    {
      zzKR.zzg(zze.zzC(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException paramMediationRewardedVideoAdAdapter)
    {
      zzin.zzd("Could not call onInitializationSucceeded.", paramMediationRewardedVideoAdAdapter);
    }
  }
  
  public void onRewarded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, RewardItem paramRewardItem)
  {
    zzx.zzcD("onRewarded must be called on the main UI thread.");
    zzin.zzaI("Adapter called onRewarded.");
    if (paramRewardItem != null) {}
    try
    {
      zzKR.zza(zze.zzC(paramMediationRewardedVideoAdAdapter), new RewardItemParcel(paramRewardItem));
      return;
    }
    catch (RemoteException paramMediationRewardedVideoAdAdapter)
    {
      zzin.zzd("Could not call onRewarded.", paramMediationRewardedVideoAdAdapter);
    }
    zzKR.zza(zze.zzC(paramMediationRewardedVideoAdAdapter), new RewardItemParcel(paramMediationRewardedVideoAdAdapter.getClass().getName(), 1));
    return;
  }
  
  public void onVideoStarted(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter)
  {
    zzx.zzcD("onVideoStarted must be called on the main UI thread.");
    zzin.zzaI("Adapter called onVideoStarted.");
    try
    {
      zzKR.zzj(zze.zzC(paramMediationRewardedVideoAdAdapter));
      return;
    }
    catch (RemoteException paramMediationRewardedVideoAdAdapter)
    {
      zzin.zzd("Could not call onVideoStarted.", paramMediationRewardedVideoAdAdapter);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.client.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */