package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

public final class TurnBasedMatchRef
  extends zzc
  implements TurnBasedMatch
{
  private final int zzaDQ;
  private final Game zzaJc;
  
  TurnBasedMatchRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    zzaJc = new GameRef(paramDataHolder, paramInt1);
    zzaDQ = paramInt2;
  }
  
  public final boolean canRematch()
  {
    return (getTurnStatus() == 3) && (getRematchId() == null) && (getParticipants().size() > 1);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return TurnBasedMatchEntity.zza(this, paramObject);
  }
  
  public final TurnBasedMatch freeze()
  {
    return new TurnBasedMatchEntity(this);
  }
  
  public final Bundle getAutoMatchCriteria()
  {
    if (!getBoolean("has_automatch_criteria")) {
      return null;
    }
    return TurnBasedMatchConfig.createAutoMatchCriteria(getInteger("automatch_min_players"), getInteger("automatch_max_players"), getLong("automatch_bit_mask"));
  }
  
  public final int getAvailableAutoMatchSlots()
  {
    if (!getBoolean("has_automatch_criteria")) {
      return 0;
    }
    return getInteger("automatch_max_players");
  }
  
  public final long getCreationTimestamp()
  {
    return getLong("creation_timestamp");
  }
  
  public final String getCreatorId()
  {
    return getString("creator_external");
  }
  
  public final byte[] getData()
  {
    return getByteArray("data");
  }
  
  public final String getDescription()
  {
    return getString("description");
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("description", paramCharArrayBuffer);
  }
  
  public final Participant getDescriptionParticipant()
  {
    String str = getDescriptionParticipantId();
    if (str == null) {
      return null;
    }
    return getParticipant(str);
  }
  
  public final String getDescriptionParticipantId()
  {
    return getString("description_participant_id");
  }
  
  public final Game getGame()
  {
    return zzaJc;
  }
  
  public final long getLastUpdatedTimestamp()
  {
    return getLong("last_updated_timestamp");
  }
  
  public final String getLastUpdaterId()
  {
    return getString("last_updater_external");
  }
  
  public final String getMatchId()
  {
    return getString("external_match_id");
  }
  
  public final int getMatchNumber()
  {
    return getInteger("match_number");
  }
  
  public final Participant getParticipant(String paramString)
  {
    return TurnBasedMatchEntity.zzc(this, paramString);
  }
  
  public final String getParticipantId(String paramString)
  {
    return TurnBasedMatchEntity.zzb(this, paramString);
  }
  
  public final ArrayList getParticipantIds()
  {
    return TurnBasedMatchEntity.zzc(this);
  }
  
  public final int getParticipantStatus(String paramString)
  {
    return TurnBasedMatchEntity.zza(this, paramString);
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
  
  public final String getPendingParticipantId()
  {
    return getString("pending_participant_external");
  }
  
  public final byte[] getPreviousMatchData()
  {
    return getByteArray("previous_match_data");
  }
  
  public final String getRematchId()
  {
    return getString("rematch_id");
  }
  
  public final int getStatus()
  {
    return getInteger("status");
  }
  
  public final int getTurnStatus()
  {
    return getInteger("user_match_status");
  }
  
  public final int getVariant()
  {
    return getInteger("variant");
  }
  
  public final int getVersion()
  {
    return getInteger("version");
  }
  
  public final int hashCode()
  {
    return TurnBasedMatchEntity.zza(this);
  }
  
  public final boolean isLocallyModified()
  {
    return getBoolean("upsync_required");
  }
  
  public final String toString()
  {
    return TurnBasedMatchEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((TurnBasedMatchEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */