package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class RemovePermissionRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbq();
  final int mVersionCode;
  final String zzaoV;
  final DriveId zzaoz;
  final String zzapk;
  final boolean zzaqd;
  
  RemovePermissionRequest(int paramInt, DriveId paramDriveId, String paramString1, boolean paramBoolean, String paramString2)
  {
    mVersionCode = paramInt;
    zzaoz = paramDriveId;
    zzapk = paramString1;
    zzaqd = paramBoolean;
    zzaoV = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbq.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.RemovePermissionRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */