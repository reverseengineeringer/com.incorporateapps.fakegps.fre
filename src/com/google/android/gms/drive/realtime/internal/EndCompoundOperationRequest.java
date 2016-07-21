package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class EndCompoundOperationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  final int mVersionCode;
  
  public EndCompoundOperationRequest()
  {
    this(1);
  }
  
  EndCompoundOperationRequest(int paramInt)
  {
    mVersionCode = paramInt;
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
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.EndCompoundOperationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */