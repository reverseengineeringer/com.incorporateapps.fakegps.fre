package com.google.android.gms.games.stats;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface Stats$LoadPlayerStatsResult
  extends Releasable, Result
{
  public abstract PlayerStats getPlayerStats();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */