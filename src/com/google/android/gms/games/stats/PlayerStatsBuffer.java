package com.google.android.gms.games.stats;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class PlayerStatsBuffer
  extends AbstractDataBuffer
{
  public PlayerStatsBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final PlayerStats zzgV(int paramInt)
  {
    return new PlayerStatsRef(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.stats.PlayerStatsBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */