package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class ChangeResourceParentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  final int mVersionCode;
  final DriveId zzaqf;
  final List zzaqg;
  final List zzaqh;
  
  ChangeResourceParentsRequest(int paramInt, DriveId paramDriveId, List paramList1, List paramList2)
  {
    mVersionCode = paramInt;
    zzaqf = paramDriveId;
    zzaqg = paramList1;
    zzaqh = paramList2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.ChangeResourceParentsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */