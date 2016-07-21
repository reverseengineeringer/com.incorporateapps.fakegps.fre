package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.b;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzfk$10
  implements Runnable
{
  zzfk$10(zzfk paramzzfk, b paramb) {}
  
  public void run()
  {
    try
    {
      zzfk.zza(zzCQ).onAdFailedToLoad(zzfl.zza(zzCR));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfk.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */