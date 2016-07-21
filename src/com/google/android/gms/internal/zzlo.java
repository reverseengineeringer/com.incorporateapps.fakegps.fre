package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzf;
import org.json.JSONObject;

public final class zzlo
{
  private final int zzabo;
  private final String zzacX;
  private final JSONObject zzadn;
  
  public zzlo(String paramString, int paramInt, JSONObject paramJSONObject)
  {
    zzacX = paramString;
    zzabo = paramInt;
    zzadn = paramJSONObject;
  }
  
  public zzlo(JSONObject paramJSONObject)
  {
    this(paramJSONObject.optString("playerId"), paramJSONObject.optInt("playerState"), paramJSONObject.optJSONObject("playerData"));
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof zzlo))) {}
    do
    {
      return false;
      paramObject = (zzlo)paramObject;
    } while ((zzabo != ((zzlo)paramObject).getPlayerState()) || (!zzf.zza(zzacX, ((zzlo)paramObject).getPlayerId())) || (!zznb.zze(zzadn, ((zzlo)paramObject).getPlayerData())));
    return true;
  }
  
  public final JSONObject getPlayerData()
  {
    return zzadn;
  }
  
  public final String getPlayerId()
  {
    return zzacX;
  }
  
  public final int getPlayerState()
  {
    return zzabo;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */