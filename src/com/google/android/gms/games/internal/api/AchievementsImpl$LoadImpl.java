package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;

abstract class AchievementsImpl$LoadImpl
  extends Games.BaseGamesApiMethodImpl
{
  private AchievementsImpl$LoadImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Achievements.LoadAchievementsResult zzZ(Status paramStatus)
  {
    return new AchievementsImpl.LoadImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.AchievementsImpl.LoadImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */