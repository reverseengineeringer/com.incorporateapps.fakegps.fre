package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;

public final class LeaderboardVariantEntity
  implements LeaderboardVariant
{
  private final String zzaJA;
  private final String zzaJB;
  private final String zzaJC;
  private final int zzaJr;
  private final int zzaJs;
  private final boolean zzaJt;
  private final long zzaJu;
  private final String zzaJv;
  private final long zzaJw;
  private final String zzaJx;
  private final String zzaJy;
  private final long zzaJz;
  
  public LeaderboardVariantEntity(LeaderboardVariant paramLeaderboardVariant)
  {
    zzaJr = paramLeaderboardVariant.getTimeSpan();
    zzaJs = paramLeaderboardVariant.getCollection();
    zzaJt = paramLeaderboardVariant.hasPlayerInfo();
    zzaJu = paramLeaderboardVariant.getRawPlayerScore();
    zzaJv = paramLeaderboardVariant.getDisplayPlayerScore();
    zzaJw = paramLeaderboardVariant.getPlayerRank();
    zzaJx = paramLeaderboardVariant.getDisplayPlayerRank();
    zzaJy = paramLeaderboardVariant.getPlayerScoreTag();
    zzaJz = paramLeaderboardVariant.getNumScores();
    zzaJA = paramLeaderboardVariant.zzxL();
    zzaJB = paramLeaderboardVariant.zzxM();
    zzaJC = paramLeaderboardVariant.zzxN();
  }
  
  static int zza(LeaderboardVariant paramLeaderboardVariant)
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(paramLeaderboardVariant.getTimeSpan()), Integer.valueOf(paramLeaderboardVariant.getCollection()), Boolean.valueOf(paramLeaderboardVariant.hasPlayerInfo()), Long.valueOf(paramLeaderboardVariant.getRawPlayerScore()), paramLeaderboardVariant.getDisplayPlayerScore(), Long.valueOf(paramLeaderboardVariant.getPlayerRank()), paramLeaderboardVariant.getDisplayPlayerRank(), Long.valueOf(paramLeaderboardVariant.getNumScores()), paramLeaderboardVariant.zzxL(), paramLeaderboardVariant.zzxN(), paramLeaderboardVariant.zzxM() });
  }
  
  static boolean zza(LeaderboardVariant paramLeaderboardVariant, Object paramObject)
  {
    if (!(paramObject instanceof LeaderboardVariant)) {}
    do
    {
      return false;
      if (paramLeaderboardVariant == paramObject) {
        return true;
      }
      paramObject = (LeaderboardVariant)paramObject;
    } while ((!zzw.equal(Integer.valueOf(((LeaderboardVariant)paramObject).getTimeSpan()), Integer.valueOf(paramLeaderboardVariant.getTimeSpan()))) || (!zzw.equal(Integer.valueOf(((LeaderboardVariant)paramObject).getCollection()), Integer.valueOf(paramLeaderboardVariant.getCollection()))) || (!zzw.equal(Boolean.valueOf(((LeaderboardVariant)paramObject).hasPlayerInfo()), Boolean.valueOf(paramLeaderboardVariant.hasPlayerInfo()))) || (!zzw.equal(Long.valueOf(((LeaderboardVariant)paramObject).getRawPlayerScore()), Long.valueOf(paramLeaderboardVariant.getRawPlayerScore()))) || (!zzw.equal(((LeaderboardVariant)paramObject).getDisplayPlayerScore(), paramLeaderboardVariant.getDisplayPlayerScore())) || (!zzw.equal(Long.valueOf(((LeaderboardVariant)paramObject).getPlayerRank()), Long.valueOf(paramLeaderboardVariant.getPlayerRank()))) || (!zzw.equal(((LeaderboardVariant)paramObject).getDisplayPlayerRank(), paramLeaderboardVariant.getDisplayPlayerRank())) || (!zzw.equal(Long.valueOf(((LeaderboardVariant)paramObject).getNumScores()), Long.valueOf(paramLeaderboardVariant.getNumScores()))) || (!zzw.equal(((LeaderboardVariant)paramObject).zzxL(), paramLeaderboardVariant.zzxL())) || (!zzw.equal(((LeaderboardVariant)paramObject).zzxN(), paramLeaderboardVariant.zzxN())) || (!zzw.equal(((LeaderboardVariant)paramObject).zzxM(), paramLeaderboardVariant.zzxM())));
    return true;
  }
  
  static String zzb(LeaderboardVariant paramLeaderboardVariant)
  {
    zzw.zza localzza = zzw.zzy(paramLeaderboardVariant).zzg("TimeSpan", TimeSpan.zzgw(paramLeaderboardVariant.getTimeSpan())).zzg("Collection", LeaderboardCollection.zzgw(paramLeaderboardVariant.getCollection()));
    if (paramLeaderboardVariant.hasPlayerInfo())
    {
      localObject = Long.valueOf(paramLeaderboardVariant.getRawPlayerScore());
      localzza = localzza.zzg("RawPlayerScore", localObject);
      if (!paramLeaderboardVariant.hasPlayerInfo()) {
        break label191;
      }
      localObject = paramLeaderboardVariant.getDisplayPlayerScore();
      label76:
      localzza = localzza.zzg("DisplayPlayerScore", localObject);
      if (!paramLeaderboardVariant.hasPlayerInfo()) {
        break label197;
      }
      localObject = Long.valueOf(paramLeaderboardVariant.getPlayerRank());
      label103:
      localzza = localzza.zzg("PlayerRank", localObject);
      if (!paramLeaderboardVariant.hasPlayerInfo()) {
        break label203;
      }
    }
    label191:
    label197:
    label203:
    for (Object localObject = paramLeaderboardVariant.getDisplayPlayerRank();; localObject = "none")
    {
      return localzza.zzg("DisplayPlayerRank", localObject).zzg("NumScores", Long.valueOf(paramLeaderboardVariant.getNumScores())).zzg("TopPageNextToken", paramLeaderboardVariant.zzxL()).zzg("WindowPageNextToken", paramLeaderboardVariant.zzxN()).zzg("WindowPagePrevToken", paramLeaderboardVariant.zzxM()).toString();
      localObject = "none";
      break;
      localObject = "none";
      break label76;
      localObject = "none";
      break label103;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final int getCollection()
  {
    return zzaJs;
  }
  
  public final String getDisplayPlayerRank()
  {
    return zzaJx;
  }
  
  public final String getDisplayPlayerScore()
  {
    return zzaJv;
  }
  
  public final long getNumScores()
  {
    return zzaJz;
  }
  
  public final long getPlayerRank()
  {
    return zzaJw;
  }
  
  public final String getPlayerScoreTag()
  {
    return zzaJy;
  }
  
  public final long getRawPlayerScore()
  {
    return zzaJu;
  }
  
  public final int getTimeSpan()
  {
    return zzaJr;
  }
  
  public final boolean hasPlayerInfo()
  {
    return zzaJt;
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
  
  public final String zzxL()
  {
    return zzaJA;
  }
  
  public final String zzxM()
  {
    return zzaJB;
  }
  
  public final String zzxN()
  {
    return zzaJC;
  }
  
  public final LeaderboardVariant zzxO()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardVariantEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */