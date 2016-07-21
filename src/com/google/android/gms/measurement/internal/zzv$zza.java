package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class zzv$zza
  extends FutureTask
{
  private final String zzaXR;
  
  zzv$zza(zzv paramzzv, Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, null);
    zzx.zzz(paramString);
    zzaXR = paramString;
  }
  
  zzv$zza(zzv paramzzv, Callable paramCallable, String paramString)
  {
    super(paramCallable);
    zzx.zzz(paramString);
    zzaXR = paramString;
  }
  
  protected final void setException(Throwable paramThrowable)
  {
    zzaXS.zzAo().zzCE().zzj(zzaXR, paramThrowable);
    super.setException(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzv.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */