package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;

final class GamesClientImpl$LoadMatchesResultImpl
  implements TurnBasedMultiplayer.LoadMatchesResult
{
  private final Status zzUX;
  private final LoadMatchesResponse zzaEG;
  
  GamesClientImpl$LoadMatchesResultImpl(Status paramStatus, Bundle paramBundle)
  {
    zzUX = paramStatus;
    zzaEG = new LoadMatchesResponse(paramBundle);
  }
  
  public final LoadMatchesResponse getMatches()
  {
    return zzaEG;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
  
  public final void release()
  {
    zzaEG.release();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadMatchesResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */