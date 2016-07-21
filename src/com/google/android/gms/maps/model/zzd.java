package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(LatLngBounds paramLatLngBounds, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramLatLngBounds.getVersionCode());
    zzb.zza(paramParcel, 2, southwest, paramInt, false);
    zzb.zza(paramParcel, 3, northeast, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LatLngBounds zzfy(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    LatLng localLatLng1 = null;
    int i = 0;
    LatLng localLatLng2 = null;
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
        localLatLng1 = (LatLng)zza.zza(paramParcel, k, LatLng.CREATOR);
        break;
      case 3: 
        localLatLng2 = (LatLng)zza.zza(paramParcel, k, LatLng.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new LatLngBounds(i, localLatLng1, localLatLng2);
  }
  
  public LatLngBounds[] zzim(int paramInt)
  {
    return new LatLngBounds[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */