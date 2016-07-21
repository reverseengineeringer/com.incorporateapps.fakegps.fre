package com.google.android.gms.measurement;

import android.util.Log;
import java.util.concurrent.FutureTask;

class zzg$zza$1
  extends FutureTask
{
  zzg$zza$1(zzg.zza paramzza, Runnable paramRunnable, Object paramObject)
  {
    super(paramRunnable, paramObject);
  }
  
  protected void setException(Throwable paramThrowable)
  {
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = zzg.zzb(zzaUC.zzaUB);
    if (localUncaughtExceptionHandler != null) {
      localUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), paramThrowable);
    }
    for (;;)
    {
      super.setException(paramThrowable);
      return;
      if (Log.isLoggable("GAv4", 6)) {
        Log.e("GAv4", "MeasurementExecutor: job failed with " + paramThrowable);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.zzg.zza.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */