package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public class zzg
  implements Parcelable.Creator
{
  static void zza(GiftCardWalletObject paramGiftCardWalletObject, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramGiftCardWalletObject.getVersionCode());
    zzb.zza(paramParcel, 2, zzboB, paramInt, false);
    zzb.zza(paramParcel, 3, zzboC, false);
    zzb.zza(paramParcel, 4, pin, false);
    zzb.zza(paramParcel, 5, zzboD, false);
    zzb.zza(paramParcel, 6, zzboE);
    zzb.zza(paramParcel, 7, zzboF, false);
    zzb.zza(paramParcel, 8, zzboG);
    zzb.zza(paramParcel, 9, zzboH, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GiftCardWalletObject zzhu(Parcel paramParcel)
  {
    long l1 = 0L;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    String str2 = null;
    long l2 = 0L;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    CommonWalletObject localCommonWalletObject = null;
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
        localCommonWalletObject = (CommonWalletObject)zza.zza(paramParcel, k, CommonWalletObject.CREATOR);
        break;
      case 3: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        l2 = zza.zzi(paramParcel, k);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        l1 = zza.zzi(paramParcel, k);
        break;
      case 9: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new GiftCardWalletObject(i, localCommonWalletObject, str5, str4, str3, l2, str2, l1, str1);
  }
  
  public GiftCardWalletObject[] zzkS(int paramInt)
  {
    return new GiftCardWalletObject[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */