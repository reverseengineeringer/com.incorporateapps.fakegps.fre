package com.google.android.gms.games.video;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class VideoRef
  extends zzc
  implements Video
{
  VideoRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getDuration()
  {
    return getInteger("duration");
  }
  
  public final long getFileSize()
  {
    return getLong("filesize");
  }
  
  public final String getPackageName()
  {
    return getString("package");
  }
  
  public final long getStartTime()
  {
    return getLong("start_time");
  }
  
  public final String toString()
  {
    return VideoEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((VideoEntity)zzyg()).writeToParcel(paramParcel, paramInt);
  }
  
  public final String zzxX()
  {
    return getString("filepath");
  }
  
  public final Video zzyg()
  {
    return new VideoEntity(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.video.VideoRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */