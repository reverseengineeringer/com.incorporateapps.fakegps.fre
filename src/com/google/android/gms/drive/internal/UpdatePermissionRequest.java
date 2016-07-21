package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UpdatePermissionRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzcb();
  final int mVersionCode;
  final String zzaoV;
  final DriveId zzaoz;
  final String zzapk;
  final boolean zzaqd;
  final int zzasE;
  
  UpdatePermissionRequest(int paramInt1, DriveId paramDriveId, String paramString1, int paramInt2, boolean paramBoolean, String paramString2)
  {
    mVersionCode = paramInt1;
    zzaoz = paramDriveId;
    zzapk = paramString1;
    zzasE = paramInt2;
    zzaqd = paramBoolean;
    zzaoV = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzcb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.UpdatePermissionRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */