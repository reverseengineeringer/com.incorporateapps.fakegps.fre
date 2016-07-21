package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(CreateWalletObjectsRequest paramCreateWalletObjectsRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramCreateWalletObjectsRequest.getVersionCode());
    zzb.zza(paramParcel, 2, zzbol, paramInt, false);
    zzb.zza(paramParcel, 3, zzbom, paramInt, false);
    zzb.zza(paramParcel, 4, zzbon, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CreateWalletObjectsRequest zzhr(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    OfferWalletObject localOfferWalletObject = null;
    LoyaltyWalletObject localLoyaltyWalletObject = null;
    int i = 0;
    GiftCardWalletObject localGiftCardWalletObject = null;
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
        localLoyaltyWalletObject = (LoyaltyWalletObject)zza.zza(paramParcel, k, LoyaltyWalletObject.CREATOR);
        break;
      case 3: 
        localOfferWalletObject = (OfferWalletObject)zza.zza(paramParcel, k, OfferWalletObject.CREATOR);
        break;
      case 4: 
        localGiftCardWalletObject = (GiftCardWalletObject)zza.zza(paramParcel, k, GiftCardWalletObject.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new CreateWalletObjectsRequest(i, localLoyaltyWalletObject, localOfferWalletObject, localGiftCardWalletObject);
  }
  
  public CreateWalletObjectsRequest[] zzkP(int paramInt)
  {
    return new CreateWalletObjectsRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */