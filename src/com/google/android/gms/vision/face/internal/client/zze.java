package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(LandmarkParcel paramLandmarkParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zza(paramParcel, 2, x);
    zzb.zza(paramParcel, 3, y);
    zzb.zzc(paramParcel, 4, type);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public LandmarkParcel zzhm(Parcel paramParcel)
  {
    int j = 0;
    float f2 = 0.0F;
    int k = zza.zzau(paramParcel);
    float f1 = 0.0F;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        f1 = zza.zzl(paramParcel, m);
        break;
      case 3: 
        f2 = zza.zzl(paramParcel, m);
        break;
      case 4: 
        j = zza.zzg(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new LandmarkParcel(i, f1, f2, j);
  }
  
  public LandmarkParcel[] zzkK(int paramInt)
  {
    return new LandmarkParcel[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.internal.client.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */