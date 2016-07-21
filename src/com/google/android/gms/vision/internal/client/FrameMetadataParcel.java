package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.Frame.Metadata;

public class FrameMetadataParcel
  implements SafeParcelable
{
  public static final zza CREATOR = new zza();
  public int height;
  public int id;
  public int rotation;
  final int versionCode;
  public int width;
  public long zzboe;
  
  public FrameMetadataParcel()
  {
    versionCode = 1;
  }
  
  public FrameMetadataParcel(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, int paramInt5)
  {
    versionCode = paramInt1;
    width = paramInt2;
    height = paramInt3;
    id = paramInt4;
    zzboe = paramLong;
    rotation = paramInt5;
  }
  
  public static FrameMetadataParcel zzc(Frame paramFrame)
  {
    FrameMetadataParcel localFrameMetadataParcel = new FrameMetadataParcel();
    width = paramFrame.getMetadata().getWidth();
    height = paramFrame.getMetadata().getHeight();
    rotation = paramFrame.getMetadata().getRotation();
    id = paramFrame.getMetadata().getId();
    zzboe = paramFrame.getMetadata().getTimestampMillis();
    return localFrameMetadataParcel;
  }
  
  public int describeContents()
  {
    zza localzza = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza localzza = CREATOR;
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.internal.client.FrameMetadataParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */