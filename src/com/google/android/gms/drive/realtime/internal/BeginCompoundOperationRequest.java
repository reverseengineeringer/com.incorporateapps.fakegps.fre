package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class BeginCompoundOperationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  final String mName;
  final int mVersionCode;
  final boolean zzauG;
  final boolean zzauH;
  
  BeginCompoundOperationRequest(int paramInt, boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    mVersionCode = paramInt;
    zzauG = paramBoolean1;
    mName = paramString;
    zzauH = paramBoolean2;
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
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.BeginCompoundOperationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */