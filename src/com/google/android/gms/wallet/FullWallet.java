package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class FullWallet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  private final int mVersionCode;
  String zzboo;
  String zzbop;
  ProxyCard zzboq;
  String zzbor;
  Address zzbos;
  Address zzbot;
  String[] zzbou;
  UserAddress zzbov;
  UserAddress zzbow;
  InstrumentInfo[] zzbox;
  PaymentMethodToken zzboy;
  
  private FullWallet()
  {
    mVersionCode = 1;
  }
  
  FullWallet(int paramInt, String paramString1, String paramString2, ProxyCard paramProxyCard, String paramString3, Address paramAddress1, Address paramAddress2, String[] paramArrayOfString, UserAddress paramUserAddress1, UserAddress paramUserAddress2, InstrumentInfo[] paramArrayOfInstrumentInfo, PaymentMethodToken paramPaymentMethodToken)
  {
    mVersionCode = paramInt;
    zzboo = paramString1;
    zzbop = paramString2;
    zzboq = paramProxyCard;
    zzbor = paramString3;
    zzbos = paramAddress1;
    zzbot = paramAddress2;
    zzbou = paramArrayOfString;
    zzbov = paramUserAddress1;
    zzbow = paramUserAddress2;
    zzbox = paramArrayOfInstrumentInfo;
    zzboy = paramPaymentMethodToken;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final Address getBillingAddress()
  {
    return zzbos;
  }
  
  public final UserAddress getBuyerBillingAddress()
  {
    return zzbov;
  }
  
  public final UserAddress getBuyerShippingAddress()
  {
    return zzbow;
  }
  
  public final String getEmail()
  {
    return zzbor;
  }
  
  public final String getGoogleTransactionId()
  {
    return zzboo;
  }
  
  public final InstrumentInfo[] getInstrumentInfos()
  {
    return zzbox;
  }
  
  public final String getMerchantTransactionId()
  {
    return zzbop;
  }
  
  public final String[] getPaymentDescriptions()
  {
    return zzbou;
  }
  
  public final PaymentMethodToken getPaymentMethodToken()
  {
    return zzboy;
  }
  
  public final ProxyCard getProxyCard()
  {
    return zzboq;
  }
  
  public final Address getShippingAddress()
  {
    return zzbot;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.FullWallet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */