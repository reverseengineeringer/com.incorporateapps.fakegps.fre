package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

class zzac$6
  implements Runnable
{
  zzac$6(zzac paramzzac) {}
  
  public void run()
  {
    zzm localzzm = zzac.zzc(zzaYU);
    if (localzzm == null)
    {
      zzaYU.zzAo().zzCE().zzfg("Discarding data. Failed to send app launch");
      return;
    }
    try
    {
      localzzm.zza(zzaYU.zzCg().zzfe(zzaYU.zzAo().zzCL()));
      zzac.zzd(zzaYU);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzaYU.zzAo().zzCE().zzj("Failed to send app launch to AppMeasurementService", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzac.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */