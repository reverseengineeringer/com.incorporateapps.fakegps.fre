package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;

class zzbb$1
  extends zzi
{
  zzbb$1(zzbb paramzzbb, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzs(this);
  }
  
  protected NodeApi.GetLocalNodeResult zzbA(Status paramStatus)
  {
    return new zzbb.zzb(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbb.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */