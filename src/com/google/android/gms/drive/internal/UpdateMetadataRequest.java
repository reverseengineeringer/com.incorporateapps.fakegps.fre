package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class UpdateMetadataRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzca();
  final int mVersionCode;
  final DriveId zzaqj;
  final MetadataBundle zzaqk;
  
  UpdateMetadataRequest(int paramInt, DriveId paramDriveId, MetadataBundle paramMetadataBundle)
  {
    mVersionCode = paramInt;
    zzaqj = paramDriveId;
    zzaqk = paramMetadataBundle;
  }
  
  public UpdateMetadataRequest(DriveId paramDriveId, MetadataBundle paramMetadataBundle)
  {
    this(1, paramDriveId, paramMetadataBundle);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzca.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.UpdateMetadataRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */