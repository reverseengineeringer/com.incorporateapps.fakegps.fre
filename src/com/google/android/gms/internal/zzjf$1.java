package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

final class zzjf$1
  implements Runnable
{
  zzjf$1(zzjd paramzzjd, zzjf.zza paramzza, zzjg paramzzjg) {}
  
  public final void run()
  {
    try
    {
      zzNf.zzg(zzNg.zzf(zzNh.get()));
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      zzNf.cancel(true);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    catch (CancellationException localCancellationException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjf.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */