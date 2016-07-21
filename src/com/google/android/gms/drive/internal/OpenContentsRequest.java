package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenContentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbk();
  final int mVersionCode;
  final int zzaoy;
  final DriveId zzaqj;
  final int zzasx;
  
  OpenContentsRequest(int paramInt1, DriveId paramDriveId, int paramInt2, int paramInt3)
  {
    mVersionCode = paramInt1;
    zzaqj = paramDriveId;
    zzaoy = paramInt2;
    zzasx = paramInt3;
  }
  
  public OpenContentsRequest(DriveId paramDriveId, int paramInt1, int paramInt2)
  {
    this(1, paramDriveId, paramInt1, paramInt2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbk.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OpenContentsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */