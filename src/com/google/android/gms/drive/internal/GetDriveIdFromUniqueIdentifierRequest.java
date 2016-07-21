package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetDriveIdFromUniqueIdentifierRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzai();
  final int mVersionCode;
  final String zzaoZ;
  final boolean zzarM;
  
  GetDriveIdFromUniqueIdentifierRequest(int paramInt, String paramString, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzaoZ = paramString;
    zzarM = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzai.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */