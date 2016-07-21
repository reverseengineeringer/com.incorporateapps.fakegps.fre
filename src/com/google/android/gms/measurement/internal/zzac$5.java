package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

class zzac$5
  implements Runnable
{
  zzac$5(zzac paramzzac, UserAttributeParcel paramUserAttributeParcel) {}
  
  public void run()
  {
    zzm localzzm = zzac.zzc(zzaYU);
    if (localzzm == null)
    {
      zzaYU.zzAo().zzCE().zzfg("Discarding data. Failed to set user attribute");
      return;
    }
    try
    {
      localzzm.zza(zzaYB, zzaYU.zzCg().zzfe(zzaYU.zzAo().zzCL()));
      zzac.zzd(zzaYU);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzaYU.zzAo().zzCE().zzj("Failed to send attribute to AppMeasurementService", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzac.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */