package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzl$zza
  extends zzl.zzb
{
  public zzl$zza(Api.zzc paramzzc, GoogleApiClient paramGoogleApiClient)
  {
    super(paramzzc, paramGoogleApiClient);
  }
  
  protected AutocompletePredictionBuffer zzaV(Status paramStatus)
  {
    return new AutocompletePredictionBuffer(DataHolder.zzbI(paramStatus.getStatusCode()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.zzl.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */