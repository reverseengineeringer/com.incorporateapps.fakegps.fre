package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class LeaderboardVariantRef
  extends zzc
  implements LeaderboardVariant
{
  LeaderboardVariantRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    return LeaderboardVariantEntity.zza(this, paramObject);
  }
  
  public final int getCollection()
  {
    return getInteger("collection");
  }
  
  public final String getDisplayPlayerRank()
  {
    return getString("player_display_rank");
  }
  
  public final String getDisplayPlayerScore()
  {
    return getString("player_display_score");
  }
  
  public final long getNumScores()
  {
    if (zzcB("total_scores")) {
      return -1L;
    }
    return getLong("total_scores");
  }
  
  public final long getPlayerRank()
  {
    if (zzcB("player_rank")) {
      return -1L;
    }
    return getLong("player_rank");
  }
  
  public final String getPlayerScoreTag()
  {
    return getString("player_score_tag");
  }
  
  public final long getRawPlayerScore()
  {
    if (zzcB("player_raw_score")) {
      return -1L;
    }
    return getLong("player_raw_score");
  }
  
  public final int getTimeSpan()
  {
    return getInteger("timespan");
  }
  
  public final boolean hasPlayerInfo()
  {
    return !zzcB("player_raw_score");
  }
  
  public final int hashCode()
  {
    return LeaderboardVariantEntity.zza(this);
  }
  
  public final String toString()
  {
    return LeaderboardVariantEntity.zzb(this);
  }
  
  public final String zzxL()
  {
    return getString("top_page_token_next");
  }
  
  public final String zzxM()
  {
    return getString("window_page_token_prev");
  }
  
  public final String zzxN()
  {
    return getString("window_page_token_next");
  }
  
  public final LeaderboardVariant zzxO()
  {
    return new LeaderboardVariantEntity(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardVariantRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */