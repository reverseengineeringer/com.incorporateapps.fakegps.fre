package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.ArrayList;

public class zza
  implements Parcelable.Creator
{
  static void zza(BleDevicesResult paramBleDevicesResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramBleDevicesResult.getClaimedBleDevices(), false);
    zzb.zzc(paramParcel, 1000, paramBleDevicesResult.getVersionCode());
    zzb.zza(paramParcel, 2, paramBleDevicesResult.getStatus(), paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public BleDevicesResult zzdN(Parcel paramParcel)
  {
    Status localStatus = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int i = 0;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzca(k))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        localArrayList = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k, BleDevice.CREATOR);
        break;
      case 1000: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        localStatus = (Status)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, Status.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new BleDevicesResult(i, localArrayList, localStatus);
  }
  
  public BleDevicesResult[] zzfO(int paramInt)
  {
    return new BleDevicesResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */