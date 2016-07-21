package com.google.android.gms.internal;

import android.os.RemoteException;

class zzev$1
  implements Runnable
{
  zzev$1(zzev paramzzev, zzes paramzzes) {}
  
  public void run()
  {
    try
    {
      zzCE.zzCq.destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not destroy mediation adapter.", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzev.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */