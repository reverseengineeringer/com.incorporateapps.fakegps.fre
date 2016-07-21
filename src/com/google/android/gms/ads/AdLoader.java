package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzb;

public class AdLoader
{
  private final Context mContext;
  private final zzh zzoB;
  private final zzr zzoC;
  
  AdLoader(Context paramContext, zzr paramzzr)
  {
    this(paramContext, paramzzr, zzh.zzcO());
  }
  
  AdLoader(Context paramContext, zzr paramzzr, zzh paramzzh)
  {
    mContext = paramContext;
    zzoC = paramzzr;
    zzoB = paramzzh;
  }
  
  private void zza(zzaa paramzzaa)
  {
    try
    {
      zzoC.zzf(zzoB.zza(mContext, paramzzaa));
      return;
    }
    catch (RemoteException paramzzaa)
    {
      zzb.zzb("Failed to load ad.", paramzzaa);
    }
  }
  
  public String getMediationAdapterClassName()
  {
    try
    {
      String str = zzoC.getMediationAdapterClassName();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Failed to get the mediation adapter class name.", localRemoteException);
    }
    return null;
  }
  
  public boolean isLoading()
  {
    try
    {
      boolean bool = zzoC.isLoading();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Failed to check if ad is loading.", localRemoteException);
    }
    return false;
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    zza(paramAdRequest.zzaE());
  }
  
  public void loadAd(PublisherAdRequest paramPublisherAdRequest)
  {
    zza(paramPublisherAdRequest.zzaE());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.AdLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */