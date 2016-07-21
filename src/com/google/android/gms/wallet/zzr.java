package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzr
  implements Parcelable.Creator
{
  static void zza(ProxyCard paramProxyCard, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramProxyCard.getVersionCode());
    zzb.zza(paramParcel, 2, zzbpF, false);
    zzb.zza(paramParcel, 3, zzbpG, false);
    zzb.zzc(paramParcel, 4, zzbpH);
    zzb.zzc(paramParcel, 5, zzbpI);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public ProxyCard zzhF(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int m = zza.zzau(paramParcel);
    int j = 0;
    String str2 = null;
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
        k = zza.zzg(paramParcel, n);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 4: 
        j = zza.zzg(paramParcel, n);
        break;
      case 5: 
        i = zza.zzg(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new ProxyCard(k, str2, str1, j, i);
  }
  
  public ProxyCard[] zzld(int paramInt)
  {
    return new ProxyCard[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.zzr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */