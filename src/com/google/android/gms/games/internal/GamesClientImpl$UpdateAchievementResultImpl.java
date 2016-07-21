package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;

final class GamesClientImpl$UpdateAchievementResultImpl
  implements Achievements.UpdateAchievementResult
{
  private final Status zzUX;
  private final String zzaDj;
  
  GamesClientImpl$UpdateAchievementResultImpl(int paramInt, String paramString)
  {
    zzUX = GamesStatusCodes.zzgc(paramInt);
    zzaDj = paramString;
  }
  
  public final String getAchievementId()
  {
    return zzaDj;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.UpdateAchievementResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */