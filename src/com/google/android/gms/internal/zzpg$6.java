package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;

class zzpg$6
  extends zzof.zzc
{
  zzpg$6(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzph localzzph = new zzph(this);
    ((zzoq)paramzzof.zzqJ()).zza(new SessionUnregistrationRequest(zzaAl, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpg.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */