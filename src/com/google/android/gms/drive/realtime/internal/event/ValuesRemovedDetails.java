package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesRemovedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzj();
  final int mIndex;
  final int mVersionCode;
  final int zzauP;
  final int zzauQ;
  final String zzavq;
  final int zzavr;
  
  ValuesRemovedDetails(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5)
  {
    mVersionCode = paramInt1;
    mIndex = paramInt2;
    zzauP = paramInt3;
    zzauQ = paramInt4;
    zzavq = paramString;
    zzavr = paramInt5;
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
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.ValuesRemovedDetails
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */