package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class zzbd
{
  private final Object zzpV = new Object();
  private int zzsW;
  private List zzsX = new LinkedList();
  
  public boolean zza(zzbc paramzzbc)
  {
    synchronized (zzpV)
    {
      return zzsX.contains(paramzzbc);
    }
  }
  
  public boolean zzb(zzbc paramzzbc)
  {
    synchronized (zzpV)
    {
      Iterator localIterator = zzsX.iterator();
      while (localIterator.hasNext())
      {
        zzbc localzzbc = (zzbc)localIterator.next();
        if ((paramzzbc != localzzbc) && (localzzbc.zzcy().equals(paramzzbc.zzcy())))
        {
          localIterator.remove();
          return true;
        }
      }
      return false;
    }
  }
  
  public void zzc(zzbc paramzzbc)
  {
    synchronized (zzpV)
    {
      if (zzsX.size() >= 10)
      {
        zzin.zzaI("Queue is full, current size = " + zzsX.size());
        zzsX.remove(0);
      }
      int i = zzsW;
      zzsW = (i + 1);
      paramzzbc.zzh(i);
      zzsX.add(paramzzbc);
      return;
    }
  }
  
  public zzbc zzcF()
  {
    Object localObject1 = null;
    label146:
    label149:
    for (;;)
    {
      synchronized (zzpV)
      {
        if (zzsX.size() == 0)
        {
          zzin.zzaI("Queue empty");
          return null;
        }
        if (zzsX.size() >= 2)
        {
          int i = Integer.MIN_VALUE;
          Iterator localIterator = zzsX.iterator();
          if (localIterator.hasNext())
          {
            zzbc localzzbc2 = (zzbc)localIterator.next();
            int j = localzzbc2.getScore();
            if (j <= i) {
              break label146;
            }
            localObject1 = localzzbc2;
            i = j;
            break label149;
          }
          zzsX.remove(localObject1);
          return (zzbc)localObject1;
        }
      }
      zzbc localzzbc1 = (zzbc)zzsX.get(0);
      localzzbc1.zzcA();
      return localzzbc1;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */