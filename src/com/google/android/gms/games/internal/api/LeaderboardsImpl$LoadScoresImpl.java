package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;

abstract class LeaderboardsImpl$LoadScoresImpl
  extends Games.BaseGamesApiMethodImpl
{
  private LeaderboardsImpl$LoadScoresImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Leaderboards.LoadScoresResult zzam(Status paramStatus)
  {
    return new LeaderboardsImpl.LoadScoresImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.LeaderboardsImpl.LoadScoresImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */