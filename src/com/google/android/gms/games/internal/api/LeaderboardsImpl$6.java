package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;

class LeaderboardsImpl$6
  extends LeaderboardsImpl.LoadScoresImpl
{
  LeaderboardsImpl$6(LeaderboardsImpl paramLeaderboardsImpl, GoogleApiClient paramGoogleApiClient, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    paramGamesClientImpl.zza(this, zzaGu, zzaGt, zzaGv);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.LeaderboardsImpl.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */