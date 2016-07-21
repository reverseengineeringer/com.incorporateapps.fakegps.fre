package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

public final class zziq
{
  private static final ExecutorService zzLU = Executors.newFixedThreadPool(10, zzaB("Default"));
  private static final ExecutorService zzLV = Executors.newFixedThreadPool(5, zzaB("Loader"));
  
  public static zzjg zza(int paramInt, Runnable paramRunnable)
  {
    if (paramInt == 1) {
      return zza(zzLV, new zziq.1(paramRunnable));
    }
    return zza(zzLU, new zziq.2(paramRunnable));
  }
  
  public static zzjg zza(Runnable paramRunnable)
  {
    return zza(0, paramRunnable);
  }
  
  public static zzjg zza(Callable paramCallable)
  {
    return zza(zzLU, paramCallable);
  }
  
  public static zzjg zza(ExecutorService paramExecutorService, Callable paramCallable)
  {
    zzjd localzzjd = new zzjd();
    try
    {
      localzzjd.zzc(new zziq.4(localzzjd, paramExecutorService.submit(new zziq.3(localzzjd, paramCallable))));
      return localzzjd;
    }
    catch (RejectedExecutionException paramExecutorService)
    {
      zzin.zzd("Thread execution is rejected.", paramExecutorService);
      localzzjd.cancel(true);
    }
    return localzzjd;
  }
  
  private static ThreadFactory zzaB(String paramString)
  {
    return new zziq.5(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zziq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */