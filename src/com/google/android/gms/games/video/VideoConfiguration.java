package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class VideoConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new VideoConfigurationCreator();
  private final int mVersionCode;
  private final int zzaLr;
  private final int zzaLs;
  private final String zzaLt;
  private final String zzaLu;
  
  public VideoConfiguration(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    mVersionCode = paramInt1;
    zzx.zzac(zzgZ(paramInt2));
    zzx.zzac(zzha(paramInt3));
    zzaLr = paramInt2;
    zzaLs = paramInt3;
    if (paramInt3 == 1)
    {
      zzaLu = paramString2;
      zzaLt = paramString1;
      return;
    }
    if (paramString2 == null)
    {
      bool1 = true;
      zzx.zzb(bool1, "Stream key should be null when not streaming");
      if (paramString1 != null) {
        break label102;
      }
    }
    label102:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "Stream url should be null when not streaming");
      zzaLu = null;
      zzaLt = null;
      return;
      bool1 = false;
      break;
    }
  }
  
  public static boolean zzgZ(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean zzha(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getStreamUrl()
  {
    return zzaLt;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    VideoConfigurationCreator.zza(this, paramParcel, paramInt);
  }
  
  public final int zzyd()
  {
    return zzaLr;
  }
  
  public final int zzye()
  {
    return zzaLs;
  }
  
  public final String zzyf()
  {
    return zzaLu;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.video.VideoConfiguration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */