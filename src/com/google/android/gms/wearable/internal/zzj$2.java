package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult;

class zzj$2
  extends zzi
{
  zzj$2(zzj paramzzj, GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzb(this, zzbrN);
  }
  
  protected CapabilityApi.GetAllCapabilitiesResult zzbp(Status paramStatus)
  {
    return new zzj.zzd(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzj.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */