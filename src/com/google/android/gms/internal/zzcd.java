package com.google.android.gms.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;

public class zzcd
  implements CustomRenderedAd
{
  private final zzce zzxH;
  
  public zzcd(zzce paramzzce)
  {
    zzxH = paramzzce;
  }
  
  public String getBaseUrl()
  {
    try
    {
      String str = zzxH.zzdF();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not delegate getBaseURL to CustomRenderedAd", localRemoteException);
    }
    return null;
  }
  
  public String getContent()
  {
    try
    {
      String str = zzxH.getContent();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not delegate getContent to CustomRenderedAd", localRemoteException);
    }
    return null;
  }
  
  public void onAdRendered(View paramView)
  {
    try
    {
      zzce localzzce = zzxH;
      if (paramView != null) {}
      for (paramView = zze.zzC(paramView);; paramView = null)
      {
        localzzce.zzb(paramView);
        return;
      }
      return;
    }
    catch (RemoteException paramView)
    {
      zzb.zzd("Could not delegate onAdRendered to CustomRenderedAd", paramView);
    }
  }
  
  public void recordClick()
  {
    try
    {
      zzxH.recordClick();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not delegate recordClick to CustomRenderedAd", localRemoteException);
    }
  }
  
  public void recordImpression()
  {
    try
    {
      zzxH.recordImpression();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not delegate recordImpression to CustomRenderedAd", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzcd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */