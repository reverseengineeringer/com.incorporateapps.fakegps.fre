package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerClient.GameManagerResult;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

final class zzli$zze
  implements GameManagerClient.GameManagerResult
{
  private final Status zzUX;
  private final String zzacX;
  private final long zzacY;
  private final JSONObject zzacZ;
  
  zzli$zze(Status paramStatus, String paramString, long paramLong, JSONObject paramJSONObject)
  {
    zzUX = paramStatus;
    zzacX = paramString;
    zzacY = paramLong;
    zzacZ = paramJSONObject;
  }
  
  public final JSONObject getExtraMessageData()
  {
    return zzacZ;
  }
  
  public final String getPlayerId()
  {
    return zzacX;
  }
  
  public final long getRequestId()
  {
    return zzacY;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzli.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */