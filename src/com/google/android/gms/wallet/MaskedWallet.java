package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzl();
  private final int mVersionCode;
  String zzboo;
  String zzbop;
  String zzbor;
  Address zzbos;
  Address zzbot;
  String[] zzbou;
  UserAddress zzbov;
  UserAddress zzbow;
  InstrumentInfo[] zzbox;
  LoyaltyWalletObject[] zzbpi;
  OfferWalletObject[] zzbpj;
  
  private MaskedWallet()
  {
    mVersionCode = 2;
  }
  
  MaskedWallet(int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, Address paramAddress1, Address paramAddress2, LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject, OfferWalletObject[] paramArrayOfOfferWalletObject, UserAddress paramUserAddress1, UserAddress paramUserAddress2, InstrumentInfo[] paramArrayOfInstrumentInfo)
  {
    mVersionCode = paramInt;
    zzboo = paramString1;
    zzbop = paramString2;
    zzbou = paramArrayOfString;
    zzbor = paramString3;
    zzbos = paramAddress1;
    zzbot = paramAddress2;
    zzbpi = paramArrayOfLoyaltyWalletObject;
    zzbpj = paramArrayOfOfferWalletObject;
    zzbov = paramUserAddress1;
    zzbow = paramUserAddress2;
    zzbox = paramArrayOfInstrumentInfo;
  }
  
  public static MaskedWallet.Builder newBuilderFrom(MaskedWallet paramMaskedWallet)
  {
    zzx.zzz(paramMaskedWallet);
    return zzIl().setGoogleTransactionId(paramMaskedWallet.getGoogleTransactionId()).setMerchantTransactionId(paramMaskedWallet.getMerchantTransactionId()).setPaymentDescriptions(paramMaskedWallet.getPaymentDescriptions()).setInstrumentInfos(paramMaskedWallet.getInstrumentInfos()).setEmail(paramMaskedWallet.getEmail()).zza(paramMaskedWallet.zzIm()).zza(paramMaskedWallet.zzIn()).setBuyerBillingAddress(paramMaskedWallet.getBuyerBillingAddress()).setBuyerShippingAddress(paramMaskedWallet.getBuyerShippingAddress());
  }
  
  public static MaskedWallet.Builder zzIl()
  {
    MaskedWallet localMaskedWallet = new MaskedWallet();
    localMaskedWallet.getClass();
    return new MaskedWallet.Builder(localMaskedWallet, null);
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
    zzl.zza(this, paramParcel, paramInt);
  }
  
  public final LoyaltyWalletObject[] zzIm()
  {
    return zzbpi;
  }
  
  public final OfferWalletObject[] zzIn()
  {
    return zzbpj;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.MaskedWallet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */