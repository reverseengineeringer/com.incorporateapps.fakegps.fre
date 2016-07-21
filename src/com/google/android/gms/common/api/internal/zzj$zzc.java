package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

class zzj$zzc
  extends zzn
{
  private WeakReference zzail;
  
  zzj$zzc(zzj paramzzj)
  {
    zzail = new WeakReference(paramzzj);
  }
  
  public void zzpJ()
  {
    zzj localzzj = (zzj)zzail.get();
    if (localzzj == null) {
      return;
    }
    zzj.zzb(localzzj);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzj.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */