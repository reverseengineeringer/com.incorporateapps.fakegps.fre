package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class zzjj
  implements zzji
{
  protected int zzBc = 0;
  protected final BlockingQueue zzNq = new LinkedBlockingQueue();
  protected Object zzNr;
  private final Object zzpV = new Object();
  
  public int getStatus()
  {
    return zzBc;
  }
  
  public void reject()
  {
    synchronized (zzpV)
    {
      if (zzBc != 0) {
        throw new UnsupportedOperationException();
      }
    }
    zzBc = -1;
    Iterator localIterator = zzNq.iterator();
    while (localIterator.hasNext()) {
      nextzzNt.run();
    }
    zzNq.clear();
  }
  
  public void zza(zzji.zzc paramzzc, zzji.zza paramzza)
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        if (zzBc == 1)
        {
          paramzzc.zze(zzNr);
          return;
        }
        if (zzBc == -1) {
          paramzza.run();
        }
      }
      if (zzBc == 0) {
        zzNq.add(new zzjj.zza(this, paramzzc, paramzza));
      }
    }
  }
  
  public void zzh(Object paramObject)
  {
    synchronized (zzpV)
    {
      if (zzBc != 0) {
        throw new UnsupportedOperationException();
      }
    }
    zzNr = paramObject;
    zzBc = 1;
    Iterator localIterator = zzNq.iterator();
    while (localIterator.hasNext()) {
      nextzzNs.zze(paramObject);
    }
    zzNq.clear();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */