package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzah$1
  implements Runnable
{
  zzah$1(zzah paramzzah) {}
  
  public void run()
  {
    if (zzah.zza(zzva) != null) {}
    try
    {
      zzah.zza(zzva).onAdFailedToLoad(1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not notify onAdFailedToLoad event.", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzah.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */