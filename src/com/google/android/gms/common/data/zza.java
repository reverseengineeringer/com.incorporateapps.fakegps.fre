package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(BitmapTeleporter paramBitmapTeleporter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzIq, paramInt, false);
    zzb.zzc(paramParcel, 3, zzabB);
    zzb.zzI(paramParcel, i);
  }
  
  public BitmapTeleporter zzaj(Parcel paramParcel)
  {
    int k = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    ParcelFileDescriptor localParcelFileDescriptor = null;
    int i = 0;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzca(m))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        localParcelFileDescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, ParcelFileDescriptor.CREATOR);
        break;
      case 3: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new BitmapTeleporter(i, localParcelFileDescriptor, j);
  }
  
  public BitmapTeleporter[] zzbE(int paramInt)
  {
    return new BitmapTeleporter[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.data.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */