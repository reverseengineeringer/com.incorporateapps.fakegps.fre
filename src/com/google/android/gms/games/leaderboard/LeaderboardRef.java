package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public final class LeaderboardRef
  extends zzc
  implements Leaderboard
{
  private final int zzaDQ;
  private final Game zzaJc;
  
  LeaderboardRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    zzaDQ = paramInt2;
    zzaJc = new GameRef(paramDataHolder, paramInt1);
  }
  
  public final boolean equals(Object paramObject)
  {
    return LeaderboardEntity.zza(this, paramObject);
  }
  
  public final String getDisplayName()
  {
    return getString("name");
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("name", paramCharArrayBuffer);
  }
  
  public final Game getGame()
  {
    return zzaJc;
  }
  
  public final Uri getIconImageUri()
  {
    return zzcA("board_icon_image_uri");
  }
  
  public final String getIconImageUrl()
  {
    return getString("board_icon_image_url");
  }
  
  public final String getLeaderboardId()
  {
    return getString("external_leaderboard_id");
  }
  
  public final int getScoreOrder()
  {
    return getInteger("score_order");
  }
  
  public final ArrayList getVariants()
  {
    ArrayList localArrayList = new ArrayList(zzaDQ);
    int i = 0;
    while (i < zzaDQ)
    {
      localArrayList.add(new LeaderboardVariantRef(zzahi, zzaje + i));
      i += 1;
    }
    return localArrayList;
  }
  
  public final int hashCode()
  {
    return LeaderboardEntity.zza(this);
  }
  
  public final String toString()
  {
    return LeaderboardEntity.zzb(this);
  }
  
  public final Leaderboard zzxI()
  {
    return new LeaderboardEntity(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */