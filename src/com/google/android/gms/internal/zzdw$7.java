package com.google.android.gms.internal;

import android.os.RemoteException;

class zzdw$7
  implements Runnable
{
  zzdw$7(zzdw paramzzdw, zzdw.zza paramzza, zzdx paramzzdx) {}
  
  public void run()
  {
    try
    {
      zzAo.zzb(zzAp);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not propagate interstitial ad event.", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdw.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */