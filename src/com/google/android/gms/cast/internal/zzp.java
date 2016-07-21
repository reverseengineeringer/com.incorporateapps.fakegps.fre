package com.google.android.gms.cast.internal;

import android.os.SystemClock;

public final class zzp
{
  private static final zzl zzaaf = new zzl("RequestTracker");
  public static final Object zzaeB = new Object();
  private long zzacY;
  private zzo zzaeA;
  private long zzaey;
  private long zzaez;
  
  public zzp(long paramLong)
  {
    zzaey = paramLong;
    zzacY = -1L;
    zzaez = 0L;
  }
  
  private void zzoz()
  {
    zzacY = -1L;
    zzaeA = null;
    zzaez = 0L;
  }
  
  public final void clear()
  {
    synchronized (zzaeB)
    {
      if (zzacY != -1L) {
        zzoz();
      }
      return;
    }
  }
  
  public final boolean zzB(long paramLong)
  {
    synchronized (zzaeB)
    {
      if ((zzacY != -1L) && (zzacY == paramLong))
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
  
  public final void zza(long paramLong, zzo paramzzo)
  {
    synchronized (zzaeB)
    {
      zzo localzzo = zzaeA;
      long l = zzacY;
      zzacY = paramLong;
      zzaeA = paramzzo;
      zzaez = SystemClock.elapsedRealtime();
      if (localzzo != null) {
        localzzo.zzy(l);
      }
      return;
    }
  }
  
  public final boolean zzc(long paramLong, int paramInt)
  {
    return zzc(paramLong, paramInt, null);
  }
  
  public final boolean zzc(long paramLong, int paramInt, Object paramObject)
  {
    boolean bool = true;
    zzo localzzo = null;
    for (;;)
    {
      synchronized (zzaeB)
      {
        if ((zzacY != -1L) && (zzacY == paramLong))
        {
          zzaaf.zzb("request %d completed", new Object[] { Long.valueOf(zzacY) });
          localzzo = zzaeA;
          zzoz();
          if (localzzo != null) {
            localzzo.zza(paramLong, paramInt, paramObject);
          }
          return bool;
        }
      }
      bool = false;
    }
  }
  
  public final boolean zzd(long paramLong, int paramInt)
  {
    boolean bool = true;
    long l = 0L;
    for (;;)
    {
      synchronized (zzaeB)
      {
        if ((zzacY != -1L) && (paramLong - zzaez >= zzaey))
        {
          zzaaf.zzb("request %d timed out", new Object[] { Long.valueOf(zzacY) });
          paramLong = zzacY;
          zzo localzzo = zzaeA;
          zzoz();
          if (localzzo != null) {
            localzzo.zza(paramLong, paramInt, null);
          }
          return bool;
        }
      }
      bool = false;
      Object localObject2 = null;
      paramLong = l;
    }
  }
  
  public final boolean zzoA()
  {
    synchronized (zzaeB)
    {
      if (zzacY != -1L)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */