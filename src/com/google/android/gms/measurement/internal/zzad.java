package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.zzmq;

public class zzad
  extends zzz
{
  private Handler mHandler;
  private long zzaZa;
  private final Runnable zzaZb = new zzad.1(this);
  private final zzf zzaZc = new zzad.2(this, zzaTV);
  private final zzf zzaZd = new zzad.3(this, zzaTV);
  
  zzad(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private void zzDv()
  {
    try
    {
      if (mHandler == null) {
        mHandler = new Handler(Looper.getMainLooper());
      }
      return;
    }
    finally {}
  }
  
  private void zzDy()
  {
    zzjk();
    long l = zzjl().elapsedRealtime();
    zzAo().zzCK().zzj("Session started, time", Long.valueOf(l));
    zzCozzaXu.set(false);
    zzCf().zze("auto", "_s", new Bundle());
  }
  
  private void zzDz()
  {
    zzjk();
    long l1 = zzjl().elapsedRealtime();
    if (zzaZa == 0L) {
      zzaZa = (l1 - 3600000L);
    }
    long l2 = zzCozzaXw.get() + (l1 - zzaZa);
    zzCozzaXw.set(l2);
    zzAo().zzCK().zzj("Recording user engagement, ms", Long.valueOf(l2));
    Bundle localBundle = new Bundle();
    localBundle.putLong("_et", l2);
    zzCf().zze("auto", "_e", localBundle);
    zzCozzaXw.set(0L);
    zzaZa = l1;
    zzaZd.zzt(Math.max(0L, 3600000L - zzCozzaXw.get()));
  }
  
  private void zzae(long paramLong)
  {
    zzjk();
    zzDv();
    zzaZc.cancel();
    zzaZd.cancel();
    zzAo().zzCK().zzj("Activity resumed, time", Long.valueOf(paramLong));
    zzaZa = paramLong;
    if (zzjl().currentTimeMillis() - zzCozzaXt.get() > zzCozzaXv.get())
    {
      zzCozzaXu.set(true);
      zzCozzaXw.set(0L);
    }
    if (zzCozzaXu.get())
    {
      zzaZc.zzt(Math.max(0L, zzCozzaXs.get() - zzCozzaXw.get()));
      return;
    }
    zzaZd.zzt(Math.max(0L, 3600000L - zzCozzaXw.get()));
  }
  
  private void zzaf(long paramLong)
  {
    zzjk();
    zzDv();
    zzaZc.cancel();
    zzaZd.cancel();
    zzAo().zzCK().zzj("Activity paused, time", Long.valueOf(paramLong));
    if (zzaZa != 0L) {
      zzCozzaXw.set(zzCozzaXw.get() + (paramLong - zzaZa));
    }
    zzCozzaXv.set(zzjl().currentTimeMillis());
    try
    {
      if (!zzCozzaXu.get()) {
        mHandler.postDelayed(zzaZb, 1000L);
      }
      return;
    }
    finally {}
  }
  
  protected void zzDu()
  {
    try
    {
      zzDv();
      mHandler.removeCallbacks(zzaZb);
      long l = zzjl().elapsedRealtime();
      zzCn().zzg(new zzad.4(this, l));
      return;
    }
    finally {}
  }
  
  protected void zzDw()
  {
    long l = zzjl().elapsedRealtime();
    zzCn().zzg(new zzad.5(this, l));
  }
  
  public void zzDx()
  {
    zzjk();
    zzAo().zzCJ().zzfg("Application backgrounded. Logging engagement");
    long l = zzCozzaXw.get();
    if (l > 0L)
    {
      Bundle localBundle = new Bundle();
      localBundle.putLong("_et", l);
      zzCf().zze("auto", "_e", localBundle);
      zzCozzaXw.set(0L);
      return;
    }
    zzAo().zzCF().zzj("Not logging non-positive engagement time", Long.valueOf(l));
  }
  
  protected void zziJ() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */