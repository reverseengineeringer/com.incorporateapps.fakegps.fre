package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.fitness.data.BleDevice;

public class zzb
  implements Parcelable.Creator
{
  static void zza(ClaimBleDeviceRequest paramClaimBleDeviceRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 1, paramClaimBleDeviceRequest.getDeviceAddress(), false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, paramClaimBleDeviceRequest.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, paramClaimBleDeviceRequest.zzuK(), paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, paramClaimBleDeviceRequest.getCallbackBinder(), false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public ClaimBleDeviceRequest zzdh(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    BleDevice localBleDevice = null;
    String str = null;
    int i = 0;
    IBinder localIBinder = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        str = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localBleDevice = (BleDevice)zza.zza(paramParcel, k, BleDevice.CREATOR);
        break;
      case 3: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new ClaimBleDeviceRequest(i, str, localBleDevice, localIBinder);
  }
  
  public ClaimBleDeviceRequest[] zzfh(int paramInt)
  {
    return new ClaimBleDeviceRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */