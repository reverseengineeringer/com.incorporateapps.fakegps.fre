package com.google.android.gms.internal;

import android.os.Handler;

class zzeg$1
  implements Runnable
{
  zzeg$1(zzeg paramzzeg, zzeg.zze paramzze) {}
  
  public void run()
  {
    zzed localzzed = zzBe.zza(zzeg.zza(zzBe), zzeg.zzb(zzBe));
    localzzed.zza(new zzeg.1.1(this, localzzed));
    localzzed.zza("/jsLoaded", new zzeg.1.2(this, localzzed));
    zzja localzzja = new zzja();
    zzeg.1.3 local3 = new zzeg.1.3(this, localzzed, localzzja);
    localzzja.set(local3);
    localzzed.zza("/requestReload", local3);
    if (zzeg.zzf(zzBe).endsWith(".js")) {
      localzzed.zzZ(zzeg.zzf(zzBe));
    }
    for (;;)
    {
      zzir.zzMc.postDelayed(new zzeg.1.4(this, localzzed), zzeg.zza.zzBm);
      return;
      if (zzeg.zzf(zzBe).startsWith("<html>")) {
        localzzed.zzab(zzeg.zzf(zzBe));
      } else {
        localzzed.zzaa(zzeg.zzf(zzBe));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeg.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */