package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;

class zzpa$3
  extends zznz.zzc
{
  zzpa$3(zzpa paramzzpa, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zznz paramzznz)
  {
    zzph localzzph = new zzph(this);
    ((zzok)paramzznz.zzqJ()).zza(new ClaimBleDeviceRequest(zzazP, null, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpa.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */