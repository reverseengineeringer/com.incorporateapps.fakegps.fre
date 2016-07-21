package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import java.util.List;

public final class TurnBasedMultiplayerImpl
  implements TurnBasedMultiplayer
{
  public final PendingResult acceptInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new TurnBasedMultiplayerImpl.3(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult cancelMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new TurnBasedMultiplayerImpl.8(this, paramString, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult createMatch(GoogleApiClient paramGoogleApiClient, TurnBasedMatchConfig paramTurnBasedMatchConfig)
  {
    return paramGoogleApiClient.zzb(new TurnBasedMultiplayerImpl.1(this, paramGoogleApiClient, paramTurnBasedMatchConfig));
  }
  
  public final void declineInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzr(paramString, 1);
    }
  }
  
  public final void dismissInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzq(paramString, 1);
    }
  }
  
  public final void dismissMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzdH(paramString);
    }
  }
  
  public final PendingResult finishMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return finishMatch(paramGoogleApiClient, paramString, null, null);
  }
  
  public final PendingResult finishMatch(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, List paramList)
  {
    if (paramList == null) {}
    for (paramList = null;; paramList = (ParticipantResult[])paramList.toArray(new ParticipantResult[paramList.size()])) {
      return finishMatch(paramGoogleApiClient, paramString, paramArrayOfByte, paramList);
    }
  }
  
  public final PendingResult finishMatch(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, ParticipantResult... paramVarArgs)
  {
    return paramGoogleApiClient.zzb(new TurnBasedMultiplayerImpl.5(this, paramGoogleApiClient, paramString, paramArrayOfByte, paramVarArgs));
  }
  
  public final Intent getInboxIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwB();
  }
  
  public final int getMaxMatchDataSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwL();
  }
  
  public final Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2)
  {
    return Games.zzh(paramGoogleApiClient).zzb(paramInt1, paramInt2, true);
  }
  
  public final Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return Games.zzh(paramGoogleApiClient).zzb(paramInt1, paramInt2, paramBoolean);
  }
  
  public final PendingResult leaveMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new TurnBasedMultiplayerImpl.6(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult leaveMatchDuringTurn(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return paramGoogleApiClient.zzb(new TurnBasedMultiplayerImpl.7(this, paramGoogleApiClient, paramString1, paramString2));
  }
  
  public final PendingResult loadMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new TurnBasedMultiplayerImpl.10(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult loadMatchesByStatus(GoogleApiClient paramGoogleApiClient, int paramInt, int[] paramArrayOfInt)
  {
    return paramGoogleApiClient.zza(new TurnBasedMultiplayerImpl.9(this, paramGoogleApiClient, paramInt, paramArrayOfInt));
  }
  
  public final PendingResult loadMatchesByStatus(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt)
  {
    return loadMatchesByStatus(paramGoogleApiClient, 0, paramArrayOfInt);
  }
  
  public final void registerMatchUpdateListener(GoogleApiClient paramGoogleApiClient, OnTurnBasedMatchUpdateReceivedListener paramOnTurnBasedMatchUpdateReceivedListener)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzb(paramGoogleApiClient.zzr(paramOnTurnBasedMatchUpdateReceivedListener));
    }
  }
  
  public final PendingResult rematch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new TurnBasedMultiplayerImpl.2(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    return takeTurn(paramGoogleApiClient, paramString1, paramArrayOfByte, paramString2, null);
  }
  
  public final PendingResult takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2, List paramList)
  {
    if (paramList == null) {}
    for (paramList = null;; paramList = (ParticipantResult[])paramList.toArray(new ParticipantResult[paramList.size()])) {
      return takeTurn(paramGoogleApiClient, paramString1, paramArrayOfByte, paramString2, paramList);
    }
  }
  
  public final PendingResult takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2, ParticipantResult... paramVarArgs)
  {
    return paramGoogleApiClient.zzb(new TurnBasedMultiplayerImpl.4(this, paramGoogleApiClient, paramString1, paramArrayOfByte, paramString2, paramVarArgs));
  }
  
  public final void unregisterMatchUpdateListener(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzwE();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */