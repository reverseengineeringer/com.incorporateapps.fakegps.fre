package com.google.android.gms.games.event;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class EventBuffer
  extends AbstractDataBuffer
{
  public EventBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final Event get(int paramInt)
  {
    return new EventRef(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.event.EventBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */