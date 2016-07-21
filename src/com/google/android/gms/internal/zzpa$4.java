package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;

class zzpa$4
  extends zznz.zzc
{
  zzpa$4(zzpa paramzzpa, GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zznz paramzznz)
  {
    zzph localzzph = new zzph(this);
    ((zzok)paramzznz.zzqJ()).zza(new ClaimBleDeviceRequest(zzazQ.getAddress(), zzazQ, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpa.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */