package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzms;

public final class LeaderboardScoreEntity
  implements LeaderboardScore
{
  private final long zzaJe;
  private final String zzaJf;
  private final String zzaJg;
  private final long zzaJh;
  private final long zzaJi;
  private final String zzaJj;
  private final Uri zzaJk;
  private final Uri zzaJl;
  private final PlayerEntity zzaJm;
  private final String zzaJn;
  private final String zzaJo;
  private final String zzaJp;
  
  public LeaderboardScoreEntity(LeaderboardScore paramLeaderboardScore)
  {
    zzaJe = paramLeaderboardScore.getRank();
    zzaJf = ((String)zzx.zzz(paramLeaderboardScore.getDisplayRank()));
    zzaJg = ((String)zzx.zzz(paramLeaderboardScore.getDisplayScore()));
    zzaJh = paramLeaderboardScore.getRawScore();
    zzaJi = paramLeaderboardScore.getTimestampMillis();
    zzaJj = paramLeaderboardScore.getScoreHolderDisplayName();
    zzaJk = paramLeaderboardScore.getScoreHolderIconImageUri();
    zzaJl = paramLeaderboardScore.getScoreHolderHiResImageUri();
    Object localObject = paramLeaderboardScore.getScoreHolder();
    if (localObject == null) {}
    for (localObject = null;; localObject = (PlayerEntity)((Player)localObject).freeze())
    {
      zzaJm = ((PlayerEntity)localObject);
      zzaJn = paramLeaderboardScore.getScoreTag();
      zzaJo = paramLeaderboardScore.getScoreHolderIconImageUrl();
      zzaJp = paramLeaderboardScore.getScoreHolderHiResImageUrl();
      return;
    }
  }
  
  static int zza(LeaderboardScore paramLeaderboardScore)
  {
    return zzw.hashCode(new Object[] { Long.valueOf(paramLeaderboardScore.getRank()), paramLeaderboardScore.getDisplayRank(), Long.valueOf(paramLeaderboardScore.getRawScore()), paramLeaderboardScore.getDisplayScore(), Long.valueOf(paramLeaderboardScore.getTimestampMillis()), paramLeaderboardScore.getScoreHolderDisplayName(), paramLeaderboardScore.getScoreHolderIconImageUri(), paramLeaderboardScore.getScoreHolderHiResImageUri(), paramLeaderboardScore.getScoreHolder() });
  }
  
  static boolean zza(LeaderboardScore paramLeaderboardScore, Object paramObject)
  {
    if (!(paramObject instanceof LeaderboardScore)) {}
    do
    {
      return false;
      if (paramLeaderboardScore == paramObject) {
        return true;
      }
      paramObject = (LeaderboardScore)paramObject;
    } while ((!zzw.equal(Long.valueOf(((LeaderboardScore)paramObject).getRank()), Long.valueOf(paramLeaderboardScore.getRank()))) || (!zzw.equal(((LeaderboardScore)paramObject).getDisplayRank(), paramLeaderboardScore.getDisplayRank())) || (!zzw.equal(Long.valueOf(((LeaderboardScore)paramObject).getRawScore()), Long.valueOf(paramLeaderboardScore.getRawScore()))) || (!zzw.equal(((LeaderboardScore)paramObject).getDisplayScore(), paramLeaderboardScore.getDisplayScore())) || (!zzw.equal(Long.valueOf(((LeaderboardScore)paramObject).getTimestampMillis()), Long.valueOf(paramLeaderboardScore.getTimestampMillis()))) || (!zzw.equal(((LeaderboardScore)paramObject).getScoreHolderDisplayName(), paramLeaderboardScore.getScoreHolderDisplayName())) || (!zzw.equal(((LeaderboardScore)paramObject).getScoreHolderIconImageUri(), paramLeaderboardScore.getScoreHolderIconImageUri())) || (!zzw.equal(((LeaderboardScore)paramObject).getScoreHolderHiResImageUri(), paramLeaderboardScore.getScoreHolderHiResImageUri())) || (!zzw.equal(((LeaderboardScore)paramObject).getScoreHolder(), paramLeaderboardScore.getScoreHolder())) || (!zzw.equal(((LeaderboardScore)paramObject).getScoreTag(), paramLeaderboardScore.getScoreTag())));
    return true;
  }
  
  static String zzb(LeaderboardScore paramLeaderboardScore)
  {
    zzw.zza localzza = zzw.zzy(paramLeaderboardScore).zzg("Rank", Long.valueOf(paramLeaderboardScore.getRank())).zzg("DisplayRank", paramLeaderboardScore.getDisplayRank()).zzg("Score", Long.valueOf(paramLeaderboardScore.getRawScore())).zzg("DisplayScore", paramLeaderboardScore.getDisplayScore()).zzg("Timestamp", Long.valueOf(paramLeaderboardScore.getTimestampMillis())).zzg("DisplayName", paramLeaderboardScore.getScoreHolderDisplayName()).zzg("IconImageUri", paramLeaderboardScore.getScoreHolderIconImageUri()).zzg("IconImageUrl", paramLeaderboardScore.getScoreHolderIconImageUrl()).zzg("HiResImageUri", paramLeaderboardScore.getScoreHolderHiResImageUri()).zzg("HiResImageUrl", paramLeaderboardScore.getScoreHolderHiResImageUrl());
    if (paramLeaderboardScore.getScoreHolder() == null) {}
    for (Object localObject = null;; localObject = paramLeaderboardScore.getScoreHolder()) {
      return localzza.zzg("Player", localObject).zzg("ScoreTag", paramLeaderboardScore.getScoreTag()).toString();
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final String getDisplayRank()
  {
    return zzaJf;
  }
  
  public final void getDisplayRank(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaJf, paramCharArrayBuffer);
  }
  
  public final String getDisplayScore()
  {
    return zzaJg;
  }
  
  public final void getDisplayScore(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaJg, paramCharArrayBuffer);
  }
  
  public final long getRank()
  {
    return zzaJe;
  }
  
  public final long getRawScore()
  {
    return zzaJh;
  }
  
  public final Player getScoreHolder()
  {
    return zzaJm;
  }
  
  public final String getScoreHolderDisplayName()
  {
    if (zzaJm == null) {
      return zzaJj;
    }
    return zzaJm.getDisplayName();
  }
  
  public final void getScoreHolderDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (zzaJm == null)
    {
      zzms.zzb(zzaJj, paramCharArrayBuffer);
      return;
    }
    zzaJm.getDisplayName(paramCharArrayBuffer);
  }
  
  public final Uri getScoreHolderHiResImageUri()
  {
    if (zzaJm == null) {
      return zzaJl;
    }
    return zzaJm.getHiResImageUri();
  }
  
  public final String getScoreHolderHiResImageUrl()
  {
    if (zzaJm == null) {
      return zzaJp;
    }
    return zzaJm.getHiResImageUrl();
  }
  
  public final Uri getScoreHolderIconImageUri()
  {
    if (zzaJm == null) {
      return zzaJk;
    }
    return zzaJm.getIconImageUri();
  }
  
  public final String getScoreHolderIconImageUrl()
  {
    if (zzaJm == null) {
      return zzaJo;
    }
    return zzaJm.getIconImageUrl();
  }
  
  public final String getScoreTag()
  {
    return zzaJn;
  }
  
  public final long getTimestampMillis()
  {
    return zzaJi;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final LeaderboardScore zzxK()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardScoreEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */