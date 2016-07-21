package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ParcelableChangeInfo
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzp();
  final int mVersionCode;
  final long zzaez;
  final List zzpH;
  
  ParcelableChangeInfo(int paramInt, long paramLong, List paramList)
  {
    mVersionCode = paramInt;
    zzaez = paramLong;
    zzpH = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */