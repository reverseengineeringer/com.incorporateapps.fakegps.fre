package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.zzms;
import java.util.ArrayList;

public final class LeaderboardEntity
  implements Leaderboard
{
  private final String zzWQ;
  private final Uri zzaCd;
  private final String zzaCo;
  private final String zzaIZ;
  private final int zzaJa;
  private final ArrayList zzaJb;
  private final Game zzaJc;
  
  public LeaderboardEntity(Leaderboard paramLeaderboard)
  {
    zzaIZ = paramLeaderboard.getLeaderboardId();
    zzWQ = paramLeaderboard.getDisplayName();
    zzaCd = paramLeaderboard.getIconImageUri();
    zzaCo = paramLeaderboard.getIconImageUrl();
    zzaJa = paramLeaderboard.getScoreOrder();
    Object localObject = paramLeaderboard.getGame();
    if (localObject == null) {}
    for (localObject = null;; localObject = new GameEntity((Game)localObject))
    {
      zzaJc = ((Game)localObject);
      paramLeaderboard = paramLeaderboard.getVariants();
      int j = paramLeaderboard.size();
      zzaJb = new ArrayList(j);
      int i = 0;
      while (i < j)
      {
        zzaJb.add((LeaderboardVariantEntity)((LeaderboardVariant)paramLeaderboard.get(i)).freeze());
        i += 1;
      }
    }
  }
  
  static int zza(Leaderboard paramLeaderboard)
  {
    return zzw.hashCode(new Object[] { paramLeaderboard.getLeaderboardId(), paramLeaderboard.getDisplayName(), paramLeaderboard.getIconImageUri(), Integer.valueOf(paramLeaderboard.getScoreOrder()), paramLeaderboard.getVariants() });
  }
  
  static boolean zza(Leaderboard paramLeaderboard, Object paramObject)
  {
    if (!(paramObject instanceof Leaderboard)) {}
    do
    {
      return false;
      if (paramLeaderboard == paramObject) {
        return true;
      }
      paramObject = (Leaderboard)paramObject;
    } while ((!zzw.equal(((Leaderboard)paramObject).getLeaderboardId(), paramLeaderboard.getLeaderboardId())) || (!zzw.equal(((Leaderboard)paramObject).getDisplayName(), paramLeaderboard.getDisplayName())) || (!zzw.equal(((Leaderboard)paramObject).getIconImageUri(), paramLeaderboard.getIconImageUri())) || (!zzw.equal(Integer.valueOf(((Leaderboard)paramObject).getScoreOrder()), Integer.valueOf(paramLeaderboard.getScoreOrder()))) || (!zzw.equal(((Leaderboard)paramObject).getVariants(), paramLeaderboard.getVariants())));
    return true;
  }
  
  static String zzb(Leaderboard paramLeaderboard)
  {
    return zzw.zzy(paramLeaderboard).zzg("LeaderboardId", paramLeaderboard.getLeaderboardId()).zzg("DisplayName", paramLeaderboard.getDisplayName()).zzg("IconImageUri", paramLeaderboard.getIconImageUri()).zzg("IconImageUrl", paramLeaderboard.getIconImageUrl()).zzg("ScoreOrder", Integer.valueOf(paramLeaderboard.getScoreOrder())).zzg("Variants", paramLeaderboard.getVariants()).toString();
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final String getDisplayName()
  {
    return zzWQ;
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzWQ, paramCharArrayBuffer);
  }
  
  public final Game getGame()
  {
    return zzaJc;
  }
  
  public final Uri getIconImageUri()
  {
    return zzaCd;
  }
  
  public final String getIconImageUrl()
  {
    return zzaCo;
  }
  
  public final String getLeaderboardId()
  {
    return zzaIZ;
  }
  
  public final int getScoreOrder()
  {
    return zzaJa;
  }
  
  public final ArrayList getVariants()
  {
    return new ArrayList(zzaJb);
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
  
  public final Leaderboard zzxI()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */