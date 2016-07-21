package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzms;

public final class AchievementEntity
  implements SafeParcelable, Achievement
{
  public static final Parcelable.Creator CREATOR = new AchievementEntityCreator();
  private final String mName;
  private final int mState;
  private final int mVersionCode;
  private final String zzaDj;
  private final Uri zzaDk;
  private final String zzaDl;
  private final Uri zzaDm;
  private final String zzaDn;
  private final int zzaDo;
  private final String zzaDp;
  private final PlayerEntity zzaDq;
  private final int zzaDr;
  private final String zzaDs;
  private final long zzaDt;
  private final long zzaDu;
  private final int zzabB;
  private final String zzaxl;
  
  AchievementEntity(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, Uri paramUri1, String paramString4, Uri paramUri2, String paramString5, int paramInt3, String paramString6, PlayerEntity paramPlayerEntity, int paramInt4, int paramInt5, String paramString7, long paramLong1, long paramLong2)
  {
    mVersionCode = paramInt1;
    zzaDj = paramString1;
    zzabB = paramInt2;
    mName = paramString2;
    zzaxl = paramString3;
    zzaDk = paramUri1;
    zzaDl = paramString4;
    zzaDm = paramUri2;
    zzaDn = paramString5;
    zzaDo = paramInt3;
    zzaDp = paramString6;
    zzaDq = paramPlayerEntity;
    mState = paramInt4;
    zzaDr = paramInt5;
    zzaDs = paramString7;
    zzaDt = paramLong1;
    zzaDu = paramLong2;
  }
  
  public AchievementEntity(Achievement paramAchievement)
  {
    mVersionCode = 1;
    zzaDj = paramAchievement.getAchievementId();
    zzabB = paramAchievement.getType();
    mName = paramAchievement.getName();
    zzaxl = paramAchievement.getDescription();
    zzaDk = paramAchievement.getUnlockedImageUri();
    zzaDl = paramAchievement.getUnlockedImageUrl();
    zzaDm = paramAchievement.getRevealedImageUri();
    zzaDn = paramAchievement.getRevealedImageUrl();
    zzaDq = ((PlayerEntity)paramAchievement.getPlayer().freeze());
    mState = paramAchievement.getState();
    zzaDt = paramAchievement.getLastUpdatedTimestamp();
    zzaDu = paramAchievement.getXpValue();
    if (paramAchievement.getType() == 1)
    {
      zzaDo = paramAchievement.getTotalSteps();
      zzaDp = paramAchievement.getFormattedTotalSteps();
      zzaDr = paramAchievement.getCurrentSteps();
    }
    for (zzaDs = paramAchievement.getFormattedCurrentSteps();; zzaDs = null)
    {
      zzb.zzv(zzaDj);
      zzb.zzv(zzaxl);
      return;
      zzaDo = 0;
      zzaDp = null;
      zzaDr = 0;
    }
  }
  
  static int zza(Achievement paramAchievement)
  {
    int j;
    int i;
    if (paramAchievement.getType() == 1)
    {
      j = paramAchievement.getCurrentSteps();
      i = paramAchievement.getTotalSteps();
    }
    for (;;)
    {
      return zzw.hashCode(new Object[] { paramAchievement.getAchievementId(), paramAchievement.getName(), Integer.valueOf(paramAchievement.getType()), paramAchievement.getDescription(), Long.valueOf(paramAchievement.getXpValue()), Integer.valueOf(paramAchievement.getState()), Long.valueOf(paramAchievement.getLastUpdatedTimestamp()), paramAchievement.getPlayer(), Integer.valueOf(j), Integer.valueOf(i) });
      i = 0;
      j = 0;
    }
  }
  
  static boolean zza(Achievement paramAchievement, Object paramObject)
  {
    boolean bool3 = true;
    boolean bool2;
    if (!(paramObject instanceof Achievement)) {
      bool2 = false;
    }
    do
    {
      return bool2;
      bool2 = bool3;
    } while (paramAchievement == paramObject);
    paramObject = (Achievement)paramObject;
    boolean bool1;
    if (paramAchievement.getType() == 1)
    {
      bool2 = zzw.equal(Integer.valueOf(((Achievement)paramObject).getCurrentSteps()), Integer.valueOf(paramAchievement.getCurrentSteps()));
      bool1 = zzw.equal(Integer.valueOf(((Achievement)paramObject).getTotalSteps()), Integer.valueOf(paramAchievement.getTotalSteps()));
    }
    for (;;)
    {
      if ((zzw.equal(((Achievement)paramObject).getAchievementId(), paramAchievement.getAchievementId())) && (zzw.equal(((Achievement)paramObject).getName(), paramAchievement.getName())) && (zzw.equal(Integer.valueOf(((Achievement)paramObject).getType()), Integer.valueOf(paramAchievement.getType()))) && (zzw.equal(((Achievement)paramObject).getDescription(), paramAchievement.getDescription())) && (zzw.equal(Long.valueOf(((Achievement)paramObject).getXpValue()), Long.valueOf(paramAchievement.getXpValue()))) && (zzw.equal(Integer.valueOf(((Achievement)paramObject).getState()), Integer.valueOf(paramAchievement.getState()))) && (zzw.equal(Long.valueOf(((Achievement)paramObject).getLastUpdatedTimestamp()), Long.valueOf(paramAchievement.getLastUpdatedTimestamp()))) && (zzw.equal(((Achievement)paramObject).getPlayer(), paramAchievement.getPlayer())) && (bool2))
      {
        bool2 = bool3;
        if (bool1) {
          break;
        }
      }
      return false;
      bool1 = true;
      bool2 = true;
    }
  }
  
  static String zzb(Achievement paramAchievement)
  {
    zzw.zza localzza = zzw.zzy(paramAchievement).zzg("Id", paramAchievement.getAchievementId()).zzg("Type", Integer.valueOf(paramAchievement.getType())).zzg("Name", paramAchievement.getName()).zzg("Description", paramAchievement.getDescription()).zzg("Player", paramAchievement.getPlayer()).zzg("State", Integer.valueOf(paramAchievement.getState()));
    if (paramAchievement.getType() == 1)
    {
      localzza.zzg("CurrentSteps", Integer.valueOf(paramAchievement.getCurrentSteps()));
      localzza.zzg("TotalSteps", Integer.valueOf(paramAchievement.getTotalSteps()));
    }
    return localzza.toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Achievement freeze()
  {
    return this;
  }
  
  public final String getAchievementId()
  {
    return zzaDj;
  }
  
  public final int getCurrentSteps()
  {
    boolean bool = true;
    if (getType() == 1) {}
    for (;;)
    {
      zzb.zzab(bool);
      return zzvM();
      bool = false;
    }
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaxl, paramCharArrayBuffer);
  }
  
  public final String getFormattedCurrentSteps()
  {
    boolean bool = true;
    if (getType() == 1) {}
    for (;;)
    {
      zzb.zzab(bool);
      return zzvN();
      bool = false;
    }
  }
  
  public final void getFormattedCurrentSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    boolean bool = true;
    if (getType() == 1) {}
    for (;;)
    {
      zzb.zzab(bool);
      zzms.zzb(zzaDs, paramCharArrayBuffer);
      return;
      bool = false;
    }
  }
  
  public final String getFormattedTotalSteps()
  {
    boolean bool = true;
    if (getType() == 1) {}
    for (;;)
    {
      zzb.zzab(bool);
      return zzvL();
      bool = false;
    }
  }
  
  public final void getFormattedTotalSteps(CharArrayBuffer paramCharArrayBuffer)
  {
    boolean bool = true;
    if (getType() == 1) {}
    for (;;)
    {
      zzb.zzab(bool);
      zzms.zzb(zzaDp, paramCharArrayBuffer);
      return;
      bool = false;
    }
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
  
  public final Player getPlayer()
  {
    return zzaDq;
  }
  
  public final Uri getRevealedImageUri()
  {
    return zzaDm;
  }
  
  public final String getRevealedImageUrl()
  {
    return zzaDn;
  }
  
  public final int getState()
  {
    return mState;
  }
  
  public final int getTotalSteps()
  {
    boolean bool = true;
    if (getType() == 1) {}
    for (;;)
    {
      zzb.zzab(bool);
      return zzvK();
      bool = false;
    }
  }
  
  public final int getType()
  {
    return zzabB;
  }
  
  public final Uri getUnlockedImageUri()
  {
    return zzaDk;
  }
  
  public final String getUnlockedImageUrl()
  {
    return zzaDl;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final long getXpValue()
  {
    return zzaDu;
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
    AchievementEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final int zzvK()
  {
    return zzaDo;
  }
  
  public final String zzvL()
  {
    return zzaDp;
  }
  
  public final int zzvM()
  {
    return zzaDr;
  }
  
  public final String zzvN()
  {
    return zzaDs;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.achievement.AchievementEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */