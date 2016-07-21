package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzfk$2
  implements Runnable
{
  zzfk$2(zzfk paramzzfk) {}
  
  public void run()
  {
    try
    {
      zzfk.zza(zzCQ).onAdOpened();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdOpened.", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfk.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */