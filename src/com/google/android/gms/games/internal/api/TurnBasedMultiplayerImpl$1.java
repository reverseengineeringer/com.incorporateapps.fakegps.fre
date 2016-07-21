package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;

class TurnBasedMultiplayerImpl$1
  extends TurnBasedMultiplayerImpl.InitiateMatchImpl
{
  TurnBasedMultiplayerImpl$1(TurnBasedMultiplayerImpl paramTurnBasedMultiplayerImpl, GoogleApiClient paramGoogleApiClient, TurnBasedMatchConfig paramTurnBasedMatchConfig)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    paramGamesClientImpl.zza(this, zzaHG);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */