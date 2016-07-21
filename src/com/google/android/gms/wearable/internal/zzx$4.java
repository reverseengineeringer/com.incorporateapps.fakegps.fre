package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;

class zzx$4
  extends zzi
{
  zzx$4(zzx paramzzx, GoogleApiClient paramGoogleApiClient, Uri paramUri, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zza(this, zzbds, zzbsr);
  }
  
  protected DataItemBuffer zzbw(Status paramStatus)
  {
    return new DataItemBuffer(DataHolder.zzbI(paramStatus.getStatusCode()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */