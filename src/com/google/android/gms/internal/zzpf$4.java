package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;

class zzpf$4
  extends zzoe.zzc
{
  zzpf$4(zzpf paramzzpf, GoogleApiClient paramGoogleApiClient, zzpf.zza paramzza, zzk paramzzk, PendingIntent paramPendingIntent)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzoe paramzzoe)
  {
    zzpf.zzc localzzc = new zzpf.zzc(this, zzaAn, null);
    ((zzop)paramzzoe.zzqJ()).zza(new SensorUnregistrationRequest(zzaAo, zzaAp, localzzc));
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpf.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */