package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class NearbyDeviceFilter
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzg();
  final int mVersionCode;
  final int zzbci;
  final byte[] zzbcj;
  final boolean zzbck;
  
  NearbyDeviceFilter(int paramInt1, int paramInt2, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    mVersionCode = paramInt1;
    zzbci = paramInt2;
    zzbcj = paramArrayOfByte;
    zzbck = paramBoolean;
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
 * Qualified Name:     com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */