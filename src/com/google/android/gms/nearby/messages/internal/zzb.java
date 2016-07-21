package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(GetPermissionStatusRequest paramGetPermissionStatusRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, mVersionCode);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, paramGetPermissionStatusRequest.zzED(), false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, zzbbF, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, zzbcs, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public GetPermissionStatusRequest zzgh(Parcel paramParcel)
  {
    ClientAppContext localClientAppContext = null;
    int j = zza.zzau(paramParcel);
    IBinder localIBinder = null;
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
      case 1: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 3: 
        str = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localClientAppContext = (ClientAppContext)zza.zza(paramParcel, k, ClientAppContext.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new GetPermissionStatusRequest(i, localIBinder, str, localClientAppContext);
  }
  
  public GetPermissionStatusRequest[] zzjm(int paramInt)
  {
    return new GetPermissionStatusRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */