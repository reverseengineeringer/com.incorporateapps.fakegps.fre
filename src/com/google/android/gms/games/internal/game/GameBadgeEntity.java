package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameBadgeEntity
  extends GamesDowngradeableSafeParcel
  implements GameBadge
{
  public static final GameBadgeEntityCreator CREATOR = new GameBadgeEntity.GameBadgeEntityCreatorCompat();
  private final int mVersionCode;
  private Uri zzaCd;
  private int zzabB;
  private String zzapg;
  private String zzaxl;
  
  GameBadgeEntity(int paramInt1, int paramInt2, String paramString1, String paramString2, Uri paramUri)
  {
    mVersionCode = paramInt1;
    zzabB = paramInt2;
    zzapg = paramString1;
    zzaxl = paramString2;
    zzaCd = paramUri;
  }
  
  public GameBadgeEntity(GameBadge paramGameBadge)
  {
    mVersionCode = 1;
    zzabB = paramGameBadge.getType();
    zzapg = paramGameBadge.getTitle();
    zzaxl = paramGameBadge.getDescription();
    zzaCd = paramGameBadge.getIconImageUri();
  }
  
  static int zza(GameBadge paramGameBadge)
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(paramGameBadge.getType()), paramGameBadge.getTitle(), paramGameBadge.getDescription(), paramGameBadge.getIconImageUri() });
  }
  
  static boolean zza(GameBadge paramGameBadge, Object paramObject)
  {
    if (!(paramObject instanceof GameBadge)) {}
    do
    {
      return false;
      if (paramGameBadge == paramObject) {
        return true;
      }
      paramObject = (GameBadge)paramObject;
    } while ((!zzw.equal(Integer.valueOf(((GameBadge)paramObject).getType()), paramGameBadge.getTitle())) || (!zzw.equal(((GameBadge)paramObject).getDescription(), paramGameBadge.getIconImageUri())));
    return true;
  }
  
  static String zzb(GameBadge paramGameBadge)
  {
    return zzw.zzy(paramGameBadge).zzg("Type", Integer.valueOf(paramGameBadge.getType())).zzg("Title", paramGameBadge.getTitle()).zzg("Description", paramGameBadge.getDescription()).zzg("IconImageUri", paramGameBadge.getIconImageUri()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final Uri getIconImageUri()
  {
    return zzaCd;
  }
  
  public final String getTitle()
  {
    return zzapg;
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
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!zzqC())
    {
      GameBadgeEntityCreator.zza(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeInt(zzabB);
    paramParcel.writeString(zzapg);
    paramParcel.writeString(zzaxl);
    if (zzaCd == null) {}
    for (String str = null;; str = zzaCd.toString())
    {
      paramParcel.writeString(str);
      return;
    }
  }
  
  public final GameBadge zzxm()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.game.GameBadgeEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */