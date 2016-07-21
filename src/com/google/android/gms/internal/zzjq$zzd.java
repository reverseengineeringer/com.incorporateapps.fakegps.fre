package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;

class zzjq$zzd
  implements zzdf
{
  private zzjq$zzd(zzjq paramzzjq) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    if (paramMap.keySet().contains("start")) {
      zzjq.zza(zzNL);
    }
    do
    {
      return;
      if (paramMap.keySet().contains("stop"))
      {
        zzjq.zzb(zzNL);
        return;
      }
    } while (!paramMap.keySet().contains("cancel"));
    zzjq.zzc(zzNL);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjq.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */