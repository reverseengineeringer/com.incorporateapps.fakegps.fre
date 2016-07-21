package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItemAsset;

class zzx$7
  extends zzi
{
  zzx$7(zzx paramzzx, GoogleApiClient paramGoogleApiClient, DataItemAsset paramDataItemAsset)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zza(this, zzbst);
  }
  
  protected DataApi.GetFdForAssetResult zzby(Status paramStatus)
  {
    return new zzx.zzc(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */