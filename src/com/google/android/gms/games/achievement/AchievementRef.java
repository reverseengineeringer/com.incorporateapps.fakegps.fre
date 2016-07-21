package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class AchievementRef
  extends zzc
  implements Achievement
{
  AchievementRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final Achievement freeze()
  {
    return new AchievementEntity(this);
  }
  
  public final String getAchievementId()
  {
    return getString("external_achievement_id");
  }
  
  public final int getCurrentSteps()
  {
    boolean bool = true;
    if (getType() == 1) {}
    for (;;)
    {
      zzb.zzab(bool);
      return getInteger("current_steps");
      bool = false;
    }
  }
  
  public final String getDescription()
  {
    return getString("description");
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("description", paramCharArrayBuffer);
  }
  
  public final String getFormattedCurrentSteps()
  {
    boolean bool = true;
    if (getType() == 1) {}
    for (;;)
    {
      zzb.zzab(bool);
      return getString("formatted_current_steps");
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
      zza("formatted_current_steps", paramCharArrayBuffer);
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
      return getString("formatted_total_steps");
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
      zza("formatted_total_steps", paramCharArrayBuffer);
      return;
      bool = false;
    }
  }
  
  public final long getLastUpdatedTimestamp()
  {
    return getLong("last_updated_timestamp");
  }
  
  public final String getName()
  {
    return getString("name");
  }
  
  public final void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("name", paramCharArrayBuffer);
  }
  
  public final Player getPlayer()
  {
    return new PlayerRef(zzahi, zzaje);
  }
  
  public final Uri getRevealedImageUri()
  {
    return zzcA("revealed_icon_image_uri");
  }
  
  public final String getRevealedImageUrl()
  {
    return getString("revealed_icon_image_url");
  }
  
  public final int getState()
  {
    return getInteger("state");
  }
  
  public final int getTotalSteps()
  {
    boolean bool = true;
    if (getType() == 1) {}
    for (;;)
    {
      zzb.zzab(bool);
      return getInteger("total_steps");
      bool = false;
    }
  }
  
  public final int getType()
  {
    return getInteger("type");
  }
  
  public final Uri getUnlockedImageUri()
  {
    return zzcA("unlocked_icon_image_uri");
  }
  
  public final String getUnlockedImageUrl()
  {
    return getString("unlocked_icon_image_url");
  }
  
  public final long getXpValue()
  {
    if ((!zzcz("instance_xp_value")) || (zzcB("instance_xp_value"))) {
      return getLong("definition_xp_value");
    }
    return getLong("instance_xp_value");
  }
  
  public final String toString()
  {
    return AchievementEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AchievementEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.achievement.AchievementRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */