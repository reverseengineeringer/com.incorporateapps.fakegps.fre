package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;

public final class GameRequestCluster
  implements SafeParcelable, GameRequest
{
  public static final GameRequestClusterCreator CREATOR = new GameRequestClusterCreator();
  private final int mVersionCode;
  private final ArrayList zzaIW;
  
  GameRequestCluster(int paramInt, ArrayList paramArrayList)
  {
    mVersionCode = paramInt;
    zzaIW = paramArrayList;
    zzxr();
  }
  
  private void zzxr()
  {
    GameRequest localGameRequest1;
    int i;
    label39:
    GameRequest localGameRequest2;
    if (!zzaIW.isEmpty())
    {
      bool = true;
      zzb.zzab(bool);
      localGameRequest1 = (GameRequest)zzaIW.get(0);
      int j = zzaIW.size();
      i = 1;
      if (i >= j) {
        return;
      }
      localGameRequest2 = (GameRequest)zzaIW.get(i);
      if (localGameRequest1.getType() != localGameRequest2.getType()) {
        break label116;
      }
    }
    label116:
    for (boolean bool = true;; bool = false)
    {
      zzb.zza(bool, "All the requests must be of the same type");
      zzb.zza(localGameRequest1.getSender().equals(localGameRequest2.getSender()), "All the requests must be from the same sender");
      i += 1;
      break label39;
      bool = false;
      break;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof GameRequestCluster)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (GameRequestCluster)paramObject;
    if (zzaIW.size() != zzaIW.size()) {
      return false;
    }
    int j = zzaIW.size();
    int i = 0;
    while (i < j)
    {
      if (!((GameRequest)zzaIW.get(i)).equals((GameRequest)zzaIW.get(i))) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  public final GameRequest freeze()
  {
    return this;
  }
  
  public final long getCreationTimestamp()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final byte[] getData()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final long getExpirationTimestamp()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final Game getGame()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final int getRecipientStatus(String paramString)
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final String getRequestId()
  {
    return ((GameRequestEntity)zzaIW.get(0)).getRequestId();
  }
  
  public final Player getSender()
  {
    return ((GameRequestEntity)zzaIW.get(0)).getSender();
  }
  
  public final int getStatus()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final int getType()
  {
    return ((GameRequestEntity)zzaIW.get(0)).getType();
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(zzaIW.toArray());
  }
  
  public final boolean isConsumed(String paramString)
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GameRequestClusterCreator.zza(this, paramParcel, paramInt);
  }
  
  public final ArrayList zzxF()
  {
    return new ArrayList(zzaIW);
  }
  
  public final ArrayList zzxG()
  {
    throw new UnsupportedOperationException("Method not supported on a cluster");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.request.GameRequestCluster
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */