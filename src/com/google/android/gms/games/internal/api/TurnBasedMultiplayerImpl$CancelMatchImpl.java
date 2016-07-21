package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;

abstract class TurnBasedMultiplayerImpl$CancelMatchImpl
  extends Games.BaseGamesApiMethodImpl
{
  private final String zzyv;
  
  public TurnBasedMultiplayerImpl$CancelMatchImpl(String paramString, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    zzyv = paramString;
  }
  
  public TurnBasedMultiplayer.CancelMatchResult zzaI(Status paramStatus)
  {
    return new TurnBasedMultiplayerImpl.CancelMatchImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.CancelMatchImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */