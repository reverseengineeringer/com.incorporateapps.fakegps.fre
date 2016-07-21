package com.google.android.gms.internal;

import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import org.json.JSONObject;

public final class zzln
  implements PlayerInfo
{
  private final int zzabo;
  private final String zzacX;
  private final JSONObject zzadn;
  private final boolean zzado;
  
  public zzln(String paramString, int paramInt, JSONObject paramJSONObject, boolean paramBoolean)
  {
    zzacX = paramString;
    zzabo = paramInt;
    zzadn = paramJSONObject;
    zzado = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof PlayerInfo))) {}
    do
    {
      return false;
      paramObject = (PlayerInfo)paramObject;
    } while ((zzado != ((PlayerInfo)paramObject).isControllable()) || (zzabo != ((PlayerInfo)paramObject).getPlayerState()) || (!zzf.zza(zzacX, ((PlayerInfo)paramObject).getPlayerId())) || (!zznb.zze(zzadn, ((PlayerInfo)paramObject).getPlayerData())));
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
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzacX, Integer.valueOf(zzabo), zzadn, Boolean.valueOf(zzado) });
  }
  
  public final boolean isConnected()
  {
    switch (zzabo)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public final boolean isControllable()
  {
    return zzado;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzln
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */