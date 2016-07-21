package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

class zza$1
  implements zzf
{
  zza$1(zza paramzza) {}
  
  public void zza(LifecycleDelegate paramLifecycleDelegate)
  {
    zza.zza(zzavB, paramLifecycleDelegate);
    paramLifecycleDelegate = zza.zza(zzavB).iterator();
    while (paramLifecycleDelegate.hasNext()) {
      ((zza.zza)paramLifecycleDelegate.next()).zzb(zza.zzb(zzavB));
    }
    zza.zza(zzavB).clear();
    zza.zza(zzavB, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.zza.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */