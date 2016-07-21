package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Notifications.GameMuteStatusLoadResult;
import com.google.android.gms.games.internal.GamesClientImpl;

class NotificationsImpl$3
  extends Games.BaseGamesApiMethodImpl
{
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    paramGamesClientImpl.zzo(this, zzaGC);
  }
  
  public Notifications.GameMuteStatusLoadResult zzap(Status paramStatus)
  {
    return new NotificationsImpl.3.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.NotificationsImpl.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */