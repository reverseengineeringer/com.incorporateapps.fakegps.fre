package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.StartBleScanRequest;

class zzpa$1
  extends zznz.zzc
{
  zzpa$1(zzpa paramzzpa, GoogleApiClient paramGoogleApiClient, StartBleScanRequest paramStartBleScanRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zznz paramzznz)
  {
    zzph localzzph = new zzph(this);
    ((zzok)paramzznz.zzqJ()).zza(new StartBleScanRequest(zzazM, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpa.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */