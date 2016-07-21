package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetMetadataRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzaj();
  final int mVersionCode;
  final DriveId zzaqj;
  final boolean zzarN;
  
  GetMetadataRequest(int paramInt, DriveId paramDriveId, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzaqj = paramDriveId;
    zzarN = paramBoolean;
  }
  
  public GetMetadataRequest(DriveId paramDriveId, boolean paramBoolean)
  {
    this(1, paramDriveId, paramBoolean);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaj.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.GetMetadataRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */