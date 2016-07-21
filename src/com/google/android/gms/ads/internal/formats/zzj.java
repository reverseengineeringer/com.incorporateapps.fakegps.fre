package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(NativeAdOptionsParcel paramNativeAdOptionsParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zza(paramParcel, 2, zzyA);
    zzb.zzc(paramParcel, 3, zzyB);
    zzb.zza(paramParcel, 4, zzyC);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public NativeAdOptionsParcel zze(Parcel paramParcel)
  {
    boolean bool2 = false;
    int k = zza.zzau(paramParcel);
    int j = 0;
    boolean bool1 = false;
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
        bool1 = zza.zzc(paramParcel, m);
        break;
      case 3: 
        j = zza.zzg(paramParcel, m);
        break;
      case 4: 
        bool2 = zza.zzc(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new NativeAdOptionsParcel(i, bool1, j, bool2);
  }
  
  public NativeAdOptionsParcel[] zzp(int paramInt)
  {
    return new NativeAdOptionsParcel[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */