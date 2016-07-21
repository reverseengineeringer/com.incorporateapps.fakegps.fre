package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
import com.google.android.gms.games.internal.player.PlayerColumnNames;

public final class PlayerRef
  extends zzc
  implements Player
{
  private final PlayerLevelInfo zzaCS;
  private final PlayerColumnNames zzaDh;
  private final MostRecentGameInfoRef zzaDi;
  
  public PlayerRef(DataHolder paramDataHolder, int paramInt)
  {
    this(paramDataHolder, paramInt, null);
  }
  
  public PlayerRef(DataHolder paramDataHolder, int paramInt, String paramString)
  {
    super(paramDataHolder, paramInt);
    zzaDh = new PlayerColumnNames(paramString);
    zzaDi = new MostRecentGameInfoRef(paramDataHolder, paramInt, zzaDh);
    int i;
    if (zzvJ())
    {
      paramInt = getInteger(zzaDh.zzaIC);
      i = getInteger(zzaDh.zzaIF);
      paramString = new PlayerLevel(paramInt, getLong(zzaDh.zzaID), getLong(zzaDh.zzaIE));
      if (paramInt == i) {
        break label178;
      }
    }
    label178:
    for (paramDataHolder = new PlayerLevel(i, getLong(zzaDh.zzaIE), getLong(zzaDh.zzaIG));; paramDataHolder = paramString)
    {
      zzaCS = new PlayerLevelInfo(getLong(zzaDh.zzaIB), getLong(zzaDh.zzaIH), paramString, paramDataHolder);
      return;
      zzaCS = null;
      return;
    }
  }
  
  private boolean zzvJ()
  {
    if (zzcB(zzaDh.zzaIB)) {}
    while (getLong(zzaDh.zzaIB) == -1L) {
      return false;
    }
    return true;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return PlayerEntity.zza(this, paramObject);
  }
  
  public final Player freeze()
  {
    return new PlayerEntity(this);
  }
  
  public final Uri getBannerImageLandscapeUri()
  {
    return zzcA(zzaDh.zzaIS);
  }
  
  public final String getBannerImageLandscapeUrl()
  {
    return getString(zzaDh.zzaIT);
  }
  
  public final Uri getBannerImagePortraitUri()
  {
    return zzcA(zzaDh.zzaIU);
  }
  
  public final String getBannerImagePortraitUrl()
  {
    return getString(zzaDh.zzaIV);
  }
  
  public final String getDisplayName()
  {
    return getString(zzaDh.zzaIt);
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza(zzaDh.zzaIt, paramCharArrayBuffer);
  }
  
  public final Uri getHiResImageUri()
  {
    return zzcA(zzaDh.zzaIw);
  }
  
  public final String getHiResImageUrl()
  {
    return getString(zzaDh.zzaIx);
  }
  
  public final Uri getIconImageUri()
  {
    return zzcA(zzaDh.zzaIu);
  }
  
  public final String getIconImageUrl()
  {
    return getString(zzaDh.zzaIv);
  }
  
  public final long getLastPlayedWithTimestamp()
  {
    if ((!zzcz(zzaDh.zzaIA)) || (zzcB(zzaDh.zzaIA))) {
      return -1L;
    }
    return getLong(zzaDh.zzaIA);
  }
  
  public final PlayerLevelInfo getLevelInfo()
  {
    return zzaCS;
  }
  
  public final String getName()
  {
    return getString(zzaDh.name);
  }
  
  public final String getPlayerId()
  {
    return getString(zzaDh.zzaIs);
  }
  
  public final long getRetrievedTimestamp()
  {
    return getLong(zzaDh.zzaIy);
  }
  
  public final String getTitle()
  {
    return getString(zzaDh.title);
  }
  
  public final void getTitle(CharArrayBuffer paramCharArrayBuffer)
  {
    zza(zzaDh.title, paramCharArrayBuffer);
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
    return PlayerEntity.zzb(this);
  }
  
  public final String toString()
  {
    return PlayerEntity.zzc(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((PlayerEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
  
  public final String zzvE()
  {
    return getString(zzaDh.zzaIR);
  }
  
  public final boolean zzvF()
  {
    return getBoolean(zzaDh.zzaIQ);
  }
  
  public final int zzvG()
  {
    return getInteger(zzaDh.zzaIz);
  }
  
  public final boolean zzvH()
  {
    return getBoolean(zzaDh.zzaIJ);
  }
  
  public final MostRecentGameInfo zzvI()
  {
    if (zzcB(zzaDh.zzaIK)) {
      return null;
    }
    return zzaDi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.PlayerRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */