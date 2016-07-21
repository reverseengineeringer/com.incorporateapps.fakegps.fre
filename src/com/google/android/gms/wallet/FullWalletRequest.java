package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWalletRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  private final int mVersionCode;
  String zzboo;
  String zzbop;
  Cart zzboz;
  
  FullWalletRequest()
  {
    mVersionCode = 1;
  }
  
  FullWalletRequest(int paramInt, String paramString1, String paramString2, Cart paramCart)
  {
    mVersionCode = paramInt;
    zzboo = paramString1;
    zzbop = paramString2;
    zzboz = paramCart;
  }
  
  public static FullWalletRequest.Builder newBuilder()
  {
    FullWalletRequest localFullWalletRequest = new FullWalletRequest();
    localFullWalletRequest.getClass();
    return new FullWalletRequest.Builder(localFullWalletRequest, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final Cart getCart()
  {
    return zzboz;
  }
  
  public final String getGoogleTransactionId()
  {
    return zzboo;
  }
  
  public final String getMerchantTransactionId()
  {
    return zzbop;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.FullWalletRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */