package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.common.api.GoogleApiClient;

class Cast$CastApi$zza$2
  extends Cast.zza
{
  Cast$CastApi$zza$2(Cast.CastApi.zza paramzza, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    try
    {
      paramzze.zza(zzZI, false, this);
      return;
    }
    catch (IllegalStateException paramzze)
    {
      zzbj(2001);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.Cast.CastApi.zza.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */