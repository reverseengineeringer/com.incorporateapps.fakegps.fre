package com.google.android.gms.cast.games;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.zzli;
import org.json.JSONObject;

public final class GameManagerClient
{
  public static final int GAMEPLAY_STATE_LOADING = 1;
  public static final int GAMEPLAY_STATE_PAUSED = 3;
  public static final int GAMEPLAY_STATE_RUNNING = 2;
  public static final int GAMEPLAY_STATE_SHOWING_INFO_SCREEN = 4;
  public static final int GAMEPLAY_STATE_UNKNOWN = 0;
  public static final int LOBBY_STATE_CLOSED = 2;
  public static final int LOBBY_STATE_OPEN = 1;
  public static final int LOBBY_STATE_UNKNOWN = 0;
  public static final int PLAYER_STATE_AVAILABLE = 3;
  public static final int PLAYER_STATE_DROPPED = 1;
  public static final int PLAYER_STATE_IDLE = 5;
  public static final int PLAYER_STATE_PLAYING = 6;
  public static final int PLAYER_STATE_QUIT = 2;
  public static final int PLAYER_STATE_READY = 4;
  public static final int PLAYER_STATE_UNKNOWN = 0;
  public static final int STATUS_INCORRECT_VERSION = 2150;
  public static final int STATUS_TOO_MANY_PLAYERS = 2151;
  private final zzli zzacy;
  
  public GameManagerClient(zzli paramzzli)
  {
    zzacy = paramzzli;
  }
  
  public static PendingResult getInstanceFor(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return zza(new zzli(paramGoogleApiClient, paramString, Cast.CastApi));
  }
  
  static PendingResult zza(zzli paramzzli)
  {
    return paramzzli.zza(new GameManagerClient(paramzzli));
  }
  
  private PendingResult zza(String paramString, int paramInt, JSONObject paramJSONObject)
  {
    return zzacy.zza(paramString, paramInt, paramJSONObject);
  }
  
  public final void dispose()
  {
    zzacy.dispose();
  }
  
  public final GameManagerState getCurrentState()
  {
    try
    {
      GameManagerState localGameManagerState = zzacy.getCurrentState();
      return localGameManagerState;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String getLastUsedPlayerId()
  {
    return zzacy.getLastUsedPlayerId();
  }
  
  public final boolean isDisposed()
  {
    return zzacy.isDisposed();
  }
  
  public final void sendGameMessage(String paramString, JSONObject paramJSONObject)
  {
    zzacy.sendGameMessage(paramString, paramJSONObject);
  }
  
  public final void sendGameMessage(JSONObject paramJSONObject)
  {
    sendGameMessage(getLastUsedPlayerId(), paramJSONObject);
  }
  
  public final PendingResult sendGameRequest(String paramString, JSONObject paramJSONObject)
  {
    return zzacy.sendGameRequest(paramString, paramJSONObject);
  }
  
  public final PendingResult sendGameRequest(JSONObject paramJSONObject)
  {
    return sendGameRequest(getLastUsedPlayerId(), paramJSONObject);
  }
  
  public final PendingResult sendPlayerAvailableRequest(String paramString, JSONObject paramJSONObject)
  {
    return zza(paramString, 3, paramJSONObject);
  }
  
  public final PendingResult sendPlayerAvailableRequest(JSONObject paramJSONObject)
  {
    return zza(getLastUsedPlayerId(), 3, paramJSONObject);
  }
  
  public final PendingResult sendPlayerIdleRequest(String paramString, JSONObject paramJSONObject)
  {
    return zza(paramString, 5, paramJSONObject);
  }
  
  public final PendingResult sendPlayerIdleRequest(JSONObject paramJSONObject)
  {
    return zza(getLastUsedPlayerId(), 5, paramJSONObject);
  }
  
  public final PendingResult sendPlayerPlayingRequest(String paramString, JSONObject paramJSONObject)
  {
    return zza(paramString, 6, paramJSONObject);
  }
  
  public final PendingResult sendPlayerPlayingRequest(JSONObject paramJSONObject)
  {
    return zza(getLastUsedPlayerId(), 6, paramJSONObject);
  }
  
  public final PendingResult sendPlayerQuitRequest(String paramString, JSONObject paramJSONObject)
  {
    return zza(paramString, 2, paramJSONObject);
  }
  
  public final PendingResult sendPlayerQuitRequest(JSONObject paramJSONObject)
  {
    return zza(getLastUsedPlayerId(), 2, paramJSONObject);
  }
  
  public final PendingResult sendPlayerReadyRequest(String paramString, JSONObject paramJSONObject)
  {
    return zza(paramString, 4, paramJSONObject);
  }
  
  public final PendingResult sendPlayerReadyRequest(JSONObject paramJSONObject)
  {
    return zza(getLastUsedPlayerId(), 4, paramJSONObject);
  }
  
  public final void setListener(GameManagerClient.Listener paramListener)
  {
    zzacy.setListener(paramListener);
  }
  
  public final void setSessionLabel(String paramString)
  {
    zzacy.setSessionLabel(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.games.GameManagerClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */