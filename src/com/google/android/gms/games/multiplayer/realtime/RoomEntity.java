package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.zzms;
import java.util.ArrayList;

public final class RoomEntity
  extends GamesDowngradeableSafeParcel
  implements Room
{
  public static final Parcelable.Creator CREATOR = new RoomEntity.RoomEntityCreatorCompat();
  private final int mVersionCode;
  private final String zzaEw;
  private final long zzaJF;
  private final ArrayList zzaJI;
  private final int zzaJJ;
  private final Bundle zzaJZ;
  private final String zzaKb;
  private final int zzaKc;
  private final int zzaKd;
  private final String zzaxl;
  
  RoomEntity(int paramInt1, String paramString1, String paramString2, long paramLong, int paramInt2, String paramString3, int paramInt3, Bundle paramBundle, ArrayList paramArrayList, int paramInt4)
  {
    mVersionCode = paramInt1;
    zzaEw = paramString1;
    zzaKb = paramString2;
    zzaJF = paramLong;
    zzaKc = paramInt2;
    zzaxl = paramString3;
    zzaJJ = paramInt3;
    zzaJZ = paramBundle;
    zzaJI = paramArrayList;
    zzaKd = paramInt4;
  }
  
  public RoomEntity(Room paramRoom)
  {
    mVersionCode = 2;
    zzaEw = paramRoom.getRoomId();
    zzaKb = paramRoom.getCreatorId();
    zzaJF = paramRoom.getCreationTimestamp();
    zzaKc = paramRoom.getStatus();
    zzaxl = paramRoom.getDescription();
    zzaJJ = paramRoom.getVariant();
    zzaJZ = paramRoom.getAutoMatchCriteria();
    ArrayList localArrayList = paramRoom.getParticipants();
    int j = localArrayList.size();
    zzaJI = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      zzaJI.add((ParticipantEntity)((Participant)localArrayList.get(i)).freeze());
      i += 1;
    }
    zzaKd = paramRoom.getAutoMatchWaitEstimateSeconds();
  }
  
  static int zza(Room paramRoom)
  {
    return zzw.hashCode(new Object[] { paramRoom.getRoomId(), paramRoom.getCreatorId(), Long.valueOf(paramRoom.getCreationTimestamp()), Integer.valueOf(paramRoom.getStatus()), paramRoom.getDescription(), Integer.valueOf(paramRoom.getVariant()), paramRoom.getAutoMatchCriteria(), paramRoom.getParticipants(), Integer.valueOf(paramRoom.getAutoMatchWaitEstimateSeconds()) });
  }
  
  static int zza(Room paramRoom, String paramString)
  {
    ArrayList localArrayList = paramRoom.getParticipants();
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      Participant localParticipant = (Participant)localArrayList.get(i);
      if (localParticipant.getParticipantId().equals(paramString)) {
        return localParticipant.getStatus();
      }
      i += 1;
    }
    throw new IllegalStateException("Participant " + paramString + " is not in room " + paramRoom.getRoomId());
  }
  
  static boolean zza(Room paramRoom, Object paramObject)
  {
    if (!(paramObject instanceof Room)) {}
    do
    {
      return false;
      if (paramRoom == paramObject) {
        return true;
      }
      paramObject = (Room)paramObject;
    } while ((!zzw.equal(((Room)paramObject).getRoomId(), paramRoom.getRoomId())) || (!zzw.equal(((Room)paramObject).getCreatorId(), paramRoom.getCreatorId())) || (!zzw.equal(Long.valueOf(((Room)paramObject).getCreationTimestamp()), Long.valueOf(paramRoom.getCreationTimestamp()))) || (!zzw.equal(Integer.valueOf(((Room)paramObject).getStatus()), Integer.valueOf(paramRoom.getStatus()))) || (!zzw.equal(((Room)paramObject).getDescription(), paramRoom.getDescription())) || (!zzw.equal(Integer.valueOf(((Room)paramObject).getVariant()), Integer.valueOf(paramRoom.getVariant()))) || (!zzw.equal(((Room)paramObject).getAutoMatchCriteria(), paramRoom.getAutoMatchCriteria())) || (!zzw.equal(((Room)paramObject).getParticipants(), paramRoom.getParticipants())) || (!zzw.equal(Integer.valueOf(((Room)paramObject).getAutoMatchWaitEstimateSeconds()), Integer.valueOf(paramRoom.getAutoMatchWaitEstimateSeconds()))));
    return true;
  }
  
  static String zzb(Room paramRoom)
  {
    return zzw.zzy(paramRoom).zzg("RoomId", paramRoom.getRoomId()).zzg("CreatorId", paramRoom.getCreatorId()).zzg("CreationTimestamp", Long.valueOf(paramRoom.getCreationTimestamp())).zzg("RoomStatus", Integer.valueOf(paramRoom.getStatus())).zzg("Description", paramRoom.getDescription()).zzg("Variant", Integer.valueOf(paramRoom.getVariant())).zzg("AutoMatchCriteria", paramRoom.getAutoMatchCriteria()).zzg("Participants", paramRoom.getParticipants()).zzg("AutoMatchWaitEstimateSeconds", Integer.valueOf(paramRoom.getAutoMatchWaitEstimateSeconds())).toString();
  }
  
  static String zzb(Room paramRoom, String paramString)
  {
    paramRoom = paramRoom.getParticipants();
    int j = paramRoom.size();
    int i = 0;
    while (i < j)
    {
      Participant localParticipant = (Participant)paramRoom.get(i);
      Player localPlayer = localParticipant.getPlayer();
      if ((localPlayer != null) && (localPlayer.getPlayerId().equals(paramString))) {
        return localParticipant.getParticipantId();
      }
      i += 1;
    }
    return null;
  }
  
  static Participant zzc(Room paramRoom, String paramString)
  {
    ArrayList localArrayList = paramRoom.getParticipants();
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      Participant localParticipant = (Participant)localArrayList.get(i);
      if (localParticipant.getParticipantId().equals(paramString)) {
        return localParticipant;
      }
      i += 1;
    }
    throw new IllegalStateException("Participant " + paramString + " is not in match " + paramRoom.getRoomId());
  }
  
  static ArrayList zzc(Room paramRoom)
  {
    paramRoom = paramRoom.getParticipants();
    int j = paramRoom.size();
    ArrayList localArrayList = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      localArrayList.add(((Participant)paramRoom.get(i)).getParticipantId());
      i += 1;
    }
    return localArrayList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Room freeze()
  {
    return this;
  }
  
  public final Bundle getAutoMatchCriteria()
  {
    return zzaJZ;
  }
  
  public final int getAutoMatchWaitEstimateSeconds()
  {
    return zzaKd;
  }
  
  public final long getCreationTimestamp()
  {
    return zzaJF;
  }
  
  public final String getCreatorId()
  {
    return zzaKb;
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaxl, paramCharArrayBuffer);
  }
  
  public final Participant getParticipant(String paramString)
  {
    return zzc(this, paramString);
  }
  
  public final String getParticipantId(String paramString)
  {
    return zzb(this, paramString);
  }
  
  public final ArrayList getParticipantIds()
  {
    return zzc(this);
  }
  
  public final int getParticipantStatus(String paramString)
  {
    return zza(this, paramString);
  }
  
  public final ArrayList getParticipants()
  {
    return new ArrayList(zzaJI);
  }
  
  public final String getRoomId()
  {
    return zzaEw;
  }
  
  public final int getStatus()
  {
    return zzaKc;
  }
  
  public final int getVariant()
  {
    return zzaJJ;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!zzqC()) {
      RoomEntityCreator.zza(this, paramParcel, paramInt);
    }
    for (;;)
    {
      return;
      paramParcel.writeString(zzaEw);
      paramParcel.writeString(zzaKb);
      paramParcel.writeLong(zzaJF);
      paramParcel.writeInt(zzaKc);
      paramParcel.writeString(zzaxl);
      paramParcel.writeInt(zzaJJ);
      paramParcel.writeBundle(zzaJZ);
      int j = zzaJI.size();
      paramParcel.writeInt(j);
      int i = 0;
      while (i < j)
      {
        ((ParticipantEntity)zzaJI.get(i)).writeToParcel(paramParcel, paramInt);
        i += 1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */