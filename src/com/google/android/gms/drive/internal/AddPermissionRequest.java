package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

public class AddPermissionRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  final int mVersionCode;
  final String zzaoV;
  final DriveId zzaoz;
  final Permission zzaqa;
  final boolean zzaqb;
  final String zzaqc;
  final boolean zzaqd;
  
  AddPermissionRequest(int paramInt, DriveId paramDriveId, Permission paramPermission, boolean paramBoolean1, String paramString1, boolean paramBoolean2, String paramString2)
  {
    mVersionCode = paramInt;
    zzaoz = paramDriveId;
    zzaqa = paramPermission;
    zzaqb = paramBoolean1;
    zzaqc = paramString1;
    zzaqd = paramBoolean2;
    zzaoV = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.AddPermissionRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */