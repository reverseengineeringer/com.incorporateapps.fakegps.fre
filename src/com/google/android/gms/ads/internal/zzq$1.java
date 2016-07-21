package com.google.android.gms.ads.internal;

import java.lang.ref.WeakReference;

class zzq$1
  implements Runnable
{
  zzq$1(zzq paramzzq, WeakReference paramWeakReference) {}
  
  public void run()
  {
    zzq.zza(zzqM, false);
    zza localzza = (zza)zzqL.get();
    if (localzza != null) {
      localzza.zzd(zzq.zza(zzqM));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzq.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */