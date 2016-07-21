package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetPermissionsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzal();
  final int mVersionCode;
  final List zzarO;
  final int zzzw;
  
  GetPermissionsResponse(int paramInt1, List paramList, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzarO = paramList;
    zzzw = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzal.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.GetPermissionsResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */