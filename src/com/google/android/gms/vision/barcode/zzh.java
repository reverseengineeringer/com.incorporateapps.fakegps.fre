package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(Barcode.GeoPoint paramGeoPoint, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zza(paramParcel, 2, lat);
    zzb.zza(paramParcel, 3, lng);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public Barcode.GeoPoint zzhd(Parcel paramParcel)
  {
    double d1 = 0.0D;
    int j = zza.zzau(paramParcel);
    int i = 0;
    double d2 = 0.0D;
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
        d2 = zza.zzn(paramParcel, k);
        break;
      case 3: 
        d1 = zza.zzn(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new Barcode.GeoPoint(i, d2, d1);
  }
  
  public Barcode.GeoPoint[] zzkA(int paramInt)
  {
    return new Barcode.GeoPoint[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */