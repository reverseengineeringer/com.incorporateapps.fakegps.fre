package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;

class zzfk$1
  implements Runnable
{
  zzfk$1(zzfk paramzzfk) {}
  
  public void run()
  {
    try
    {
      zzfk.zza(zzCQ).onAdClicked();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdClicked.", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfk.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */