package com.google.android.gms.games;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class PlayerBuffer
  extends AbstractDataBuffer
{
  public PlayerBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final Player get(int paramInt)
  {
    return new PlayerRef(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.PlayerBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */