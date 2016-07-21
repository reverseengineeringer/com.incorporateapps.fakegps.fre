package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;

class zzaf
{
  private long zzCv;
  private final zzmq zzqW;
  
  public zzaf(zzmq paramzzmq)
  {
    zzx.zzz(paramzzmq);
    zzqW = paramzzmq;
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
    while (zzqW.elapsedRealtime() - zzCv >= paramLong) {
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzaf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */