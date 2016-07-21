package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.UnsubscribeRequest;

class zzpe$4
  extends zzod.zzc
{
  zzpe$4(zzpe paramzzpe, GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzod paramzzod)
  {
    zzph localzzph = new zzph(this);
    ((zzoo)paramzzod.zzqJ()).zza(new UnsubscribeRequest(zzaAa, null, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpe.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */