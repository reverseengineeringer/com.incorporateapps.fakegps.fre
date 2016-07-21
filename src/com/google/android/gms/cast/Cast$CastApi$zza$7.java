package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzh;
import com.google.android.gms.common.api.GoogleApiClient;

class Cast$CastApi$zza$7
  extends zzh
{
  Cast$CastApi$zza$7(Cast.CastApi.zza paramzza, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zze paramzze)
  {
    if (TextUtils.isEmpty(val$sessionId))
    {
      zze(2001, "IllegalArgument: sessionId cannot be null or empty");
      return;
    }
    try
    {
      paramzze.zza(val$sessionId, this);
      return;
    }
    catch (IllegalStateException paramzze)
    {
      zzbj(2001);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.Cast.CastApi.zza.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */