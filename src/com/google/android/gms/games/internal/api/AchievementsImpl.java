package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AchievementsImpl
  implements Achievements
{
  public final Intent getAchievementsIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwA();
  }
  
  public final void increment(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    paramGoogleApiClient.zzb(new AchievementsImpl.6(this, paramString, paramGoogleApiClient, paramString, paramInt));
  }
  
  public final PendingResult incrementImmediate(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    return paramGoogleApiClient.zzb(new AchievementsImpl.7(this, paramString, paramGoogleApiClient, paramString, paramInt));
  }
  
  public final PendingResult load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new AchievementsImpl.1(this, paramGoogleApiClient, paramBoolean));
  }
  
  public final void reveal(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient.zzb(new AchievementsImpl.2(this, paramString, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult revealImmediate(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new AchievementsImpl.3(this, paramString, paramGoogleApiClient, paramString));
  }
  
  public final void setSteps(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    paramGoogleApiClient.zzb(new AchievementsImpl.8(this, paramString, paramGoogleApiClient, paramString, paramInt));
  }
  
  public final PendingResult setStepsImmediate(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    return paramGoogleApiClient.zzb(new AchievementsImpl.9(this, paramString, paramGoogleApiClient, paramString, paramInt));
  }
  
  public final void unlock(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient.zzb(new AchievementsImpl.4(this, paramString, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult unlockImmediate(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new AchievementsImpl.5(this, paramString, paramGoogleApiClient, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.AchievementsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */