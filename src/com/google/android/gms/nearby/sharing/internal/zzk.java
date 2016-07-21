package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk
  implements Parcelable.Creator
{
  static void zza(TrustedDevicesRequest paramTrustedDevicesRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zza(paramParcel, 2, zzbdq, false);
    zzb.zza(paramParcel, 3, zzbdr, false);
    zzb.zza(paramParcel, 4, paramTrustedDevicesRequest.zzED(), false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public TrustedDevicesRequest zzgx(Parcel paramParcel)
  {
    IBinder localIBinder = null;
    int j = zza.zzau(paramParcel);
    String str = null;
    int i = 0;
    byte[] arrayOfByte = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        arrayOfByte = zza.zzs(paramParcel, k);
        break;
      case 4: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new TrustedDevicesRequest(i, str, arrayOfByte, localIBinder);
  }
  
  public TrustedDevicesRequest[] zzjD(int paramInt)
  {
    return new TrustedDevicesRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.internal.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */