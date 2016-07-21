package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(PointOfInterest paramPointOfInterest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramPointOfInterest.getVersionCode());
    zzb.zza(paramParcel, 2, zzaTG, paramInt, false);
    zzb.zza(paramParcel, 3, zzaTH, false);
    zzb.zza(paramParcel, 4, name, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PointOfInterest zzfB(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    String str1 = null;
    LatLng localLatLng = null;
    int i = 0;
    String str2 = null;
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
        localLatLng = (LatLng)zza.zza(paramParcel, k, LatLng.CREATOR);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new PointOfInterest(i, localLatLng, str1, str2);
  }
  
  public PointOfInterest[] zzip(int paramInt)
  {
    return new PointOfInterest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */