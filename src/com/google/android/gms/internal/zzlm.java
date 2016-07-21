package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerState;
import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class zzlm
  implements GameManagerState
{
  private final String zzada;
  private final int zzadb;
  private final int zzadg;
  private final int zzadh;
  private final JSONObject zzadj;
  private final String zzadk;
  private final Map zzadm;
  
  public zzlm(int paramInt1, int paramInt2, String paramString1, JSONObject paramJSONObject, Collection paramCollection, String paramString2, int paramInt3)
  {
    zzadh = paramInt1;
    zzadg = paramInt2;
    zzadk = paramString1;
    zzadj = paramJSONObject;
    zzada = paramString2;
    zzadb = paramInt3;
    zzadm = new HashMap(paramCollection.size());
    paramString1 = paramCollection.iterator();
    while (paramString1.hasNext())
    {
      paramJSONObject = (PlayerInfo)paramString1.next();
      zzadm.put(paramJSONObject.getPlayerId(), paramJSONObject);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof GameManagerState))) {}
    do
    {
      return false;
      paramObject = (GameManagerState)paramObject;
    } while (getPlayers().size() != ((GameManagerState)paramObject).getPlayers().size());
    Iterator localIterator1 = getPlayers().iterator();
    label86:
    label238:
    label239:
    for (;;)
    {
      int i;
      if (localIterator1.hasNext())
      {
        PlayerInfo localPlayerInfo1 = (PlayerInfo)localIterator1.next();
        Iterator localIterator2 = ((GameManagerState)paramObject).getPlayers().iterator();
        i = 0;
        if (localIterator2.hasNext())
        {
          PlayerInfo localPlayerInfo2 = (PlayerInfo)localIterator2.next();
          if (!zzf.zza(localPlayerInfo1.getPlayerId(), localPlayerInfo2.getPlayerId())) {
            break label238;
          }
          if (!zzf.zza(localPlayerInfo1, localPlayerInfo2)) {
            break;
          }
          i = 1;
        }
      }
      for (;;)
      {
        break label86;
        if (i != 0) {
          break label239;
        }
        return false;
        if ((zzadh != ((GameManagerState)paramObject).getLobbyState()) || (zzadg != ((GameManagerState)paramObject).getGameplayState()) || (zzadb != ((GameManagerState)paramObject).getMaxPlayers()) || (!zzf.zza(zzada, ((GameManagerState)paramObject).getApplicationName())) || (!zzf.zza(zzadk, ((GameManagerState)paramObject).getGameStatusText())) || (!zznb.zze(zzadj, ((GameManagerState)paramObject).getGameData()))) {
          break;
        }
        return true;
      }
    }
  }
  
  public final CharSequence getApplicationName()
  {
    return zzada;
  }
  
  public final List getConnectedControllablePlayers()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = getPlayers().iterator();
    while (localIterator.hasNext())
    {
      PlayerInfo localPlayerInfo = (PlayerInfo)localIterator.next();
      if ((localPlayerInfo.isConnected()) && (localPlayerInfo.isControllable())) {
        localArrayList.add(localPlayerInfo);
      }
    }
    return localArrayList;
  }
  
  public final List getConnectedPlayers()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = getPlayers().iterator();
    while (localIterator.hasNext())
    {
      PlayerInfo localPlayerInfo = (PlayerInfo)localIterator.next();
      if (localPlayerInfo.isConnected()) {
        localArrayList.add(localPlayerInfo);
      }
    }
    return localArrayList;
  }
  
  public final List getControllablePlayers()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = getPlayers().iterator();
    while (localIterator.hasNext())
    {
      PlayerInfo localPlayerInfo = (PlayerInfo)localIterator.next();
      if (localPlayerInfo.isControllable()) {
        localArrayList.add(localPlayerInfo);
      }
    }
    return localArrayList;
  }
  
  public final JSONObject getGameData()
  {
    return zzadj;
  }
  
  public final CharSequence getGameStatusText()
  {
    return zzadk;
  }
  
  public final int getGameplayState()
  {
    return zzadg;
  }
  
  public final Collection getListOfChangedPlayers(GameManagerState paramGameManagerState)
  {
    HashSet localHashSet = new HashSet();
    Object localObject = getPlayers().iterator();
    while (((Iterator)localObject).hasNext())
    {
      PlayerInfo localPlayerInfo1 = (PlayerInfo)((Iterator)localObject).next();
      PlayerInfo localPlayerInfo2 = paramGameManagerState.getPlayer(localPlayerInfo1.getPlayerId());
      if ((localPlayerInfo2 == null) || (!localPlayerInfo1.equals(localPlayerInfo2))) {
        localHashSet.add(localPlayerInfo1.getPlayerId());
      }
    }
    paramGameManagerState = paramGameManagerState.getPlayers().iterator();
    while (paramGameManagerState.hasNext())
    {
      localObject = (PlayerInfo)paramGameManagerState.next();
      if (getPlayer(((PlayerInfo)localObject).getPlayerId()) == null) {
        localHashSet.add(((PlayerInfo)localObject).getPlayerId());
      }
    }
    return localHashSet;
  }
  
  public final int getLobbyState()
  {
    return zzadh;
  }
  
  public final int getMaxPlayers()
  {
    return zzadb;
  }
  
  public final PlayerInfo getPlayer(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return (PlayerInfo)zzadm.get(paramString);
  }
  
  public final Collection getPlayers()
  {
    return Collections.unmodifiableCollection(zzadm.values());
  }
  
  public final List getPlayersInState(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = getPlayers().iterator();
    while (localIterator.hasNext())
    {
      PlayerInfo localPlayerInfo = (PlayerInfo)localIterator.next();
      if (localPlayerInfo.getPlayerState() == paramInt) {
        localArrayList.add(localPlayerInfo);
      }
    }
    return localArrayList;
  }
  
  public final boolean hasGameDataChanged(GameManagerState paramGameManagerState)
  {
    return !zznb.zze(zzadj, paramGameManagerState.getGameData());
  }
  
  public final boolean hasGameStatusTextChanged(GameManagerState paramGameManagerState)
  {
    return !zzf.zza(zzadk, paramGameManagerState.getGameStatusText());
  }
  
  public final boolean hasGameplayStateChanged(GameManagerState paramGameManagerState)
  {
    return zzadg != paramGameManagerState.getGameplayState();
  }
  
  public final boolean hasLobbyStateChanged(GameManagerState paramGameManagerState)
  {
    return zzadh != paramGameManagerState.getLobbyState();
  }
  
  public final boolean hasPlayerChanged(String paramString, GameManagerState paramGameManagerState)
  {
    return !zzf.zza(getPlayer(paramString), paramGameManagerState.getPlayer(paramString));
  }
  
  public final boolean hasPlayerDataChanged(String paramString, GameManagerState paramGameManagerState)
  {
    PlayerInfo localPlayerInfo = getPlayer(paramString);
    paramString = paramGameManagerState.getPlayer(paramString);
    if ((localPlayerInfo == null) && (paramString == null)) {}
    do
    {
      return false;
      if ((localPlayerInfo == null) || (paramString == null)) {
        break;
      }
    } while (zznb.zze(localPlayerInfo.getPlayerData(), paramString.getPlayerData()));
    return true;
    return true;
  }
  
  public final boolean hasPlayerStateChanged(String paramString, GameManagerState paramGameManagerState)
  {
    PlayerInfo localPlayerInfo = getPlayer(paramString);
    paramString = paramGameManagerState.getPlayer(paramString);
    if ((localPlayerInfo == null) && (paramString == null)) {}
    do
    {
      return false;
      if ((localPlayerInfo == null) || (paramString == null)) {
        break;
      }
    } while (localPlayerInfo.getPlayerState() == paramString.getPlayerState());
    return true;
    return true;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzadh), Integer.valueOf(zzadg), zzadm, zzadk, zzadj, zzada, Integer.valueOf(zzadb) });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */