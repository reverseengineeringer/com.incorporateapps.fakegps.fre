package com.google.android.gms.internal;

class zzix$1
  implements Runnable
{
  zzix$1(zzix paramzzix) {}
  
  public void run()
  {
    synchronized (zzix.zza(zzMI))
    {
      zzin.v("Suspending the looper thread");
      for (;;)
      {
        int i = zzix.zzb(zzMI);
        if (i == 0) {
          try
          {
            zzix.zza(zzMI).wait();
            zzin.v("Looper thread resumed");
          }
          catch (InterruptedException localInterruptedException)
          {
            zzin.v("Looper thread interrupted.");
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzix.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */