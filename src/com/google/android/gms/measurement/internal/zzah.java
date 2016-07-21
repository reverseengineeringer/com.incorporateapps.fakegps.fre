package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzah
  implements Parcelable.Creator
{
  static void zza(UserAttributeParcel paramUserAttributeParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zza(paramParcel, 2, name, false);
    zzb.zza(paramParcel, 3, zzaZm);
    zzb.zza(paramParcel, 4, zzaZn, false);
    zzb.zza(paramParcel, 5, zzaZo, false);
    zzb.zza(paramParcel, 6, zzamJ, false);
    zzb.zza(paramParcel, 7, zzaVW, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public UserAttributeParcel zzfO(Parcel paramParcel)
  {
    String str1 = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    long l = 0L;
    String str2 = null;
    Float localFloat = null;
    Long localLong = null;
    String str3 = null;
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
        str3 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        l = zza.zzi(paramParcel, k);
        break;
      case 4: 
        localLong = zza.zzj(paramParcel, k);
        break;
      case 5: 
        localFloat = zza.zzm(paramParcel, k);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new UserAttributeParcel(i, str3, l, localLong, localFloat, str2, str1);
  }
  
  public UserAttributeParcel[] zziK(int paramInt)
  {
    return new UserAttributeParcel[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */