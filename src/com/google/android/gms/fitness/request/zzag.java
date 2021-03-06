package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzag
  implements Parcelable.Creator
{
  static void zza(UnclaimBleDeviceRequest paramUnclaimBleDeviceRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1000, paramUnclaimBleDeviceRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramUnclaimBleDeviceRequest.getDeviceAddress(), false);
    zzb.zza(paramParcel, 3, paramUnclaimBleDeviceRequest.getCallbackBinder(), false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public UnclaimBleDeviceRequest zzdL(Parcel paramParcel)
  {
    IBinder localIBinder = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    String str = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new UnclaimBleDeviceRequest(i, str, localIBinder);
  }
  
  public UnclaimBleDeviceRequest[] zzfM(int paramInt)
  {
    return new UnclaimBleDeviceRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */