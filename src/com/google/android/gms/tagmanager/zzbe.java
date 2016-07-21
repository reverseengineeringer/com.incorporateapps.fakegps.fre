package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzmq;

class zzbe
  implements zzcd
{
  private final long zzSP;
  private final int zzSQ;
  private double zzSR;
  private long zzSS;
  private final Object zzST = new Object();
  private final String zzSU;
  private final long zzbjt;
  private final zzmq zzqW;
  
  public zzbe(int paramInt, long paramLong1, long paramLong2, String paramString, zzmq paramzzmq)
  {
    zzSQ = paramInt;
    zzSR = zzSQ;
    zzSP = paramLong1;
    zzbjt = paramLong2;
    zzSU = paramString;
    zzqW = paramzzmq;
  }
  
  public boolean zzlw()
  {
    synchronized (zzST)
    {
      long l = zzqW.currentTimeMillis();
      if (l - zzSS < zzbjt)
      {
        zzbg.zzaK("Excessive " + zzSU + " detected; call ignored.");
        return false;
      }
      if (zzSR < zzSQ)
      {
        double d = (l - zzSS) / zzSP;
        if (d > 0.0D) {
          zzSR = Math.min(zzSQ, d + zzSR);
        }
      }
      zzSS = l;
      if (zzSR >= 1.0D)
      {
        zzSR -= 1.0D;
        return true;
      }
    }
    zzbg.zzaK("Excessive " + zzSU + " detected; call ignored.");
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzbe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */