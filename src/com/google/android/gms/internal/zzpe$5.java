package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.request.UnsubscribeRequest;

class zzpe$5
  extends zzod.zzc
{
  zzpe$5(zzpe paramzzpe, GoogleApiClient paramGoogleApiClient, DataSource paramDataSource)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzod paramzzod)
  {
    zzph localzzph = new zzph(this);
    ((zzoo)paramzzod.zzqJ()).zza(new UnsubscribeRequest(null, zzaAg, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpe.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */