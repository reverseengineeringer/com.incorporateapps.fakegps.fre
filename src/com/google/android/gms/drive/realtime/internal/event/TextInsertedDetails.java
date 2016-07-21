package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class TextInsertedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzg();
  final int mIndex;
  final int mVersionCode;
  final int zzavn;
  
  TextInsertedDetails(int paramInt1, int paramInt2, int paramInt3)
  {
    mVersionCode = paramInt1;
    mIndex = paramInt2;
    zzavn = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.TextInsertedDetails
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */