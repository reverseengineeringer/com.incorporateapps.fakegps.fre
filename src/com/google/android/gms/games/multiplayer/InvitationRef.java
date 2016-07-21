package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public final class InvitationRef
  extends zzc
  implements Invitation
{
  private final ArrayList zzaJI;
  private final ParticipantRef zzaJL;
  private final Game zzaJc;
  
  InvitationRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    zzaJc = new GameRef(paramDataHolder, paramInt1);
    zzaJI = new ArrayList(paramInt2);
    String str = getString("external_inviter_id");
    paramInt1 = 0;
    paramDataHolder = null;
    while (paramInt1 < paramInt2)
    {
      ParticipantRef localParticipantRef = new ParticipantRef(zzahi, zzaje + paramInt1);
      if (localParticipantRef.getParticipantId().equals(str)) {
        paramDataHolder = localParticipantRef;
      }
      zzaJI.add(localParticipantRef);
      paramInt1 += 1;
    }
    zzaJL = ((ParticipantRef)zzx.zzb(paramDataHolder, "Must have a valid inviter!"));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return InvitationEntity.zza(this, paramObject);
  }
  
  public final Invitation freeze()
  {
    return new InvitationEntity(this);
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
    return Math.max(getLong("creation_timestamp"), getLong("last_modified_timestamp"));
  }
  
  public final Game getGame()
  {
    return zzaJc;
  }
  
  public final String getInvitationId()
  {
    return getString("external_invitation_id");
  }
  
  public final int getInvitationType()
  {
    return getInteger("type");
  }
  
  public final Participant getInviter()
  {
    return zzaJL;
  }
  
  public final ArrayList getParticipants()
  {
    return zzaJI;
  }
  
  public final int getVariant()
  {
    return getInteger("variant");
  }
  
  public final int hashCode()
  {
    return InvitationEntity.zza(this);
  }
  
  public final String toString()
  {
    return InvitationEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((InvitationEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.InvitationRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */