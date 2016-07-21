package com.google.android.gms.internal;

import android.content.Context;

class zzir$1
  implements Runnable
{
  zzir$1(zzir paramzzir, Context paramContext) {}
  
  public void run()
  {
    synchronized (zzir.zza(zzMf))
    {
      zzir.zza(zzMf, zzMf.zzK(zzxh));
      zzir.zza(zzMf).notifyAll();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzir.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */