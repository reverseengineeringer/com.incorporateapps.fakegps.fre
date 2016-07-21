package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;

public final class LeaderboardsImpl
  implements Leaderboards
{
  public final Intent getAllLeaderboardsIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwz();
  }
  
  public final Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return getLeaderboardIntent(paramGoogleApiClient, paramString, -1);
  }
  
  public final Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    return getLeaderboardIntent(paramGoogleApiClient, paramString, paramInt, -1);
  }
  
  public final Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2)
  {
    return Games.zzh(paramGoogleApiClient).zzl(paramString, paramInt1, paramInt2);
  }
  
  public final PendingResult loadCurrentPlayerLeaderboardScore(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2)
  {
    return paramGoogleApiClient.zza(new LeaderboardsImpl.3(this, paramGoogleApiClient, paramString, paramInt1, paramInt2));
  }
  
  public final PendingResult loadLeaderboardMetadata(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new LeaderboardsImpl.2(this, paramGoogleApiClient, paramString, paramBoolean));
  }
  
  public final PendingResult loadLeaderboardMetadata(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new LeaderboardsImpl.1(this, paramGoogleApiClient, paramBoolean));
  }
  
  public final PendingResult loadMoreScores(GoogleApiClient paramGoogleApiClient, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
  {
    return paramGoogleApiClient.zza(new LeaderboardsImpl.6(this, paramGoogleApiClient, paramLeaderboardScoreBuffer, paramInt1, paramInt2));
  }
  
  public final PendingResult loadPlayerCenteredScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return loadPlayerCenteredScores(paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, false);
  }
  
  public final PendingResult loadPlayerCenteredScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new LeaderboardsImpl.5(this, paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, paramBoolean));
  }
  
  public final PendingResult loadTopScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return loadTopScores(paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, false);
  }
  
  public final PendingResult loadTopScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new LeaderboardsImpl.4(this, paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, paramBoolean));
  }
  
  public final void submitScore(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong)
  {
    submitScore(paramGoogleApiClient, paramString, paramLong, null);
  }
  
  public final void submitScore(GoogleApiClient paramGoogleApiClient, String paramString1, long paramLong, String paramString2)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {}
    try
    {
      paramGoogleApiClient.zza(null, paramString1, paramLong, paramString2);
      return;
    }
    catch (RemoteException paramGoogleApiClient)
    {
      GamesLog.zzz("LeaderboardsImpl", "service died");
    }
  }
  
  public final PendingResult submitScoreImmediate(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong)
  {
    return submitScoreImmediate(paramGoogleApiClient, paramString, paramLong, null);
  }
  
  public final PendingResult submitScoreImmediate(GoogleApiClient paramGoogleApiClient, String paramString1, long paramLong, String paramString2)
  {
    return paramGoogleApiClient.zzb(new LeaderboardsImpl.7(this, paramGoogleApiClient, paramString1, paramLong, paramString2));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.LeaderboardsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */