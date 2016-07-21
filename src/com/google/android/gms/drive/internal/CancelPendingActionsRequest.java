package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CancelPendingActionsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  final int mVersionCode;
  final List zzapG;
  
  CancelPendingActionsRequest(int paramInt, List paramList)
  {
    mVersionCode = paramInt;
    zzapG = paramList;
  }
  
  public CancelPendingActionsRequest(List paramList)
  {
    this(1, paramList);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.CancelPendingActionsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */