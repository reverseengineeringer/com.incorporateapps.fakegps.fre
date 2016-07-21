package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzlk
{
  private static final zzl zzaaf = new zzl("GameManagerMessage");
  protected final zzlj zzacE;
  protected final String zzacX;
  protected final long zzacY;
  protected final JSONObject zzacZ;
  protected final int zzadd;
  protected final int zzade;
  protected final String zzadf;
  protected final int zzadg;
  protected final int zzadh;
  protected final List zzadi;
  protected final JSONObject zzadj;
  protected final String zzadk;
  protected final String zzadl;
  
  public zzlk(int paramInt1, int paramInt2, String paramString1, JSONObject paramJSONObject1, int paramInt3, int paramInt4, List paramList, JSONObject paramJSONObject2, String paramString2, String paramString3, long paramLong, String paramString4, zzlj paramzzlj)
  {
    zzadd = paramInt1;
    zzade = paramInt2;
    zzadf = paramString1;
    zzacZ = paramJSONObject1;
    zzadg = paramInt3;
    zzadh = paramInt4;
    zzadi = paramList;
    zzadj = paramJSONObject2;
    zzadk = paramString2;
    zzacX = paramString3;
    zzacY = paramLong;
    zzadl = paramString4;
    zzacE = paramzzlj;
  }
  
  private static List zzb(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramJSONArray == null) {
      return localArrayList;
    }
    int i = 0;
    for (;;)
    {
      if (i < paramJSONArray.length())
      {
        Object localObject1 = paramJSONArray.optJSONObject(i);
        if (localObject1 != null) {}
        try
        {
          localObject1 = new zzlo((JSONObject)localObject1);
          if (localObject1 != null) {
            localArrayList.add(localObject1);
          }
          i += 1;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            zzaaf.zzc(localJSONException, "Exception when attempting to parse PlayerInfoMessageComponent at index %d", new Object[] { Integer.valueOf(i) });
            Object localObject2 = null;
          }
        }
      }
    }
    return localArrayList;
  }
  
  protected static zzlk zzi(JSONObject paramJSONObject)
  {
    int i = paramJSONObject.optInt("type", -1);
    switch (i)
    {
    }
    try
    {
      zzaaf.zzf("Unrecognized Game Message type %d", new Object[] { Integer.valueOf(i) });
    }
    catch (JSONException paramJSONObject)
    {
      zzaaf.zzc(paramJSONObject, "Exception while parsing GameManagerMessage from json", new Object[0]);
      break label247;
      zzlj localzzlj = null;
      JSONObject localJSONObject = paramJSONObject.optJSONObject("gameManagerConfig");
      if (localJSONObject == null) {
        break label166;
      }
      localzzlj = new zzlj(localJSONObject);
      label166:
      paramJSONObject = new zzlk(i, paramJSONObject.optInt("statusCode"), paramJSONObject.optString("errorDescription"), paramJSONObject.optJSONObject("extraMessageData"), paramJSONObject.optInt("gameplayState"), paramJSONObject.optInt("lobbyState"), zzb(paramJSONObject.optJSONArray("players")), paramJSONObject.optJSONObject("gameData"), paramJSONObject.optString("gameStatusText"), paramJSONObject.optString("playerId"), paramJSONObject.optLong("requestId"), paramJSONObject.optString("playerToken"), localzzlj);
      return paramJSONObject;
    }
    paramJSONObject = new zzlk(i, paramJSONObject.optInt("statusCode"), paramJSONObject.optString("errorDescription"), paramJSONObject.optJSONObject("extraMessageData"), paramJSONObject.optInt("gameplayState"), paramJSONObject.optInt("lobbyState"), zzb(paramJSONObject.optJSONArray("players")), paramJSONObject.optJSONObject("gameData"), paramJSONObject.optString("gameStatusText"), paramJSONObject.optString("playerId"), -1L, null, null);
    return paramJSONObject;
    label247:
    return null;
  }
  
  public final JSONObject getExtraMessageData()
  {
    return zzacZ;
  }
  
  public final JSONObject getGameData()
  {
    return zzadj;
  }
  
  public final int getGameplayState()
  {
    return zzadg;
  }
  
  public final int getLobbyState()
  {
    return zzadh;
  }
  
  public final String getPlayerId()
  {
    return zzacX;
  }
  
  public final long getRequestId()
  {
    return zzacY;
  }
  
  public final int getStatusCode()
  {
    return zzade;
  }
  
  public final int zznY()
  {
    return zzadd;
  }
  
  public final String zznZ()
  {
    return zzadf;
  }
  
  public final List zzoa()
  {
    return zzadi;
  }
  
  public final String zzob()
  {
    return zzadk;
  }
  
  public final String zzoc()
  {
    return zzadl;
  }
  
  public final zzlj zzod()
  {
    return zzacE;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */