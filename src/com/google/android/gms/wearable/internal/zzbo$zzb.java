package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.zza.zzb;

abstract class zzbo$zzb
  extends zza
{
  private zza.zzb zzUz;
  
  public zzbo$zzb(zza.zzb paramzzb)
  {
    zzUz = paramzzb;
  }
  
  public void zzX(Object paramObject)
  {
    zza.zzb localzzb = zzUz;
    if (localzzb != null)
    {
      localzzb.zzs(paramObject);
      zzUz = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbo.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */