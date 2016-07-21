package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class GameBadgeRef
  extends zzc
  implements GameBadge
{
  public GameBadgeRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return GameBadgeEntity.zza(this, paramObject);
  }
  
  public final String getDescription()
  {
    return getString("badge_description");
  }
  
  public final Uri getIconImageUri()
  {
    return zzcA("badge_icon_image_uri");
  }
  
  public final String getTitle()
  {
    return getString("badge_title");
  }
  
  public final int getType()
  {
    return getInteger("badge_type");
  }
  
  public final int hashCode()
  {
    return GameBadgeEntity.zza(this);
  }
  
  public final String toString()
  {
    return GameBadgeEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((GameBadgeEntity)zzxm()).writeToParcel(paramParcel, paramInt);
  }
  
  public final GameBadge zzxm()
  {
    return new GameBadgeEntity(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.game.GameBadgeRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */