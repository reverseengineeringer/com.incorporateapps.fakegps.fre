package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;

class zzj$1
  extends zzi
{
  zzj$1(zzj paramzzj, GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzg(this, zzbrM, zzbrN);
  }
  
  protected CapabilityApi.GetCapabilityResult zzbo(Status paramStatus)
  {
    return new zzj.zze(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzj.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */