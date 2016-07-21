package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CreateWalletObjectsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzd();
  private final int mVersionCode;
  LoyaltyWalletObject zzbol;
  OfferWalletObject zzbom;
  GiftCardWalletObject zzbon;
  
  CreateWalletObjectsRequest()
  {
    mVersionCode = 3;
  }
  
  CreateWalletObjectsRequest(int paramInt, LoyaltyWalletObject paramLoyaltyWalletObject, OfferWalletObject paramOfferWalletObject, GiftCardWalletObject paramGiftCardWalletObject)
  {
    mVersionCode = paramInt;
    zzbol = paramLoyaltyWalletObject;
    zzbom = paramOfferWalletObject;
    zzbon = paramGiftCardWalletObject;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.CreateWalletObjectsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */