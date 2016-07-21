package com.google.android.gms.internal;

import java.util.Map;

class zzhf$1
  implements zzdf
{
  zzhf$1(zzhf paramzzhf) {}
  
  public void zza(zzjp arg1, Map paramMap)
  {
    synchronized (zzhf.zza(zzJm))
    {
      if (zzhf.zzb(zzJm).isDone()) {
        return;
      }
      if (!zzhf.zzc(zzJm).equals(paramMap.get("request_id"))) {
        return;
      }
    }
    paramMap = new zzhi(1, paramMap);
    zzin.zzaK("Invalid " + paramMap.getType() + " request error: " + paramMap.zzgE());
    zzhf.zzb(zzJm).zzg(paramMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhf.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */