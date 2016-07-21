package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

final class zzjf$2
  implements Runnable
{
  zzjf$2(AtomicInteger paramAtomicInteger, int paramInt, zzjd paramzzjd, List paramList) {}
  
  public final void run()
  {
    if (zzNi.incrementAndGet() >= zzNj) {}
    try
    {
      zzNk.zzg(zzjf.zzn(zzNl));
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      zzin.zzd("Unable to convert list of futures to a future of list", localInterruptedException);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjf.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */