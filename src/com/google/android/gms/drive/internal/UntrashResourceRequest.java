package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UntrashResourceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbz();
  final int mVersionCode;
  final DriveId zzaqj;
  
  UntrashResourceRequest(int paramInt, DriveId paramDriveId)
  {
    mVersionCode = paramInt;
    zzaqj = paramDriveId;
  }
  
  public UntrashResourceRequest(DriveId paramDriveId)
  {
    this(1, paramDriveId);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbz.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.UntrashResourceRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */