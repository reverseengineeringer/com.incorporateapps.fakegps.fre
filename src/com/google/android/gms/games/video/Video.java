package com.google.android.gms.games.video;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface Video
  extends Parcelable, Freezable
{
  public abstract int getDuration();
  
  public abstract long getFileSize();
  
  public abstract String getPackageName();
  
  public abstract long getStartTime();
  
  public abstract String zzxX();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.video.Video
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */