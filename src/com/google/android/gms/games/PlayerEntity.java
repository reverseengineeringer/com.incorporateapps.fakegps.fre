package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.internal.zzms;

public final class PlayerEntity
  extends GamesDowngradeableSafeParcel
  implements Player
{
  public static final Parcelable.Creator CREATOR = new PlayerEntity.PlayerEntityCreatorCompat();
  private final String mName;
  private final int mVersionCode;
  private String zzWQ;
  private final long zzaCO;
  private final int zzaCP;
  private final long zzaCQ;
  private final MostRecentGameInfoEntity zzaCR;
  private final PlayerLevelInfo zzaCS;
  private final boolean zzaCT;
  private final boolean zzaCU;
  private final String zzaCV;
  private final Uri zzaCW;
  private final String zzaCX;
  private final Uri zzaCY;
  private final String zzaCZ;
  private final Uri zzaCd;
  private final Uri zzaCe;
  private final String zzaCo;
  private final String zzaCp;
  private String zzacX;
  private final String zzapg;
  
  PlayerEntity(int paramInt1, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, long paramLong1, int paramInt2, long paramLong2, String paramString3, String paramString4, String paramString5, MostRecentGameInfoEntity paramMostRecentGameInfoEntity, PlayerLevelInfo paramPlayerLevelInfo, boolean paramBoolean1, boolean paramBoolean2, String paramString6, String paramString7, Uri paramUri3, String paramString8, Uri paramUri4, String paramString9)
  {
    mVersionCode = paramInt1;
    zzacX = paramString1;
    zzWQ = paramString2;
    zzaCd = paramUri1;
    zzaCo = paramString3;
    zzaCe = paramUri2;
    zzaCp = paramString4;
    zzaCO = paramLong1;
    zzaCP = paramInt2;
    zzaCQ = paramLong2;
    zzapg = paramString5;
    zzaCT = paramBoolean1;
    zzaCR = paramMostRecentGameInfoEntity;
    zzaCS = paramPlayerLevelInfo;
    zzaCU = paramBoolean2;
    zzaCV = paramString6;
    mName = paramString7;
    zzaCW = paramUri3;
    zzaCX = paramString8;
    zzaCY = paramUri4;
    zzaCZ = paramString9;
  }
  
  public PlayerEntity(Player paramPlayer)
  {
    this(paramPlayer, true);
  }
  
  public PlayerEntity(Player paramPlayer, boolean paramBoolean)
  {
    mVersionCode = 13;
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = paramPlayer.getPlayerId();
      zzacX = ((String)localObject1);
      zzWQ = paramPlayer.getDisplayName();
      zzaCd = paramPlayer.getIconImageUri();
      zzaCo = paramPlayer.getIconImageUrl();
      zzaCe = paramPlayer.getHiResImageUri();
      zzaCp = paramPlayer.getHiResImageUrl();
      zzaCO = paramPlayer.getRetrievedTimestamp();
      zzaCP = paramPlayer.zzvG();
      zzaCQ = paramPlayer.getLastPlayedWithTimestamp();
      zzapg = paramPlayer.getTitle();
      zzaCT = paramPlayer.zzvH();
      localObject1 = paramPlayer.zzvI();
      if (localObject1 != null) {
        break label267;
      }
      localObject1 = localObject2;
      label143:
      zzaCR = ((MostRecentGameInfoEntity)localObject1);
      zzaCS = paramPlayer.getLevelInfo();
      zzaCU = paramPlayer.zzvF();
      zzaCV = paramPlayer.zzvE();
      mName = paramPlayer.getName();
      zzaCW = paramPlayer.getBannerImageLandscapeUri();
      zzaCX = paramPlayer.getBannerImageLandscapeUrl();
      zzaCY = paramPlayer.getBannerImagePortraitUri();
      zzaCZ = paramPlayer.getBannerImagePortraitUrl();
      if (paramBoolean) {
        zzb.zzv(zzacX);
      }
      zzb.zzv(zzWQ);
      if (zzaCO <= 0L) {
        break label279;
      }
    }
    label267:
    label279:
    for (paramBoolean = true;; paramBoolean = false)
    {
      zzb.zzab(paramBoolean);
      return;
      localObject1 = null;
      break;
      localObject1 = new MostRecentGameInfoEntity((MostRecentGameInfo)localObject1);
      break label143;
    }
  }
  
  static boolean zza(Player paramPlayer, Object paramObject)
  {
    if (!(paramObject instanceof Player)) {}
    do
    {
      return false;
      if (paramPlayer == paramObject) {
        return true;
      }
      paramObject = (Player)paramObject;
    } while ((!zzw.equal(((Player)paramObject).getPlayerId(), paramPlayer.getPlayerId())) || (!zzw.equal(((Player)paramObject).getDisplayName(), paramPlayer.getDisplayName())) || (!zzw.equal(Boolean.valueOf(((Player)paramObject).zzvF()), Boolean.valueOf(paramPlayer.zzvF()))) || (!zzw.equal(((Player)paramObject).getIconImageUri(), paramPlayer.getIconImageUri())) || (!zzw.equal(((Player)paramObject).getHiResImageUri(), paramPlayer.getHiResImageUri())) || (!zzw.equal(Long.valueOf(((Player)paramObject).getRetrievedTimestamp()), Long.valueOf(paramPlayer.getRetrievedTimestamp()))) || (!zzw.equal(((Player)paramObject).getTitle(), paramPlayer.getTitle())) || (!zzw.equal(((Player)paramObject).getLevelInfo(), paramPlayer.getLevelInfo())) || (!zzw.equal(((Player)paramObject).zzvE(), paramPlayer.zzvE())) || (!zzw.equal(((Player)paramObject).getName(), paramPlayer.getName())) || (!zzw.equal(((Player)paramObject).getBannerImageLandscapeUri(), paramPlayer.getBannerImageLandscapeUri())) || (!zzw.equal(((Player)paramObject).getBannerImagePortraitUri(), paramPlayer.getBannerImagePortraitUri())));
    return true;
  }
  
  static int zzb(Player paramPlayer)
  {
    return zzw.hashCode(new Object[] { paramPlayer.getPlayerId(), paramPlayer.getDisplayName(), Boolean.valueOf(paramPlayer.zzvF()), paramPlayer.getIconImageUri(), paramPlayer.getHiResImageUri(), Long.valueOf(paramPlayer.getRetrievedTimestamp()), paramPlayer.getTitle(), paramPlayer.getLevelInfo(), paramPlayer.zzvE(), paramPlayer.getName(), paramPlayer.getBannerImageLandscapeUri(), paramPlayer.getBannerImagePortraitUri() });
  }
  
  static String zzc(Player paramPlayer)
  {
    return zzw.zzy(paramPlayer).zzg("PlayerId", paramPlayer.getPlayerId()).zzg("DisplayName", paramPlayer.getDisplayName()).zzg("HasDebugAccess", Boolean.valueOf(paramPlayer.zzvF())).zzg("IconImageUri", paramPlayer.getIconImageUri()).zzg("IconImageUrl", paramPlayer.getIconImageUrl()).zzg("HiResImageUri", paramPlayer.getHiResImageUri()).zzg("HiResImageUrl", paramPlayer.getHiResImageUrl()).zzg("RetrievedTimestamp", Long.valueOf(paramPlayer.getRetrievedTimestamp())).zzg("Title", paramPlayer.getTitle()).zzg("LevelInfo", paramPlayer.getLevelInfo()).zzg("GamerTag", paramPlayer.zzvE()).zzg("Name", paramPlayer.getName()).zzg("BannerImageLandscapeUri", paramPlayer.getBannerImageLandscapeUri()).zzg("BannerImageLandscapeUrl", paramPlayer.getBannerImageLandscapeUrl()).zzg("BannerImagePortraitUri", paramPlayer.getBannerImagePortraitUri()).zzg("BannerImagePortraitUrl", paramPlayer.getBannerImagePortraitUrl()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Player freeze()
  {
    return this;
  }
  
  public final Uri getBannerImageLandscapeUri()
  {
    return zzaCW;
  }
  
  public final String getBannerImageLandscapeUrl()
  {
    return zzaCX;
  }
  
  public final Uri getBannerImagePortraitUri()
  {
    return zzaCY;
  }
  
  public final String getBannerImagePortraitUrl()
  {
    return zzaCZ;
  }
  
  public final String getDisplayName()
  {
    return zzWQ;
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzWQ, paramCharArrayBuffer);
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
  
  public final long getLastPlayedWithTimestamp()
  {
    return zzaCQ;
  }
  
  public final PlayerLevelInfo getLevelInfo()
  {
    return zzaCS;
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final String getPlayerId()
  {
    return zzacX;
  }
  
  public final long getRetrievedTimestamp()
  {
    return zzaCO;
  }
  
  public final String getTitle()
  {
    return zzapg;
  }
  
  public final void getTitle(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzapg, paramCharArrayBuffer);
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final boolean hasHiResImage()
  {
    return getHiResImageUri() != null;
  }
  
  public final boolean hasIconImage()
  {
    return getIconImageUri() != null;
  }
  
  public final int hashCode()
  {
    return zzb(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzc(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject2 = null;
    if (!zzqC())
    {
      PlayerEntityCreator.zza(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(zzacX);
    paramParcel.writeString(zzWQ);
    if (zzaCd == null)
    {
      localObject1 = null;
      paramParcel.writeString((String)localObject1);
      if (zzaCe != null) {
        break label82;
      }
    }
    label82:
    for (Object localObject1 = localObject2;; localObject1 = zzaCe.toString())
    {
      paramParcel.writeString((String)localObject1);
      paramParcel.writeLong(zzaCO);
      return;
      localObject1 = zzaCd.toString();
      break;
    }
  }
  
  public final String zzvE()
  {
    return zzaCV;
  }
  
  public final boolean zzvF()
  {
    return zzaCU;
  }
  
  public final int zzvG()
  {
    return zzaCP;
  }
  
  public final boolean zzvH()
  {
    return zzaCT;
  }
  
  public final MostRecentGameInfo zzvI()
  {
    return zzaCR;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.PlayerEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */