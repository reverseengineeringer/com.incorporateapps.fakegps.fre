package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class LeaderboardScoreBuffer
  extends AbstractDataBuffer
{
  private final LeaderboardScoreBufferHeader zzaJd;
  
  public LeaderboardScoreBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    zzaJd = new LeaderboardScoreBufferHeader(paramDataHolder.zzpZ());
  }
  
  public final LeaderboardScore get(int paramInt)
  {
    return new LeaderboardScoreRef(zzahi, paramInt);
  }
  
  public final LeaderboardScoreBufferHeader zzxJ()
  {
    return zzaJd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */