package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class SetResourceParentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbt();
  final int mVersionCode;
  final DriveId zzaqf;
  final List zzasC;
  
  SetResourceParentsRequest(int paramInt, DriveId paramDriveId, List paramList)
  {
    mVersionCode = paramInt;
    zzaqf = paramDriveId;
    zzasC = paramList;
  }
  
  public SetResourceParentsRequest(DriveId paramDriveId, List paramList)
  {
    this(1, paramDriveId, paramList);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbt.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.SetResourceParentsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */