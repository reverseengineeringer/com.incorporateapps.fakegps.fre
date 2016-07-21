package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorRequest;

class zzpf$2
  extends zzoe.zzc
{
  zzpf$2(zzpf paramzzpf, GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, zzk paramzzk, PendingIntent paramPendingIntent)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzoe paramzzoe)
  {
    zzph localzzph = new zzph(this);
    ((zzop)paramzzoe.zzqJ()).zza(new SensorRegistrationRequest(zzaAj, zzaAk, zzaAl, localzzph));
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpf.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */