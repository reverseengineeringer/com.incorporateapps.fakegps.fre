package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(Barcode.Email paramEmail, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zzc(paramParcel, 2, type);
    zzb.zza(paramParcel, 3, address, false);
    zzb.zza(paramParcel, 4, subject, false);
    zzb.zza(paramParcel, 5, body, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public Barcode.Email zzhc(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int k = zza.zzau(paramParcel);
    String str2 = null;
    String str3 = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new Barcode.Email(j, i, str3, str2, str1);
  }
  
  public Barcode.Email[] zzkz(int paramInt)
  {
    return new Barcode.Email[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */