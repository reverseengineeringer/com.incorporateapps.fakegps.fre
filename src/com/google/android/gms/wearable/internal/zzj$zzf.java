package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;

final class zzj$zzf
  extends zzi
{
  private CapabilityApi.CapabilityListener zzbrQ;
  
  private zzj$zzf(GoogleApiClient paramGoogleApiClient, CapabilityApi.CapabilityListener paramCapabilityListener)
  {
    super(paramGoogleApiClient);
    zzbrQ = paramCapabilityListener;
  }
  
  protected final void zza(zzbp paramzzbp)
  {
    paramzzbp.zza(this, zzbrQ);
    zzbrQ = null;
  }
  
  public final Status zzb(Status paramStatus)
  {
    zzbrQ = null;
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzj.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */