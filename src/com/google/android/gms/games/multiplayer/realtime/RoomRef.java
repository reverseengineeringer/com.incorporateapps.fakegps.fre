package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

public final class RoomRef
  extends zzc
  implements Room
{
  private final int zzaDQ;
  
  RoomRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    zzaDQ = paramInt2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return RoomEntity.zza(this, paramObject);
  }
  
  public final Room freeze()
  {
    return new RoomEntity(this);
  }
  
  public final Bundle getAutoMatchCriteria()
  {
    if (!getBoolean("has_automatch_criteria")) {
      return null;
    }
    return RoomConfig.createAutoMatchCriteria(getInteger("automatch_min_players"), getInteger("automatch_max_players"), getLong("automatch_bit_mask"));
  }
  
  public final int getAutoMatchWaitEstimateSeconds()
  {
    return getInteger("automatch_wait_estimate_sec");
  }
  
  public final long getCreationTimestamp()
  {
    return getLong("creation_timestamp");
  }
  
  public final String getCreatorId()
  {
    return getString("creator_external");
  }
  
  public final String getDescription()
  {
    return getString("description");
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("description", paramCharArrayBuffer);
  }
  
  public final Participant getParticipant(String paramString)
  {
    return RoomEntity.zzc(this, paramString);
  }
  
  public final String getParticipantId(String paramString)
  {
    return RoomEntity.zzb(this, paramString);
  }
  
  public final ArrayList getParticipantIds()
  {
    return RoomEntity.zzc(this);
  }
  
  public final int getParticipantStatus(String paramString)
  {
    return RoomEntity.zza(this, paramString);
  }
  
  public final ArrayList getParticipants()
  {
    ArrayList localArrayList = new ArrayList(zzaDQ);
    int i = 0;
    while (i < zzaDQ)
    {
      localArrayList.add(new ParticipantRef(zzahi, zzaje + i));
      i += 1;
    }
    return localArrayList;
  }
  
  public final String getRoomId()
  {
    return getString("external_match_id");
  }
  
  public final int getStatus()
  {
    return getInteger("status");
  }
  
  public final int getVariant()
  {
    return getInteger("variant");
  }
  
  public final int hashCode()
  {
    return RoomEntity.zza(this);
  }
  
  public final String toString()
  {
    return RoomEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((RoomEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */