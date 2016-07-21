package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzl$zzd
  extends zzl.zzb
{
  public zzl$zzd(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected PlaceLikelihoodBuffer zzaX(Status paramStatus)
  {
    return new PlaceLikelihoodBuffer(DataHolder.zzbI(paramStatus.getStatusCode()), 100, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.zzl.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */