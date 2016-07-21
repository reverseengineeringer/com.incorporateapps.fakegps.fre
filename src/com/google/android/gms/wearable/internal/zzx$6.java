package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;

class zzx$6
  extends zzi
{
  zzx$6(zzx paramzzx, GoogleApiClient paramGoogleApiClient, Asset paramAsset)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zza(this, zzbss);
  }
  
  protected DataApi.GetFdForAssetResult zzby(Status paramStatus)
  {
    return new zzx.zzc(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzx.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */