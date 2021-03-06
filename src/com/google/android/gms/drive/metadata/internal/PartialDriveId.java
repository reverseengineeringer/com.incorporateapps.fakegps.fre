package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class PartialDriveId
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzn();
  final int mVersionCode;
  final String zzaoL;
  final long zzaoM;
  final int zzaoN;
  
  PartialDriveId(int paramInt1, String paramString, long paramLong, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzaoL = paramString;
    zzaoM = paramLong;
    zzaoN = paramInt2;
  }
  
  public PartialDriveId(String paramString, long paramLong, int paramInt)
  {
    this(1, paramString, paramLong, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
  
  public DriveId zzE(long paramLong)
  {
    return new DriveId(zzaoL, zzaoM, paramLong, zzaoN);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.PartialDriveId
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */