package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzx;

public final class Api
{
  private final String mName;
  private final Api.zzc zzaeE;
  private final Api.zza zzafW;
  private final Api.zze zzafX;
  private final Api.zzf zzafY;
  
  public Api(String paramString, Api.zza paramzza, Api.zzc paramzzc)
  {
    zzx.zzb(paramzza, "Cannot construct an Api with a null ClientBuilder");
    zzx.zzb(paramzzc, "Cannot construct an Api with a null ClientKey");
    mName = paramString;
    zzafW = paramzza;
    zzafX = null;
    zzaeE = paramzzc;
    zzafY = null;
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final Api.zza zzoP()
  {
    if (zzafW != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return zzafW;
    }
  }
  
  public final Api.zze zzoQ()
  {
    if (zzafX != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "This API was constructed with a ClientBuilder. Use getClientBuilder");
      return zzafX;
    }
  }
  
  public final Api.zzc zzoR()
  {
    if (zzaeE != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
      return zzaeE;
    }
  }
  
  public final boolean zzoS()
  {
    return zzafY != null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.Api
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */