package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(LineItem paramLineItem, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramLineItem.getVersionCode());
    zzb.zza(paramParcel, 2, description, false);
    zzb.zza(paramParcel, 3, zzboL, false);
    zzb.zza(paramParcel, 4, zzboM, false);
    zzb.zza(paramParcel, 5, zzboh, false);
    zzb.zzc(paramParcel, 6, zzboN);
    zzb.zza(paramParcel, 7, zzboi, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public LineItem zzhx(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int k = zza.zzau(paramParcel);
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
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
        str5 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        str4 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        str3 = zza.zzp(paramParcel, m);
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 6: 
        i = zza.zzg(paramParcel, m);
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new LineItem(j, str5, str4, str3, str2, i, str1);
  }
  
  public LineItem[] zzkV(int paramInt)
  {
    return new LineItem[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */