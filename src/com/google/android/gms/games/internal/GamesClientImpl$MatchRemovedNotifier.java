package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;

final class GamesClientImpl$MatchRemovedNotifier
  implements zzq.zzb
{
  private final String zzaER;
  
  GamesClientImpl$MatchRemovedNotifier(String paramString)
  {
    zzaER = paramString;
  }
  
  public final void zza(OnTurnBasedMatchUpdateReceivedListener paramOnTurnBasedMatchUpdateReceivedListener)
  {
    paramOnTurnBasedMatchUpdateReceivedListener.onTurnBasedMatchRemoved(zzaER);
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.MatchRemovedNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */