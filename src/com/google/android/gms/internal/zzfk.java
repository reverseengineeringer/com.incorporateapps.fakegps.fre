package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.b;
import com.google.ads.mediation.j;
import com.google.ads.mediation.k;
import com.google.ads.mediation.l;
import com.google.ads.mediation.m;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

public final class zzfk
  implements k, m
{
  private final zzez zzCK;
  
  public zzfk(zzez paramzzez)
  {
    zzCK = paramzzez;
  }
  
  public final void onClick(j paramj)
  {
    zzb.zzaI("Adapter called onClick.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onClick must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.1(this));
      return;
    }
    try
    {
      zzCK.onAdClicked();
      return;
    }
    catch (RemoteException paramj)
    {
      zzb.zzd("Could not call onAdClicked.", paramj);
    }
  }
  
  public final void onDismissScreen(j paramj)
  {
    zzb.zzaI("Adapter called onDismissScreen.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onDismissScreen must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.4(this));
      return;
    }
    try
    {
      zzCK.onAdClosed();
      return;
    }
    catch (RemoteException paramj)
    {
      zzb.zzd("Could not call onAdClosed.", paramj);
    }
  }
  
  public final void onDismissScreen(l paraml)
  {
    zzb.zzaI("Adapter called onDismissScreen.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onDismissScreen must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.9(this));
      return;
    }
    try
    {
      zzCK.onAdClosed();
      return;
    }
    catch (RemoteException paraml)
    {
      zzb.zzd("Could not call onAdClosed.", paraml);
    }
  }
  
  public final void onFailedToReceiveAd(j paramj, b paramb)
  {
    zzb.zzaI("Adapter called onFailedToReceiveAd with error. " + paramb);
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onFailedToReceiveAd must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.5(this, paramb));
      return;
    }
    try
    {
      zzCK.onAdFailedToLoad(zzfl.zza(paramb));
      return;
    }
    catch (RemoteException paramj)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", paramj);
    }
  }
  
  public final void onFailedToReceiveAd(l paraml, b paramb)
  {
    zzb.zzaI("Adapter called onFailedToReceiveAd with error " + paramb + ".");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onFailedToReceiveAd must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.10(this, paramb));
      return;
    }
    try
    {
      zzCK.onAdFailedToLoad(zzfl.zza(paramb));
      return;
    }
    catch (RemoteException paraml)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", paraml);
    }
  }
  
  public final void onLeaveApplication(j paramj)
  {
    zzb.zzaI("Adapter called onLeaveApplication.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onLeaveApplication must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.6(this));
      return;
    }
    try
    {
      zzCK.onAdLeftApplication();
      return;
    }
    catch (RemoteException paramj)
    {
      zzb.zzd("Could not call onAdLeftApplication.", paramj);
    }
  }
  
  public final void onLeaveApplication(l paraml)
  {
    zzb.zzaI("Adapter called onLeaveApplication.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onLeaveApplication must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.11(this));
      return;
    }
    try
    {
      zzCK.onAdLeftApplication();
      return;
    }
    catch (RemoteException paraml)
    {
      zzb.zzd("Could not call onAdLeftApplication.", paraml);
    }
  }
  
  public final void onPresentScreen(j paramj)
  {
    zzb.zzaI("Adapter called onPresentScreen.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onPresentScreen must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.7(this));
      return;
    }
    try
    {
      zzCK.onAdOpened();
      return;
    }
    catch (RemoteException paramj)
    {
      zzb.zzd("Could not call onAdOpened.", paramj);
    }
  }
  
  public final void onPresentScreen(l paraml)
  {
    zzb.zzaI("Adapter called onPresentScreen.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onPresentScreen must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.2(this));
      return;
    }
    try
    {
      zzCK.onAdOpened();
      return;
    }
    catch (RemoteException paraml)
    {
      zzb.zzd("Could not call onAdOpened.", paraml);
    }
  }
  
  public final void onReceivedAd(j paramj)
  {
    zzb.zzaI("Adapter called onReceivedAd.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onReceivedAd must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.8(this));
      return;
    }
    try
    {
      zzCK.onAdLoaded();
      return;
    }
    catch (RemoteException paramj)
    {
      zzb.zzd("Could not call onAdLoaded.", paramj);
    }
  }
  
  public final void onReceivedAd(l paraml)
  {
    zzb.zzaI("Adapter called onReceivedAd.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onReceivedAd must be called on the main UI thread.");
      zza.zzMS.post(new zzfk.3(this));
      return;
    }
    try
    {
      zzCK.onAdLoaded();
      return;
    }
    catch (RemoteException paraml)
    {
      zzb.zzd("Could not call onAdLoaded.", paraml);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */