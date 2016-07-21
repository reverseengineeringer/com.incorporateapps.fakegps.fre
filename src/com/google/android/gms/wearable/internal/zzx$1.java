package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.PutDataRequest;

class zzx$1
  extends zzi
{
  zzx$1(zzx paramzzx, GoogleApiClient paramGoogleApiClient, PutDataRequest paramPutDataRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zza(this, zzbsp);
  }
  
  public DataApi.DataItemResult zzbv(Status paramStatus)
  {
    return new zzx.zza(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */