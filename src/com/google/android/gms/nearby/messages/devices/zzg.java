package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(NearbyDeviceFilter paramNearbyDeviceFilter, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, zzbci);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, zzbcj, false);
    zzb.zza(paramParcel, 3, zzbck);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public NearbyDeviceFilter zzge(Parcel paramParcel)
  {
    boolean bool = false;
    int k = zza.zzau(paramParcel);
    byte[] arrayOfByte = null;
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = zza.zzg(paramParcel, m);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        arrayOfByte = zza.zzs(paramParcel, m);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new NearbyDeviceFilter(i, j, arrayOfByte, bool);
  }
  
  public NearbyDeviceFilter[] zzjj(int paramInt)
  {
    return new NearbyDeviceFilter[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.devices.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */