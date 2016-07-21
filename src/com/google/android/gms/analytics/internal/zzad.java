package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zzmq;

public class zzad
{
  private final long zzSP;
  private final int zzSQ;
  private double zzSR;
  private long zzSS;
  private final Object zzST = new Object();
  private final String zzSU;
  private final zzmq zzqW;
  
  public zzad(int paramInt, long paramLong, String paramString, zzmq paramzzmq)
  {
    zzSQ = paramInt;
    zzSR = zzSQ;
    zzSP = paramLong;
    zzSU = paramString;
    zzqW = paramzzmq;
  }
  
  public zzad(String paramString, zzmq paramzzmq)
  {
    this(60, 2000L, paramString, paramzzmq);
  }
  
  public boolean zzlw()
  {
    synchronized (zzST)
    {
      long l = zzqW.currentTimeMillis();
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
      zzae.zzaK("Excessive " + zzSU + " detected; call ignored.");
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */