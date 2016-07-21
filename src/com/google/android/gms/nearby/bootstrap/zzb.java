package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(Device paramDevice, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 1, paramDevice.getName(), false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, versionCode);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, paramDevice.getDescription(), false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, paramDevice.getDeviceId(), false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, paramDevice.zzEb());
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, paramInt);
  }
  
  public Device zzfP(Parcel paramParcel)
  {
    byte b = 0;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    String str2 = null;
    String str3 = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        str3 = zza.zzp(paramParcel, k);
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
        b = zza.zze(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new Device(i, str3, str2, str1, b);
  }
  
  public Device[] zziL(int paramInt)
  {
    return new Device[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.bootstrap.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */