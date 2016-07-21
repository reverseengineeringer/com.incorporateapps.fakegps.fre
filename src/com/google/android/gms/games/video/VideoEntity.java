package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class VideoEntity
  implements SafeParcelable, Video
{
  public static final Parcelable.Creator CREATOR = new VideoEntityCreator();
  private final int mVersionCode;
  private final long zzCv;
  private final String zzTJ;
  private final String zzaLv;
  private final long zzaLw;
  private final int zzakd;
  
  VideoEntity(int paramInt1, int paramInt2, String paramString1, long paramLong1, long paramLong2, String paramString2)
  {
    mVersionCode = paramInt1;
    zzakd = paramInt2;
    zzaLv = paramString1;
    zzaLw = paramLong1;
    zzCv = paramLong2;
    zzTJ = paramString2;
  }
  
  public VideoEntity(Video paramVideo)
  {
    mVersionCode = 1;
    zzakd = paramVideo.getDuration();
    zzaLv = paramVideo.zzxX();
    zzaLw = paramVideo.getFileSize();
    zzCv = paramVideo.getStartTime();
    zzTJ = paramVideo.getPackageName();
    zzb.zzv(zzaLv);
    zzb.zzv(zzTJ);
  }
  
  static int zza(Video paramVideo)
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(paramVideo.getDuration()), paramVideo.zzxX(), Long.valueOf(paramVideo.getFileSize()), Long.valueOf(paramVideo.getStartTime()), paramVideo.getPackageName() });
  }
  
  static boolean zza(Video paramVideo, Object paramObject)
  {
    if (!(paramObject instanceof Video)) {}
    do
    {
      return false;
      if (paramVideo == paramObject) {
        return true;
      }
      paramObject = (Video)paramObject;
    } while ((!zzw.equal(Integer.valueOf(((Video)paramObject).getDuration()), Integer.valueOf(paramVideo.getDuration()))) || (!zzw.equal(((Video)paramObject).zzxX(), paramVideo.zzxX())) || (!zzw.equal(Long.valueOf(((Video)paramObject).getFileSize()), Long.valueOf(paramVideo.getFileSize()))) || (!zzw.equal(Long.valueOf(((Video)paramObject).getStartTime()), Long.valueOf(paramVideo.getStartTime()))) || (!zzw.equal(((Video)paramObject).getPackageName(), paramVideo.getPackageName())));
    return true;
  }
  
  static String zzb(Video paramVideo)
  {
    return zzw.zzy(paramVideo).zzg("Duration", Integer.valueOf(paramVideo.getDuration())).zzg("File path", paramVideo.zzxX()).zzg("File size", Long.valueOf(paramVideo.getFileSize())).zzg("Start time", Long.valueOf(paramVideo.getStartTime())).zzg("Package name", paramVideo.getPackageName()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final int getDuration()
  {
    return zzakd;
  }
  
  public final long getFileSize()
  {
    return zzaLw;
  }
  
  public final String getPackageName()
  {
    return zzTJ;
  }
  
  public final long getStartTime()
  {
    return zzCv;
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
    VideoEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final String zzxX()
  {
    return zzaLv;
  }
  
  public final Video zzyg()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.video.VideoEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */