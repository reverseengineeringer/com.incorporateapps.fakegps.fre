package com.google.android.gms.cast.internal;

import android.os.SystemClock;

class zzc$zza
  implements Runnable
{
  private zzc$zza(zzc paramzzc) {}
  
  public void run()
  {
    zzadt.zzads = false;
    long l = SystemClock.elapsedRealtime();
    boolean bool = zzadt.zzz(l);
    zzadt.zzW(bool);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zzc.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */