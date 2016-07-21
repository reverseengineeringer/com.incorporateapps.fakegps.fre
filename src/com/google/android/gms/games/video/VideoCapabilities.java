package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class VideoCapabilities
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new VideoCapabilitiesCreator();
  private final int mVersionCode;
  private final boolean zzaLm;
  private final boolean zzaLn;
  private final boolean zzaLo;
  private final boolean[] zzaLp;
  private final boolean[] zzaLq;
  
  public VideoCapabilities(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    mVersionCode = paramInt;
    zzaLm = paramBoolean1;
    zzaLn = paramBoolean2;
    zzaLo = paramBoolean3;
    zzaLp = paramArrayOfBoolean1;
    zzaLq = paramArrayOfBoolean2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof VideoCapabilities)) {}
    do
    {
      return false;
      if (this == paramObject) {
        return true;
      }
      paramObject = (VideoCapabilities)paramObject;
    } while ((!zzw.equal(((VideoCapabilities)paramObject).zzyb(), zzyb())) || (!zzw.equal(((VideoCapabilities)paramObject).zzyc(), zzyc())) || (!zzw.equal(Boolean.valueOf(((VideoCapabilities)paramObject).zzxZ()), Boolean.valueOf(zzxZ()))) || (!zzw.equal(Boolean.valueOf(((VideoCapabilities)paramObject).zzxY()), Boolean.valueOf(zzxY()))) || (!zzw.equal(Boolean.valueOf(((VideoCapabilities)paramObject).zzya()), Boolean.valueOf(zzya()))));
    return true;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzyb(), zzyc(), Boolean.valueOf(zzxZ()), Boolean.valueOf(zzxY()), Boolean.valueOf(zzya()) });
  }
  
  public final String toString()
  {
    return zzw.zzy(this).zzg("SupportedCaptureModes", zzyb()).zzg("SupportedQualityLevels", zzyc()).zzg("CameraSupported", Boolean.valueOf(zzxZ())).zzg("MicSupported", Boolean.valueOf(zzxY())).zzg("StorageWriteSupported", Boolean.valueOf(zzya())).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    VideoCapabilitiesCreator.zza(this, paramParcel, paramInt);
  }
  
  public final boolean zzxY()
  {
    return zzaLn;
  }
  
  public final boolean zzxZ()
  {
    return zzaLm;
  }
  
  public final boolean zzya()
  {
    return zzaLo;
  }
  
  public final boolean[] zzyb()
  {
    return zzaLp;
  }
  
  public final boolean[] zzyc()
  {
    return zzaLq;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.video.VideoCapabilities
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */