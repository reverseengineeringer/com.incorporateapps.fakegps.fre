package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class GameRef
  extends zzc
  implements Game
{
  public GameRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final boolean areSnapshotsEnabled()
  {
    return getInteger("snapshots_enabled") > 0;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return GameEntity.zza(this, paramObject);
  }
  
  public final Game freeze()
  {
    return new GameEntity(this);
  }
  
  public final int getAchievementTotalCount()
  {
    return getInteger("achievement_total_count");
  }
  
  public final String getApplicationId()
  {
    return getString("external_game_id");
  }
  
  public final String getDescription()
  {
    return getString("game_description");
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("game_description", paramCharArrayBuffer);
  }
  
  public final String getDeveloperName()
  {
    return getString("developer_name");
  }
  
  public final void getDeveloperName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("developer_name", paramCharArrayBuffer);
  }
  
  public final String getDisplayName()
  {
    return getString("display_name");
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("display_name", paramCharArrayBuffer);
  }
  
  public final Uri getFeaturedImageUri()
  {
    return zzcA("featured_image_uri");
  }
  
  public final String getFeaturedImageUrl()
  {
    return getString("featured_image_url");
  }
  
  public final Uri getHiResImageUri()
  {
    return zzcA("game_hi_res_image_uri");
  }
  
  public final String getHiResImageUrl()
  {
    return getString("game_hi_res_image_url");
  }
  
  public final Uri getIconImageUri()
  {
    return zzcA("game_icon_image_uri");
  }
  
  public final String getIconImageUrl()
  {
    return getString("game_icon_image_url");
  }
  
  public final int getLeaderboardCount()
  {
    return getInteger("leaderboard_count");
  }
  
  public final String getPrimaryCategory()
  {
    return getString("primary_category");
  }
  
  public final String getSecondaryCategory()
  {
    return getString("secondary_category");
  }
  
  public final String getThemeColor()
  {
    return getString("theme_color");
  }
  
  public final boolean hasGamepadSupport()
  {
    return getInteger("gamepad_support") > 0;
  }
  
  public final int hashCode()
  {
    return GameEntity.zza(this);
  }
  
  public final boolean isMuted()
  {
    return getBoolean("muted");
  }
  
  public final boolean isRealTimeMultiplayerEnabled()
  {
    return getInteger("real_time_support") > 0;
  }
  
  public final boolean isTurnBasedMultiplayerEnabled()
  {
    return getInteger("turn_based_support") > 0;
  }
  
  public final String toString()
  {
    return GameEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((GameEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
  
  public final String zzvA()
  {
    return getString("package_name");
  }
  
  public final int zzvB()
  {
    return getInteger("gameplay_acl_status");
  }
  
  public final boolean zzvx()
  {
    return getBoolean("play_enabled_game");
  }
  
  public final boolean zzvy()
  {
    return getBoolean("identity_sharing_confirmed");
  }
  
  public final boolean zzvz()
  {
    return getInteger("installed") > 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.GameRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */