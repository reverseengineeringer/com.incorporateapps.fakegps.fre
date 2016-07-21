package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.DataUpdateRequest;

class zzpc$3
  extends zzob.zzc
{
  zzpc$3(zzpc paramzzpc, GoogleApiClient paramGoogleApiClient, DataUpdateRequest paramDataUpdateRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzob paramzzob)
  {
    zzph localzzph = new zzph(this);
    ((zzom)paramzzob.zzqJ()).zza(new DataUpdateRequest(zzazY, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpc.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */