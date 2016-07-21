package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetPermissionsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzak();
  final int mVersionCode;
  final DriveId zzaoz;
  
  GetPermissionsRequest(int paramInt, DriveId paramDriveId)
  {
    mVersionCode = paramInt;
    zzaoz = paramDriveId;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzak.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.GetPermissionsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */