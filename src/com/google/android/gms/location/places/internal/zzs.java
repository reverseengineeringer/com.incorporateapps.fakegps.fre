package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzs
  implements Parcelable.Creator
{
  static void zza(PlacesParams paramPlacesParams, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, zzaQX, false);
    zzb.zzc(paramParcel, 1000, versionCode);
    zzb.zza(paramParcel, 2, zzaQY, false);
    zzb.zza(paramParcel, 3, zzaQZ, false);
    zzb.zza(paramParcel, 4, zzaPU, false);
    zzb.zzc(paramParcel, 6, zzaRa);
    zzb.zzc(paramParcel, 7, zzaRb);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public PlacesParams zzfo(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int m = zza.zzau(paramParcel);
    int j = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    int k = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = zza.zzat(paramParcel);
      switch (zza.zzca(n))
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        str4 = zza.zzp(paramParcel, n);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, n);
        break;
      case 2: 
        str3 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 6: 
        j = zza.zzg(paramParcel, n);
        break;
      case 7: 
        i = zza.zzg(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new PlacesParams(k, str4, str3, str2, str1, j, i);
  }
  
  public PlacesParams[] zzib(int paramInt)
  {
    return new PlacesParams[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */