package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class LeaderboardBuffer
  extends zzf
{
  public LeaderboardBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected final Leaderboard zzp(int paramInt1, int paramInt2)
  {
    return new LeaderboardRef(zzahi, paramInt1, paramInt2);
  }
  
  protected final String zzqg()
  {
    return "external_leaderboard_id";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */