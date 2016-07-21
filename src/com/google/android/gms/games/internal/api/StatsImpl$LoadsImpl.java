package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult;

abstract class StatsImpl$LoadsImpl
  extends Games.BaseGamesApiMethodImpl
{
  private StatsImpl$LoadsImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Stats.LoadPlayerStatsResult zzaH(Status paramStatus)
  {
    return new StatsImpl.LoadsImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.StatsImpl.LoadsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */