package com.google.android.gms.measurement;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

class zzg$zzb
  implements ThreadFactory
{
  private static final AtomicInteger zzaUD = new AtomicInteger();
  
  public Thread newThread(Runnable paramRunnable)
  {
    return new zzg.zzc(paramRunnable, "measurement-" + zzaUD.incrementAndGet());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.zzg.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */