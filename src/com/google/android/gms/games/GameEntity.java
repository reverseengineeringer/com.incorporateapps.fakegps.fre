package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.zzms;

public final class GameEntity
  extends GamesDowngradeableSafeParcel
  implements Game
{
  public static final Parcelable.Creator CREATOR = new GameEntity.GameEntityCreatorCompat();
  private final int mVersionCode;
  private final boolean zzDZ;
  private final String zzWQ;
  private final String zzZC;
  private final String zzaCa;
  private final String zzaCb;
  private final String zzaCc;
  private final Uri zzaCd;
  private final Uri zzaCe;
  private final Uri zzaCf;
  private final boolean zzaCg;
  private final boolean zzaCh;
  private final String zzaCi;
  private final int zzaCj;
  private final int zzaCk;
  private final int zzaCl;
  private final boolean zzaCm;
  private final boolean zzaCn;
  private final String zzaCo;
  private final String zzaCp;
  private final String zzaCq;
  private final boolean zzaCr;
  private final boolean zzaCs;
  private final String zzaCt;
  private final boolean zzaCu;
  private final String zzaxl;
  
  GameEntity(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri1, Uri paramUri2, Uri paramUri3, boolean paramBoolean1, boolean paramBoolean2, String paramString7, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean3, boolean paramBoolean4, String paramString8, String paramString9, String paramString10, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, String paramString11, boolean paramBoolean8)
  {
    mVersionCode = paramInt1;
    zzZC = paramString1;
    zzWQ = paramString2;
    zzaCa = paramString3;
    zzaCb = paramString4;
    zzaxl = paramString5;
    zzaCc = paramString6;
    zzaCd = paramUri1;
    zzaCo = paramString8;
    zzaCe = paramUri2;
    zzaCp = paramString9;
    zzaCf = paramUri3;
    zzaCq = paramString10;
    zzaCg = paramBoolean1;
    zzaCh = paramBoolean2;
    zzaCi = paramString7;
    zzaCj = paramInt2;
    zzaCk = paramInt3;
    zzaCl = paramInt4;
    zzaCm = paramBoolean3;
    zzaCn = paramBoolean4;
    zzDZ = paramBoolean5;
    zzaCr = paramBoolean6;
    zzaCs = paramBoolean7;
    zzaCt = paramString11;
    zzaCu = paramBoolean8;
  }
  
  public GameEntity(Game paramGame)
  {
    mVersionCode = 7;
    zzZC = paramGame.getApplicationId();
    zzaCa = paramGame.getPrimaryCategory();
    zzaCb = paramGame.getSecondaryCategory();
    zzaxl = paramGame.getDescription();
    zzaCc = paramGame.getDeveloperName();
    zzWQ = paramGame.getDisplayName();
    zzaCd = paramGame.getIconImageUri();
    zzaCo = paramGame.getIconImageUrl();
    zzaCe = paramGame.getHiResImageUri();
    zzaCp = paramGame.getHiResImageUrl();
    zzaCf = paramGame.getFeaturedImageUri();
    zzaCq = paramGame.getFeaturedImageUrl();
    zzaCg = paramGame.zzvx();
    zzaCh = paramGame.zzvz();
    zzaCi = paramGame.zzvA();
    zzaCj = paramGame.zzvB();
    zzaCk = paramGame.getAchievementTotalCount();
    zzaCl = paramGame.getLeaderboardCount();
    zzaCm = paramGame.isRealTimeMultiplayerEnabled();
    zzaCn = paramGame.isTurnBasedMultiplayerEnabled();
    zzDZ = paramGame.isMuted();
    zzaCr = paramGame.zzvy();
    zzaCs = paramGame.areSnapshotsEnabled();
    zzaCt = paramGame.getThemeColor();
    zzaCu = paramGame.hasGamepadSupport();
  }
  
  static int zza(Game paramGame)
  {
    return zzw.hashCode(new Object[] { paramGame.getApplicationId(), paramGame.getDisplayName(), paramGame.getPrimaryCategory(), paramGame.getSecondaryCategory(), paramGame.getDescription(), paramGame.getDeveloperName(), paramGame.getIconImageUri(), paramGame.getHiResImageUri(), paramGame.getFeaturedImageUri(), Boolean.valueOf(paramGame.zzvx()), Boolean.valueOf(paramGame.zzvz()), paramGame.zzvA(), Integer.valueOf(paramGame.zzvB()), Integer.valueOf(paramGame.getAchievementTotalCount()), Integer.valueOf(paramGame.getLeaderboardCount()), Boolean.valueOf(paramGame.isRealTimeMultiplayerEnabled()), Boolean.valueOf(paramGame.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(paramGame.isMuted()), Boolean.valueOf(paramGame.zzvy()), Boolean.valueOf(paramGame.areSnapshotsEnabled()), paramGame.getThemeColor(), Boolean.valueOf(paramGame.hasGamepadSupport()) });
  }
  
  static boolean zza(Game paramGame, Object paramObject)
  {
    if (!(paramObject instanceof Game)) {}
    for (;;)
    {
      return false;
      if (paramGame == paramObject) {
        return true;
      }
      paramObject = (Game)paramObject;
      if ((zzw.equal(((Game)paramObject).getApplicationId(), paramGame.getApplicationId())) && (zzw.equal(((Game)paramObject).getDisplayName(), paramGame.getDisplayName())) && (zzw.equal(((Game)paramObject).getPrimaryCategory(), paramGame.getPrimaryCategory())) && (zzw.equal(((Game)paramObject).getSecondaryCategory(), paramGame.getSecondaryCategory())) && (zzw.equal(((Game)paramObject).getDescription(), paramGame.getDescription())) && (zzw.equal(((Game)paramObject).getDeveloperName(), paramGame.getDeveloperName())) && (zzw.equal(((Game)paramObject).getIconImageUri(), paramGame.getIconImageUri())) && (zzw.equal(((Game)paramObject).getHiResImageUri(), paramGame.getHiResImageUri())) && (zzw.equal(((Game)paramObject).getFeaturedImageUri(), paramGame.getFeaturedImageUri())) && (zzw.equal(Boolean.valueOf(((Game)paramObject).zzvx()), Boolean.valueOf(paramGame.zzvx()))) && (zzw.equal(Boolean.valueOf(((Game)paramObject).zzvz()), Boolean.valueOf(paramGame.zzvz()))) && (zzw.equal(((Game)paramObject).zzvA(), paramGame.zzvA())) && (zzw.equal(Integer.valueOf(((Game)paramObject).zzvB()), Integer.valueOf(paramGame.zzvB()))) && (zzw.equal(Integer.valueOf(((Game)paramObject).getAchievementTotalCount()), Integer.valueOf(paramGame.getAchievementTotalCount()))) && (zzw.equal(Integer.valueOf(((Game)paramObject).getLeaderboardCount()), Integer.valueOf(paramGame.getLeaderboardCount()))) && (zzw.equal(Boolean.valueOf(((Game)paramObject).isRealTimeMultiplayerEnabled()), Boolean.valueOf(paramGame.isRealTimeMultiplayerEnabled()))))
      {
        boolean bool2 = ((Game)paramObject).isTurnBasedMultiplayerEnabled();
        if ((paramGame.isTurnBasedMultiplayerEnabled()) && (zzw.equal(Boolean.valueOf(((Game)paramObject).isMuted()), Boolean.valueOf(paramGame.isMuted()))) && (zzw.equal(Boolean.valueOf(((Game)paramObject).zzvy()), Boolean.valueOf(paramGame.zzvy())))) {}
        for (boolean bool1 = true; (zzw.equal(Boolean.valueOf(bool2), Boolean.valueOf(bool1))) && (zzw.equal(Boolean.valueOf(((Game)paramObject).areSnapshotsEnabled()), Boolean.valueOf(paramGame.areSnapshotsEnabled()))) && (zzw.equal(((Game)paramObject).getThemeColor(), paramGame.getThemeColor())) && (zzw.equal(Boolean.valueOf(((Game)paramObject).hasGamepadSupport()), Boolean.valueOf(paramGame.hasGamepadSupport()))); bool1 = false) {
          return true;
        }
      }
    }
  }
  
  static String zzb(Game paramGame)
  {
    return zzw.zzy(paramGame).zzg("ApplicationId", paramGame.getApplicationId()).zzg("DisplayName", paramGame.getDisplayName()).zzg("PrimaryCategory", paramGame.getPrimaryCategory()).zzg("SecondaryCategory", paramGame.getSecondaryCategory()).zzg("Description", paramGame.getDescription()).zzg("DeveloperName", paramGame.getDeveloperName()).zzg("IconImageUri", paramGame.getIconImageUri()).zzg("IconImageUrl", paramGame.getIconImageUrl()).zzg("HiResImageUri", paramGame.getHiResImageUri()).zzg("HiResImageUrl", paramGame.getHiResImageUrl()).zzg("FeaturedImageUri", paramGame.getFeaturedImageUri()).zzg("FeaturedImageUrl", paramGame.getFeaturedImageUrl()).zzg("PlayEnabledGame", Boolean.valueOf(paramGame.zzvx())).zzg("InstanceInstalled", Boolean.valueOf(paramGame.zzvz())).zzg("InstancePackageName", paramGame.zzvA()).zzg("AchievementTotalCount", Integer.valueOf(paramGame.getAchievementTotalCount())).zzg("LeaderboardCount", Integer.valueOf(paramGame.getLeaderboardCount())).zzg("RealTimeMultiplayerEnabled", Boolean.valueOf(paramGame.isRealTimeMultiplayerEnabled())).zzg("TurnBasedMultiplayerEnabled", Boolean.valueOf(paramGame.isTurnBasedMultiplayerEnabled())).zzg("AreSnapshotsEnabled", Boolean.valueOf(paramGame.areSnapshotsEnabled())).zzg("ThemeColor", paramGame.getThemeColor()).zzg("HasGamepadSupport", Boolean.valueOf(paramGame.hasGamepadSupport())).toString();
  }
  
  public final boolean areSnapshotsEnabled()
  {
    return zzaCs;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Game freeze()
  {
    return this;
  }
  
  public final int getAchievementTotalCount()
  {
    return zzaCk;
  }
  
  public final String getApplicationId()
  {
    return zzZC;
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaxl, paramCharArrayBuffer);
  }
  
  public final String getDeveloperName()
  {
    return zzaCc;
  }
  
  public final void getDeveloperName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaCc, paramCharArrayBuffer);
  }
  
  public final String getDisplayName()
  {
    return zzWQ;
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzWQ, paramCharArrayBuffer);
  }
  
  public final Uri getFeaturedImageUri()
  {
    return zzaCf;
  }
  
  public final String getFeaturedImageUrl()
  {
    return zzaCq;
  }
  
  public final Uri getHiResImageUri()
  {
    return zzaCe;
  }
  
  public final String getHiResImageUrl()
  {
    return zzaCp;
  }
  
  public final Uri getIconImageUri()
  {
    return zzaCd;
  }
  
  public final String getIconImageUrl()
  {
    return zzaCo;
  }
  
  public final int getLeaderboardCount()
  {
    return zzaCl;
  }
  
  public final String getPrimaryCategory()
  {
    return zzaCa;
  }
  
  public final String getSecondaryCategory()
  {
    return zzaCb;
  }
  
  public final String getThemeColor()
  {
    return zzaCt;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final boolean hasGamepadSupport()
  {
    return zzaCu;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final boolean isMuted()
  {
    return zzDZ;
  }
  
  public final boolean isRealTimeMultiplayerEnabled()
  {
    return zzaCm;
  }
  
  public final boolean isTurnBasedMultiplayerEnabled()
  {
    return zzaCn;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    Object localObject2 = null;
    if (!zzqC())
    {
      GameEntityCreator.zza(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(zzZC);
    paramParcel.writeString(zzWQ);
    paramParcel.writeString(zzaCa);
    paramParcel.writeString(zzaCb);
    paramParcel.writeString(zzaxl);
    paramParcel.writeString(zzaCc);
    Object localObject1;
    if (zzaCd == null)
    {
      localObject1 = null;
      paramParcel.writeString((String)localObject1);
      if (zzaCe != null) {
        break label189;
      }
      localObject1 = null;
      label93:
      paramParcel.writeString((String)localObject1);
      if (zzaCf != null) {
        break label201;
      }
      localObject1 = localObject2;
      label110:
      paramParcel.writeString((String)localObject1);
      if (!zzaCg) {
        break label213;
      }
      paramInt = 1;
      label125:
      paramParcel.writeInt(paramInt);
      if (!zzaCh) {
        break label218;
      }
    }
    label189:
    label201:
    label213:
    label218:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(zzaCi);
      paramParcel.writeInt(zzaCj);
      paramParcel.writeInt(zzaCk);
      paramParcel.writeInt(zzaCl);
      return;
      localObject1 = zzaCd.toString();
      break;
      localObject1 = zzaCe.toString();
      break label93;
      localObject1 = zzaCf.toString();
      break label110;
      paramInt = 0;
      break label125;
    }
  }
  
  public final String zzvA()
  {
    return zzaCi;
  }
  
  public final int zzvB()
  {
    return zzaCj;
  }
  
  public final boolean zzvx()
  {
    return zzaCg;
  }
  
  public final boolean zzvy()
  {
    return zzaCr;
  }
  
  public final boolean zzvz()
  {
    return zzaCh;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.GameEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */