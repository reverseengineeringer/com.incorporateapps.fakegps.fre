package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;

class zzaj
{
  private long zzCv;
  private final zzmq zzqW;
  
  public zzaj(zzmq paramzzmq)
  {
    zzx.zzz(paramzzmq);
    zzqW = paramzzmq;
  }
  
  public zzaj(zzmq paramzzmq, long paramLong)
  {
    zzx.zzz(paramzzmq);
    zzqW = paramzzmq;
    zzCv = paramLong;
  }
  
  public void clear()
  {
    zzCv = 0L;
  }
  
  public void start()
  {
    zzCv = zzqW.elapsedRealtime();
  }
  
  public boolean zzv(long paramLong)
  {
    if (zzCv == 0L) {}
    while (zzqW.elapsedRealtime() - zzCv > paramLong) {
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzaj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */