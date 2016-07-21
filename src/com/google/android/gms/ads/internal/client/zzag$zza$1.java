package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzag$zza$1
  implements Runnable
{
  zzag$zza$1(zzag.zza paramzza) {}
  
  public void run()
  {
    if (zzag.zza(zzuZ.zzuY) != null) {}
    try
    {
      zzag.zza(zzuZ.zzuY).onAdFailedToLoad(1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not notify onAdFailedToLoad event.", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzag.zza.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */