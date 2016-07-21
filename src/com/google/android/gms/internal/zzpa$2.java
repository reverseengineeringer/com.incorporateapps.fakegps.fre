package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StopBleScanRequest;

class zzpa$2
  extends zznz.zzc
{
  zzpa$2(zzpa paramzzpa, GoogleApiClient paramGoogleApiClient, BleScanCallback paramBleScanCallback)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zznz paramzznz)
  {
    zzph localzzph = new zzph(this);
    ((zzok)paramzznz.zzqJ()).zza(new StopBleScanRequest(zzazO, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpa.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */