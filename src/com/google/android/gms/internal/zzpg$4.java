package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;

class zzpg$4
  extends zzof.zza
{
  zzpg$4(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, SessionReadRequest paramSessionReadRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected SessionReadResult zzP(Status paramStatus)
  {
    return SessionReadResult.zzU(paramStatus);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzpg.zza localzza = new zzpg.zza(this, null);
    ((zzoq)paramzzof.zzqJ()).zza(new SessionReadRequest(zzaAv, localzza));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpg.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */