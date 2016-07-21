package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;

public class zziz
{
  private long zzMJ;
  private long zzMK = Long.MIN_VALUE;
  private Object zzpV = new Object();
  
  public zziz(long paramLong)
  {
    zzMJ = paramLong;
  }
  
  public boolean tryAcquire()
  {
    synchronized (zzpV)
    {
      long l = zzr.zzbG().elapsedRealtime();
      if (zzMK + zzMJ > l) {
        return false;
      }
      zzMK = l;
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zziz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */