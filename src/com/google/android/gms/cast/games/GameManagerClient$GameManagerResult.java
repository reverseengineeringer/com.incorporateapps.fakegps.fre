package com.google.android.gms.cast.games;

import com.google.android.gms.common.api.Result;
import org.json.JSONObject;

public abstract interface GameManagerClient$GameManagerResult
  extends Result
{
  public abstract JSONObject getExtraMessageData();
  
  public abstract String getPlayerId();
  
  public abstract long getRequestId();
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.games.GameManagerClient.GameManagerResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */