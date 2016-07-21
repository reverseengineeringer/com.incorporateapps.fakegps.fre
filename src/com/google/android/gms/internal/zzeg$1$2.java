package com.google.android.gms.internal;

import java.util.Map;

class zzeg$1$2
  implements zzdf
{
  zzeg$1$2(zzeg.1 param1, zzed paramzzed) {}
  
  public void zza(zzjp arg1, Map paramMap)
  {
    synchronized (zzeg.zzc(zzBg.zzBe))
    {
      if ((zzBg.zzBd.getStatus() == -1) || (zzBg.zzBd.getStatus() == 1)) {
        return;
      }
      zzeg.zza(zzBg.zzBe, 0);
      zzeg.zzd(zzBg.zzBe).zze(zzBf);
      zzBg.zzBd.zzh(zzBf);
      zzeg.zza(zzBg.zzBe, zzBg.zzBd);
      zzin.v("Successfully loaded JS Engine.");
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeg.1.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */