package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Notifications.GameMuteStatusChangeResult;
import com.google.android.gms.games.internal.GamesClientImpl;

class NotificationsImpl$2
  extends Games.BaseGamesApiMethodImpl
{
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    paramGamesClientImpl.zzd(this, zzaGC, false);
  }
  
  public Notifications.GameMuteStatusChangeResult zzao(Status paramStatus)
  {
    return new NotificationsImpl.2.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.NotificationsImpl.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */