package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

public class zzv
  extends zzz
{
  private zzv.zzc zzaXI;
  private zzv.zzc zzaXJ;
  private final BlockingQueue zzaXK = new LinkedBlockingQueue();
  private final BlockingQueue zzaXL = new LinkedBlockingQueue();
  private final Thread.UncaughtExceptionHandler zzaXM = new zzv.zzb(this, "Thread death: Uncaught exception on worker thread");
  private final Thread.UncaughtExceptionHandler zzaXN = new zzv.zzb(this, "Thread death: Uncaught exception on network thread");
  private final Object zzaXO = new Object();
  private final Semaphore zzaXP = new Semaphore(2);
  private volatile boolean zzaXQ;
  
  zzv(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private void zza(FutureTask paramFutureTask)
  {
    synchronized (zzaXO)
    {
      zzaXK.add(paramFutureTask);
      if (zzaXI == null)
      {
        zzaXI = new zzv.zzc(this, "Measurement Worker", zzaXK);
        zzaXI.setUncaughtExceptionHandler(zzaXM);
        zzaXI.start();
        return;
      }
      zzaXI.zzfb();
    }
  }
  
  private void zzb(FutureTask paramFutureTask)
  {
    synchronized (zzaXO)
    {
      zzaXL.add(paramFutureTask);
      if (zzaXJ == null)
      {
        zzaXJ = new zzv.zzc(this, "Measurement Network", zzaXL);
        zzaXJ.setUncaughtExceptionHandler(zzaXN);
        zzaXJ.start();
        return;
      }
      zzaXJ.zzfb();
    }
  }
  
  public void zzCd()
  {
    if (Thread.currentThread() != zzaXJ) {
      throw new IllegalStateException("Call expected from network thread");
    }
  }
  
  public Future zzd(Callable paramCallable)
  {
    zzjv();
    zzx.zzz(paramCallable);
    paramCallable = new zzv.zza(this, paramCallable, "Task exception on worker thread");
    if (Thread.currentThread() == zzaXI)
    {
      paramCallable.run();
      return paramCallable;
    }
    zza(paramCallable);
    return paramCallable;
  }
  
  public void zzg(Runnable paramRunnable)
  {
    zzjv();
    zzx.zzz(paramRunnable);
    zza(new zzv.zza(this, paramRunnable, "Task exception on worker thread"));
  }
  
  public void zzh(Runnable paramRunnable)
  {
    zzjv();
    zzx.zzz(paramRunnable);
    zzb(new zzv.zza(this, paramRunnable, "Task exception on network thread"));
  }
  
  protected void zziJ() {}
  
  public void zzjk()
  {
    if (Thread.currentThread() != zzaXI) {
      throw new IllegalStateException("Call expected from worker thread");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */