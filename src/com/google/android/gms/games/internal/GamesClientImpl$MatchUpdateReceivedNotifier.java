package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;

final class GamesClientImpl$MatchUpdateReceivedNotifier
  implements zzq.zzb
{
  private final TurnBasedMatch zzaES;
  
  GamesClientImpl$MatchUpdateReceivedNotifier(TurnBasedMatch paramTurnBasedMatch)
  {
    zzaES = paramTurnBasedMatch;
  }
  
  public final void zza(OnTurnBasedMatchUpdateReceivedListener paramOnTurnBasedMatchUpdateReceivedListener)
  {
    paramOnTurnBasedMatchUpdateReceivedListener.onTurnBasedMatchReceived(zzaES);
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.MatchUpdateReceivedNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */