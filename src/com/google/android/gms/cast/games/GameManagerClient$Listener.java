package com.google.android.gms.cast.games;

import org.json.JSONObject;

public abstract interface GameManagerClient$Listener
{
  public abstract void onGameMessageReceived(String paramString, JSONObject paramJSONObject);
  
  public abstract void onStateChanged(GameManagerState paramGameManagerState1, GameManagerState paramGameManagerState2);
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.games.GameManagerClient.Listener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */