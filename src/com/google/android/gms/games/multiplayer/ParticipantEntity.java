package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.zzms;

public final class ParticipantEntity
  extends GamesDowngradeableSafeParcel
  implements Participant
{
  public static final Parcelable.Creator CREATOR = new ParticipantEntity.ParticipantEntityCreatorCompat();
  private final int mVersionCode;
  private final int zzBc;
  private final String zzWQ;
  private final Uri zzaCd;
  private final Uri zzaCe;
  private final String zzaCo;
  private final String zzaCp;
  private final String zzaDX;
  private final PlayerEntity zzaDq;
  private final String zzaFa;
  private final boolean zzaJM;
  private final ParticipantResult zzaJN;
  private final int zzaab;
  
  ParticipantEntity(int paramInt1, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, int paramInt2, String paramString3, boolean paramBoolean, PlayerEntity paramPlayerEntity, int paramInt3, ParticipantResult paramParticipantResult, String paramString4, String paramString5)
  {
    mVersionCode = paramInt1;
    zzaFa = paramString1;
    zzWQ = paramString2;
    zzaCd = paramUri1;
    zzaCe = paramUri2;
    zzBc = paramInt2;
    zzaDX = paramString3;
    zzaJM = paramBoolean;
    zzaDq = paramPlayerEntity;
    zzaab = paramInt3;
    zzaJN = paramParticipantResult;
    zzaCo = paramString4;
    zzaCp = paramString5;
  }
  
  public ParticipantEntity(Participant paramParticipant)
  {
    mVersionCode = 3;
    zzaFa = paramParticipant.getParticipantId();
    zzWQ = paramParticipant.getDisplayName();
    zzaCd = paramParticipant.getIconImageUri();
    zzaCe = paramParticipant.getHiResImageUri();
    zzBc = paramParticipant.getStatus();
    zzaDX = paramParticipant.zzwt();
    zzaJM = paramParticipant.isConnectedToRoom();
    Object localObject = paramParticipant.getPlayer();
    if (localObject == null) {}
    for (localObject = null;; localObject = new PlayerEntity((Player)localObject))
    {
      zzaDq = ((PlayerEntity)localObject);
      zzaab = paramParticipant.getCapabilities();
      zzaJN = paramParticipant.getResult();
      zzaCo = paramParticipant.getIconImageUrl();
      zzaCp = paramParticipant.getHiResImageUrl();
      return;
    }
  }
  
  static int zza(Participant paramParticipant)
  {
    return zzw.hashCode(new Object[] { paramParticipant.getPlayer(), Integer.valueOf(paramParticipant.getStatus()), paramParticipant.zzwt(), Boolean.valueOf(paramParticipant.isConnectedToRoom()), paramParticipant.getDisplayName(), paramParticipant.getIconImageUri(), paramParticipant.getHiResImageUri(), Integer.valueOf(paramParticipant.getCapabilities()), paramParticipant.getResult(), paramParticipant.getParticipantId() });
  }
  
  static boolean zza(Participant paramParticipant, Object paramObject)
  {
    if (!(paramObject instanceof Participant)) {}
    do
    {
      return false;
      if (paramParticipant == paramObject) {
        return true;
      }
      paramObject = (Participant)paramObject;
    } while ((!zzw.equal(((Participant)paramObject).getPlayer(), paramParticipant.getPlayer())) || (!zzw.equal(Integer.valueOf(((Participant)paramObject).getStatus()), Integer.valueOf(paramParticipant.getStatus()))) || (!zzw.equal(((Participant)paramObject).zzwt(), paramParticipant.zzwt())) || (!zzw.equal(Boolean.valueOf(((Participant)paramObject).isConnectedToRoom()), Boolean.valueOf(paramParticipant.isConnectedToRoom()))) || (!zzw.equal(((Participant)paramObject).getDisplayName(), paramParticipant.getDisplayName())) || (!zzw.equal(((Participant)paramObject).getIconImageUri(), paramParticipant.getIconImageUri())) || (!zzw.equal(((Participant)paramObject).getHiResImageUri(), paramParticipant.getHiResImageUri())) || (!zzw.equal(Integer.valueOf(((Participant)paramObject).getCapabilities()), Integer.valueOf(paramParticipant.getCapabilities()))) || (!zzw.equal(((Participant)paramObject).getResult(), paramParticipant.getResult())) || (!zzw.equal(((Participant)paramObject).getParticipantId(), paramParticipant.getParticipantId())));
    return true;
  }
  
  static String zzb(Participant paramParticipant)
  {
    return zzw.zzy(paramParticipant).zzg("ParticipantId", paramParticipant.getParticipantId()).zzg("Player", paramParticipant.getPlayer()).zzg("Status", Integer.valueOf(paramParticipant.getStatus())).zzg("ClientAddress", paramParticipant.zzwt()).zzg("ConnectedToRoom", Boolean.valueOf(paramParticipant.isConnectedToRoom())).zzg("DisplayName", paramParticipant.getDisplayName()).zzg("IconImage", paramParticipant.getIconImageUri()).zzg("IconImageUrl", paramParticipant.getIconImageUrl()).zzg("HiResImage", paramParticipant.getHiResImageUri()).zzg("HiResImageUrl", paramParticipant.getHiResImageUrl()).zzg("Capabilities", Integer.valueOf(paramParticipant.getCapabilities())).zzg("Result", paramParticipant.getResult()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Participant freeze()
  {
    return this;
  }
  
  public final int getCapabilities()
  {
    return zzaab;
  }
  
  public final String getDisplayName()
  {
    if (zzaDq == null) {
      return zzWQ;
    }
    return zzaDq.getDisplayName();
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (zzaDq == null)
    {
      zzms.zzb(zzWQ, paramCharArrayBuffer);
      return;
    }
    zzaDq.getDisplayName(paramCharArrayBuffer);
  }
  
  public final Uri getHiResImageUri()
  {
    if (zzaDq == null) {
      return zzaCe;
    }
    return zzaDq.getHiResImageUri();
  }
  
  public final String getHiResImageUrl()
  {
    if (zzaDq == null) {
      return zzaCp;
    }
    return zzaDq.getHiResImageUrl();
  }
  
  public final Uri getIconImageUri()
  {
    if (zzaDq == null) {
      return zzaCd;
    }
    return zzaDq.getIconImageUri();
  }
  
  public final String getIconImageUrl()
  {
    if (zzaDq == null) {
      return zzaCo;
    }
    return zzaDq.getIconImageUrl();
  }
  
  public final String getParticipantId()
  {
    return zzaFa;
  }
  
  public final Player getPlayer()
  {
    return zzaDq;
  }
  
  public final ParticipantResult getResult()
  {
    return zzaJN;
  }
  
  public final int getStatus()
  {
    return zzBc;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isConnectedToRoom()
  {
    return zzaJM;
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
    Object localObject2 = null;
    int j = 0;
    if (!zzqC())
    {
      ParticipantEntityCreator.zza(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(zzaFa);
    paramParcel.writeString(zzWQ);
    Object localObject1;
    if (zzaCd == null)
    {
      localObject1 = null;
      label46:
      paramParcel.writeString((String)localObject1);
      if (zzaCe != null) {
        break label143;
      }
      localObject1 = localObject2;
      label63:
      paramParcel.writeString((String)localObject1);
      paramParcel.writeInt(zzBc);
      paramParcel.writeString(zzaDX);
      if (!zzaJM) {
        break label155;
      }
      i = 1;
      label94:
      paramParcel.writeInt(i);
      if (zzaDq != null) {
        break label160;
      }
    }
    label143:
    label155:
    label160:
    for (int i = j;; i = 1)
    {
      paramParcel.writeInt(i);
      if (zzaDq == null) {
        break;
      }
      zzaDq.writeToParcel(paramParcel, paramInt);
      return;
      localObject1 = zzaCd.toString();
      break label46;
      localObject1 = zzaCe.toString();
      break label63;
      i = 0;
      break label94;
    }
  }
  
  public final String zzwt()
  {
    return zzaDX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.ParticipantEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */