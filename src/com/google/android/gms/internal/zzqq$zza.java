package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

abstract class zzqq$zza
  extends zzqq.zzc
{
  public zzqq$zza(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected PanoramaApi.PanoramaResult zzbd(Status paramStatus)
  {
    return new zzqs(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqq.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */