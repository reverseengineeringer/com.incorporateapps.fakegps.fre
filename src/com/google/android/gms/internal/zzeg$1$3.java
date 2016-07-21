package com.google.android.gms.internal;

import java.util.Map;

class zzeg$1$3
  implements zzdf
{
  zzeg$1$3(zzeg.1 param1, zzed paramzzed, zzja paramzzja) {}
  
  public void zza(zzjp arg1, Map paramMap)
  {
    synchronized (zzeg.zzc(zzBg.zzBe))
    {
      zzin.zzaJ("JS Engine is requesting an update");
      if (zzeg.zze(zzBg.zzBe) == 0)
      {
        zzin.zzaJ("Starting reload.");
        zzeg.zza(zzBg.zzBe, 2);
        zzBg.zzBe.zzeq();
      }
      zzBf.zzb("/requestReload", (zzdf)zzBj.get());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeg.1.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */