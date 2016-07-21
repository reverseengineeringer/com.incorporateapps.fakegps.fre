package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;

public final class InvitationEntity
  extends GamesDowngradeableSafeParcel
  implements Invitation
{
  public static final Parcelable.Creator CREATOR = new InvitationEntity.InvitationEntityCreatorCompat();
  private final int mVersionCode;
  private final String zzUO;
  private final GameEntity zzaJE;
  private final long zzaJF;
  private final int zzaJG;
  private final ParticipantEntity zzaJH;
  private final ArrayList zzaJI;
  private final int zzaJJ;
  private final int zzaJK;
  
  InvitationEntity(int paramInt1, GameEntity paramGameEntity, String paramString, long paramLong, int paramInt2, ParticipantEntity paramParticipantEntity, ArrayList paramArrayList, int paramInt3, int paramInt4)
  {
    mVersionCode = paramInt1;
    zzaJE = paramGameEntity;
    zzUO = paramString;
    zzaJF = paramLong;
    zzaJG = paramInt2;
    zzaJH = paramParticipantEntity;
    zzaJI = paramArrayList;
    zzaJJ = paramInt3;
    zzaJK = paramInt4;
  }
  
  InvitationEntity(Invitation paramInvitation)
  {
    mVersionCode = 2;
    zzaJE = new GameEntity(paramInvitation.getGame());
    zzUO = paramInvitation.getInvitationId();
    zzaJF = paramInvitation.getCreationTimestamp();
    zzaJG = paramInvitation.getInvitationType();
    zzaJJ = paramInvitation.getVariant();
    zzaJK = paramInvitation.getAvailableAutoMatchSlots();
    String str = paramInvitation.getInviter().getParticipantId();
    Participant localParticipant = null;
    ArrayList localArrayList = paramInvitation.getParticipants();
    int j = localArrayList.size();
    zzaJI = new ArrayList(j);
    int i = 0;
    paramInvitation = localParticipant;
    while (i < j)
    {
      localParticipant = (Participant)localArrayList.get(i);
      if (localParticipant.getParticipantId().equals(str)) {
        paramInvitation = localParticipant;
      }
      zzaJI.add((ParticipantEntity)localParticipant.freeze());
      i += 1;
    }
    zzx.zzb(paramInvitation, "Must have a valid inviter!");
    zzaJH = ((ParticipantEntity)paramInvitation.freeze());
  }
  
  static int zza(Invitation paramInvitation)
  {
    return zzw.hashCode(new Object[] { paramInvitation.getGame(), paramInvitation.getInvitationId(), Long.valueOf(paramInvitation.getCreationTimestamp()), Integer.valueOf(paramInvitation.getInvitationType()), paramInvitation.getInviter(), paramInvitation.getParticipants(), Integer.valueOf(paramInvitation.getVariant()), Integer.valueOf(paramInvitation.getAvailableAutoMatchSlots()) });
  }
  
  static boolean zza(Invitation paramInvitation, Object paramObject)
  {
    if (!(paramObject instanceof Invitation)) {}
    do
    {
      return false;
      if (paramInvitation == paramObject) {
        return true;
      }
      paramObject = (Invitation)paramObject;
    } while ((!zzw.equal(((Invitation)paramObject).getGame(), paramInvitation.getGame())) || (!zzw.equal(((Invitation)paramObject).getInvitationId(), paramInvitation.getInvitationId())) || (!zzw.equal(Long.valueOf(((Invitation)paramObject).getCreationTimestamp()), Long.valueOf(paramInvitation.getCreationTimestamp()))) || (!zzw.equal(Integer.valueOf(((Invitation)paramObject).getInvitationType()), Integer.valueOf(paramInvitation.getInvitationType()))) || (!zzw.equal(((Invitation)paramObject).getInviter(), paramInvitation.getInviter())) || (!zzw.equal(((Invitation)paramObject).getParticipants(), paramInvitation.getParticipants())) || (!zzw.equal(Integer.valueOf(((Invitation)paramObject).getVariant()), Integer.valueOf(paramInvitation.getVariant()))) || (!zzw.equal(Integer.valueOf(((Invitation)paramObject).getAvailableAutoMatchSlots()), Integer.valueOf(paramInvitation.getAvailableAutoMatchSlots()))));
    return true;
  }
  
  static String zzb(Invitation paramInvitation)
  {
    return zzw.zzy(paramInvitation).zzg("Game", paramInvitation.getGame()).zzg("InvitationId", paramInvitation.getInvitationId()).zzg("CreationTimestamp", Long.valueOf(paramInvitation.getCreationTimestamp())).zzg("InvitationType", Integer.valueOf(paramInvitation.getInvitationType())).zzg("Inviter", paramInvitation.getInviter()).zzg("Participants", paramInvitation.getParticipants()).zzg("Variant", Integer.valueOf(paramInvitation.getVariant())).zzg("AvailableAutoMatchSlots", Integer.valueOf(paramInvitation.getAvailableAutoMatchSlots())).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Invitation freeze()
  {
    return this;
  }
  
  public final int getAvailableAutoMatchSlots()
  {
    return zzaJK;
  }
  
  public final long getCreationTimestamp()
  {
    return zzaJF;
  }
  
  public final Game getGame()
  {
    return zzaJE;
  }
  
  public final String getInvitationId()
  {
    return zzUO;
  }
  
  public final int getInvitationType()
  {
    return zzaJG;
  }
  
  public final Participant getInviter()
  {
    return zzaJH;
  }
  
  public final ArrayList getParticipants()
  {
    return new ArrayList(zzaJI);
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
      InvitationEntityCreator.zza(this, paramParcel, paramInt);
    }
    for (;;)
    {
      return;
      zzaJE.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(zzUO);
      paramParcel.writeLong(zzaJF);
      paramParcel.writeInt(zzaJG);
      zzaJH.writeToParcel(paramParcel, paramInt);
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
 * Qualified Name:     com.google.android.gms.games.multiplayer.InvitationEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */