package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;

final class GamesClientImpl$CancelMatchResultImpl
  implements TurnBasedMultiplayer.CancelMatchResult
{
  private final Status zzUX;
  private final String zzaEm;
  
  GamesClientImpl$CancelMatchResultImpl(Status paramStatus, String paramString)
  {
    zzUX = paramStatus;
    zzaEm = paramString;
  }
  
  public final String getMatchId()
  {
    return zzaEm;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.CancelMatchResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */