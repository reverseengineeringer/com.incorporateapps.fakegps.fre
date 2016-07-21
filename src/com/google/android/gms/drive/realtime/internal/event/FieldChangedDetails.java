package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FieldChangedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  final int mVersionCode;
  final int zzauO;
  
  FieldChangedDetails(int paramInt1, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzauO = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.FieldChangedDetails
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */