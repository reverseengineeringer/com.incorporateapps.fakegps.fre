package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

class zzpa$6
  extends zznz.zza
{
  zzpa$6(zzpa paramzzpa, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected BleDevicesResult zzI(Status paramStatus)
  {
    return BleDevicesResult.zzQ(paramStatus);
  }
  
  protected void zza(zznz paramzznz)
  {
    zzpa.zza localzza = new zzpa.zza(this, null);
    ((zzok)paramzznz.zzqJ()).zza(new ListClaimedBleDevicesRequest(localzza));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpa.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */