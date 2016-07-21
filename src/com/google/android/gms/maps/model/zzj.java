package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(StreetViewPanoramaCamera paramStreetViewPanoramaCamera, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramStreetViewPanoramaCamera.getVersionCode());
    zzb.zza(paramParcel, 2, zoom);
    zzb.zza(paramParcel, 3, tilt);
    zzb.zza(paramParcel, 4, bearing);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public StreetViewPanoramaCamera zzfE(Parcel paramParcel)
  {
    float f3 = 0.0F;
    int j = zza.zzau(paramParcel);
    float f1 = 0.0F;
    int i = 0;
    float f2 = 0.0F;
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
        f1 = zza.zzl(paramParcel, k);
        break;
      case 3: 
        f2 = zza.zzl(paramParcel, k);
        break;
      case 4: 
        f3 = zza.zzl(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new StreetViewPanoramaCamera(i, f1, f2, f3);
  }
  
  public StreetViewPanoramaCamera[] zzis(int paramInt)
  {
    return new StreetViewPanoramaCamera[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */