package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

class zzac$3
  implements Runnable
{
  zzac$3(zzac paramzzac) {}
  
  public void run()
  {
    zzm localzzm = zzac.zzc(zzaYU);
    if (localzzm == null)
    {
      zzaYU.zzAo().zzCE().zzfg("Failed to send measurementEnabled to service");
      return;
    }
    try
    {
      localzzm.zzb(zzaYU.zzCg().zzfe(zzaYU.zzAo().zzCL()));
      zzac.zzd(zzaYU);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzaYU.zzAo().zzCE().zzj("Failed to send measurementEnabled to AppMeasurementService", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzac.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */