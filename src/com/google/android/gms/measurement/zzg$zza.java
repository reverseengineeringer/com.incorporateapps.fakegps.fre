package com.google.android.gms.measurement;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class zzg$zza
  extends ThreadPoolExecutor
{
  public zzg$zza(zzg paramzzg)
  {
    super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    setThreadFactory(new zzg.zzb(null));
  }
  
  protected RunnableFuture newTaskFor(Runnable paramRunnable, Object paramObject)
  {
    return new zzg.zza.1(this, paramRunnable, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.zzg.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */