package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;

class zzx$3
  extends zzi
{
  zzx$3(zzx paramzzx, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzr(this);
  }
  
  protected DataItemBuffer zzbw(Status paramStatus)
  {
    return new DataItemBuffer(DataHolder.zzbI(paramStatus.getStatusCode()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */