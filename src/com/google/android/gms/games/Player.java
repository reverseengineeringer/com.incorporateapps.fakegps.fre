package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;

public abstract interface Player
  extends Parcelable, Freezable
{
  public static final long CURRENT_XP_UNKNOWN = -1L;
  public static final long TIMESTAMP_UNKNOWN = -1L;
  
  public abstract Uri getBannerImageLandscapeUri();
  
  public abstract String getBannerImageLandscapeUrl();
  
  public abstract Uri getBannerImagePortraitUri();
  
  public abstract String getBannerImagePortraitUrl();
  
  public abstract String getDisplayName();
  
  public abstract void getDisplayName(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract Uri getHiResImageUri();
  
  public abstract String getHiResImageUrl();
  
  public abstract Uri getIconImageUri();
  
  public abstract String getIconImageUrl();
  
  public abstract long getLastPlayedWithTimestamp();
  
  public abstract PlayerLevelInfo getLevelInfo();
  
  public abstract String getName();
  
  public abstract String getPlayerId();
  
  public abstract long getRetrievedTimestamp();
  
  public abstract String getTitle();
  
  public abstract void getTitle(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract boolean hasHiResImage();
  
  public abstract boolean hasIconImage();
  
  public abstract String zzvE();
  
  public abstract boolean zzvF();
  
  public abstract int zzvG();
  
  public abstract boolean zzvH();
  
  public abstract MostRecentGameInfo zzvI();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.Player
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */