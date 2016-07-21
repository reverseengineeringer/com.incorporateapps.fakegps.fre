package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzfk$11
  implements Runnable
{
  zzfk$11(zzfk paramzzfk) {}
  
  public void run()
  {
    try
    {
      zzfk.zza(zzCQ).onAdLeftApplication();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLeftApplication.", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfk.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */