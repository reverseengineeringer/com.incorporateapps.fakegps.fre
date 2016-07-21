package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.DisableFitRequest;

class zzpb$3
  extends zzoa.zzc
{
  zzpb$3(zzpb paramzzpb, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzoa paramzzoa)
  {
    zzph localzzph = new zzph(this);
    ((zzol)paramzzoa.zzqJ()).zza(new DisableFitRequest(localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpb.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */