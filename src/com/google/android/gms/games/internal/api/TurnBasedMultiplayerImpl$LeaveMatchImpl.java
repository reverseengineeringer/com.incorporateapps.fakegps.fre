package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult;

abstract class TurnBasedMultiplayerImpl$LeaveMatchImpl
  extends Games.BaseGamesApiMethodImpl
{
  private TurnBasedMultiplayerImpl$LeaveMatchImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public TurnBasedMultiplayer.LeaveMatchResult zzaK(Status paramStatus)
  {
    return new TurnBasedMultiplayerImpl.LeaveMatchImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.LeaveMatchImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */