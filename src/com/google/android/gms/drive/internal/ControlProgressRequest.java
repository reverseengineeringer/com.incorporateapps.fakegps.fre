package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class ControlProgressRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzj();
  final int mVersionCode;
  final DriveId zzaoz;
  final int zzaqq;
  final int zzaqr;
  final ParcelableTransferPreferences zzaqs;
  
  ControlProgressRequest(int paramInt1, int paramInt2, int paramInt3, DriveId paramDriveId, ParcelableTransferPreferences paramParcelableTransferPreferences)
  {
    mVersionCode = paramInt1;
    zzaqq = paramInt2;
    zzaqr = paramInt3;
    zzaoz = paramDriveId;
    zzaqs = paramParcelableTransferPreferences;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.ControlProgressRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */