package com.google.android.gms.games.internal.events;

import java.util.concurrent.atomic.AtomicReference;

public abstract class EventIncrementManager
{
  private final AtomicReference zzaIj = new AtomicReference();
  
  public void flush()
  {
    EventIncrementCache localEventIncrementCache = (EventIncrementCache)zzaIj.get();
    if (localEventIncrementCache != null) {
      localEventIncrementCache.flush();
    }
  }
  
  public void zzp(String paramString, int paramInt)
  {
    EventIncrementCache localEventIncrementCache2 = (EventIncrementCache)zzaIj.get();
    EventIncrementCache localEventIncrementCache1 = localEventIncrementCache2;
    if (localEventIncrementCache2 == null)
    {
      localEventIncrementCache2 = zzwS();
      localEventIncrementCache1 = localEventIncrementCache2;
      if (!zzaIj.compareAndSet(null, localEventIncrementCache2)) {
        localEventIncrementCache1 = (EventIncrementCache)zzaIj.get();
      }
    }
    localEventIncrementCache1.zzw(paramString, paramInt);
  }
  
  protected abstract EventIncrementCache zzwS();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.events.EventIncrementManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */