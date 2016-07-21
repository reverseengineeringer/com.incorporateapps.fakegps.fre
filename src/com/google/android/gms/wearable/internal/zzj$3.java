package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult;

class zzj$3
  extends zzi
{
  zzj$3(zzj paramzzj, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzr(this, zzbrM);
  }
  
  protected CapabilityApi.AddLocalCapabilityResult zzbq(Status paramStatus)
  {
    return new zzj.zza(paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzj.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */