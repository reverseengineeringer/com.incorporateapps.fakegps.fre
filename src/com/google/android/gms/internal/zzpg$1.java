package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionStartRequest;

class zzpg$1
  extends zzof.zzc
{
  zzpg$1(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, Session paramSession)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzph localzzph = new zzph(this);
    ((zzoq)paramzzof.zzqJ()).zza(new SessionStartRequest(zzaAr, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpg.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */