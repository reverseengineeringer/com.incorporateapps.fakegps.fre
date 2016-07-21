package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.zzms;
import java.util.ArrayList;

public final class TurnBasedMatchEntity
  implements SafeParcelable, TurnBasedMatch
{
  public static final Parcelable.Creator CREATOR = new TurnBasedMatchEntityCreator();
  private final int mVersion;
  private final int mVersionCode;
  private final long zzaDt;
  private final String zzaER;
  private final GameEntity zzaJE;
  private final long zzaJF;
  private final ArrayList zzaJI;
  private final int zzaJJ;
  private final Bundle zzaJZ;
  private final String zzaKb;
  private final String zzaKj;
  private final String zzaKk;
  private final int zzaKl;
  private final byte[] zzaKm;
  private final String zzaKn;
  private final byte[] zzaKo;
  private final int zzaKp;
  private final int zzaKq;
  private final boolean zzaKr;
  private final String zzaKs;
  private final String zzaxl;
  
  TurnBasedMatchEntity(int paramInt1, GameEntity paramGameEntity, String paramString1, String paramString2, long paramLong1, String paramString3, long paramLong2, String paramString4, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte1, ArrayList paramArrayList, String paramString5, byte[] paramArrayOfByte2, int paramInt5, Bundle paramBundle, int paramInt6, boolean paramBoolean, String paramString6, String paramString7)
  {
    mVersionCode = paramInt1;
    zzaJE = paramGameEntity;
    zzaER = paramString1;
    zzaKb = paramString2;
    zzaJF = paramLong1;
    zzaKj = paramString3;
    zzaDt = paramLong2;
    zzaKk = paramString4;
    zzaKl = paramInt2;
    zzaKq = paramInt6;
    zzaJJ = paramInt3;
    mVersion = paramInt4;
    zzaKm = paramArrayOfByte1;
    zzaJI = paramArrayList;
    zzaKn = paramString5;
    zzaKo = paramArrayOfByte2;
    zzaKp = paramInt5;
    zzaJZ = paramBundle;
    zzaKr = paramBoolean;
    zzaxl = paramString6;
    zzaKs = paramString7;
  }
  
  public TurnBasedMatchEntity(TurnBasedMatch paramTurnBasedMatch)
  {
    mVersionCode = 2;
    zzaJE = new GameEntity(paramTurnBasedMatch.getGame());
    zzaER = paramTurnBasedMatch.getMatchId();
    zzaKb = paramTurnBasedMatch.getCreatorId();
    zzaJF = paramTurnBasedMatch.getCreationTimestamp();
    zzaKj = paramTurnBasedMatch.getLastUpdaterId();
    zzaDt = paramTurnBasedMatch.getLastUpdatedTimestamp();
    zzaKk = paramTurnBasedMatch.getPendingParticipantId();
    zzaKl = paramTurnBasedMatch.getStatus();
    zzaKq = paramTurnBasedMatch.getTurnStatus();
    zzaJJ = paramTurnBasedMatch.getVariant();
    mVersion = paramTurnBasedMatch.getVersion();
    zzaKn = paramTurnBasedMatch.getRematchId();
    zzaKp = paramTurnBasedMatch.getMatchNumber();
    zzaJZ = paramTurnBasedMatch.getAutoMatchCriteria();
    zzaKr = paramTurnBasedMatch.isLocallyModified();
    zzaxl = paramTurnBasedMatch.getDescription();
    zzaKs = paramTurnBasedMatch.getDescriptionParticipantId();
    byte[] arrayOfByte = paramTurnBasedMatch.getData();
    if (arrayOfByte == null)
    {
      zzaKm = null;
      arrayOfByte = paramTurnBasedMatch.getPreviousMatchData();
      if (arrayOfByte != null) {
        break label310;
      }
      zzaKo = null;
    }
    for (;;)
    {
      paramTurnBasedMatch = paramTurnBasedMatch.getParticipants();
      int j = paramTurnBasedMatch.size();
      zzaJI = new ArrayList(j);
      int i = 0;
      while (i < j)
      {
        zzaJI.add((ParticipantEntity)((Participant)paramTurnBasedMatch.get(i)).freeze());
        i += 1;
      }
      zzaKm = new byte[arrayOfByte.length];
      System.arraycopy(arrayOfByte, 0, zzaKm, 0, arrayOfByte.length);
      break;
      label310:
      zzaKo = new byte[arrayOfByte.length];
      System.arraycopy(arrayOfByte, 0, zzaKo, 0, arrayOfByte.length);
    }
  }
  
  static int zza(TurnBasedMatch paramTurnBasedMatch)
  {
    return zzw.hashCode(new Object[] { paramTurnBasedMatch.getGame(), paramTurnBasedMatch.getMatchId(), paramTurnBasedMatch.getCreatorId(), Long.valueOf(paramTurnBasedMatch.getCreationTimestamp()), paramTurnBasedMatch.getLastUpdaterId(), Long.valueOf(paramTurnBasedMatch.getLastUpdatedTimestamp()), paramTurnBasedMatch.getPendingParticipantId(), Integer.valueOf(paramTurnBasedMatch.getStatus()), Integer.valueOf(paramTurnBasedMatch.getTurnStatus()), paramTurnBasedMatch.getDescription(), Integer.valueOf(paramTurnBasedMatch.getVariant()), Integer.valueOf(paramTurnBasedMatch.getVersion()), paramTurnBasedMatch.getParticipants(), paramTurnBasedMatch.getRematchId(), Integer.valueOf(paramTurnBasedMatch.getMatchNumber()), paramTurnBasedMatch.getAutoMatchCriteria(), Integer.valueOf(paramTurnBasedMatch.getAvailableAutoMatchSlots()), Boolean.valueOf(paramTurnBasedMatch.isLocallyModified()) });
  }
  
  static int zza(TurnBasedMatch paramTurnBasedMatch, String paramString)
  {
    ArrayList localArrayList = paramTurnBasedMatch.getParticipants();
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
    throw new IllegalStateException("Participant " + paramString + " is not in match " + paramTurnBasedMatch.getMatchId());
  }
  
  static boolean zza(TurnBasedMatch paramTurnBasedMatch, Object paramObject)
  {
    if (!(paramObject instanceof TurnBasedMatch)) {}
    do
    {
      return false;
      if (paramTurnBasedMatch == paramObject) {
        return true;
      }
      paramObject = (TurnBasedMatch)paramObject;
    } while ((!zzw.equal(((TurnBasedMatch)paramObject).getGame(), paramTurnBasedMatch.getGame())) || (!zzw.equal(((TurnBasedMatch)paramObject).getMatchId(), paramTurnBasedMatch.getMatchId())) || (!zzw.equal(((TurnBasedMatch)paramObject).getCreatorId(), paramTurnBasedMatch.getCreatorId())) || (!zzw.equal(Long.valueOf(((TurnBasedMatch)paramObject).getCreationTimestamp()), Long.valueOf(paramTurnBasedMatch.getCreationTimestamp()))) || (!zzw.equal(((TurnBasedMatch)paramObject).getLastUpdaterId(), paramTurnBasedMatch.getLastUpdaterId())) || (!zzw.equal(Long.valueOf(((TurnBasedMatch)paramObject).getLastUpdatedTimestamp()), Long.valueOf(paramTurnBasedMatch.getLastUpdatedTimestamp()))) || (!zzw.equal(((TurnBasedMatch)paramObject).getPendingParticipantId(), paramTurnBasedMatch.getPendingParticipantId())) || (!zzw.equal(Integer.valueOf(((TurnBasedMatch)paramObject).getStatus()), Integer.valueOf(paramTurnBasedMatch.getStatus()))) || (!zzw.equal(Integer.valueOf(((TurnBasedMatch)paramObject).getTurnStatus()), Integer.valueOf(paramTurnBasedMatch.getTurnStatus()))) || (!zzw.equal(((TurnBasedMatch)paramObject).getDescription(), paramTurnBasedMatch.getDescription())) || (!zzw.equal(Integer.valueOf(((TurnBasedMatch)paramObject).getVariant()), Integer.valueOf(paramTurnBasedMatch.getVariant()))) || (!zzw.equal(Integer.valueOf(((TurnBasedMatch)paramObject).getVersion()), Integer.valueOf(paramTurnBasedMatch.getVersion()))) || (!zzw.equal(((TurnBasedMatch)paramObject).getParticipants(), paramTurnBasedMatch.getParticipants())) || (!zzw.equal(((TurnBasedMatch)paramObject).getRematchId(), paramTurnBasedMatch.getRematchId())) || (!zzw.equal(Integer.valueOf(((TurnBasedMatch)paramObject).getMatchNumber()), Integer.valueOf(paramTurnBasedMatch.getMatchNumber()))) || (!zzw.equal(((TurnBasedMatch)paramObject).getAutoMatchCriteria(), paramTurnBasedMatch.getAutoMatchCriteria())) || (!zzw.equal(Integer.valueOf(((TurnBasedMatch)paramObject).getAvailableAutoMatchSlots()), Integer.valueOf(paramTurnBasedMatch.getAvailableAutoMatchSlots()))) || (!zzw.equal(Boolean.valueOf(((TurnBasedMatch)paramObject).isLocallyModified()), Boolean.valueOf(paramTurnBasedMatch.isLocallyModified()))));
    return true;
  }
  
  static String zzb(TurnBasedMatch paramTurnBasedMatch)
  {
    return zzw.zzy(paramTurnBasedMatch).zzg("Game", paramTurnBasedMatch.getGame()).zzg("MatchId", paramTurnBasedMatch.getMatchId()).zzg("CreatorId", paramTurnBasedMatch.getCreatorId()).zzg("CreationTimestamp", Long.valueOf(paramTurnBasedMatch.getCreationTimestamp())).zzg("LastUpdaterId", paramTurnBasedMatch.getLastUpdaterId()).zzg("LastUpdatedTimestamp", Long.valueOf(paramTurnBasedMatch.getLastUpdatedTimestamp())).zzg("PendingParticipantId", paramTurnBasedMatch.getPendingParticipantId()).zzg("MatchStatus", Integer.valueOf(paramTurnBasedMatch.getStatus())).zzg("TurnStatus", Integer.valueOf(paramTurnBasedMatch.getTurnStatus())).zzg("Description", paramTurnBasedMatch.getDescription()).zzg("Variant", Integer.valueOf(paramTurnBasedMatch.getVariant())).zzg("Data", paramTurnBasedMatch.getData()).zzg("Version", Integer.valueOf(paramTurnBasedMatch.getVersion())).zzg("Participants", paramTurnBasedMatch.getParticipants()).zzg("RematchId", paramTurnBasedMatch.getRematchId()).zzg("PreviousData", paramTurnBasedMatch.getPreviousMatchData()).zzg("MatchNumber", Integer.valueOf(paramTurnBasedMatch.getMatchNumber())).zzg("AutoMatchCriteria", paramTurnBasedMatch.getAutoMatchCriteria()).zzg("AvailableAutoMatchSlots", Integer.valueOf(paramTurnBasedMatch.getAvailableAutoMatchSlots())).zzg("LocallyModified", Boolean.valueOf(paramTurnBasedMatch.isLocallyModified())).zzg("DescriptionParticipantId", paramTurnBasedMatch.getDescriptionParticipantId()).toString();
  }
  
  static String zzb(TurnBasedMatch paramTurnBasedMatch, String paramString)
  {
    paramTurnBasedMatch = paramTurnBasedMatch.getParticipants();
    int j = paramTurnBasedMatch.size();
    int i = 0;
    while (i < j)
    {
      Participant localParticipant = (Participant)paramTurnBasedMatch.get(i);
      Player localPlayer = localParticipant.getPlayer();
      if ((localPlayer != null) && (localPlayer.getPlayerId().equals(paramString))) {
        return localParticipant.getParticipantId();
      }
      i += 1;
    }
    return null;
  }
  
  static Participant zzc(TurnBasedMatch paramTurnBasedMatch, String paramString)
  {
    ArrayList localArrayList = paramTurnBasedMatch.getParticipants();
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
    throw new IllegalStateException("Participant " + paramString + " is not in match " + paramTurnBasedMatch.getMatchId());
  }
  
  static ArrayList zzc(TurnBasedMatch paramTurnBasedMatch)
  {
    paramTurnBasedMatch = paramTurnBasedMatch.getParticipants();
    int j = paramTurnBasedMatch.size();
    ArrayList localArrayList = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      localArrayList.add(((Participant)paramTurnBasedMatch.get(i)).getParticipantId());
      i += 1;
    }
    return localArrayList;
  }
  
  public final boolean canRematch()
  {
    return (zzaKl == 2) && (zzaKn == null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final TurnBasedMatch freeze()
  {
    return this;
  }
  
  public final Bundle getAutoMatchCriteria()
  {
    return zzaJZ;
  }
  
  public final int getAvailableAutoMatchSlots()
  {
    if (zzaJZ == null) {
      return 0;
    }
    return zzaJZ.getInt("max_automatch_players");
  }
  
  public final long getCreationTimestamp()
  {
    return zzaJF;
  }
  
  public final String getCreatorId()
  {
    return zzaKb;
  }
  
  public final byte[] getData()
  {
    return zzaKm;
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaxl, paramCharArrayBuffer);
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
    return zzaKs;
  }
  
  public final Game getGame()
  {
    return zzaJE;
  }
  
  public final long getLastUpdatedTimestamp()
  {
    return zzaDt;
  }
  
  public final String getLastUpdaterId()
  {
    return zzaKj;
  }
  
  public final String getMatchId()
  {
    return zzaER;
  }
  
  public final int getMatchNumber()
  {
    return zzaKp;
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
  
  public final String getPendingParticipantId()
  {
    return zzaKk;
  }
  
  public final byte[] getPreviousMatchData()
  {
    return zzaKo;
  }
  
  public final String getRematchId()
  {
    return zzaKn;
  }
  
  public final int getStatus()
  {
    return zzaKl;
  }
  
  public final int getTurnStatus()
  {
    return zzaKq;
  }
  
  public final int getVariant()
  {
    return zzaJJ;
  }
  
  public final int getVersion()
  {
    return mVersion;
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
  
  public final boolean isLocallyModified()
  {
    return zzaKr;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    TurnBasedMatchEntityCreator.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */