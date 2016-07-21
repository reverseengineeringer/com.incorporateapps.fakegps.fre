package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class StopProvidingContentRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzj();
  final int versionCode;
  public long zzbdn;
  public zzc zzbdo;
  
  StopProvidingContentRequest()
  {
    versionCode = 1;
  }
  
  StopProvidingContentRequest(int paramInt, long paramLong, IBinder paramIBinder)
  {
    versionCode = paramInt;
    zzbdn = paramLong;
    zzbdo = zzc.zza.zzdH(paramIBinder);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  final IBinder zzED()
  {
    return zzbdo.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.internal.StopProvidingContentRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */