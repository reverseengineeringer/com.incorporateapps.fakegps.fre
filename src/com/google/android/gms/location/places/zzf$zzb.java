package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

public abstract class zzf$zzb
  extends zzl.zzb
{
  public zzf$zzb(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected PlacePhotoMetadataResult zzaT(Status paramStatus)
  {
    return new PlacePhotoMetadataResult(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.zzf.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */