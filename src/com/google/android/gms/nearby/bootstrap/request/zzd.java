package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.bootstrap.Device;

public class zzd
  implements Parcelable.Creator
{
  static void zza(DisconnectRequest paramDisconnectRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramDisconnectRequest.zzEd(), paramInt, false);
    zzb.zzc(paramParcel, 1000, versionCode);
    zzb.zza(paramParcel, 2, paramDisconnectRequest.getCallbackBinder(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public DisconnectRequest zzfT(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Device localDevice = null;
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
        localDevice = (Device)zza.zza(paramParcel, k, Device.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new DisconnectRequest(i, localDevice, localIBinder);
  }
  
  public DisconnectRequest[] zziP(int paramInt)
  {
    return new DisconnectRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.bootstrap.request.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */