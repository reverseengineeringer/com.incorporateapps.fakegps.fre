package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;

public abstract class LeaderboardsImpl$SubmitScoreImpl
  extends Games.BaseGamesApiMethodImpl
{
  protected LeaderboardsImpl$SubmitScoreImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Leaderboards.SubmitScoreResult zzan(Status paramStatus)
  {
    return new LeaderboardsImpl.SubmitScoreImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.LeaderboardsImpl.SubmitScoreImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */