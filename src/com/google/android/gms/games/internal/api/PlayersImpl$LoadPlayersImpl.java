package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Players.LoadPlayersResult;

abstract class PlayersImpl$LoadPlayersImpl
  extends Games.BaseGamesApiMethodImpl
{
  private PlayersImpl$LoadPlayersImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Players.LoadPlayersResult zzas(Status paramStatus)
  {
    return new PlayersImpl.LoadPlayersImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.PlayersImpl.LoadPlayersImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */