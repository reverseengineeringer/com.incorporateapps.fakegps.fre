package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.Cast.CastApi;
import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.games.GameManagerClient.Listener;
import com.google.android.gms.cast.games.GameManagerState;
import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzc;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.cast.internal.zzp;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class zzli
  extends zzc
{
  static final String NAMESPACE = zzf.zzci("com.google.cast.games");
  private static final zzl zzaaf = new zzl("GameManagerChannel");
  private final List zzacA;
  private final String zzacB;
  private final Cast.CastApi zzacC;
  private final GoogleApiClient zzacD;
  private zzlj zzacE;
  private boolean zzacF = false;
  private GameManagerState zzacG;
  private GameManagerState zzacH;
  private String zzacI;
  private JSONObject zzacJ;
  private long zzacK = 0L;
  private GameManagerClient.Listener zzacL;
  private String zzacM;
  private final Map zzacz = new ConcurrentHashMap();
  private final SharedPreferences zzvx;
  
  public zzli(GoogleApiClient paramGoogleApiClient, String paramString, Cast.CastApi paramCastApi)
  {
    super(NAMESPACE, "CastGameManagerChannel", null);
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("castSessionId cannot be null.");
    }
    if ((paramGoogleApiClient == null) || (!paramGoogleApiClient.isConnected()) || (!paramGoogleApiClient.hasConnectedApi(Cast.API))) {
      throw new IllegalArgumentException("googleApiClient needs to be connected and contain the Cast.API API.");
    }
    zzacA = new ArrayList();
    zzacB = paramString;
    zzacC = paramCastApi;
    zzacD = paramGoogleApiClient;
    paramGoogleApiClient = paramGoogleApiClient.getContext().getApplicationContext();
    paramString = String.format(Locale.ROOT, "%s.%s", new Object[] { paramGoogleApiClient.getPackageName(), "game_manager_channel_data" });
    zzvx = paramGoogleApiClient.getApplicationContext().getSharedPreferences(paramString, 0);
    zzacH = null;
    zzacG = new zzlm(0, 0, "", null, new ArrayList(), "", -1);
  }
  
  private JSONObject zza(long paramLong, String paramString, int paramInt, JSONObject paramJSONObject)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("requestId", paramLong);
      localJSONObject.put("type", paramInt);
      localJSONObject.put("extraMessageData", paramJSONObject);
      localJSONObject.put("playerId", paramString);
      localJSONObject.put("playerToken", zzce(paramString));
      return localJSONObject;
    }
    catch (JSONException paramString)
    {
      zzaaf.zzf("JSONException when trying to create a message: %s", new Object[] { paramString.getMessage() });
    }
    return null;
  }
  
  private void zza(zzlk paramzzlk)
  {
    int i = 1;
    for (;;)
    {
      try
      {
        if (paramzzlk.zznY() == 1)
        {
          zzacH = zzacG;
          if ((i != 0) && (paramzzlk.zzod() != null)) {
            zzacE = paramzzlk.zzod();
          }
          boolean bool = isInitialized();
          if (bool) {}
        }
        else
        {
          i = 0;
          continue;
        }
        localObject = new ArrayList();
        Iterator localIterator = paramzzlk.zzoa().iterator();
        if (localIterator.hasNext())
        {
          zzlo localzzlo = (zzlo)localIterator.next();
          String str = localzzlo.getPlayerId();
          ((ArrayList)localObject).add(new zzln(str, localzzlo.getPlayerState(), localzzlo.getPlayerData(), zzacz.containsKey(str)));
          continue;
        }
        zzacG = new zzlm(paramzzlk.getLobbyState(), paramzzlk.getGameplayState(), paramzzlk.zzob(), paramzzlk.getGameData(), (Collection)localObject, zzacE.zznX(), zzacE.getMaxPlayers());
      }
      finally {}
      Object localObject = zzacG.getPlayer(paramzzlk.getPlayerId());
      if ((localObject != null) && (((PlayerInfo)localObject).isControllable()) && (paramzzlk.zznY() == 2))
      {
        zzacI = paramzzlk.getPlayerId();
        zzacJ = paramzzlk.getExtraMessageData();
      }
    }
  }
  
  private void zza(String paramString, int paramInt, JSONObject paramJSONObject, zzo paramzzo)
  {
    long l = 1L + zzacK;
    zzacK = l;
    paramString = zza(l, paramString, paramInt, paramJSONObject);
    if (paramString == null)
    {
      paramzzo.zza(-1L, 2001, null);
      zzaaf.zzf("Not sending request because it was invalid.", new Object[0]);
      return;
    }
    paramJSONObject = new zzp(30000L);
    paramJSONObject.zza(l, paramzzo);
    zzacA.add(paramJSONObject);
    zzW(true);
    zzacC.sendMessage(zzacD, getNamespace(), paramString.toString()).setResultCallback(new zzli.4(this, l));
  }
  
  private void zzb(long paramLong, int paramInt, Object paramObject)
  {
    Iterator localIterator = zzacA.iterator();
    while (localIterator.hasNext()) {
      if (((zzp)localIterator.next()).zzc(paramLong, paramInt, paramObject)) {
        localIterator.remove();
      }
    }
  }
  
  private int zzbg(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    default: 
      zzaaf.zzf("Unknown GameManager protocol status code: " + paramInt, new Object[0]);
      i = 13;
    case 0: 
      return i;
    case 4: 
      return 2151;
    case 3: 
      return 2150;
    case 2: 
      return 2003;
    }
    return 2001;
  }
  
  private void zznR()
  {
    try
    {
      if (!isInitialized()) {
        throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel before it is initialized.");
      }
    }
    finally {}
    if (isDisposed()) {
      throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel after it has been disposed.");
    }
  }
  
  private void zznS()
  {
    if (zzacL != null)
    {
      if ((zzacH != null) && (!zzacG.equals(zzacH))) {
        zzacL.onStateChanged(zzacG, zzacH);
      }
      if ((zzacJ != null) && (zzacI != null)) {
        zzacL.onGameMessageReceived(zzacI, zzacJ);
      }
    }
    zzacH = null;
    zzacI = null;
    zzacJ = null;
  }
  
  private void zznT()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("castSessionId", zzacB);
      localJSONObject.put("playerTokenMap", new JSONObject(zzacz));
      zzvx.edit().putString("save_data", localJSONObject.toString()).commit();
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        zzaaf.zzf("Error while saving data: %s", new Object[] { localJSONException.getMessage() });
      }
    }
    finally {}
  }
  
  private void zznU()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = zzvx.getString("save_data", null);
        if (localObject1 == null) {
          return;
        }
        try
        {
          localObject1 = new JSONObject((String)localObject1);
          Object localObject3 = ((JSONObject)localObject1).getString("castSessionId");
          if (!zzacB.equals(localObject3)) {
            continue;
          }
          localObject1 = ((JSONObject)localObject1).getJSONObject("playerTokenMap");
          localObject3 = ((JSONObject)localObject1).keys();
          if (((Iterator)localObject3).hasNext())
          {
            String str = (String)((Iterator)localObject3).next();
            zzacz.put(str, ((JSONObject)localObject1).getString(str));
            continue;
          }
        }
        catch (JSONException localJSONException)
        {
          zzaaf.zzf("Error while loading data: %s", new Object[] { localJSONException.getMessage() });
        }
        zzacK = 0L;
      }
      finally {}
    }
  }
  
  /* Error */
  public void dispose()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 71	com/google/android/gms/internal/zzli:zzacF	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: aconst_null
    //   16: putfield 161	com/google/android/gms/internal/zzli:zzacG	Lcom/google/android/gms/cast/games/GameManagerState;
    //   19: aload_0
    //   20: aconst_null
    //   21: putfield 152	com/google/android/gms/internal/zzli:zzacH	Lcom/google/android/gms/cast/games/GameManagerState;
    //   24: aload_0
    //   25: aconst_null
    //   26: putfield 303	com/google/android/gms/internal/zzli:zzacI	Ljava/lang/String;
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 308	com/google/android/gms/internal/zzli:zzacJ	Lorg/json/JSONObject;
    //   34: aload_0
    //   35: iconst_1
    //   36: putfield 71	com/google/android/gms/internal/zzli:zzacF	Z
    //   39: aload_0
    //   40: getfield 111	com/google/android/gms/internal/zzli:zzacC	Lcom/google/android/gms/cast/Cast$CastApi;
    //   43: aload_0
    //   44: getfield 113	com/google/android/gms/internal/zzli:zzacD	Lcom/google/android/gms/common/api/GoogleApiClient;
    //   47: aload_0
    //   48: invokevirtual 337	com/google/android/gms/internal/zzli:getNamespace	()Ljava/lang/String;
    //   51: invokeinterface 470 3 0
    //   56: goto -45 -> 11
    //   59: astore_2
    //   60: getstatic 56	com/google/android/gms/internal/zzli:zzaaf	Lcom/google/android/gms/cast/internal/zzl;
    //   63: ldc_w 472
    //   66: iconst_1
    //   67: anewarray 132	java/lang/Object
    //   70: dup
    //   71: iconst_0
    //   72: aload_2
    //   73: aastore
    //   74: invokevirtual 206	com/google/android/gms/cast/internal/zzl:zzf	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: goto -66 -> 11
    //   80: astore_2
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_2
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	zzli
    //   6	2	1	bool	boolean
    //   59	14	2	localIOException	java.io.IOException
    //   80	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   39	56	59	java/io/IOException
    //   2	7	80	finally
    //   14	39	80	finally
    //   39	56	80	finally
    //   60	77	80	finally
  }
  
  public GameManagerState getCurrentState()
  {
    try
    {
      zznR();
      GameManagerState localGameManagerState = zzacG;
      return localGameManagerState;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String getLastUsedPlayerId()
  {
    try
    {
      zznR();
      String str = zzacM;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isDisposed()
  {
    try
    {
      boolean bool = zzacF;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean isInitialized()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 165	com/google/android/gms/internal/zzli:zzacE	Lcom/google/android/gms/internal/zzlj;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	zzli
    //   12	7	1	bool	boolean
    //   6	2	2	localzzlj	zzlj
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  /* Error */
  public void sendGameMessage(String paramString, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 476	com/google/android/gms/internal/zzli:zznR	()V
    //   6: lconst_1
    //   7: aload_0
    //   8: getfield 73	com/google/android/gms/internal/zzli:zzacK	J
    //   11: ladd
    //   12: lstore_3
    //   13: aload_0
    //   14: lload_3
    //   15: putfield 73	com/google/android/gms/internal/zzli:zzacK	J
    //   18: aload_0
    //   19: lload_3
    //   20: aload_1
    //   21: bipush 7
    //   23: aload_2
    //   24: invokespecial 310	com/google/android/gms/internal/zzli:zza	(JLjava/lang/String;ILorg/json/JSONObject;)Lorg/json/JSONObject;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnonnull +6 -> 35
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: aload_0
    //   36: getfield 111	com/google/android/gms/internal/zzli:zzacC	Lcom/google/android/gms/cast/Cast$CastApi;
    //   39: aload_0
    //   40: getfield 113	com/google/android/gms/internal/zzli:zzacD	Lcom/google/android/gms/common/api/GoogleApiClient;
    //   43: aload_0
    //   44: invokevirtual 337	com/google/android/gms/internal/zzli:getNamespace	()Ljava/lang/String;
    //   47: aload_1
    //   48: invokevirtual 340	org/json/JSONObject:toString	()Ljava/lang/String;
    //   51: invokeinterface 346 4 0
    //   56: pop
    //   57: goto -25 -> 32
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	zzli
    //   0	65	1	paramString	String
    //   0	65	2	paramJSONObject	JSONObject
    //   12	8	3	l	long
    // Exception table:
    //   from	to	target	type
    //   2	28	60	finally
    //   35	57	60	finally
  }
  
  public PendingResult sendGameRequest(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      zznR();
      paramString = zzacD.zzb(new zzli.3(this, paramString, paramJSONObject));
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void setListener(GameManagerClient.Listener paramListener)
  {
    try
    {
      zzacL = paramListener;
      return;
    }
    finally
    {
      paramListener = finally;
      throw paramListener;
    }
  }
  
  public PendingResult zza(GameManagerClient paramGameManagerClient)
  {
    if (paramGameManagerClient == null) {
      try
      {
        throw new IllegalArgumentException("gameManagerClient can't be null.");
      }
      finally {}
    }
    paramGameManagerClient = zzacD.zzb(new zzli.1(this, paramGameManagerClient));
    return paramGameManagerClient;
  }
  
  public PendingResult zza(String paramString, int paramInt, JSONObject paramJSONObject)
  {
    try
    {
      zznR();
      paramString = zzacD.zzb(new zzli.2(this, paramInt, paramString, paramJSONObject));
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void zzb(long paramLong, int paramInt)
  {
    zzb(paramLong, paramInt, null);
  }
  
  public String zzce(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      try
      {
        paramString = (String)zzacz.get(paramString);
      }
      finally {}
    }
  }
  
  public final void zzcf(String paramString)
  {
    zzaaf.zzb("message received: %s", new Object[] { paramString });
    do
    {
      try
      {
        zzlk localzzlk = zzlk.zzi(new JSONObject(paramString));
        if (localzzlk == null)
        {
          zzaaf.zzf("Could not parse game manager message from string: %s", new Object[] { paramString });
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        zzaaf.zzf("Message is malformed (%s); ignoring: %s", new Object[] { localJSONException.getMessage(), paramString });
        return;
      }
    } while (((!isInitialized()) && (localJSONException.zzod() == null)) || (isDisposed()));
    int i;
    if (localJSONException.zznY() == 1)
    {
      i = 1;
      label114:
      if ((i != 0) && (!TextUtils.isEmpty(localJSONException.zzoc())))
      {
        zzacz.put(localJSONException.getPlayerId(), localJSONException.zzoc());
        zznT();
      }
      if (localJSONException.getStatusCode() != 0) {
        break label214;
      }
      zza(localJSONException);
    }
    for (;;)
    {
      int j = zzbg(localJSONException.getStatusCode());
      if (i != 0) {
        zzb(localJSONException.getRequestId(), j, localJSONException);
      }
      if ((!isInitialized()) || (j != 0)) {
        break;
      }
      zznS();
      return;
      i = 0;
      break label114;
      label214:
      zzaaf.zzf("Not updating from game message because the message contains error code: %d", new Object[] { Integer.valueOf(localJSONException.getStatusCode()) });
    }
  }
  
  protected boolean zzz(long paramLong)
  {
    ??? = zzacA.iterator();
    while (((Iterator)???).hasNext()) {
      if (((zzp)((Iterator)???).next()).zzd(paramLong, 15)) {
        ((Iterator)???).remove();
      }
    }
    for (;;)
    {
      synchronized (zzp.zzaeB)
      {
        Iterator localIterator = zzacA.iterator();
        if (localIterator.hasNext())
        {
          if (!((zzp)localIterator.next()).zzoA()) {
            continue;
          }
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzli
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */