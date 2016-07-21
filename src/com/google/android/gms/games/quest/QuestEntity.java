package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.zzms;
import java.util.ArrayList;
import java.util.List;

public final class QuestEntity
  implements SafeParcelable, Quest
{
  public static final Parcelable.Creator CREATOR = new QuestEntityCreator();
  private final String mName;
  private final int mState;
  private final int mVersionCode;
  private final long zzaDt;
  private final GameEntity zzaJE;
  private final long zzaKA;
  private final Uri zzaKB;
  private final String zzaKC;
  private final long zzaKD;
  private final long zzaKE;
  private final ArrayList zzaKF;
  private final String zzaKw;
  private final long zzaKx;
  private final Uri zzaKy;
  private final String zzaKz;
  private final int zzabB;
  private final String zzaxl;
  
  QuestEntity(int paramInt1, GameEntity paramGameEntity, String paramString1, long paramLong1, Uri paramUri1, String paramString2, String paramString3, long paramLong2, long paramLong3, Uri paramUri2, String paramString4, String paramString5, long paramLong4, long paramLong5, int paramInt2, int paramInt3, ArrayList paramArrayList)
  {
    mVersionCode = paramInt1;
    zzaJE = paramGameEntity;
    zzaKw = paramString1;
    zzaKx = paramLong1;
    zzaKy = paramUri1;
    zzaKz = paramString2;
    zzaxl = paramString3;
    zzaKA = paramLong2;
    zzaDt = paramLong3;
    zzaKB = paramUri2;
    zzaKC = paramString4;
    mName = paramString5;
    zzaKD = paramLong4;
    zzaKE = paramLong5;
    mState = paramInt2;
    zzabB = paramInt3;
    zzaKF = paramArrayList;
  }
  
  public QuestEntity(Quest paramQuest)
  {
    mVersionCode = 2;
    zzaJE = new GameEntity(paramQuest.getGame());
    zzaKw = paramQuest.getQuestId();
    zzaKx = paramQuest.getAcceptedTimestamp();
    zzaxl = paramQuest.getDescription();
    zzaKy = paramQuest.getBannerImageUri();
    zzaKz = paramQuest.getBannerImageUrl();
    zzaKA = paramQuest.getEndTimestamp();
    zzaKB = paramQuest.getIconImageUri();
    zzaKC = paramQuest.getIconImageUrl();
    zzaDt = paramQuest.getLastUpdatedTimestamp();
    mName = paramQuest.getName();
    zzaKD = paramQuest.zzxS();
    zzaKE = paramQuest.getStartTimestamp();
    mState = paramQuest.getState();
    zzabB = paramQuest.getType();
    paramQuest = paramQuest.zzxR();
    int j = paramQuest.size();
    zzaKF = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      zzaKF.add((MilestoneEntity)((Milestone)paramQuest.get(i)).freeze());
      i += 1;
    }
  }
  
  static int zza(Quest paramQuest)
  {
    return zzw.hashCode(new Object[] { paramQuest.getGame(), paramQuest.getQuestId(), Long.valueOf(paramQuest.getAcceptedTimestamp()), paramQuest.getBannerImageUri(), paramQuest.getDescription(), Long.valueOf(paramQuest.getEndTimestamp()), paramQuest.getIconImageUri(), Long.valueOf(paramQuest.getLastUpdatedTimestamp()), paramQuest.zzxR(), paramQuest.getName(), Long.valueOf(paramQuest.zzxS()), Long.valueOf(paramQuest.getStartTimestamp()), Integer.valueOf(paramQuest.getState()) });
  }
  
  static boolean zza(Quest paramQuest, Object paramObject)
  {
    if (!(paramObject instanceof Quest)) {}
    do
    {
      return false;
      if (paramQuest == paramObject) {
        return true;
      }
      paramObject = (Quest)paramObject;
    } while ((!zzw.equal(((Quest)paramObject).getGame(), paramQuest.getGame())) || (!zzw.equal(((Quest)paramObject).getQuestId(), paramQuest.getQuestId())) || (!zzw.equal(Long.valueOf(((Quest)paramObject).getAcceptedTimestamp()), Long.valueOf(paramQuest.getAcceptedTimestamp()))) || (!zzw.equal(((Quest)paramObject).getBannerImageUri(), paramQuest.getBannerImageUri())) || (!zzw.equal(((Quest)paramObject).getDescription(), paramQuest.getDescription())) || (!zzw.equal(Long.valueOf(((Quest)paramObject).getEndTimestamp()), Long.valueOf(paramQuest.getEndTimestamp()))) || (!zzw.equal(((Quest)paramObject).getIconImageUri(), paramQuest.getIconImageUri())) || (!zzw.equal(Long.valueOf(((Quest)paramObject).getLastUpdatedTimestamp()), Long.valueOf(paramQuest.getLastUpdatedTimestamp()))) || (!zzw.equal(((Quest)paramObject).zzxR(), paramQuest.zzxR())) || (!zzw.equal(((Quest)paramObject).getName(), paramQuest.getName())) || (!zzw.equal(Long.valueOf(((Quest)paramObject).zzxS()), Long.valueOf(paramQuest.zzxS()))) || (!zzw.equal(Long.valueOf(((Quest)paramObject).getStartTimestamp()), Long.valueOf(paramQuest.getStartTimestamp()))) || (!zzw.equal(Integer.valueOf(((Quest)paramObject).getState()), Integer.valueOf(paramQuest.getState()))));
    return true;
  }
  
  static String zzb(Quest paramQuest)
  {
    return zzw.zzy(paramQuest).zzg("Game", paramQuest.getGame()).zzg("QuestId", paramQuest.getQuestId()).zzg("AcceptedTimestamp", Long.valueOf(paramQuest.getAcceptedTimestamp())).zzg("BannerImageUri", paramQuest.getBannerImageUri()).zzg("BannerImageUrl", paramQuest.getBannerImageUrl()).zzg("Description", paramQuest.getDescription()).zzg("EndTimestamp", Long.valueOf(paramQuest.getEndTimestamp())).zzg("IconImageUri", paramQuest.getIconImageUri()).zzg("IconImageUrl", paramQuest.getIconImageUrl()).zzg("LastUpdatedTimestamp", Long.valueOf(paramQuest.getLastUpdatedTimestamp())).zzg("Milestones", paramQuest.zzxR()).zzg("Name", paramQuest.getName()).zzg("NotifyTimestamp", Long.valueOf(paramQuest.zzxS())).zzg("StartTimestamp", Long.valueOf(paramQuest.getStartTimestamp())).zzg("State", Integer.valueOf(paramQuest.getState())).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Quest freeze()
  {
    return this;
  }
  
  public final long getAcceptedTimestamp()
  {
    return zzaKx;
  }
  
  public final Uri getBannerImageUri()
  {
    return zzaKy;
  }
  
  public final String getBannerImageUrl()
  {
    return zzaKz;
  }
  
  public final Milestone getCurrentMilestone()
  {
    return (Milestone)zzxR().get(0);
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaxl, paramCharArrayBuffer);
  }
  
  public final long getEndTimestamp()
  {
    return zzaKA;
  }
  
  public final Game getGame()
  {
    return zzaJE;
  }
  
  public final Uri getIconImageUri()
  {
    return zzaKB;
  }
  
  public final String getIconImageUrl()
  {
    return zzaKC;
  }
  
  public final long getLastUpdatedTimestamp()
  {
    return zzaDt;
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(mName, paramCharArrayBuffer);
  }
  
  public final String getQuestId()
  {
    return zzaKw;
  }
  
  public final long getStartTimestamp()
  {
    return zzaKE;
  }
  
  public final int getState()
  {
    return mState;
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
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final boolean isEndingSoon()
  {
    return zzaKD <= System.currentTimeMillis() + 1800000L;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    QuestEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final List zzxR()
  {
    return new ArrayList(zzaKF);
  }
  
  public final long zzxS()
  {
    return zzaKD;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.quest.QuestEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */