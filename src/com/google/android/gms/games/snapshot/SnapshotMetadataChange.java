package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import com.google.android.gms.common.data.BitmapTeleporter;

public abstract class SnapshotMetadataChange
{
  public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChangeEntity();
  
  public abstract Bitmap getCoverImage();
  
  public abstract String getDescription();
  
  public abstract Long getPlayedTimeMillis();
  
  public abstract Long getProgressValue();
  
  public abstract BitmapTeleporter zzxU();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotMetadataChange
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */