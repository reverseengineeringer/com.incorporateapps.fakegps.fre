package com.google.android.gms.games.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.games.internal.events.EventIncrementCache;

class GamesClientImpl$GameClientEventIncrementCache
  extends EventIncrementCache
{
  public GamesClientImpl$GameClientEventIncrementCache(GamesClientImpl paramGamesClientImpl)
  {
    super(paramGamesClientImpl.getContext().getMainLooper(), 1000);
  }
  
  protected void zzs(String paramString, int paramInt)
  {
    try
    {
      if (zzaEi.isConnected())
      {
        ((IGamesService)zzaEi.zzqJ()).zzp(paramString, paramInt);
        return;
      }
      GamesLog.zzA("GamesClientImpl", "Unable to increment event " + paramString + " by " + paramInt + " because the games client is no longer connected");
      return;
    }
    catch (RemoteException paramString)
    {
      GamesClientImpl.zza(zzaEi, paramString);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.GameClientEventIncrementCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */