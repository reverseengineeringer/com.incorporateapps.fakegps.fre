package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

abstract class Cast$zza
  extends zzb
{
  public Cast$zza(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Cast.ApplicationConnectionResult zzo(Status paramStatus)
  {
    return new Cast.zza.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.Cast.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */