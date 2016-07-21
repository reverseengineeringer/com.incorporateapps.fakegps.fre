package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class LeaderboardScoreRef
  extends zzc
  implements LeaderboardScore
{
  private final PlayerRef zzaJq;
  
  LeaderboardScoreRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    zzaJq = new PlayerRef(paramDataHolder, paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    return LeaderboardScoreEntity.zza(this, paramObject);
  }
  
  public final String getDisplayRank()
  {
    return getString("display_rank");
  }
  
  public final void getDisplayRank(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("display_rank", paramCharArrayBuffer);
  }
  
  public final String getDisplayScore()
  {
    return getString("display_score");
  }
  
  public final void getDisplayScore(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("display_score", paramCharArrayBuffer);
  }
  
  public final long getRank()
  {
    return getLong("rank");
  }
  
  public final long getRawScore()
  {
    return getLong("raw_score");
  }
  
  public final Player getScoreHolder()
  {
    if (zzcB("external_player_id")) {
      return null;
    }
    return zzaJq;
  }
  
  public final String getScoreHolderDisplayName()
  {
    if (zzcB("external_player_id")) {
      return getString("default_display_name");
    }
    return zzaJq.getDisplayName();
  }
  
  public final void getScoreHolderDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (zzcB("external_player_id"))
    {
      zza("default_display_name", paramCharArrayBuffer);
      return;
    }
    zzaJq.getDisplayName(paramCharArrayBuffer);
  }
  
  public final Uri getScoreHolderHiResImageUri()
  {
    if (zzcB("external_player_id")) {
      return null;
    }
    return zzaJq.getHiResImageUri();
  }
  
  public final String getScoreHolderHiResImageUrl()
  {
    if (zzcB("external_player_id")) {
      return null;
    }
    return zzaJq.getHiResImageUrl();
  }
  
  public final Uri getScoreHolderIconImageUri()
  {
    if (zzcB("external_player_id")) {
      return zzcA("default_display_image_uri");
    }
    return zzaJq.getIconImageUri();
  }
  
  public final String getScoreHolderIconImageUrl()
  {
    if (zzcB("external_player_id")) {
      return getString("default_display_image_url");
    }
    return zzaJq.getIconImageUrl();
  }
  
  public final String getScoreTag()
  {
    return getString("score_tag");
  }
  
  public final long getTimestampMillis()
  {
    return getLong("achieved_timestamp");
  }
  
  public final int hashCode()
  {
    return LeaderboardScoreEntity.zza(this);
  }
  
  public final String toString()
  {
    return LeaderboardScoreEntity.zzb(this);
  }
  
  public final LeaderboardScore zzxK()
  {
    return new LeaderboardScoreEntity(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardScoreRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */