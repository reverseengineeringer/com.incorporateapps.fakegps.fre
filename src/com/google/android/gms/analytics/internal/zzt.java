package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;

abstract class zzt
{
  private static volatile Handler zzRC;
  private final zzf zzQj;
  private volatile long zzRD;
  private boolean zzRE;
  private final Runnable zzx;
  
  zzt(zzf paramzzf)
  {
    zzx.zzz(paramzzf);
    zzQj = paramzzf;
    zzx = new zzt.1(this);
  }
  
  private Handler getHandler()
  {
    if (zzRC != null) {
      return zzRC;
    }
    try
    {
      if (zzRC == null) {
        zzRC = new Handler(zzQj.getContext().getMainLooper());
      }
      Handler localHandler = zzRC;
      return localHandler;
    }
    finally {}
  }
  
  public void cancel()
  {
    zzRD = 0L;
    getHandler().removeCallbacks(zzx);
  }
  
  public abstract void run();
  
  public boolean zzbw()
  {
    return zzRD != 0L;
  }
  
  public long zzkY()
  {
    if (zzRD == 0L) {
      return 0L;
    }
    return Math.abs(zzQj.zzjl().currentTimeMillis() - zzRD);
  }
  
  public void zzt(long paramLong)
  {
    cancel();
    if (paramLong >= 0L)
    {
      zzRD = zzQj.zzjl().currentTimeMillis();
      if (!getHandler().postDelayed(zzx, paramLong)) {
        zzQj.zzjm().zze("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public void zzu(long paramLong)
  {
    long l = 0L;
    if (!zzbw()) {
      return;
    }
    if (paramLong < 0L)
    {
      cancel();
      return;
    }
    paramLong -= Math.abs(zzQj.zzjl().currentTimeMillis() - zzRD);
    if (paramLong < 0L) {
      paramLong = l;
    }
    for (;;)
    {
      getHandler().removeCallbacks(zzx);
      if (getHandler().postDelayed(zzx, paramLong)) {
        break;
      }
      zzQj.zzjm().zze("Failed to adjust delayed post. time", Long.valueOf(paramLong));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */