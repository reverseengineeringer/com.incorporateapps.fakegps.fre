package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;

abstract class zzf
{
  private static volatile Handler zzRC;
  private volatile long zzRD;
  private final zzw zzaTV;
  private boolean zzaVI;
  private final Runnable zzx;
  
  zzf(zzw paramzzw)
  {
    zzx.zzz(paramzzw);
    zzaTV = paramzzw;
    zzaVI = true;
    zzx = new zzf.1(this);
  }
  
  private Handler getHandler()
  {
    if (zzRC != null) {
      return zzRC;
    }
    try
    {
      if (zzRC == null) {
        zzRC = new Handler(zzaTV.getContext().getMainLooper());
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
  
  public void zzt(long paramLong)
  {
    cancel();
    if (paramLong >= 0L)
    {
      zzRD = zzaTV.zzjl().currentTimeMillis();
      if (!getHandler().postDelayed(zzx, paramLong)) {
        zzaTV.zzAo().zzCE().zzj("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */