package com.google.android.gms.tagmanager;

class zzcs
  implements zzcd
{
  private final long zzSP;
  private final int zzSQ;
  private double zzSR;
  private final Object zzST = new Object();
  private long zzbkO;
  
  public zzcs()
  {
    this(60, 2000L);
  }
  
  public zzcs(int paramInt, long paramLong)
  {
    zzSQ = paramInt;
    zzSR = zzSQ;
    zzSP = paramLong;
  }
  
  public boolean zzlw()
  {
    synchronized (zzST)
    {
      long l = System.currentTimeMillis();
      if (zzSR < zzSQ)
      {
        double d = (l - zzbkO) / zzSP;
        if (d > 0.0D) {
          zzSR = Math.min(zzSQ, d + zzSR);
        }
      }
      zzbkO = l;
      if (zzSR >= 1.0D)
      {
        zzSR -= 1.0D;
        return true;
      }
      zzbg.zzaK("No more tokens available.");
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */