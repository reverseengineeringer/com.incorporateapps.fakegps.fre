package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class StreamContentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbv();
  final int mVersionCode;
  final DriveId zzaqj;
  
  StreamContentsRequest(int paramInt, DriveId paramDriveId)
  {
    mVersionCode = paramInt;
    zzaqj = paramDriveId;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbv.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.StreamContentsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */