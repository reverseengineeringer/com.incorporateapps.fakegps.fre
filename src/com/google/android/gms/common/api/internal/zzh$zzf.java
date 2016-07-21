package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

abstract class zzh$zzf
  implements Runnable
{
  private zzh$zzf(zzh paramzzh) {}
  
  public void run()
  {
    zzh.zzc(zzahC).lock();
    try
    {
      boolean bool = Thread.interrupted();
      if (bool) {
        return;
      }
      zzpt();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      zzh.zzd(zzahC).zza(localRuntimeException);
      return;
    }
    finally
    {
      zzh.zzc(zzahC).unlock();
    }
  }
  
  protected abstract void zzpt();
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzh.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */