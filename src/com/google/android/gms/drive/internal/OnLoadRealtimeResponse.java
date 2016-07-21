package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnLoadRealtimeResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbg();
  final int mVersionCode;
  final boolean zzqA;
  
  OnLoadRealtimeResponse(int paramInt, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzqA = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbg.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnLoadRealtimeResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */