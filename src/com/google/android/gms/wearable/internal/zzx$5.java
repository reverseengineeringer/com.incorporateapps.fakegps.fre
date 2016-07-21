package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;

class zzx$5
  extends zzi
{
  zzx$5(zzx paramzzx, GoogleApiClient paramGoogleApiClient, Uri paramUri, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzb(this, zzbds, zzbsr);
  }
  
  protected DataApi.DeleteDataItemsResult zzbx(Status paramStatus)
  {
    return new zzx.zzb(paramStatus, 0);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */