package com.google.android.gms.nearby.messages.internal;

import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.common.api.internal.zzq;

abstract class zzm$zzg
{
  private final SimpleArrayMap zzanP = new SimpleArrayMap(1);
  
  zzm.zza zzG(Object paramObject)
  {
    return (zzm.zza)zzanP.get(paramObject);
  }
  
  zzm.zza zzH(Object paramObject)
  {
    paramObject = (zzm.zza)zzanP.remove(paramObject);
    if (paramObject != null) {
      ((zzm.zza)paramObject).zzEE().clear();
    }
    return (zzm.zza)paramObject;
  }
  
  zzm.zza zza(zzq paramzzq, Object paramObject)
  {
    zzm.zza localzza = (zzm.zza)zzanP.get(paramObject);
    if (localzza != null)
    {
      paramzzq.clear();
      return localzza;
    }
    paramzzq = zzf(paramzzq);
    zzanP.put(paramObject, paramzzq);
    return paramzzq;
  }
  
  protected abstract zzm.zza zzf(zzq paramzzq);
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzm.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */