package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnFetchThumbnailResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbb();
  final int mVersionCode;
  final ParcelFileDescriptor zzasr;
  
  OnFetchThumbnailResponse(int paramInt, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    mVersionCode = paramInt;
    zzasr = paramParcelFileDescriptor;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbb.zza(this, paramParcel, paramInt | 0x1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnFetchThumbnailResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */