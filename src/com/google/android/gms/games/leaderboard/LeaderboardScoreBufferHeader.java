package com.google.android.gms.games.leaderboard;

import android.os.Bundle;

public final class LeaderboardScoreBufferHeader
{
  private final Bundle zzUH;
  
  public LeaderboardScoreBufferHeader(Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    zzUH = localBundle;
  }
  
  public final Bundle asBundle()
  {
    return zzUH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */