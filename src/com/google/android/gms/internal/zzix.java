package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.zzx;

public class zzix
{
  private Handler mHandler = null;
  private HandlerThread zzMG = null;
  private int zzMH = 0;
  private final Object zzpV = new Object();
  
  public Looper zzhC()
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        if (zzMH == 0)
        {
          if (zzMG == null)
          {
            zzin.v("Starting the looper thread.");
            zzMG = new HandlerThread("LooperProvider");
            zzMG.start();
            mHandler = new Handler(zzMG.getLooper());
            zzin.v("Looper thread started.");
            zzMH += 1;
            Looper localLooper = zzMG.getLooper();
            return localLooper;
          }
          zzin.v("Resuming the looper thread");
          zzpV.notifyAll();
        }
      }
      zzx.zzb(zzMG, "Invalid state: mHandlerThread should already been initialized.");
    }
  }
  
  public void zzhD()
  {
    synchronized (zzpV)
    {
      if (zzMH > 0)
      {
        bool = true;
        zzx.zzb(bool, "Invalid state: release() called more times than expected.");
        int i = zzMH - 1;
        zzMH = i;
        if (i == 0) {
          mHandler.post(new zzix.1(this));
        }
        return;
      }
      boolean bool = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzix
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */