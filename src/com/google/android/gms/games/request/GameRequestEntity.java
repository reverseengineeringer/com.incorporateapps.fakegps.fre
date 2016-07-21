package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameRequestEntity
  implements SafeParcelable, GameRequest
{
  public static final Parcelable.Creator CREATOR = new GameRequestEntityCreator();
  private final int mVersionCode;
  private final int zzBc;
  private final String zzEY;
  private final GameEntity zzaJE;
  private final long zzaJF;
  private final PlayerEntity zzaKG;
  private final ArrayList zzaKH;
  private final long zzaKI;
  private final Bundle zzaKJ;
  private final byte[] zzaKm;
  private final int zzabB;
  
  GameRequestEntity(int paramInt1, GameEntity paramGameEntity, PlayerEntity paramPlayerEntity, byte[] paramArrayOfByte, String paramString, ArrayList paramArrayList, int paramInt2, long paramLong1, long paramLong2, Bundle paramBundle, int paramInt3)
  {
    mVersionCode = paramInt1;
    zzaJE = paramGameEntity;
    zzaKG = paramPlayerEntity;
    zzaKm = paramArrayOfByte;
    zzEY = paramString;
    zzaKH = paramArrayList;
    zzabB = paramInt2;
    zzaJF = paramLong1;
    zzaKI = paramLong2;
    zzaKJ = paramBundle;
    zzBc = paramInt3;
  }
  
  public GameRequestEntity(GameRequest paramGameRequest)
  {
    mVersionCode = 2;
    zzaJE = new GameEntity(paramGameRequest.getGame());
    zzaKG = new PlayerEntity(paramGameRequest.getSender());
    zzEY = paramGameRequest.getRequestId();
    zzabB = paramGameRequest.getType();
    zzaJF = paramGameRequest.getCreationTimestamp();
    zzaKI = paramGameRequest.getExpirationTimestamp();
    zzBc = paramGameRequest.getStatus();
    Object localObject = paramGameRequest.getData();
    if (localObject == null) {
      zzaKm = null;
    }
    for (;;)
    {
      localObject = paramGameRequest.getRecipients();
      int j = ((List)localObject).size();
      zzaKH = new ArrayList(j);
      zzaKJ = new Bundle();
      int i = 0;
      while (i < j)
      {
        Player localPlayer = (Player)((Player)((List)localObject).get(i)).freeze();
        String str = localPlayer.getPlayerId();
        zzaKH.add((PlayerEntity)localPlayer);
        zzaKJ.putInt(str, paramGameRequest.getRecipientStatus(str));
        i += 1;
      }
      zzaKm = new byte[localObject.length];
      System.arraycopy(localObject, 0, zzaKm, 0, localObject.length);
    }
  }
  
  static int zza(GameRequest paramGameRequest)
  {
    return zzw.hashCode(new Object[] { paramGameRequest.getGame(), paramGameRequest.getRecipients(), paramGameRequest.getRequestId(), paramGameRequest.getSender(), zzb(paramGameRequest), Integer.valueOf(paramGameRequest.getType()), Long.valueOf(paramGameRequest.getCreationTimestamp()), Long.valueOf(paramGameRequest.getExpirationTimestamp()) });
  }
  
  static boolean zza(GameRequest paramGameRequest, Object paramObject)
  {
    if (!(paramObject instanceof GameRequest)) {}
    do
    {
      return false;
      if (paramGameRequest == paramObject) {
        return true;
      }
      paramObject = (GameRequest)paramObject;
    } while ((!zzw.equal(((GameRequest)paramObject).getGame(), paramGameRequest.getGame())) || (!zzw.equal(((GameRequest)paramObject).getRecipients(), paramGameRequest.getRecipients())) || (!zzw.equal(((GameRequest)paramObject).getRequestId(), paramGameRequest.getRequestId())) || (!zzw.equal(((GameRequest)paramObject).getSender(), paramGameRequest.getSender())) || (!Arrays.equals(zzb((GameRequest)paramObject), zzb(paramGameRequest))) || (!zzw.equal(Integer.valueOf(((GameRequest)paramObject).getType()), Integer.valueOf(paramGameRequest.getType()))) || (!zzw.equal(Long.valueOf(((GameRequest)paramObject).getCreationTimestamp()), Long.valueOf(paramGameRequest.getCreationTimestamp()))) || (!zzw.equal(Long.valueOf(((GameRequest)paramObject).getExpirationTimestamp()), Long.valueOf(paramGameRequest.getExpirationTimestamp()))));
    return true;
  }
  
  private static int[] zzb(GameRequest paramGameRequest)
  {
    List localList = paramGameRequest.getRecipients();
    int j = localList.size();
    int[] arrayOfInt = new int[j];
    int i = 0;
    while (i < j)
    {
      arrayOfInt[i] = paramGameRequest.getRecipientStatus(((Player)localList.get(i)).getPlayerId());
      i += 1;
    }
    return arrayOfInt;
  }
  
  static String zzc(GameRequest paramGameRequest)
  {
    return zzw.zzy(paramGameRequest).zzg("Game", paramGameRequest.getGame()).zzg("Sender", paramGameRequest.getSender()).zzg("Recipients", paramGameRequest.getRecipients()).zzg("Data", paramGameRequest.getData()).zzg("RequestId", paramGameRequest.getRequestId()).zzg("Type", Integer.valueOf(paramGameRequest.getType())).zzg("CreationTimestamp", Long.valueOf(paramGameRequest.getCreationTimestamp())).zzg("ExpirationTimestamp", Long.valueOf(paramGameRequest.getExpirationTimestamp())).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final GameRequest freeze()
  {
    return this;
  }
  
  public final long getCreationTimestamp()
  {
    return zzaJF;
  }
  
  public final byte[] getData()
  {
    return zzaKm;
  }
  
  public final long getExpirationTimestamp()
  {
    return zzaKI;
  }
  
  public final Game getGame()
  {
    return zzaJE;
  }
  
  public final int getRecipientStatus(String paramString)
  {
    return zzaKJ.getInt(paramString, 0);
  }
  
  public final List getRecipients()
  {
    return new ArrayList(zzaKH);
  }
  
  public final String getRequestId()
  {
    return zzEY;
  }
  
  public final Player getSender()
  {
    return zzaKG;
  }
  
  public final int getStatus()
  {
    return zzBc;
  }
  
  public final int getType()
  {
    return zzabB;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isConsumed(String paramString)
  {
    return getRecipientStatus(paramString) == 1;
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzc(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GameRequestEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final Bundle zzxT()
  {
    return zzaKJ;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.request.GameRequestEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */