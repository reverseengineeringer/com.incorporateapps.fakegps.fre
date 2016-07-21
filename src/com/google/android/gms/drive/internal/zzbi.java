package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbi
  implements Parcelable.Creator
{
  static void zza(OnStartStreamSession paramOnStartStreamSession, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzasv, paramInt, false);
    zzb.zza(paramParcel, 3, zzasw, false);
    zzb.zza(paramParcel, 4, zzsU, false);
    zzb.zzI(paramParcel, i);
  }
  
  public OnStartStreamSession zzbL(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    IBinder localIBinder = null;
    ParcelFileDescriptor localParcelFileDescriptor = null;
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
        localParcelFileDescriptor = (ParcelFileDescriptor)zza.zza(paramParcel, k, ParcelFileDescriptor.CREATOR);
        break;
      case 3: 
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 4: 
        str = zza.zzp(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new OnStartStreamSession(i, localParcelFileDescriptor, localIBinder, str);
  }
  
  public OnStartStreamSession[] zzdG(int paramInt)
  {
    return new OnStartStreamSession[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzbi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */