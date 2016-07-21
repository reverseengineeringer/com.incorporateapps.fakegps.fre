package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataItemResult;

class zzx$2
  extends zzi
{
  zzx$2(zzx paramzzx, GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zza(this, zzbds);
  }
  
  protected DataApi.DataItemResult zzbv(Status paramStatus)
  {
    return new zzx.zza(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */