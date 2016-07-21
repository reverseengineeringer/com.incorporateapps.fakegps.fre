package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.DataDeleteRequest;

class zzpc$2
  extends zzob.zzc
{
  zzpc$2(zzpc paramzzpc, GoogleApiClient paramGoogleApiClient, DataDeleteRequest paramDataDeleteRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzob paramzzob)
  {
    zzph localzzph = new zzph(this);
    ((zzom)paramzzob.zzqJ()).zza(new DataDeleteRequest(zzazX, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpc.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */