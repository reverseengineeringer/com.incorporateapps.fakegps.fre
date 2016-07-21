package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import java.util.ArrayList;

public class zzb
  implements Parcelable.Creator
{
  static void zza(Cart paramCart, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, paramCart.getVersionCode());
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, zzboh, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, zzboi, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 4, zzboj, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, paramInt);
  }
  
  public Cart zzhp(Parcel paramParcel)
  {
    String str2 = null;
    int j = zza.zzau(paramParcel);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    String str1 = null;
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
        str1 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localArrayList = zza.zzc(paramParcel, k, LineItem.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new Cart(i, str1, str2, localArrayList);
  }
  
  public Cart[] zzkN(int paramInt)
  {
    return new Cart[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */