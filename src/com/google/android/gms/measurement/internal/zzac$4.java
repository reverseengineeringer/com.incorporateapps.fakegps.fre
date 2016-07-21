package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

class zzac$4
  implements Runnable
{
  zzac$4(zzac paramzzac, String paramString, EventParcel paramEventParcel) {}
  
  public void run()
  {
    zzm localzzm = zzac.zzc(zzaYU);
    if (localzzm == null)
    {
      zzaYU.zzAo().zzCE().zzfg("Discarding data. Failed to send event to service");
      return;
    }
    for (;;)
    {
      try
      {
        if (TextUtils.isEmpty(zzaHU))
        {
          localzzm.zza(zzaYz, zzaYU.zzCg().zzfe(zzaYU.zzAo().zzCL()));
          zzac.zzd(zzaYU);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        zzaYU.zzAo().zzCE().zzj("Failed to send event to AppMeasurementService", localRemoteException);
        return;
      }
      localRemoteException.zza(zzaYz, zzaHU, zzaYU.zzAo().zzCL());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzac.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */