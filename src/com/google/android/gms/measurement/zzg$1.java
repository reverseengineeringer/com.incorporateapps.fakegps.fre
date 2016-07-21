package com.google.android.gms.measurement;

import java.util.Iterator;
import java.util.List;

class zzg$1
  implements Runnable
{
  zzg$1(zzg paramzzg, zzc paramzzc) {}
  
  public void run()
  {
    zzaUA.zzAB().zza(zzaUA);
    Iterator localIterator = zzg.zza(zzaUB).iterator();
    while (localIterator.hasNext()) {
      ((zzh)localIterator.next()).zza(zzaUA);
    }
    zzg.zza(zzaUB, zzaUA);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.zzg.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */