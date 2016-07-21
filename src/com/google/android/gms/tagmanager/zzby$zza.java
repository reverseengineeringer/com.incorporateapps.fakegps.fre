package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzmq;

class zzby$zza
  implements zzcx.zza
{
  zzby$zza(zzby paramzzby) {}
  
  public void zza(zzaq paramzzaq)
  {
    zzby.zza(zzbjK, paramzzaq.zzGD());
  }
  
  public void zzb(zzaq paramzzaq)
  {
    zzby.zza(zzbjK, paramzzaq.zzGD());
    zzbg.v("Permanent failure dispatching hitId: " + paramzzaq.zzGD());
  }
  
  public void zzc(zzaq paramzzaq)
  {
    long l = paramzzaq.zzGE();
    if (l == 0L) {
      zzby.zza(zzbjK, paramzzaq.zzGD(), zzby.zza(zzbjK).currentTimeMillis());
    }
    while (l + 14400000L >= zzby.zza(zzbjK).currentTimeMillis()) {
      return;
    }
    zzby.zza(zzbjK, paramzzaq.zzGD());
    zzbg.v("Giving up on failed hitId: " + paramzzaq.zzGD());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzby.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */