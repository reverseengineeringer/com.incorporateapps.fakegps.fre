package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzal$1
  implements Runnable
{
  zzal$1(zzal paramzzal) {}
  
  public void run()
  {
    if (zzal.zza(zzvc) != null) {}
    try
    {
      zzal.zza(zzvc).onRewardedVideoAdFailedToLoad(1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not notify onRewardedVideoAdFailedToLoad event.", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzal.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */