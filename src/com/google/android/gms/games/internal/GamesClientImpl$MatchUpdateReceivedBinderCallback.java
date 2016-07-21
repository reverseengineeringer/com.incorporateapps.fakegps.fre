package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;

final class GamesClientImpl$MatchUpdateReceivedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zzq zzari;
  
  GamesClientImpl$MatchUpdateReceivedBinderCallback(zzq paramzzq)
  {
    zzari = paramzzq;
  }
  
  public final void onTurnBasedMatchRemoved(String paramString)
  {
    zzari.zza(new GamesClientImpl.MatchRemovedNotifier(paramString));
  }
  
  public final void zzy(DataHolder paramDataHolder)
  {
    TurnBasedMatchBuffer localTurnBasedMatchBuffer = new TurnBasedMatchBuffer(paramDataHolder);
    paramDataHolder = null;
    try
    {
      if (localTurnBasedMatchBuffer.getCount() > 0) {
        paramDataHolder = (TurnBasedMatch)((TurnBasedMatch)localTurnBasedMatchBuffer.get(0)).freeze();
      }
      localTurnBasedMatchBuffer.release();
      if (paramDataHolder != null) {
        zzari.zza(new GamesClientImpl.MatchUpdateReceivedNotifier(paramDataHolder));
      }
      return;
    }
    finally
    {
      localTurnBasedMatchBuffer.release();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.MatchUpdateReceivedBinderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */