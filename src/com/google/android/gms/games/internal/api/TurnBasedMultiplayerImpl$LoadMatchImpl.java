package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult;

abstract class TurnBasedMultiplayerImpl$LoadMatchImpl
  extends Games.BaseGamesApiMethodImpl
{
  private TurnBasedMultiplayerImpl$LoadMatchImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public TurnBasedMultiplayer.LoadMatchResult zzaL(Status paramStatus)
  {
    return new TurnBasedMultiplayerImpl.LoadMatchImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.LoadMatchImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */