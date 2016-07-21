package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;

class zzpg$5
  extends zzof.zzc
{
  zzpg$5(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzph localzzph = new zzph(this);
    ((zzoq)paramzzof.zzqJ()).zza(new SessionRegistrationRequest(zzaAl, localzzph, zzaAw));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpg.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */