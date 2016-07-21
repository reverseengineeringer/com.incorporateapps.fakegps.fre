package com.google.android.gms.cast.games;

import org.json.JSONObject;

public abstract interface PlayerInfo
{
  public abstract JSONObject getPlayerData();
  
  public abstract String getPlayerId();
  
  public abstract int getPlayerState();
  
  public abstract boolean isConnected();
  
  public abstract boolean isControllable();
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.games.PlayerInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */