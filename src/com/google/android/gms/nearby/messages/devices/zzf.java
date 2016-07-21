package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(NearbyDevice paramNearbyDevice, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramNearbyDevice.zzEz(), paramInt, false);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, paramNearbyDevice.getUrl(), false);
    zzb.zza(paramParcel, 3, paramNearbyDevice.zzEC(), false);
    zzb.zza(paramParcel, 4, paramNearbyDevice.zzEA(), paramInt, false);
    zzb.zza(paramParcel, 5, paramNearbyDevice.zzEB(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public NearbyDevice zzgd(Parcel paramParcel)
  {
    String[] arrayOfString = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    NearbyDeviceId[] arrayOfNearbyDeviceId = null;
    String str1 = null;
    String str2 = null;
    NearbyDeviceId localNearbyDeviceId = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localNearbyDeviceId = (NearbyDeviceId)zza.zza(paramParcel, k, NearbyDeviceId.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        arrayOfNearbyDeviceId = (NearbyDeviceId[])zza.zzb(paramParcel, k, NearbyDeviceId.CREATOR);
        break;
      case 5: 
        arrayOfString = zza.zzB(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new NearbyDevice(i, localNearbyDeviceId, str2, str1, arrayOfNearbyDeviceId, arrayOfString);
  }
  
  public NearbyDevice[] zzji(int paramInt)
  {
    return new NearbyDevice[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.devices.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */