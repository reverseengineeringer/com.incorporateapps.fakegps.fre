package com.google.android.gms.measurement;

import android.os.Process;

class zzg$zzc
  extends Thread
{
  zzg$zzc(Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, paramString);
  }
  
  public void run()
  {
    Process.setThreadPriority(10);
    super.run();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.zzg.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */