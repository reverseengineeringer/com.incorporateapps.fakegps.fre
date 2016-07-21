package com.google.android.gms.games.internal.events;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EventIncrementCache
{
  final Object zzaId = new Object();
  private Handler zzaIe;
  private boolean zzaIf;
  private HashMap zzaIg;
  private int zzaIh;
  
  public EventIncrementCache(Looper paramLooper, int paramInt)
  {
    zzaIe = new Handler(paramLooper);
    zzaIg = new HashMap();
    zzaIh = paramInt;
  }
  
  private void zzxl()
  {
    synchronized (zzaId)
    {
      zzaIf = false;
      flush();
      return;
    }
  }
  
  public void flush()
  {
    synchronized (zzaId)
    {
      Iterator localIterator = zzaIg.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        zzs((String)localEntry.getKey(), ((AtomicInteger)localEntry.getValue()).get());
      }
    }
    zzaIg.clear();
  }
  
  protected abstract void zzs(String paramString, int paramInt);
  
  public void zzw(String paramString, int paramInt)
  {
    synchronized (zzaId)
    {
      if (!zzaIf)
      {
        zzaIf = true;
        zzaIe.postDelayed(new EventIncrementCache.1(this), zzaIh);
      }
      AtomicInteger localAtomicInteger2 = (AtomicInteger)zzaIg.get(paramString);
      AtomicInteger localAtomicInteger1 = localAtomicInteger2;
      if (localAtomicInteger2 == null)
      {
        localAtomicInteger1 = new AtomicInteger();
        zzaIg.put(paramString, localAtomicInteger1);
      }
      localAtomicInteger1.addAndGet(paramInt);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.events.EventIncrementCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */