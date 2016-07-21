package com.google.android.gms.internal;

import org.json.JSONObject;

public final class zzlj
{
  private final String zzada;
  private final int zzadb;
  private final String zzadc;
  
  public zzlj(String paramString1, int paramInt, String paramString2)
  {
    zzada = paramString1;
    zzadb = paramInt;
    zzadc = paramString2;
  }
  
  public zzlj(JSONObject paramJSONObject)
  {
    this(paramJSONObject.optString("applicationName"), paramJSONObject.optInt("maxPlayers"), paramJSONObject.optString("version"));
  }
  
  public final int getMaxPlayers()
  {
    return zzadb;
  }
  
  public final String getVersion()
  {
    return zzadc;
  }
  
  public final String zznX()
  {
    return zzada;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */