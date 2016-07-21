package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.result.SessionStopResult;

class zzpg$2
  extends zzof.zza
{
  zzpg$2(zzpg paramzzpg, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    super(paramGoogleApiClient);
  }
  
  protected SessionStopResult zzO(Status paramStatus)
  {
    return SessionStopResult.zzV(paramStatus);
  }
  
  protected void zza(zzof paramzzof)
  {
    zzpg.zzb localzzb = new zzpg.zzb(this, null);
    ((zzoq)paramzzof.zzqJ()).zza(new SessionStopRequest(val$name, zzaAt, localzzb));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpg.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */